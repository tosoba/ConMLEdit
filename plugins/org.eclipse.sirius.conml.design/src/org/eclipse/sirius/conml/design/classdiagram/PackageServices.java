package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Package;
import conml.types.TypeModel;

public class PackageServices extends ModelElementServices {

  public void removePackage(EObject object) {
    if (!(object instanceof Package)) return;
    final Package _package = (Package) object;
    final EObject container = _package.eContainer();
    if (!(container instanceof TypeModel)) return;
    final TypeModel typeModel = (TypeModel) container;

    typeModel
        .getElements()
        .forEach(
            element -> {
              if (element instanceof Class) {
                Class clazz = (Class) element;
                if (EcoreUtil.equals(_package, clazz.getPackage())) {
                  clazz.setPackage(null);
                }
              } else if (element instanceof EnumeratedType) {
                EnumeratedType enumType = (EnumeratedType) element;
                if (EcoreUtil.equals(enumType.getPackage(), _package)) {
                  enumType.setPackage(null);
                }
              }
            });

    typeModel.getElements().remove(_package);
  }

  public void movePackageUp(EObject object) {
    if (!(object instanceof Package)) return;
    final Package _package = (Package) object;
    moveElement(_package, Package.class, ConML.ElementMovementDirection.UP);
  }

  public void movePackageDown(EObject object) {
    if (!(object instanceof Package)) return;
    final Package _package = (Package) object;
    moveElement(_package, Package.class, ConML.ElementMovementDirection.DOWN);
  }

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
