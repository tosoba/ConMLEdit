/**
 */
package conml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.TestContainer#getTestElements <em>Test Elements</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getTestContainer()
 * @model
 * @generated
 */
public interface TestContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Elements</b></em>' containment reference list.
	 * The list contents are of type {@link conml.TestElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Elements</em>' containment reference list.
	 * @see conml.conmlPackage#getTestContainer_TestElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestElement> getTestElements();

} // TestContainer
