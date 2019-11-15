package org.eclipse.sirius.conml.design.services.classdiagram.validation;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.classdiagram.PackageServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Package;
import conml.types.TypeModel;

public final class PackageValidationServices {

  public boolean overallPackageExists(final EObject containerObject) {
    return !PackageServices.getInstance().overallPackageDoesNotExist(containerObject);
  }

  public boolean isNotSubPackageOfItself(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        Package.class,
        packageToValidate ->
            !EcoreUtil.equals(packageToValidate, packageToValidate.getContainerPackage()),
        true);
  }

  public boolean packageWithSameNameDoesNotExist(final EObject object) {
    return ConML.castElementAndContainer(object, Package.class, TypeModel.class)
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
                    && ConML.containsOnlyOneExactlyEqualElement(
                        model, packageToCheck, TypeModel::getElements),
            true);
  }
}
