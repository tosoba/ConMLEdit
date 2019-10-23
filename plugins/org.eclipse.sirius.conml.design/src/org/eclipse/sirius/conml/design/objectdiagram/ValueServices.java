package org.eclipse.sirius.conml.design.objectdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;

import conml.instances.Value;
import conml.instances.ValueSet;
import conml.types.Attribute;
import conml.types.BaseDataType;
import conml.types.DataType;
import conml.types.SimpleDataType;

public class ValueServices {

  public boolean isBooleanValue(EObject object) {
    return hasSimpleDataType(object, BaseDataType.BOOLEAN);
  }

  public boolean booleanValueContent(EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Value.class,
        value -> {
          final Object contents = value.getContents();
          // TODO: theoretically there's no need to check if contents' type is correct since its
          // value is set via checkbox...
          return contents == null ? false : (boolean) contents;
        },
        false);
  }

  public void setBooleanValueContent(Value value, Boolean content) {
    value.setContents(content);
  }

  private boolean hasSimpleDataType(EObject object, BaseDataType base) {
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
}
