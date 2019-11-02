/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Generalization#getDiscriminant <em>Discriminant</em>}</li>
 *   <li>{@link conml.types.Generalization#getSpecializedClasses <em>Specialized Classes</em>}</li>
 *   <li>{@link conml.types.Generalization#getGeneralizedClass <em>Generalized Class</em>}</li>
 *   <li>{@link conml.types.Generalization#getDominatedClasses <em>Dominated Classes</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends TypeModelElement {
	/**
	 * Returns the value of the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminant</em>' attribute.
	 * @see #setDiscriminant(String)
	 * @see conml.types.TypesPackage#getGeneralization_Discriminant()
	 * @model required="true"
	 * @generated
	 */
	String getDiscriminant();

	/**
	 * Sets the value of the '{@link conml.types.Generalization#getDiscriminant <em>Discriminant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminant</em>' attribute.
	 * @see #getDiscriminant()
	 * @generated
	 */
	void setDiscriminant(String value);

	/**
	 * Returns the value of the '<em><b>Specialized Classes</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized Classes</em>' reference list.
	 * @see conml.types.TypesPackage#getGeneralization_SpecializedClasses()
	 * @see conml.types.Class#getGeneralizations
	 * @model opposite="Generalizations" required="true"
	 * @generated
	 */
	EList<conml.types.Class> getSpecializedClasses();

  /**
	 * Returns the value of the '<em><b>Generalized Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalized Class</em>' reference.
	 * @see #setGeneralizedClass(conml.types.Class)
	 * @see conml.types.TypesPackage#getGeneralization_GeneralizedClass()
	 * @see conml.types.Class#getSpecialization
	 * @model opposite="Specialization" required="true"
	 * @generated
	 */
	conml.types.Class getGeneralizedClass();

	/**
	 * Sets the value of the '{@link conml.types.Generalization#getGeneralizedClass <em>Generalized Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalized Class</em>' reference.
	 * @see #getGeneralizedClass()
	 * @generated
	 */
	void setGeneralizedClass(conml.types.Class value);

	/**
	 * Returns the value of the '<em><b>Dominated Classes</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dominated Classes</em>' reference list.
	 * @see conml.types.TypesPackage#getGeneralization_DominatedClasses()
	 * @see conml.types.Class#getDominantGeneralization
	 * @model opposite="DominantGeneralization" required="true"
	 * @generated
	 */
	EList<conml.types.Class> getDominatedClasses();

} // Generalization
