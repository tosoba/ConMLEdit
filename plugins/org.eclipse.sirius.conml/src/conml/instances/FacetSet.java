/**
 */
package conml.instances;

import conml.Language;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.FacetSet#getHasPhaseQualifier <em>Has Phase Qualifier</em>}</li>
 *   <li>{@link conml.instances.FacetSet#getHasPerspectiveQualifier <em>Has Perspective Qualifier</em>}</li>
 *   <li>{@link conml.instances.FacetSet#getIsComposedOf <em>Is Composed Of</em>}</li>
 *   <li>{@link conml.instances.FacetSet#getTranslationQualifiers <em>Translation Qualifiers</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getFacetSet()
 * @model abstract="true"
 * @generated
 */
public interface FacetSet extends Instance {
	/**
	 * Returns the value of the '<em><b>Has Phase Qualifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsPhaseQualifierOf <em>Is Phase Qualifier Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Phase Qualifier</em>' reference.
	 * @see #setHasPhaseQualifier(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getFacetSet_HasPhaseQualifier()
	 * @see conml.instances.Object#getIsPhaseQualifierOf
	 * @model opposite="IsPhaseQualifierOf"
	 * @generated
	 */
	conml.instances.Object getHasPhaseQualifier();

	/**
	 * Sets the value of the '{@link conml.instances.FacetSet#getHasPhaseQualifier <em>Has Phase Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Phase Qualifier</em>' reference.
	 * @see #getHasPhaseQualifier()
	 * @generated
	 */
	void setHasPhaseQualifier(conml.instances.Object value);

	/**
	 * Returns the value of the '<em><b>Has Perspective Qualifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsPersepectiveQualifierOf <em>Is Persepective Qualifier Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Perspective Qualifier</em>' reference.
	 * @see #setHasPerspectiveQualifier(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getFacetSet_HasPerspectiveQualifier()
	 * @see conml.instances.Object#getIsPersepectiveQualifierOf
	 * @model opposite="IsPersepectiveQualifierOf"
	 * @generated
	 */
	conml.instances.Object getHasPerspectiveQualifier();

	/**
	 * Sets the value of the '{@link conml.instances.FacetSet#getHasPerspectiveQualifier <em>Has Perspective Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Perspective Qualifier</em>' reference.
	 * @see #getHasPerspectiveQualifier()
	 * @generated
	 */
	void setHasPerspectiveQualifier(conml.instances.Object value);

	/**
	 * Returns the value of the '<em><b>Is Composed Of</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Facet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Facet#getIsOwnedBy <em>Is Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composed Of</em>' reference list.
	 * @see conml.instances.InstancesPackage#getFacetSet_IsComposedOf()
	 * @see conml.instances.Facet#getIsOwnedBy
	 * @model opposite="IsOwnedBy"
	 * @generated
	 */
	EList<Facet> getIsComposedOf();

	/**
	 * Returns the value of the '<em><b>Translation Qualifiers</b></em>' reference list.
	 * The list contents are of type {@link conml.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Qualifiers</em>' reference list.
	 * @see conml.instances.InstancesPackage#getFacetSet_TranslationQualifiers()
	 * @model
	 * @generated
	 */
	EList<Language> getTranslationQualifiers();

} // FacetSet
