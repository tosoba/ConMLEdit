package org.eclipse.sirius.conml.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

public class ConML {
	private ConML() {
	}

	@SuppressWarnings("unchecked")
	public static <T> Collection<T> getAllElementsOfTypeFrom(EObject parentObject, Class<T> clazz) {
		Set<T> candidates = new HashSet<>();
		ConML.forEachEObjectOf(parentObject, (object) -> {
			if (clazz.isInstance(object))
				candidates.add((T) object);
		});
		return candidates;
	}

	public static void forEachEObjectOf(EObject parentObject, Consumer<EObject> action) {
		parentObject.eAllContents().forEachRemaining(action);
	}

	public static String labelFor(EObject element) {
		String name = element.getClass().getSimpleName().replace("Impl", "");
		EObject container = element.eContainer();
		if (container != null) {
			Collection<?> elementsOfSameType = getAllElementsOfTypeFrom(container, element.getClass());
			return name + elementsOfSameType.size();
		} else {
			return name;
		}
	}

	public static String definitionFor(EObject element) {
		return "";
	}
}
