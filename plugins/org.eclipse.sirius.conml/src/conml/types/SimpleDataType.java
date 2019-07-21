/**
 */
package conml.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.SimpleDataType#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getSimpleDataType()
 * @model
 * @generated
 */
public interface SimpleDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * The literals are from the enumeration {@link conml.types.BaseDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see conml.types.BaseDataType
	 * @see #setBase(BaseDataType)
	 * @see conml.types.TypesPackage#getSimpleDataType_Base()
	 * @model required="true"
	 * @generated
	 */
	BaseDataType getBase();

	/**
	 * Sets the value of the '{@link conml.types.SimpleDataType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see conml.types.BaseDataType
	 * @see #getBase()
	 * @generated
	 */
	void setBase(BaseDataType value);

} // SimpleDataType
