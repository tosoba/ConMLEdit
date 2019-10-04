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
 *   <li>{@link conml.ModelElement#getTaggedWith <em>Tagged With</em>}</li>
 *   <li>{@link conml.ModelElement#getDocumentedBy <em>Documented By</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends ModelPart {
	/**
	 * Returns the value of the '<em><b>Tagged With</b></em>' reference list.
	 * The list contents are of type {@link conml.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged With</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_TaggedWith()
	 * @model
	 * @generated
	 */
	EList<Tag> getTaggedWith();

	/**
	 * Returns the value of the '<em><b>Documented By</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented By</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_DocumentedBy()
	 * @model
	 * @generated
	 */
	EList<conml.instances.Object> getDocumentedBy();

} // ModelElement
