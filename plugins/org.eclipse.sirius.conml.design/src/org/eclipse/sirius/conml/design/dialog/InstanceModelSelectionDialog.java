package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.sirius.conml.design.util.ConMLPredicates;

import conml.instances.InstanceModel;

public final class InstanceModelSelectionDialog extends ExistingSemanticElementsSelectionDialog {

  public InstanceModelSelectionDialog(String title, String message) {
    super(title, message, ConMLPredicates.isInstanceOfClass(InstanceModel.class), false, null);
  }
}
