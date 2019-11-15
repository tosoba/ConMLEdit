package org.eclipse.sirius.conml.design.services;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.design.util.ConML;

import com.google.common.collect.Lists;

import conml.Model;
import conml.instances.InstanceModel;
import conml.types.TypeModel;
import conml.types.TypeModelElement;

public final class ModelServices {

  private static final class InstanceHolder {
    static final ModelServices INSTANCE = new ModelServices();
  }

  public static ModelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public <T extends EObject> Collection<EObject> getOwnedElementsOfType(
      final EObject object, final Class<T> clazz) {
    return getOwnedElementsOfTypeStream(object, clazz).collect(Collectors.toList());
  }

  public <T extends EObject> Stream<T> getOwnedElementsOfTypeStream(
      final EObject object, final Class<T> clazz) {
    if (!(object instanceof Model)) return Stream.empty();
    final Model model = (Model) object;
    return ConML.getStreamOfAllElementsOfTypeFromModel(model, clazz);
  }

  public TypeModel findTypeModelContainer(final TypeModelElement element) {
    return ConML.getAllElementsOfTypeFromSessionStream(element, TypeModel.class)
        .filter(model -> model.getElements().contains(element))
        .findAny()
        .get();
  }

  public Collection<InstanceModel> getAllInstanceModelsInSession(final EObject object) {
    return ConML.getAllElementsOfTypeFromSession(object, InstanceModel.class);
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
