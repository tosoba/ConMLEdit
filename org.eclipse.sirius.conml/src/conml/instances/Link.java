/**
 */
package conml.instances;

import conml.types.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.Link#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link conml.instances.Link#getHasPrimary <em>Has Primary</em>}</li>
 *   <li>{@link conml.instances.Link#getHasSecondary <em>Has Secondary</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Instance {
	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Association#getHasInstanceLinks <em>Has Instance Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' reference.
	 * @see #setIsInstanceOf(Association)
	 * @see conml.instances.InstancesPackage#getLink_IsInstanceOf()
	 * @see conml.types.Association#getHasInstanceLinks
	 * @model opposite="HasInstanceLinks" required="true"
	 * @generated
	 */
	Association getIsInstanceOf();

	/**
	 * Sets the value of the '{@link conml.instances.Link#getIsInstanceOf <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(Association value);

	/**
	 * Returns the value of the '<em><b>Has Primary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getIsPrimaryIn <em>Is Primary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Primary</em>' reference.
	 * @see #setHasPrimary(Reference)
	 * @see conml.instances.InstancesPackage#getLink_HasPrimary()
	 * @see conml.instances.Reference#getIsPrimaryIn
	 * @model opposite="IsPrimaryIn"
	 * @generated
	 */
	Reference getHasPrimary();

	/**
	 * Sets the value of the '{@link conml.instances.Link#getHasPrimary <em>Has Primary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Primary</em>' reference.
	 * @see #getHasPrimary()
	 * @generated
	 */
	void setHasPrimary(Reference value);

	/**
	 * Returns the value of the '<em><b>Has Secondary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getIsSecondaryIn <em>Is Secondary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Secondary</em>' reference.
	 * @see #setHasSecondary(Reference)
	 * @see conml.instances.InstancesPackage#getLink_HasSecondary()
	 * @see conml.instances.Reference#getIsSecondaryIn
	 * @model opposite="IsSecondaryIn"
	 * @generated
	 */
	Reference getHasSecondary();

	/**
	 * Sets the value of the '{@link conml.instances.Link#getHasSecondary <em>Has Secondary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Secondary</em>' reference.
	 * @see #getHasSecondary()
	 * @generated
	 */
	void setHasSecondary(Reference value);

} // Link
