package org.eclipse.sirius.conml.dashboard.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.dashboard.services.DashboardServices;

public final class ConMLViewpointEnablementTester extends PropertyTester {

  private final List<String> conmlEditViewpoints =
      new ArrayList<String>(Arrays.asList(DashboardServices.VP_CONML));

  public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    final Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
    for (final Session session : sessions) {
      if (session != null) {
        boolean isEnabledVP = false;
        final Iterator<String> vpIterator = conmlEditViewpoints.iterator();
        while (vpIterator.hasNext() && isEnabledVP == false) {
          isEnabledVP = DashboardServices.INSTANCE.isEnabledVP(session, vpIterator.next());
        }
        if (isEnabledVP) {
          return isEnabledVP;
        }
      }
    }
    return false;
  }
}
