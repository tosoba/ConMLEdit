package org.eclipse.sirius.conml.design.services.types.label;

import static org.eclipse.sirius.conml.design.services.types.AssociationServices.getCorrespondingAssociation;

import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class AssociationLabelServices {

  public String associationCenterLabel(final EObject object) {
    return associationCenterTopLabel(object) + "\n\n\n\n" + associationCenterBottomLabel(object);
  }

  public String associationPropertiesLabel(final Association association) {
    return associationCenterTopLabel(association) + " " + associationCenterBottomLabel(association);
  }

  public String associationCenterTopLabel(final EObject object) {
    final Association association = getCorrespondingAssociation(object);
    if (association == null) return null;

    final StringBuilder sb =
        association.getPrimarySemiAssociation().isNameDisplayed()
            ? buildSemiAssociationAttributeLabel(
                    association.getPrimarySemiAssociation(), SemiAssociation::getName)
                .append(' ')
            : new StringBuilder();
    SemiAssociationLabelServices.getInstance()
        .appendMarkersString(sb, association.getPrimarySemiAssociation());
    if (association.getPrimarySemiAssociation().isNameDisplayed() || sb.length() > 0)
      sb.append(" \u25B6");
    return sb.toString();
  }

  public String associationCenterBottomLabel(final EObject object) {
    final Association association = getCorrespondingAssociation(object);
    if (association == null) return null;

    final StringBuilder sb =
        association.getSecondarySemiAssociation().isNameDisplayed()
            ? buildSemiAssociationAttributeLabel(
                    association.getSecondarySemiAssociation(), SemiAssociation::getName)
                .append(' ')
            : new StringBuilder();
    SemiAssociationLabelServices.getInstance()
        .appendMarkersString(sb, association.getSecondarySemiAssociation());
    if (association.getSecondarySemiAssociation().isNameDisplayed() || sb.length() > 0)
      sb.insert(0, "\u25C0 ");
    return sb.toString();
  }

  public String associationBeginLabel(final EObject object) {
    final Association association = getCorrespondingAssociation(object);
    if (association == null) return null;

    final StringBuilder sb =
        association.getPrimarySemiAssociation().isRoleDisplayed()
            ? buildSemiAssociationAttributeLabel(
                    association.getPrimarySemiAssociation(), SemiAssociation::getRole)
                .append(' ')
            : new StringBuilder();
    if (object instanceof Association)
      Labels.buildCardinalityLabelPart(association.getPrimarySemiAssociation(), sb);
    return sb.toString();
  }

  public String associationEndLabel(final EObject object) {
    final Association association = getCorrespondingAssociation(object);
    if (association == null) return null;

    final StringBuilder sb =
        association.getSecondarySemiAssociation().isRoleDisplayed()
            ? buildSemiAssociationAttributeLabel(
                    association.getSecondarySemiAssociation(), SemiAssociation::getRole)
                .append(' ')
            : new StringBuilder();
    if (object instanceof Association)
      Labels.buildCardinalityLabelPart(association.getSecondarySemiAssociation(), sb);
    return sb.toString();
  }

  private StringBuilder buildSemiAssociationAttributeLabel(
      final SemiAssociation semiAssociation,
      final Function<SemiAssociation, String> attributeNameGetter) {
    return SemiAssociationLabelServices.getInstance()
        .buildSemiAssociationAttributeLabel(
            semiAssociation, attributeNameGetter, new StringBuilder());
  }
}
