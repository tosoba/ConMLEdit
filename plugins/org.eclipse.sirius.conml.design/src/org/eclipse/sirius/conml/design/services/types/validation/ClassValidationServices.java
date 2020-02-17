package org.eclipse.sirius.conml.design.services.types.validation;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.types.ClassServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Attribute;
import conml.types.Class;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

public final class ClassValidationServices {

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
        object, Class.class, this::ownedClassFeaturesHaveNoNameClashesWithInheritedFeatures, true);
  }

  public boolean ownedClassFeaturesHaveNoNameClashesWithInheritedFeatures(final Class clazz) {
    final Set<String> inheritedFeatureNames =
        allFeaturesFromAncestorsStream(clazz).collect(Collectors.toSet());
    return !featuresNamesStream(clazz).anyMatch(inheritedFeatureNames::contains);
  }

  public boolean inheritedFeaturesFromAncestorClassesHaveNoNameClashes(final EObject object) {
    return ConML.castAndRunOrReturn(
        object, Class.class, this::inheritedFeaturesFromAncestorClassesHaveNoNameClashes, true);
  }

  public boolean inheritedFeaturesFromAncestorClassesHaveNoNameClashes(final Class clazz) {
    return allFeaturesFromAncestorsStream(clazz).allMatch(new HashSet<>()::add);
  }

  private Stream<String> featuresNamesStream(final Class clazz) {
    return Stream.concat(
        Stream.concat(
            clazz
                .getSemiAssociations()
                .stream()
                .filter(
                    semi ->
                        semi.getRedefinedSemiAssociation() == null
                            && semi.getInverseSemiAssociation() != null
                            && semi.getInverseSemiAssociation().getRedefinedSemiAssociation()
                                == null)
                .map(SemiAssociation::getName),
            clazz
                .getAttributes()
                .stream()
                .filter(attr -> attr.getRedefinedAttribute() == null)
                .map(Attribute::getName)),
        clazz
            .getProperties()
            .stream()
            .filter(prop -> prop.getRedefinedProperty() == null)
            .map(Property::getName));
  }

  private Stream<String> allFeaturesFromAncestorsStream(final Class clazz) {
    final ClassServices classServices = ClassServices.getInstance();
    return classServices
        .getAllAncestorsOf(clazz, classServices::ownsAnyFeatures)
        .stream()
        .flatMap(this::featuresNamesStream);
  }

  public boolean classWithTheSameNameDoesNotExistInSamePackage(final EObject object) {
    if (!(object instanceof Class)) return true;
    final Class classToCheck = (Class) object;
    final TypeModel model = classToCheck.getTypeModel();
    if (model == null) return true;
    else
      return !model
              .getElements()
              .stream()
              .filter(
                  element -> {
                    if (element instanceof Class) {
                      final Class otherClass = (Class) element;
                      return EcoreUtil.equals(otherClass.getPackage(), classToCheck.getPackage())
                          && !EcoreUtil.equals(otherClass, classToCheck)
                          && Objects.equals(otherClass.getName(), classToCheck.getName());

                    } else return false;
                  })
              .findAny()
              .isPresent()
          && ConML.containsOnlyOneExactlyEqualElement(model, classToCheck, TypeModel::getElements);
  }
}
