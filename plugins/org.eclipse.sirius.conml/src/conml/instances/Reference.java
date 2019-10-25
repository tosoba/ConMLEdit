/**
 */
package conml.instances;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.Reference#getReferredObject <em>Referred Object</em>}</li>
 *   <li>{@link conml.instances.Reference#getPrimaryInLink <em>Primary In Link</em>}</li>
 *   <li>{@link conml.instances.Reference#getSecondaryLink <em>Secondary Link</em>}</li>
 *   <li>{@link conml.instances.Reference#getOwnerReferenceSet <em>Owner Reference Set</em>}</li>
 *   <li>{@link conml.instances.Reference#getInverseReference <em>Inverse Reference</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Facet {
	/**
	 * Returns the value of the '<em><b>Referred Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsReferredByReferences <em>Is Referred By References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Object</em>' reference.
	 * @see #setReferredObject(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getReference_ReferredObject()
	 * @see conml.instances.Object#getIsReferredByReferences
	 * @model opposite="IsReferredByReferences" required="true"
	 * @generated
	 */
	conml.instances.Object getReferredObject();

  /**
	 * Sets the value of the '{@link conml.instances.Reference#getReferredObject <em>Referred Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Object</em>' reference.
	 * @see #getReferredObject()
	 * @generated
	 */
	void setReferredObject(conml.instances.Object value);

  /**
	 * Returns the value of the '<em><b>Primary In Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Link#getPrimaryReference <em>Primary Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary In Link</em>' reference.
	 * @see #setPrimaryInLink(Link)
	 * @see conml.instances.InstancesPackage#getReference_PrimaryInLink()
	 * @see conml.instances.Link#getPrimaryReference
	 * @model opposite="PrimaryReference"
	 * @generated
	 */
	Link getPrimaryInLink();

  /**
	 * Sets the value of the '{@link conml.instances.Reference#getPrimaryInLink <em>Primary In Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary In Link</em>' reference.
	 * @see #getPrimaryInLink()
	 * @generated
	 */
	void setPrimaryInLink(Link value);

  /**
	 * Returns the value of the '<em><b>Secondary Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Link#getSecondaryReference <em>Secondary Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Link</em>' reference.
	 * @see #setSecondaryLink(Link)
	 * @see conml.instances.InstancesPackage#getReference_SecondaryLink()
	 * @see conml.instances.Link#getSecondaryReference
	 * @model opposite="SecondaryReference"
	 * @generated
	 */
	Link getSecondaryLink();

  /**
	 * Sets the value of the '{@link conml.instances.Reference#getSecondaryLink <em>Secondary Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Link</em>' reference.
	 * @see #getSecondaryLink()
	 * @generated
	 */
	void setSecondaryLink(Link value);

    /**
	 * Returns the value of the '<em><b>Owner Reference Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.ReferenceSet#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Reference Set</em>' container reference.
	 * @see #setOwnerReferenceSet(ReferenceSet)
	 * @see conml.instances.InstancesPackage#getReference_OwnerReferenceSet()
	 * @see conml.instances.ReferenceSet#getReferences
	 * @model opposite="References" required="true" transient="false"
	 * @generated
	 */
	ReferenceSet getOwnerReferenceSet();

    /**
	 * Sets the value of the '{@link conml.instances.Reference#getOwnerReferenceSet <em>Owner Reference Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Reference Set</em>' container reference.
	 * @see #getOwnerReferenceSet()
	 * @generated
	 */
	void setOwnerReferenceSet(ReferenceSet value);

        /**
	 * Returns the value of the '<em><b>Inverse Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Reference</em>' reference.
	 * @see #setInverseReference(Reference)
	 * @see conml.instances.InstancesPackage#getReference_InverseReference()
	 * @model required="true"
	 * @generated
	 */
	Reference getInverseReference();

        /**
	 * Sets the value of the '{@link conml.instances.Reference#getInverseReference <em>Inverse Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Reference</em>' reference.
	 * @see #getInverseReference()
	 * @generated
	 */
	void setInverseReference(Reference value);

} // Reference
