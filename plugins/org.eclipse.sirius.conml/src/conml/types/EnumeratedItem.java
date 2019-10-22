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
 *   <li>{@link conml.types.EnumeratedItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getSuperItemOfEnumeratedItems <em>Super Item Of Enumerated Items</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getSubItemOfEnumeratedItem <em>Sub Item Of Enumerated Item</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getOwnedItems <em>Owned Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(EnumeratedType)
	 * @see conml.types.TypesPackage#getEnumeratedItem_Owner()
	 * @see conml.types.EnumeratedType#getOwnedItems
	 * @model opposite="OwnedItems" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Super Item Of Enumerated Items</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getSubItemOfEnumeratedItem <em>Sub Item Of Enumerated Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Item Of Enumerated Items</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedItem_SuperItemOfEnumeratedItems()
	 * @see conml.types.EnumeratedItem#getSubItemOfEnumeratedItem
	 * @model opposite="SubItemOfEnumeratedItem"
	 * @generated
	 */
	EList<EnumeratedItem> getSuperItemOfEnumeratedItems();

  /**
	 * Returns the value of the '<em><b>Sub Item Of Enumerated Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getSuperItemOfEnumeratedItems <em>Super Item Of Enumerated Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Item Of Enumerated Item</em>' reference.
	 * @see #setSubItemOfEnumeratedItem(EnumeratedItem)
	 * @see conml.types.TypesPackage#getEnumeratedItem_SubItemOfEnumeratedItem()
	 * @see conml.types.EnumeratedItem#getSuperItemOfEnumeratedItems
	 * @model opposite="SuperItemOfEnumeratedItems"
	 * @generated
	 */
	EnumeratedItem getSubItemOfEnumeratedItem();

  /**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getSubItemOfEnumeratedItem <em>Sub Item Of Enumerated Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Item Of Enumerated Item</em>' reference.
	 * @see #getSubItemOfEnumeratedItem()
	 * @generated
	 */
	void setSubItemOfEnumeratedItem(EnumeratedItem value);

} // EnumeratedItem
