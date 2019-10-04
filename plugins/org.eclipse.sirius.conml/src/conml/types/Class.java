/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link conml.types.Class#isIsTemporalAspect <em>Is Temporal Aspect</em>}</li>
 *   <li>{@link conml.types.Class#isIsSubjectiveAspect <em>Is Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.Class#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getOwnsSemiassociations <em>Owns Semiassociations</em>}</li>
 *   <li>{@link conml.types.Class#getIsOppositeClassIn <em>Is Opposite Class In</em>}</li>
 *   <li>{@link conml.types.Class#getInstancedBy <em>Instanced By</em>}</li>
 *   <li>{@link conml.types.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link conml.types.Class#getOwnsProperties <em>Owns Properties</em>}</li>
 *   <li>{@link conml.types.Class#getOwnsAttributes <em>Owns Attributes</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see conml.types.TypesPackage#getClass_IsAbstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link conml.types.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Temporal Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Temporal Aspect</em>' attribute.
	 * @see #setIsTemporalAspect(boolean)
	 * @see conml.types.TypesPackage#getClass_IsTemporalAspect()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTemporalAspect();

	/**
	 * Sets the value of the '{@link conml.types.Class#isIsTemporalAspect <em>Is Temporal Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Temporal Aspect</em>' attribute.
	 * @see #isIsTemporalAspect()
	 * @generated
	 */
	void setIsTemporalAspect(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Subjective Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subjective Aspect</em>' attribute.
	 * @see #setIsSubjectiveAspect(boolean)
	 * @see conml.types.TypesPackage#getClass_IsSubjectiveAspect()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSubjectiveAspect();

	/**
	 * Sets the value of the '{@link conml.types.Class#isIsSubjectiveAspect <em>Is Subjective Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subjective Aspect</em>' attribute.
	 * @see #isIsSubjectiveAspect()
	 * @generated
	 */
	void setIsSubjectiveAspect(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Generalization}.
	 * It is bidirectional and its opposite is '{@link conml.types.Generalization#getSpecializedClass <em>Specialized Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_Generalization()
	 * @see conml.types.Generalization#getSpecializedClass
	 * @model opposite="SpecializedClass"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Generalization#getGeneralizedClass <em>Generalized Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference.
	 * @see #setSpecialization(Generalization)
	 * @see conml.types.TypesPackage#getClass_Specialization()
	 * @see conml.types.Generalization#getGeneralizedClass
	 * @model opposite="GeneralizedClass"
	 * @generated
	 */
	Generalization getSpecialization();

	/**
	 * Sets the value of the '{@link conml.types.Class#getSpecialization <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Generalization value);

	/**
	 * Returns the value of the '<em><b>Dominant Generalization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Generalization#getDominatesInheritanceOn <em>Dominates Inheritance On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dominant Generalization</em>' reference.
	 * @see #setDominantGeneralization(Generalization)
	 * @see conml.types.TypesPackage#getClass_DominantGeneralization()
	 * @see conml.types.Generalization#getDominatesInheritanceOn
	 * @model opposite="DominatesInheritanceOn"
	 * @generated
	 */
	Generalization getDominantGeneralization();

	/**
	 * Sets the value of the '{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dominant Generalization</em>' reference.
	 * @see #getDominantGeneralization()
	 * @generated
	 */
	void setDominantGeneralization(Generalization value);

	/**
	 * Returns the value of the '<em><b>Owns Properties</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Properties</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_OwnsProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnsProperties();

	/**
	 * Returns the value of the '<em><b>Owns Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Attributes</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_OwnsAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getOwnsAttributes();

	/**
	 * Returns the value of the '<em><b>Owns Semiassociations</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.SemiAssociation}.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Semiassociations</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_OwnsSemiassociations()
	 * @see conml.types.SemiAssociation#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<SemiAssociation> getOwnsSemiassociations();

	/**
	 * Returns the value of the '<em><b>Is Opposite Class In</b></em>' reference list.
	 * The list contents are of type {@link conml.types.SemiAssociation}.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opposite Class In</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_IsOppositeClassIn()
	 * @see conml.types.SemiAssociation#getRefersTo
	 * @model opposite="RefersTo"
	 * @generated
	 */
	EList<SemiAssociation> getIsOppositeClassIn();

	/**
	 * Returns the value of the '<em><b>Instanced By</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanced By</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_InstancedBy()
	 * @see conml.instances.Object#getIsInstanceOf
	 * @model opposite="IsInstanceOf"
	 * @generated
	 */
	EList<conml.instances.Object> getInstancedBy();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(conml.types.Package)
	 * @see conml.types.TypesPackage#getClass_Package()
	 * @see conml.types.Package#getContainedClasses
	 * @model opposite="ContainedClasses"
	 * @generated
	 */
	conml.types.Package getPackage();

  /**
	 * Sets the value of the '{@link conml.types.Class#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(conml.types.Package value);

} // Class
