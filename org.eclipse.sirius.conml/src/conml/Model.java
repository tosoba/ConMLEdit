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
 *   <li>{@link conml.Model#getHasTags <em>Has Tags</em>}</li>
 *   <li>{@link conml.Model#getHasLanguages <em>Has Languages</em>}</li>
 *   <li>{@link conml.Model#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link conml.Model#getOwnsElements <em>Owns Elements</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getModel()
 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see conml.conmlPackage#getModel_Version()
	 * @model required="true"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link conml.Model#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see conml.conmlPackage#getModel_Description()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Has Tags</b></em>' containment reference list.
	 * The list contents are of type {@link conml.Tag}.
	 * It is bidirectional and its opposite is '{@link conml.Tag#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Tags</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_HasTags()
	 * @see conml.Tag#getBelongsTo
	 * @model opposite="BelongsTo" containment="true"
	 * @generated
	 */
	EList<Tag> getHasTags();

	/**
	 * Returns the value of the '<em><b>Has Languages</b></em>' containment reference list.
	 * The list contents are of type {@link conml.Language}.
	 * It is bidirectional and its opposite is '{@link conml.Language#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Languages</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_HasLanguages()
	 * @see conml.Language#getBelongsTo
	 * @model opposite="BelongsTo" containment="true"
	 * @generated
	 */
	EList<Language> getHasLanguages();

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.Language#getIsDefaultIn <em>Is Default In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Language</em>' reference.
	 * @see #setDefaultLanguage(Language)
	 * @see conml.conmlPackage#getModel_DefaultLanguage()
	 * @see conml.Language#getIsDefaultIn
	 * @model opposite="isDefaultIn" required="true"
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
	 * Returns the value of the '<em><b>Owns Elements</b></em>' containment reference list.
	 * The list contents are of type {@link conml.ModelElement}.
	 * It is bidirectional and its opposite is '{@link conml.ModelElement#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Elements</em>' containment reference list.
	 * @see conml.conmlPackage#getModel_OwnsElements()
	 * @see conml.ModelElement#getBelongsTo
	 * @model opposite="BelongsTo" containment="true"
	 * @generated
	 */
	EList<ModelElement> getOwnsElements();

} // Model
