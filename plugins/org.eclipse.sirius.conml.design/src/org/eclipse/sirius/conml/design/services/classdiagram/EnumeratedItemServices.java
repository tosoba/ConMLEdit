package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.types.EnumeratedItem;

public final class EnumeratedItemServices {

  public String getAbsouluteNameOf(final EnumeratedItem enumItem) {
    if (enumItem == null) return "";
    final ArrayList<String> names = new ArrayList<>();
    names.add(enumItem.getName());
    EnumeratedItem itEnumItem = enumItem.getSuperItem();
    while (itEnumItem != null && !EcoreUtil.equals(itEnumItem, itEnumItem.getSuperItem())) {
      names.add(itEnumItem.getName());
      itEnumItem = itEnumItem.getSuperItem();
    }
    Collections.reverse(names);
    return names.stream().collect(Collectors.joining("/"));
  }

  public void openSelectExistingEnumeratedItemsDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingEnumeratedItems"),
                Messages.getString("Dialog.SelectEnumeratedItems"),
                ConMLPredicates.isInstanceOfClass(EnumeratedItem.class),
                null),
            EnumeratedItem.class);
  }
}
