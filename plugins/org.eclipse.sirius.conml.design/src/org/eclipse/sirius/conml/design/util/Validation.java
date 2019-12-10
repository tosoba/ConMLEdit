package org.eclipse.sirius.conml.design.util;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.types.Class;
import conml.types.Feature;
import conml.types.Generalization;

public final class Validation {
	
  private Validation() {}

  private static Stream<Class> nonNullGeneralizedClassesStream(final Class clazz) {
    return clazz
        .getGeneralizations()
        .stream()
        .map(Generalization::getGeneralizedClass)
        .filter(Objects::nonNull);
  }

  public static <F extends Feature> boolean anyAncestorOfClassOwnsRedefinedFeature(
      final Class clazz, final F feature, final Function<Class, EList<F>> ownedFeaturesGetter) {
    if (clazz.getGeneralizations().isEmpty()) {
      return false;
    } else if (nonNullGeneralizedClassesStream(clazz)
        .map(ownedFeaturesGetter)
        .flatMap(Collection::stream)
        .anyMatch(otherAttribute -> EcoreUtil.equals(feature, otherAttribute))) {
      return true;
    } else {
      return nonNullGeneralizedClassesStream(clazz)
          .map(
              generalizedClass ->
                  anyAncestorOfClassOwnsRedefinedFeature(
                      generalizedClass, feature, ownedFeaturesGetter))
          .anyMatch(contains -> contains);
    }
  }
}
