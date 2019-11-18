/**
 */
package conml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.Tag#getName <em>Name</em>}</li>
 *   <li>{@link conml.Tag#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends ModelPart {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.conmlPackage#getTag_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

  /**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.Model#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see conml.conmlPackage#getTag_Model()
	 * @see conml.Model#getTags
	 * @model opposite="Tags" required="true"
	 * @generated
	 */
	Model getModel();

  /**
	 * Sets the value of the '{@link conml.Tag#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Tag
