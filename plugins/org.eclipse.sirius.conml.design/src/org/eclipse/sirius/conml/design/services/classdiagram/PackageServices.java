package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.conml.design.services.classdiagram.label.PackageLabelServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.TypeModel;

public final class PackageServices {

  private static final class InstanceHolder {
    static final PackageServices INSTANCE = new PackageServices();
  }

  public static PackageServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public int showUnsetCurrentOverallPackageDialog(final Package currentOverallPackage) {
    return Dialogs.show(
        "Overall package already set.",
        "Unset current overall package : "
            + PackageLabelServices.getInstance().packageLabel(currentOverallPackage)
            + "?",
        new String[] {"Yes", "No"},
        MessageDialog.CONFIRM);
  }

  public void setOverall(final Package packageToSet) {
    final TypeModel model = packageToSet.getTypeModel();
    if (model == null) {
      Messages.getString("ExceptionMessage.IsNull", "Package's TypeModel");
      return;
    }

    final Package currentOverallPackage =
        TypeModelServices.getInstance().getOverallPackageOfModel(model);
    if (currentOverallPackage != null) {
      if (showUnsetCurrentOverallPackageDialog(currentOverallPackage) == 0)
        currentOverallPackage.setOverall(false);
      else return;
    }
    packageToSet.setOverall(true);
  }

  public boolean isNonOverallPackage(final EObject object) {
    return ConML.castAndRunOrReturn(
        object, Package.class, packageToCheck -> !packageToCheck.isOverall(), false);
  }

  public boolean isOverall(final Package pack) {
    return pack.isOverall();
  }

  public void removePackage(final EObject object) {
    if (!(object instanceof Package)) return;
    final Package packageToRemove = (Package) object;
    final TypeModel model = packageToRemove.getTypeModel();
    if (packageToRemove.getTypeModel() == null) {
      EcoreUtil.delete(packageToRemove);
      return;
    }

    if (packageToRemove.getSubPackages().isEmpty()) {
      removePackage(packageToRemove, model, false);
    } else {
      final int result =
          Dialogs.show(
              "Delete package",
              "Delete subpackages recursively?",
              new String[] {"Cancel", "Yes", "No"},
              MessageDialog.QUESTION);

      if (result != 1 && result != 2) return;

      removePackage(packageToRemove, model, result == 1);
    }
  }

  private void removePackage(
      final Package packageToRemove,
      final TypeModel typeModel,
      final boolean removeSubPackagesRecursively) {
    final ArrayList<Package> subPackagesToRemove = new ArrayList<>();

    typeModel
        .getElements()
        .stream()
        .filter(element -> !EcoreUtil.equals(packageToRemove, element))
        .forEach(
            element -> {
              if (element instanceof Class) {
                final Class clazz = (Class) element;
                if (EcoreUtil.equals(packageToRemove, clazz.getPackage())) {
                  clazz.setPackage(null);
                }
              } else if (element instanceof EnumeratedType) {
                final EnumeratedType enumType = (EnumeratedType) element;
                if (EcoreUtil.equals(enumType.getPackage(), packageToRemove)) {
                  enumType.setPackage(null);
                }
              } else if (element instanceof Package) {
                final Package otherPackage = (Package) element;
                if (EcoreUtil.equals(otherPackage.getContainerPackage(), packageToRemove)) {
                  if (removeSubPackagesRecursively) subPackagesToRemove.add(otherPackage);
                  else otherPackage.setContainerPackage(packageToRemove.getContainerPackage());
                }
              }
            });

    subPackagesToRemove.forEach(subPackage -> removePackage(subPackage, typeModel, true));
    typeModel.getElements().remove(packageToRemove);
  }

  public void movePackageUp(final EObject object) {
    ConML.castAndRun(
        object,
        Package.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(clazz, Package.class, ConML.ElementMovementDirection.UP));
  }

  public void movePackageDown(final EObject object) {
    ConML.castAndRun(
        object,
        Package.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(clazz, Package.class, ConML.ElementMovementDirection.DOWN));
  }
}
