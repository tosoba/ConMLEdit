/**
 */
package conml.instances;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.NumberValue#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends Value {

  /**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Double)
	 * @see conml.instances.InstancesPackage#getNumberValue_Content()
	 * @model
	 * @generated
	 */
	Double getContent();

  /**
	 * Sets the value of the '{@link conml.instances.NumberValue#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Double value);
} // NumberValue
