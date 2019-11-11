package org.eclipse.sirius.conml.design.services;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.conml.design.services.classdiagram.AssociationServices;
import org.eclipse.sirius.conml.design.services.classdiagram.PackageServices;
import org.eclipse.sirius.conml.design.services.classdiagram.SemiAssociationServices;
import org.eclipse.sirius.conml.design.services.classdiagram.TypeModelServices;

import conml.Model;
import conml.instances.Link;
import conml.instances.Value;
import conml.types.Association;
import conml.types.Attribute;
import conml.types.Generalization;
import conml.types.Package;
import conml.types.Property;
import conml.types.SemiAssociation;

public final class DiagramPropertiesServices {

  private static final HashMap<Class<?>, Set<String>> ignoredPropertyReferences = new HashMap<>();
  private static final HashMap<Class<?>, Set<String>> ignoredCreationDialogReferences =
      new HashMap<>();
  private static final List<Predicate<EStructuralFeature>> structFeaturePropertiesPredicates =
      new ArrayList<>();
  private static final List<Predicate<EStructuralFeature>> structFeatureCreationDialogPredicates =
      new ArrayList<>();

  static {
    setupIgnoredPropertiesReferences();
    setupIgnoredCreationDialogReferences();
    setupStructuralFeaturesPropertiesPredicates();
    setupStructuralFeaturesCreationDialogPredicates();
  }

  public boolean shouldShowActionPage(final EObject object) {
    return TypeModelServices.getInstance().isTypeModel(object)
        || AssociationServices.getInstance().isExpandedAssociation(object)
        || SemiAssociationServices.getInstance().isPrimarySemiInCompactAssociation(object)
        || PackageServices.getInstance().isNonOverallPackage(object);
  }

  public boolean referenceIfCreationDialogPredicate(final EStructuralFeature feature) {
    return referenceIfPredicate(feature, ignoredCreationDialogReferences);
  }

  public boolean referenceIfPropertiesPredicate(final EStructuralFeature feature) {
    return referenceIfPredicate(feature, ignoredPropertyReferences);
  }

  public boolean referenceIfPredicate(
      final EStructuralFeature feature, final HashMap<Class<?>, Set<String>> ignored) {
    return EReference.class.isInstance(feature)
        && (!ignored.containsKey(feature.getContainerClass())
            || !ignored.get(feature.getContainerClass()).contains(feature.getName()));
  }

  public List<EStructuralFeature> sortedPropertiesStructuralFeatures(final EObject object) {
    return sortedStructuralFeatures(object, this::applyCombinedPropertiesFeaturePredicates);
  }

  public List<EStructuralFeature> sortedCreationDialogStructuralFeatures(final EObject object) {
    return sortedStructuralFeatures(object, this::applyCombinedCreationDialogFeaturePredicates);
  }

  public List<EStructuralFeature> sortedStructuralFeatures(
      final EObject object, final Predicate<EStructuralFeature> combinedPredicate) {
    return object
        .eClass()
        .getEAllStructuralFeatures()
        .stream()
        .sorted(Comparator.comparing(EStructuralFeature::getName))
        .map(
            feature -> {
              short weight = 100;
              if (feature instanceof EAttribute) {
                final EAttribute attribute = (EAttribute) feature;
                final Class<?> instanceClass = attribute.getEAttributeType().getInstanceClass();
                if (String.class.isAssignableFrom(instanceClass)) {
                  if (Objects.equals(feature.getName(), "name")) {
                    weight = 0;
                  } else if (Objects.equals(feature.getName(), "definition")
                      || Objects.equals(feature.getName(), "description")) {
                    weight = 1;
                  } else {
                    weight = 2;
                  }
                } else if (int.class.isAssignableFrom(instanceClass)) {
                  weight = 3;
                } else if (Integer.class.isAssignableFrom(instanceClass)) {
                  weight = 4;
                } else if (Boolean.class.isAssignableFrom(instanceClass)
                    || boolean.class.isAssignableFrom(instanceClass)) {
                  weight = 5;
                } else {
                  weight = 6;
                }
              } else if (feature instanceof EReference) {
                if (feature.getUpperBound() == 1) {
                  weight = 7;
                } else {
                  weight = 8;
                }
              }
              return new AbstractMap.SimpleImmutableEntry<>(weight, feature);
            })
        .sorted(Comparator.comparing(Map.Entry::getKey))
        .map(Map.Entry::getValue)
        .filter(combinedPredicate)
        .collect(Collectors.toList());
  }

  private static boolean compactAssociationFeaturePredicate(final EStructuralFeature feature) {
    return !(Association.class.isAssignableFrom(feature.getContainerClass())
        && "compact".equalsIgnoreCase(feature.getName()));
  }

  private static boolean overallPackageFeaturePredicate(final EStructuralFeature feature) {
    return !(Package.class.isAssignableFrom(feature.getContainerClass())
        && "overall".equalsIgnoreCase(feature.getName()));
  }

