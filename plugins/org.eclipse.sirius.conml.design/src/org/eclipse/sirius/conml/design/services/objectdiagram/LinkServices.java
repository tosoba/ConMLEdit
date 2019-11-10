package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.classdiagram.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;

import conml.instances.InstancesFactory;
import conml.instances.Link;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import lpg.runtime.Messages;

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
    ModelElementServices.getInstance()
        .moveElement(object, Link.class, ConML.ElementMovementDirection.UP);
  }

  public void moveLinkDown(final EObject object) {
    ModelElementServices.getInstance()
        .moveElement(object, Link.class, ConML.ElementMovementDirection.DOWN);
  }

  public void createLinkReferences(
      final Link link, final conml.instances.Object source, final conml.instances.Object target) {
    final Association instancedAssociation = link.getInstancedAssociation();
    if (instancedAssociation == null) {
      Dialogs.showError(
          Messages.getString("Message.LinkCannotBeCreated"),
          Messages.getString("Error.InstanceAssociationNotSpecified"));
      EcoreUtil.delete(link);
      return;
    }

    final Class sourceClass = source.getInstancedClass();
    final Class targetClass = target.getInstancedClass();
    final EObject instancedClassesContainer = sourceClass.eContainer();
    final TypeModel typeModel = (TypeModel) instancedClassesContainer;
    if (!ConML.getStreamOfAllElementsOfTypeFromModel(typeModel, Association.class)
        .filter(
            association -> {
              final SemiAssociation primary = association.getPrimarySemiAssociation();
              final SemiAssociation secondary = association.getSecondarySemiAssociation();
              if (primary == null || secondary == null) return false;
              return EcoreUtil.equals(primary.getReferredClass(), targetClass)
                  && EcoreUtil.equals(secondary.getReferredClass(), sourceClass);
            })
        .collect(Collectors.toSet())
        .contains(instancedAssociation)) {
      Dialogs.showError(
          Messages.getString("Message.LinkCannotBeCreated"),
          Messages.getString("Error.InstancedAssociationClassMismatch"));
      EcoreUtil.delete(link);
      return;
    }

    final SemiAssociation primarySemi = instancedAssociation.getPrimarySemiAssociation();
    if (primarySemi == null) { // this should not be possible...
      EcoreUtil.delete(link);
      return;
    }

    final SemiAssociation secondarySemi = instancedAssociation.getSecondarySemiAssociation();
    if (secondarySemi == null) { // this should not be possible...
      EcoreUtil.delete(link);
      return;
    }

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

  public boolean anyAssociationExistsBetweenInstancedClasses(
      final conml.instances.Object source, final conml.instances.Object target) {
    final Class sourceClass = source.getInstancedClass();
    final Class targetClass = target.getInstancedClass();
    if (sourceClass == null || targetClass == null) return false;

    // TODO: is it possible to create an association between classes from different TypeModels...?
    // Currently probably not...
    // But if it should be possible then changes to code below are required
    // since code below looks for an association only inside the TypeModel containing source Class
    final EObject instancedClassesContainer = sourceClass.eContainer();
    if (instancedClassesContainer == null || !(instancedClassesContainer instanceof TypeModel))
      return false;
    final TypeModel typeModel = (TypeModel) instancedClassesContainer;
    return ConML.getStreamOfAllElementsOfTypeFromModel(typeModel, Association.class)
        .filter(
            association -> {
              final SemiAssociation primary = association.getPrimarySemiAssociation();
              final SemiAssociation secondary = association.getSecondarySemiAssociation();
              if (primary == null || secondary == null) return false;
              return EcoreUtil.equals(primary.getReferredClass(), targetClass)
                  && EcoreUtil.equals(secondary.getReferredClass(), sourceClass);
            })
        .findAny()
        .isPresent();
  }

  public void showCannotCreateALinkDialog(
      final conml.instances.Object source, final conml.instances.Object target) {
    final Class sourceClass = source.getInstancedClass();
    if (sourceClass == null) {
      Dialogs.showError(
          Messages.getString("Message.LinkCannotBeCreated"),
          Messages.getString("Error.SourceClassIsNull"));
      return;
    }
    final Class targetClass = target.getInstancedClass();
    if (targetClass == null) {
      Dialogs.showError(
          Messages.getString("Message.LinkCannotBeCreated"),
          Messages.getString("Error.TargetClassIsNull"));
      return;
    }
    Dialogs.showError(
        Messages.getString("Message.LinkCannotBeCreated"),
        Messages.getString("Error.NoAssociationExists"));
  }
}
