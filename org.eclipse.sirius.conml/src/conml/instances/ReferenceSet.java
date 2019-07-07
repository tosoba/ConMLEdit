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
 *   <li>{@link conml.instances.ReferenceSet#getIsAnInstanceOf <em>Is An Instance Of</em>}</li>
 *   <li>{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getReferenceSet()
 * @model
 * @generated
 */
public interface ReferenceSet extends FacetSet {
	/**
	 * Returns the value of the '<em><b>Is An Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getHasInstanceReferenceSets <em>Has Instance Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is An Instance Of</em>' reference.
	 * @see #setIsAnInstanceOf(SemiAssociation)
	 * @see conml.instances.InstancesPackage#getReferenceSet_IsAnInstanceOf()
	 * @see conml.types.SemiAssociation#getHasInstanceReferenceSets
	 * @model opposite="HasInstanceReferenceSets" required="true"
	 * @generated
	 */
	SemiAssociation getIsAnInstanceOf();

	/**
	 * Sets the value of the '{@link conml.instances.ReferenceSet#getIsAnInstanceOf <em>Is An Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is An Instance Of</em>' reference.
	 * @see #getIsAnInstanceOf()
	 * @generated
	 */
	void setIsAnInstanceOf(SemiAssociation value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getOwnsReferenceSets <em>Owns Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getReferenceSet_Owner()
	 * @see conml.instances.Object#getOwnsReferenceSets
	 * @model opposite="OwnsReferenceSets" required="true"
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
