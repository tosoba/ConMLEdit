package org.eclipse.sirius.conml.design.objectdiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import conml.instances.Facet;
import conml.instances.Value;
import conml.instances.ValueSet;
import conml.types.Attribute;
import conml.types.BaseDataType;
import conml.types.DataType;
import conml.types.EnumeratedType;
import conml.types.SimpleDataType;

public class ValueSetServices {

  private static final int CONTENT_LABELS_LIMIT = 3;

  private static class FacetValidation {
    final boolean success;
    final String errorMsg;
    final String contentLabel;

    private FacetValidation(boolean success, String errorMsg, String transformedContents) {
      this.success = success;
      this.errorMsg = errorMsg;
      this.contentLabel = transformedContents;
    }

    public static FacetValidation SUCCESS(String transformedContents) {
      return new FacetValidation(true, null, transformedContents);
    }

    public static FacetValidation FAILURE(String errorMsg) {
      return new FacetValidation(false, errorMsg, null);
    }
  }

  private FacetValidation validateFacet(
      Facet facet, List<Class<?>> contentsClasses, Function<Object, String> contentsTransformer) {
    if (!(facet instanceof Value))
      return FacetValidation.FAILURE("<One of the facets in not of type Value>");
    final Value value = (Value) facet;
    final Object contents = value.getContents();
    if (contents == null) return FacetValidation.SUCCESS("null");
    else {
      if (contentsClasses
          .stream()
          .map(clazz -> clazz.isInstance(contents))
          .allMatch(result -> !result))
        return FacetValidation.FAILURE(
            "<Contents of one of the values does not match specified DataType>");
      else return FacetValidation.SUCCESS(contentsTransformer.apply(contents));
    }
  }

  public String valueSetLabel(ValueSet valueSet) {
    if (valueSet == null) return "";

    final Attribute attribute = valueSet.getInstancedAttribute();
    // TODO: think what to show here if instanced attribute is not set
    if (attribute == null) return "<No instanced attribute specified>";

    final DataType dataType = attribute.getDatatype();
    if (dataType == null) return "<No attribute dataType specified>";

    final StringBuilder sb = new StringBuilder(attribute.getName()).append(" = ");

    if (valueSet.getFacets() == null || valueSet.getFacets().isEmpty()) {
      sb.append("null");
    } else {
      final ArrayList<String> contentLabels = new ArrayList<>();

      if (dataType instanceof SimpleDataType) {
        final SimpleDataType simpleDataType = (SimpleDataType) dataType;
        final BaseDataType baseDataType = simpleDataType.getBase();
        switch (baseDataType) {
          case BOOLEAN:
            for (final Facet facet : valueSet.getFacets()) {
              final FacetValidation facetValidation =
                  validateFacet(
                      facet,
                      Arrays.asList(Boolean.class, boolean.class),
                      contents -> String.valueOf(Boolean.class.cast(contents)));
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case DATA:
            contentLabels.add("...");
            break;
          case NUMBER:
            for (final Facet facet : valueSet.getFacets()) {
              final FacetValidation facetValidation =
                  validateFacet(
                      facet,
                      Arrays.asList(Number.class),
                      contents -> String.valueOf(Number.class.cast(contents)));
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TEXT:
            for (final Facet facet : valueSet.getFacets()) {
              final FacetValidation facetValidation =
                  validateFacet(
                      facet, Arrays.asList(String.class), contents -> String.class.cast(contents));
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TIME:
            // TODO:
            break;
        }
        // TODO: think about what to do when there is a lot of values... CONTENT_LABELS_LIMIT is a
        // temporary solution
        sb.append(
            contentLabels.stream().limit(CONTENT_LABELS_LIMIT).collect(Collectors.joining("; ")));
        if (contentLabels.size() > CONTENT_LABELS_LIMIT) sb.append(";...");

      } else if (dataType instanceof EnumeratedType) {
        final EnumeratedType enumType = (EnumeratedType) dataType;
        // TODO: depending on the situation (p. 52)?
        // absolute name: subItemOf/Item
        // full name: enumTypeName.subItemOf/Item
        // fully qualified name: packageName.enumTypeName.subItemOf/Item

      }
    }

    return sb.toString();
  }
}
