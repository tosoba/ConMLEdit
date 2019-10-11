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
 *   <li>{@link conml.types.EnumeratedType#getSpecializedByEnumeratedTypes <em>Specialized By Enumerated Types</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getSpecializesFromEnumeratedType <em>Specializes From Enumerated Type</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Items</em>' containment reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_OwnedItems()
	 * @see conml.types.EnumeratedItem#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<EnumeratedItem> getOwnedItems();

  /**
	 * Returns the value of the '<em><b>Specialized By Enumerated Types</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedType}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getSpecializesFromEnumeratedType <em>Specializes From Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized By Enumerated Types</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_SpecializedByEnumeratedTypes()
	 * @see conml.types.EnumeratedType#getSpecializesFromEnumeratedType
	 * @model opposite="SpecializesFromEnumeratedType"
	 * @generated
	 */
	EList<EnumeratedType> getSpecializedByEnumeratedTypes();

  /**
	 * Returns the value of the '<em><b>Specializes From Enumerated Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getSpecializedByEnumeratedTypes <em>Specialized By Enumerated Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes From Enumerated Type</em>' reference.
	 * @see #setSpecializesFromEnumeratedType(EnumeratedType)
	 * @see conml.types.TypesPackage#getEnumeratedType_SpecializesFromEnumeratedType()
	 * @see conml.types.EnumeratedType#getSpecializedByEnumeratedTypes
	 * @model opposite="SpecializedByEnumeratedTypes"
	 * @generated
	 */
	EnumeratedType getSpecializesFromEnumeratedType();

  /**
	 * Sets the value of the '{@link conml.types.EnumeratedType#getSpecializesFromEnumeratedType <em>Specializes From Enumerated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes From Enumerated Type</em>' reference.
	 * @see #getSpecializesFromEnumeratedType()
	 * @generated
	 */
	void setSpecializesFromEnumeratedType(EnumeratedType value);

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
