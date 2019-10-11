/**
 */
package conml;

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
 *   <li>{@link conml.Language#isDefault <em>Default</em>}</li>
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
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see conml.conmlPackage#getLanguage_Default()
	 * @model required="true"
	 * @generated
	 */
	boolean isDefault();

  /**
	 * Sets the value of the '{@link conml.Language#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // Language
