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
 *   <li>{@link conml.ModelElement#getElementMetaInformation <em>Element Meta Information</em>}</li>
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
	 * Returns the value of the '<em><b>Element Meta Information</b></em>' reference list.
	 * The list contents are of type {@link conml.MetaInformation}.
	 * It is bidirectional and its opposite is '{@link conml.MetaInformation#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Meta Information</em>' reference list.
	 * @see conml.conmlPackage#getModelElement_ElementMetaInformation()
	 * @see conml.MetaInformation#getModelElements
	 * @model opposite="ModelElements"
	 * @generated
	 */
	EList<MetaInformation> getElementMetaInformation();

} // ModelElement
