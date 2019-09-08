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
 *   <li>{@link conml.types.Class#getIsTemporalAspectOf <em>Is Temporal Aspect Of</em>}</li>
 *   <li>{@link conml.types.Class#getIsSubjectiveAspectOf <em>Is Subjective Aspect Of</em>}</li>
 *   <li>{@link conml.types.Class#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getHasProperties <em>Has Properties</em>}</li>
 *   <li>{@link conml.types.Class#getOwnsAttributes <em>Owns Attributes</em>}</li>
 *   <li>{@link conml.types.Class#getHasAttributes <em>Has Attributes</em>}</li>
 *   <li>{@link conml.types.Class#getHasSemiassociations <em>Has Semiassociations</em>}</li>
 *   <li>{@link conml.types.Class#getOwnsSemiassociations <em>Owns Semiassociations</em>}</li>
 *   <li>{@link conml.types.Class#getIsOppositeClassIn <em>Is Opposite Class In</em>}</li>
 *   <li>{@link conml.types.Class#getInstancedBy <em>Instanced By</em>}</li>
 *   <li>{@link conml.types.Class#getBelongsToPackage <em>Belongs To Package</em>}</li>
 *   <li>{@link conml.types.Class#getOwnsProperties <em>Owns Properties</em>}</li>
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
	 * Returns the value of the '<em><b>Is Temporal Aspect Of</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getHasTemporalAspectOf <em>Has Temporal Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Temporal Aspect Of</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_IsTemporalAspectOf()
	 * @see conml.types.TypeModel#getHasTemporalAspectOf
	 * @model opposite="HasTemporalAspectOf"
	 * @generated
	 */
	EList<TypeModel> getIsTemporalAspectOf();

	/**
	 * Returns the value of the '<em><b>Is Subjective Aspect Of</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getHasSubjectiveAspectOf <em>Has Subjective Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subjective Aspect Of</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_IsSubjectiveAspectOf()
	 * @see conml.types.TypeModel#getHasSubjectiveAspectOf
	 * @model opposite="HasSubjectiveAspectOf"
	 * @generated
	 */
	EList<TypeModel> getIsSubjectiveAspectOf();

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
	 * It is bidirectional and its opposite is '{@link conml.types.Property#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Properties</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_OwnsProperties()
	 * @see conml.types.Property#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<Property> getOwnsProperties();

	/**
	 * Returns the value of the '<em><b>Has Properties</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Property}.
	 * It is bidirectional and its opposite is '{@link conml.types.Property#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Properties</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_HasProperties()
	 * @see conml.types.Property#getAssignedTo
	 * @model opposite="AssignedTo"
	 * @generated
	 */
	EList<Property> getHasProperties();

	/**
	 * Returns the value of the '<em><b>Owns Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.Attribute}.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Attributes</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_OwnsAttributes()
	 * @see conml.types.Attribute#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getOwnsAttributes();

	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Attribute}.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_HasAttributes()
	 * @see conml.types.Attribute#getAssignedTo
	 * @model opposite="AssignedTo"
	 * @generated
	 */
	EList<Attribute> getHasAttributes();

	/**
	 * Returns the value of the '<em><b>Has Semiassociations</b></em>' reference list.
	 * The list contents are of type {@link conml.types.SemiAssociation}.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Semiassociations</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_HasSemiassociations()
	 * @see conml.types.SemiAssociation#getAssignedTo
	 * @model opposite="AssignedTo"
	 * @generated
	 */
	EList<SemiAssociation> getHasSemiassociations();

	/**
	 * Returns the value of the '<em><b>Owns Semiassociations</b></em>' reference list.
	 * The list contents are of type {@link conml.types.SemiAssociation}.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Semiassociations</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_OwnsSemiassociations()
	 * @see conml.types.SemiAssociation#getOwner
	 * @model opposite="Owner"
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
	 * Returns the value of the '<em><b>Belongs To Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getContainsClass <em>Contains Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Package</em>' reference.
	 * @see #setBelongsToPackage(conml.types.Package)
	 * @see conml.types.TypesPackage#getClass_BelongsToPackage()
	 * @see conml.types.Package#getContainsClass
	 * @model opposite="ContainsClass"
	 * @generated
	 */
	conml.types.Package getBelongsToPackage();

	/**
	 * Sets the value of the '{@link conml.types.Class#getBelongsToPackage <em>Belongs To Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Package</em>' reference.
	 * @see #getBelongsToPackage()
	 * @generated
	 */
	void setBelongsToPackage(conml.types.Package value);

} // Class