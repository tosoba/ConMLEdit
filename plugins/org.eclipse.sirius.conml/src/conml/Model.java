/**
 */
package conml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.Model#getVersion <em>Version</em>}</li>
 *   <li>{@link conml.Model#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link conml.Model#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.Model#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getModel()
 * @model abstract="true"
 * @generated
 */
public interface Model extends NamedElement, DescribableElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(double)
	 * @see conml.conmlPackage#getModel_Version()
	 * @model default="1.0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getVersion();

	/**
	 * Sets the value of the '{@link conml.Model#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(double value);

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Language</em>' reference.
	 * @see #setDefaultLanguage(Language)
	 * @see conml.conmlPackage#getModel_DefaultLanguage()
	 * @model required="true"
	 * @generated
	 */
	Language getDefaultLanguage();

	/**
	 * Sets the value of the '{@link conml.Model#getDefaultLanguage <em>Default Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Language</em>' reference.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link conml.Tag}.
	 * It is bidirectional and its opposite is '{@link conml.Tag#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see conml.conmlPackage#getModel_Tags()
	 * @see conml.Tag#getModel
	 * @model opposite="Model"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' reference list.
	 * The list contents are of type {@link conml.Language}.
	 * It is bidirectional and its opposite is '{@link conml.Language#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' reference list.
	 * @see conml.conmlPackage#getModel_Languages()
	 * @see conml.Language#getModel
	 * @model opposite="Model"
	 * @generated
	 */
	EList<Language> getLanguages();

} // Model
