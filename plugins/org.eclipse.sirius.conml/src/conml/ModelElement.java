/**
 */
package conml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.ModelElement#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.ModelElement#getDocumentingObjects <em>Documenting Objects</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends ModelPart {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link conml.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

  /**
	 * Returns the value of the '<em><b>Documenting Objects</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documenting Objects</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_DocumentingObjects()
	 * @model
	 * @generated
	 */
	EList<conml.instances.Object> getDocumentingObjects();

} // ModelElement
