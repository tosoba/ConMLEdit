package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.objectdiagram.ObjectServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.Model;
import conml.types.Association;
import conml.types.Attribute;
import conml.types.Class;
import conml.types.Generalization;
import conml.types.Package;
import conml.types.Property;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

public class ClassServices implements ModelElementServices {

  public Collection<Class> getCDClassSemanticCandidates(final Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Class.class);
  }

  private boolean isAspectAssignedToTypeModel(
      final EObject object,
      final Function<Class, Boolean> isUsedAsAspectGetter,
      final Function<TypeModel, Class> aspectGetter) {
    if (!(object instanceof Class)) return true;

    final Class clazz = (Class) object;
    final boolean usedAsAspect = isUsedAsAspectGetter.apply(clazz);
    return !usedAsAspect
        || (usedAsAspect
            && ConML.anyExistingContainerHasReferenceTo(clazz, aspectGetter, TypeModel.class));
  }

  public boolean isSubjectiveAspectClassAssignedToTypeModel(final EObject object) {
    return isAspectAssignedToTypeModel(
        object, Class::isUsedAsSubjectiveAspect, TypeModel::getSubjectiveAspect);
  }

  public boolean isTemporalAspectClassAssignedToTypeModel(final EObject object) {
    return isAspectAssignedToTypeModel(
        object, Class::isUsedAsTemporalAspect, TypeModel::getTemporalAspect);
  }

  public boolean doesNotHaveMultipleGeneralizationsWithSameDiscriminant(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Class.class,
        (final Class clazz) ->
            clazz
                    .getGeneralizations()
                    .stream()
                    .map(Generalization::getDiscriminant)
                    .distinct()
                    .count()
                == clazz.getGeneralizations().size(),
        true);
  }

  public boolean hasSpecifiedDominantGeneralizationIfParticipatingInMany(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Class.class,
        (final Class clazz) -> {
          final EList<Generalization> generalizations = clazz.getGeneralizations();
          if (generalizations.isEmpty() || generalizations.size() == 1) return true;
          return clazz.getDominantGeneralization() != null;
        },
        true);
  }

  public boolean ownedClassFeaturesHaveNoNameClashesWithInheritedFeatures(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Class.class,
        (final Class clazz) -> {
          final Set<String> inheritedFeatureNames =
              allFeaturesFromAncestorsStream(clazz).collect(Collectors.toSet());
          return !featuresNamesStream(clazz).anyMatch(inheritedFeatureNames::contains);
        },
        true);
  }

  public boolean inheritedFeaturesFromAncestorClassesHaveNoNameClashes(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Class.class,
        (final Class clazz) ->
            allFeaturesFromAncestorsStream(clazz).distinct().count()
                == allFeaturesFromAncestorsStream(clazz).count(),
        true);
  }

  private Stream<String> featuresNamesStream(final Class clazz) {
    return Stream.concat(
        Stream.concat(
            clazz.getSemiassociations().stream().map(SemiAssociation::getName),
            clazz.getAttributes().stream().map(Attribute::getName)),
        clazz.getProperties().stream().map(Property::getName));
  }

  private Stream<String> allFeaturesFromAncestorsStream(final Class clazz) {
    return clazz
        .getGeneralizations()
        .stream()
        .map(Generalization::getGeneralizedClass)
        .flatMap(this::featuresNamesStream);
  }

  public String classLabel(final Class clazz) {
    if (clazz == null) return "";

    final StringBuilder sb = new StringBuilder();
    final ArrayList<String> markers = new ArrayList<>();
    if (clazz.isUsedAsSubjectiveAspect()) markers.add("S");
    if (clazz.isUsedAsTemporalAspect()) markers.add("T");
    if (!markers.isEmpty())
      sb.append('[').append(markers.stream().collect(Collectors.joining(","))).append("] ");

    Package packageIterator = clazz.getPackage();
    final ArrayList<String> packageNames = new ArrayList<>();
    boolean containedInOverallPackage = false;
    while (packageIterator != null
        && !EcoreUtil.equals(
            packageIterator,
            packageIterator.getContainerPackage())) { // prevents endless loop in case of package
      // self-containment error
      if (packageIterator.isOverall()) {
        containedInOverallPackage = true;
        break;
      }
      packageNames.add(packageIterator.getName());
      packageIterator = packageIterator.getContainerPackage();
    }
    if (!packageNames.isEmpty()) {
      if (containedInOverallPackage) sb.append('.');
      Collections.reverse(packageNames);
      sb.append(packageNames.stream().collect(Collectors.joining("."))).append('.');
    }

    sb.append(clazz.getName());

    if (clazz.isAbstract()) sb.append(" (A)");

    return sb.toString();
  }

  public void moveClassUp(final EObject object) {
    moveElement(object, Class.class, ConML.ElementMovementDirection.UP);
  }

  public void moveClassDown(final EObject object) {
    moveElement(object, Class.class, ConML.ElementMovementDirection.DOWN);
  }

  public void deleteClass(final Class clazz) {
    final EObject container = clazz.eContainer();
    if (container == null || !(container instanceof TypeModel)) {
      EcoreUtil.delete(clazz);
      return;
    }

    final TypeModel typeModel = (TypeModel) container;
    final List<Association> associations =
        ConML.getStreamOfAllElementsOfTypeFromModel(typeModel, Association.class)
            .filter(
                association -> {
                  final SemiAssociation primarySemi = association.getPrimarySemiAssociation();
                  if (primarySemi != null && clazz.getSemiassociations().contains(primarySemi))
                    return true;

                  final SemiAssociation secondarySemi = association.getSecondarySemiAssociation();
                  if (secondarySemi != null && clazz.getSemiassociations().contains(secondarySemi))
                    return true;

                  return false;
                })
            .collect(Collectors.toList());

    for (final Association association : associations) {
      AssociationServices.deleteAssociationStatic(association);
    }

    for (final conml.instances.Object instance : new ArrayList<>(clazz.getInstanceObjects())) {
      ObjectServices.deleteObjectStatic(instance);
    }

    EcoreUtil.delete(clazz);
  }
}
