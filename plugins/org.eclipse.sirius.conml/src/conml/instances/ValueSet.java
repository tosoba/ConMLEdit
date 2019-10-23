/**
 */
package conml.instances;

import conml.types.Attribute;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.ValueSet#getInstancedAttribute <em>Instanced Attribute</em>}</li>
 *   <li>{@link conml.instances.ValueSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getValueSet()
 * @model
 * @generated
 */
public interface ValueSet extends FacetSet {
	/**
	 * Returns the value of the '<em><b>Instanced Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getInstanceValueSets <em>Instance Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanced Attribute</em>' reference.
	 * @see #setInstancedAttribute(Attribute)
	 * @see conml.instances.InstancesPackage#getValueSet_InstancedAttribute()
	 * @see conml.types.Attribute#getInstanceValueSets
	 * @model opposite="InstanceValueSets" required="true"
	 * @generated
	 */
	Attribute getInstancedAttribute();

  /**
	 * Sets the value of the '{@link conml.instances.ValueSet#getInstancedAttribute <em>Instanced Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanced Attribute</em>' reference.
	 * @see #getInstancedAttribute()
	 * @generated
	 */
	void setInstancedAttribute(Attribute value);

    /**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link conml.instances.Value}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Value#getOwnerValueSet <em>Owner Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see conml.instances.InstancesPackage#getValueSet_Values()
	 * @see conml.instances.Value#getOwnerValueSet
	 * @model opposite="OwnerValueSet" containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // ValueSet
