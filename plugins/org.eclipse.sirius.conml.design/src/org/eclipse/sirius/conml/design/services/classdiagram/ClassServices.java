package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.TypeModelSelectionDialog;
import org.eclipse.sirius.conml.design.services.DomainServices;
import org.eclipse.sirius.conml.design.services.objectdiagram.ObjectServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.swt.widgets.Display;

import conml.Domain;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

public final class ClassServices {

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

  public TypeModel showTypeModelSelectionDialog(final Domain domain) {
    final TypeModelSelectionDialog dialog =
        new TypeModelSelectionDialog(
            Display.getCurrent().getActiveShell(),
            DomainServices.getInstance()
                .getOwnedModelsOfType(domain, TypeModel.class)
                .map(TypeModel.class::cast)
                .collect(Collectors.toList()),
            "Enter a name of the TypeModel container for the Class.");
    dialog.open();
    final Object[] result = dialog.getResult();
    if (result != null && result.length == 1 && result[0] instanceof TypeModel)
      return (TypeModel) result[0];
    else return null;
  }
}
