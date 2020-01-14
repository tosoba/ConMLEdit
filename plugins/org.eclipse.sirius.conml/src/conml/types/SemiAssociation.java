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
 *   <li>{@link conml.types.SemiAssociation#isWhole <em>Whole</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#isStrong <em>Strong</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getPrimaryInAssociation <em>Primary In Association</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getSecondaryInAssociation <em>Secondary In Association</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getInstanceReferenceSets <em>Instance Reference Sets</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getInverseSemiAssociation <em>Inverse Semi Association</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getReferredClass <em>Referred Class</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getRedefinedSemiAssociation <em>Redefined Semi Association</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#isNameDisplayed <em>Name Displayed</em>}</li>
 *   <li>{@link conml.types.SemiAssociation#isRoleDisplayed <em>Role Displayed</em>}</li>
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
	 * Returns the value of the '<em><b>Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole</em>' attribute.
	 * @see #setWhole(boolean)
	 * @see conml.types.TypesPackage#getSemiAssociation_Whole()
	 * @model
	 * @generated
	 */
	boolean isWhole();

  /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#isWhole <em>Whole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole</em>' attribute.
	 * @see #isWhole()
	 * @generated
	 */
	void setWhole(boolean value);

  /**
	 * Returns the value of the '<em><b>Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' attribute.
	 * @see #setStrong(boolean)
	 * @see conml.types.TypesPackage#getSemiAssociation_Strong()
	 * @model
	 * @generated
	 */
	boolean isStrong();

  /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#isStrong <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong</em>' attribute.
	 * @see #isStrong()
	 * @generated
	 */
	void setStrong(boolean value);

  /**
	 * Returns the value of the '<em><b>Primary In Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Association#getPrimarySemiAssociation <em>Primary Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary In Association</em>' reference.
	 * @see #setPrimaryInAssociation(Association)
	 * @see conml.types.TypesPackage#getSemiAssociation_PrimaryInAssociation()
	 * @see conml.types.Association#getPrimarySemiAssociation
	 * @model opposite="PrimarySemiAssociation"
	 * @generated
	 */
	Association getPrimaryInAssociation();

  /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getPrimaryInAssociation <em>Primary In Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary In Association</em>' reference.
	 * @see #getPrimaryInAssociation()
	 * @generated
	 */
	void setPrimaryInAssociation(Association value);

  /**
	 * Returns the value of the '<em><b>Secondary In Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Association#getSecondarySemiAssociation <em>Secondary Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary In Association</em>' reference.
	 * @see #setSecondaryInAssociation(Association)
	 * @see conml.types.TypesPackage#getSemiAssociation_SecondaryInAssociation()
	 * @see conml.types.Association#getSecondarySemiAssociation
	 * @model opposite="SecondarySemiAssociation"
	 * @generated
	 */
	Association getSecondaryInAssociation();

  /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getSecondaryInAssociation <em>Secondary In Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary In Association</em>' reference.
	 * @see #getSecondaryInAssociation()
	 * @generated
	 */
	void setSecondaryInAssociation(Association value);

  /**
	 * Returns the value of the '<em><b>Instance Reference Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.ReferenceSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.ReferenceSet#getInstancedSemiAssociation <em>Instanced Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Reference Sets</em>' reference list.
	 * @see conml.types.TypesPackage#getSemiAssociation_InstanceReferenceSets()
	 * @see conml.instances.ReferenceSet#getInstancedSemiAssociation
	 * @model opposite="InstancedSemiAssociation"
	 * @generated
	 */
	EList<ReferenceSet> getInstanceReferenceSets();

  /**
	 * Returns the value of the '<em><b>Inverse Semi Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Semi Association</em>' reference.
	 * @see #setInverseSemiAssociation(SemiAssociation)
	 * @see conml.types.TypesPackage#getSemiAssociation_InverseSemiAssociation()
	 * @model required="true"
	 * @generated
	 */
	SemiAssociation getInverseSemiAssociation();

  /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getInverseSemiAssociation <em>Inverse Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Semi Association</em>' reference.
	 * @see #getInverseSemiAssociation()
	 * @generated
	 */
	void setInverseSemiAssociation(SemiAssociation value);

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
	 * Returns the value of the '<em><b>Redefined Semi Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Semi Association</em>' reference.
	 * @see #setRedefinedSemiAssociation(SemiAssociation)
	 * @see conml.types.TypesPackage#getSemiAssociation_RedefinedSemiAssociation()
	 * @model
	 * @generated
	 */
	SemiAssociation getRedefinedSemiAssociation();

    /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getRedefinedSemiAssociation <em>Redefined Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Semi Association</em>' reference.
	 * @see #getRedefinedSemiAssociation()
	 * @generated
	 */
	void setRedefinedSemiAssociation(SemiAssociation value);

        /**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getSemiAssociations <em>Semi Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(conml.types.Class)
	 * @see conml.types.TypesPackage#getSemiAssociation_OwnerClass()
	 * @see conml.types.Class#getSemiAssociations
	 * @model opposite="SemiAssociations" required="true" transient="false"
	 * @generated
	 */
	conml.types.Class getOwnerClass();

        /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(conml.types.Class value);

                /**
	 * Returns the value of the '<em><b>Name Displayed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Displayed</em>' attribute.
	 * @see #setNameDisplayed(boolean)
	 * @see conml.types.TypesPackage#getSemiAssociation_NameDisplayed()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isNameDisplayed();

                /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#isNameDisplayed <em>Name Displayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Displayed</em>' attribute.
	 * @see #isNameDisplayed()
	 * @generated
	 */
	void setNameDisplayed(boolean value);

                /**
	 * Returns the value of the '<em><b>Role Displayed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Displayed</em>' attribute.
	 * @see #setRoleDisplayed(boolean)
	 * @see conml.types.TypesPackage#getSemiAssociation_RoleDisplayed()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRoleDisplayed();

                /**
	 * Sets the value of the '{@link conml.types.SemiAssociation#isRoleDisplayed <em>Role Displayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Displayed</em>' attribute.
	 * @see #isRoleDisplayed()
	 * @generated
	 */
	void setRoleDisplayed(boolean value);

} // SemiAssociation
