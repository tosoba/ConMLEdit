package org.eclipse.sirius.conml.design.services.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.Domain;
import conml.types.BaseDataType;
import conml.types.Class;
import conml.types.DataType;
import conml.types.EnumeratedType;
import conml.types.SimpleDataType;

public final class DataTypeServices {

  public String dataTypeLabel(final EObject object) {
    if (!(object instanceof DataType)) return "";
    final DataType dataType = (DataType) object;
    return dataType.getName();
  }

  public void moveEnumTypeUp(final EObject object) {
    ConML.castAndRun(
        object,
        EnumeratedType.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    clazz, EnumeratedType.class, ConML.ElementMovementDirection.UP));
  }

  public void moveEnumTypeDown(final EObject object) {
    ConML.castAndRun(
        object,
        EnumeratedType.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    clazz, EnumeratedType.class, ConML.ElementMovementDirection.DOWN));
  }

  public SimpleDataType booleanSimpleDataType(final Class clazz) {
    return findSimpleDataType(clazz, BaseDataType.BOOLEAN);
  }

  public SimpleDataType numberSimpleDataType(final Class clazz) {
    return findSimpleDataType(clazz, BaseDataType.NUMBER);
  }

  public SimpleDataType textSimpleDataType(final Class clazz) {
    return findSimpleDataType(clazz, BaseDataType.TEXT);
  }

  public SimpleDataType timeSimpleDataType(final Class clazz) {
    return findSimpleDataType(clazz, BaseDataType.TIME);
  }

  public SimpleDataType rawDataSimpleDataType(final Class clazz) {
    return findSimpleDataType(clazz, BaseDataType.DATA);
  }

  public SimpleDataType findSimpleDataType(final Class clazz, final BaseDataType base) {
    final Domain domain = (Domain) clazz.eContainer();
    return domain
        .getParts()
        .stream()
        .filter(part -> part instanceof SimpleDataType && base == ((SimpleDataType) part).getBase())
        .findFirst()
        .map(SimpleDataType.class::cast)
        .orElse(null);
  }
}
