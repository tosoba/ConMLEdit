package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Class;
import conml.types.TypeModel;

public class ClassServices {

  public Collection<Class> getCDClassSemanticCandidates(Model model) {
    return ConML.getAllElementsOfTypeFrom(model, Class.class);
  }

  public boolean isSubjectiveAspectClassAssignedToTypeModel(Class clazz) {
    return !clazz.isIsSubjectiveAspect()
        || (clazz.isIsSubjectiveAspect()
            && ConML.anyExistingContainerHasReferenceTo(
                clazz, TypeModel::getSubjectiveAspect, TypeModel.class));
  }

  public boolean isTemporalAspectClassAssignedToTypeModel(Class clazz) {
    return !clazz.isIsTemporalAspect()
        || (clazz.isIsTemporalAspect()
            && ConML.anyExistingContainerHasReferenceTo(
                clazz, TypeModel::getTemporalAspect, TypeModel.class));
  }

  public String classLabel(Class clazz) {
    if (clazz == null) {
      return "";
    }

    final StringBuilder sb = new StringBuilder();
    ArrayList<String> markers = new ArrayList<>();
    if (clazz.isIsSubjectiveAspect()) {
      markers.add("S");
    }
    if (clazz.isIsTemporalAspect()) {
      markers.add("T");
    }

    if (!markers.isEmpty()) {
      sb.append('[').append(markers.stream().collect(Collectors.joining(","))).append("] ");
    }

    sb.append(clazz.getName());

    if (clazz.isIsAbstract()) {
      sb.append(" (A)");
    }

    return sb.toString();
  }
}
