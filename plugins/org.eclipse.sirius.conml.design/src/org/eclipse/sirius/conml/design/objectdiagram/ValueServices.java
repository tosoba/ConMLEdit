package org.eclipse.sirius.conml.design.objectdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;

import conml.instances.Value;

public class ValueServices {
  public boolean isBooleanValue(EObject object) {
    // return ConML.castAndRunOrReturn(object, Value.class, (Value value) -> value.get,
    // unsuccessfulCastResult)
    return false;
  }
}
