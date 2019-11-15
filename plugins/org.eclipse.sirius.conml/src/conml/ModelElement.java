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
 *   <li>{@link conml.ModelElement#getMetaInformation <em>Meta Information</em>}</li>
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
	 * Returns the value of the '<em><b>Meta Information</b></em>' reference list.
	 * The list contents are of type {@link conml.MetaInformation}.
	 * It is bidirectional and its opposite is '{@link conml.MetaInformation#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_MetaInformation()
	 * @see conml.MetaInformation#getModelElement
	 * @model opposite="ModelElement"
	 * @generated
	 */
	EList<MetaInformation> getMetaInformation();

} // ModelElement
