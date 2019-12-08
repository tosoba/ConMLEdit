package org.eclipse.sirius.conml.design.util;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public final class ConMLViewpoints {

  public static void enable(final Session session) {
    if (session != null) {
      session
          .getTransactionalEditingDomain()
          .getCommandStack()
          .execute(
              new RecordingCommand(session.getTransactionalEditingDomain()) {
                @Override
                protected void doExecute() {
                  final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
                  for (final Viewpoint previouslySelected : session.getSelectedViewpoints(false)) {
                    selection.deselectViewpoint(
                        previouslySelected, session, new NullProgressMonitor());
                  }
                  // enable Reused core viewpoint
                  ConMLViewpoints.enableReused(session);
                  // enable other UML2 viewpoints
                  selection.selectViewpoint(
                      ConMLViewpoints.fromViewpointRegistry().design(),
                      session,
                      new NullProgressMonitor());
                }
              });
    }
  }

  public static void enableReused(final Session session) {
    if (session != null) {
      session
          .getTransactionalEditingDomain()
          .getCommandStack()
          .execute(
              new RecordingCommand(session.getTransactionalEditingDomain()) {
                @Override
                protected void doExecute() {
                  final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
                  ConMLViewpoints.fromViewpointRegistry().reused();
                  for (final Viewpoint previouslySelected : session.getSelectedViewpoints(false)) {
                    if (isReusedViewpoint(previouslySelected)) {
                      return;
                    }
                  }
                  selection.selectViewpoint(
                      ConMLViewpoints.fromViewpointRegistry().reused(),
                      session,
                      new NullProgressMonitor());
                }
              });
    }
  }

  /**
   * UML viewpoints from viewpoint registry.
   *
   * @return UML viewpoints from viewpoint registry
   */
  public static ConMLViewpoints fromViewpointRegistry() {
    return new ConMLViewpoints(ViewpointRegistry.getInstance());
  }

  /**
   * Check if a viewpoint is an uml designer viewpoints.
   *
   * @param viewpoint
   * @return True if the given viewpoint is an UML Designer viewpoint otherwise false.
   */
  public static boolean isUmlViewpoint(Viewpoint viewpoint) {
    final EObject group = viewpoint.eContainer();
    if (group != null && group instanceof Group & ((Group) group).getName() != null) {
      return ((Group) group).getName().contains("ConML modelers");
    }
    return false;
  }

  private final ViewpointRegistry registry;

  /**
   * Constructor.
   *
   * @param registry Viewpoint registry
   */
  public ConMLViewpoints(ViewpointRegistry registry) {
    this.registry = registry;
  }

  private Viewpoint getViewpointByName(String name) {
    return registry
        .getViewpoints()
        .stream()
        .filter(vp -> name.equalsIgnoreCase(vp.getName()))
        .findFirst()
        .get();
  }

  /**
   * Reused.
   *
   * @return viewpoint
   */
  public Viewpoint reused() {
    return getViewpointByName("Reused");
  }

  public Viewpoint design() {
    return getViewpointByName("Design");
  }

  /**
   * Is it the UML Reused viewpoint
   *
   * @param viewpoint viewpoint to test
   * @return true if viewpoint is the Reused viewpoint
   */
  public static boolean isReusedViewpoint(Viewpoint viewpoint) {
    if (viewpoint != null) {
      final Viewpoint reused = ConMLViewpoints.fromViewpointRegistry().reused();
      final String name = viewpoint.getName();
      final Resource vpResource = viewpoint.eResource();
      if (name != null && vpResource != null) {
        return name.equals(reused.getName())
            && ODESIGN_FILE_NAME.equals(vpResource.getURI().lastSegment());
      }
    }
    return false;
  }

  public static final String ODESIGN_FILE_NAME = "conml.odesign";
}
