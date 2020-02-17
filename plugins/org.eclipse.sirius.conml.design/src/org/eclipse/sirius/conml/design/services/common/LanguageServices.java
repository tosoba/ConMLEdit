package org.eclipse.sirius.conml.design.services.common;

import conml.Language;
import conml.Model;

public final class LanguageServices {

  public void setLanguageModel(final Language language, final Model model) {
    language.setModel(model);
  }
}
