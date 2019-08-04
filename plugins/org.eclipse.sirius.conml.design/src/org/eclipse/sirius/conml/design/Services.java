package org.eclipse.sirius.conml.design;

import java.util.Collection;

import conml.ModelPart;
import conml.types.Class;
import static org.eclipse.sirius.conml.design.ConML.modelOf;

public class Services {
    
	public Collection<Class> getCDClassSemanticCandidates(ModelPart modelPart) {
		return ConML.getAllElementsOfTypeFrom(modelOf(modelPart), Class.class);
	}
	
	public String getDefaultName(ModelPart modelPart) {
		return ConML.labelFor(modelPart);
	}
	
	public String getDefaultDefinition(ModelPart modelPart) {
		return "";
	}
}
