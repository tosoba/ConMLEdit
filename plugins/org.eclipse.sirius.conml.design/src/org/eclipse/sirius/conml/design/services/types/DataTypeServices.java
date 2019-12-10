package org.eclipse.sirius.conml.design.services.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;

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
}
