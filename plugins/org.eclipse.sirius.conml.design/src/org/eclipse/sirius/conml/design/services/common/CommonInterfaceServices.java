package org.eclipse.sirius.conml.design.services.common;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.DefinableElement;
import conml.NamedElement;

public final class CommonInterfaceServices {

  public String getElementName(final EObject object) {
    return ConML.castAndRunOrReturn(object, NamedElement.class, NamedElement::getName, "");
  }

  public void setElementName(final EObject object, final String name) {
    ConML.castAndRun(object, NamedElement.class, (element) -> element.setName(name));
  }

  public void setElementDefinition(final EObject object, final String definition) {
    ConML.castAndRun(
        object, DefinableElement.class, (element) -> element.setDefinition(definition));
  }
}
