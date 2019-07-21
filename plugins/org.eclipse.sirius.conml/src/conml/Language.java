/**
 */
package conml;

import conml.instances.FacetSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.Language#getName <em>Name</em>}</li>
 *   <li>{@link conml.Language#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.Language#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link conml.Language#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link conml.Language#getIsDefaultIn <em>Is Default In</em>}</li>
 *   <li>{@link conml.Language#getIsTranslationQualifierOf <em>Is Translation Qualifier Of</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends ModelPart {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.conmlPackage#getLanguage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.Language#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see conml.conmlPackage#getLanguage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conml.Language#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see conml.conmlPackage#getLanguage_IsDefault()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link conml.Language#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.Model#getHasLanguages <em>Has Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(Model)
	 * @see conml.conmlPackage#getLanguage_BelongsTo()
	 * @see conml.Model#getHasLanguages
	 * @model opposite="HasLanguages" required="true" transient="false"
	 * @generated
	 */
	Model getBelongsTo();

	/**
	 * Sets the value of the '{@link conml.Language#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Model value);

	/**
	 * Returns the value of the '<em><b>Is Default In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.Model#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default In</em>' reference.
	 * @see #setIsDefaultIn(Model)
	 * @see conml.conmlPackage#getLanguage_IsDefaultIn()
	 * @see conml.Model#getDefaultLanguage
	 * @model opposite="DefaultLanguage" required="true"
	 * @generated
	 */
	Model getIsDefaultIn();

	/**
	 * Sets the value of the '{@link conml.Language#getIsDefaultIn <em>Is Default In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default In</em>' reference.
	 * @see #getIsDefaultIn()
	 * @generated
	 */
	void setIsDefaultIn(Model value);

	/**
	 * Returns the value of the '<em><b>Is Translation Qualifier Of</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.FacetSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Translation Qualifier Of</em>' reference list.
	 * @see conml.conmlPackage#getLanguage_IsTranslationQualifierOf()
	 * @model
	 * @generated
	 */
	EList<FacetSet> getIsTranslationQualifierOf();

} // Language
