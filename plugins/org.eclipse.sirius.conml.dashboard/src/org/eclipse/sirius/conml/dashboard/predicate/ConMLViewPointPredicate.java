package org.eclipse.sirius.conml.dashboard.predicate;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.conml.dashboard.services.DashboardServices;

public final class ConMLViewPointPredicate implements IPredicate {

  public ConMLViewPointPredicate() {
    super();
  }

  @Override
  public boolean isOk() {
    final Session session = ActivityExplorerManager.INSTANCE.getSession();
    if (ActivityExplorerManager.INSTANCE.getSession() != null) {
      return DashboardServices.INSTANCE.isEnabledVP(session, DashboardServices.VP_CONML);
    }
    return false;
  }
}
