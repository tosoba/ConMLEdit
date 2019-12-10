package org.eclipse.sirius.conml.design.services.types.validation;

import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Attribute;
import conml.types.Feature;
import conml.types.Property;
import conml.types.SemiAssociation;

public final class FeatureValidationServices {

  public boolean featuresCardinalityIsEquallyOrMoreRestrictiveThanRedefined(final EObject object) {
    return validateFeatureRedefinition(object, this::isFeaturesCardinalityValidForRedefinition);
  }

  public Feature getRedefinedFeatureOf(final Feature feature) {
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

  public boolean featureAndRedefinedHaveValidSortedSemantics(final EObject object) {
    return validateFeatureRedefinition(
        object,
        (feature, redefined) ->
            feature.isSorted() == redefined.isSorted()
                || (feature.isSorted() && !redefined.isSorted()));
  }

  public boolean featureAndRedefinedHaveValidConstantSemantics(final EObject object) {
    return validateFeatureRedefinition(
        object,
        (feature, redefined) ->
            feature.isConstant() == redefined.isConstant()
                || (feature.isConstant() && !redefined.isConstant()));
  }

  public boolean validateFeatureRedefinition(
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

  public boolean isFeaturesCardinalityValidForRedefinition(
      final Feature feature, final Feature redefined) {
    return redefined.getMinimumCardinality() >= feature.getMinimumCardinality()
        && ((redefined.getMaximumCardinality() == null && feature.getMaximumCardinality() == null)
            || (redefined.getMaximumCardinality() == null
                && feature.getMaximumCardinality() != null)
            || (redefined.getMaximumCardinality() != null
                && feature.getMaximumCardinality() != null
                && redefined.getMaximumCardinality() >= feature.getMaximumCardinality()));
  }
}
