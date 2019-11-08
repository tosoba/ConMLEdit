package org.eclipse.sirius.conml.design.services.classdiagram.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Property;
import conml.types.Class;

public final class PropertyValidationServices {

  public boolean redefinedPropertyIsOwnedByAncestor(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Property.class,
        (final Property property) -> {
          final Property redefined = property.getRedefinedProperty();
          if (redefined == null) return true;
          final Class propertyClass = property.getOwnerClass();
          if (propertyClass == null) return true;
          return Validation.anyAncestorOfClassOwnsRedefinedFeature(
              propertyClass, redefined, Class::getProperties);
        },
        true);
  }
}
