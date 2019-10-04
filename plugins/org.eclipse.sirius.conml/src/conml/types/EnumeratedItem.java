/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.EnumeratedItem#getName <em>Name</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getIsSuperItemOf <em>Is Super Item Of</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getIsSubItemOf <em>Is Sub Item Of</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getEnumeratedItem()
 * @model
 * @generated
 */
public interface EnumeratedItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.types.TypesPackage#getEnumeratedItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Name</em>' attribute.
	 * @see #setAbsoluteName(String)
	 * @see conml.types.TypesPackage#getEnumeratedItem_AbsoluteName()
	 * @model required="true"
	 * @generated
	 */
	String getAbsoluteName();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getAbsoluteName <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Name</em>' attribute.
	 * @see #getAbsoluteName()
	 * @generated
	 */
	void setAbsoluteName(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see conml.types.TypesPackage#getEnumeratedItem_Definition()
	 * @model
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getOwnsItems <em>Owns Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(EnumeratedType)
	 * @see conml.types.TypesPackage#getEnumeratedItem_Owner()
	 * @see conml.types.EnumeratedType#getOwnsItems
	 * @model opposite="OwnsItems" required="true" transient="false"
	 * @generated
	 */
	EnumeratedType getOwner();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(EnumeratedType value);

	/**
	 * Returns the value of the '<em><b>Is Super Item Of</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getIsSubItemOf <em>Is Sub Item Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Super Item Of</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedItem_IsSuperItemOf()
	 * @see conml.types.EnumeratedItem#getIsSubItemOf
	 * @model opposite="IsSubItemOf"
	 * @generated
	 */
	EList<EnumeratedItem> getIsSuperItemOf();

	/**
	 * Returns the value of the '<em><b>Is Sub Item Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getIsSuperItemOf <em>Is Super Item Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sub Item Of</em>' reference.
	 * @see #setIsSubItemOf(EnumeratedItem)
	 * @see conml.types.TypesPackage#getEnumeratedItem_IsSubItemOf()
	 * @see conml.types.EnumeratedItem#getIsSuperItemOf
	 * @model opposite="IsSuperItemOf"
	 * @generated
	 */
	EnumeratedItem getIsSubItemOf();

	/**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getIsSubItemOf <em>Is Sub Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sub Item Of</em>' reference.
	 * @see #getIsSubItemOf()
	 * @generated
	 */
	void setIsSubItemOf(EnumeratedItem value);

} // EnumeratedItem
