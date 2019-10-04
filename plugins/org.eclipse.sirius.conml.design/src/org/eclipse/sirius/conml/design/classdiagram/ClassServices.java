package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;

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
}
