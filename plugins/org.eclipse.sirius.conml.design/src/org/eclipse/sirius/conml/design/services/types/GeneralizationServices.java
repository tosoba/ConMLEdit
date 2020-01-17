package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
import org.eclipse.sirius.conml.design.services.common.UIServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeListSpec;

import conml.types.Class;
import conml.types.Generalization;

@SuppressWarnings("restriction")
public final class GeneralizationServices {

  public String generalizationEdgeLabel(
      final Generalization generalization, final DDiagramElement view) {
    final DEdgeSpec edge = (DEdgeSpec) view;
    final Class source = (Class) ((DNodeListSpec) edge.basicGetSourceNode()).getTarget();
    return generalization.isDiscriminantDisplayed()
            && generalization.getSpecializedClasses().indexOf(source) == 0
        ? generalization.getDiscriminant()
        : "";
  }

  public String generalizationDotLabel(
      final Generalization generalization, final DDiagramElement view) {
    final DEdgeSpec edge = (DEdgeSpec) view;
    final Class source = (Class) ((DNodeListSpec) edge.basicGetSourceNode()).getTarget();
    return source.getGeneralizations().size() > 1
            && EcoreUtil.equals(source.getDominantGeneralization(), generalization)
        ? "\u25A0"
        : "";
  }

  public boolean abstractGeneralizationPrecondition(final Class source, final Class target) {
    return !(source.isAbstract() && !target.isAbstract());
  }

  public void showCyclicInheritanceDialog(final EObject object) {
    Dialogs.showError(
        Messages.getString("Message.GeneralizationWasNotCreated"),
        Messages.getString("Error.CyclicInheritance"));
  }

  public void showAlreadyInheritedDialog(final EObject object) {
    Dialogs.showError(
        Messages.getString("Message.GeneralizationWasNotCreated"),
        Messages.getString("Error.AlreadyInherited"));
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

  public boolean alreadyInheritsFrom(final Class source, final Class target) {
    if (target.getSpecialization() == null) {
      return false;
    } else if (target
        .getSpecialization()
        .getSpecializedClasses()
        .stream()
        .anyMatch(clazz -> EcoreUtil.equals(clazz, source))) {
      return true;
    } else {
      return target
          .getSpecialization()
          .getSpecializedClasses()
          .stream()
          .anyMatch(specializedClass -> alreadyInheritsFrom(source, specializedClass));
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

  public boolean indirectGeneralizationPrecondition(
      final Generalization generalization, final DDiagram diagram) {
    return generalization.getGeneralizedClass() != null
        && !UIServices.getInstance()
            .getDisplayedNodesOfType(diagram, Class.class)
            .contains(generalization.getGeneralizedClass());
  }

  public Collection<Class> getIndirectGeneralizationTargetType(
      final Generalization generalization, final DDiagram diagram) {
    if (generalization.getGeneralizedClass() == null) return new ArrayList<>();
    final ArrayList<Class> classes = new ArrayList<>();
    final Set<Class> displayedClasses =
        UIServices.getInstance().getDisplayedNodesOfType(diagram, Class.class);
    addIndirectGeneralizationTargetTypes(
        generalization.getGeneralizedClass().getGeneralizations(), classes, displayedClasses);
    return classes;
  }

  private void addIndirectGeneralizationTargetTypes(
      final List<Generalization> generalizations,
      final List<Class> currentClasses,
      final Set<Class> displayedClasses) {
    generalizations.forEach(
        gen -> {
          if (gen.getGeneralizedClass() == null) return;
          else if (displayedClasses.contains(gen.getGeneralizedClass()))
            currentClasses.add(gen.getGeneralizedClass());
          else
            addIndirectGeneralizationTargetTypes(
                gen.getGeneralizedClass().getGeneralizations(), currentClasses, displayedClasses);
        });
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
