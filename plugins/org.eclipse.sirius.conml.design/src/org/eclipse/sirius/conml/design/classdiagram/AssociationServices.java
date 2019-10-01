package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Dialogs;

import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class AssociationServices {

	private static final String ERROR_ASSOCIATION_TARGET_IS_NULL = "Association target must be specified.";
	private static final String ERROR_COMPACT_SYMMETRIC_ASSOCIATION = "Compact style cannot be used for symmetric associations.";

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
		association.setIsCompact(false);
		final String primaryName = source.getName() + "s";
		association.setName(primaryName);

		// TODO: default cardinalities???
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
		// TODO: validation that checks if association matches con/sha/ref patterns (p.
		// 49)

		final Association association = TypesFactory.eINSTANCE.createAssociation();
		association.setDefinition("");
		association.setIsCompact(true);
		final String primaryName = source.getName() + "s";
		association.setName(primaryName);

		primary.setIsPrimaryIn(association);

		Class target = primary.getRefersTo();
		if (target == null) {
			source.getOwnsSemiassociations().remove(primary);
			Dialogs.showError(ERROR_ASSOCIATION_TARGET_IS_NULL);
			return;
		} else if (EcoreUtil.equals(source, target)) {
			source.getOwnsSemiassociations().remove(primary);
			Dialogs.showError(ERROR_COMPACT_SYMMETRIC_ASSOCIATION);
			return;
		}

		// TODO: cardinalities for secondary association
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

	public boolean shouldDisplayCompactLabel(SemiAssociation semiAssociation) {
		final Association association = semiAssociation.getIsPrimaryIn();
		if (association == null) {
			return false;
		} else {
			return association.isIsCompact();
		}
	}

	public boolean shouldDisplayAssociationEdge(Association association) {
		return !association.isIsCompact();
	}

	public String compactAssociationLabel(SemiAssociation primary) {
		Association association = primary.getIsPrimaryIn();
		if (association == null) {
			return "";
		}

		final StringBuilder sb = new StringBuilder(primary.getRole());
		if (primary.getRedefines() != null && !Objects.equals(primary.getRedefines().getName(), primary.getName())) {
			sb.append(" [").append(primary.getRedefines().getName()).append(']');
		}

		sb.append(": ").append(primary.getMinimumCardinality()).append("..")
				.append(primary.getMaximumCardinality() == null ? "*" : primary.getMaximumCardinality());

		if (primary.getMaximumCardinality() == null) {
			if (primary.isIsWhole()) {
				sb.append(" sha ");
			} else {
				sb.append(" ref ");
			}
		} else {
			sb.append(" con ");
		}

		sb.append(primary.getRefersTo().getName());

		final ArrayList<String> markers = new ArrayList<>();
		if (primary.isIsConstant()) {
			markers.add("K");
		}
		if (primary.isIsSubjective()) {
			markers.add("S");
		}
		if (primary.isIsTemporal()) {
			markers.add("T");
		}
		if (!markers.isEmpty()) {
			sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");
		}

		return sb.toString();
	}
}
