package org.eclipse.sirius.conml.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import conml.ModelPart;
import conml.types.Class;

public class Services {
    
	public Collection<Class> getCDClassSemanticCandidates(ModelPart modelPart) {
		final Set<Class> classes = new HashSet<>();
		ConML.modelOf(modelPart).eAllContents().forEachRemaining(object -> {
			if (object instanceof Class)
				classes.add((Class) object);
		});
		return classes;
	}
}
