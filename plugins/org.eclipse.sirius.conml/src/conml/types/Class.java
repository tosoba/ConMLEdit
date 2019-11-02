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
 *   <li>{@link conml.types.Class#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link conml.types.Class#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}</li>
 *   <li>{@link conml.types.Class#getInstanceObjects <em>Instance Objects</em>}</li>
 *   <li>{@link conml.types.Class#getPackage <em>Package</em>}</li>
 *   <li>{@link conml.types.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link conml.types.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link conml.types.Class#getSemiAssociations <em>Semi Associations</em>}</li>
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
	 * Returns the value of the '<em><b>Generalizations</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Generalization}.
	 * It is bidirectional and its opposite is '{@link conml.types.Generalization#getSpecializedClasses <em>Specialized Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_Generalizations()
	 * @see conml.types.Generalization#getSpecializedClasses
	 * @model opposite="SpecializedClasses"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

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
	 * It is bidirectional and its opposite is '{@link conml.types.Generalization#getDominatedClasses <em>Dominated Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dominant Generalization</em>' reference.
	 * @see #setDominantGeneralization(Generalization)
	 * @see conml.types.TypesPackage#getClass_DominantGeneralization()
	 * @see conml.types.Generalization#getDominatedClasses
	 * @model opposite="DominatedClasses"
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
	 * Returns the value of the '<em><b>Instance Objects</b></em>' reference list.
	 * The list contents are of type {@link conml.instances.Object}.
	 * It is bidirectional and its opposite is '{@link conml.instances.Object#getInstancedClass <em>Instanced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Objects</em>' reference list.
	 * @see conml.types.TypesPackage#getClass_InstanceObjects()
	 * @see conml.instances.Object#getInstancedClass
	 * @model opposite="InstancedClass"
	 * @generated
	 */
	EList<conml.instances.Object> getInstanceObjects();

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
	 * It is bidirectional and its opposite is '{@link conml.types.Property#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_Properties()
	 * @see conml.types.Property#getOwnerClass
	 * @model opposite="OwnerClass" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

    /**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.Attribute}.
	 * It is bidirectional and its opposite is '{@link conml.types.Attribute#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_Attributes()
	 * @see conml.types.Attribute#getOwnerClass
	 * @model opposite="OwnerClass" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

        /**
	 * Returns the value of the '<em><b>Semi Associations</b></em>' containment reference list.
	 * The list contents are of type {@link conml.types.SemiAssociation}.
	 * It is bidirectional and its opposite is '{@link conml.types.SemiAssociation#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Associations</em>' containment reference list.
	 * @see conml.types.TypesPackage#getClass_SemiAssociations()
	 * @see conml.types.SemiAssociation#getOwnerClass
	 * @model opposite="OwnerClass" containment="true"
	 * @generated
	 */
	EList<SemiAssociation> getSemiAssociations();

} // Class
