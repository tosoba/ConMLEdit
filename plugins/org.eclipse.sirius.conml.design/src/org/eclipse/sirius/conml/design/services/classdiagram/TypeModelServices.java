package org.eclipse.sirius.conml.design.services.classdiagram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.TypeModelSelectionDialog;
import org.eclipse.sirius.conml.design.services.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.ModelServices;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.conml.gen.Gen;
import org.eclipse.sirius.diagram.DDiagram;

import conml.Domain;
import conml.types.Association;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Generalization;
import conml.types.Package;
import conml.types.SimpleDataType;
import conml.types.TypeModel;

public final class TypeModelServices {

  private static final class InstanceHolder {
    static final TypeModelServices INSTANCE = new TypeModelServices();
  }

  public static TypeModelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

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
    return ModelServices.getInstance()
        .getOwnedElementsOfTypeStream(object, Association.class)
        // TODO: should Associations with redefined Semis be filtered out here?
        .filter(association -> !association.isCompact())
        .collect(Collectors.toList());
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

  public Collection<EObject> getOwnedGeneralizationElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Generalization.class);
  }

  public Package getOverallPackageOfModel(final TypeModel model) {
    return model
        .getElements()
        .stream()
        .filter(
            element -> {
              if (!(element instanceof Package)) return false;
              final Package otherPackage = (Package) element;
              return otherPackage.isOverall();
            })
        .map(Package.class::cast)
        .findAny()
        .orElse(null);
  }

  public TypeModel showTypeModelSelectionDialog(
      final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new TypeModelSelectionDialog(
                    Messages.getString("Dialog.SelectTypeModel"),
                    Messages.getString("Dialog.SelectTypeModelContainerForClass"),
                    (Domain) selectedContainer),
                false);
    if (result.size() == 1 && result.get(0) instanceof TypeModel) return (TypeModel) result.get(0);
    else return null;
  }
}
