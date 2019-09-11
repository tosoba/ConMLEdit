/**
 */
package conml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conml.conmlFactory
 * @model kind="package"
 * @generated
 */
public interface conmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://conml.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	conmlPackage eINSTANCE = conml.impl.conmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link conml.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.ModelImpl
	 * @see conml.impl.conmlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Has Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_TAGS = 3;

	/**
	 * The feature id for the '<em><b>Has Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_LANGUAGES = 4;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEFAULT_LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Owns Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNS_ELEMENTS = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conml.impl.ModelPartImpl <em>Model Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.ModelPartImpl
	 * @see conml.impl.conmlPackageImpl#getModelPart()
	 * @generated
	 */
	int MODEL_PART = 1;

	/**
	 * The number of structural features of the '<em>Model Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conml.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.ModelElementImpl
	 * @see conml.impl.conmlPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_TAGGED_WITH = MODEL_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_DOCUMENTED_BY = MODEL_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = MODEL_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = MODEL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.TagImpl
	 * @see conml.impl.conmlPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = MODEL_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__BELONGS_TO = MODEL_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__APPLIES_TO = MODEL_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = MODEL_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = MODEL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.LanguageImpl
	 * @see conml.impl.conmlPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = MODEL_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__DESCRIPTION = MODEL_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__IS_DEFAULT = MODEL_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__BELONGS_TO = MODEL_PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Default In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__IS_DEFAULT_IN = MODEL_PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Translation Qualifier Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__IS_TRANSLATION_QUALIFIER_OF = MODEL_PART_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = MODEL_PART_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = MODEL_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link conml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see conml.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link conml.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conml.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link conml.Model#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see conml.Model#getVersion()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link conml.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conml.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.Model#getHasTags <em>Has Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Tags</em>'.
	 * @see conml.Model#getHasTags()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasTags();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.Model#getHasLanguages <em>Has Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Languages</em>'.
	 * @see conml.Model#getHasLanguages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasLanguages();

	/**
	 * Returns the meta object for the reference '{@link conml.Model#getDefaultLanguage <em>Default Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Language</em>'.
	 * @see conml.Model#getDefaultLanguage()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DefaultLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.Model#getOwnsElements <em>Owns Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Elements</em>'.
	 * @see conml.Model#getOwnsElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OwnsElements();

	/**
	 * Returns the meta object for class '{@link conml.ModelPart <em>Model Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Part</em>'.
	 * @see conml.ModelPart
	 * @generated
	 */
	EClass getModelPart();

	/**
	 * Returns the meta object for class '{@link conml.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see conml.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference list '{@link conml.ModelElement#getIsTaggedWith <em>Is Tagged With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Tagged With</em>'.
	 * @see conml.ModelElement#getIsTaggedWith()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_IsTaggedWith();

	/**
	 * Returns the meta object for the reference list '{@link conml.ModelElement#getIsDocumentedBy <em>Is Documented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Documented By</em>'.
	 * @see conml.ModelElement#getIsDocumentedBy()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_IsDocumentedBy();

	/**
	 * Returns the meta object for class '{@link conml.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see conml.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link conml.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conml.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the container reference '{@link conml.Tag#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see conml.Tag#getBelongsTo()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_BelongsTo();

	/**
	 * Returns the meta object for the reference list '{@link conml.Tag#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To</em>'.
	 * @see conml.Tag#getAppliesTo()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_AppliesTo();

	/**
	 * Returns the meta object for class '{@link conml.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see conml.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link conml.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conml.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link conml.Language#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conml.Language#getDescription()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Description();

	/**
	 * Returns the meta object for the attribute '{@link conml.Language#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see conml.Language#isIsDefault()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_IsDefault();

	/**
	 * Returns the meta object for the container reference '{@link conml.Language#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see conml.Language#getBelongsTo()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_BelongsTo();

	/**
	 * Returns the meta object for the reference '{@link conml.Language#getIsDefaultIn <em>Is Default In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Default In</em>'.
	 * @see conml.Language#getIsDefaultIn()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_IsDefaultIn();

	/**
	 * Returns the meta object for the reference list '{@link conml.Language#getIsTranslationQualifierOf <em>Is Translation Qualifier Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Translation Qualifier Of</em>'.
	 * @see conml.Language#getIsTranslationQualifierOf()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_IsTranslationQualifierOf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	conmlFactory getconmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conml.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.ModelImpl
		 * @see conml.impl.conmlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__VERSION = eINSTANCE.getModel_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

		/**
		 * The meta object literal for the '<em><b>Has Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_TAGS = eINSTANCE.getModel_HasTags();

		/**
		 * The meta object literal for the '<em><b>Has Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_LANGUAGES = eINSTANCE.getModel_HasLanguages();

		/**
		 * The meta object literal for the '<em><b>Default Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEFAULT_LANGUAGE = eINSTANCE.getModel_DefaultLanguage();

		/**
		 * The meta object literal for the '<em><b>Owns Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OWNS_ELEMENTS = eINSTANCE.getModel_OwnsElements();

		/**
		 * The meta object literal for the '{@link conml.impl.ModelPartImpl <em>Model Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.ModelPartImpl
		 * @see conml.impl.conmlPackageImpl#getModelPart()
		 * @generated
		 */
		EClass MODEL_PART = eINSTANCE.getModelPart();

		/**
		 * The meta object literal for the '{@link conml.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.ModelElementImpl
		 * @see conml.impl.conmlPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Is Tagged With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IS_TAGGED_WITH = eINSTANCE.getModelElement_IsTaggedWith();

		/**
		 * The meta object literal for the '<em><b>Is Documented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IS_DOCUMENTED_BY = eINSTANCE.getModelElement_IsDocumentedBy();

		/**
		 * The meta object literal for the '{@link conml.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.TagImpl
		 * @see conml.impl.conmlPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__BELONGS_TO = eINSTANCE.getTag_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__APPLIES_TO = eINSTANCE.getTag_AppliesTo();

		/**
		 * The meta object literal for the '{@link conml.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.LanguageImpl
		 * @see conml.impl.conmlPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__DESCRIPTION = eINSTANCE.getLanguage_Description();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__IS_DEFAULT = eINSTANCE.getLanguage_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__BELONGS_TO = eINSTANCE.getLanguage_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Is Default In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__IS_DEFAULT_IN = eINSTANCE.getLanguage_IsDefaultIn();

		/**
		 * The meta object literal for the '<em><b>Is Translation Qualifier Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__IS_TRANSLATION_QUALIFIER_OF = eINSTANCE.getLanguage_IsTranslationQualifierOf();

	}

} //conmlPackage
