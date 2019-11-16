package org.eclipse.sirius.conml.design.services;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.ClassSelectionDialog;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.swt.widgets.Display;

import conml.MetaInformation;
import conml.Model;
import conml.ModelElement;
import conml.conmlFactory;
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

  public boolean metaInformationAssignedToModelElement(final MetaInformation metaInfo) {
    return metaInfo.getModelElements().size() > 0;
  }

  public boolean metaInformationObjectAlreadyAssignedToElement(
      final conml.instances.Object object, final ModelElement element) {
    return element
        .getElementMetaInformation()
        .stream()
        .map(MetaInformation::getMetaInfoObject)
        .anyMatch(obj -> EcoreUtil.equals(obj, object));
  }

  public void addModelElementToMetaInformation(
      final conml.instances.Object object, final ModelElement element) {
    final EObject container = object.eContainer();
    if (!(container instanceof Model)) {
      Activator.logError(Messages.getString("ExceptionMessage.InvalidContainer"));
      return;
    }

    final Model model = (Model) container;
    final Optional<MetaInformation> metaInfo =
        object
            .getObjectMetaInformation()
            .stream()
            .filter(mi -> EcoreUtil.equals(mi.getModel(), model))
            .findAny();
    if (metaInfo.isPresent()) {
      metaInfo.get().getModelElements().add(element);
    } else {
      final MetaInformation newMetaInfo = conmlFactory.eINSTANCE.createMetaInformation();
      newMetaInfo.setModel(model);
      newMetaInfo.setMetaInfoObject(object);
      newMetaInfo.getModelElements().add(element);
      model.getMetaInformation().add(newMetaInfo);
    }
  }
}
