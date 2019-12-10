package org.eclipse.sirius.conml.design.services.types.validation;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.TypeModel;

public final class EnumeratedTypeValidationServices {

  public boolean enumeratedTypeDoesNotSpecializeFromItself(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedType.class,
        (final EnumeratedType enumType) -> {
          EnumeratedType superTypeIt = enumType.getSuperType();
          while (superTypeIt != null) {
            if (EcoreUtil.equals(enumType, superTypeIt)) return false;
            superTypeIt = superTypeIt.getSuperType();
          }
          return true;
        },
        true);
  }

  public boolean specializingEnumeratedTypeDoesNotHaveItsOwnRootItems(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedType.class,
        (final EnumeratedType enumType) -> {
          if (enumType.getSuperType() == null) return true;
          return !enumType.getOwnedItems().stream().anyMatch(item -> item.getSuperItem() == null);
        },
        true);
  }

  public boolean enumeratedTypeHasNonClashingName(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedType.class,
        (final EnumeratedType enumType) -> {
          final Package typePackage = enumType.getPackage();
          if (typePackage != null) {
            return !typePackage
                    .getEnumeratedTypes()
                    .stream()
                    .anyMatch(
                        type ->
                            !EcoreUtil.equals(enumType, type)
                                && Objects.equals(type.getName(), enumType.getName()))
                && ConML.containsOnlyOneExactlyEqualElement(
                    typePackage, enumType, Package::getEnumeratedTypes);
          } else {
            final TypeModel typeModel = enumType.getTypeModel();
            if (typeModel == null) return true;
            return !typeModel
                    .getElements()
                    .stream()
                    .anyMatch(
                        element -> {
                          if (!(element instanceof EnumeratedType)) return false;
                          final EnumeratedType type = (EnumeratedType) element;
                          return type.getPackage() == null
                              && !EcoreUtil.equals(enumType, type)
                              && Objects.equals(enumType.getName(), type.getName());
                        })
                && ConML.containsOnlyOneExactlyEqualElement(
                    typeModel, enumType, TypeModel::getElements);
          }
        },
        true);
  }

  public boolean enumeratedTypeNameIsValid(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedType.class,
        (final EnumeratedType enumType) -> !ConML.clashesWithAnyKeyword(enumType.getName()),
        true);
  }

  public boolean enumeratedTypeHasItems(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedType.class,
        (final EnumeratedType enumType) -> !enumType.getOwnedItems().isEmpty(),
        true);
  }
}
