package org.eclipse.sirius.conml.design.util;

import java.util.Comparator;

import conml.NamedElement;

public final class Comparators {

  private Comparators() {}

  public static final Comparator<String> nullSafeStrings() {
    return Comparator.nullsFirst(String::compareToIgnoreCase);
  }

  public static final Comparator<NamedElement> namedElements() {
    return Comparator.comparing(NamedElement::getName, nullSafeStrings());
  }
}
