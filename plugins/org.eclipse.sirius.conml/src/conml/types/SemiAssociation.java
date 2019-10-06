/**
 */
package conml.types;

import conml.instances.ReferenceSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semi Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.SemiAssociation#getRole <em>Role</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#isIsWhole <em>Is Whole</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#isIsStrong <em>Is Strong</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getIsPrimaryIn <em>Is Primary In</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getIsSecondaryIn <em>Is Secondary In</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getHasInstanceReferenceSets <em>Has Instance Reference Sets</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getInverse <em>Inverse</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getReferredClass <em>Referred Class</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getSemiAssociation()
 * @model
 * @generated
 */
public interface SemiAssociation extends Feature {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see conml.types.TypesPackage#getSemiAssociation_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Is Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Whole</em>' attribute.
	 * @see #setIsWhole(boolean)
	 * @see conml.types.TypesPackage#getSemiAssociation_IsWhole()
	 * @model
	 * @generated
	 */
	boolean isIsWhole();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#isIsWhole <em>Is Whole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Whole</em>' attribute.
	 * @see #isIsWhole()
	 * @generated
	 */
	void setIsWhole(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strong</em>' attribute.
	 * @see #setIsStrong(boolean)
	 * @see conml.types.TypesPackage#getSemiAssociation_IsStrong()
	 * @model
	 * @generated
	 */
	boolean isIsStrong();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#isIsStrong <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strong</em>' attribute.
	 * @see #isIsStrong()
	 * @generated
	 */
	void setIsStrong(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getSemiassociations <em>Semiassociations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(conml.types.Class)
	 * @see conml.types.TypesPackage#getSemiAssociation_Owner()
	 * @see conml.types.Class#getSemiassociations
	 * @model opposite="Semiassociations" required="true" transient="false"
	 * @generated
	 */
	conml.types.Class getOwner();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(conml.types.Class value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' reference.
	 * @see #setInverse(SemiAssociation)
	 * @see conml.types.TypesPackage#getSemiAssociation_Inverse()
	 * @model required="true"
	 * @generated
	 */
	SemiAssociation getInverse();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getInverse <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' reference.
	 * @see #getInverse()
	 * @generated
	 */
	void setInverse(SemiAssociation value);

	/**
	 * Returns the value of the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Class</em>' reference.
	 * @see #setReferredClass(conml.types.Class)
	 * @see conml.types.TypesPackage#getSemiAssociation_ReferredClass()
	 * @model required="true"
	 * @generated
	 */
	conml.types.Class getReferredClass();

  /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getReferredClass <em>Referred Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Class</em>' reference.
	 * @see #getReferredClass()
	 * @generated
	 */
	void setReferredClass(conml.types.Class value);

  /**
	 * Returns the value of the '<em><b>Is Primary In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Association#getHasPrimary <em>Has Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary In</em>' reference.
	 * @see #setIsPrimaryIn(Association)
	 * @see conml.types.TypesPackage#getSemiAssociation_IsPrimaryIn()
	 * @see conml.types.Association#getHasPrimary
	 * @model opposite="HasPrimary"
	 * @generated
	 */
	Association getIsPrimaryIn();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getIsPrimaryIn <em>Is Primary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary In</em>' reference.
	 * @see #getIsPrimaryIn()
	 * @generated
	 */
	void setIsPrimaryIn(Association value);

	/**
	 * Returns the value of the '<em><b>Is Secondary In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Association#getHasSecondary <em>Has Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Secondary In</em>' reference.
	 * @see #setIsSecondaryIn(Association)
	 * @see conml.types.TypesPackage#getSemiAssociation_IsSecondaryIn()
	 * @see conml.types.Association#getHasSecondary
	 * @model opposite="HasSecondary"
	 * @generated
	 */
	Association getIsSecondaryIn();

	/**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getIsSecondaryIn <em>Is Secondary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Secondary In</em>' reference.
	 * @see #getIsSecondaryIn()
	 * @generated
	 */
	void setIsSecondaryIn(Association value);

	/**
	 * Returns the value of the '<em><b>Has Instance Reference Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ReferenceSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ReferenceSet#getIsAnInstanceOf <em>Is An Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Instance Reference Sets</em>' reference list.
	 * @see conml.types.TypesPackage#getSemiAssociation_HasInstanceReferenceSets()
	 * @see conml.instances.ReferenceSet#getIsAnInstanceOf
	 * @model opposite="IsAnInstanceOf"
	 * @generated
	 */
	EList<ReferenceSet> getHasInstanceReferenceSets();

} // SemiAssociation
