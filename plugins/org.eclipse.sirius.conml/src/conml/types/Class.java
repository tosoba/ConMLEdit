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
 *   <li>{@link conml.types.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link conml.types.Class#isUsedAsTemporalAspect <em>Used As Temporal Aspect</em>}</li>
 *   <li>{@link conml.types.Class#isUsedAsSubjectiveAspect <em>Used As Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.Class#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getSemiassociations <em>Semiassociations</em>}</li>
 *   <li>{@link conml.types.Class#getInstancedByObjects <em>Instanced By Objects</em>}</li>
 *   <li>{@link conml.types.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link conml.types.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link conml.types.Class#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see conml.types.TypesPackage#getClass_Abstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isAbstract();

  /**
	 * Sets the value of the '{@link conml.types.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

  /**
	 * Returns the value of the '<em><b>Used As Temporal Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used As Temporal Aspect</em>' attribute.
	 * @see #setUsedAsTemporalAspect(boolean)
	 * @see conml.types.TypesPackage#getClass_UsedAsTemporalAspect()
	 * @model required="true"
	 * @generated
	 */
	boolean isUsedAsTemporalAspect();

  /**
	 * Sets the value of the '{@link conml.types.Class#isUsedAsTemporalAspect <em>Used As Temporal Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used As Temporal Aspect</em>' attribute.
	 * @see #isUsedAsTemporalAspect()
	 * @generated
	 */
	void setUsedAsTemporalAspect(boolean value);

  /**
	 * Returns the value of the '<em><b>Used As Subjective Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used As Subjective Aspect</em>' attribute.
	 * @see #setUsedAsSubjectiveAspect(boolean)
	 * @see conml.types.TypesPackage#getClass_UsedAsSubjectiveAspect()
	 * @model required="true"
	 * @generated
	 */
	boolean isUsedAsSubjectiveAspect();

  /**
	 * Sets the value of the '{@link conml.types.Class#isUsedAsSubjectiveAspect <em>Used As Subjective Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used As Subjective Aspect</em>' attribute.
	 * @see #isUsedAsSubjectiveAspect()
	 * @generated
	 */
	void setUsedAsSubjectiveAspect(boolean value);

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
	 * Returns the value of the '<em><b>Semiassociations</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.SemiAssociation}.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semiassociations</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_Semiassociations()
	 * @see conml.types.SemiAssociation#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<SemiAssociation> getSemiassociations();

  /**
	 * Returns the value of the '<em><b>Instanced By Objects</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getInstancedClass <em>Instanced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanced By Objects</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_InstancedByObjects()
	 * @see conml.instances.Object#getInstancedClass
	 * @model opposite="InstancedClass"
	 * @generated
	 */
	EList<conml.instances.Object> getInstancedByObjects();

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

    /**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

    /**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Class
