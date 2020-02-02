package org.eclipse.sirius.conml.design.services.types.label;

import java.util.function.Function;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class AssociationLabelServices {

  public String associationCenterLabel(final Association association) {
    return associationCenterTopLabel(association)
        + "\n\n\n\n"
        + associationCenterBottomLabel(association);
  }

  public String associationPropertiesLabel(final Association association) {
    return associationCenterTopLabel(association) + " " + associationCenterBottomLabel(association);
  }

  public String associationCenterTopLabel(final Association association) {
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

  public String associationCenterBottomLabel(final Association association) {
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

  public String associationBeginLabel(final Association association) {
    final StringBuilder sb =
        association.getPrimarySemiAssociation().isRoleDisplayed()
            ? buildSemiAssociationAttributeLabel(
                    association.getPrimarySemiAssociation(), SemiAssociation::getRole)
                .append(' ')
            : new StringBuilder();
    Labels.buildCardinalityLabelPart(association.getPrimarySemiAssociation(), sb);
    return sb.toString();
  }

  public String associationEndLabel(final Association association) {
    final StringBuilder sb =
        association.getSecondarySemiAssociation().isRoleDisplayed()
            ? buildSemiAssociationAttributeLabel(
                    association.getSecondarySemiAssociation(), SemiAssociation::getRole)
                .append(' ')
            : new StringBuilder();
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
