/**
 */
package conml.instances;

import conml.types.SemiAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.ReferenceSet#getInstancedSemiAssociation <em>Instanced Semi Association</em>}</li>
 *   <li>{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getReferenceSet()
 * @model
 * @generated
 */
public interface ReferenceSet extends FacetSet {
	/**
	 * Returns the value of the '<em><b>Instanced Semi Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getInstanceReferenceSets <em>Instance Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanced Semi Association</em>' reference.
	 * @see #setInstancedSemiAssociation(SemiAssociation)
	 * @see conml.instances.InstancesPackage#getReferenceSet_InstancedSemiAssociation()
	 * @see conml.types.SemiAssociation#getInstanceReferenceSets
	 * @model opposite="InstanceReferenceSets" required="true"
	 * @generated
	 */
	SemiAssociation getInstancedSemiAssociation();

  /**
	 * Sets the value of the '{@link conml.instances.ReferenceSet#getInstancedSemiAssociation <em>Instanced Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanced Semi Association</em>' reference.
	 * @see #getInstancedSemiAssociation()
	 * @generated
	 */
	void setInstancedSemiAssociation(SemiAssociation value);

  /**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getOwnedReferenceSets <em>Owned Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getReferenceSet_Owner()
	 * @see conml.instances.Object#getOwnedReferenceSets
	 * @model opposite="OwnedReferenceSets" required="true"
	 * @generated
	 */
	conml.instances.Object getOwner();

	/**
	 * Sets the value of the '{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(conml.instances.Object value);

} // ReferenceSet
