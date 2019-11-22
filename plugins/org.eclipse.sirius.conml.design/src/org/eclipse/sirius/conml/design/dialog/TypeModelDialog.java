package org.eclipse.sirius.conml.design.dialog;

import com.google.common.base.Predicate;

public final class TypeModelDialog extends ExistingEObjectsSelectionDialog {

  public TypeModelDialog(String title, String message, Predicate<Object> isValidEObjectPredicate) {
    super(title, message, isValidEObjectPredicate, false);
  }
}
