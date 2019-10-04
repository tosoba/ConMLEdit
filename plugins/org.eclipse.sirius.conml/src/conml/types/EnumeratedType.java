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
 *   <li>{@link conml.types.EnumeratedType#getOwnsItems <em>Owns Items</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getSpecializesFrom <em>Specializes From</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getEnumeratedType()
 * @model
 * @generated
 */
public interface EnumeratedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Owns Items</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Items</em>' containment reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_OwnsItems()
	 * @see conml.types.EnumeratedItem#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<EnumeratedItem> getOwnsItems();

	/**
	 * Returns the value of the '<em><b>Is Specialized By</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedType}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getSpecializesFrom <em>Specializes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specialized By</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_IsSpecializedBy()
	 * @see conml.types.EnumeratedType#getSpecializesFrom
	 * @model opposite="SpecializesFrom"
	 * @generated
	 */
	EList<EnumeratedType> getIsSpecializedBy();

	/**
	 * Returns the value of the '<em><b>Specializes From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes From</em>' reference.
	 * @see #setSpecializesFrom(EnumeratedType)
	 * @see conml.types.TypesPackage#getEnumeratedType_SpecializesFrom()
	 * @see conml.types.EnumeratedType#getIsSpecializedBy
	 * @model opposite="IsSpecializedBy"
	 * @generated
	 */
	EnumeratedType getSpecializesFrom();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedType#getSpecializesFrom <em>Specializes From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes From</em>' reference.
	 * @see #getSpecializesFrom()
	 * @generated
	 */
	void setSpecializesFrom(EnumeratedType value);

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
