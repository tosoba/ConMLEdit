package org.eclipse.sirius.conml.design.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;

import com.google.common.base.Predicate;

public class AddElementToDiagramServices {
  public static Predicate<Object> isValidForDiagram(DDiagram diagram, EObject container) {
    Predicate<Object> results = (Object object) -> true;
    if (diagram instanceof DSemanticDiagram) {
      final DiagramDescription description = ((DSemanticDiagram) diagram).getDescription();

      if ("Class Diagram".equals(description.getName())) {
        results = getValidsForClassDiagram();
      } else if ("Object Diagram".equals(description.getName())) {
        results = getValidsForObjectDiagram();
      }
    }

    return results;
  }

  private static Predicate<Object> getValidsForClassDiagram() {
    return input -> input instanceof conml.types.Package || input instanceof conml.types.Class;
  }

  private static Predicate<Object> getValidsForObjectDiagram() {
    return input -> input instanceof conml.instances.Object;
  }
}
