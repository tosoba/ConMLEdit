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
 *   <li>{@link conml.types.Association#getPrimarySemiAssociation <em>Primary Semi Association</em>}</li>
 *   <li>{@link conml.types.Association#getSecondarySemiAssociation <em>Secondary Semi Association</em>}</li>
 *   <li>{@link conml.types.Association#getInstanceLinks <em>Instance Links</em>}</li>
 *   <li>{@link conml.types.Association#isCompact <em>Compact</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Type {
	/**
	 * Returns the value of the '<em><b>Primary Semi Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getPrimaryInAssociation <em>Primary In Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Semi Association</em>' reference.
	 * @see #setPrimarySemiAssociation(SemiAssociation)
	 * @see conml.types.TypesPackage#getAssociation_PrimarySemiAssociation()
	 * @see conml.types.SemiAssociation#getPrimaryInAssociation
	 * @model opposite="PrimaryInAssociation" required="true"
	 * @generated
	 */
	SemiAssociation getPrimarySemiAssociation();

  /**
	 * Sets the value of the '{@link conml.types.Association#getPrimarySemiAssociation <em>Primary Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Semi Association</em>' reference.
	 * @see #getPrimarySemiAssociation()
	 * @generated
	 */
	void setPrimarySemiAssociation(SemiAssociation value);

  /**
	 * Returns the value of the '<em><b>Secondary Semi Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getSecondaryInAssociation <em>Secondary In Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Semi Association</em>' reference.
	 * @see #setSecondarySemiAssociation(SemiAssociation)
	 * @see conml.types.TypesPackage#getAssociation_SecondarySemiAssociation()
	 * @see conml.types.SemiAssociation#getSecondaryInAssociation
	 * @model opposite="SecondaryInAssociation" required="true"
	 * @generated
	 */
	SemiAssociation getSecondarySemiAssociation();

  /**
	 * Sets the value of the '{@link conml.types.Association#getSecondarySemiAssociation <em>Secondary Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Semi Association</em>' reference.
	 * @see #getSecondarySemiAssociation()
	 * @generated
	 */
	void setSecondarySemiAssociation(SemiAssociation value);

  /**
	 * Returns the value of the '<em><b>Instance Links</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Link}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Link#getInstancedAssociation <em>Instanced Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Links</em>' reference list.
	 * @see conml.types.TypesPackage#getAssociation_InstanceLinks()
	 * @see conml.instances.Link#getInstancedAssociation
	 * @model opposite="InstancedAssociation"
	 * @generated
	 */
	EList<Link> getInstanceLinks();

  /**
	 * Returns the value of the '<em><b>Compact</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compact</em>' attribute.
	 * @see #setCompact(boolean)
	 * @see conml.types.TypesPackage#getAssociation_Compact()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
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
