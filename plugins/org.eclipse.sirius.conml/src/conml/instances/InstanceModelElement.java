/**
 */
package conml.instances;

import conml.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.InstanceModelElement#getInstanceModel <em>Instance Model</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getInstanceModelElement()
 * @model abstract="true"
 * @generated
 */
public interface InstanceModelElement extends ModelElement {

  /**
	 * Returns the value of the '<em><b>Instance Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.InstanceModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Model</em>' reference.
	 * @see #setInstanceModel(InstanceModel)
	 * @see conml.instances.InstancesPackage#getInstanceModelElement_InstanceModel()
	 * @see conml.instances.InstanceModel#getElements
	 * @model opposite="Elements" required="true"
	 * @generated
	 */
	InstanceModel getInstanceModel();

  /**
	 * Sets the value of the '{@link conml.instances.InstanceModelElement#getInstanceModel <em>Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Model</em>' reference.
	 * @see #getInstanceModel()
	 * @generated
	 */
	void setInstanceModel(InstanceModel value);
} // InstanceModelElement
