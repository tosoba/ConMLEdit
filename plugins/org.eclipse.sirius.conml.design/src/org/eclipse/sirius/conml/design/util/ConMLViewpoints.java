package org.eclipse.sirius.conml.design.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public final class ConMLViewpoints {

  private final ViewpointRegistry registry;

  public ConMLViewpoints(ViewpointRegistry registry) {
    this.registry = registry;
  }

  public static void enableAll(final Session session, final boolean deselect) {
    if (session != null) {
      session
          .getTransactionalEditingDomain()
          .getCommandStack()
          .execute(
              new RecordingCommand(session.getTransactionalEditingDomain()) {
                @Override
                protected void doExecute() {
                  final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
                  if (deselect) {
                    for (final Viewpoint previouslySelected :
                        session.getSelectedViewpoints(false)) {
                      selection.deselectViewpoint(
                          previouslySelected, session, new NullProgressMonitor());
                    }
                  }

                  Set<String> selectedViewpoints =
                      deselect
                          ? new HashSet<>()
                          : session
                              .getSelectedViewpoints(false)
                              .stream()
                              .map(Viewpoint::getName)
                              .collect(Collectors.toSet());
                  if (!selectedViewpoints.contains(REUSED_VP_NAME) || deselect) {
                    selection.selectViewpoint(
                        ConMLViewpoints.fromViewpointRegistry().reusedViewpoint(),
                        session,
                        new NullProgressMonitor());
                  }
                  if (!selectedViewpoints.contains(CONML_VP_NAME) || deselect) {
                    selection.selectViewpoint(
                        ConMLViewpoints.fromViewpointRegistry().conMLViewpoint(),
                        session,
                        new NullProgressMonitor());
                  }
                }
              });
    }
  }

  public static ConMLViewpoints fromViewpointRegistry() {
    return new ConMLViewpoints(ViewpointRegistry.getInstance());
  }

  private Viewpoint getViewpointByName(Collection<Viewpoint> viewpoints, String name) {
    return viewpoints
        .stream()
        .filter(vp -> name.equalsIgnoreCase(vp.getName()))
        .findFirst()
        .orElse(null);
  }

  private Viewpoint getViewpointByName(String name) {
    return getViewpointByName(registry.getViewpoints(), name);
  }

  public Viewpoint reusedViewpoint() {
    return getViewpointByName(REUSED_VP_NAME);
  }

  public Viewpoint conMLViewpoint() {
    return getViewpointByName(CONML_VP_NAME);
  }

  private static final String REUSED_VP_NAME = "Reused";
  private static final String CONML_VP_NAME = "ConML";
  public static final String ODESIGN_FILE_NAME = "conml.odesign";
}
