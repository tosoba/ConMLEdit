package org.eclipse.sirius.conml.design.services.types.label;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class SemiAssociationLabelServices {

  private static final class InstanceHolder {
    static final SemiAssociationLabelServices INSTANCE = new SemiAssociationLabelServices();
  }

  public static SemiAssociationLabelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public StringBuilder buildSemiAssociationAttributeLabel(
      final SemiAssociation semiAssociation,
      final Function<SemiAssociation, String> attributeNameGetter,
      final StringBuilder sb) {
    if (semiAssociation == null) return sb;

    if (semiAssociation.getRedefinedSemiAssociation() != null
        && semiAssociation.getRedefinedSemiAssociation() instanceof SemiAssociation) {
      final SemiAssociation redefinedSemiAssociation =
          semiAssociation.getRedefinedSemiAssociation();
      if (!Objects.equals(
          attributeNameGetter.apply(redefinedSemiAssociation),
          attributeNameGetter.apply(semiAssociation))) {
        sb.append(attributeNameGetter.apply(semiAssociation))
            .append('[')
            .append(attributeNameGetter.apply(redefinedSemiAssociation))
            .append("] ");
      } else {
        sb.append('[').append(attributeNameGetter.apply(semiAssociation)).append("]");
      }
    } else {
      sb.append(attributeNameGetter.apply(semiAssociation));
    }
    return sb;
  }

  public String compactAssociationLabel(final SemiAssociation primary) {
    if (primary == null) return "";
    final Association association = primary.getPrimaryInAssociation();
    if (association == null) return "";

    final StringBuilder sb = new StringBuilder();
    buildSemiAssociationAttributeLabel(primary, SemiAssociation::getRole, sb).append(": ");
    Labels.buildCardinalityLabelPart(primary, sb).append(" ");

    if (primary.getMaximumCardinality() == null) {
      if (primary.isWhole()) sb.append(" sha ");
      else sb.append(" ref ");
    } else {
      sb.append(" con ");
    }

    sb.append(primary.getReferredClass().getName());

    appendMarkersString(sb, primary);

    return sb.toString();
  }

  public void appendMarkersString(final StringBuilder sb, final SemiAssociation semi) {
    final ArrayList<String> markers = new ArrayList<>();
    if (semi.isConstant()) markers.add("K");
    if (semi.isSubjective()) markers.add("S");
    if (semi.isTemporal()) markers.add("T");
    if (!markers.isEmpty())
      sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");
  }
}
