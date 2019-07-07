/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.DataType#getAppliesTo <em>Applies To</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Attribute}.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' reference list.
	 * @see conml.types.TypesPackage#getDataType_AppliesTo()
	 * @see conml.types.Attribute#getIsOfType
	 * @model opposite="IsOfType"
	 * @generated
	 */
	EList<Attribute> getAppliesTo();

} // DataType
