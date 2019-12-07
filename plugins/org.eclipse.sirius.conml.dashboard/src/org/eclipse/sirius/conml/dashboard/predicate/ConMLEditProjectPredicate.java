package org.eclipse.sirius.conml.dashboard.predicate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.conml.dashboard.services.DashboardServices;

public final class ConMLEditProjectPredicate implements IPredicate {
  private final List<String> viewpoints = Arrays.asList(DashboardServices.VP_CONML);

  public ConMLEditProjectPredicate() {}

  public boolean isOk() {
    final Session session = ActivityExplorerManager.INSTANCE.getSession();
    if (session != null) {
      boolean isEnabledVP = false;
      final Iterator<String> vpIterator = viewpoints.iterator();
      while (vpIterator.hasNext() && isEnabledVP == false) {
        isEnabledVP = DashboardServices.INSTANCE.isEnabledVP(session, vpIterator.next());
      }
      if (isEnabledVP) {
        return isEnabledVP;
      }
    }
    return false;
  }
}
