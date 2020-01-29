/**
 */
package conml.instances;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifying Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.QualifyingObject#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link conml.instances.QualifyingObject#getSubjectiveQualifiedObjects <em>Subjective Qualified Objects</em>}</li>
 *   <li>{@link conml.instances.QualifyingObject#getTemporalQualifiedObjects <em>Temporal Qualified Objects</em>}</li>
 *   <li>{@link conml.instances.QualifyingObject#getPerspectiveQualifiedFacetSets <em>Perspective Qualified Facet Sets</em>}</li>
 *   <li>{@link conml.instances.QualifyingObject#getPhaseQualifiedFacetSets <em>Phase Qualified Facet Sets</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getQualifyingObject()
 * @model
 * @generated
 */
public interface QualifyingObject extends conml.instances.Object {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see conml.instances.InstancesPackage#getQualifyingObject_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link conml.instances.QualifyingObject#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Subjective Qualified Objects</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjective Qualified Objects</em>' reference list.
	 * @see conml.instances.InstancesPackage#getQualifyingObject_SubjectiveQualifiedObjects()
	 * @see conml.instances.Object#getSubjectiveExistentialQualifer
	 * @model opposite="SubjectiveExistentialQualifer"
	 * @generated
	 */
	EList<conml.instances.Object> getSubjectiveQualifiedObjects();

	/**
	 * Returns the value of the '<em><b>Temporal Qualified Objects</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Qualified Objects</em>' reference list.
	 * @see conml.instances.InstancesPackage#getQualifyingObject_TemporalQualifiedObjects()
	 * @see conml.instances.Object#getTemporalExistentialQualifier
	 * @model opposite="TemporalExistentialQualifier"
	 * @generated
	 */
	EList<conml.instances.Object> getTemporalQualifiedObjects();

	/**
	 * Returns the value of the '<em><b>Perspective Qualified Facet Sets</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.FacetSet}.
	 * It is bidirectional and its opposite is '{@link conml.instances.FacetSet#getPerspectiveQualifier <em>Perspective Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Qualified Facet Sets</em>' reference list.
	 * @see conml.instances.InstancesPackage#getQualifyingObject_PerspectiveQualifiedFacetSets()
	 * @see conml.instances.FacetSet#getPerspectiveQualifier
	 * @model opposite="PerspectiveQualifier"
	 * @generated
	 */
	EList<FacetSet> getPerspectiveQualifiedFacetSets();

	/**
	 * Returns the value of the '<em><b>Phase Qualified Facet Sets</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.FacetSet#getPhaseQualifier <em>Phase Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Qualified Facet Sets</em>' reference.
	 * @see #setPhaseQualifiedFacetSets(FacetSet)
	 * @see conml.instances.InstancesPackage#getQualifyingObject_PhaseQualifiedFacetSets()
	 * @see conml.instances.FacetSet#getPhaseQualifier
	 * @model opposite="PhaseQualifier"
	 * @generated
	 */
	FacetSet getPhaseQualifiedFacetSets();

	/**
	 * Sets the value of the '{@link conml.instances.QualifyingObject#getPhaseQualifiedFacetSets <em>Phase Qualified Facet Sets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Qualified Facet Sets</em>' reference.
	 * @see #getPhaseQualifiedFacetSets()
	 * @generated
	 */
	void setPhaseQualifiedFacetSets(FacetSet value);

} // QualifyingObject
