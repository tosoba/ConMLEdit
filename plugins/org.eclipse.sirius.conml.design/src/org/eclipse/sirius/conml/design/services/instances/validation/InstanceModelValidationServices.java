package org.eclipse.sirius.conml.design.services.instances.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.instances.InstanceModel;

public final class InstanceModelValidationServices {

  public boolean instanceModelConformsToAtLeastOneTypeModel(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        InstanceModel.class,
        instanceModel -> !instanceModel.getConformedTypeModels().isEmpty(),
        true);
  }
}
