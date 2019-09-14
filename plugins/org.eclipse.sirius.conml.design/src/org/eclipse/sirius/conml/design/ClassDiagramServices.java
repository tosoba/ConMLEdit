package org.eclipse.sirius.conml.design;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import conml.types.Attribute;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Property;

public class ClassDiagramServices extends AbstractDiagramServices {
	public String attributeLabel(final Feature feature) {
		if (feature == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder(feature.getName());
		if (feature.getRedefines() != null && !Objects.equals(feature.getRedefines().getName(), feature.getName())) {
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

		if (feature instanceof Attribute) {
			Attribute attr = (Attribute) feature;
			if (attr.getIsOfType() != null) {
				if (attr instanceof EnumeratedType) {
					sb.append("enum ");
				}
				sb.append(attr.getIsOfType().getName());
			} else {
				sb.append('?');
			}

			ArrayList<String> markers = new ArrayList<>();
			if (attr.isIsConstant()) {
				markers.add("K");
			}
			if (attr.isIsMultilingual()) {
				markers.add("M");
			}
			if (attr.isIsSubjective()) {
				markers.add("S");
			}
			if (attr.isIsTemporal()) {
				markers.add("T");
			}
			if (!markers.isEmpty()) {
				sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");
			}
		} else if (feature instanceof Property) {
			sb.append('?');
		}

		return sb.toString();
	}
}
