/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Property#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link conml.types.Property#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature {
	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getHasProperties <em>Has Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see conml.types.TypesPackage#getProperty_AssignedTo()
	 * @see conml.types.Class#getHasProperties
	 * @model opposite="HasProperties"
	 * @generated
	 */
	EList<conml.types.Class> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getOwnsProperties <em>Owns Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(conml.types.Class)
	 * @see conml.types.TypesPackage#getProperty_Owner()
	 * @see conml.types.Class#getOwnsProperties
	 * @model opposite="OwnsProperties" required="true" transient="false"
	 * @generated
	 */
	conml.types.Class getOwner();

	/**
	 * Sets the value of the '{@link conml.types.Property#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(conml.types.Class value);

} // Property
