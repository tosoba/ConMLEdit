package org.eclipse.sirius.conml.design.services.instances;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.common.ModelServices;
import org.eclipse.sirius.conml.design.services.common.UIServices;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.Domain;
import conml.instances.InstanceModel;
import conml.instances.Link;

public final class InstanceModelServices {

  public Collection<EObject> getOwnedLinkElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Link.class);
  }

  public Collection<EObject> getOwnedObjectElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, conml.instances.Object.class);
  }

  public void openModelDiagramForInstanceModelCreation(final Domain domain) {
    UIServices.getInstance()
        .openModelDiagram(domain, Messages.getString("Dialog.NoInstanceModelExists"));
  }

  public InstanceModel showSimpleInstanceModelSelectionDialog(
      final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new ExistingSemanticElementsSelectionDialog(
                    Messages.getString("Dialog.SelectInstanceModel"),
                    Messages.getString("Dialog.SelectInstanceModelContainer"),
                    ConMLPredicates.isInstanceOfClass(InstanceModel.class),
                    false),
                false);
    if (result.size() == 1 && result.get(0) instanceof InstanceModel)
      return (InstanceModel) result.get(0);
    else return null;
  }

  public void openSelectExistingInstanceModelsDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingInstanceModels"),
                Messages.getString("Dialog.SelectInstanceModels"),
                ConMLPredicates.isInstanceOfClass(InstanceModel.class),
                null),
            InstanceModel.class);
  }
}
