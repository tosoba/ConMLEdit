/**
 */
package conml.instances;

import java.lang.Object;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.DataValue#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getDataValue()
 * @model
 * @generated
 */
public interface DataValue extends Value {

  /**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Object)
	 * @see conml.instances.InstancesPackage#getDataValue_Content()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getContent();

  /**
	 * Sets the value of the '{@link conml.instances.DataValue#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Object value);
} // DataValue
