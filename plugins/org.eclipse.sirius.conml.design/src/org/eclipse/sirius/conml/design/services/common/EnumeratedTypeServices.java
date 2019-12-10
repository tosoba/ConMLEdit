package org.eclipse.sirius.conml.design.services.common;

import conml.types.EnumeratedType;

public final class EnumeratedTypeServices {

  public boolean doesNotHaveSuperType(final EnumeratedType enumType) {
    return enumType.getSuperType() == null;
  }

  public void addSubType(final EnumeratedType superType, final EnumeratedType subType) {
    superType.getSubTypes().add(subType);
  }

  public void setEnumTypeContainerPackage(
      final EnumeratedType enumType, final conml.types.Package container) {
    enumType.setPackage(container);
  }
}
