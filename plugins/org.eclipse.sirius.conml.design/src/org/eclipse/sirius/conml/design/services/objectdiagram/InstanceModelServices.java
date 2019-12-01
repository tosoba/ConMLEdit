package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.dialog.InstanceModelSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.common.ModelServices;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.Domain;
import conml.instances.InstanceModel;
import conml.instances.Link;
import conml.types.TypeModel;

public final class InstanceModelServices {

  public Collection<EObject> getOwnedLinkElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Link.class);
  }

  public Collection<EObject> getOwnedObjectElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, conml.instances.Object.class);
  }

  public InstanceModel showInstanceModelSelectionDialog(
      final EObject selectedContainer,
      final DDiagram diagram,
      final TypeModel typeModelToInstance) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new InstanceModelSelectionDialog(
                    Messages.getString("Dialog.SelectInstanceModel"),
                    Messages.getString("Dialog.SelectInstanceModelContainerForObject"),
                    (Domain) selectedContainer,
                    typeModelToInstance),
                false);
    if (result.size() == 1 && result.get(0) instanceof InstanceModel)
      return (InstanceModel) result.get(0);
    else return null;
  }
}
