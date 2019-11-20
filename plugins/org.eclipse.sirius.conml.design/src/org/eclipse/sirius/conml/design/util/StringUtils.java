package org.eclipse.sirius.conml.design.util;

import java.util.function.BiConsumer;

public final class StringUtils {
  private StringUtils() {}

  public static boolean isNotBlank(final String string) {
    return string != null && !string.isEmpty();
  }

  public static <T> void setIfNotNullOrBlank(
      final String value, final T receiver, final BiConsumer<T, String> setter) {
    if (StringUtils.isNotBlank(value)) setter.accept(receiver, value);
  }

  public static Double tryParseDouble(String input) {
    if (input == null) return null;
    try {
      return Double.parseDouble(input);
    } catch (NumberFormatException | NullPointerException nfe) {
      return null;
    }
  }
}
