package org.eclipse.sirius.conml.design.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.gen.Gen;

import com.google.common.collect.Lists;

import conml.Domain;
import conml.Model;
import conml.instances.InstanceModel;
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

  public Collection<EObject> getOwnedInstanceModels(final Domain domain) {
    return getOwnedModelsOfType(domain, InstanceModel.class).collect(Collectors.toList());
  }

  public Collection<Domain> getAllDiagramRootsInSession(final EObject object) {
    final Session session = SessionManager.INSTANCE.getSession(object);
    final Collection<Domain> roots = Lists.newArrayList();
    if (session != null) {
      for (final Resource childRes : session.getSemanticResources()) {
        for (final EObject root : childRes.getContents()) {
          if (root instanceof Domain) roots.add((Domain) root);
        }
      }
    }
    return roots;
  }

  public void generateCode(final Domain domain) {
    final boolean oldNotificationsPref = AcceleoPreferences.areNotificationsForcedDisabled();
    AcceleoPreferences.switchForceDeactivationNotifications(true);
    final IFile file =
        ResourcesPlugin.getWorkspace()
            .getRoot()
            .getFile(new Path(domain.eResource().getURI().toPlatformString(true)));
    final IFolder folder = file.getProject().getFolder("Documentation");
    final File genFolder = folder.getRawLocation().makeAbsolute().toFile();

    try {
      final Gen generator =
          new Gen(domain.eResource().getURI(), genFolder, new ArrayList<Object>());
      generator.doGenerate(new BasicMonitor());
    } catch (IOException e) {
      Activator.log(Status.ERROR, "Code generation failed", e);
    }
    AcceleoPreferences.switchForceDeactivationNotifications(oldNotificationsPref);
  }
}
