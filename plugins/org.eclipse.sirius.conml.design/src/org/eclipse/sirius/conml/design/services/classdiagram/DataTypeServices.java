package org.eclipse.sirius.conml.design.services.classdiagram;

import org.eclipse.emf.ecore.EObject;
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
    ModelElementServices.getInstance()
        .moveTypeModelElement(object, SimpleDataType.class, ConML.ElementMovementDirection.UP);
  }

  public void moveSimpleDataTypeDown(final EObject object) {
    ModelElementServices.getInstance()
        .moveTypeModelElement(object, SimpleDataType.class, ConML.ElementMovementDirection.DOWN);
  }

  public void moveEnumTypeUp(final EObject object) {
    ModelElementServices.getInstance()
        .moveTypeModelElement(object, EnumeratedType.class, ConML.ElementMovementDirection.UP);
  }

  public void moveEnumTypeDown(final EObject object) {
    ModelElementServices.getInstance()
        .moveTypeModelElement(object, EnumeratedType.class, ConML.ElementMovementDirection.DOWN);
  }
}
