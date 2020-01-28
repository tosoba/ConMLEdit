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
 *   <li>{@link conml.types.Attribute#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link conml.types.Attribute#getRedefinedAttribute <em>Redefined Attribute</em>}</li>
 *   <li>{@link conml.types.Attribute#getRedefiningAttribute <em>Redefining Attribute</em>}</li>
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
	 * Returns the value of the '<em><b>Redefined Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getRedefiningAttribute <em>Redefining Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Attribute</em>' reference.
	 * @see #setRedefinedAttribute(Attribute)
	 * @see conml.types.TypesPackage#getAttribute_RedefinedAttribute()
	 * @see conml.types.Attribute#getRedefiningAttribute
	 * @model opposite="RedefiningAttribute"
	 * @generated
	 */
	Attribute getRedefinedAttribute();

    /**
	 * Sets the value of the '{@link conml.types.Attribute#getRedefinedAttribute <em>Redefined Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Attribute</em>' reference.
	 * @see #getRedefinedAttribute()
	 * @generated
	 */
	void setRedefinedAttribute(Attribute value);

        /**
	 * Returns the value of the '<em><b>Redefining Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getRedefinedAttribute <em>Redefined Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefining Attribute</em>' reference.
	 * @see #setRedefiningAttribute(Attribute)
	 * @see conml.types.TypesPackage#getAttribute_RedefiningAttribute()
	 * @see conml.types.Attribute#getRedefinedAttribute
	 * @model opposite="RedefinedAttribute"
	 * @generated
	 */
	Attribute getRedefiningAttribute();

        /**
	 * Sets the value of the '{@link conml.types.Attribute#getRedefiningAttribute <em>Redefining Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefining Attribute</em>' reference.
	 * @see #getRedefiningAttribute()
	 * @generated
	 */
	void setRedefiningAttribute(Attribute value);

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

                                /**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(conml.types.Class)
	 * @see conml.types.TypesPackage#getAttribute_OwnerClass()
	 * @see conml.types.Class#getAttributes
	 * @model opposite="Attributes" required="true" transient="false"
	 * @generated
	 */
	conml.types.Class getOwnerClass();

        /**
	 * Sets the value of the '{@link conml.types.Attribute#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(conml.types.Class value);

} // Attribute
