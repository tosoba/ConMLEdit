package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Package;

public class PackageServices {

  public String getPackageName(EObject object) {
    if (!(object instanceof Package)) return "";
    final Package _package = (Package) object;
    return _package.getName();
  }

  public Collection<Package> getCDOverallPackageSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Package.class)
        .stream()
        .filter(Package::isOverall)
        .collect(Collectors.toList());
  }
}
