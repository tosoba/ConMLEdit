package org.eclipse.sirius.conml.design.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import conml.Model;

public class ModelServices {

  protected Collection<EObject> getOwnedElementsOfType(EObject object, Class<?> clazz) {
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
