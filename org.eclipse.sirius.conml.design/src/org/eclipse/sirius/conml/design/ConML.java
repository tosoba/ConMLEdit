package org.eclipse.sirius.conml.design;

import org.eclipse.emf.ecore.EObject;

import conml.Model;

public class ConML {
	private ConML() {
	}

	public static Model modelOf(EObject object) {
		return (Model) object.eContainer();
	}
}
