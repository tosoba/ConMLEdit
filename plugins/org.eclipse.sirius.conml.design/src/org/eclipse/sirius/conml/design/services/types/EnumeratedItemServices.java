package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.types.EnumeratedItem;

public final class EnumeratedItemServices {

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
}
