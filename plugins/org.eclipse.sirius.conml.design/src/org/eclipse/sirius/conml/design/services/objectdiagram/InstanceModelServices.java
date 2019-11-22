package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.dialog.ClassSelectionDialog;
import org.eclipse.sirius.conml.design.services.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.ModelServices;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.instances.InstanceModel;
import conml.instances.Link;

public final class InstanceModelServices {

  public Collection<EObject> getOwnedLinkElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Link.class);
  }

  public Collection<EObject> getOwnedObjectElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, conml.instances.Object.class);
  }

  public InstanceModel showInstanceModelSelectionDialog(
      final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new ClassSelectionDialog(
                    Messages.getString("Dialog.SelectInstanceModel"),
                    Messages.getString("Dialog.SelectInstanceModelContainerForObject")),
                false);
    if (result.size() == 1 && result.get(0) instanceof InstanceModel)
      return (InstanceModel) result.get(0);
    else return null;
  }
}
