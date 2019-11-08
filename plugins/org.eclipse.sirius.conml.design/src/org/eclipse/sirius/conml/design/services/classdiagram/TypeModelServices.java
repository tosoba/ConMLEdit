package org.eclipse.sirius.conml.design.services.classdiagram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.services.ModelServices;
import org.eclipse.sirius.conml.gen.Gen;

import conml.types.Association;
import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.Class;
import conml.types.SimpleDataType;
import conml.types.TypeModel;

public final class TypeModelServices {

  public boolean isTypeModel(final EObject object) {
    return object instanceof TypeModel;
  }

  public void generateCode(final TypeModel typeModel) {
    final boolean oldNotificationsPref = AcceleoPreferences.areNotificationsForcedDisabled();
    AcceleoPreferences.switchForceDeactivationNotifications(true);
    final IFile file =
        ResourcesPlugin.getWorkspace()
            .getRoot()
            .getFile(new Path(typeModel.eResource().getURI().toPlatformString(true)));
    final IFolder folder = file.getProject().getFolder("code");
    final File genFolder = folder.getRawLocation().makeAbsolute().toFile();

    try {
      final Gen generator =
          new Gen(typeModel.eResource().getURI(), genFolder, new ArrayList<Object>());
      generator.doGenerate(new BasicMonitor());
    } catch (IOException e) {
      Activator.log(Status.ERROR, "Code generation failed", e);
    }
    AcceleoPreferences.switchForceDeactivationNotifications(oldNotificationsPref);
  }

  public Collection<EObject> getOwnedPackageElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Package.class);
  }

  public Collection<EObject> getOwnedAssociationElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Association.class);
  }

  public Collection<EObject> getOwnedSimpleDataTypeElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, SimpleDataType.class);
  }

  public Collection<EObject> getOwnedEnumeratedTypeElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, EnumeratedType.class);
  }

  public Collection<EObject> getOwnedClassElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Class.class);
  }
}
