/**
 *
 * $Id$
 */
package conml.instances.validation;

import conml.MetaInformation;
import conml.Model;
import conml.ModelElement;

import conml.instances.DegreeOfCertainty;
import conml.instances.FacetSet;
import conml.instances.QualifierObject;
import conml.instances.QualifyingObject;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.instances.ValueSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.instances.Object}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ObjectValidator {
	boolean validate();

	boolean validateIdentifier(String value);
	boolean validateCertainty(DegreeOfCertainty value);
	boolean validateInstancedClass(conml.types.Class value);

  boolean validateIsReferredByReferences(EList<Reference> value);

    boolean validateOwnedValueSets(EList<ValueSet> value);

  boolean validateOwnedReferenceSets(EList<ReferenceSet> value);

    boolean validateDocuments(EList<ModelElement> value);
	boolean validateIsInstanceOf(conml.types.Class value);
	boolean validateOwnsValueSets(EList<ValueSet> value);
	boolean validateOwnsReferenceSets(EList<ReferenceSet> value);
	boolean validateIsOppositeIn(EList<Reference> value);
	boolean validateIsPhaseQualifierOf(EList<FacetSet> value);
	boolean validateIsPersepectiveQualifierOf(EList<FacetSet> value);
	boolean validateTemporalExistentialQualifier(conml.instances.Object value);
	boolean validateSubjectiveExistentialQualifer(conml.instances.Object value);

  boolean validateReferenceSets(EList<ReferenceSet> value);

  boolean validateObjectMetaInformation(EList<MetaInformation> value);

    boolean validateMirroredMetaInfoObject(conml.instances.Object value);

        boolean validateDocumentedElements(EList<ModelElement> value);

                boolean validateDocumenting(boolean value);

                                boolean validateSubjectiveExistentialQualifer(QualifierObject value);

                                boolean validateTemporalExistentialQualifier(QualifierObject value);

                                                                boolean validateSubjectiveExistentialQualifer(QualifyingObject value);

                                boolean validateTemporalExistentialQualifier(QualifyingObject value);

                                                                boolean validateMetaInformation(EList<MetaInformation> value);

    boolean validateMetaInfoInModel(Model value);

    boolean validateMetaInfo(MetaInformation value);

    boolean validateValueSets(EList<ValueSet> value);

    boolean validateIsTemporalExistenceQualiferOf(EList<conml.instances.Object> value);
	boolean validateSubjectveExistentalQualifer(conml.instances.Object value);
	boolean validateIsSubjectveExistenceQualiferOf(EList<conml.instances.Object> value);
}
