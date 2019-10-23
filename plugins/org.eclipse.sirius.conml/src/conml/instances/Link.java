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
 *   <li>{@link conml.instances.Link#getPrimaryReference <em>Primary Reference</em>}</li>
 *   <li>{@link conml.instances.Link#getSecondaryReference <em>Secondary Reference</em>}</li>
 *   <li>{@link conml.instances.Link#isCompact <em>Compact</em>}</li>
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
	 * Returns the value of the '<em><b>Primary Reference</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getPrimaryInLink <em>Primary In Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Reference</em>' reference.
	 * @see #setPrimaryReference(Reference)
	 * @see conml.instances.InstancesPackage#getLink_PrimaryReference()
	 * @see conml.instances.Reference#getPrimaryInLink
	 * @model opposite="PrimaryInLink"
	 * @generated
	 */
	Reference getPrimaryReference();

    /**
	 * Sets the value of the '{@link conml.instances.Link#getPrimaryReference <em>Primary Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Reference</em>' reference.
	 * @see #getPrimaryReference()
	 * @generated
	 */
	void setPrimaryReference(Reference value);

    /**
	 * Returns the value of the '<em><b>Secondary Reference</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Reference#getSecondaryLink <em>Secondary Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Reference</em>' reference.
	 * @see #setSecondaryReference(Reference)
	 * @see conml.instances.InstancesPackage#getLink_SecondaryReference()
	 * @see conml.instances.Reference#getSecondaryLink
	 * @model opposite="SecondaryLink"
	 * @generated
	 */
	Reference getSecondaryReference();

    /**
	 * Sets the value of the '{@link conml.instances.Link#getSecondaryReference <em>Secondary Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Reference</em>' reference.
	 * @see #getSecondaryReference()
	 * @generated
	 */
	void setSecondaryReference(Reference value);

        /**
	 * Returns the value of the '<em><b>Compact</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compact</em>' attribute.
	 * @see #setCompact(boolean)
	 * @see conml.instances.InstancesPackage#getLink_Compact()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isCompact();

        /**
	 * Sets the value of the '{@link conml.instances.Link#isCompact <em>Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compact</em>' attribute.
	 * @see #isCompact()
	 * @generated
	 */
	void setCompact(boolean value);

} // Link
