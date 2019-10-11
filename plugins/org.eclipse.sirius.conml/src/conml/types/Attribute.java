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
 *   <li>{@link conml.types.Attribute#isMultilingual <em>Multilingual</em>}</li>
 *   <li>{@link conml.types.Attribute#getInstanceValueSets <em>Instance Value Sets</em>}</li>
 *   <li>{@link conml.types.Attribute#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Multilingual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multilingual</em>' attribute.
	 * @see #setMultilingual(boolean)
	 * @see conml.types.TypesPackage#getAttribute_Multilingual()
	 * @model required="true"
	 * @generated
	 */
	boolean isMultilingual();

  /**
	 * Sets the value of the '{@link conml.types.Attribute#isMultilingual <em>Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multilingual</em>' attribute.
	 * @see #isMultilingual()
	 * @generated
	 */
	void setMultilingual(boolean value);

  /**
	 * Returns the value of the '<em><b>Instance Value Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ValueSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ValueSet#getInstancedAttribute <em>Instanced Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Value Sets</em>' reference list.
	 * @see conml.types.TypesPackage#getAttribute_InstanceValueSets()
	 * @see conml.instances.ValueSet#getInstancedAttribute
	 * @model opposite="InstancedAttribute"
	 * @generated
	 */
	EList<ValueSet> getInstanceValueSets();

    /**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see conml.types.TypesPackage#getAttribute_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

  /**
	 * Sets the value of the '{@link conml.types.Attribute#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // Attribute
