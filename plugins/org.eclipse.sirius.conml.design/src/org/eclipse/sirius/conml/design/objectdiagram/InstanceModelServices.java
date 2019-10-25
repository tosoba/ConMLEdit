package org.eclipse.sirius.conml.design.objectdiagram;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ModelServices;

import conml.instances.Link;

public class InstanceModelServices extends ModelServices {

  public Collection<EObject> getOwnedLinkElements(EObject object) {
    return getOwnedElementsOfType(object, Link.class);
  }

  public Collection<EObject> getOwnedObjectElements(EObject object) {
    return getOwnedElementsOfType(object, conml.instances.Object.class);
  }
}
