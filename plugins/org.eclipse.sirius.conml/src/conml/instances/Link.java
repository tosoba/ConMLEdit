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
 *   <li>{@link conml.instances.Link#getInstancedAssociation <em>Instanced Association</em>}</li>
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
	 * Returns the value of the '<em><b>Instanced Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Association#getInstanceLinks <em>Instance Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanced Association</em>' reference.
	 * @see #setInstancedAssociation(Association)
	 * @see conml.instances.InstancesPackage#getLink_InstancedAssociation()
	 * @see conml.types.Association#getInstanceLinks
	 * @model opposite="InstanceLinks" required="true"
	 * @generated
	 */
	Association getInstancedAssociation();

  /**
	 * Sets the value of the '{@link conml.instances.Link#getInstancedAssociation <em>Instanced Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanced Association</em>' reference.
	 * @see #getInstancedAssociation()
	 * @generated
	 */
	void setInstancedAssociation(Association value);

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
