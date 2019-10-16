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
 *   <li>{@link conml.instances.Object#getIsOppositeIn <em>Is Opposite In</em>}</li>
 *   <li>{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}</li>
 *   <li>{@link conml.instances.Object#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}</li>
 *   <li>{@link conml.instances.Object#getReferenceSets <em>Reference Sets</em>}</li>
 *   <li>{@link conml.instances.Object#getValueSets <em>Value Sets</em>}</li>
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

    /**
	 * Returns the value of the '<em><b>Reference Sets</b></em>' containment reference list.
	 * The list contents are of type {@link conml.instances.ReferenceSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Sets</em>' containment reference list.
	 * @see conml.instances.InstancesPackage#getObject_ReferenceSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceSet> getReferenceSets();

    /**
	 * Returns the value of the '<em><b>Value Sets</b></em>' containment reference list.
	 * The list contents are of type {@link conml.instances.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sets</em>' containment reference list.
	 * @see conml.instances.InstancesPackage#getObject_ValueSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSet> getValueSets();

} // Object
