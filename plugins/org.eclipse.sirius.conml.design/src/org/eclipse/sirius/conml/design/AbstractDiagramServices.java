package org.eclipse.sirius.conml.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.design.trigger.AutosizeTrigger;
import org.eclipse.sirius.conml.design.wizard.ModelElementsSelectionDialog;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.business.internal.helper.task.operations.CreateViewTask;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.CreateView;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;
import org.eclipse.sirius.tools.api.command.CommandContext;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.PlatformUI;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import conml.ModelElement;

public abstract class AbstractDiagramServices {

  public boolean isEnabled(EObject eObject, EStructuralFeature feature) {
    return true;
  }

  public String defaultName(ModelElement element) {
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

  public String defaultDefinition(ModelElement element) {
    return "";
  }

  public int defaultWidth(EObject object) {
    return 12;
  }

  public int defaultHeight(EObject object) {
    return 10;
  }

  public int defaultSingleDimensionSize(EObject object) {
    return 10;
  }

  public String getWidgetLabel(EObject element, EStructuralFeature structuralFeature) {
    return structuralFeature != null ? structuralFeature.getName() : "New element";
  }

  public void openSelectExistingElementsDialog(
      EObject selectedContainer, EObject selectedContainerView, DDiagram diagram) {
    final ModelElementsSelectionDialog dlg =
        new ModelElementsSelectionDialog(
            "Add existing elements", "Select elements to add in current representation.");
    dlg.setGrayedPredicate(getNonSelectablePredicate(diagram));
    final List elementsToAdd =
        dlg.open(
            PlatformUI.getWorkbench().getDisplay().getActiveShell(),
            selectedContainer,
            diagram,
            true);
    if (elementsToAdd.size() > 0) {
      addExistingElements(selectedContainerView, elementsToAdd);
    }
  }

  private Predicate<EObject> getNonSelectablePredicate(DDiagram diagram) {
    return Predicates.in(UIServices.getDisplayedNodes(diagram));
  }

  private void addExistingElements(
      final EObject containerView, final List<ModelElement> semanticElements) {
    if (!(containerView instanceof DSemanticDecorator)
        || semanticElements == null
        || semanticElements.isEmpty()) {
      return;
    }
    final Session session = SessionManager.INSTANCE.getSession(semanticElements.get(0));
    final Set<ModelElement> lastShownElements = new HashSet<>();
    for (final EObject semanticElement : orderParentFirst(semanticElements)) {
      // Mark for auto-size
      markForAutosize(semanticElement);
      // Add to diagram
      String containerViewExpression = "";
      if (lastShownElements.contains(semanticElement.eContainer())) {
        // The user want to add list of Hierarchical elements
        containerViewExpression = "aql:self.getHierarchicalContainerView(elementView)";
      } else {
        // The user want to add an element not a hierarchy
        containerViewExpression = "aql:self.getContainerView(elementView)";
      }
      showView(
          semanticElement, (DSemanticDecorator) containerView, session, containerViewExpression);
      lastShownElements.add((ModelElement) semanticElement);
    }
  }

  enum Relation {
    NONE,
    CHILD,
    PARENT
  }

  private List<ModelElement> orderParentFirst(List<ModelElement> listToSort) {

    final ArrayList<ModelElement> sortedList = new ArrayList<>();
    if (listToSort.isEmpty()) {
      return listToSort;
    }

    if (sortedList.isEmpty()) {
      sortedList.add(listToSort.get(0));
    }

    for (final ModelElement elementToSort : listToSort) {
      int index = 0;
      Relation relation = Relation.NONE;
      for (final ModelElement currentElement : sortedList) {
        if (isChild(elementToSort, currentElement)) {
          // elementToSort is a descendant of currentElement
          // Find the last element of the list which is a parent
          index = sortedList.indexOf(currentElement);
          relation = Relation.CHILD;
          if (elementToSort.eContainer() == currentElement) {
            break;
          }
        } else if (isChild(currentElement, elementToSort)) {
          // currentElement is a parent of currenttElement
          index = sortedList.indexOf(currentElement);
          relation = Relation.PARENT;
          break;
        }
      }

      switch (relation) {
        case CHILD:
          // Element to insert is a child of an already sorted element
          sortedList.add(index + 1, elementToSort);
          break;
        case PARENT:
          // Element to insert is a parent of an already sorted element
          sortedList.add(index, elementToSort);
          break;
        default:
          // Element to insert has no relation with already sorted
          // elements
          if (!sortedList.contains(elementToSort)) {
            sortedList.add(elementToSort);
            break;
          }
      }
    }
    return sortedList;
  }

  private boolean isChild(EObject child, ModelElement parent) {
    if (child.eContainer() == null) return false;
    if (child.eContainer() == parent) return true;
    return isChild(child.eContainer(), parent);
  }

  public EObject markForAutosize(EObject object) {
    if (object != null) object.eAdapters().add(AutosizeTrigger.AUTO_SIZE_MARKER);
    return object;
  }

  protected void showView(
      final EObject semanticElement,
      final DSemanticDecorator containerView,
      final Session session,
      String containerViewExpression) {
    // Check if the dropped element already exists in the diagram but is
    // hidden
    final List<DDiagramElement> hiddenDiagramElements =
        getHiddenExistingDiagramElements(semanticElement, containerView);
    if (!hiddenDiagramElements.isEmpty()) {
      // Just reveal the elements
      for (final DDiagramElement existingDiagramElement : hiddenDiagramElements) {
        HideFilterHelper.INSTANCE.reveal(existingDiagramElement);
      }
    } else {
      // Else create a new element
      // Create the view for the dropped element
      createView(semanticElement, containerView, session, containerViewExpression);
    }
  }

  protected void createView(
      final EObject semanticElement,
      final DSemanticDecorator containerView,
      final Session session,
      final String containerViewExpression) {
    // Get all available mappings applicable for the semantic element in the
    // current container
    final List<DiagramElementMapping> semanticElementMappings =
        getMappings(semanticElement, containerView, session);

    // Build a createView tool
    final CreateView createViewOp = ToolFactory.eINSTANCE.createCreateView();
    for (final DiagramElementMapping semanticElementMapping : semanticElementMappings) {
      final DiagramElementMapping tmpSemanticElementMapping = semanticElementMapping;
      createViewOp.setMapping(tmpSemanticElementMapping);
      createViewOp.setContainerViewExpression(containerViewExpression);

      session
          .getTransactionalEditingDomain()
          .getCommandStack()
          .execute(
              new RecordingCommand(session.getTransactionalEditingDomain()) {

                @Override
                protected void doExecute() {
                  try {
                    // Get the command context
                    DRepresentation representation = null;
                    if (containerView instanceof DRepresentation) {
                      representation = (DRepresentation) containerView;
                    } else if (containerView instanceof DDiagramElement) {
                      representation = ((DDiagramElement) containerView).getParentDiagram();
                    }

                    final CommandContext context =
                        new CommandContext(semanticElement, representation);

                    // Execute the create view task
                    final CreateViewTask task =
                        new CreateViewTask(
                            context,
                            session.getModelAccessor(),
                            createViewOp,
                            session.getInterpreter());
                    task.execute();

                    final Object createdView =
                        session.getInterpreter().getVariable(createViewOp.getVariableName());
                    if (createdView instanceof DDiagramElement) {
                      final DDiagramElement element = (DDiagramElement) createdView;
                      HideFilterHelper.INSTANCE.reveal(element);
                    }
                  } catch (final MetaClassNotFoundException e) {
                    Activator.logError(e);
                  } catch (final FeatureNotFoundException e) {
                    Activator.logError(e);
                  }
                }
              });
    }
  }

  protected List<DiagramElementMapping> getMappings(
      final EObject semanticElement, final DSemanticDecorator containerView, Session session) {
    final ModelAccessor modelAccessor = session.getModelAccessor();
    final List<DiagramElementMapping> mappings = new ArrayList<DiagramElementMapping>();

    if (containerView instanceof DSemanticDiagram) {
      mappings.addAll(
          getValidMappingsForDiagram(semanticElement, (DSemanticDiagram) containerView, session));
    } else if (containerView instanceof DNodeContainerSpec) {
      for (final DiagramElementMapping mapping :
          ((DNodeContainerSpec) containerView).getActualMapping().getAllContainerMappings()) {
        final String domainClass = ((AbstractNodeMapping) mapping).getDomainClass();
        if (modelAccessor.eInstanceOf(semanticElement, domainClass)
            && !mapping.isCreateElements()) {
          mappings.add(mapping);
        }
      }
      for (final DiagramElementMapping mapping :
          ((DNodeContainerSpec) containerView).getActualMapping().getAllNodeMappings()) {
        final String domainClass = ((AbstractNodeMapping) mapping).getDomainClass();
        if (modelAccessor.eInstanceOf(semanticElement, domainClass)
            && !mapping.isCreateElements()) {
          mappings.add(mapping);
        }
      }
    }
    return mappings;
  }

  private List<DiagramElementMapping> getValidMappingsForDiagram(
      final EObject semanticElement, final DSemanticDiagram diagram, Session session) {
    final List<DiagramElementMapping> mappings = new ArrayList<DiagramElementMapping>();
    // check semantic element could be added to diagram
    if (!AddElementToDiagramServices.isValidForDiagram(diagram, null).test(semanticElement)) {
      return mappings;
    }

    final ModelAccessor modelAccessor = session.getModelAccessor();

    for (final DiagramElementMapping mapping : diagram.getDescription().getAllContainerMappings()) {
      final String domainClass = ((AbstractNodeMapping) mapping).getDomainClass();
      if (modelAccessor.eInstanceOf(semanticElement, domainClass) && !mapping.isCreateElements()) {
        mappings.add(mapping);
      }
    }
    for (final DiagramElementMapping mapping : diagram.getDescription().getAllNodeMappings()) {
      final String domainClass = ((AbstractNodeMapping) mapping).getDomainClass();
      if (modelAccessor.eInstanceOf(semanticElement, domainClass) && !mapping.isCreateElements()) {
        mappings.add(mapping);
      }
    }

    return mappings;
  }

  private List<DDiagramElement> getHiddenExistingDiagramElements(
      EObject semanticElement, DSemanticDecorator containerView) {
    final List<DDiagramElement> existingDiagramElements = Lists.newArrayList();
    if (containerView instanceof DSemanticDiagram) {
      for (final DDiagramElement element :
          ((DSemanticDiagram) containerView).getDiagramElements()) {
        if (semanticElement.equals(element.getTarget())) {
          final DDiagramElementQuery query = new DDiagramElementQuery(element);
          if (query.isHidden()) {
            existingDiagramElements.add(element);
          }
          // Get the hidden parent container of the element to reveal,
          // in order to reveal all the
          // hierarchy
          existingDiagramElements.addAll(getHiddenParentContainerViews(element));
        }
      }
    }
    return existingDiagramElements;
  }

  private List<DDiagramElement> getHiddenParentContainerViews(DDiagramElement diagramElement) {
    final List<DDiagramElement> containerViews = Lists.newArrayList();
    EObject containerView = diagramElement.eContainer();
    while (!(containerView instanceof DDiagram) && containerView instanceof DDiagramElement) {
      final DDiagramElementQuery query = new DDiagramElementQuery((DDiagramElement) containerView);
      if (query.isHidden()) {
        containerViews.add((DDiagramElement) containerView);
      }
      containerView = containerView.eContainer();
    }
    return containerViews;
  }
}
