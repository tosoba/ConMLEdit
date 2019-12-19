package org.eclipse.sirius.conml.design.services.instances;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.services.types.EnumeratedItemServices;
import org.eclipse.sirius.conml.design.util.messages.Messages;

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

  private static class ValueValidation {
    final boolean success;
    final String errorMsg;
    final String contentLabel;

    private ValueValidation(
        final boolean success, final String errorMsg, final String transformedContents) {
      this.success = success;
      this.errorMsg = errorMsg;
      this.contentLabel = transformedContents;
    }

    public static ValueValidation SUCCESS(final String transformedContents) {
      return new ValueValidation(true, null, transformedContents);
    }

    public static ValueValidation FAILURE(final String errorMsg) {
      return new ValueValidation(false, errorMsg, null);
    }
  }

  private <T> ValueValidation validateValue(
      final Value<T> value,
      final Class<?> contentsClass,
      final Function<T, String> contentsTransformer) {
    final T contents = value.getContents();
    if (value.isUnknown()) return ValueValidation.SUCCESS("unknown");
    else if (contents == null) return ValueValidation.SUCCESS("null");
    else {
      if (!contentsClass.isInstance(contents))
        return ValueValidation.FAILURE(
            "<Contents of one of the values does not match specified DataType>");
      else return ValueValidation.SUCCESS(contentsTransformer.apply(contents));
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
            for (final Value<?> value : valueSet.getValues()) {
              final ValueValidation facetValidation =
                  validateValue(
                      value,
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
            for (final Value<?> value : valueSet.getValues()) {
              final ValueValidation facetValidation =
                  validateValue(
                      value, Number.class, contents -> String.valueOf(Number.class.cast(contents)));
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TEXT:
            for (final Value<?> value : valueSet.getValues()) {
              final ValueValidation facetValidation =
                  validateValue(value, String.class, String.class::cast);
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TIME:
            // TODO:
            break;
        }

      } else if (dataType instanceof EnumeratedType) {
        for (final Value<?> value : valueSet.getValues()) {
          final ValueValidation facetValidation =
              validateValue(
                  value,
                  EnumeratedItem.class,
                  (contents) -> {
                    switch (valueSet.getEnumeratedItemValueDisplay()) {
                      case FULL_NAME:
                        return EnumeratedItemServices.getInstance()
                            .getFullNameOfEnumeratedItem((EnumeratedItem) contents);
                      case ABSOLUTE:
                        return EnumeratedItemServices.getInstance()
                            .getAbsoluteNameOfEnumeratedItem((EnumeratedItem) contents);
                      case FULLY_QUALIFIED_NAME:
                        return EnumeratedItemServices.getInstance()
                            .getFullyQualifiedNameOfEnumeratedItem((EnumeratedItem) contents);
                    }
                    throw new IllegalStateException();
                  });
          if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
          else return facetValidation.errorMsg;
        }
      }
      sb.append(
          contentLabels.stream().limit(CONTENT_LABELS_LIMIT).collect(Collectors.joining("; ")));
      if (contentLabels.size() > CONTENT_LABELS_LIMIT) sb.append(";...");
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

  public Integer getValueSetDataTypeValue(final ValueSet valueSet) {
    if (valueSet.getInstancedAttribute() == null) return null;
    final DataType dataType = valueSet.getInstancedAttribute().getDatatype();
    if (dataType == null) return null;
    if (dataType instanceof SimpleDataType) return ((SimpleDataType) dataType).getBase().getValue();
    else if (dataType instanceof EnumeratedType) return 5;
    else return null;
  }
}
