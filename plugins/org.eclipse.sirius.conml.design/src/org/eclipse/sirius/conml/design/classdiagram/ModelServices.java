package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import conml.Model;
import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.SimpleDataType;

public class ModelServices {

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

  private Collection<EObject> getOwnedElementsOfType(EObject object, Class<?> clazz) {
    if (!(object instanceof Model)) return Arrays.asList();
    final Model model = (Model) object;
    return model
        .getElements()
        .stream()
        .filter(element -> clazz.isInstance(element))
        .map(element -> (EObject) element)
        .collect(Collectors.toList());
  }
}
