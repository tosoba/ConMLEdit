/**
 */
package conml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.MetaInformation#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getMetaInformation()
 * @model
 * @generated
 */
public interface MetaInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(conml.instances.Object)
	 * @see conml.conmlPackage#getMetaInformation_Object()
	 * @model required="true"
	 * @generated
	 */
	conml.instances.Object getObject();

	/**
	 * Sets the value of the '{@link conml.MetaInformation#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(conml.instances.Object value);

} // MetaInformation
