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
	 * The feature id for the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEFAULT_LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__META_INFORMATION_OBJECTS = 4;

    /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__TAGS = 5;

  /**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__LANGUAGES = 6;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAGS = MODEL_PART_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__META_INFORMATION_OBJECTS = MODEL_PART_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__MODEL = MODEL_PART_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = MODEL_PART_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__DEFAULT = MODEL_PART_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__MODEL = MODEL_PART_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = MODEL_PART_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = MODEL_PART_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link conml.impl.MetaInformationImpl <em>Meta Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.MetaInformationImpl
	 * @see conml.impl.conmlPackageImpl#getMetaInformation()
	 * @generated
	 */
	int META_INFORMATION = 5;

  /**
	 * The number of structural features of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_OPERATION_COUNT = 0;


  /**
	 * The meta object id for the '{@link conml.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.impl.DomainImpl
	 * @see conml.impl.conmlPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 6;

    /**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MODELS = 0;

    /**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PARTS = 1;

        /**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference list '{@link conml.Model#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see conml.Model#getTags()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.Model#getMetaInformationObjects <em>Meta Information Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Information Objects</em>'.
	 * @see conml.Model#getMetaInformationObjects()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MetaInformationObjects();

  /**
	 * Returns the meta object for the reference list '{@link conml.Model#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see conml.Model#getLanguages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Languages();

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
	 * Returns the meta object for the reference list '{@link conml.ModelElement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see conml.ModelElement#getTags()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Tags();

  /**
	 * Returns the meta object for the reference list '{@link conml.ModelElement#getMetaInformationObjects <em>Meta Information Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Information Objects</em>'.
	 * @see conml.ModelElement#getMetaInformationObjects()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_MetaInformationObjects();

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
	 * Returns the meta object for the reference '{@link conml.Tag#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see conml.Tag#getModel()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Model();

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
	 * Returns the meta object for the attribute '{@link conml.Language#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see conml.Language#isDefault()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Default();

  /**
	 * Returns the meta object for the reference '{@link conml.Language#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see conml.Language#getModel()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Model();

    /**
	 * Returns the meta object for class '{@link conml.MetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Information</em>'.
	 * @see conml.MetaInformation
	 * @generated
	 */
	EClass getMetaInformation();

  /**
	 * Returns the meta object for class '{@link conml.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see conml.Domain
	 * @generated
	 */
	EClass getDomain();

    /**
	 * Returns the meta object for the containment reference list '{@link conml.Domain#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see conml.Domain#getModels()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Models();

    /**
	 * Returns the meta object for the containment reference list '{@link conml.Domain#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see conml.Domain#getParts()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Parts();

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
		 * The meta object literal for the '<em><b>Default Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEFAULT_LANGUAGE = eINSTANCE.getModel_DefaultLanguage();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TAGS = eINSTANCE.getModel_Tags();

		/**
		 * The meta object literal for the '<em><b>Meta Information Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__META_INFORMATION_OBJECTS = eINSTANCE.getModel_MetaInformationObjects();

    /**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LANGUAGES = eINSTANCE.getModel_Languages();

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
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TAGS = eINSTANCE.getModelElement_Tags();

    /**
		 * The meta object literal for the '<em><b>Meta Information Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__META_INFORMATION_OBJECTS = eINSTANCE.getModelElement_MetaInformationObjects();

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
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__MODEL = eINSTANCE.getTag_Model();

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
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__DEFAULT = eINSTANCE.getLanguage_Default();

    /**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__MODEL = eINSTANCE.getLanguage_Model();

        /**
		 * The meta object literal for the '{@link conml.impl.MetaInformationImpl <em>Meta Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.MetaInformationImpl
		 * @see conml.impl.conmlPackageImpl#getMetaInformation()
		 * @generated
		 */
		EClass META_INFORMATION = eINSTANCE.getMetaInformation();

    /**
		 * The meta object literal for the '{@link conml.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.impl.DomainImpl
		 * @see conml.impl.conmlPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

        /**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__MODELS = eINSTANCE.getDomain_Models();

        /**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PARTS = eINSTANCE.getDomain_Parts();

	}

} //conmlPackage
