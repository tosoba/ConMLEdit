package org.eclipse.sirius.conml.dashboard.services;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Lists;

import conml.Domain;

/**
 * A set of services to handle the Dashboard.
 *
 * @author Frederic Bats <a href="mailto:frederic.bats@obeo.fr">frederic.bats@obeo.fr</a>
 */
@SuppressWarnings("deprecation")
public class DashboardServices {
  /** A singleton instance to be accessed by other java services. */
  public static final DashboardServices INSTANCE = new DashboardServices();

  /** UMl-Designer Capture viewpoint name. */
  public static final String VP_CONML = "ConML";

  private DashboardServices() {}

  /**
   * Get all the root uml model elements which define a dashboard.
   *
   * @return List of model elements.
   */
  public List<EObject> getUmlModels() {
    final List<EObject> results = Lists.newArrayList();
    final Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
    for (final Session session : sessions) {
      final Iterator<Resource> iterator =
          session.getTransactionalEditingDomain().getResourceSet().getResources().iterator();
      boolean missingSession = true;
      while (iterator.hasNext() && missingSession) {
        final Resource resource = iterator.next();

        if (resource instanceof Domain) {
          final EObject root = resource.getContents().get(0);
          results.add(root);
          // only one dashboard by session is needed
          missingSession = false;
        }
      }
    }
    return results;
  }

  /**
   * Check if viewpoint is enabled for the session.
   *
   * @param session sirius session
   * @param vpName name of viewpoint
   * @return true if enable
   */
  public boolean isEnabledVP(Session session, String vpName) {
    for (final Viewpoint vp : session.getSelectedViewpoints(false)) {
      if (vp.getName().contains(vpName)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Open the dashboard representation containing in the representation file of this Modeling
   * project.
   *
   * @param curProject The modeling project containing the representations file.
   */
  public void openDashboard(IProject curProject) {
    final Option<ModelingProject> opionalModelingProject =
        ModelingProject.asModelingProject(curProject);
    if (opionalModelingProject.some()) {
      final Session session = opionalModelingProject.get().getSession();
      if (session != null) {
        final boolean initialValue =
            ActivityExplorerActivator.getDefault()
                .getPreferenceStore()
                .getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);
        // in order to open activity explorer at project creation the preference store
        // P_OPEN_ACTIVITY_EXPLORER need to be set to true
        ActivityExplorerActivator.getDefault()
            .getPreferenceStore()
            .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, true);

        final IEditorPart part = ActivityExplorerManager.INSTANCE.getEditorFromSession(session);
        if (part != null) {
          // Activity explorer already opened
          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(part);
        } else {
          ActivityExplorerManager.INSTANCE.openEditor(session);
        }
        ActivityExplorerActivator.getDefault()
            .getPreferenceStore()
            .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, initialValue);
      }
    }
  }
}
