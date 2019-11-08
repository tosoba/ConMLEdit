package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.services.ModelServices;

import conml.instances.Link;

public final class InstanceModelServices {

  public Collection<EObject> getOwnedLinkElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Link.class);
  }

  public Collection<EObject> getOwnedObjectElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, conml.instances.Object.class);
  }
}
