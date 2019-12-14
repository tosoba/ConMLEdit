package org.eclipse.sirius.conml.design.util;

import com.google.common.base.Predicate;

public final class ConMLPredicates {

  private ConMLPredicates() {}

  public static Predicate<Object> isInstanceOfAnyOfClasses(final Class<?>... classes) {
    return input -> {
      for (final Class<?> clazz : classes) {
        if (clazz.isInstance(input)) return true;
      }
      return false;
    };
  }
}
