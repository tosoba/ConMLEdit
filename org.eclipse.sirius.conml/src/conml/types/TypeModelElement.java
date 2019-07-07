/**
 */
package conml.types;

import conml.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.TypeModelElement#getIsAssignedTo <em>Is Assigned To</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getTypeModelElement()
 * @model abstract="true"
 * @generated
 */
public interface TypeModelElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Assigned To</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getHasElements <em>Has Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assigned To</em>' reference list.
	 * @see conml.types.TypesPackage#getTypeModelElement_IsAssignedTo()
	 * @see conml.types.TypeModel#getHasElements
	 * @model opposite="HasElements"
	 * @generated
	 */
	EList<TypeModel> getIsAssignedTo();

} // TypeModelElement
