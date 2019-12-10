package org.eclipse.sirius.conml.design.services.instances;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.AssociationSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.types.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.EdgeTarget;

import conml.instances.InstancesFactory;
import conml.instances.Link;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.types.Association;
import conml.types.SemiAssociation;

public final class LinkServices {

  public conml.instances.Object getLinkSourceType(final Link link) {
    return link.getPrimaryReference() != null
            && link.getPrimaryReference().getOwnerReferenceSet() != null
        ? link.getPrimaryReference().getOwnerReferenceSet().getOwner()
        : null;
  }

  public conml.instances.Object getLinkTargetType(final Link link) {
    return link.getSecondaryReference() != null
            && link.getSecondaryReference().getOwnerReferenceSet() != null
        ? link.getSecondaryReference().getOwnerReferenceSet().getOwner()
        : null;
  }

  public List<Reference> referencesList(final Link link) {
    return Arrays.asList(link.getPrimaryReference(), link.getSecondaryReference());
  }

  public boolean shouldDisplayLinkEdge(final Link link) {
    return !link.isCompact();
  }

  public void moveLinkUp(final EObject object) {
    ConML.castAndRun(
        object,
        Link.class,
        link ->
            ModelElementServices.getInstance()
                .moveInstanceModelElement(link, Link.class, ConML.ElementMovementDirection.UP));
  }

  public void moveLinkDown(final EObject object) {
    ConML.castAndRun(
        object,
        Link.class,
        link ->
            ModelElementServices.getInstance()
                .moveInstanceModelElement(link, Link.class, ConML.ElementMovementDirection.DOWN));
  }

  public void createLinkReferences(
      final Link link, final conml.instances.Object source, final conml.instances.Object target) {
    final Association instancedAssociation = link.getInstancedAssociation();
    final SemiAssociation primarySemi = instancedAssociation.getPrimarySemiAssociation();
    final SemiAssociation secondarySemi = instancedAssociation.getSecondarySemiAssociation();

    final Reference primaryRef = InstancesFactory.eINSTANCE.createReference();
    primaryRef.setReferredObject(target);
    link.setPrimaryReference(primaryRef);

    final Reference secondaryRef = InstancesFactory.eINSTANCE.createReference();
    secondaryRef.setReferredObject(source);
    link.setSecondaryReference(secondaryRef);

    primaryRef.setInverseReference(secondaryRef);
    secondaryRef.setInverseReference(primaryRef);

    addReferenceToSet(source, primarySemi, primaryRef);
    addReferenceToSet(target, secondarySemi, secondaryRef);
  }

  private void addReferenceToSet(
      final conml.instances.Object referenceSetContainer,
      final SemiAssociation instancedSemiAssociation,
      final Reference reference) {
    final Optional<ReferenceSet> existingRefSet =
        referenceSetContainer
            .getReferenceSets()
            .stream()
            .filter(
                refSet ->
                    EcoreUtil.equals(
                        refSet.getInstancedSemiAssociation(), instancedSemiAssociation))
            .findFirst();
    if (existingRefSet.isPresent()) {
      existingRefSet.get().getReferences().add(reference);
      reference.setOwnerReferenceSet(existingRefSet.get());
    } else {
      final ReferenceSet refSet = InstancesFactory.eINSTANCE.createReferenceSet();
      refSet.setInstancedSemiAssociation(instancedSemiAssociation);
      referenceSetContainer.getReferenceSets().add(refSet);
      refSet.setOwner(referenceSetContainer);
      refSet.getReferences().add(reference);
    }
  }

  public Association showAssociationSelectionDialog(
      final conml.instances.Object source,
      final conml.instances.Object target,
      final EdgeTarget sourceView) {
    final DDiagram diagram = (DDiagram) sourceView.eContainer();
    if (source.getInstancedClass() == null) {
      Activator.logError(
          Messages.getString("ExceptionMessage.IsNull", "Source Object's instanced Class"));
      return null;
    }
    if (target.getInstancedClass() == null) {
      Activator.logError(
          Messages.getString("ExceptionMessage.IsNull", "Target Object's instanced Class"));
      return null;
    }

    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                source.eContainer(),
                diagram,
                new AssociationSelectionDialog(
                    Messages.getString("Dialog.SelectAssociation"),
                    Messages.getString("Dialog.SelectInstancedAssociation"),
                    source.getInstancedClass(),
                    target.getInstancedClass()),
                false);
    if (result.size() == 1 && result.get(0) instanceof Association)
      return (Association) result.get(0);
    else return null;
  }
}
