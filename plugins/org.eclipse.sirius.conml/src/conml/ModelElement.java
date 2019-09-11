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
 *   <li>{@link conml.ModelElement#getIsTaggedWith <em>Is Tagged With</em>}</li>
 *   <li>{@link conml.ModelElement#getIsDocumentedBy <em>Is Documented By</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends ModelPart {
	/**
	 * Returns the value of the '<em><b>Is Tagged With</b></em>' reference list.
	 * The list contents are of type {@link conml.Tag}.
	 * It is bidirectional and its opposite is '{@link conml.Tag#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tagged With</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_IsTaggedWith()
	 * @see conml.Tag#getAppliesTo
	 * @model opposite="AppliesTo"
	 * @generated
	 */
	EList<Tag> getIsTaggedWith();

	/**
	 * Returns the value of the '<em><b>Is Documented By</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Documented By</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_IsDocumentedBy()
	 * @see conml.instances.Object#getDocuments
	 * @model opposite="Documents"
	 * @generated
	 */
	EList<conml.instances.Object> getIsDocumentedBy();

} // ModelElement
