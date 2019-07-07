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
 *   <li>{@link conml.instances.Reference#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link conml.instances.Reference#getInverse <em>Inverse</em>}</li>
 *   <li>{@link conml.instances.Reference#getIsInverseOf <em>Is Inverse Of</em>}</li>
 *   <li>{@link conml.instances.Reference#getIsPrimaryIn <em>Is Primary In</em>}</li>
 *   <li>{@link conml.instances.Reference#getIsSecondaryIn <em>Is Secondary In</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Facet {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsOppositeIn <em>Is Opposite In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getReference_RefersTo()
	 * @see conml.instances.Object#getIsOppositeIn
	 * @model opposite="IsOppositeIn" required="true"
	 * @generated
	 */
	conml.instances.Object getRefersTo();

	/**
	 * Sets the value of the '{@link conml.instances.Reference#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(conml.instances.Object value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getIsInverseOf <em>Is Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' reference.
	 * @see #setInverse(Reference)
	 * @see conml.instances.InstancesPackage#getReference_Inverse()
	 * @see conml.instances.Reference#getIsInverseOf
	 * @model opposite="isInverseOf"
	 * @generated
	 */
	Reference getInverse();

	/**
	 * Sets the value of the '{@link conml.instances.Reference#getInverse <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' reference.
	 * @see #getInverse()
	 * @generated
	 */
	void setInverse(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Inverse Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inverse Of</em>' reference.
	 * @see #setIsInverseOf(Reference)
	 * @see conml.instances.InstancesPackage#getReference_IsInverseOf()
	 * @see conml.instances.Reference#getInverse
	 * @model opposite="inverse"
	 * @generated
	 */
	Reference getIsInverseOf();

	/**
	 * Sets the value of the '{@link conml.instances.Reference#getIsInverseOf <em>Is Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inverse Of</em>' reference.
	 * @see #getIsInverseOf()
	 * @generated
	 */
	void setIsInverseOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Primary In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Link#getHasPrimary <em>Has Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary In</em>' reference.
	 * @see #setIsPrimaryIn(Link)
	 * @see conml.instances.InstancesPackage#getReference_IsPrimaryIn()
	 * @see conml.instances.Link#getHasPrimary
	 * @model opposite="HasPrimary"
	 * @generated
	 */
	Link getIsPrimaryIn();

	/**
	 * Sets the value of the '{@link conml.instances.Reference#getIsPrimaryIn <em>Is Primary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary In</em>' reference.
	 * @see #getIsPrimaryIn()
	 * @generated
	 */
	void setIsPrimaryIn(Link value);

	/**
	 * Returns the value of the '<em><b>Is Secondary In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Link#getHasSecondary <em>Has Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Secondary In</em>' reference.
	 * @see #setIsSecondaryIn(Link)
	 * @see conml.instances.InstancesPackage#getReference_IsSecondaryIn()
	 * @see conml.instances.Link#getHasSecondary
	 * @model opposite="HasSecondary"
	 * @generated
	 */
	Link getIsSecondaryIn();

	/**
	 * Sets the value of the '{@link conml.instances.Reference#getIsSecondaryIn <em>Is Secondary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Secondary In</em>' reference.
	 * @see #getIsSecondaryIn()
	 * @generated
	 */
	void setIsSecondaryIn(Link value);

} // Reference
