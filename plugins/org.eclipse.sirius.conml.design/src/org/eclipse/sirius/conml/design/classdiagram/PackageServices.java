package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
                  Dialogs.show(
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
                if (EcoreUtil.equals(otherPackage.getContainerPackage(), packageToRemove)) {
                  if (removeSubPackagesRecursively) subPackagesToRemove.add(otherPackage);
                  else otherPackage.setContainerPackage(packageToRemove.getContainerPackage());
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

  public String packageLabel(EObject object) {
    if (!(object instanceof Package)) return "";
    Package packageIterator = (Package) object;
    final ArrayList<String> packageNames = new ArrayList<>();
    while (packageIterator != null) {
      packageNames.add(packageIterator.getName());
      packageIterator = packageIterator.getContainerPackage();
    }
    Collections.reverse(packageNames);
    return packageNames.stream().collect(Collectors.joining("."));
  }

  public Collection<Package> getCDOverallPackageSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Package.class)
        .stream()
        .filter(Package::isOverall)
        .collect(Collectors.toList());
  }
}
