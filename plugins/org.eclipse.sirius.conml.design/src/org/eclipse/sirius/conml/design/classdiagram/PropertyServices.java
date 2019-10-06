package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PropertyServices {

  private static final HashMap<Class<?>, Set<String>> ignoredReferences = new HashMap<>();

  static {
    ignoredReferences.put(
        conml.types.Class.class, new HashSet<>(Arrays.asList("Semiassociations")));
  }

  public boolean referenceIfPredicate(EStructuralFeature feature) {
    return EReference.class.isInstance(feature)
        && (!ignoredReferences.containsKey(feature.getContainerClass())
            || !ignoredReferences.get(feature.getContainerClass()).contains(feature.getName()));
  }
}
