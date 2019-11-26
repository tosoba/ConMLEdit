package org.eclipse.sirius.conml.gen;

import java.util.List;
import java.util.stream.Collectors;

import conml.Domain;
import conml.types.Class;
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

  public List<String> getFirstCharactersListOfClasses(final Domain domain) {
    return domain
        .getParts()
        .stream()
        .filter(Class.class::isInstance)
        .map(part -> ((Class) part).getName())
        .filter(name -> name != null && !name.isEmpty())
        .map(name -> String.valueOf(name.charAt(0)))
        .sorted()
        .distinct()
        .collect(Collectors.toList());
  }
}
