/**
 */
package conml.types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Property#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link conml.types.Property#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature {

  /**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference.
	 * @see #setRedefinedProperty(Property)
	 * @see conml.types.TypesPackage#getProperty_RedefinedProperty()
	 * @model
	 * @generated
	 */
	Property getRedefinedProperty();

  /**
	 * Sets the value of the '{@link conml.types.Property#getRedefinedProperty <em>Redefined Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Property</em>' reference.
	 * @see #getRedefinedProperty()
	 * @generated
	 */
	void setRedefinedProperty(Property value);

    /**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(conml.types.Class)
	 * @see conml.types.TypesPackage#getProperty_OwnerClass()
	 * @see conml.types.Class#getProperties
	 * @model opposite="Properties" required="true" transient="false"
	 * @generated
	 */
	conml.types.Class getOwnerClass();

    /**
	 * Sets the value of the '{@link conml.types.Property#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(conml.types.Class value);

} // Property
