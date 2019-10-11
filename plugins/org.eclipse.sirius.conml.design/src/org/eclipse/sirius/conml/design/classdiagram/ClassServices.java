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

  public boolean isUsedAsSubjectiveAspectClassAssignedToTypeModel(Class clazz) {
    return !clazz.isUsedAsSubjectiveAspect()
        || (clazz.isUsedAsSubjectiveAspect()
            && ConML.anyExistingContainerHasReferenceTo(
                clazz, TypeModel::getSubjectiveAspect, TypeModel.class));
  }

  public boolean isTemporalAspectClassAssignedToTypeModel(Class clazz) {
    return !clazz.isUsedAsTemporalAspect()
        || (clazz.isUsedAsTemporalAspect()
            && ConML.anyExistingContainerHasReferenceTo(
                clazz, TypeModel::getTemporalAspect, TypeModel.class));
  }

  public String classLabel(Class clazz) {
    if (clazz == null) {
      return "";
    }

    final StringBuilder sb = new StringBuilder();
    ArrayList<String> markers = new ArrayList<>();
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
}
