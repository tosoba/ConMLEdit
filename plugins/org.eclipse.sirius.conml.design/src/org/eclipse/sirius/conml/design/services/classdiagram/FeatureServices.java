package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Attribute;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;

public interface FeatureServices {

  default StringBuilder buildCardinalityLabelPart(final Feature feature, final StringBuilder sb) {
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

  default Stream<Class> nonNullGeneralizedClassesStream(final Class clazz) {
    return clazz
        .getGeneralizations()
        .stream()
        .map(Generalization::getGeneralizedClass)
        .filter(Objects::nonNull);
  }

  default <F extends Feature> boolean anyAncestorOfClassOwnsRedefinedFeature(
      final Class clazz, final F feature, final Function<Class, EList<F>> ownedFeaturesGetter) {
    if (clazz.getGeneralizations().isEmpty()) {
      return false;
    } else if (nonNullGeneralizedClassesStream(clazz)
        .map(ownedFeaturesGetter)
        .flatMap(Collection::stream)
        .anyMatch(otherAttribute -> EcoreUtil.equals(feature, otherAttribute))) {
      return true;
    } else {
      return nonNullGeneralizedClassesStream(clazz)
          .map(
              generalizedClass ->
                  anyAncestorOfClassOwnsRedefinedFeature(
                      generalizedClass, feature, ownedFeaturesGetter))
          .anyMatch(contains -> contains);
    }
  }

  default boolean featuresCardinalityIsEquallyOrMoreRestrictiveThanRedefined(final EObject object) {
    return validateFeatureRedefinition(object, this::isFeaturesCardinalityValidForRedefinition);
  }

  default Feature getRedefinedFeatureOf(final Feature feature) {
    if (feature instanceof Attribute) {
      final Attribute attribute = (Attribute) feature;
      return attribute.getRedefinedAttribute();
    } else if (feature instanceof Property) {
      final Property property = (Property) feature;
      return property.getRedefinedProperty();
    } else if (feature instanceof SemiAssociation) {
      final SemiAssociation semi = (SemiAssociation) feature;
      return semi.getRedefinedSemiAssociation();
    } else return null;
  }

  default boolean featureAndRedefinedHaveValidSortedSemantics(final EObject object) {
    return validateFeatureRedefinition(
        object,
        (feature, redefined) ->
            feature.isSorted() == redefined.isSorted()
                || (feature.isSorted() && !redefined.isSorted()));
  }

  default boolean featureAndRedefinedHaveValidConstantSemantics(final EObject object) {
    return validateFeatureRedefinition(
        object,
        (feature, redefined) ->
            feature.isConstant() == redefined.isConstant()
                || (feature.isConstant() && !redefined.isConstant()));
  }

  default boolean validateFeatureRedefinition(
      final EObject object, final BiFunction<Feature, Feature, Boolean> validation) {
    return ConML.castAndRunOrReturn(
        object,
        Feature.class,
        (final Feature feature) -> {
          final Feature redefined = getRedefinedFeatureOf(feature);
          if (redefined == null) return true;
          return validation.apply(feature, redefined);
        },
        true);
  }

  default boolean isFeaturesCardinalityValidForRedefinition(
      final Feature feature, final Feature redefined) {
    return redefined.getMinimumCardinality() >= feature.getMinimumCardinality()
        && ((redefined.getMaximumCardinality() == null && feature.getMaximumCardinality() == null)
            || (redefined.getMaximumCardinality() == null
                && feature.getMaximumCardinality() != null)
            || (redefined.getMaximumCardinality() >= feature.getMaximumCardinality()));
  }

  default String featureLabel(final Feature feature) {
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
      if (semi.getRedefinedSemiAssociation() != null
          && !Objects.equals(semi.getRedefinedSemiAssociation().getName(), feature.getName())) {
        sb.append(" [").append(semi.getRedefinedSemiAssociation().getName()).append(']');
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
}
