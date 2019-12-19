/**
 */
package conml.instances;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.Value#getOwnerValueSet <em>Owner Value Set</em>}</li>
 *   <li>{@link conml.instances.Value#isUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends Facet {
	/**
	 * Returns the value of the '<em><b>Owner Value Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.ValueSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Value Set</em>' container reference.
	 * @see #setOwnerValueSet(ValueSet)
	 * @see conml.instances.InstancesPackage#getValue_OwnerValueSet()
	 * @see conml.instances.ValueSet#getValues
	 * @model opposite="Values" required="true" transient="false"
	 * @generated
	 */
	ValueSet getOwnerValueSet();

  /**
	 * Sets the value of the '{@link conml.instances.Value#getOwnerValueSet <em>Owner Value Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Value Set</em>' container reference.
	 * @see #getOwnerValueSet()
	 * @generated
	 */
	void setOwnerValueSet(ValueSet value);

    /**
	 * Returns the value of the '<em><b>Unknown</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown</em>' attribute.
	 * @see #setUnknown(boolean)
	 * @see conml.instances.InstancesPackage#getValue_Unknown()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnknown();

    /**
	 * Sets the value of the '{@link conml.instances.Value#isUnknown <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown</em>' attribute.
	 * @see #isUnknown()
	 * @generated
	 */
	void setUnknown(boolean value);

} // Value
