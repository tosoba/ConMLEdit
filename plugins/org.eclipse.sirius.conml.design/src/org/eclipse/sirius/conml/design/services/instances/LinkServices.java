package org.eclipse.sirius.conml.design.services.instances;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.AssociationSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
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

  private static final class InstanceHolder {
    private static final LinkServices INSTANCE = new LinkServices();
  }

  public static LinkServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

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
    primaryRef.setInstanceModel(link.getInstanceModel());
    link.setPrimaryReference(primaryRef);

    final Reference secondaryRef = InstancesFactory.eINSTANCE.createReference();
    secondaryRef.setReferredObject(source);
    secondaryRef.setInstanceModel(link.getInstanceModel());
    link.setSecondaryReference(secondaryRef);

    //TODO: check if this is bidirectional
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
      refSet.setInstanceModel(referenceSetContainer.getInstanceModel());
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

  public String compactLinkLabel(final ReferenceSet referenceSet) {
    final SemiAssociation semiAssociation = referenceSet.getInstancedSemiAssociation();
    if (semiAssociation == null) {
      return null;
    }

    final StringBuilder sb = new StringBuilder(semiAssociation.getRole()).append(" = ");
    if (referenceSet.getReferences().isEmpty()) sb.append("null");
    else
      sb.append(
          referenceSet
              .getReferences()
              .stream()
              .map(
                  reference ->
                      reference.getReferredObject() == null
                          ? "unknown"
                          : reference.getReferredObject().getIdentifier())
              .collect(Collectors.joining(", ")));
    return sb.toString();
  }

  public boolean isExpandedLink(final EObject object) {
    return object instanceof Link && !((Link) object).isCompact();
  }

  public boolean isCompactLink(final EObject object) {
    return object instanceof ReferenceSet
        && ((ReferenceSet) object)
            .getReferences()
            .stream()
            .allMatch(ref -> ref.getPrimaryLink() != null || ref.getPrimaryLink().isCompact());
  }

  public void expandLink(ReferenceSet referenceSet) {
    referenceSet
        .getReferences()
        .forEach(
            ref -> {
              if (ref.getPrimaryLink() != null) ref.getPrimaryLink().setCompact(false);
            });
  }

  public void compactLink(Link link) {
    link.setCompact(true);
  }
}
