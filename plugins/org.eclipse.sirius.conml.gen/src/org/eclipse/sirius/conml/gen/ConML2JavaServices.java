package org.eclipse.sirius.conml.gen;

import conml.types.Package;
import conml.types.TypeModel;

public class ConML2JavaServices {
  public Package getOverallPackage(final TypeModel typeModel) {
    return typeModel
        .getElements()
        .stream()
        .filter(
            element -> {
              if (!(element instanceof Package)) return false;
              final Package packageToCheck = (Package) element;
              return packageToCheck.isOverall();
            })
        .findAny()
        .map(Package.class::cast)
        .orElse(null);
  }
}
