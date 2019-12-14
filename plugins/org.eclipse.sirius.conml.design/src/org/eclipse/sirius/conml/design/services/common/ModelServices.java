package org.eclipse.sirius.conml.design.services.common;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.Model;
import conml.types.TypeModel;
import conml.types.TypeModelElement;

public final class ModelServices {

  private static final class InstanceHolder {
    static final ModelServices INSTANCE = new ModelServices();
  }

  public static ModelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public <T extends EObject> Collection<EObject> getOwnedElementsOfType(
      final EObject object, final Class<T> clazz) {
    return getOwnedElementsOfTypeStream(object, clazz).collect(Collectors.toList());
  }

  public <T extends EObject> Stream<T> getOwnedElementsOfTypeStream(
      final EObject object, final Class<T> clazz) {
    if (!(object instanceof Model)) return Stream.empty();
    final Model model = (Model) object;
    return ConML.getStreamOfAllElementsOfTypeFromModel(model, clazz);
  }

  public TypeModel findTypeModelContainer(final TypeModelElement element) {
    return ConML.getAllElementsOfTypeFromSessionStream(element, TypeModel.class)
        .filter(model -> model.getElements().contains(element))
        .findAny()
        .get();
  }

  public String modelName(final Model model) {
    return model.getName();
  }
}
