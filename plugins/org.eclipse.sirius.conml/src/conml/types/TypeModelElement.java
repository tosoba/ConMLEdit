/**
 */
package conml.types;

import conml.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.TypeModelElement#getTypeModel <em>Type Model</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getTypeModelElement()
 * @model abstract="true"
 * @generated
 */
public interface TypeModelElement extends ModelElement {

  /**
	 * Returns the value of the '<em><b>Type Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Model</em>' reference.
	 * @see #setTypeModel(TypeModel)
	 * @see conml.types.TypesPackage#getTypeModelElement_TypeModel()
	 * @see conml.types.TypeModel#getElements
	 * @model opposite="Elements" required="true"
	 * @generated
	 */
	TypeModel getTypeModel();

  /**
	 * Sets the value of the '{@link conml.types.TypeModelElement#getTypeModel <em>Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Model</em>' reference.
	 * @see #getTypeModel()
	 * @generated
	 */
	void setTypeModel(TypeModel value);

} // TypeModelElement
