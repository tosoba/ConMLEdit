package org.eclipse.sirius.conml.design.objectdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;
import org.eclipse.sirius.conml.design.classdiagram.ModelElementServices;

import conml.instances.Object;

public class ObjectServices extends ModelElementServices {

  public String objectLabel(Object object) {
    return object.getIdentifier()
        + ": "
        + (object.getInstancedClass() != null ? object.getInstancedClass().getName() : "?");
  }

  public void moveObjectUp(final EObject object) {
    moveElement(object, Object.class, ConML.ElementMovementDirection.UP);
  }

  public void moveObjectDown(final EObject object) {
    moveElement(object, Object.class, ConML.ElementMovementDirection.DOWN);
  }
}
