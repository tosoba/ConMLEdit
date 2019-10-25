package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ModelServices;

import conml.types.Association;
import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.Class;
import conml.types.SimpleDataType;

public class TypeModelServices extends ModelServices {

  public Collection<EObject> getOwnedPackageElements(final EObject object) {
    return getOwnedElementsOfType(object, Package.class);
  }

  public Collection<EObject> getOwnedAssociationElements(final EObject object) {
    return getOwnedElementsOfType(object, Association.class);
  }

  public Collection<EObject> getOwnedSimpleDataTypeElements(final EObject object) {
    return getOwnedElementsOfType(object, SimpleDataType.class);
  }

  public Collection<EObject> getOwnedEnumeratedTypeElements(final EObject object) {
    return getOwnedElementsOfType(object, EnumeratedType.class);
  }

  public Collection<EObject> getOwnedClassElements(final EObject object) {
    return getOwnedElementsOfType(object, Class.class);
  }
}
