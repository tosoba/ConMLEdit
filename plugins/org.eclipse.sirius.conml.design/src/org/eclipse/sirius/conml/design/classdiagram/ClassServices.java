package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Class;
import conml.types.Package;
import conml.types.TypeModel;

public class ClassServices implements ModelElementServices {

  public Collection<Class> getCDClassSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Class.class);
  }

  private boolean isAspectAssignedToTypeModel(
      EObject object,
      Function<Class, Boolean> isUsedAsAspectGetter,
      Function<TypeModel, Class> aspectGetter) {
    if (!(object instanceof Class)) return true;

    final Class clazz = (Class) object;
    final boolean usedAsAspect = isUsedAsAspectGetter.apply(clazz);
    return !usedAsAspect
        || (usedAsAspect
            && ConML.anyExistingContainerHasReferenceTo(clazz, aspectGetter, TypeModel.class));
  }

  public boolean isSubjectiveAspectClassAssignedToTypeModel(EObject object) {
    return isAspectAssignedToTypeModel(
        object, Class::isUsedAsSubjectiveAspect, TypeModel::getSubjectiveAspect);
  }

  public boolean isTemporalAspectClassAssignedToTypeModel(EObject object) {
    return isAspectAssignedToTypeModel(
        object, Class::isUsedAsTemporalAspect, TypeModel::getTemporalAspect);
  }

  public String classLabel(Class clazz) {
    if (clazz == null) return "";

    final StringBuilder sb = new StringBuilder();
    final ArrayList<String> markers = new ArrayList<>();
    if (clazz.isUsedAsSubjectiveAspect()) markers.add("S");
    if (clazz.isUsedAsTemporalAspect()) markers.add("T");
    if (!markers.isEmpty())
      sb.append('[').append(markers.stream().collect(Collectors.joining(","))).append("] ");

    Package packageIterator = clazz.getPackage();
    final ArrayList<String> packageNames = new ArrayList<>();
    boolean containedInOverallPackage = false;
    while (packageIterator != null) {
      if (EcoreUtil.equals(packageIterator, packageIterator.getContainerPackage())) {
        break; // to prevent endless loop in case user makes a mistake (self-containment)
      } else if (packageIterator.isOverall()) {
        containedInOverallPackage = true;
        break;
      }
      packageNames.add(packageIterator.getName());
      packageIterator = packageIterator.getContainerPackage();
    }
    if (!packageNames.isEmpty()) {
      if (containedInOverallPackage) sb.append('.');
      Collections.reverse(packageNames);
      sb.append(packageNames.stream().collect(Collectors.joining("."))).append('.');
    }

    sb.append(clazz.getName());

    if (clazz.isAbstract()) sb.append(" (A)");

    return sb.toString();
  }

  public void moveClassUp(EObject object) {
    moveElement(object, Class.class, ConML.ElementMovementDirection.UP);
  }

  public void moveClassDown(EObject object) {
    moveElement(object, Class.class, ConML.ElementMovementDirection.DOWN);
  }
}
