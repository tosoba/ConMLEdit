package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import conml.Model;
import conml.types.Package;

public class ModelServices {

  public Collection<EObject> getOwnedPackageElements(EObject object) {
    if (!(object instanceof Model)) return Arrays.asList();
    final Model model = (Model) object;
    return getOwnedElementsOfType(model, Package.class);
  }

  private Collection<EObject> getOwnedElementsOfType(Model model, Class<?> clazz) {
    return model
        .getElements()
        .stream()
        .filter(element -> clazz.isInstance(element))
        .map(element -> (EObject) element)
        .collect(Collectors.toList());
  }
}
