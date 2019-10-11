package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import conml.types.Attribute;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Property;

public class AttributeServices {

  public String attributeLabel(Feature feature) {
    if (feature == null) {
      return "";
    }

    final StringBuilder sb = new StringBuilder(feature.getName());
    if (feature.getRedefines() != null
        && !Objects.equals(feature.getRedefines().getName(), feature.getName())) {
      sb.append(" [").append(feature.getRedefines().getName()).append(']');
    }
    sb.append(": ");

    sb.append(feature.getMinimumCardinality());
    if (!Objects.equals(feature.getMinimumCardinality(), feature.getMaximumCardinality())) {
      sb.append("..");
      if (feature.getMaximumCardinality() != null) {
        sb.append(feature.getMaximumCardinality());
      } else {
        sb.append("*");
      }
    }

    sb.append(" ");

    ArrayList<String> markers = new ArrayList<>();
    if (feature.isConstant()) {
      markers.add("K");
    }
    if (feature.isSubjective()) {
      markers.add("S");
    }
    if (feature.isTemporal()) {
      markers.add("T");
    }

    if (feature instanceof Attribute) {
      final Attribute attr = (Attribute) feature;
      if (attr.getDatatype() != null) {
        if (attr instanceof EnumeratedType) {
          sb.append("enum ");
        }
        sb.append(attr.getDatatype().getName());
      } else {
        sb.append('?');
      }

      if (attr.isMultilingual()) {
        markers.add("M");
      }
    } else if (feature instanceof Property) {
      sb.append('?');
    }

    if (!markers.isEmpty()) {
      sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");
    }

    return sb.toString();
  }
}
