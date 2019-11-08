package org.eclipse.sirius.conml.design.services;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.api.query.DDiagramQuery;

import com.google.common.collect.Sets;

public class UIServices {

  private static final class InstanceHolder {
    static final UIServices INSTANCE = new UIServices();
  }

  public static UIServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public Collection<EObject> getDisplayedNodes(final DDiagram diagram) {
    final Set<EObject> result = Sets.newLinkedHashSet();
    final DDiagramQuery query = new DDiagramQuery(diagram);
    for (final DDiagramElement diagramElement : query.getAllDiagramElements()) {
      result.add(diagramElement.getTarget());
    }
    return result;
  }

  public int defaultWidth(final EObject object) {
    return 12;
  }

  public int defaultHeight(final EObject object) {
    return 10;
  }

  public int defaultSingleDimensionSize(final EObject object) {
    return 10;
  }
}
