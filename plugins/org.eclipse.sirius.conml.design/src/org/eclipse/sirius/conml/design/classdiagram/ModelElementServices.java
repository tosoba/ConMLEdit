package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.ModelElement;

public class ModelElementServices {

  public void removeElement(EObject object) {
    EcoreUtil.delete(object);
  }

  protected <T extends EObject> void moveElement(
      EObject object, Class<T> objectClass, ConML.ElementMovementDirection direction) {
    ConML.castElementAndContainer(object, objectClass, Model.class)
        .ifBothCastsSuccessful(
            (objectToMove, model) ->
                moveElements(Arrays.asList(objectToMove), model, objectClass, direction));
  }

  protected <T extends EObject> void moveElements(
      List<T> elements,
      Model model,
      Class<T> elementClass,
      ConML.ElementMovementDirection direction) {
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
}
