package org.eclipse.sirius.conml.design.util.messages;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class Messages {

  private static final String BUNDLE_NAME =
      "org.eclipse.sirius.conml.design.util.messages.messages";

  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

  private Messages() {}

  public static String getString(String key) {
    return MessageFormat.format(internalGetString(key), new Object[] {});
  }

  public static String getString(String key, Object... arguments) {
    if (arguments == null) {
      return getString(key);
    }
    return MessageFormat.format(internalGetString(key), arguments);
  }

  private static String internalGetString(String key) {
    try {
      return RESOURCE_BUNDLE.getString(key);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }
}
