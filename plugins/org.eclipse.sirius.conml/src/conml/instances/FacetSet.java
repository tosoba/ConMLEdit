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
 *   <li>{@link conml.instances.FacetSet#getTranslationQualifiers <em>Translation Qualifiers</em>}</li>
 *   <li>{@link conml.instances.FacetSet#getPhaseQualifier <em>Phase Qualifier</em>}</li>
 *   <li>{@link conml.instances.FacetSet#getPerspectiveQualifier <em>Perspective Qualifier</em>}</li>
 * </ul>
 *
 * @see conml.instances.InstancesPackage#getFacetSet()
 * @model abstract="true"
 * @generated
 */
public interface FacetSet extends Instance {
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

  /**
	 * Returns the value of the '<em><b>Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Qualifier</em>' reference.
	 * @see #setPhaseQualifier(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getFacetSet_PhaseQualifier()
	 * @model
	 * @generated
	 */
	conml.instances.Object getPhaseQualifier();

  /**
	 * Sets the value of the '{@link conml.instances.FacetSet#getPhaseQualifier <em>Phase Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Qualifier</em>' reference.
	 * @see #getPhaseQualifier()
	 * @generated
	 */
	void setPhaseQualifier(conml.instances.Object value);

  /**
	 * Returns the value of the '<em><b>Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Qualifier</em>' reference.
	 * @see #setPerspectiveQualifier(conml.instances.Object)
	 * @see conml.instances.InstancesPackage#getFacetSet_PerspectiveQualifier()
	 * @model
	 * @generated
	 */
	conml.instances.Object getPerspectiveQualifier();

  /**
	 * Sets the value of the '{@link conml.instances.FacetSet#getPerspectiveQualifier <em>Perspective Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective Qualifier</em>' reference.
	 * @see #getPerspectiveQualifier()
	 * @generated
	 */
	void setPerspectiveQualifier(conml.instances.Object value);

} // FacetSet
