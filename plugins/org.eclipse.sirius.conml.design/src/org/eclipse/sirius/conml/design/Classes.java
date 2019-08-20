package org.eclipse.sirius.conml.design;

import java.util.Collection;

import conml.Model;
import conml.types.Class;

public class Classes {
	
	public static boolean isTemporalAspectClassAssignedToTypeModel(Class clazz) {
		return !clazz.isIsTemporalAspect() || (clazz.isIsTemporalAspect() && clazz.getIsTemporalAspectOf() != null
				&& !clazz.getIsTemporalAspectOf().isEmpty());
	}
	
	public static boolean isSubjectiveAspectClassAssignedToTypeModel(Class clazz) {
		return !clazz.isIsSubjectiveAspect() || (clazz.isIsSubjectiveAspect() && clazz.getIsSubjectiveAspectOf() != null
				&& !clazz.getIsSubjectiveAspectOf().isEmpty());
	}
	
	public static Collection<Class> getAllFrom(Model model) {
		return ConML.getAllElementsOfTypeFrom(model, Class.class);
	}
}
