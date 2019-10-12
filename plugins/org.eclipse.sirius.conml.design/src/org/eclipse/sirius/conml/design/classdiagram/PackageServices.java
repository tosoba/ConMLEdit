package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Package;

public class PackageServices {
  public Collection<Package> getCDOverallPackageSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Package.class)
        .stream()
        .filter(Package::isOverall)
        .collect(Collectors.toList());
  }
}
