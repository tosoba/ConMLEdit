package org.eclipse.sirius.conml.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import conml.ModelElement;

public abstract class AbstractDiagramServices {

	public boolean isEnabled(EObject eObject, EStructuralFeature feature) {
		return true;
	}

	public String defaultName(ModelElement element) {
		final String name = element.getClass().getSimpleName().replace("Impl", "");

		final EObject container = element.eContainer();
		if (container != null) {
			final Collection<?> elementsOfSameType = ConML.getAllElementsOfTypeFrom(container, element.getClass());
			return name + elementsOfSameType.size();
		}

		final EStructuralFeature containingFeature = element.eContainingFeature();
		if (containingFeature != null) {
			final Collection<?> elementsOfSameType = ConML.getAllElementsOfTypeFrom(containingFeature,
					element.getClass());
			return name + elementsOfSameType.size();
		}

		return name;
	}

	public String defaultDefinition(ModelElement element) {
		return "";
	}

	public int defaultWidth(EObject object) {
		return 12;
	}

	public int defaultHeight(EObject object) {
		return 10;
	}

	public String getWidgetLabel(EObject element, EStructuralFeature structuralFeature) {
		return structuralFeature != null ? structuralFeature.getName() : "New element";
	}
}
