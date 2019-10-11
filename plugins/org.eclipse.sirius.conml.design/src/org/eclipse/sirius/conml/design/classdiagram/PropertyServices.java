package org.eclipse.sirius.conml.design.classdiagram;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import conml.types.TypeModel;

public class PropertyServices {

  private static final HashMap<Class<?>, Set<String>> ignoredReferences = new HashMap<>();

  static {
    ignoredReferences.put(
        conml.types.Class.class,
        new HashSet<>(
            Arrays.asList(
                "Semiassociations", "Specialization", "Generalization", "DominantGeneralization")));
    ignoredReferences.put(TypeModel.class, new HashSet<>(Arrays.asList("Elements")));
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
                EAttribute attribute = (EAttribute) feature;
                if (attribute
                    .getEAttributeType()
                    .getInstanceClass()
                    .isAssignableFrom(String.class)) {
                  if (Objects.equals(feature.getName(), "name")) {
                    weight = 0;
                  } else if (Objects.equals(feature.getName(), "definition")
                      || Objects.equals(feature.getName(), "description")) {
                    weight = 1;
                  } else {
                    weight = 2;
                  }
                } else if (attribute
                    .getEAttributeType()
                    .getInstanceClass()
                    .isAssignableFrom(Integer.class)) {
                  weight = 3;
                } else if (attribute
                    .getEAttributeType()
                    .getInstanceClass()
                    .isAssignableFrom(Boolean.class)) {
                  weight = 4;
                } else {
                  weight = 5;
                }
              } else if (feature instanceof EReference) {
                if (feature.getUpperBound() == 1) {
                  weight = 6;
                } else {
                  weight = 7;
                }
              }
              return new AbstractMap.SimpleImmutableEntry<>(weight, feature);
            })
        .sorted(Comparator.comparing(Map.Entry::getKey))
        .map(Map.Entry::getValue)
        .collect(Collectors.toList());
  }
}
