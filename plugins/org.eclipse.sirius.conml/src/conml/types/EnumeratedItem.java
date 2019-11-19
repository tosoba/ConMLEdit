/**
 */
package conml.types;

import conml.DefinableElement;
import conml.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.EnumeratedItem#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getSubItems <em>Sub Items</em>}</li>
 *   <li>{@link conml.types.EnumeratedItem#getSuperItem <em>Super Item</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getEnumeratedItem()
 * @model
 * @generated
 */
public interface EnumeratedItem extends NamedElement, DefinableElement {
	/**
	 * Returns the value of the '<em><b>Owner Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getOwnedItems <em>Owned Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Type</em>' container reference.
	 * @see #setOwnerType(EnumeratedType)
	 * @see conml.types.TypesPackage#getEnumeratedItem_OwnerType()
	 * @see conml.types.EnumeratedType#getOwnedItems
	 * @model opposite="OwnedItems" required="true" transient="false"
	 * @generated
	 */
	EnumeratedType getOwnerType();

  /**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getOwnerType <em>Owner Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type</em>' container reference.
	 * @see #getOwnerType()
	 * @generated
	 */
	void setOwnerType(EnumeratedType value);

  /**
	 * Returns the value of the '<em><b>Sub Items</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedItem}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getSuperItem <em>Super Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Items</em>' reference list.
	 * @see conml.types.TypesPackage#getEnumeratedItem_SubItems()
	 * @see conml.types.EnumeratedItem#getSuperItem
	 * @model opposite="SuperItem"
	 * @generated
	 */
	EList<EnumeratedItem> getSubItems();

  /**
	 * Returns the value of the '<em><b>Super Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedItem#getSubItems <em>Sub Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Item</em>' reference.
	 * @see #setSuperItem(EnumeratedItem)
	 * @see conml.types.TypesPackage#getEnumeratedItem_SuperItem()
	 * @see conml.types.EnumeratedItem#getSubItems
	 * @model opposite="SubItems"
	 * @generated
	 */
	EnumeratedItem getSuperItem();

  /**
	 * Sets the value of the '{@link conml.types.EnumeratedItem#getSuperItem <em>Super Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Item</em>' reference.
	 * @see #getSuperItem()
	 * @generated
	 */
	void setSuperItem(EnumeratedItem value);

} // EnumeratedItem
