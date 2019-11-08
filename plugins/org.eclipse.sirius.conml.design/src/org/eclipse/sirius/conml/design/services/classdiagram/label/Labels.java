package org.eclipse.sirius.conml.design.services.classdiagram.label;

import java.util.Objects;

import conml.types.Feature;

public final class Labels {
	
  private Labels() {}

  public static StringBuilder buildCardinalityLabelPart(
      final Feature feature, final StringBuilder sb) {
    if (feature == null) return sb;
    sb.append(feature.getMinimumCardinality());
    if (!Objects.equals(feature.getMinimumCardinality(), feature.getMaximumCardinality())) {
      sb.append("..");
      if (feature.getMaximumCardinality() != null) {
        sb.append(feature.getMaximumCardinality());
      } else {
        sb.append("*");
      }
    }
    return sb;
  }
}
