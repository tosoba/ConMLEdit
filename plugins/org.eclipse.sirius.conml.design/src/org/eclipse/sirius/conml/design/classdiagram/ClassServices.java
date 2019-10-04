package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
            && findReferenceToClassInExistingTypeModels(clazz, TypeModel::getSubjectiveAspect));
  }

  public boolean isTemporalAspectClassAssignedToTypeModel(Class clazz) {
    return !clazz.isIsTemporalAspect()
        || (clazz.isIsTemporalAspect()
            && findReferenceToClassInExistingTypeModels(clazz, TypeModel::getTemporalAspect));
  }

  private boolean findReferenceToClassInExistingTypeModels(
      Class clazz, Function<TypeModel, Class> referenceGetter) {
    EObject rootContainer = EcoreUtil.getRootContainer(clazz);
    Stream<TypeModel> descedentTypeModelsStream =
        ConML.getAllElementsOfTypeFrom(EcoreUtil.getRootContainer(clazz), TypeModel.class).stream();
    Stream<TypeModel> typeModelsStream =
        rootContainer instanceof TypeModel
            ? Stream.concat(Stream.of((TypeModel) rootContainer), descedentTypeModelsStream)
            : descedentTypeModelsStream;
    return typeModelsStream
        .filter(typeModel -> EcoreUtil.equals(clazz, referenceGetter.apply(typeModel)))
        .findAny()
        .isPresent();
  }
}