  private static boolean compactLinkFeaturePredicate(final EStructuralFeature feature) {
    return !(Link.class.isAssignableFrom(feature.getContainerClass())
        && "compact".equalsIgnoreCase(feature.getName()));
  }

  private boolean applyCombinedPredicatesForFeature(
      final List<Predicate<EStructuralFeature>> predicates, final EStructuralFeature feature) {
    return predicates.stream().map(predicate -> predicate.test(feature)).allMatch(result -> result);
  }

  private boolean applyCombinedPropertiesFeaturePredicates(final EStructuralFeature feature) {
    return applyCombinedPredicatesForFeature(structFeaturePropertiesPredicates, feature);
  }

  private boolean applyCombinedCreationDialogFeaturePredicates(final EStructuralFeature feature) {
    return applyCombinedPredicatesForFeature(structFeatureCreationDialogPredicates, feature);
  }

  private static void setupStructuralFeaturesCreationDialogPredicates() {
    structFeatureCreationDialogPredicates.add(
        DiagramPropertiesServices::compactAssociationFeaturePredicate);
    structFeatureCreationDialogPredicates.add(
        DiagramPropertiesServices::overallPackageFeaturePredicate);
    structFeatureCreationDialogPredicates.add(
        DiagramPropertiesServices::compactLinkFeaturePredicate);
  }

  private static void setupStructuralFeaturesPropertiesPredicates() {
    structFeaturePropertiesPredicates.add(
        DiagramPropertiesServices::compactAssociationFeaturePredicate);
    structFeaturePropertiesPredicates.add(
        DiagramPropertiesServices::overallPackageFeaturePredicate);
    structFeaturePropertiesPredicates.add(DiagramPropertiesServices::compactLinkFeaturePredicate);
  }

  private static void setupIgnoredCreationDialogReferences() {
    // Types
    ignoredCreationDialogReferences.put(
        conml.types.Class.class,
        new HashSet<>(
            Arrays.asList(
                "SemiAssociations", "Specialization", "Generalizations", "DominantGeneralization")));
    ignoredCreationDialogReferences.put(
        Association.class,
        new HashSet<>(Arrays.asList("PrimarySemiAssociation", "SecondarySemiAssociation")));
    ignoredCreationDialogReferences.put(Property.class, new HashSet<>(Arrays.asList("OwnerClass")));
    ignoredCreationDialogReferences.put(
        Attribute.class, new HashSet<>(Arrays.asList("OwnerClass")));
    ignoredCreationDialogReferences.put(
        SemiAssociation.class,
        new HashSet<>(
            Arrays.asList(
                "InverseSemiAssociation",
                "OwnerClass",
                "PrimaryInAssociation",
                "SecondaryInAssociation")));
    ignoredCreationDialogReferences.put(
        Generalization.class, new HashSet<>(Arrays.asList("GeneralizedClass", "SpecializedClasses")));

    // Instances
    ignoredCreationDialogReferences.put(Value.class, new HashSet<>(Arrays.asList("OwnerValueSet")));
    ignoredCreationDialogReferences.put(
        Link.class, new HashSet<>(Arrays.asList("PrimaryReference", "SecondaryReference")));
  }

  private static void setupIgnoredPropertiesReferences() {
    ignoredPropertyReferences.put(Model.class, new HashSet<>(Arrays.asList("Elements")));

    // Types
    ignoredPropertyReferences.put(
        conml.types.Class.class,
        new HashSet<>(
            Arrays.asList(
                "SemiAssociations", "Specialization", "Generalizations", "DominantGeneralization")));
    ignoredPropertyReferences.put(
        Association.class,
        new HashSet<>(Arrays.asList("PrimarySemiAssociation", "SecondarySemiAssociation")));
    ignoredPropertyReferences.put(Property.class, new HashSet<>(Arrays.asList("OwnerClass")));
    ignoredPropertyReferences.put(Attribute.class, new HashSet<>(Arrays.asList("OwnerClass")));
    ignoredPropertyReferences.put(
        SemiAssociation.class,
        new HashSet<>(
            Arrays.asList(
                "InverseSemiAssociation",
                "OwnerClass",
                "PrimaryInAssociation",
                "SecondaryInAssociation")));
    ignoredPropertyReferences.put(
        Generalization.class, new HashSet<>(Arrays.asList("GeneralizedClass")));

    // Instances
    ignoredPropertyReferences.put(Value.class, new HashSet<>(Arrays.asList("OwnerValueSet")));
    ignoredPropertyReferences.put(
        Link.class, new HashSet<>(Arrays.asList("PrimaryReference", "SecondaryReference")));
  }

  public String getWidgetLabel(final EObject element, final EStructuralFeature structuralFeature) {
    return structuralFeature != null ? structuralFeature.getName() : "New element";
  }
}
