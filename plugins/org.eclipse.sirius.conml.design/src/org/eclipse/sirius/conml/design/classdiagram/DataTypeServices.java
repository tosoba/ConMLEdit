package org.eclipse.sirius.conml.design.classdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;

import conml.types.DataType;
import conml.types.SimpleDataType;

public class DataTypeServices extends ModelElementServices {

  public String dataTypeLabel(EObject object) {
    if (!(object instanceof DataType)) return "";
    final DataType dataType = (DataType) object;
    return dataType.getName();
  }

  public void moveSimpleDataTypeUp(EObject object) {
    moveElement(object, SimpleDataType.class, ConML.ElementMovementDirection.UP);
  }

  public void moveSimpleDataTypeDown(EObject object) {
    moveElement(object, SimpleDataType.class, ConML.ElementMovementDirection.DOWN);
  }
}
