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
 *   <li>{@link conml.instances.InstanceModel#getConformsTo <em>Conforms To</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getInstanceModel()
 * @model
 * @generated
 */
public interface InstanceModel extends Model {
	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getConformedBy <em>Conformed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' reference list.
	 * @see conml.instances.InstancesPackage#getInstanceModel_ConformsTo()
	 * @see conml.types.TypeModel#getConformedBy
	 * @model opposite="ConformedBy" required="true"
	 * @generated
	 */
	EList<TypeModel> getConformsTo();

} // InstanceModel
