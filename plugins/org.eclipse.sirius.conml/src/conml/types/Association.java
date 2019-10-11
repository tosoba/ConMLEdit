/**
 */
package conml.types;

import conml.instances.Link;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Association#getHasPrimary <em>Has Primary</em>}</li>
 *   <li>{@link conml.types.Association#getHasSecondary <em>Has Secondary</em>}</li>
 *   <li>{@link conml.types.Association#getHasInstanceLinks <em>Has Instance Links</em>}</li>
 *   <li>{@link conml.types.Association#isCompact <em>Compact</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Type {
	/**
	 * Returns the value of the '<em><b>Has Primary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getIsPrimaryIn <em>Is Primary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Primary</em>' reference.
	 * @see #setHasPrimary(SemiAssociation)
	 * @see conml.types.TypesPackage#getAssociation_HasPrimary()
	 * @see conml.types.SemiAssociation#getIsPrimaryIn
	 * @model opposite="IsPrimaryIn" required="true"
	 * @generated
	 */
	SemiAssociation getHasPrimary();

	/**
	 * Sets the value of the '{@link conml.types.Association#getHasPrimary <em>Has Primary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Primary</em>' reference.
	 * @see #getHasPrimary()
	 * @generated
	 */
	void setHasPrimary(SemiAssociation value);

	/**
	 * Returns the value of the '<em><b>Has Secondary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getIsSecondaryIn <em>Is Secondary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Secondary</em>' reference.
	 * @see #setHasSecondary(SemiAssociation)
	 * @see conml.types.TypesPackage#getAssociation_HasSecondary()
	 * @see conml.types.SemiAssociation#getIsSecondaryIn
	 * @model opposite="IsSecondaryIn" required="true"
	 * @generated
	 */
	SemiAssociation getHasSecondary();

	/**
	 * Sets the value of the '{@link conml.types.Association#getHasSecondary <em>Has Secondary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Secondary</em>' reference.
	 * @see #getHasSecondary()
	 * @generated
	 */
	void setHasSecondary(SemiAssociation value);

	/**
	 * Returns the value of the '<em><b>Has Instance Links</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Link}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Link#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Instance Links</em>' reference list.
	 * @see conml.types.TypesPackage#getAssociation_HasInstanceLinks()
	 * @see conml.instances.Link#getIsInstanceOf
	 * @model opposite="IsInstanceOf"
	 * @generated
	 */
	EList<Link> getHasInstanceLinks();

	/**
	 * Returns the value of the '<em><b>Compact</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compact</em>' attribute.
	 * @see #setCompact(boolean)
	 * @see conml.types.TypesPackage#getAssociation_Compact()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCompact();

  /**
	 * Sets the value of the '{@link conml.types.Association#isCompact <em>Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compact</em>' attribute.
	 * @see #isCompact()
	 * @generated
	 */
	void setCompact(boolean value);

} // Association
