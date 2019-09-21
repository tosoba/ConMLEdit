package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;

import org.eclipse.sirius.conml.design.ConML;

import conml.Model;
import conml.types.Class;

public class ClassServices {

	public boolean temporalAspectClassIsAssignedToTypeModel(Class clazz) {
		return !clazz.isIsTemporalAspect() || (clazz.isIsTemporalAspect() && clazz.getIsTemporalAspectOf() != null
				&& !clazz.getIsTemporalAspectOf().isEmpty());
	}

	public boolean subjectiveAspectClassIsAssignedToTypeModel(Class clazz) {
		return !clazz.isIsSubjectiveAspect() || (clazz.isIsSubjectiveAspect() && clazz.getIsSubjectiveAspectOf() != null
				&& !clazz.getIsSubjectiveAspectOf().isEmpty());
	}

	public Collection<Class> getCDClassSemanticCandidates(Model model) {
		return ConML.getAllElementsOfTypeFrom(model, Class.class);
	}
}
