package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.ClassSelectionDialog;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.UIServices;
import org.eclipse.sirius.conml.design.services.objectdiagram.ObjectServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.Domain;
import conml.types.Association;
import conml.types.Class;
import conml.types.Generalization;
import conml.types.SemiAssociation;

public final class ClassServices {

  public void openSelectExistingClassesDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingClasses"),
                Messages.getString("Dialog.SelectClasses"),
                ConMLPredicates.isInstanceOfClass(Class.class),
                null),
            Class.class);
  }

  public void moveClassUp(final EObject object) {
    ConML.castAndRun(
        object,
        Class.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(clazz, Class.class, ConML.ElementMovementDirection.UP));
  }

  public void moveClassDown(final EObject object) {
    ConML.castAndRun(
        object,
        Class.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(clazz, Class.class, ConML.ElementMovementDirection.DOWN));
  }

  public void deleteClass(final Class clazz) {
    if (!(clazz.eContainer() instanceof Domain)) {
      EcoreUtil.delete(clazz);
      return;
    }

    final List<Association> associations =
        ConML.getStreamOfAllPartsOfTypeFromDomain((Domain) clazz.eContainer(), Association.class)
            .filter(
                association -> {
                  final SemiAssociation primarySemi = association.getPrimarySemiAssociation();
                  if (primarySemi != null && clazz.getSemiAssociations().contains(primarySemi))
                    return true;

                  final SemiAssociation secondarySemi = association.getSecondarySemiAssociation();
                  if (secondarySemi != null && clazz.getSemiAssociations().contains(secondarySemi))
                    return true;

                  return false;
                })
            .collect(Collectors.toList());

    for (final Association association : associations) {
      AssociationServices.getInstance().deleteAssociation(association);
    }

    for (final conml.instances.Object instance : new ArrayList<>(clazz.getInstanceObjects())) {
      ObjectServices.getInstance().deleteObject(instance);
    }

    EcoreUtil.delete(clazz);
  }

  public Class showClassSelectionDialog(final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new ClassSelectionDialog(
                    Messages.getString("Dialog.SelectClass"),
                    Messages.getString("Dialog.SelectInstancedClass"),
                    (Object obj) -> {
                      if (!(obj instanceof Class)) return false;
                      final Class instancedClassCandidate = (Class) obj;
                      if (instancedClassCandidate.getTypeModel() == null) return false;
                      return true;
                    }),
                false);
    if (result.size() == 1 && result.get(0) instanceof Class) return (Class) result.get(0);
    else return null;
  }

  public void showClassSelectionDialogForObjectDiagram(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    final Set<Class> displayedObjectsInstancedClasses = new HashSet<>();
    final Set<Class> displayedClasses = new HashSet<>();
    UIServices.getInstance()
        .getDisplayedNodes(diagram)
        .forEach(
            obj -> {
              if (obj instanceof conml.instances.Object) {
                final conml.instances.Object object = (conml.instances.Object) obj;
                if (object.getInstancedClass() != null)
                  displayedObjectsInstancedClasses.add(object.getInstancedClass());
              } else if (obj instanceof Class) {
                displayedClasses.add((Class) obj);
              }
            });
    final Set<Class> displayedClassesGeneralizedClasses =
        displayedClasses
            .stream()
            .map(Class::getGeneralizations)
            .flatMap(Collection::stream)
            .map(Generalization::getGeneralizedClass)
            .collect(Collectors.toSet());

    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ClassSelectionDialog(
                Messages.getString("Dialog.SelectClass"),
                Messages.getString("Dialog.SelectClassToAddToObjectDiagram"),
                (Object obj) -> {
                  if (!(obj instanceof Class)) return false;

                  final Class classCandidate = (Class) obj;
                  if (classCandidate.getTypeModel() == null
                      || displayedClasses.contains(classCandidate)) {
                    return false;
                  }
                  if (displayedObjectsInstancedClasses.contains(classCandidate)
                      || displayedClassesGeneralizedClasses.contains(classCandidate)) {
                    return true;
                  }

                  return false;
                }),
            Class.class);
  }
}
