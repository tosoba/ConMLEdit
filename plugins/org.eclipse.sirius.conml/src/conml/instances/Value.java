/**
 */
package conml.instances;

import java.lang.Object;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.Value#getContents <em>Contents</em>}</li>
 *   <li>{@link conml.instances.Value#getOwnerValueSet <em>Owner Value Set</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends Facet {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(Object)
	 * @see conml.instances.InstancesPackage#getValue_Contents()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getContents();

	/**
	 * Sets the value of the '{@link conml.instances.Value#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(Object value);

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

} // Value
