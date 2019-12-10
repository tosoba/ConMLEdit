package org.eclipse.sirius.conml.design.services.types.label;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.types.Package;

public final class PackageLabelServices {

  private static final class InstanceHolder {
    static final PackageLabelServices INSTANCE = new PackageLabelServices();
  }

  public static PackageLabelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public String packageLabel(final EObject object) {
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
}
