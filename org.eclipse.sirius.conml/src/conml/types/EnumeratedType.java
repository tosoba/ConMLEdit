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
 *   <li>{@link conml.types.EnumeratedType#getHasItems <em>Has Items</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getSpecializesFrom <em>Specializes From</em>}</li>
 *   <li>{@link conml.types.EnumeratedType#getBelongsToPackage <em>Belongs To Package</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getEnumeratedType()
 * @model
 * @generated
 */
public interface EnumeratedType extends DataType {
	/**
	 * Returns the value of the '<em><b>Owns Items</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Items</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_OwnsItems()
	 * @see conml.types.EnumeratedItem#getOwner
	 * @model opposite="Owner"
	 * @generated
	 */
	EList<EnumeratedItem> getOwnsItems();

	/**
	 * Returns the value of the '<em><b>Has Items</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Items</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedType_HasItems()
	 * @see conml.types.EnumeratedItem#getAssignedTo
	 * @model opposite="AssignedTo"
	 * @generated
	 */
	EList<EnumeratedItem> getHasItems();

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
	 * Returns the value of the '<em><b>Belongs To Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getContainsEnumeratedType <em>Contains Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Package</em>' reference.
	 * @see #setBelongsToPackage(conml.types.Package)
	 * @see conml.types.TypesPackage#getEnumeratedType_BelongsToPackage()
	 * @see conml.types.Package#getContainsEnumeratedType
	 * @model opposite="ContainsEnumeratedType"
	 * @generated
	 */
	conml.types.Package getBelongsToPackage();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedType#getBelongsToPackage <em>Belongs To Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Package</em>' reference.
	 * @see #getBelongsToPackage()
	 * @generated
	 */
	void setBelongsToPackage(conml.types.Package value);

} // EnumeratedType
