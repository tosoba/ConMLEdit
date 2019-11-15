/**
 */
package conml.instances;

import conml.Model;

import conml.types.TypeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.InstanceModel#getConformedTypeModels <em>Conformed Type Models</em>}</li>
 *   <li>{@link conml.instances.InstanceModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getInstanceModel()
 * @model
 * @generated
 */
public interface InstanceModel extends Model {
	/**
	 * Returns the value of the '<em><b>Conformed Type Models</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getConformingInstanceModel <em>Conforming Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformed Type Models</em>' reference list.
	 * @see conml.instances.InstancesPackage#getInstanceModel_ConformedTypeModels()
	 * @see conml.types.TypeModel#getConformingInstanceModel
	 * @model opposite="ConformingInstanceModel" required="true"
	 * @generated
	 */
	EList<TypeModel> getConformedTypeModels();

  /**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link conml.instances.InstanceModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see conml.instances.InstancesPackage#getInstanceModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceModelElement> getElements();

} // InstanceModel
