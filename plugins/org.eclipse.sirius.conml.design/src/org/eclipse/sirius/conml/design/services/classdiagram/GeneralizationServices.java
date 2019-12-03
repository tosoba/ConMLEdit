package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.types.Class;
import conml.types.Generalization;

public final class GeneralizationServices {

  public boolean abstractGeneralizationPrecondition(final Class source, final Class target) {
    return !(source.isAbstract() && !target.isAbstract());
  }

  public void showCyclicInheritanceDialog(final EObject object) {
    Dialogs.showError(
        Messages.getString("Message.GeneralizationWasNotCreated"),
        Messages.getString("Error.CyclicInheritance"));
  }

  public boolean targetHasSpecialization(final Class target) {
    return target.getSpecialization() != null;
  }

  public void addToSpecializedClasses(final Class source, final Class target) {
    final Generalization targetSpecialization = target.getSpecialization();
    if (targetSpecialization != null) {
      if (!targetSpecialization.getSpecializedClasses().contains(source))
        targetSpecialization.getSpecializedClasses().add(source);
    }
  }

  public void setupGeneralization(
      final Generalization generalization, final Class source, final Class target) {
    generalization.getSpecializedClasses().add(source);
    source.getGeneralizations().add(generalization);
    generalization.setGeneralizedClass(target);
    target.setSpecialization(generalization);
  }

  public boolean wouldCauseCyclicInheritanceRelationship(final Class source, final Class target) {
    if (EcoreUtil.equals(source, target)) {
      return true;
    } else if (source.getSpecialization() == null) {
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

  public String defaultDiscriminant(final Class inheritedClass) {
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

  public void moveGeneralizationUp(final EObject object) {
    ConML.castAndRun(
        object,
        Generalization.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    clazz, Generalization.class, ConML.ElementMovementDirection.UP));
  }

  public void moveGeneralizationDown(final EObject object) {
    ConML.castAndRun(
        object,
        Generalization.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    clazz, Generalization.class, ConML.ElementMovementDirection.DOWN));
  }

  public String generalizationLabel(final Generalization generalization) {
    return generalization.getDiscriminant();
  }
}
