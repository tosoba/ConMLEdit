package org.eclipse.sirius.conml.design.services.classdiagram.validation;

import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.Model;
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
            clazz.getSemiAssociations().stream().map(SemiAssociation::getName),
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

  public boolean classWithTheSameNameDoesNotExistInSamePackage(final EObject object) {
    return ConML.castElementAndContainer(object, Class.class, Model.class)
        .runIfBothCastsSuccessful(
            (classToCheck, model) ->
                !model
                        .getElements()
                        .stream()
                        .filter(
                            element -> {
                              if (element instanceof Class) {
                                final Class otherClass = (Class) element;
                                return EcoreUtil.equals(
                                        otherClass.getPackage(), classToCheck.getPackage())
                                    && !EcoreUtil.equals(otherClass, classToCheck)
                                    && Objects.equals(otherClass.getName(), classToCheck.getName());

                              } else return false;
                            })
                        .findAny()
                        .isPresent()
                    && ConML.containsOnlyOneExactlyEqualElement(
                        model, classToCheck, Model::getElements),
            true);
  }
}
