/**
 */
package conml.instances;

import conml.types.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.ValueSet#getIsAnInstanceOf <em>Is An Instance Of</em>}</li>
 *   <li>{@link conml.instances.ValueSet#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getValueSet()
 * @model
 * @generated
 */
public interface ValueSet extends FacetSet {
	/**
	 * Returns the value of the '<em><b>Is An Instance Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getHasInstanceValueSets <em>Has Instance Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is An Instance Of</em>' reference.
	 * @see #setIsAnInstanceOf(Attribute)
	 * @see conml.instances.InstancesPackage#getValueSet_IsAnInstanceOf()
	 * @see conml.types.Attribute#getHasInstanceValueSets
	 * @model opposite="HasInstanceValueSets" required="true"
	 * @generated
	 */
	Attribute getIsAnInstanceOf();

	/**
	 * Sets the value of the '{@link conml.instances.ValueSet#getIsAnInstanceOf <em>Is An Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is An Instance Of</em>' reference.
	 * @see #getIsAnInstanceOf()
	 * @generated
	 */
	void setIsAnInstanceOf(Attribute value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getOwnsValueSets <em>Owns Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getValueSet_Owner()
	 * @see conml.instances.Object#getOwnsValueSets
	 * @model opposite="OwnsValueSets" required="true"
	 * @generated
	 */
	conml.instances.Object getOwner();

	/**
	 * Sets the value of the '{@link conml.instances.ValueSet#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(conml.instances.Object value);

} // ValueSet
