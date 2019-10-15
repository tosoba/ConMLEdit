package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
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

  public void setOverall(Package packageToSet) {
    if (!(packageToSet.eContainer() instanceof Model)) return;
    final Model model = (Model) packageToSet.eContainer();
    final Optional<Package> currentOverallPackage =
        model
            .getElements()
            .stream()
            .filter(
                element -> {
                  if (!(element instanceof Package)) return false;
                  final Package otherPackage = (Package) element;
                  return otherPackage.isOverall();
                })
            .map(Package.class::cast)
            .findAny();
    if (currentOverallPackage.isPresent()) {
      final int result =
          Dialogs.show(
              "Overall package already set.",
              "Unset current overall package : " + packageLabel(currentOverallPackage.get()) + "?",
              new String[] {"Yes", "No"},
              MessageDialog.CONFIRM);
      if (result == 0) currentOverallPackage.get().setOverall(false);
      else return;
    }
    packageToSet.setOverall(true);
  }

  public boolean isNonOverallPackage(EObject object) {
    return ConML.castAndRunOrReturn(
        object, Package.class, (Package packageToCheck) -> !packageToCheck.isOverall(), false);
  }

  public void removePackage(EObject object) {
    ConML.castElementAndContainer(object, Package.class, Model.class)
        .ifBothCastsSuccessful(
            (packageToRemove, model) -> {
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
    moveElement(object, Package.class, ConML.ElementMovementDirection.UP);
  }

  public void movePackageDown(EObject object) {
    moveElement(object, Package.class, ConML.ElementMovementDirection.DOWN);
  }

  public String packageLabel(EObject object) {
    if (!(object instanceof Package)) return "";
    Package packageIterator = (Package) object;
    final ArrayList<String> packageNames = new ArrayList<>();
    while (packageIterator != null) {
      packageNames.add(packageIterator.getName());
      // prevents endless loop if user makes a mistake and sets package as a container of itself
      if (EcoreUtil.equals(packageIterator, packageIterator.getContainerPackage())) break;
      packageIterator = packageIterator.getContainerPackage();
    }
    Collections.reverse(packageNames);
    return packageNames.stream().collect(Collectors.joining("."));
  }

  public boolean isNotSubPackageOfItself(EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Package.class,
        packageToValidate ->
            !EcoreUtil.equals(packageToValidate, packageToValidate.getContainerPackage()),
        true);
  }

  public boolean packageWithSameNameDoesNotExist(EObject object) {
    return ConML.castElementAndContainer(object, Package.class, Model.class)
        .runIfBothCastsSuccessful(
            (packageToCheck, model) ->
                !model
                        .getElements()
                        .stream()
                        .filter(
                            element -> {
                              if (element instanceof Package) {
                                final Package otherPackage = (Package) element;
                                return Objects.equals(
                                        otherPackage.getName(), packageToCheck.getName())
                                    && !EcoreUtil.equals(packageToCheck, otherPackage)
                                    && EcoreUtil.equals(
                                        otherPackage.getContainerPackage(),
                                        packageToCheck.getContainerPackage());
                              } else return false;
                            })
                        .findAny()
                        .isPresent()
                    && model
                            .getElements()
                            .stream()
                            .filter(element -> EcoreUtil.equals(element, packageToCheck))
                            .count()
                        == 1,
            true);
  }

  public Collection<Package> getCDOverallPackageSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Package.class)
        .stream()
        .filter(Package::isOverall)
        .collect(Collectors.toList());
  }
}
