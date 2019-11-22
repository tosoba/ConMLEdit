package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.ExistingEObjectsSelectionDialog;
import org.eclipse.sirius.conml.design.services.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.objectdiagram.ObjectServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

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
            new ExistingEObjectsSelectionDialog(
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
    final TypeModel typeModel = clazz.getTypeModel();
    if (typeModel == null) {
      EcoreUtil.delete(clazz);
      return;
    }

    final List<Association> associations =
        ConML.getStreamOfAllElementsOfTypeFromModel(typeModel, Association.class)
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
}
