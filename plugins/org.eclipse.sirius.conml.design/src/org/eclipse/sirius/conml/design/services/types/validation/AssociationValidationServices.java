package org.eclipse.sirius.conml.design.services.types.validation;

import org.eclipse.emf.ecore.EObject;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class AssociationValidationServices {

  public boolean areSemiAssociationsWholeSemanticsValid(final EObject object) {
    if (!(object instanceof Association)) return true;
    final Association association = (Association) object;
    return !association.getPrimarySemiAssociation().isWhole()
        || !association.getSecondarySemiAssociation().isWhole();
  }

  public boolean arePrimarySemiAssociationCardinalitiesValid(final Association association) {
    return areCardinalitiesValid(association.getPrimarySemiAssociation());
  }

  public boolean areSecondarySemiAssociationCardinalitiesValid(final Association association) {
    return areCardinalitiesValid(association.getSecondarySemiAssociation());
  }

  private boolean areCardinalitiesValid(final SemiAssociation semiAssociation) {
    if (semiAssociation.getMaximumCardinality() == null) return true;
    else return semiAssociation.getMaximumCardinality() >= semiAssociation.getMinimumCardinality();
  }
}
