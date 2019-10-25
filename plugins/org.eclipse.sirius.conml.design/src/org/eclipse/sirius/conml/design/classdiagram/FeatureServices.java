package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Objects;

import conml.types.Feature;

public interface FeatureServices {

  default StringBuilder buildCardinalityLabelPart(Feature feature, StringBuilder sb) {
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
