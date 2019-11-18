/**
 */
package conml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.Domain#getModels <em>Models</em>}</li>
 *   <li>{@link conml.Domain#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link conml.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see conml.conmlPackage#getDomain_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link conml.ModelPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see conml.conmlPackage#getDomain_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelPart> getParts();

} // Domain
