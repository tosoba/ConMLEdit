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
 *   <li>{@link conml.Language#isDefault <em>Default</em>}</li>
 *   <li>{@link conml.Language#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getLanguage()
 * @model abstract="true"
 * @generated
 */
public interface Language extends ModelPart, NamedElement, DescribableElement {
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

    /**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.Model#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see conml.conmlPackage#getLanguage_Model()
	 * @see conml.Model#getLanguages
	 * @model opposite="Languages" required="true"
	 * @generated
	 */
	Model getModel();

    /**
	 * Sets the value of the '{@link conml.Language#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Language
