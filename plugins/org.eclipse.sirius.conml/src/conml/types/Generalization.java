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
 *   <li>{@link conml.types.Generalization#getSpecializedClass <em>Specialized Class</em>}</li>
 *   <li>{@link conml.types.Generalization#getGeneralizedClass <em>Generalized Class</em>}</li>
 *   <li>{@link conml.types.Generalization#getDominatesInheritanceOn <em>Dominates Inheritance On</em>}</li>
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
	 * Returns the value of the '<em><b>Specialized Class</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialized Class</em>' reference list.
	 * @see conml.types.TypesPackage#getGeneralization_SpecializedClass()
	 * @see conml.types.Class#getGeneralization
	 * @model opposite="Generalization" required="true"
	 * @generated
	 */
	EList<conml.types.Class> getSpecializedClass();

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
	 * Returns the value of the '<em><b>Dominates Inheritance On</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dominates Inheritance On</em>' reference list.
	 * @see conml.types.TypesPackage#getGeneralization_DominatesInheritanceOn()
	 * @see conml.types.Class#getDominantGeneralization
	 * @model opposite="DominantGeneralization" required="true"
	 * @generated
	 */
	EList<conml.types.Class> getDominatesInheritanceOn();

} // Generalization
