package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;

public class EnumeratedItemServices {

  public static String getAbsouluteNameOf(final EnumeratedItem enumItem) {
    if (enumItem == null) return "";
    final ArrayList<String> names = new ArrayList<>();
    names.add(enumItem.getName());
    EnumeratedItem itEnumItem = enumItem.getSuperItem();
    while (itEnumItem != null && !EcoreUtil.equals(itEnumItem, itEnumItem.getSuperItem())) {
      names.add(itEnumItem.getName());
      itEnumItem = itEnumItem.getSuperItem();
    }
    Collections.reverse(names);
    return names.stream().collect(Collectors.joining("/"));
  }

  public boolean enumeratedItemIsNotSubItemOfItself(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedItem.class,
        (final EnumeratedItem enumItem) -> {
          EnumeratedItem superItemIt = enumItem.getSuperItem();
          while (superItemIt != null) {
            if (EcoreUtil.equals(enumItem, superItemIt)) return false;
            superItemIt = superItemIt.getSuperItem();
          }
          return true;
        },
        true);
  }

  public boolean enumeratedItemsSuperItemDoesNotBelongToUnrelatedType(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedItem.class,
        (EnumeratedItem enumItem) -> {
          final EnumeratedType enumType = enumItem.getOwnerType();
          if (enumType == null) return true;
          final EnumeratedItem superItem = enumItem.getSuperItem();
          if (superItem == null) return true;
          final EnumeratedType superItemType = superItem.getOwnerType();
          if (superItemType == null) return true;

          EnumeratedType superTypeIt = enumType.getSuperType();
          while (superTypeIt != null && !EcoreUtil.equals(superTypeIt, enumType)) {
            if (EcoreUtil.equals(superTypeIt, superItemType)) return true;
            superTypeIt = superTypeIt.getSuperType();
          }
          return false;
        },
        true);
  }

  public boolean enumeratedItemNameIsValid(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedItem.class,
        (final EnumeratedItem enumItem) -> !ConML.clashesWithAnyKeyword(enumItem.getName()),
        true);
  }

  public boolean enumeratedItemHasNonClashingName(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        EnumeratedItem.class,
        (final EnumeratedItem enumItem) -> {
          final String name = enumItem.getName();
          final EnumeratedType enumType = enumItem.getOwnerType();
          if (name == null
              || name.isEmpty()
              || ConML.clashesWithAnyKeyword(name)
              || enumType == null) return true;
          final EnumeratedItem superItem = enumItem.getSuperItem();
          if (superItem == null) {
            return !enumType
                .getOwnedItems()
                .stream()
                .anyMatch(
                    item ->
                        !EcoreUtil.equals(enumItem, item)
                            && item.getSuperItem() == null
                            && Objects.equals(enumItem.getName(), item.getName()));
          } else {
            return superItem
                .getSubItems()
                .stream()
                .anyMatch(
                    item ->
                        !EcoreUtil.equals(enumItem, item)
                            && Objects.equals(enumItem.getName(), item.getName()));
          }
        },
        true);
  }
}
