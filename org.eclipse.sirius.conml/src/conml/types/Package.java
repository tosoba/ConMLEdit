/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Package#getName <em>Name</em>}</li>
 *   <li>{@link conml.types.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.types.Package#getContainsClass <em>Contains Class</em>}</li>
 *   <li>{@link conml.types.Package#getContainsEnumeratedType <em>Contains Enumerated Type</em>}</li>
 *   <li>{@link conml.types.Package#getIsOwnerOf <em>Is Owner Of</em>}</li>
 *   <li>{@link conml.types.Package#getIsSubPackageOf <em>Is Sub Package Of</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends TypeModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.types.TypesPackage#getPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.types.Package#getName <em>Name</em>}' attribute.
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
	 * @see conml.types.TypesPackage#getPackage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conml.types.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contains Class</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getBelongsToPackage <em>Belongs To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Class</em>' reference list.
	 * @see conml.types.TypesPackage#getPackage_ContainsClass()
	 * @see conml.types.Class#getBelongsToPackage
	 * @model opposite="BelongsToPackage"
	 * @generated
	 */
	EList<conml.types.Class> getContainsClass();

	/**
	 * Returns the value of the '<em><b>Contains Enumerated Type</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedType}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getBelongsToPackage <em>Belongs To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Enumerated Type</em>' reference list.
	 * @see conml.types.TypesPackage#getPackage_ContainsEnumeratedType()
	 * @see conml.types.EnumeratedType#getBelongsToPackage
	 * @model opposite="BelongsToPackage"
	 * @generated
	 */
	EList<EnumeratedType> getContainsEnumeratedType();

	/**
	 * Returns the value of the '<em><b>Is Owner Of</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Package}.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getIsSubPackageOf <em>Is Sub Package Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Owner Of</em>' reference list.
	 * @see conml.types.TypesPackage#getPackage_IsOwnerOf()
	 * @see conml.types.Package#getIsSubPackageOf
	 * @model opposite="isSubPackageOf"
	 * @generated
	 */
	EList<Package> getIsOwnerOf();

	/**
	 * Returns the value of the '<em><b>Is Sub Package Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getIsOwnerOf <em>Is Owner Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sub Package Of</em>' reference.
	 * @see #setIsSubPackageOf(Package)
	 * @see conml.types.TypesPackage#getPackage_IsSubPackageOf()
	 * @see conml.types.Package#getIsOwnerOf
	 * @model opposite="IsOwnerOf"
	 * @generated
	 */
	Package getIsSubPackageOf();

	/**
	 * Sets the value of the '{@link conml.types.Package#getIsSubPackageOf <em>Is Sub Package Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sub Package Of</em>' reference.
	 * @see #getIsSubPackageOf()
	 * @generated
	 */
	void setIsSubPackageOf(Package value);

} // Package
