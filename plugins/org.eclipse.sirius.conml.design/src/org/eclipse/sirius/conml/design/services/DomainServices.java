package org.eclipse.sirius.conml.design.services;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;

import conml.Domain;
import conml.Model;
import conml.types.TypeModel;

public final class DomainServices {

  public static final class InstanceHolder {
    static final DomainServices INSTANCE = new DomainServices();
  }

  public static DomainServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public <T extends Model> Stream<Model> getOwnedModelsOfType(
      final Domain domain, final Class<T> clazz) {
    return domain.getModels().stream().filter(clazz::isInstance);
  }

  public Collection<EObject> getOwnedTypeModels(final Domain domain) {
    return getOwnedModelsOfType(domain, TypeModel.class).collect(Collectors.toList());
  }
}
