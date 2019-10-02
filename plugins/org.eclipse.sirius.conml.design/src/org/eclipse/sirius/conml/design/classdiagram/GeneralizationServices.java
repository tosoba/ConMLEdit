package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Dialogs;

import conml.types.Class;
import conml.types.Generalization;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class GeneralizationServices {

	private static final class Errors {
		static final String OPPOSITE_GENERALIZATION_SAME_CLASSES = "An opposite generalization between the chosen classes already exists.";
	}

	private static final class Messages {
		static final String GENERALIZATION_WAS_NOT_CREATED = "Generalization was not created";
	}

	public Generalization createGeneralization(EObject object, Class source, Class target, EObject sourceView,
			EObject targetView) {
		// Prevent the creation of generalization between the same 2 classes in the
		// opposite direction
		final Generalization sourceSpecialization = source.getSpecialization();
		if (sourceSpecialization != null && sourceSpecialization.getSpecializedClass().stream()
				.filter(clazz -> EcoreUtil.equals(clazz, target)).findAny().isPresent()) {
			Dialogs.showError(Messages.GENERALIZATION_WAS_NOT_CREATED, Errors.OPPOSITE_GENERALIZATION_SAME_CLASSES);
			return null;
		}

		// If multiple classes inherit from one class - don't create a new
		// Generalization instance
		final Generalization targetSpecialization = target.getSpecialization();
		if (targetSpecialization != null) {
			if (!targetSpecialization.getSpecializedClass().contains(source)) {
				targetSpecialization.getSpecializedClass().add(source);
			}
			return targetSpecialization; // TODO: return existing or null - does it make any difference
		}

		// Otherwise create a new one
		final Generalization generalization = TypesFactory.eINSTANCE.createGeneralization();
		generalization.setDiscriminant(defaultDiscriminant(source, target));
		generalization.getSpecializedClass().add(source);
		source.getGeneralization().add(generalization);
		if (generalization.getGeneralizedClass() == null) {
			generalization.setGeneralizedClass(target);
		}
		if (target.getSpecialization() == null) {
			target.setSpecialization(generalization);
		}
		if (source.eContainer() instanceof TypeModel) {
			final TypeModel typeModel = (TypeModel) source.eContainer();
			typeModel.getOwnsElements().add(generalization);
		}
		return generalization;
	}

	private String defaultDiscriminant(Class inheritingClass, Class inheritedClass) {
		return inheritingClass.getName() + " from " + inheritedClass.getName();
	}

	public Collection<EObject> getGeneralizationSourceType(Generalization generalization) {
		return generalization.getSpecializedClass().stream().map(clazz -> (EObject) clazz).collect(Collectors.toList());
	}

	public Class getGeneralizationTargetType(Generalization generalization) {
		return generalization.getGeneralizedClass();
	}
}
