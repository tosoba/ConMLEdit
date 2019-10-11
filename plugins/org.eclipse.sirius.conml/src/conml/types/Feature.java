/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Feature#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 *   <li>{@link conml.types.Feature#getMinimumCardinality <em>Minimum Cardinality</em>}</li>
 *   <li>{@link conml.types.Feature#isIsSorted <em>Is Sorted</em>}</li>
 *   <li>{@link conml.types.Feature#isTemporal <em>Temporal</em>}</li>
 *   <li>{@link conml.types.Feature#isSubjective <em>Subjective</em>}</li>
 *   <li>{@link conml.types.Feature#isConstant <em>Constant</em>}</li>
 *   <li>{@link conml.types.Feature#getRedefines <em>Redefines</em>}</li>
 *   <li>{@link conml.types.Feature#getIsRedefinedBy <em>Is Redefined By</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends Type {
	/**
	 * Returns the value of the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Cardinality</em>' attribute.
	 * @see #setMaximumCardinality(Integer)
	 * @see conml.types.TypesPackage#getFeature_MaximumCardinality()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaximumCardinality();

	/**
	 * Sets the value of the '{@link conml.types.Feature#getMaximumCardinality <em>Maximum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cardinality</em>' attribute.
	 * @see #getMaximumCardinality()
	 * @generated
	 */
	void setMaximumCardinality(Integer value);

	/**
	 * Returns the value of the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Cardinality</em>' attribute.
	 * @see #setMinimumCardinality(int)
	 * @see conml.types.TypesPackage#getFeature_MinimumCardinality()
	 * @model required="true"
	 * @generated
	 */
	int getMinimumCardinality();

	/**
	 * Sets the value of the '{@link conml.types.Feature#getMinimumCardinality <em>Minimum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Cardinality</em>' attribute.
	 * @see #getMinimumCardinality()
	 * @generated
	 */
	void setMinimumCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sorted</em>' attribute.
	 * @see #setIsSorted(boolean)
	 * @see conml.types.TypesPackage#getFeature_IsSorted()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSorted();

	/**
	 * Sets the value of the '{@link conml.types.Feature#isIsSorted <em>Is Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sorted</em>' attribute.
	 * @see #isIsSorted()
	 * @generated
	 */
	void setIsSorted(boolean value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' attribute.
	 * @see #setTemporal(boolean)
	 * @see conml.types.TypesPackage#getFeature_Temporal()
	 * @model required="true"
	 * @generated
	 */
	boolean isTemporal();

  /**
	 * Sets the value of the '{@link conml.types.Feature#isTemporal <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' attribute.
	 * @see #isTemporal()
	 * @generated
	 */
	void setTemporal(boolean value);

  /**
	 * Returns the value of the '<em><b>Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjective</em>' attribute.
	 * @see #setSubjective(boolean)
	 * @see conml.types.TypesPackage#getFeature_Subjective()
	 * @model required="true"
	 * @generated
	 */
	boolean isSubjective();

  /**
	 * Sets the value of the '{@link conml.types.Feature#isSubjective <em>Subjective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjective</em>' attribute.
	 * @see #isSubjective()
	 * @generated
	 */
	void setSubjective(boolean value);

  /**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see conml.types.TypesPackage#getFeature_Constant()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstant();

  /**
	 * Sets the value of the '{@link conml.types.Feature#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

  /**
	 * Returns the value of the '<em><b>Redefines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Feature#getIsRedefinedBy <em>Is Redefined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefines</em>' reference.
	 * @see #setRedefines(Feature)
	 * @see conml.types.TypesPackage#getFeature_Redefines()
	 * @see conml.types.Feature#getIsRedefinedBy
	 * @model opposite="IsRedefinedBy"
	 * @generated
	 */
	Feature getRedefines();

	/**
	 * Sets the value of the '{@link conml.types.Feature#getRedefines <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefines</em>' reference.
	 * @see #getRedefines()
	 * @generated
	 */
	void setRedefines(Feature value);

	/**
	 * Returns the value of the '<em><b>Is Redefined By</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Feature}.
	 * It is bidirectional and its opposite is '{@link conml.types.Feature#getRedefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Redefined By</em>' reference list.
	 * @see conml.types.TypesPackage#getFeature_IsRedefinedBy()
	 * @see conml.types.Feature#getRedefines
	 * @model opposite="Redefines"
	 * @generated
	 */
	EList<Feature> getIsRedefinedBy();

} // Feature
