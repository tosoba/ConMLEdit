package org.eclipse.sirius.conml.design.services;

import org.eclipse.sirius.conml.design.dialog.ClassSelectionDialog;
import org.eclipse.swt.widgets.Display;

import conml.types.Class;
import conml.types.TypeModel;

public final class MetaInformationServices {

  public Class showClassSelectionDialog(final TypeModel typeModel) {
    final ClassSelectionDialog dialog =
        new ClassSelectionDialog(Display.getCurrent().getActiveShell(), typeModel);
    dialog.open();
    final Object[] result = dialog.getResult();
    if (result != null && result.length == 1 && result[0] instanceof Class)
      return (Class) result[0];
    else return null;
  }
}
