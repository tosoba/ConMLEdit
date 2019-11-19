package org.eclipse.sirius.conml.design.util;

import org.eclipse.jface.viewers.LabelProvider;

import conml.DefinableElement;
import conml.DescribableElement;
import conml.NamedElement;

public final class LabelProviders {
  private LabelProviders() {}

  public static LabelProvider namedElementLabelProvider() {
    return new LabelProvider() {
      @Override
      public String getText(Object element) {
        if (element instanceof NamedElement) {
          final NamedElement namedElement = (NamedElement) element;
          return namedElement.getName();
        }
        return "null";
      }
    };
  }

  public static LabelProvider definableElementLabelProvider() {
    return new LabelProvider() {
      @Override
      public String getText(Object element) {
        if (element instanceof DefinableElement) {
          final DefinableElement definableElement = (DefinableElement) element;
          return definableElement.getDefinition();
        }
        return "";
      }
    };
  }

  public static LabelProvider describableElementLabelProvider() {
    return new LabelProvider() {
      @Override
      public String getText(Object element) {
        if (element instanceof DescribableElement) {
          final DescribableElement describableElement = (DescribableElement) element;
          return describableElement.getDescription();
        }
        return "";
      }
    };
  }
}
