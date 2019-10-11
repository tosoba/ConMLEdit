/**
 *
 * $Id$
 */
package conml.types.validation;

import conml.types.Attribute;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.types.Class}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClassValidator {
	boolean validate();

	boolean validateAbstract(boolean value);

  boolean validateUsedAsTemporalAspect(boolean value);

  boolean validateUsedAsSubjectiveAspect(boolean value);

  boolean validateIsAbstract(boolean value);
	boolean validateIsTemporalAspect(boolean value);
	boolean validateIsSubjectiveAspect(boolean value);
	boolean validateIsTemporalAspectOf(EList<TypeModel> value);
	boolean validateIsSubjectiveAspectOf(EList<TypeModel> value);
	boolean validateGeneralization(EList<Generalization> value);
	boolean validateSpecialization(Generalization value);
	boolean validateDominantGeneralization(Generalization value);
	boolean validateSemiassociations(EList<SemiAssociation> value);

  boolean validateInstanceObjects(EList<conml.instances.Object> value);

    boolean validateOwnsProperties(EList<Property> value);
	boolean validateHasProperties(EList<Property> value);
	boolean validateOwnsAttributes(EList<Attribute> value);
	boolean validateHasAttributes(EList<Attribute> value);
	boolean validateHasSemiassociations(EList<SemiAssociation> value);
	boolean validateOwnsSemiassociations(EList<SemiAssociation> value);
	boolean validateInstancedByObjects(EList<conml.instances.Object> value);

  boolean validateIsOppositeClassIn(EList<SemiAssociation> value);
	boolean validateInstancedBy(EList<conml.instances.Object> value);
	boolean validatePackage(conml.types.Package value);

  boolean validateProperties(EList<Property> value);

  boolean validateAttributes(EList<Attribute> value);

    boolean validateBelongsToPackage(conml.types.Package value);
}
