package org.eclipse.sirius.conml.design.services.types.label;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.common.UIServices;
import org.eclipse.sirius.diagram.DDiagram;

import conml.types.Class;
import conml.types.Package;

public final class ClassLabelServices {

  private static final class InstanceHolder {
    static final ClassLabelServices INSTANCE = new ClassLabelServices();
  }

  public static ClassLabelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public String classLabel(final Class clazz, final DDiagram diagram) {
    if (clazz == null) return "";

    final StringBuilder sb = new StringBuilder();
    final ArrayList<String> markers = new ArrayList<>();
    if (clazz.isUsedAsSubjectiveAspect()) markers.add("S");
    if (clazz.isUsedAsTemporalAspect()) markers.add("T");
    if (!markers.isEmpty())
      sb.append('[').append(markers.stream().collect(Collectors.joining(","))).append("] ");

    Package packageIterator = clazz.getPackage();
    final ArrayList<String> packageNames = new ArrayList<>();
    boolean containedInOverallPackageAndOverallPackageVisible = false;
    while (packageIterator != null
        && !EcoreUtil.equals(
            packageIterator,
            packageIterator.getContainerPackage())) { // prevents endless loop in case of package
      // self-containment error
      if (packageIterator.isOverall()
          && UIServices.getInstance()
              .getDisplayedNodesOfType(diagram, Package.class)
              .stream()
              .anyMatch(Package::isOverall)) {
        containedInOverallPackageAndOverallPackageVisible = true;
        break;
      }
      packageNames.add(packageIterator.getName());
      packageIterator = packageIterator.getContainerPackage();
    }
    if (!packageNames.isEmpty()) {
      if (containedInOverallPackageAndOverallPackageVisible) sb.append('.');
      Collections.reverse(packageNames);
      sb.append(packageNames.stream().collect(Collectors.joining("."))).append('.');
    }

    sb.append(clazz.getName());

    if (clazz.isAbstract()) sb.append(" (A)");

    return sb.toString();
  }
}
