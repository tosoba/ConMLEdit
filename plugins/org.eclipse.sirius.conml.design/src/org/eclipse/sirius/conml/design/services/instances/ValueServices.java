package org.eclipse.sirius.conml.design.services.instances;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.services.types.EnumeratedTypeServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.instances.BooleanValue;
import conml.instances.DataValue;
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

public class ValueServices {

  public boolean isBooleanValue(final EObject object) {
    return hasSimpleDataType(object, BaseDataType.BOOLEAN);
  }

  public boolean isTextValue(final EObject object) {
    return hasSimpleDataType(object, BaseDataType.TEXT);
  }

  public boolean isNumberValue(final EObject object) {
    return hasSimpleDataType(object, BaseDataType.NUMBER);
  }

  public boolean isTimeValue(final EObject object) {
    return hasSimpleDataType(object, BaseDataType.TIME);
  }

  public Boolean booleanValueContent(final EObject object) {
    return ConML.castAndRunOrReturn(object, BooleanValue.class, BooleanValue::getContent, false);
  }

  public String textValueContent(final EObject object) {
    return ConML.castAndRunOrReturn(object, TextValue.class, TextValue::getContent, null);
  }

  public EnumeratedItem enumValueContent(final EObject object) {
    return ConML.castAndRunOrReturn(object, EnumValue.class, EnumValue::getContent, null);
  }

  public List<EObject> enumValueCandidates(final Value value) {
    if (value.getOwnerValueSet() == null
        || value.getOwnerValueSet().getInstancedAttribute() == null
        || !(value.getOwnerValueSet().getInstancedAttribute().getDatatype()
            instanceof EnumeratedType)) {
      return new ArrayList<>();
    }
    return EnumeratedTypeServices.getInstance()
        .superEnumItemChildren(
            (EnumeratedType) value.getOwnerValueSet().getInstancedAttribute().getDatatype());
  }

  public void setBooleanValueContent(final BooleanValue value, final Boolean content) {
    value.setContent(content);
  }

  public void setTextValueContent(final TextValue value, final String content) {
    value.setContent(content);
  }

  public void setEnumValueContent(final EnumValue value, final EnumeratedItem enumItem) {
    value.setContent(enumItem);
  }

  public void nullifyValueContent(final Value value) {
    if (value instanceof BooleanValue) ((BooleanValue) value).setContent(null);
    else if (value instanceof TextValue) ((TextValue) value).setContent(null);
    else if (value instanceof NumberValue) ((NumberValue) value).setContent(null);
    else if (value instanceof TimeValue) ((TimeValue) value).setContent(null);
    else if (value instanceof DataValue) ((DataValue) value).setContent(null);
    else if (value instanceof EnumValue) ((EnumValue) value).setContent(null);
  }

  private boolean hasSimpleDataType(final EObject object, final BaseDataType base) {
    return ConML.castAndRunOrReturn(
        object,
        Value.class,
        value -> {
          final ValueSet valueSet = value.getOwnerValueSet();
          if (valueSet == null) return false;

          final Attribute attribute = valueSet.getInstancedAttribute();
          if (attribute == null) return false;

          final DataType dataType = attribute.getDatatype();
          if (dataType == null || !(dataType instanceof SimpleDataType)) return false;

          final SimpleDataType simpleDataType = (SimpleDataType) dataType;
          final BaseDataType baseDataType = simpleDataType.getBase();
          return baseDataType != null && baseDataType == base;
        },
        false);
  }

  public boolean isEnumValue(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Value.class,
        value -> {
          final ValueSet valueSet = value.getOwnerValueSet();
          if (valueSet == null) return false;

          final Attribute attribute = valueSet.getInstancedAttribute();
          if (attribute == null) return false;

          return attribute.getDatatype() instanceof EnumeratedType;
        },
        false);
  }
}
