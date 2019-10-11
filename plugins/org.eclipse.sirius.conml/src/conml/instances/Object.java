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
 *   <li>{@link conml.instances.Object#getInstancedClass <em>Instanced Class</em>}</li>
 *   <li>{@link conml.instances.Object#getOwnedValueSets <em>Owned Value Sets</em>}</li>
 *   <li>{@link conml.instances.Object#getOwnedReferenceSets <em>Owned Reference Sets</em>}</li>
 *   <li>{@link conml.instances.Object#getIsOppositeIn <em>Is Opposite In</em>}</li>
 *   <li>{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}</li>
 *   <li>{@link conml.instances.Object#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}</li>
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
	 * Returns the value of the '<em><b>Instanced Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getInstanceObjects <em>Instance Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanced Class</em>' reference.
	 * @see #setInstancedClass(conml.types.Class)
	 * @see conml.instances.InstancesPackage#getObject_InstancedClass()
	 * @see conml.types.Class#getInstanceObjects
	 * @model opposite="InstanceObjects" required="true"
	 * @generated
	 */
	conml.types.Class getInstancedClass();

  /**
	 * Sets the value of the '{@link conml.instances.Object#getInstancedClass <em>Instanced Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanced Class</em>' reference.
	 * @see #getInstancedClass()
	 * @generated
	 */
	void setInstancedClass(conml.types.Class value);

  /**
	 * Returns the value of the '<em><b>Owned Value Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ValueSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ValueSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Value Sets</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_OwnedValueSets()
	 * @see conml.instances.ValueSet#getOwner
	 * @model opposite="Owner"
	 * @generated
	 */
	EList<ValueSet> getOwnedValueSets();

    /**
	 * Returns the value of the '<em><b>Owned Reference Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ReferenceSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Reference Sets</em>' reference list.
	 * @see conml.instances.InstancesPackage#getObject_OwnedReferenceSets()
	 * @see conml.instances.ReferenceSet#getOwner
	 * @model opposite="Owner"
	 * @generated
	 */
	EList<ReferenceSet> getOwnedReferenceSets();

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
	 * Returns the value of the '<em><b>Temporal Existential Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Existential Qualifier</em>' reference.
	 * @see #setTemporalExistentialQualifier(Object)
	 * @see conml.instances.InstancesPackage#getObject_TemporalExistentialQualifier()
	 * @model
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
	 * Returns the value of the '<em><b>Subjective Existential Qualifer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjective Existential Qualifer</em>' reference.
	 * @see #setSubjectiveExistentialQualifer(Object)
	 * @see conml.instances.InstancesPackage#getObject_SubjectiveExistentialQualifer()
	 * @model
	 * @generated
	 */
	Object getSubjectiveExistentialQualifer();

  /**
	 * Sets the value of the '{@link conml.instances.Object#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjective Existential Qualifer</em>' reference.
	 * @see #getSubjectiveExistentialQualifer()
	 * @generated
	 */
	void setSubjectiveExistentialQualifer(Object value);

} // Object
