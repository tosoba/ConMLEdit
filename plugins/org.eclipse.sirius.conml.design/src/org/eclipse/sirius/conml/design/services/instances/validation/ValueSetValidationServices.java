package org.eclipse.sirius.conml.design.services.instances.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.instances.ValueSet;
import conml.types.Attribute;

public final class ValueSetValidationServices {

  public boolean valueSetSatisfiesMinCardinality(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        ValueSet.class,
        (final ValueSet valueSet) -> {
          if (valueSet.getInstancedAttribute() == null) return true;
          return valueSet.getValues().size()
              >= valueSet.getInstancedAttribute().getMinimumCardinality();
        },
        true);
  }

  public boolean valueSetSatisfiesMaxCardinality(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        ValueSet.class,
        (final ValueSet valueSet) -> {
          final Attribute attribute = valueSet.getInstancedAttribute();
          if (attribute == null) return true;
          return attribute.getMaximumCardinality() == null
              || (valueSet.getValues().size() <= attribute.getMaximumCardinality());
        },
        true);
  }
}
