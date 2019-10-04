/**
 */
package conml.instances;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.Object#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link conml.instances.Object#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link conml.instances.Object#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link conml.instances.Object#getOwnsValueSets <em>Owns Value Sets</em>}</li>
 *   <li>{@link conml.instances.Object#getOwnsReferenceSets <em>Owns Reference Sets</em>}</li>
 *   <li>{@link conml.instances.Object#getIsOppositeIn <em>Is Opposite In</em>}</li>
 *   <li>{@link conml.instances.Object#getIsPhaseQualifierOf <em>Is Phase Qualifier Of</em>}</li>
 *   <li>{@link conml.instances.Object#getIsPersepectiveQualifierOf <em>Is Persepective Qualifier Of</em>}</li>
 *   <li>{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}</li>
 *   <li>{@link conml.instances.Object#getIsTemporalExistenceQualiferOf <em>Is Temporal Existence Qualifer Of</em>}</li>
 *   <li>{@link conml.instances.Object#getSubjectveExistentalQualifer <em>Subjectve Existental Qualifer</em>}</li>
 *   <li>{@link conml.instances.Object#getIsSubjectveExistenceQualiferOf <em>Is Subjectve Existence Qualifer Of</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Instance {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see conml.instances.InstancesPackage#getObject_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link conml.instances.Object#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' attribute.
	 * The literals are from the enumeration {@link conml.instances.DegreeOfCertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' attribute.
	 * @see conml.instances.DegreeOfCertainty
	 * @see #setCertainty(DegreeOfCertainty)
	 * @see conml.instances.InstancesPackage#getObject_Certainty()
	 * @model required="true"
	 * @generated
	 */
	DegreeOfCertainty getCertainty();

	/**
	 * Sets the value of the '{@link conml.instances.Object#getCertainty <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' attribute.
	 * @see conml.instances.DegreeOfCertainty
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(DegreeOfCertainty value);

	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getInstancedBy <em>Instanced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(conml.types.Class)
	 * @see conml.instances.InstancesPackage#getObject_IsInstanceOf()
	 * @see conml.types.Class#getInstancedBy
	 * @model opposite="InstancedBy" required="true"
	 * @generated
	 */
	conml.types.Class getIsInstanceOf();

	/**
	 * Sets the value of the '{@link conml.instances.Object#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(conml.types.Class value);

	/**
	 * Returns the value of the '<em><b>Owns Value Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ValueSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ValueSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Value Sets</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_OwnsValueSets()
	 * @see conml.instances.ValueSet#getOwner
	 * @model opposite="Owner"
	 * @generated
	 */
	EList<ValueSet> getOwnsValueSets();

	/**
	 * Returns the value of the '<em><b>Owns Reference Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ReferenceSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Reference Sets</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_OwnsReferenceSets()
	 * @see conml.instances.ReferenceSet#getOwner
	 * @model opposite="Owner"
	 * @generated
	 */
	EList<ReferenceSet> getOwnsReferenceSets();

	/**
	 * Returns the value of the '<em><b>Is Opposite In</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Reference}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opposite In</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_IsOppositeIn()
	 * @see conml.instances.Reference#getRefersTo
	 * @model opposite="RefersTo"
	 * @generated
	 */
	EList<Reference> getIsOppositeIn();

	/**
	 * Returns the value of the '<em><b>Is Phase Qualifier Of</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.FacetSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.FacetSet#getHasPhaseQualifier <em>Has Phase Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Phase Qualifier Of</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_IsPhaseQualifierOf()
	 * @see conml.instances.FacetSet#getHasPhaseQualifier
	 * @model opposite="HasPhaseQualifier"
	 * @generated
	 */
	EList<FacetSet> getIsPhaseQualifierOf();

	/**
	 * Returns the value of the '<em><b>Is Persepective Qualifier Of</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.FacetSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.FacetSet#getHasPerspectiveQualifier <em>Has Perspective Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Persepective Qualifier Of</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_IsPersepectiveQualifierOf()
	 * @see conml.instances.FacetSet#getHasPerspectiveQualifier
	 * @model opposite="HasPerspectiveQualifier"
	 * @generated
	 */
	EList<FacetSet> getIsPersepectiveQualifierOf();

	/**
	 * Returns the value of the '<em><b>Temporal Existential Qualifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsTemporalExistenceQualiferOf <em>Is Temporal Existence Qualifer Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Existential Qualifier</em>' reference.
	 * @see #setTemporalExistentialQualifier(Object)
	 * @see conml.instances.InstancesPackage#getObject_TemporalExistentialQualifier()
	 * @see conml.instances.Object#getIsTemporalExistenceQualiferOf
	 * @model opposite="IsTemporalExistenceQualiferOf"
	 * @generated
	 */
	Object getTemporalExistentialQualifier();

	/**
	 * Sets the value of the '{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Existential Qualifier</em>' reference.
	 * @see #getTemporalExistentialQualifier()
	 * @generated
	 */
	void setTemporalExistentialQualifier(Object value);

	/**
	 * Returns the value of the '<em><b>Is Temporal Existence Qualifer Of</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Temporal Existence Qualifer Of</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_IsTemporalExistenceQualiferOf()
	 * @see conml.instances.Object#getTemporalExistentialQualifier
	 * @model opposite="TemporalExistentialQualifier"
	 * @generated
	 */
	EList<Object> getIsTemporalExistenceQualiferOf();

	/**
	 * Returns the value of the '<em><b>Subjectve Existental Qualifer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsSubjectveExistenceQualiferOf <em>Is Subjectve Existence Qualifer Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectve Existental Qualifer</em>' reference.
	 * @see #setSubjectveExistentalQualifer(Object)
	 * @see conml.instances.InstancesPackage#getObject_SubjectveExistentalQualifer()
	 * @see conml.instances.Object#getIsSubjectveExistenceQualiferOf
	 * @model opposite="IsSubjectveExistenceQualiferOf"
	 * @generated
	 */
	Object getSubjectveExistentalQualifer();

	/**
	 * Sets the value of the '{@link conml.instances.Object#getSubjectveExistentalQualifer <em>Subjectve Existental Qualifer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectve Existental Qualifer</em>' reference.
	 * @see #getSubjectveExistentalQualifer()
	 * @generated
	 */
	void setSubjectveExistentalQualifer(Object value);

	/**
	 * Returns the value of the '<em><b>Is Subjectve Existence Qualifer Of</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getSubjectveExistentalQualifer <em>Subjectve Existental Qualifer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subjectve Existence Qualifer Of</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_IsSubjectveExistenceQualiferOf()
	 * @see conml.instances.Object#getSubjectveExistentalQualifer
	 * @model opposite="SubjectveExistentalQualifer"
	 * @generated
	 */
	EList<Object> getIsSubjectveExistenceQualiferOf();

} // Object
