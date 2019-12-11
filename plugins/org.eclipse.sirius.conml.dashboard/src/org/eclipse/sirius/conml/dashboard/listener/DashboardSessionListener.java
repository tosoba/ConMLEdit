package org.eclipse.sirius.conml.dashboard.listener;

import java.lang.ref.WeakReference;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import conml.Domain;

@SuppressWarnings("deprecation")
public final class DashboardSessionListener implements SessionManagerListener {

  public void notifyAddSession(Session newSession) {}

  public void notifyRemoveSession(Session removedSession) {}

  public void viewpointSelected(Viewpoint selectedSirius) {}

  public void viewpointDeselected(Viewpoint deselectedSirius) {}

  public void notify(Session sessionp, int notification) {
    final WeakReference<Session> session = new WeakReference<Session>(sessionp);
    switch (notification) {
      case SessionListener.OPENED:
        if ((session.get() != null) && !(session.get().getSemanticResources().isEmpty())) {
          for (Resource resource : session.get().getSemanticResources()) {
            if (resource instanceof Domain) {
              final boolean initialValue =
                  ActivityExplorerActivator.getDefault()
                      .getPreferenceStore()
                      .getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);
              // Open the activity explorer
              ActivityExplorerActivator.getDefault()
                  .getPreferenceStore()
                  .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, true);
              ActivityExplorerManager.INSTANCE.openEditor(session.get());
              ActivityExplorerActivator.getDefault()
                  .getPreferenceStore()
                  .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, initialValue);
              break;
            }
          }
        }
    }
  }
}
