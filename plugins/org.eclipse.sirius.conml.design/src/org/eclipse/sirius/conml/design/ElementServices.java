package org.eclipse.sirius.conml.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import com.google.common.collect.Lists;

import conml.Model;

public class ElementServices {
  public static Collection<Model> getAllRootsInSession(EObject any) {
    final Session session = SessionManager.INSTANCE.getSession(any);
    final Collection<Model> roots = Lists.newArrayList();
    if (session != null) {
      for (final Resource childRes : session.getSemanticResources()) {
        for (final EObject root : childRes.getContents()) {
          if (root instanceof Model) {
            roots.add((Model) root);
          }
        }
      }
    }
    return roots;
  }
}
