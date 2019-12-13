package org.eclipse.sirius.conml.design.services.common;

import java.util.Objects;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.api.query.DDiagramQuery;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;

import conml.Domain;

@SuppressWarnings("restriction")
public class UIServices {

  private static final class InstanceHolder {
    static final UIServices INSTANCE = new UIServices();
  }

  public static UIServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public void addElementToDiagram(final EObject containerView, final EObject semanticElement) {
    final Session session = SessionManager.INSTANCE.getSession(semanticElement);
    ExistingElementsServices.getInstance()
        .addExistingElement(
            session, containerView, Sets.newHashSet(), Predicates.alwaysTrue(), semanticElement);
  }

  public Set<EObject> getDisplayedNodes(final DDiagram diagram) {
    final Set<EObject> result = Sets.newLinkedHashSet();
    final DDiagramQuery query = new DDiagramQuery(diagram);
    for (final DDiagramElement diagramElement : query.getAllDiagramElements()) {
      if (diagramElement.isVisible()) result.add(diagramElement.getTarget());
    }
    return result;
  }

  public void openModelDiagram(final Domain domain) {
    final String modelDiagramDescriptionName = "Model Diagram";
    final Session session = SessionManager.INSTANCE.getSession(domain);
    final DRepresentation[] modelDiagrams =
        DialectManager.INSTANCE
            .getAllRepresentations(session)
            .stream()
            .filter(
                rep ->
                    rep instanceof DSemanticDiagramSpec
                        && Objects.equals(
                            modelDiagramDescriptionName,
                            ((DSemanticDiagramSpec) rep).getDescription().getName()))
            .toArray(DRepresentation[]::new);
    if (modelDiagrams.length == 0 && showShouldCreateNewModelDiagramDialog()) {
      final String modelName =
          Dialogs.openInput(
              Messages.getString("Dialog.NewModelDiagram"),
              Messages.getString("Dialog.EnterNewDiagramName"),
              Messages.getString("Dialog.NewModelDiagram"),
              Messages.getString("Dialog.DiagramNameCannotBeEmpty"));
      if (modelName != null && !modelName.isEmpty()) {
        DialectManager.INSTANCE
            .getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), domain)
            .stream()
            .filter(
                description -> Objects.equals(description.getName(), modelDiagramDescriptionName))
            .findFirst()
            .ifPresent(
                description -> {
                  final DRepresentation modelDiagram =
                      DialectManager.INSTANCE.createRepresentation(
                          "New Model Diagram",
                          domain,
                          description,
                          session,
                          new NullProgressMonitor());
                  DialectUIManager.INSTANCE.openEditor(
                      session, modelDiagram, new NullProgressMonitor());
                });
      }
    } else {
      final Object[] result =
          Dialogs.showSelection(
              modelDiagrams,
              DRepresentation::getName,
              Messages.getString("Dialog.OpenModelDiagram"),
              Messages.getString("Dialog.NoInstanceModelExists"),
              false);
      if (result.length == 1 && result[0] instanceof DRepresentation) {
        DialectUIManager.INSTANCE.openEditor(
            session, (DRepresentation) result[0], new NullProgressMonitor());
      }
    }
  }

  private boolean showShouldCreateNewModelDiagramDialog() {
    return Dialogs.showSimpleQuestion(
        Messages.getString("Dialog.AttributeHasValueSets"),
        Messages.getString("Dialog.ShouldCreateModelDiagram"));
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
