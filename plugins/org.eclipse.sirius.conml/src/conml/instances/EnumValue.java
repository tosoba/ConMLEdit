/**
 */
package conml.instances;

import conml.types.EnumeratedItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.EnumValue#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends Value {

  /**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(EnumeratedItem)
	 * @see conml.instances.InstancesPackage#getEnumValue_Content()
	 * @model
	 * @generated
	 */
	EnumeratedItem getContent();

  /**
	 * Sets the value of the '{@link conml.instances.EnumValue#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EnumeratedItem value);
} // EnumValue
