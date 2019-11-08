package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.objectdiagram.ObjectServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.Model;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

public final class ClassServices {

  public Collection<Class> getCDClassSemanticCandidates(final Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Class.class);
  }

  public void moveClassUp(final EObject object) {
    ModelElementServices.getInstance()
        .moveElement(object, Class.class, ConML.ElementMovementDirection.UP);
  }

  public void moveClassDown(final EObject object) {
    ModelElementServices.getInstance()
        .moveElement(object, Class.class, ConML.ElementMovementDirection.DOWN);
  }

  public void deleteClass(final Class clazz) {
    final EObject container = clazz.eContainer();
    if (container == null || !(container instanceof TypeModel)) {
      EcoreUtil.delete(clazz);
      return;
    }

    final TypeModel typeModel = (TypeModel) container;
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
