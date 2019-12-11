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

  public void moveSimpleDataTypeUp(final EObject object) {
    ConML.castAndRun(
        object,
        SimpleDataType.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    clazz, SimpleDataType.class, ConML.ElementMovementDirection.UP));
  }

  public void moveSimpleDataTypeDown(final EObject object) {
    ConML.castAndRun(
        object,
        SimpleDataType.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    clazz, SimpleDataType.class, ConML.ElementMovementDirection.DOWN));
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
