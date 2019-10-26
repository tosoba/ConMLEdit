package org.eclipse.sirius.conml.design;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.api.query.DDiagramQuery;

import com.google.common.collect.Sets;

public class UIServices {
  public static Collection<EObject> getDisplayedNodes(DDiagram diagram) {
    final Set<EObject> result = Sets.newLinkedHashSet();
    final DDiagramQuery query = new DDiagramQuery(diagram);
    for (final DDiagramElement diagramElement : query.getAllDiagramElements()) {
      result.add(diagramElement.getTarget());
    }
    return result;
  }
}
