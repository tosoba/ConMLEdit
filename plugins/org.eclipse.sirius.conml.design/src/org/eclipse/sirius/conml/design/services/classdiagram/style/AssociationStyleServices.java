package org.eclipse.sirius.conml.design.services.classdiagram.style;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class AssociationStyleServices {

  public boolean isPrimarySemiAssociationWhole(final Association association) {
    return association.getPrimarySemiAssociation().isWhole();
  }

  public boolean isSecondarySemiAssociationWhole(final Association association) {
    return association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationStrong(final Association association) {
    return association.getPrimarySemiAssociation().isStrong();
  }

  public boolean isSecondarySemiAssociationStrong(final Association association) {
    return association.getSecondarySemiAssociation().isStrong();
  }

  public boolean areBothSemiAssociationsStrong(final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimaryAssociationWholeAndStrong(final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getPrimarySemiAssociation().isWhole();
  }

  public boolean isSecondaryAssociationWholeAndStrong(final Association association) {
    return association.getSecondarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationWholeAndStrongAndSecondaryStrong(
      final Association association) {
    return association.getPrimarySemiAssociation().isWhole()
        && association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryStrongAndWhole(
      final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryWhole(final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationWholeAndSecondaryStrong(final Association association) {
    return association.getPrimarySemiAssociation().isWhole()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean shouldDisplayCompactLabel(final SemiAssociation semiAssociation) {
    final Association association = semiAssociation.getPrimaryInAssociation();
    if (association == null) return false;
    else return association.isCompact();
  }

  public boolean shouldDisplayAssociationEdge(final Association association) {
    return !association.isCompact();
  }
}
