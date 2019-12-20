package org.eclipse.sirius.conml.design.services.instances;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.services.types.EnumeratedItemServices;
import org.eclipse.sirius.conml.design.util.DateUtils;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.instances.BooleanValue;
import conml.instances.EnumValue;
import conml.instances.NumberValue;
import conml.instances.TextValue;
import conml.instances.TimeValue;
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

  private <V extends Value, C> ValueValidation validateValue(
      final V value,
      final Class<C> contentClass,
      final Function<V, C> contentGetter,
      final Function<C, String> contentsTransformer) {
    final C contents = contentGetter.apply(value);
    if (value.isUnknown()) return ValueValidation.SUCCESS("unknown");
    else if (contents == null) return ValueValidation.SUCCESS("null");
    else {
      if (!contentClass.isInstance(contents))
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
            for (final Value value : valueSet.getValues()) {
              if (!(value instanceof BooleanValue)) return "<Invalid Value DataType>";
              final ValueValidation facetValidation =
                  validateValue(
                      (BooleanValue) value,
                      Boolean.class,
                      BooleanValue::getContent,
                      String::valueOf);
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;

          case NUMBER:
            for (final Value value : valueSet.getValues()) {
              if (!(value instanceof NumberValue)) return "<Invalid Value DataType>";
              final ValueValidation facetValidation =
                  validateValue(
                      (NumberValue) value, Number.class, NumberValue::getContent, String::valueOf);
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TEXT:
            for (final Value value : valueSet.getValues()) {
              if (!(value instanceof TextValue)) return "<Invalid Value DataType>";
              final ValueValidation facetValidation =
                  validateValue(
                      (TextValue) value, String.class, TextValue::getContent, Function.identity());
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case TIME:
            for (final Value value : valueSet.getValues()) {
              if (!(value instanceof TimeValue)) return "<Invalid Value DataType>";
              final ValueValidation facetValidation =
                  validateValue(
                      (TimeValue) value,
                      Date.class,
                      TimeValue::getContent,
                      (date) -> {
                        String formatted = DateUtils.tryFormatYYYYMMDD(date);
                        if (date != null) return formatted;
                        else return "<Invalid Date format>";
                      });
              if (facetValidation.success) contentLabels.add(facetValidation.contentLabel);
              else return facetValidation.errorMsg;
            }
            break;
          case DATA:
            contentLabels.add("...");
            break;
        }
      } else if (dataType instanceof EnumeratedType) {
        for (final Value value : valueSet.getValues()) {
          if (!(value instanceof EnumValue)) return "<Invalid Value DataType>";
          final ValueValidation facetValidation =
              validateValue(
                  (EnumValue) value,
                  EnumeratedItem.class,
                  EnumValue::getContent,
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
