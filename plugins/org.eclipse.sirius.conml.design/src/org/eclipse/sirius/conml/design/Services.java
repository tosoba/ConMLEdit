package org.eclipse.sirius.conml.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import conml.Model;
import conml.ModelElement;
import conml.types.Class;

public class Services {

	public Collection<Class> getCDClassSemanticCandidates(Model model) {
		return ConML.getAllElementsOfTypeFrom(model, Class.class);
	}

	public String defaultName(ModelElement element) {
		return ConML.labelFor(element);
	}

	public String defaultDefinition(ModelElement element) {
		return "";
	}

	public int defaultWidth(EObject object) {
		return UserInterface.defaultWidthFor(object);
	}

	public int defaultHeight(EObject object) {
		return UserInterface.defaultHeightFor(object);
	}
}
