package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ModelServices;

import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.SimpleDataType;

public class TypeModelServices extends ModelServices {
	
  public Collection<EObject> getOwnedPackageElements(EObject object) {
    return getOwnedElementsOfType(object, Package.class);
  }

  public Collection<EObject> getOwnedSimpleDataTypeElements(EObject object) {
    return getOwnedElementsOfType(object, SimpleDataType.class);
  }

  public Collection<EObject> getOwnedEnumeratedTypeElements(EObject object) {
    return getOwnedElementsOfType(object, EnumeratedType.class);
  }

  public Collection<EObject> getOwnedClassElements(EObject object) {
    return getOwnedElementsOfType(object, conml.types.Class.class);
  }
}
