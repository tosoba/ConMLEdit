package org.eclipse.sirius.conml.design.services.types.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Validation;

import conml.types.Attribute;
import conml.types.BaseDataType;
import conml.types.Class;
import conml.types.DataType;
import conml.types.EnumeratedType;
import conml.types.SimpleDataType;

public final class AttributeValidationServices {

  public boolean redefinedAttributeIsOwnedByAncestor(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Attribute.class,
        (final Attribute attribute) -> {
          final Attribute redefined = attribute.getRedefinedAttribute();
          if (redefined == null) return true;
          final Class attributeClass = attribute.getOwnerClass();
          if (attributeClass == null) return true;
          return Validation.anyAncestorOfClassOwnsRedefinedFeature(
              attributeClass, redefined, Class::getAttributes);
        },
        true);
  }

  public boolean attributeTypeCorcesIntoRedefinedAttributeType(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Attribute.class,
        (final Attribute attribute) -> {
          final Attribute redefined = attribute.getRedefinedAttribute();
          if (redefined == null) return true;
          final DataType dataType = attribute.getDatatype();
          final DataType redefinedDataType = redefined.getDatatype();
          if (dataType == null
              || redefinedDataType == null
              || EcoreUtil.equals(dataType, redefinedDataType)) {
            return true;
          } else if (!dataType.getClass().isAssignableFrom(redefinedDataType.getClass())) {
            return false;
          } else {
            if (dataType instanceof SimpleDataType && redefinedDataType instanceof SimpleDataType) {
              final SimpleDataType simpleDataType = (SimpleDataType) dataType;
              final SimpleDataType redefinedSimpleDataType = (SimpleDataType) redefinedDataType;
              final BaseDataType baseDataType = simpleDataType.getBase();
              final BaseDataType redefinedBaseDataType = redefinedSimpleDataType.getBase();
              if (baseDataType == null || redefinedBaseDataType == null) return true;
              else return ConML.canBaseDataTypeCoerceInto(baseDataType, redefinedBaseDataType);
            } else if (dataType instanceof EnumeratedType
                && redefinedDataType instanceof EnumeratedType) {
              final EnumeratedType enumType = (EnumeratedType) dataType;
              final EnumeratedType redefinedEnumType = (EnumeratedType) redefinedDataType;
              EnumeratedType enumTypeIt = enumType.getSuperType();
              while (enumTypeIt != null
                  && !EcoreUtil.equals(enumTypeIt, enumTypeIt.getSuperType())) {
                if (EcoreUtil.equals(enumTypeIt, redefinedEnumType)) return true;
                enumTypeIt = enumTypeIt.getSuperType();
              }
              return false;
            } else {
              return true;
            }
          }
        },
        true);
  }
}
