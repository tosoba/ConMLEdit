package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.Model;
import conml.ModelElement;

public final class ModelElementServices {

  private static final class InstanceHolder {
    static final ModelElementServices INSTANCE = new ModelElementServices();
  }

  public static ModelElementServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public void removeElement(final EObject object) {
    EcoreUtil.delete(object);
  }

  public <T extends EObject> void moveElement(
      final EObject object,
      final Class<T> objectClass,
      final ConML.ElementMovementDirection direction) {
    ConML.castElementAndContainer(object, objectClass, Model.class)
        .ifBothCastsSuccessful(
            (objectToMove, model) ->
                moveElements(Arrays.asList(objectToMove), model, objectClass, direction));
  }

  public <T extends EObject> void moveElements(
      final List<T> elements,
      final Model model,
      final Class<T> elementClass,
      final ConML.ElementMovementDirection direction) {
    if (elements.isEmpty()) return;

    int indexToSwapWith = -1;

    switch (direction) {
      case UP:
        {
          final int firstElementIndex = model.getElements().indexOf(elements.get(0));
          if (firstElementIndex == -1) return;
          for (int i = firstElementIndex - 1; i >= 0; i--) {
            final ModelElement other = model.getElements().get(i);
            if (elementClass.isInstance(other)) {
              indexToSwapWith = i;
              break;
            }
          }
          break;
        }
      case DOWN:
        {
          final int lastElementIndex =
              model.getElements().indexOf(elements.get(elements.size() - 1));
          if (lastElementIndex == -1) return;
          for (int i = lastElementIndex + 1; i < model.getElements().size(); i++) {
            final ModelElement other = model.getElements().get(i);
            if (elementClass.isInstance(other)) {
              indexToSwapWith = i;
              break;
            }
          }
          break;
        }
    }

    if (indexToSwapWith != -1) {
      for (int i = elements.size() - 1; i >= 0; i--) {
        model.getElements().move(indexToSwapWith, model.getElements().indexOf(elements.get(i)));
      }
    }
  }

  public String defaultName(final ModelElement element) {
    final String name = element.getClass().getSimpleName().replace("Impl", "");

    final EObject container = element.eContainer();
    if (container != null) {
      final Collection<?> elementsOfSameType =
          ConML.getAllElementsOfTypeFrom(container, element.getClass());
      return name + elementsOfSameType.size();
    }

    final EStructuralFeature containingFeature = element.eContainingFeature();
    if (containingFeature != null) {
      final Collection<?> elementsOfSameType =
          ConML.getAllElementsOfTypeFrom(containingFeature, element.getClass());
      return name + elementsOfSameType.size();
    }

    return name;
  }

  public String defaultDefinition(final ModelElement element) {
    return "";
  }
}
