package org.eclipse.sirius.conml.design.util;

public final class StringUtils {

  private StringUtils() {}

  public static boolean isNotBlank(final String string) {
    return string != null && !string.isEmpty();
  }
}
