package org.eclipse.sirius.conml.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import conml.types.Association;
import conml.types.Attribute;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class ClassDiagramServices extends AbstractDiagramServices {
	public String attributeLabel(final Feature feature) {
		if (feature == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder(feature.getName());
		if (feature.getRedefines() != null && !Objects.equals(feature.getRedefines().getName(), feature.getName())) {
			sb.append(" [").append(feature.getRedefines().getName()).append(']');
		}
		sb.append(": ");

		sb.append(feature.getMinimumCardinality());
		if (!Objects.equals(feature.getMinimumCardinality(), feature.getMaximumCardinality())) {
			sb.append("..");
			if (feature.getMaximumCardinality() != null) {
				sb.append(feature.getMaximumCardinality());
			} else {
				sb.append("*");
			}
		}

		sb.append(" ");

		if (feature instanceof Attribute) {
			Attribute attr = (Attribute) feature;
			if (attr.getIsOfType() != null) {
				if (attr instanceof EnumeratedType) {
					sb.append("enum ");
				}
				sb.append(attr.getIsOfType().getName());
			} else {
				sb.append('?');
			}

			ArrayList<String> markers = new ArrayList<>();
			if (attr.isIsConstant()) {
				markers.add("K");
			}
			if (attr.isIsMultilingual()) {
				markers.add("M");
			}
			if (attr.isIsSubjective()) {
				markers.add("S");
			}
			if (attr.isIsTemporal()) {
				markers.add("T");
			}
			if (!markers.isEmpty()) {
				sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");
			}
		} else if (feature instanceof Property) {
			sb.append('?');
		}

		return sb.toString();
	}

	public String associationBeginLabel(final Association association) {
		return association.getHasPrimary().getRole();
	}

	public String associationEndLabel(final Association association) {
		return association.getHasSecondary().getRole();
	}

	public Association createAssociation(EObject object, Class source, Class target, EObject sourceView,
			EObject targetView) {
		Association association = TypesFactory.eINSTANCE.createAssociation();
		association.setDefinition("");
		String primaryName = source.getName() + "s";
		association.setName(primaryName);
		SemiAssociation primary = TypesFactory.eINSTANCE.createSemiAssociation();
		primary.setName(primaryName);
		primary.setRole(primaryName);
		primary.setIsPrimaryIn(association);
		association.setHasPrimary(primary);

		SemiAssociation secondary = TypesFactory.eINSTANCE.createSemiAssociation();
		String secondaryName = target.getName() + "s";
		secondary.setName(secondaryName);
		secondary.setRole(secondaryName);
		secondary.setIsSecondaryIn(association);
		association.setHasSecondary(secondary);

		source.getOwnsSemiassociations().add(primary);

		target.getOwnsSemiassociations().add(secondary);

		if (source.eContainer() instanceof TypeModel) {
			TypeModel typeModel = (TypeModel) source.eContainer();
			typeModel.getOwnsElements().add(association);
		}
		return association;
	}

	public Generalization createGeneralization(EObject object, Class source, Class target, EObject sourceView,
			EObject targetView) {
		// TODO: figure out what to do to prevent one class inheriting from more than
		// one class (if it's not compliant with ConML)
		// and maybe also what to do when user attempts to create generalization between
		// the same 2 classes but in the opposite direction (this also probably should
		// not be possible)
		Generalization generalization = TypesFactory.eINSTANCE.createGeneralization();
		generalization.setDiscriminant("discriminant"); // TODO: change this
		generalization.getSpecializedClass().add(source);
		source.getGeneralization().add(generalization);
		if (generalization.getGeneralizedClass() == null) {
			generalization.setGeneralizedClass(target);
		}
		if (target.getSpecialization() == null) {
			target.setSpecialization(generalization);
		}
		if (source.eContainer() instanceof TypeModel) {
			TypeModel typeModel = (TypeModel) source.eContainer();
			typeModel.getOwnsElements().add(generalization);
		}
		return generalization;
	}

	public Collection<EObject> getGeneralizationSourceType(Generalization generalization) {
		return generalization.getSpecializedClass().stream().map(clazz -> (EObject) clazz).collect(Collectors.toList());
		// return generalization.getSpecializedClass().isEmpty() ? null :
		// generalization.getSpecializedClass().get(generalization.getSpecializedClass().size()
		// - 1);
	}

	public Class getGeneralizationTargetType(Generalization generalization) {
		return generalization.getGeneralizedClass();
	}

	public Class getSourceType(Association association) {
		return association.getHasPrimary() != null ? association.getHasPrimary().getOwner() : null;
	}

	public Class getTargetType(Association association) {
		return association.getHasSecondary() != null ? association.getHasSecondary().getOwner() : null;
	}
}
