package org.eclipse.sirius.conml.design.reused;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.AbstractDiagramServices;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import conml.Model;
import conml.ModelElement;

public class ReusedViewpointServices extends AbstractDiagramServices {

  public boolean isValidContainerMapping(EObject containerView) {
    // TODO: maybe comment this out for now...
    if (containerView instanceof DDiagramElementContainer) {
      return !ContainerLayout.LIST.equals(
          ((DDiagramElementContainer) containerView).getActualMapping().getChildrenPresentation());
    }
    if (containerView instanceof DDiagram) {
      return true;
    }
    return false;
  }

  /**
   * Retrieve the container view for the given semantic element.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  public DSemanticDecorator getContainerView(
      ModelElement semanticElement, DDiagramElement elementView) {
    return getContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  /**
   * Retrieve the container view for the given semantic element.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  public DSemanticDecorator getContainerView(
      ModelElement semanticElement, DDiagramElementContainer elementView) {
    return getContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  /**
   * Retrieve the container view for the given semantic element when a branch was not selected.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  private DSemanticDecorator getContainerView(
      ModelElement semanticElement, DSemanticDecorator elementView) {
    return elementView;
  }

  /**
   * Retrieve the container view for the given semantic element.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  public DSemanticDecorator getContainerView(
      ModelElement semanticElement, DSemanticDiagram elementView) {
    return getContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  /**
   * Retrieve the container view for the given semantic element.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  public DSemanticDecorator getHierarchicalContainerView(
      ModelElement semanticElement, DDiagramElement elementView) {
    return getHierarchicalContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  /**
   * Retrieve the container view for the given semantic element.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  public DSemanticDecorator getHierarchicalContainerView(
      ModelElement semanticElement, DDiagramElementContainer elementView) {
    return getHierarchicalContainerView(semanticElement, (DSemanticDecorator) elementView);
  }

  /**
   * Retrieve the container view for the given semantic element when a branch was selected
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  private DSemanticDecorator getHierarchicalContainerView(
      ModelElement semanticElement, DSemanticDecorator elementView) {
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

  /**
   * Retrieve the container view for the given semantic element.
   *
   * @param semanticElement Semantic element
   * @param elementView Element view
   * @return Container view
   */
  public DSemanticDecorator getHierarchicalContainerView(
      ModelElement semanticElement, DSemanticDiagram elementView) {
    return getHierarchicalContainerView(semanticElement, (DSemanticDecorator) elementView);
  }
}
