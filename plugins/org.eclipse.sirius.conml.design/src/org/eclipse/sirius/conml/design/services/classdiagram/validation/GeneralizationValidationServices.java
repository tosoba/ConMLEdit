package org.eclipse.sirius.conml.design.services.classdiagram.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Class;
import conml.types.Generalization;

public final class GeneralizationValidationServices {
	
  public boolean dominatesGeneralizationsOnlyOnParticipatingClasses(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Generalization.class,
        (final Generalization generalization) -> {
          final EList<Class> dominatedClasses = generalization.getDominatedClasses();
          if (dominatedClasses.isEmpty()) return true;
          return !dominatedClasses
              .stream()
              .anyMatch(clazz -> !generalization.getSpecializedClasses().contains(clazz));
        },
        true);
  }
}
