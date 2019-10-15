package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Class;
import conml.types.TypeModel;

public class ClassServices extends ModelElementServices {

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
    if (clazz == null) {
      return "";
    }

    final StringBuilder sb = new StringBuilder();
    final ArrayList<String> markers = new ArrayList<>();
    if (clazz.isUsedAsSubjectiveAspect()) {
      markers.add("S");
    }
    if (clazz.isUsedAsTemporalAspect()) {
      markers.add("T");
    }
    if (!markers.isEmpty()) {
      sb.append('[').append(markers.stream().collect(Collectors.joining(","))).append("] ");
    }

    sb.append(clazz.getName());

    if (clazz.isAbstract()) {
      sb.append(" (A)");
    }

    return sb.toString();
  }

  public void moveClassUp(EObject object) {
    moveElement(object, Class.class, ConML.ElementMovementDirection.UP);
  }

  public void moveClassDown(EObject object) {
    moveElement(object, Class.class, ConML.ElementMovementDirection.DOWN);
  }
}
