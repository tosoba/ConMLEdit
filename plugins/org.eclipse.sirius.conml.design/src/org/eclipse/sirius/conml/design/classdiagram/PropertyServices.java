package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import conml.types.TypeModel;

public class PropertyServices {

  private static final HashMap<Class<?>, Set<String>> ignoredReferences = new HashMap<>();

  static {
    ignoredReferences.put(
        conml.types.Class.class,
        new HashSet<>(Arrays.asList("Semiassociations", "Specialization", "Generalization")));
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
        .sorted(
            (o1, o2) -> {
              if (o1 instanceof EReference && o2 instanceof EReference) return 0;
              else if (o1 instanceof EReference && !(o2 instanceof EReference)) return 1;
              else if (!(o1 instanceof EReference) && o2 instanceof EReference) return -1;
              return 0;
            })
        .collect(Collectors.toList());
  }
}
