/**
 */
package conml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.Model#getName <em>Name</em>}</li>
 *   <li>{@link conml.Model#getVersion <em>Version</em>}</li>
 *   <li>{@link conml.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.Model#getLanguages <em>Languages</em>}</li>
 *   <li>{@link conml.Model#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link conml.Model#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.Model#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link conml.Model#getMetaInformationObjects <em>Meta Information Objects</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getModel()
 * @model abstract="true"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.conmlPackage#getModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"New model"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see conml.conmlPackage#getModel_Description()
	 * @model default="New model" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conml.Model#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link conml.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Meta Information</b></em>' containment reference list.
	 * The list contents are of type {@link conml.MetaInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_MetaInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaInformation> getMetaInformation();

  /**
	 * Returns the value of the '<em><b>Meta Information Objects</b></em>' containment reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getMetaInfoInModel <em>Meta Info In Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information Objects</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_MetaInformationObjects()
	 * @see conml.instances.Object#getMetaInfoInModel
	 * @model opposite="MetaInfoInModel" containment="true"
	 * @generated
	 */
	EList<conml.instances.Object> getMetaInformationObjects();

  /**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link conml.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getLanguages();

} // Model
