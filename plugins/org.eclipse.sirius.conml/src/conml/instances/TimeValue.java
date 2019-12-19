/**
 */
package conml.instances;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.TimeValue#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getTimeValue()
 * @model
 * @generated
 */
public interface TimeValue extends Value {

  /**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Date)
	 * @see conml.instances.InstancesPackage#getTimeValue_Content()
	 * @model
	 * @generated
	 */
	Date getContent();

  /**
	 * Sets the value of the '{@link conml.instances.TimeValue#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Date value);
} // TimeValue
