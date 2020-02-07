package org.eclipse.sirius.conml.design.services.types.style;

import static org.eclipse.sirius.conml.design.services.types.AssociationServices.checkCorrespondingAssociation;

import org.eclipse.emf.ecore.EObject;

import conml.instances.ReferenceSet;
import conml.types.Association;
import conml.types.SemiAssociation;

public final class AssociationStyleServices {

  public boolean isPrimarySemiAssociationWhole(final EObject object) {
    return checkCorrespondingAssociation(
        object, (association) -> association.getPrimarySemiAssociation().isWhole());
  }

  public boolean isSecondarySemiAssociationWhole(final EObject object) {
    return checkCorrespondingAssociation(
        object, (association) -> association.getSecondarySemiAssociation().isWhole());
  }

  public boolean isPrimarySemiAssociationStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object, (association) -> association.getPrimarySemiAssociation().isStrong());
  }

  public boolean isSecondarySemiAssociationStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object, (association) -> association.getSecondarySemiAssociation().isStrong());
  }

  public boolean areBothSemiAssociationsStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getPrimarySemiAssociation().isStrong()
                && association.getSecondarySemiAssociation().isStrong());
  }

  public boolean isPrimaryAssociationWholeAndStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getPrimarySemiAssociation().isStrong()
                && association.getPrimarySemiAssociation().isWhole());
  }

  public boolean isSecondaryAssociationWholeAndStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getSecondarySemiAssociation().isStrong()
                && association.getSecondarySemiAssociation().isWhole());
  }

  public boolean isPrimarySemiAssociationWholeAndStrongAndSecondaryStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getPrimarySemiAssociation().isWhole()
                && association.getPrimarySemiAssociation().isStrong()
                && association.getSecondarySemiAssociation().isStrong());
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryStrongAndWhole(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getPrimarySemiAssociation().isStrong()
                && association.getSecondarySemiAssociation().isWhole()
                && association.getSecondarySemiAssociation().isStrong());
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryWhole(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getPrimarySemiAssociation().isStrong()
                && association.getSecondarySemiAssociation().isWhole());
  }

  public boolean isPrimarySemiAssociationWholeAndSecondaryStrong(final EObject object) {
    return checkCorrespondingAssociation(
        object,
        (association) ->
            association.getPrimarySemiAssociation().isWhole()
                && association.getSecondarySemiAssociation().isStrong());
  }

  public boolean shouldDisplayCompactLabel(final EObject object) {
    if (object instanceof SemiAssociation) {
      final SemiAssociation semiAssociation = (SemiAssociation) object;
      final Association association = semiAssociation.getPrimaryInAssociation();
      if (association == null) return false;
      else return association.isCompact();
    } else if (object instanceof ReferenceSet) {
      final ReferenceSet referenceSet = (ReferenceSet) object;
      if (referenceSet.getReferences().isEmpty()
          || referenceSet
              .getReferences()
              .stream()
              .anyMatch(ref -> ref.getPrimaryLink() == null || !ref.getPrimaryLink().isCompact()))
        return false;
      else return true;
    } else return false;
  }

  public boolean shouldDisplayAssociationEdge(final Association association) {
    return !association.isCompact();
  }
}
