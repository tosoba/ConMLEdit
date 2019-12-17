package org.eclipse.sirius.conml.design.services.instances;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.services.types.EnumeratedItemServices;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.instances.Facet;
import conml.instances.Value;
import conml.instances.ValueSet;
import conml.types.Attribute;
import conml.types.BaseDataType;
import conml.types.DataType;
import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
import conml.types.SimpleDataType;

public class ValueSetServices {

  private static final int CONTENT_LABELS_LIMIT = 3;

  private static class FacetValidation {
    final boolean success;
    final String errorMsg;
    final String contentLabel;

    private FacetValidation(
        final boolean success, final String errorMsg, final String transformedContents) {
      this.success = success;
      this.errorMsg = errorMsg;
      this.contentLabel = transformedContents;
    }

    public static FacetValidation SUCCESS(final String transformedContents) {
      return new FacetValidation(true, null, transformedContents);
    }

    public static FacetValidation FAILURE(final String errorMsg) {
      return new FacetValidation(false, errorMsg, null);
    }
  }

  private FacetValidation validateFacet(
      final Facet facet,
      final Class<?> contentsClass,
      final Function<Object, String> contentsTransformer) {
    if (!(facet instanceof Value))
      return FacetValidation.FAILURE("<One of the facets in not of type Value>");
    final Value value = (Value) facet;
    Object contents = value.getContents();
    if (contents instanceof String && !String.class.equals(contentsClass)) {
      if (Number.class.equals(contentsClass)) {
        try {
          contents = Double.parseDouble((String) contents);
          value.setContents(contents);
        } catch (NumberFormatException ex) {
        }
      } else if (Boolean.class.equals(contentsClass)) {
        contents = Boolean.parseBoolean((String) contents);
        value.setContents(contents);
      }
    }

    if (value.isUnknown()) return FacetValidation.SUCCESS("unknown");
    else if (contents == null) return FacetValidation.SUCCESS("null");
    else {
      if (!contentsClass.isInstance(contents))
        return FacetValidation.FAILURE(
            "<Contents of one of the values does not match specified DataType>");
      else return FacetValidation.SUCCESS(contentsTransformer.apply(contents));
    }
  }

  public String valueSetLabel(final ValueSet valueSet) {
    if (valueSet == null) return "";

    final Attribute attribute = valueSet.getInstancedAttribute();
    if (attribute == null) return "<No instanced attribute specified>";

    final DataType dataType = attribute.getDatatype();
    if (dataType == null) return "<No attribute dataType specified>";

    final StringBuilder sb = new StringBuilder(attribute.getName()).append(" = ");

    if (valueSet.getValues() == null || valueSet.getValues().isEmpty()) {
      sb.append("null");
    } else {
      final ArrayList<String> contentLabels = new ArrayList<>();

      if (dataType instanceof SimpleDataType) {
        final SimpleDataType simpleDataType = (SimpleDataType) dataType;
        final BaseDataType baseDataType = simpleDataType.getBase();
        switch (baseDataType) {
          case BOOLEAN:
            for (final Facet facet : valueSet.getValues()) {
              final FacetValidation facetValidation =
                  validateFacet(
                      facet,
                      Boolean.class,
                      contents -> String.valueOf(Boolean.class.cast(contents)));
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case DATA:
            contentLabels.add("...");
            break;
          case NUMBER:
            for (final Facet facet : valueSet.getValues()) {
              final FacetValidation facetValidation =
                  validateFacet(
                      facet, Number.class, contents -> String.valueOf(Number.class.cast(contents)));
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TEXT:
            for (final Facet facet : valueSet.getValues()) {
              final FacetValidation facetValidation =
                  validateFacet(facet, String.class, String.class::cast);
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TIME:
            // TODO:
            break;
        }

        sb.append(
            contentLabels.stream().limit(CONTENT_LABELS_LIMIT).collect(Collectors.joining("; ")));
        if (contentLabels.size() > CONTENT_LABELS_LIMIT) sb.append(";...");
      } else if (dataType instanceof EnumeratedType) {
        for (final Facet facet : valueSet.getValues()) {
          final FacetValidation facetValidation =
              validateFacet(
                  facet,
                  EnumeratedItem.class,
                  (contents) ->
                      EnumeratedItemServices.getInstance()
                          .getFullNameOfEnumeratedItem((EnumeratedItem) contents));
          if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
          else return facetValidation.errorMsg;
        }
      }
    }

    return sb.toString();
  }

  public void showValueSetDropErrorDialog(
      final conml.instances.Object oldContainer, final conml.instances.Object newContainer) {
    Dialogs.showError(
        Messages.getString("Message.ValueSetCannotBeMoved"),
        Messages.getString(
            "Error.ObjectsInstanceDifferentClasses",
            oldContainer.getIdentifier(),
            newContainer.getIdentifier()));
  }
}
