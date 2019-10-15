package org.eclipse.sirius.conml.design.objectdiagram;

import conml.instances.Object;

public class ObjectServices {

  public String objectLabel(Object object) {
    return object.getIdentifier()
        + ": "
        + (object.getInstancedClass() != null ? object.getInstancedClass().getName() : "?");
  }
}
