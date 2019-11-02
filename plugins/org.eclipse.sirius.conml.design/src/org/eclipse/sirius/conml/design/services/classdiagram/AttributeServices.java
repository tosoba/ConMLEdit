package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import com.google.common.base.Predicates;

import conml.types.Attribute;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;

public class AttributeServices implements FeatureServices {

  public String attributeLabel(final Feature feature) {
    if (feature == null) return "";

    final StringBuilder sb = new StringBuilder(feature.getName());
    if (feature instanceof Property) {
      final Property property = (Property) feature;
      if (property.getRedefinedProperty() != null
          && !Objects.equals(property.getRedefinedProperty().getName(), feature.getName())) {
        sb.append(" [").append(property.getRedefinedProperty().getName()).append(']');
      }
    } else if (feature instanceof Attribute) {
      final Attribute attribute = (Attribute) feature;
      if (attribute.getRedefinedAttribute() != null
          && !Objects.equals(attribute.getRedefinedAttribute().getName(), feature.getName())) {
        sb.append(" [").append(attribute.getRedefinedAttribute().getName()).append(']');
      }
    } else if (feature instanceof SemiAssociation) {
      final SemiAssociation semi = (SemiAssociation) feature;
      if (semi.getRedefinedSemiassociation() != null
          && !Objects.equals(semi.getRedefinedSemiassociation().getName(), feature.getName())) {
        sb.append(" [").append(semi.getRedefinedSemiassociation().getName()).append(']');
      }
    }

    sb.append(": ");

    buildCardinalityLabelPart(feature, sb).append(" ");

    final ArrayList<String> markers = new ArrayList<>();
    if (feature.isConstant()) markers.add("K");
    if (feature.isSubjective()) markers.add("S");
    if (feature.isTemporal()) markers.add("T");

    if (feature instanceof Attribute) {
      final Attribute attr = (Attribute) feature;
      if (attr.getDatatype() != null) {
        if (attr instanceof EnumeratedType) sb.append("enum ");
        sb.append(attr.getDatatype().getName());
      } else {
        sb.append('?');
      }

      if (attr.isMultilingual()) markers.add("M");
    } else if (feature instanceof Property) {
      sb.append('?');
    }

    if (!markers.isEmpty())
      sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");

    return sb.toString();
  }

  public boolean redefinedAttributeIsValid(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Attribute.class,
        (final Attribute attribute) -> {
          final Attribute redefined = attribute.getRedefinedAttribute();
          if (redefined == null) return true;
          final Class attributeClass = attribute.getOwnerClass();
          if (attributeClass == null) return true;
          return anyAncestorOfClassContains(attributeClass, redefined);
        },
        true);
  }

  private boolean anyAncestorOfClassContains(Class clazz, Attribute attribute) {
    if (clazz.getGeneralizations().isEmpty()) {
      return false;
    } else if (nonNullGeneralizedClassesStream(clazz)
        .map(Class::getAttributes)
        .flatMap(Collection::stream)
        .anyMatch(otherAttribute -> EcoreUtil.equals(attribute, otherAttribute))) {
      return true;
    } else {
      return nonNullGeneralizedClassesStream(clazz)
          .map(generalizedClass -> anyAncestorOfClassContains(generalizedClass, attribute))
          .anyMatch(contains -> contains);
    }
  }

  private Stream<Class> nonNullGeneralizedClassesStream(Class clazz) {
    return clazz
        .getGeneralizations()
        .stream()
        .map(Generalization::getGeneralizedClass)
        .filter(Objects::nonNull);
  }
}
