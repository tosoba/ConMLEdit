package org.eclipse.sirius.conml.design.classdiagram;

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

import conml.Model;
import conml.types.Association;
import conml.types.Feature;
import conml.types.SemiAssociation;

public class PropertyServices {

  private static final HashMap<Class<?>, Set<String>> ignoredReferences = new HashMap<>();
  private static final List<Predicate<EStructuralFeature>> featurePredicates = new ArrayList<>();

  static {
    setupIgnoredReferences();
    setupStructuralFeaturesPredicates();
  }

  public boolean referenceIfPredicate(EStructuralFeature feature) {
    return EReference.class.isInstance(feature)
        && (!ignoredReferences.containsKey(feature.getContainerClass())
            || !ignoredReferences.get(feature.getContainerClass()).contains(feature.getName()));
  }

  public List<EStructuralFeature> sortedStructuralFeatures(EObject object) {
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
        .filter(this::combinedFeaturePredicates)
        .collect(Collectors.toList());
  }

  private static boolean compactAssociationFeaturePredicate(EStructuralFeature feature) {
    return !(Association.class.isAssignableFrom(feature.getContainerClass())
        && "compact".equalsIgnoreCase(feature.getName()));
  }

  private boolean combinedFeaturePredicates(EStructuralFeature feature) {
    return PropertyServices.featurePredicates
        .stream()
        .map(predicate -> predicate.test(feature))
        .allMatch(result -> result);
  }

  private static void setupStructuralFeaturesPredicates() {
    featurePredicates.add(PropertyServices::compactAssociationFeaturePredicate);
  }

  private static void setupIgnoredReferences() {
    ignoredReferences.put(
        conml.types.Class.class,
        new HashSet<>(
            Arrays.asList(
                "Semiassociations", "Specialization", "Generalization", "DominantGeneralization")));
    ignoredReferences.put(Model.class, new HashSet<>(Arrays.asList("Elements")));
    ignoredReferences.put(
        Association.class,
        new HashSet<>(Arrays.asList("PrimarySemiAssociation", "SecondarySemiAssociation")));
    ignoredReferences.put(Feature.class, new HashSet<>(Arrays.asList("RedefinedByFeatures")));
    ignoredReferences.put(
        SemiAssociation.class,
        new HashSet<>(
            Arrays.asList(
                "InverseSemiAssociation",
                "Owner",
                "PrimaryInAssociation",
                "SecondaryInAssociation")));
  }
}
