package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.sirius.conml.design.util.ConMLPredicates;

import conml.types.Class;

public final class ClassSelectionDialog extends ExistingSemanticElementsSelectionDialog {

  public ClassSelectionDialog(String title, String message) {
    super(title, message, ConMLPredicates.isInstanceOfClass(Class.class), false, null);
  }
}
