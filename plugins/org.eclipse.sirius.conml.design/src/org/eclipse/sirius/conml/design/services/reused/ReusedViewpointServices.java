package org.eclipse.sirius.conml.design.services.reused;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.services.AbstractDiagramServices;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import conml.Model;
import conml.ModelElement;

public class ReusedViewpointServices extends AbstractDiagramServices {

  public boolean isValidContainerMapping(final EObject containerView) {
    // TODO: maybe remove this if altogether...
    if (containerView instanceof DDiagramElementContainer) {
      return !ContainerLayout.LIST.equals(
          ((DDiagramElementContainer) containerView).getActualMapping().getChildrenPresentation());
    }
    if (containerView instanceof DDiagram) {
      return true;
    }
    return false;
  }

  public DSemanticDecorator getContainerView(
      final ModelElement semanticElement, final DDiagramElement elementView) {
    return getContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  public DSemanticDecorator getContainerView(
      final ModelElement semanticElement, final DDiagramElementContainer elementView) {
    return getContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  private DSemanticDecorator getContainerView(
      final ModelElement semanticElement, final DSemanticDecorator elementView) {
    return elementView;
  }

  public DSemanticDecorator getContainerView(
      final ModelElement semanticElement, final DSemanticDiagram elementView) {
    return getContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  public DSemanticDecorator getHierarchicalContainerView(
      final ModelElement semanticElement, final DDiagramElement elementView) {
    return getHierarchicalContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  public DSemanticDecorator getHierarchicalContainerView(
      final ModelElement semanticElement, final DDiagramElementContainer elementView) {
    return getHierarchicalContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  private DSemanticDecorator getHierarchicalContainerView(
      final ModelElement semanticElement, final DSemanticDecorator elementView) {
    final Set<DDiagramElementContainer> containerViews = new HashSet<DDiagramElementContainer>();

    if (elementView instanceof DDiagramElement) {
      containerViews.addAll(((DDiagramElement) elementView).getParentDiagram().getContainers());
    } else if (elementView instanceof DDiagramElementContainer) {
      containerViews.addAll(
          ((DDiagramElementContainer) elementView).getParentDiagram().getContainers());
    } else if (elementView instanceof DSemanticDiagram) {
      containerViews.addAll(((DSemanticDiagram) elementView).getContainers());
    }
    for (final DDiagramElementContainer containerView : containerViews) {
      if (containerView instanceof Model) {
        final Model model = (Model) containerView;
        if (model.getElements().contains(semanticElement)
            && !ContainerLayout.LIST.equals(
                containerView.getActualMapping().getChildrenPresentation())) return containerView;
      }
    }
    return elementView;
  }

  public DSemanticDecorator getHierarchicalContainerView(
      final ModelElement semanticElement, final DSemanticDiagram elementView) {
    return getHierarchicalContainerView(semanticElement, (DSemanticDecorator) elementView);
  }
}
