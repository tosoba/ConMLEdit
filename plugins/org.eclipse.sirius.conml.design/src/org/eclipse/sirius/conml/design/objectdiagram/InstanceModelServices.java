package org.eclipse.sirius.conml.design.objectdiagram;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;
import org.eclipse.sirius.conml.design.ModelServices;

import conml.instances.InstanceModel;
import conml.instances.Link;

public class InstanceModelServices extends ModelServices {

  public Collection<EObject> getOwnedLinkElements(final EObject object) {
    return getOwnedElementsOfType(object, Link.class);
  }

  public Collection<EObject> getOwnedObjectElements(final EObject object) {
    return getOwnedElementsOfType(object, conml.instances.Object.class);
  }

  public boolean instanceModelConformsToAtLeastOneTypeModel(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        InstanceModel.class,
        instanceModel -> !instanceModel.getConformedTypeModels().isEmpty(),
        true);
  }
}
