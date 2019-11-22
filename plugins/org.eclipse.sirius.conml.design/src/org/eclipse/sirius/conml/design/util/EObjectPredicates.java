package org.eclipse.sirius.conml.design.util;

import com.google.common.base.Predicate;

public final class EObjectPredicates {

  private EObjectPredicates() {}

  public static Predicate<Object> isClassPredicate() {
    return input -> input instanceof conml.types.Class;
  }

  public static Predicate<Object> isObjectPredicate() {
    return input -> input instanceof conml.instances.Object;
  }
}
