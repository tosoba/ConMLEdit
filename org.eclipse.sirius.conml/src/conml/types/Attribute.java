/**
 */
package conml.types;

import conml.instances.ValueSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Attribute#isIsMultilingual <em>Is Multilingual</em>}</li>
 *   <li>{@link conml.types.Attribute#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.Attribute#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link conml.types.Attribute#getHasInstanceValueSets <em>Has Instance Value Sets</em>}</li>
 *   <li>{@link conml.types.Attribute#getIsOfType <em>Is Of Type</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Is Multilingual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multilingual</em>' attribute.
	 * @see #setIsMultilingual(boolean)
	 * @see conml.types.TypesPackage#getAttribute_IsMultilingual()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMultilingual();

	/**
	 * Sets the value of the '{@link conml.types.Attribute#isIsMultilingual <em>Is Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multilingual</em>' attribute.
	 * @see #isIsMultilingual()
	 * @generated
	 */
	void setIsMultilingual(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getOwnsAttributes <em>Owns Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(conml.types.Class)
	 * @see conml.types.TypesPackage#getAttribute_Owner()
	 * @see conml.types.Class#getOwnsAttributes
	 * @model opposite="OwnsAttributes" required="true"
	 * @generated
	 */
	conml.types.Class getOwner();

	/**
	 * Sets the value of the '{@link conml.types.Attribute#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(conml.types.Class value);

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see conml.types.TypesPackage#getAttribute_AssignedTo()
	 * @see conml.types.Class#getHasAttributes
	 * @model opposite="HasAttributes"
	 * @generated
	 */
	EList<conml.types.Class> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Has Instance Value Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ValueSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ValueSet#getIsAnInstanceOf <em>Is An Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Instance Value Sets</em>' reference list.
	 * @see conml.types.TypesPackage#getAttribute_HasInstanceValueSets()
	 * @see conml.instances.ValueSet#getIsAnInstanceOf
	 * @model opposite="IsAnInstanceOf"
	 * @generated
	 */
	EList<ValueSet> getHasInstanceValueSets();

	/**
	 * Returns the value of the '<em><b>Is Of Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.DataType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of Type</em>' reference.
	 * @see #setIsOfType(DataType)
	 * @see conml.types.TypesPackage#getAttribute_IsOfType()
	 * @see conml.types.DataType#getAppliesTo
	 * @model opposite="AppliesTo" required="true"
	 * @generated
	 */
	DataType getIsOfType();

	/**
	 * Sets the value of the '{@link conml.types.Attribute#getIsOfType <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of Type</em>' reference.
	 * @see #getIsOfType()
	 * @generated
	 */
	void setIsOfType(DataType value);

} // Attribute
