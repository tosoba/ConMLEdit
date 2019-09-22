package org.eclipse.sirius.conml.design.classdiagram;

import org.eclipse.emf.ecore.EObject;

import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class AssociationServices {

	public String associationBeginLabel(Association association) {
		return association.getHasPrimary().getRole();
	}

	public String associationEndLabel(Association association) {
		return association.getHasSecondary().getRole();
	}

	public Class getAssociationSourceType(Association association) {
		return association.getHasPrimary() != null ? association.getHasPrimary().getOwner() : null;
	}

	public Class getAssociationTargetType(Association association) {
		return association.getHasSecondary() != null ? association.getHasSecondary().getOwner() : null;
	}

	public Association createAssociation(EObject object, Class source, Class target, EObject sourceView,
			EObject targetView) {
		final Association association = TypesFactory.eINSTANCE.createAssociation();
		association.setDefinition("");
		final String primaryName = source.getName() + "s";
		association.setName(primaryName);

		final SemiAssociation primary = TypesFactory.eINSTANCE.createSemiAssociation();
		primary.setName(primaryName);
		primary.setRole(primaryName);
		primary.setIsPrimaryIn(association);
		primary.setRefersTo(target);
		target.getIsOppositeClassIn().add(primary);
		association.setHasPrimary(primary);

		final SemiAssociation secondary = TypesFactory.eINSTANCE.createSemiAssociation();
		final String secondaryName = target.getName() + "s";
		secondary.setName(secondaryName);
		secondary.setRole(secondaryName);
		secondary.setIsSecondaryIn(association);
		secondary.setRefersTo(source);
		source.getIsOppositeClassIn().add(secondary);
		association.setHasSecondary(secondary);

		source.getOwnsSemiassociations().add(primary);
		target.getOwnsSemiassociations().add(secondary);

		if (source.eContainer() instanceof TypeModel) {
			final TypeModel typeModel = (TypeModel) source.eContainer();
			typeModel.getOwnsElements().add(association);
		}
		return association;
	}

	public void addToAssociation(SemiAssociation primary, Class source) {
		final Association association = TypesFactory.eINSTANCE.createAssociation();
		association.setDefinition("");
		final String primaryName = source.getName() + "s";
		association.setName(primaryName);

		Class target = primary.getRefersTo();
		if (target == null) {
			source.getOwnsSemiassociations().remove(primary);
			return; // TODO: do not create association at all + show dialog indicating error
		}

		final SemiAssociation secondary = TypesFactory.eINSTANCE.createSemiAssociation();
		final String secondaryName = target.getName() + "s";
		secondary.setName(secondaryName);
		secondary.setRole(secondaryName);
		secondary.setIsSecondaryIn(association);
		secondary.setRefersTo(source);
		source.getIsOppositeClassIn().add(secondary);
		association.setHasSecondary(secondary);

		source.getOwnsSemiassociations().add(primary);
		target.getOwnsSemiassociations().add(secondary);

		if (source.eContainer() instanceof TypeModel) {
			final TypeModel typeModel = (TypeModel) source.eContainer();
			typeModel.getOwnsElements().add(association);
		}
	}

	public void addToOwnedSemiAssociations(SemiAssociation semiAssociation, Class clazz) {
		clazz.getOwnsSemiassociations().add(semiAssociation);
	}
}
