package org.eclipse.sirius.conml.design.objectdiagram;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;
import org.eclipse.sirius.conml.design.classdiagram.ModelElementServices;

import conml.instances.InstanceModel;
import conml.instances.InstancesFactory;
import conml.instances.Link;
import conml.instances.Reference;

public class LinkServices extends ModelElementServices {

  public conml.instances.Object getLinkSourceType(Link link) {
    return link.getPrimaryReference() != null
            && link.getPrimaryReference().getOwnerReferenceSet() != null
        ? link.getPrimaryReference().getOwnerReferenceSet().getOwner()
        : null;
  }

  public conml.instances.Object getLinkTargetType(Link link) {
    return link.getSecondaryReference() != null
            && link.getSecondaryReference().getOwnerReferenceSet() != null
        ? link.getSecondaryReference().getOwnerReferenceSet().getOwner()
        : null;
  }

  public List<Reference> referencesList(Link link) {
    return Arrays.asList(link.getPrimaryReference(), link.getSecondaryReference());
  }

  public boolean shouldDisplayLinkEdge(Link link) {
    return !link.isCompact();
  }

  public Link createLink(
      EObject object,
      conml.instances.Object source,
      conml.instances.Object target,
      EObject sourceView,
      EObject targetView) {
    final Link link = InstancesFactory.eINSTANCE.createLink();
    link.setCompact(false);

    // TODO: currently these references are not contained in any ReferenceSet
    // org.eclipse.emf.ecore.resource.Resource$IOWrappedException: The object
    // 'conml.instances.impl.ReferenceImpl@3ccb0ba6 (certainty: Certain)' is not contained in a
    // resource.
    final Reference primary = InstancesFactory.eINSTANCE.createReference();
    primary.setReferredObject(target);
    link.setPrimaryReference(primary);

    final Reference secondary = InstancesFactory.eINSTANCE.createReference();
    secondary.setReferredObject(source);
    link.setSecondaryReference(secondary);

    if (source.eContainer() instanceof InstanceModel) {
      final InstanceModel instanceModel = (InstanceModel) source.eContainer();
      instanceModel.getElements().add(link);
    }
    return link;
  }

  public void moveLinkUp(EObject object) {
    moveElement(object, Link.class, ConML.ElementMovementDirection.UP);
  }

  public void moveLinkDown(EObject object) {
    moveElement(object, Link.class, ConML.ElementMovementDirection.DOWN);
  }
}
