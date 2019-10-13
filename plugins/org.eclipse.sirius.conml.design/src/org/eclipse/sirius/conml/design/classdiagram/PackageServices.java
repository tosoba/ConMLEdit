package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.conml.design.ConML;
import org.eclipse.sirius.conml.design.Dialogs;

import conml.Model;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Package;

public class PackageServices extends ModelElementServices {

  public void removePackage(EObject object) {
    ConML.castElementAndContainer(object, Package.class, Model.class)
        .ifBothCastsSuccessful(
            (packageToRemove, model) -> {
              final int result =
                  Dialogs.openWith(
                      "Delete package",
                      "Delete subpackages recursively?",
                      new String[] {"Cancel", "Yes", "No"},
                      MessageDialog.QUESTION);

              if (result != 1 && result != 2) return;

              removePackage(packageToRemove, model, result == 1);
            });
  }

  private void removePackage(
      Package packageToRemove, Model typeModel, boolean removeSubPackagesRecursively) {
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
                if (EcoreUtil.equals(otherPackage.getIsSubPackageOf(), packageToRemove)) {
                  if (removeSubPackagesRecursively) subPackagesToRemove.add(otherPackage);
                  else otherPackage.setIsSubPackageOf(packageToRemove.getIsSubPackageOf());
                }
              }
            });

    subPackagesToRemove.forEach(subPackage -> removePackage(subPackage, typeModel, true));
    typeModel.getElements().remove(packageToRemove);
  }

  public void movePackageUp(EObject object) {
    movePackage(object, ConML.ElementMovementDirection.UP);
  }

  public void movePackageDown(EObject object) {
    movePackage(object, ConML.ElementMovementDirection.DOWN);
  }

  private void movePackage(EObject object, ConML.ElementMovementDirection direction) {
    ConML.castElementAndContainer(object, Package.class, Model.class)
        .ifBothCastsSuccessful(
            (_package, model) ->
                moveElements(Arrays.asList(_package), model, Package.class, direction));
  }

  public String getPackageName(EObject object) {
    if (!(object instanceof Package)) return "";
    final Package _package = (Package) object;
    return _package.getName();
  }

  public Collection<Package> getCDOverallPackageSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Package.class)
        .stream()
        .filter(Package::isOverall)
        .collect(Collectors.toList());
  }
}
