package org.eclipse.sirius.conml.design.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public final class ExistingElementsValidationPredicates {

  public static Predicate<Object> isValidForDiagramPredicate(
      final DDiagram diagram, final EObject container) {
    Predicate<Object> predicate = Predicates.alwaysTrue();
    if (diagram instanceof DSemanticDiagram) {
      final DiagramDescription description = ((DSemanticDiagram) diagram).getDescription();
      if ("Class Diagram".equals(description.getName())) {
        predicate = isValidForClassDiagramPredicate();
      } else if ("Object Diagram".equals(description.getName())) {
        predicate = isValidForObjectDiagramPredicate();
      }
    }

    return predicate;
  }

  private static Predicate<Object> isValidForClassDiagramPredicate() {
    return input ->
        (input instanceof conml.types.Package && ((conml.types.Package) input).isOverall())
            || input instanceof conml.types.Class;
  }

  private static Predicate<Object> isValidForObjectDiagramPredicate() {
    return input -> input instanceof conml.instances.Object;
  }
}
