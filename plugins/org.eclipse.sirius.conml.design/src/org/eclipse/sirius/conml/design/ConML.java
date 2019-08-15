package org.eclipse.sirius.conml.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

import conml.Model;

public class ConML {
	private ConML() {
	}

	public static Model modelOf(EObject object) {
		return (Model) object.eContainer();
	}

	@SuppressWarnings("unchecked")
	public static <T> Collection<T> getAllElementsOfTypeFrom(Model model, Class<T> clazz) {
		final Set<T> candidates = new HashSet<>();
		ConML.forEachEObjectOf(model, (object) -> {
			if (clazz.isInstance(object))
				candidates.add((T) object);
		});
		return candidates;
	}

	public static void forEachEObjectOf(Model model, Consumer<EObject> action) {
		model.eAllContents().forEachRemaining(action);
	}

	public static String labelFor(final EObject element) {
		String name = element.getClass().getSimpleName().replace("Impl", "");
		Collection<?> elementsOfSameType = getAllElementsOfTypeFrom(modelOf(element), element.getClass());
		return name + elementsOfSameType.size();
	}	
}
