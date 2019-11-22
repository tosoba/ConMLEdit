package org.eclipse.sirius.conml.design.util;

import com.google.common.base.Predicate;

public final class ConMLPredicates {

  private ConMLPredicates() {}

  public static Predicate<Object> isInstanceOfClass(final Class<?> clazz) {
    return input -> clazz.isInstance(input);
  }
}
