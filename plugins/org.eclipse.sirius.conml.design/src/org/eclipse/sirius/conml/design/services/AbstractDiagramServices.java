package org.eclipse.sirius.conml.design.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.trigger.AutosizeTrigger;
import org.eclipse.sirius.conml.design.util.ConML;
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

@SuppressWarnings("restriction")
public abstract class AbstractDiagramServices {

  public boolean isEnabled(final EObject eObject, final EStructuralFeature feature) {
    return true;
  }

  public String defaultName(final ModelElement element) {
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

  public String defaultDefinition(final ModelElement element) {
    return "";
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

  public String getWidgetLabel(final EObject element, final EStructuralFeature structuralFeature) {
    return structuralFeature != null ? structuralFeature.getName() : "New element";
  }

  public void openSelectExistingElementsDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    final ModelElementsSelectionDialog dialog =
        new ModelElementsSelectionDialog(
            "Add existing elements", "Select elements to add in current representation.");
    dialog.setGrayedPredicate(getNonSelectablePredicate(diagram));

    final List<Object> elementsToAdd =
        dialog.open(
            PlatformUI.getWorkbench().getDisplay().getActiveShell(),
            selectedContainer,
            diagram,
            true);
    if (elementsToAdd.size() > 0)
      addExistingElements(
          selectedContainerView,
          elementsToAdd
              .stream()
              .filter(obj -> obj instanceof ModelElement)
              .map(ModelElement.class::cast)
              .collect(Collectors.toList()));
  }

  private Predicate<EObject> getNonSelectablePredicate(final DDiagram diagram) {
    return Predicates.in(UIServices.getDisplayedNodes(diagram));
  }

  private void addExistingElements(
      final EObject containerView, final List<ModelElement> semanticElements) {
    if (!(containerView instanceof DSemanticDecorator)
        || semanticElements == null
        || semanticElements.isEmpty()) return;

    final Session session = SessionManager.INSTANCE.getSession(semanticElements.get(0));
    final Set<ModelElement> lastShownElements = new HashSet<>();
    for (final EObject semanticElement : orderParentFirst(semanticElements)) {
      markForAutosize(semanticElement);

      String containerViewExpression = "";
      if (lastShownElements.contains(semanticElement.eContainer()))
        containerViewExpression = "aql:self.getHierarchicalContainerView(elementView)";
      else containerViewExpression = "aql:self.getContainerView(elementView)";

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

  private List<ModelElement> orderParentFirst(final List<ModelElement> listToSort) {
    final ArrayList<ModelElement> sortedList = new ArrayList<>();
    if (listToSort.isEmpty()) return listToSort;
    if (sortedList.isEmpty()) sortedList.add(listToSort.get(0));

    for (final ModelElement elementToSort : listToSort) {
      int index = 0;
      Relation relation = Relation.NONE;
      for (final ModelElement currentElement : sortedList) {
        if (isChild(elementToSort, currentElement)) {
          index = sortedList.indexOf(currentElement);
          relation = Relation.CHILD;
          if (elementToSort.eContainer() == currentElement) break;
        } else if (isChild(currentElement, elementToSort)) {
          index = sortedList.indexOf(currentElement);
          relation = Relation.PARENT;
          break;
        }
      }

      switch (relation) {
        case CHILD:
          sortedList.add(index + 1, elementToSort);
          break;
        case PARENT:
          sortedList.add(index, elementToSort);
          break;
        default:
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

  private EObject markForAutosize(EObject object) {
    if (object != null) object.eAdapters().add(AutosizeTrigger.AUTO_SIZE_MARKER);
    return object;
  }

  private void showView(
      final EObject semanticElement,
      final DSemanticDecorator containerView,
      final Session session,
      String containerViewExpression) {
    final List<DDiagramElement> hiddenDiagramElements =
        getHiddenExistingDiagramElements(semanticElement, containerView);
    if (!hiddenDiagramElements.isEmpty()) {
      for (final DDiagramElement existingDiagramElement : hiddenDiagramElements) {
        HideFilterHelper.INSTANCE.reveal(existingDiagramElement);
      }
    } else {
      createView(semanticElement, containerView, session, containerViewExpression);
    }
  }

  private void createView(
      final EObject semanticElement,
      final DSemanticDecorator containerView,
      final Session session,
      final String containerViewExpression) {
    final List<DiagramElementMapping> semanticElementMappings =
        getMappings(semanticElement, containerView, session);
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
                    DRepresentation representation = null;
                    if (containerView instanceof DRepresentation) {
                      representation = (DRepresentation) containerView;
                    } else if (containerView instanceof DDiagramElement) {
                      representation = ((DDiagramElement) containerView).getParentDiagram();
                    }

                    final CommandContext context =
                        new CommandContext(semanticElement, representation);
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

  private List<DiagramElementMapping> getMappings(
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
    if (!AddElementToDiagramServices.isValidForDiagramPredicate(diagram, null)
        .test(semanticElement)) {
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
      final EObject semanticElement, final DSemanticDecorator containerView) {
    final List<DDiagramElement> existingDiagramElements = Lists.newArrayList();
    if (containerView instanceof DSemanticDiagram) {
      for (final DDiagramElement element :
          ((DSemanticDiagram) containerView).getDiagramElements()) {
        if (semanticElement.equals(element.getTarget())) {
          final DDiagramElementQuery query = new DDiagramElementQuery(element);
          if (query.isHidden()) {
            existingDiagramElements.add(element);
          }
          existingDiagramElements.addAll(getHiddenParentContainerViews(element));
        }
      }
    }
    return existingDiagramElements;
  }

  private List<DDiagramElement> getHiddenParentContainerViews(
      final DDiagramElement diagramElement) {
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
