/**
 */
package conml.instances;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.Facet#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link conml.instances.Facet#getIsOwnedBy <em>Is Owned By</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getFacet()
 * @model abstract="true"
 * @generated
 */
public interface Facet extends InstanceModelElement {
	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' attribute.
	 * The literals are from the enumeration {@link conml.instances.DegreeOfCertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' attribute.
	 * @see conml.instances.DegreeOfCertainty
	 * @see #setCertainty(DegreeOfCertainty)
	 * @see conml.instances.InstancesPackage#getFacet_Certainty()
	 * @model required="true"
	 * @generated
	 */
	DegreeOfCertainty getCertainty();

	/**
	 * Sets the value of the '{@link conml.instances.Facet#getCertainty <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' attribute.
	 * @see conml.instances.DegreeOfCertainty
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(DegreeOfCertainty value);

	/**
	 * Returns the value of the '<em><b>Is Owned By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.FacetSet#getIsComposedOf <em>Is Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Owned By</em>' reference.
	 * @see #setIsOwnedBy(FacetSet)
	 * @see conml.instances.InstancesPackage#getFacet_IsOwnedBy()
	 * @see conml.instances.FacetSet#getIsComposedOf
	 * @model opposite="IsComposedOf" required="true"
	 * @generated
	 */
	FacetSet getIsOwnedBy();

	/**
	 * Sets the value of the '{@link conml.instances.Facet#getIsOwnedBy <em>Is Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Owned By</em>' reference.
	 * @see #getIsOwnedBy()
	 * @generated
	 */
	void setIsOwnedBy(FacetSet value);

} // Facet
