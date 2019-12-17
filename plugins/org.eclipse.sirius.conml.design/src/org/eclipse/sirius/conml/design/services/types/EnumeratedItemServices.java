package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.types.label.PackageLabelServices;

import conml.types.EnumeratedItem;

public final class EnumeratedItemServices {

  private static final class InstanceHolder {
    static final EnumeratedItemServices INSTANCE = new EnumeratedItemServices();
  }

  public static EnumeratedItemServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public String getAbsoluteNameOfEnumeratedItem(final EnumeratedItem enumItem) {
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

  public String getFullNameOfEnumeratedItem(final EnumeratedItem enumItem) {
    return enumItem.getOwnerType().getName() + "." + getAbsoluteNameOfEnumeratedItem(enumItem);
  }

  public String getFullyQualifiedNameOfEnumeratedItem(final EnumeratedItem enumItem) {
    if (enumItem.getOwnerType().getPackage() == null) return getFullNameOfEnumeratedItem(enumItem);
    else
      return PackageLabelServices.getInstance().packageLabel(enumItem.getOwnerType().getPackage())
          + "."
          + getFullNameOfEnumeratedItem(enumItem);
  }
}
