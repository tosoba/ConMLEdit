package org.eclipse.sirius.conml.design.classdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.ModelElement;

public class ModelElementServices {

  protected <T extends EObject> void moveElement(
      T element, Class<T> elementClass, ConML.ElementMovementDirection direction) {
    final EObject container = element.eContainer();
    if (!(container instanceof Model)) return;
    final Model model = (Model) container;

    int elementIndex = model.getElements().indexOf(element);
    if (elementIndex == -1) return;

    int indexToSwapWith = -1;

    switch (direction) {
      case UP:
        for (int i = elementIndex - 1; i >= 0; i--) {
          ModelElement other = model.getElements().get(i);
          if (elementClass.isInstance(other)) {
            indexToSwapWith = i;
            break;
          }
        }
        break;
      case DOWN:
        for (int i = elementIndex + 1; i < model.getElements().size(); i++) {
          ModelElement other = model.getElements().get(i);
          if (elementClass.isInstance(other)) {
            indexToSwapWith = i;
            break;
          }
        }
        break;
    }

    if (indexToSwapWith != -1) {
      model.getElements().move(indexToSwapWith, elementIndex);
    }
  }
}
