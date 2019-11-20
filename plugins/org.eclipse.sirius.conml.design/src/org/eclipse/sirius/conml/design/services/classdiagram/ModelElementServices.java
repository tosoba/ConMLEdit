package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.ModelElement;
import conml.instances.InstanceModel;
import conml.instances.InstanceModelElement;
import conml.types.TypeModel;
import conml.types.TypeModelElement;

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

  public <T extends EObject> void moveInstanceModelElement(
      final InstanceModelElement element,
      final Class<T> objectClass,
      final ConML.ElementMovementDirection direction) {
    ConML.castElementAndContainer(
            element, objectClass, element.getInstanceModel(), InstanceModel.class)
        .ifBothCastsSuccessful(
            (objectToMove, model) ->
                moveElements(Arrays.asList(objectToMove), model, objectClass, direction));
  }

  public <T extends EObject> void moveTypeModelElement(
      final TypeModelElement element,
      final Class<T> objectClass,
      final ConML.ElementMovementDirection direction) {
    ConML.castElementAndContainer(element, objectClass, element.getTypeModel(), TypeModel.class)
        .ifBothCastsSuccessful(
            (objectToMove, model) ->
                moveElements(Arrays.asList(objectToMove), model, objectClass, direction));
  }

  public <T extends EObject> void moveElements(
      final List<T> elements,
      final InstanceModel model,
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

  public <T extends EObject> void moveElements(
      final List<T> elements,
      final TypeModel model,
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

  public String defaultName(final EObject object) {
    final String name = object.getClass().getSimpleName().replace("Impl", "");

    final EObject container = object.eContainer();
    if (container != null) {
      final Collection<?> elementsOfSameType =
          ConML.getAllElementsOfTypeFrom(container, object.getClass());
      return name + elementsOfSameType.size();
    }

    final EStructuralFeature containingFeature = object.eContainingFeature();
    if (containingFeature != null) {
      final Collection<?> elementsOfSameType =
          ConML.getAllElementsOfTypeFrom(containingFeature, object.getClass());
      return name + elementsOfSameType.size();
    }

    return name;
  }

  public String defaultDefinition(final EObject object) {
    return "";
  }
}
