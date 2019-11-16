/**
 */
package conml;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link conml.MetaInformation#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link conml.MetaInformation#getMetaInfoObject <em>Meta Info Object</em>}</li>
 *   <li>{@link conml.MetaInformation#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getMetaInformation()
 * @model
 * @generated
 */
public interface MetaInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' reference list.
	 * The list contents are of type {@link conml.ModelElement}.
	 * It is bidirectional and its opposite is '{@link conml.ModelElement#getElementMetaInformation <em>Element Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' reference list.
	 * @see conml.conmlPackage#getMetaInformation_ModelElements()
	 * @see conml.ModelElement#getElementMetaInformation
	 * @model opposite="ElementMetaInformation"
	 * @generated
	 */
	EList<ModelElement> getModelElements();

  /**
	 * Returns the value of the '<em><b>Meta Info Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getObjectMetaInformation <em>Object Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Info Object</em>' reference.
	 * @see #setMetaInfoObject(conml.instances.Object)
	 * @see conml.conmlPackage#getMetaInformation_MetaInfoObject()
	 * @see conml.instances.Object#getObjectMetaInformation
	 * @model opposite="ObjectMetaInformation" required="true"
	 * @generated
	 */
	conml.instances.Object getMetaInfoObject();

    /**
	 * Sets the value of the '{@link conml.MetaInformation#getMetaInfoObject <em>Meta Info Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Info Object</em>' reference.
	 * @see #getMetaInfoObject()
	 * @generated
	 */
	void setMetaInfoObject(conml.instances.Object value);

        /**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.Model#getMetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see conml.conmlPackage#getMetaInformation_Model()
	 * @see conml.Model#getMetaInformation
	 * @model opposite="MetaInformation" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

        /**
	 * Sets the value of the '{@link conml.MetaInformation#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // MetaInformation
