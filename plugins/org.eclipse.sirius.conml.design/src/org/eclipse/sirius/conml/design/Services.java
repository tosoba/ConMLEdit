package org.eclipse.sirius.conml.design;

import java.util.Collection;

import conml.Model;
import conml.ModelElement;
import conml.types.Class;

public class Services {
    
	public Collection<Class> getCDClassSemanticCandidates(Model model) {
		return ConML.getAllElementsOfTypeFrom(model, Class.class);
	}
	
	public String getDefaultName(ModelElement element) {
		return ConML.labelFor(element);
	}
	
	public String getDefaultDefinition(ModelElement element) {
		return "";
	}
}
