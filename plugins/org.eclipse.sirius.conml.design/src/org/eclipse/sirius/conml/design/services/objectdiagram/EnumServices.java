package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.types.EnumeratedItem;

public class EnumServices {
  public static String getAbsouluteNameOf(final EnumeratedItem enumItem) {
    if (enumItem == null) return "";
    final ArrayList<String> names = new ArrayList<>();
    names.add(enumItem.getName());
    EnumeratedItem itEnumItem = enumItem.getSubItemOfEnumeratedItem();
    while (itEnumItem != null
        && !EcoreUtil.equals(itEnumItem, itEnumItem.getSubItemOfEnumeratedItem())) {
      names.add(itEnumItem.getName());
      itEnumItem = itEnumItem.getSubItemOfEnumeratedItem();
    }
    Collections.reverse(names);
    return names.stream().collect(Collectors.joining("/"));
  }
}
