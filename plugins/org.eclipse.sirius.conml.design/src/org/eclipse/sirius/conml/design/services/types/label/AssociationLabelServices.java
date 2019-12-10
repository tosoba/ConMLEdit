package org.eclipse.sirius.conml.design.services.types.label;

import java.util.function.Function;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class AssociationLabelServices {

  public String associationCenterLabel(final Association association) {
    return associationCenterTopLabel(association)
        + "\n"
        + associationCenterBottomLabel(association);
  }

  public String associationPropertiesLabel(final Association association) {
    return associationCenterTopLabel(association) + " " + associationCenterBottomLabel(association);
  }

  public String associationCenterTopLabel(final Association association) {
    return buildSemiAssociationAttributeLabel(
            association.getPrimarySemiAssociation(), SemiAssociation::getName)
        .toString();
  }

  public String associationCenterBottomLabel(final Association association) {
    return buildSemiAssociationAttributeLabel(
            association.getSecondarySemiAssociation(), SemiAssociation::getName)
        .toString();
  }

  public String associationBeginLabel(final Association association) {
    final StringBuilder sb =
        buildSemiAssociationAttributeLabel(
                association.getPrimarySemiAssociation(), SemiAssociation::getRole)
            .append(' ');
    Labels.buildCardinalityLabelPart(association.getPrimarySemiAssociation(), sb);
    return sb.toString();
  }

  public String associationEndLabel(final Association association) {
    final StringBuilder sb =
        buildSemiAssociationAttributeLabel(
                association.getSecondarySemiAssociation(), SemiAssociation::getRole)
            .append(' ');
    Labels.buildCardinalityLabelPart(association.getSecondarySemiAssociation(), sb);
    return sb.toString();
  }

  private StringBuilder buildSemiAssociationAttributeLabel(
      final SemiAssociation semiAssociation,
      final Function<SemiAssociation, String> attributeNameGetter) {
    return SemiAssociationLabelServices.getInstance().buildSemiAssociationAttributeLabel(
        semiAssociation, attributeNameGetter, new StringBuilder());
  }
}
