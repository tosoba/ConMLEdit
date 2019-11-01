/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.EnumeratedType#getOwnedItems <em>Owned Items</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getEnumeratedType()
 * @model
 * @generated
 */
public interface EnumeratedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Items</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getOwnerType <em>Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Items</em>' containment reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_OwnedItems()
	 * @see conml.types.EnumeratedItem#getOwnerType
	 * @model opposite="OwnerType" containment="true"
	 * @generated
	 */
	EList<EnumeratedItem> getOwnedItems();

  /**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedType}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_SubTypes()
	 * @see conml.types.EnumeratedType#getSuperType
	 * @model opposite="SuperType"
	 * @generated
	 */
	EList<EnumeratedType> getSubTypes();

  /**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(EnumeratedType)
	 * @see conml.types.TypesPackage#getEnumeratedType_SuperType()
	 * @see conml.types.EnumeratedType#getSubTypes
	 * @model opposite="SubTypes"
	 * @generated
	 */
	EnumeratedType getSuperType();

  /**
	 * Sets the value of the '{@link conml.types.EnumeratedType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(EnumeratedType value);

    /**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getEnumeratedTypes <em>Enumerated Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(conml.types.Package)
	 * @see conml.types.TypesPackage#getEnumeratedType_Package()
	 * @see conml.types.Package#getEnumeratedTypes
	 * @model opposite="EnumeratedTypes"
	 * @generated
	 */
	conml.types.Package getPackage();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedType#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(conml.types.Package value);

} // EnumeratedType
