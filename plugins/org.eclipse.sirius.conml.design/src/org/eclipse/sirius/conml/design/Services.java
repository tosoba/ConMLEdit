package org.eclipse.sirius.conml.design;

import java.util.Collection;

import conml.ModelElement;
import conml.types.Class;
import static org.eclipse.sirius.conml.design.ConML.modelOf;

public class Services {
    
	public Collection<Class> getCDClassSemanticCandidates(ModelElement element) {
		return ConML.getAllElementsOfTypeFrom(modelOf(element), Class.class);
	}
	
	public String getDefaultName(ModelElement element) {
		return ConML.labelFor(element);
	}
	
	public String getDefaultDefinition(ModelElement element) {
		return "";
	}
}
