package org.eclipse.sirius.conml.design.services.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.trigger.AutosizeTrigger;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.business.internal.helper.task.operations.CreateViewTask;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeListSpec;
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

@SuppressWarnings("restriction")
public final class ExistingElementsServices {

  private static final class InstanceHolder {
    static final ExistingElementsServices INSTANCE = new ExistingElementsServices();
  }

  public static ExistingElementsServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public List<Object> openSelectExistingElementsDialog(
      final EObject selectedContainer,
      final DDiagram diagram,
      final ExistingSemanticElementsSelectionDialog dialog) {
    return openSelectExistingElementsDialog(selectedContainer, diagram, dialog, true);
  }

  public List<Object> openSelectExistingElementsDialog(
      final EObject selectedContainer,
      final DDiagram diagram,
      final ExistingSemanticElementsSelectionDialog dialog,
      final boolean grayOutDisplayedNodes) {
    dialog.setGrayedPredicate(
        grayOutDisplayedNodes
            ? ExistingElementsServices.getInstance().getNonSelectablePredicate(diagram)
            : null);
    return dialog.open(
        PlatformUI.getWorkbench().getDisplay().getActiveShell(), selectedContainer, diagram, true);
  }

  public void openSelectExistingElementsDialogAndAddElements(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram,
      final ExistingSemanticElementsSelectionDialog dialog,
      final Class<?>... classes) {
    final List<Object> elementsToAdd =
        openSelectExistingElementsDialog(selectedContainer, diagram, dialog);
    if (elementsToAdd.size() > 0) {
      ExistingElementsServices.getInstance()
          .addExistingElements(
              selectedContainerView,
              elementsToAdd
                  .stream()
                  .filter(
                      obj ->
                          Arrays.asList(classes).stream().anyMatch(clazz -> clazz.isInstance(obj)))
                  .map(EObject.class::cast)
                  .collect(Collectors.toList()),
              dialog.getIsValidEObjectPredicate());
    }
  }

  public Predicate<EObject> getNonSelectablePredicate(final DDiagram diagram) {
    return Predicates.in(UIServices.getInstance().getDisplayedNodes(diagram));
  }

  public void addExistingElements(
      final EObject containerView,
      final List<? extends EObject> semanticElements,
      final Predicate<Object> isValidEObjectPredicate) {
    if (!(containerView instanceof DSemanticDecorator)
        || semanticElements == null
        || semanticElements.isEmpty()) return;

    final Session session = SessionManager.INSTANCE.getSession(semanticElements.get(0));
    final Set<EObject> lastShownElements = new HashSet<>();
    for (final EObject semanticElement : orderParentFirst(semanticElements)) {
      addExistingElement(
          session, containerView, lastShownElements, isValidEObjectPredicate, semanticElement);
    }
  }

  public void addExistingElement(
      final Session session,
      final EObject containerView,
      final Set<EObject> lastShownElements,
      final Predicate<Object> isValidEObjectPredicate,
      final EObject semanticElement) {
    markForAutosize(semanticElement);

    String containerViewExpression = "";
    if (lastShownElements.contains(semanticElement.eContainer()))
      containerViewExpression = "aql:self.getHierarchicalContainerView(elementView)";
    else containerViewExpression = "aql:self.getContainerView(elementView)";

    showView(
        semanticElement,
        (DSemanticDecorator) containerView,
        session,
        containerViewExpression,
        isValidEObjectPredicate);
    lastShownElements.add((EObject) semanticElement);
  }

  enum Relation {
    NONE,
    CHILD,
    PARENT
  }

  private List<? extends EObject> orderParentFirst(final List<? extends EObject> listToSort) {
    final ArrayList<EObject> sortedList = new ArrayList<>();
    if (listToSort.isEmpty()) return listToSort;
    if (sortedList.isEmpty()) sortedList.add(listToSort.get(0));

    for (final EObject elementToSort : listToSort) {
      int index = 0;
      Relation relation = Relation.NONE;
      for (final EObject currentElement : sortedList) {
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

  private boolean isChild(EObject child, EObject parent) {
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
      final String containerViewExpression,
      final Predicate<Object> isValidEObjectPredicate) {
    final List<DDiagramElement> hiddenDiagramElements =
        getHiddenExistingDiagramElements(semanticElement, containerView);
    if (!hiddenDiagramElements.isEmpty()) {
      for (final DDiagramElement existingDiagramElement : hiddenDiagramElements) {
        HideFilterHelper.INSTANCE.reveal(existingDiagramElement);
      }
    } else {
      createView(
          semanticElement,
          containerView,
          session,
          containerViewExpression,
          isValidEObjectPredicate);
    }
  }

  private void createView(
      final EObject semanticElement,
      final DSemanticDecorator containerView,
      final Session session,
      final String containerViewExpression,
      final Predicate<Object> isValidEObjectPredicate) {
    final List<DiagramElementMapping> semanticElementMappings =
        getMappings(semanticElement, containerView, session, isValidEObjectPredicate);
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
      final EObject semanticElement,
      final DSemanticDecorator containerView,
      final Session session,
      final Predicate<Object> isValidEObjectPredicate) {
    final ModelAccessor modelAccessor = session.getModelAccessor();
    final List<DiagramElementMapping> mappings = new ArrayList<DiagramElementMapping>();

    if (containerView instanceof DSemanticDiagram) {
      mappings.addAll(
          getValidMappingsForDiagram(
              semanticElement, (DSemanticDiagram) containerView, session, isValidEObjectPredicate));
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
      final EObject semanticElement,
      final DSemanticDiagram diagram,
      final Session session,
      final Predicate<Object> isValidEObjectPredicate) {
    final List<DiagramElementMapping> mappings = new ArrayList<DiagramElementMapping>();
    if (!isValidEObjectPredicate.test(semanticElement)) return mappings;

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
    if (containerView instanceof DSemanticDiagram) {
      return getHiddenExistingDiagramElements(
          ((DSemanticDiagram) containerView).getDiagramElements(), semanticElement);
    } else if (containerView instanceof DNodeListSpec) {
      return getHiddenExistingDiagramElements(
          ((DNodeListSpec) containerView).getElements(), semanticElement);
    } else return Lists.newArrayList();
  }

  private List<DDiagramElement> getHiddenExistingDiagramElements(
      final Collection<DDiagramElement> elements, final EObject semanticElement) {
    final List<DDiagramElement> existingDiagramElements = Lists.newArrayList();
    for (final DDiagramElement element : elements) {
      if (semanticElement.equals(element.getTarget())) {
        final DDiagramElementQuery query = new DDiagramElementQuery(element);
        if (query.isHidden()) {
          existingDiagramElements.add(element);
        }
        existingDiagramElements.addAll(getHiddenParentContainerViews(element));
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
