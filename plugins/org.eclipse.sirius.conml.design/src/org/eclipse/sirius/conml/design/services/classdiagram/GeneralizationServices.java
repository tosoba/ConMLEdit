package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;

import conml.types.Class;
import conml.types.Generalization;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class GeneralizationServices {

  private static final class Errors {
    static final String CYCLIC_INHERITANCE =
        "Creating that generalization would cause a cyclic inheritance relationship.";
    static final String SELF_GENERALIZATION = "Self generalization is not allowed.";
  }

  private static final class Messages {
    static final String GENERALIZATION_WAS_NOT_CREATED = "Generalization was not created";
  }

  public Generalization createGeneralization(
      final EObject object,
      final Class source,
      final Class target,
      final EObject sourceView,
      final EObject targetView) {
    if (EcoreUtil.equals(source, target)) {
      Dialogs.showError(Messages.GENERALIZATION_WAS_NOT_CREATED, Errors.SELF_GENERALIZATION);
      return null;
    }

    // Prevent the creation of generalization between the same 2 classes in the
    // opposite direction
    if (wouldCauseCyclicInheritanceRelationship(source, target)) {
      Dialogs.showError(Messages.GENERALIZATION_WAS_NOT_CREATED, Errors.CYCLIC_INHERITANCE);
      return null;
    }

    // If multiple classes inherit from one class - don't create a new
    // Generalization instance
    final Generalization targetSpecialization = target.getSpecialization();
    if (targetSpecialization != null) {
      if (!targetSpecialization.getSpecializedClasses().contains(source))
        targetSpecialization.getSpecializedClasses().add(source);
      return null;
    }

    // Otherwise create a new one
    final Generalization generalization = TypesFactory.eINSTANCE.createGeneralization();
    generalization.setDiscriminant(defaultDiscriminant(target));
    generalization.getSpecializedClasses().add(source);
    source.getGeneralizations().add(generalization);
    generalization.setGeneralizedClass(target);
    target.setSpecialization(generalization);

    if (source.eContainer() instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) source.eContainer();
      typeModel.getElements().add(generalization);
    }
    return generalization;
  }

  private boolean wouldCauseCyclicInheritanceRelationship(Class source, Class target) {
    if (source.getSpecialization() == null) {
      return false;
    } else if (source
        .getSpecialization()
        .getSpecializedClasses()
        .stream()
        .anyMatch(clazz -> EcoreUtil.equals(clazz, target))) {
      return true;
    } else {
      return source
          .getSpecialization()
          .getSpecializedClasses()
          .stream()
          .anyMatch(
              specializedClass ->
                  wouldCauseCyclicInheritanceRelationship(specializedClass, target));
    }
  }

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

  private String defaultDiscriminant(final Class inheritedClass) {
    return inheritedClass.getName();
  }

  public Collection<EObject> getGeneralizationSourceType(final Generalization generalization) {
    return generalization
        .getSpecializedClasses()
        .stream()
        .map(clazz -> (EObject) clazz)
        .collect(Collectors.toList());
  }

  public Class getGeneralizationTargetType(final Generalization generalization) {
    return generalization.getGeneralizedClass();
  }
}
