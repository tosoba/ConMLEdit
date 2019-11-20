package org.eclipse.sirius.conml.design.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.NamedElement;

public final class CommonInterfaceServices {

  public String getElementName(final EObject object) {
    return ConML.castAndRunOrReturn(object, NamedElement.class, NamedElement::getName, "");
  }
}
