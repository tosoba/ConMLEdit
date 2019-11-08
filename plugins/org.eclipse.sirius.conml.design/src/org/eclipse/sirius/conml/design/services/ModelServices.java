package org.eclipse.sirius.conml.design.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import com.google.common.collect.Lists;

import conml.Model;

public final class ModelServices {

  private static final class InstanceHolder {
    static final ModelServices INSTANCE = new ModelServices();
  }

  public static ModelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public Collection<EObject> getOwnedElementsOfType(EObject object, Class<?> clazz) {
    if (!(object instanceof Model)) return Arrays.asList();
    final Model model = (Model) object;
    return model
        .getElements()
        .stream()
        .filter(element -> clazz.isInstance(element))
        .map(element -> (EObject) element)
        .collect(Collectors.toList());
  }

  public Collection<Model> getAllDiagramRootsInSession(final EObject object) {
    final Session session = SessionManager.INSTANCE.getSession(object);
    final Collection<Model> roots = Lists.newArrayList();
    if (session != null) {
      for (final Resource childRes : session.getSemanticResources()) {
        for (final EObject root : childRes.getContents()) {
          if (root instanceof Model) roots.add((Model) root);
        }
      }
    }
    return roots;
  }
}
