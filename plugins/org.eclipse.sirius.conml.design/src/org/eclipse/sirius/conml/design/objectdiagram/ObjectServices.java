package org.eclipse.sirius.conml.design.objectdiagram;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.ConML;
import org.eclipse.sirius.conml.design.classdiagram.ModelElementServices;

import conml.instances.InstanceModel;
import conml.instances.Link;
import conml.instances.Object;
import conml.instances.Reference;

public class ObjectServices extends ModelElementServices {

  public String objectLabel(final Object object) {
    return object.getIdentifier()
        + ": "
        + (object.getInstancedClass() != null ? object.getInstancedClass().getName() : "?");
  }

  public void moveObjectUp(final EObject object) {
    moveElement(object, Object.class, ConML.ElementMovementDirection.UP);
  }

  public void moveObjectDown(final EObject object) {
    moveElement(object, Object.class, ConML.ElementMovementDirection.DOWN);
  }

  public void deleteObject(final Object object) {
    final EObject container = object.eContainer();
    if (container == null || !(container instanceof InstanceModel)) {
      EcoreUtil.delete(object);
      return;
    }

    final InstanceModel instanceModel = (InstanceModel) container;
    List<Link> links =
        ConML.getStreamOfAllElementsOfTypeFromModel(instanceModel, Link.class)
            .filter(
                link -> {
                  final Reference primaryRef = link.getPrimaryReference();
                  if (primaryRef != null
                      && primaryRef.getOwnerReferenceSet() != null
                      && EcoreUtil.equals(object, primaryRef.getOwnerReferenceSet().getOwner()))
                    return true;
                  final Reference secondaryRef = link.getSecondaryReference();
                  if (secondaryRef != null
                      && secondaryRef.getOwnerReferenceSet() != null
                      && EcoreUtil.equals(object, secondaryRef.getOwnerReferenceSet().getOwner()))
                    return true;
                  return false;
                })
            .collect(Collectors.toList());
    for (Link link : links) {
      EcoreUtil.delete(link);
    }

    EcoreUtil.delete(object);
  }
}
