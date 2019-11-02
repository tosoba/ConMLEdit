package org.eclipse.sirius.conml.design.services.classdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Attribute;
import conml.types.Class;

public class AttributeServices implements FeatureServices {

  public boolean redefinedAttributeIsOwnedByAncestor(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Attribute.class,
        (final Attribute attribute) -> {
          final Attribute redefined = attribute.getRedefinedAttribute();
          if (redefined == null) return true;
          final Class attributeClass = attribute.getOwnerClass();
          if (attributeClass == null) return true;
          return anyAncestorOfClassOwnsRedefinedFeature(
              attributeClass, redefined, Class::getAttributes);
        },
        true);
  }
}
