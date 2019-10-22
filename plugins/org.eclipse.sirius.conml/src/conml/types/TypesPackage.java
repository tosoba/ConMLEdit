/**
 */
package conml.types;

import conml.conmlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see conml.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://types.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = conml.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link conml.types.impl.TypeModelImpl <em>Type Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.TypeModelImpl
	 * @see conml.types.impl.TypesPackageImpl#getTypeModel()
	 * @generated
	 */
	int TYPE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__NAME = conmlPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__VERSION = conmlPackage.MODEL__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__DESCRIPTION = conmlPackage.MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__ELEMENTS = conmlPackage.MODEL__ELEMENTS;

  /**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__LANGUAGES = conmlPackage.MODEL__LANGUAGES;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__DEFAULT_LANGUAGE = conmlPackage.MODEL__DEFAULT_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__TAGS = conmlPackage.MODEL__TAGS;

	/**
	 * The feature id for the '<em><b>Conforming Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__CONFORMING_INSTANCE_MODEL = conmlPackage.MODEL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Extended Type Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__EXTENDED_TYPE_MODEL = conmlPackage.MODEL_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Extending Type Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__EXTENDING_TYPE_MODELS = conmlPackage.MODEL_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Particular In Type Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL = conmlPackage.MODEL_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Has Particular Type Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS = conmlPackage.MODEL_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Subjective Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__SUBJECTIVE_ASPECT = conmlPackage.MODEL_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Temporal Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__TEMPORAL_ASPECT = conmlPackage.MODEL_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_FEATURE_COUNT = conmlPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Type Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_OPERATION_COUNT = conmlPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.TypeModelElementImpl <em>Type Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.TypeModelElementImpl
	 * @see conml.types.impl.TypesPackageImpl#getTypeModelElement()
	 * @generated
	 */
	int TYPE_MODEL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_ELEMENT__TAGS = conmlPackage.MODEL_ELEMENT__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_ELEMENT__DOCUMENTING_OBJECTS = conmlPackage.MODEL_ELEMENT__DOCUMENTING_OBJECTS;

  /**
	 * The number of structural features of the '<em>Type Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_ELEMENT_FEATURE_COUNT = conmlPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_ELEMENT_OPERATION_COUNT = conmlPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.TypeImpl
	 * @see conml.types.impl.TypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TAGS = TYPE_MODEL_ELEMENT__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOCUMENTING_OBJECTS = TYPE_MODEL_ELEMENT__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DEFINITION = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = TYPE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.ClassImpl
	 * @see conml.types.impl.TypesPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TAGS = TYPE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DOCUMENTING_OBJECTS = TYPE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DEFINITION = TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = TYPE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Used As Temporal Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__USED_AS_TEMPORAL_ASPECT = TYPE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Used As Subjective Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__USED_AS_SUBJECTIVE_ASPECT = TYPE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SPECIALIZATION = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dominant Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DOMINANT_GENERALIZATION = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Semiassociations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SEMIASSOCIATIONS = TYPE_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Instance Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INSTANCE_OBJECTS = TYPE_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = TYPE_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = TYPE_FEATURE_COUNT + 10;

    /**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.GeneralizationImpl
	 * @see conml.types.impl.TypesPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TAGS = TYPE_MODEL_ELEMENT__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__DOCUMENTING_OBJECTS = TYPE_MODEL_ELEMENT__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__DISCRIMINANT = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specialized Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIALIZED_CLASS = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZED_CLASS = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dominates Inheritance On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__DOMINATES_INHERITANCE_ON = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = TYPE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.FeatureImpl
	 * @see conml.types.impl.TypesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TAGS = TYPE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DOCUMENTING_OBJECTS = TYPE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEFINITION = TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MAXIMUM_CARDINALITY = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MINIMUM_CARDINALITY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SORTED = TYPE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TEMPORAL = TYPE_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUBJECTIVE = TYPE_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTANT = TYPE_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINED_FEATURE = TYPE_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Redefined By Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINED_BY_FEATURES = TYPE_FEATURE_COUNT + 7;

    /**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.DataTypeImpl
	 * @see conml.types.impl.TypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TAGS = TYPE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DOCUMENTING_OBJECTS = TYPE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DEFINITION = TYPE__DEFINITION;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.EnumeratedTypeImpl <em>Enumerated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.EnumeratedTypeImpl
	 * @see conml.types.impl.TypesPackageImpl#getEnumeratedType()
	 * @generated
	 */
	int ENUMERATED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__TAGS = DATA_TYPE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__DOCUMENTING_OBJECTS = DATA_TYPE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OWNED_ITEMS = DATA_TYPE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Specialized By Enumerated Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES = DATA_TYPE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Specializes From Enumerated Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE = DATA_TYPE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__PACKAGE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.AssociationImpl
	 * @see conml.types.impl.TypesPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TAGS = TYPE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DOCUMENTING_OBJECTS = TYPE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DEFINITION = TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Primary Semi Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PRIMARY_SEMI_ASSOCIATION = TYPE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Secondary Semi Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SECONDARY_SEMI_ASSOCIATION = TYPE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Instance Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INSTANCE_LINKS = TYPE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Compact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMPACT = TYPE_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.PackageImpl
	 * @see conml.types.impl.TypesPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TAGS = TYPE_MODEL_ELEMENT__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOCUMENTING_OBJECTS = TYPE_MODEL_ELEMENT__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINED_CLASSES = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Enumerated Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ENUMERATED_TYPES = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUB_PACKAGES = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Container Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINER_PACKAGE = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Overall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OVERALL = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = TYPE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.AttributeImpl
	 * @see conml.types.impl.TypesPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGS = FEATURE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DOCUMENTING_OBJECTS = FEATURE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFINITION = FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAXIMUM_CARDINALITY = FEATURE__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MINIMUM_CARDINALITY = FEATURE__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SORTED = FEATURE__SORTED;

  /**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TEMPORAL = FEATURE__TEMPORAL;

  /**
	 * The feature id for the '<em><b>Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SUBJECTIVE = FEATURE__SUBJECTIVE;

  /**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTANT = FEATURE__CONSTANT;

  /**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REDEFINED_FEATURE = FEATURE__REDEFINED_FEATURE;

    /**
	 * The feature id for the '<em><b>Redefined By Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REDEFINED_BY_FEATURES = FEATURE__REDEFINED_BY_FEATURES;

    /**
	 * The feature id for the '<em><b>Multilingual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTILINGUAL = FEATURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Instance Value Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INSTANCE_VALUE_SETS = FEATURE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATATYPE = FEATURE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.SemiAssociationImpl <em>Semi Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.SemiAssociationImpl
	 * @see conml.types.impl.TypesPackageImpl#getSemiAssociation()
	 * @generated
	 */
	int SEMI_ASSOCIATION = 10;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__TAGS = FEATURE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__DOCUMENTING_OBJECTS = FEATURE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__DEFINITION = FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__MAXIMUM_CARDINALITY = FEATURE__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__MINIMUM_CARDINALITY = FEATURE__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__SORTED = FEATURE__SORTED;

  /**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__TEMPORAL = FEATURE__TEMPORAL;

  /**
	 * The feature id for the '<em><b>Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__SUBJECTIVE = FEATURE__SUBJECTIVE;

  /**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__CONSTANT = FEATURE__CONSTANT;

  /**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__REDEFINED_FEATURE = FEATURE__REDEFINED_FEATURE;

    /**
	 * The feature id for the '<em><b>Redefined By Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__REDEFINED_BY_FEATURES = FEATURE__REDEFINED_BY_FEATURES;

    /**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__ROLE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__WHOLE = FEATURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__STRONG = FEATURE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__OWNER = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary In Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION = FEATURE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Secondary In Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION = FEATURE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Instance Reference Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS = FEATURE_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Inverse Semi Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION = FEATURE_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__REFERRED_CLASS = FEATURE_FEATURE_COUNT + 8;

  /**
	 * The number of structural features of the '<em>Semi Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Semi Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.PropertyImpl
	 * @see conml.types.impl.TypesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TAGS = FEATURE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOCUMENTING_OBJECTS = FEATURE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFINITION = FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MAXIMUM_CARDINALITY = FEATURE__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MINIMUM_CARDINALITY = FEATURE__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SORTED = FEATURE__SORTED;

  /**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TEMPORAL = FEATURE__TEMPORAL;

  /**
	 * The feature id for the '<em><b>Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBJECTIVE = FEATURE__SUBJECTIVE;

  /**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONSTANT = FEATURE__CONSTANT;

  /**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_FEATURE = FEATURE__REDEFINED_FEATURE;

    /**
	 * The feature id for the '<em><b>Redefined By Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_BY_FEATURES = FEATURE__REDEFINED_BY_FEATURES;

    /**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.SimpleDataTypeImpl
	 * @see conml.types.impl.TypesPackageImpl#getSimpleDataType()
	 * @generated
	 */
	int SIMPLE_DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__TAGS = DATA_TYPE__TAGS;

  /**
	 * The feature id for the '<em><b>Documenting Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__DOCUMENTING_OBJECTS = DATA_TYPE__DOCUMENTING_OBJECTS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__BASE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.types.impl.EnumeratedItemImpl <em>Enumerated Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.impl.EnumeratedItemImpl
	 * @see conml.types.impl.TypesPackageImpl#getEnumeratedItem()
	 * @generated
	 */
	int ENUMERATED_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Super Item Of Enumerated Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS = 3;

  /**
	 * The feature id for the '<em><b>Sub Item Of Enumerated Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM = 4;

  /**
	 * The number of structural features of the '<em>Enumerated Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Enumerated Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conml.types.BaseDataType <em>Base Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.types.BaseDataType
	 * @see conml.types.impl.TypesPackageImpl#getBaseDataType()
	 * @generated
	 */
	int BASE_DATA_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link conml.types.TypeModel <em>Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Model</em>'.
	 * @see conml.types.TypeModel
	 * @generated
	 */
	EClass getTypeModel();

	/**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getConformingInstanceModel <em>Conforming Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conforming Instance Model</em>'.
	 * @see conml.types.TypeModel#getConformingInstanceModel()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_ConformingInstanceModel();

  /**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getExtendedTypeModel <em>Extended Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Type Model</em>'.
	 * @see conml.types.TypeModel#getExtendedTypeModel()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_ExtendedTypeModel();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.TypeModel#getExtendingTypeModels <em>Extending Type Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extending Type Models</em>'.
	 * @see conml.types.TypeModel#getExtendingTypeModels()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_ExtendingTypeModels();

  /**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getParticularInTypeModel <em>Particular In Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Particular In Type Model</em>'.
	 * @see conml.types.TypeModel#getParticularInTypeModel()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_ParticularInTypeModel();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.TypeModel#getHasParticularTypeModels <em>Has Particular Type Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Particular Type Models</em>'.
	 * @see conml.types.TypeModel#getHasParticularTypeModels()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_HasParticularTypeModels();

  /**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getSubjectiveAspect <em>Subjective Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subjective Aspect</em>'.
	 * @see conml.types.TypeModel#getSubjectiveAspect()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_SubjectiveAspect();

  /**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getTemporalAspect <em>Temporal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temporal Aspect</em>'.
	 * @see conml.types.TypeModel#getTemporalAspect()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_TemporalAspect();

    /**
	 * Returns the meta object for class '{@link conml.types.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see conml.types.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conml.types.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Type#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see conml.types.Type#getDefinition()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Definition();

	/**
	 * Returns the meta object for class '{@link conml.types.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see conml.types.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see conml.types.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Class#isUsedAsTemporalAspect <em>Used As Temporal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used As Temporal Aspect</em>'.
	 * @see conml.types.Class#isUsedAsTemporalAspect()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_UsedAsTemporalAspect();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Class#isUsedAsSubjectiveAspect <em>Used As Subjective Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used As Subjective Aspect</em>'.
	 * @see conml.types.Class#isUsedAsSubjectiveAspect()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_UsedAsSubjectiveAspect();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalization</em>'.
	 * @see conml.types.Class#getGeneralization()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Generalization();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Class#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization</em>'.
	 * @see conml.types.Class#getSpecialization()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Specialization();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Class#getDominantGeneralization <em>Dominant Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dominant Generalization</em>'.
	 * @see conml.types.Class#getDominantGeneralization()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_DominantGeneralization();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.types.Class#getSemiassociations <em>Semiassociations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semiassociations</em>'.
	 * @see conml.types.Class#getSemiassociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Semiassociations();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getInstanceObjects <em>Instance Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Objects</em>'.
	 * @see conml.types.Class#getInstanceObjects()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_InstanceObjects();

    /**
	 * Returns the meta object for the reference '{@link conml.types.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see conml.types.Class#getPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Package();

  /**
	 * Returns the meta object for the containment reference list '{@link conml.types.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see conml.types.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

    /**
	 * Returns the meta object for the containment reference list '{@link conml.types.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see conml.types.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

    /**
	 * Returns the meta object for class '{@link conml.types.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see conml.types.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Generalization#getDiscriminant <em>Discriminant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminant</em>'.
	 * @see conml.types.Generalization#getDiscriminant()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Discriminant();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Generalization#getSpecializedClass <em>Specialized Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialized Class</em>'.
	 * @see conml.types.Generalization#getSpecializedClass()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_SpecializedClass();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Generalization#getGeneralizedClass <em>Generalized Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generalized Class</em>'.
	 * @see conml.types.Generalization#getGeneralizedClass()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_GeneralizedClass();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Generalization#getDominatesInheritanceOn <em>Dominates Inheritance On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dominates Inheritance On</em>'.
	 * @see conml.types.Generalization#getDominatesInheritanceOn()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_DominatesInheritanceOn();

	/**
	 * Returns the meta object for class '{@link conml.types.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see conml.types.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#getMaximumCardinality <em>Maximum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Cardinality</em>'.
	 * @see conml.types.Feature#getMaximumCardinality()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_MaximumCardinality();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#getMinimumCardinality <em>Minimum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Cardinality</em>'.
	 * @see conml.types.Feature#getMinimumCardinality()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_MinimumCardinality();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isSorted <em>Sorted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorted</em>'.
	 * @see conml.types.Feature#isSorted()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Sorted();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see conml.types.Feature#isTemporal()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Temporal();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isSubjective <em>Subjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subjective</em>'.
	 * @see conml.types.Feature#isSubjective()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Subjective();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see conml.types.Feature#isConstant()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Constant();

  /**
	 * Returns the meta object for the reference '{@link conml.types.Feature#getRedefinedFeature <em>Redefined Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefined Feature</em>'.
	 * @see conml.types.Feature#getRedefinedFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RedefinedFeature();

    /**
	 * Returns the meta object for the reference list '{@link conml.types.Feature#getRedefinedByFeatures <em>Redefined By Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined By Features</em>'.
	 * @see conml.types.Feature#getRedefinedByFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RedefinedByFeatures();

    /**
	 * Returns the meta object for class '{@link conml.types.EnumeratedType <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Type</em>'.
	 * @see conml.types.EnumeratedType
	 * @generated
	 */
	EClass getEnumeratedType();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.types.EnumeratedType#getOwnedItems <em>Owned Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Items</em>'.
	 * @see conml.types.EnumeratedType#getOwnedItems()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_OwnedItems();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.EnumeratedType#getSpecializedByEnumeratedTypes <em>Specialized By Enumerated Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialized By Enumerated Types</em>'.
	 * @see conml.types.EnumeratedType#getSpecializedByEnumeratedTypes()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_SpecializedByEnumeratedTypes();

  /**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedType#getSpecializesFromEnumeratedType <em>Specializes From Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes From Enumerated Type</em>'.
	 * @see conml.types.EnumeratedType#getSpecializesFromEnumeratedType()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_SpecializesFromEnumeratedType();

  /**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see conml.types.EnumeratedType#getPackage()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_Package();

	/**
	 * Returns the meta object for class '{@link conml.types.TypeModelElement <em>Type Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Model Element</em>'.
	 * @see conml.types.TypeModelElement
	 * @generated
	 */
	EClass getTypeModelElement();

	/**
	 * Returns the meta object for class '{@link conml.types.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see conml.types.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Association#getPrimarySemiAssociation <em>Primary Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Semi Association</em>'.
	 * @see conml.types.Association#getPrimarySemiAssociation()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_PrimarySemiAssociation();

  /**
	 * Returns the meta object for the reference '{@link conml.types.Association#getSecondarySemiAssociation <em>Secondary Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Semi Association</em>'.
	 * @see conml.types.Association#getSecondarySemiAssociation()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SecondarySemiAssociation();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.Association#getInstanceLinks <em>Instance Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Links</em>'.
	 * @see conml.types.Association#getInstanceLinks()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_InstanceLinks();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Association#isCompact <em>Compact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compact</em>'.
	 * @see conml.types.Association#isCompact()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Compact();

  /**
	 * Returns the meta object for class '{@link conml.types.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see conml.types.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conml.types.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conml.types.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Description();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Package#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Classes</em>'.
	 * @see conml.types.Package#getContainedClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContainedClasses();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.Package#getEnumeratedTypes <em>Enumerated Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enumerated Types</em>'.
	 * @see conml.types.Package#getEnumeratedTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_EnumeratedTypes();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Packages</em>'.
	 * @see conml.types.Package#getSubPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SubPackages();

    /**
	 * Returns the meta object for the reference '{@link conml.types.Package#getContainerPackage <em>Container Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Package</em>'.
	 * @see conml.types.Package#getContainerPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContainerPackage();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.Package#isOverall <em>Overall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall</em>'.
	 * @see conml.types.Package#isOverall()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Overall();

  /**
	 * Returns the meta object for class '{@link conml.types.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see conml.types.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Attribute#isMultilingual <em>Multilingual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multilingual</em>'.
	 * @see conml.types.Attribute#isMultilingual()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Multilingual();

  /**
	 * Returns the meta object for the reference list '{@link conml.types.Attribute#getInstanceValueSets <em>Instance Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Value Sets</em>'.
	 * @see conml.types.Attribute#getInstanceValueSets()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InstanceValueSets();

    /**
	 * Returns the meta object for the reference '{@link conml.types.Attribute#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see conml.types.Attribute#getDatatype()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Datatype();

  /**
	 * Returns the meta object for class '{@link conml.types.SemiAssociation <em>Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semi Association</em>'.
	 * @see conml.types.SemiAssociation
	 * @generated
	 */
	EClass getSemiAssociation();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.SemiAssociation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see conml.types.SemiAssociation#getRole()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EAttribute getSemiAssociation_Role();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.SemiAssociation#isWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whole</em>'.
	 * @see conml.types.SemiAssociation#isWhole()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EAttribute getSemiAssociation_Whole();

  /**
	 * Returns the meta object for the attribute '{@link conml.types.SemiAssociation#isStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong</em>'.
	 * @see conml.types.SemiAssociation#isStrong()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EAttribute getSemiAssociation_Strong();

  /**
	 * Returns the meta object for the container reference '{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see conml.types.SemiAssociation#getOwner()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_Owner();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getPrimaryInAssociation <em>Primary In Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary In Association</em>'.
	 * @see conml.types.SemiAssociation#getPrimaryInAssociation()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_PrimaryInAssociation();

    /**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getSecondaryInAssociation <em>Secondary In Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary In Association</em>'.
	 * @see conml.types.SemiAssociation#getSecondaryInAssociation()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_SecondaryInAssociation();

    /**
	 * Returns the meta object for the reference list '{@link conml.types.SemiAssociation#getInstanceReferenceSets <em>Instance Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Reference Sets</em>'.
	 * @see conml.types.SemiAssociation#getInstanceReferenceSets()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_InstanceReferenceSets();

    /**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getInverseSemiAssociation <em>Inverse Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse Semi Association</em>'.
	 * @see conml.types.SemiAssociation#getInverseSemiAssociation()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_InverseSemiAssociation();

  /**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getReferredClass <em>Referred Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Class</em>'.
	 * @see conml.types.SemiAssociation#getReferredClass()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_ReferredClass();

  /**
	 * Returns the meta object for class '{@link conml.types.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see conml.types.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link conml.types.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Data Type</em>'.
	 * @see conml.types.SimpleDataType
	 * @generated
	 */
	EClass getSimpleDataType();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.SimpleDataType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see conml.types.SimpleDataType#getBase()
	 * @see #getSimpleDataType()
	 * @generated
	 */
	EAttribute getSimpleDataType_Base();

	/**
	 * Returns the meta object for class '{@link conml.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see conml.types.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link conml.types.EnumeratedItem <em>Enumerated Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Item</em>'.
	 * @see conml.types.EnumeratedItem
	 * @generated
	 */
	EClass getEnumeratedItem();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.EnumeratedItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conml.types.EnumeratedItem#getName()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EAttribute getEnumeratedItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.EnumeratedItem#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see conml.types.EnumeratedItem#getDefinition()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EAttribute getEnumeratedItem_Definition();

	/**
	 * Returns the meta object for the container reference '{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see conml.types.EnumeratedItem#getOwner()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_Owner();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.EnumeratedItem#getSuperItemOfEnumeratedItems <em>Super Item Of Enumerated Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Item Of Enumerated Items</em>'.
	 * @see conml.types.EnumeratedItem#getSuperItemOfEnumeratedItems()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_SuperItemOfEnumeratedItems();

  /**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedItem#getSubItemOfEnumeratedItem <em>Sub Item Of Enumerated Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Item Of Enumerated Item</em>'.
	 * @see conml.types.EnumeratedItem#getSubItemOfEnumeratedItem()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_SubItemOfEnumeratedItem();

  /**
	 * Returns the meta object for enum '{@link conml.types.BaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Data Type</em>'.
	 * @see conml.types.BaseDataType
	 * @generated
	 */
	EEnum getBaseDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link conml.types.impl.TypeModelImpl <em>Type Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.TypeModelImpl
		 * @see conml.types.impl.TypesPackageImpl#getTypeModel()
		 * @generated
		 */
		EClass TYPE_MODEL = eINSTANCE.getTypeModel();

		/**
		 * The meta object literal for the '<em><b>Conforming Instance Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__CONFORMING_INSTANCE_MODEL = eINSTANCE.getTypeModel_ConformingInstanceModel();

    /**
		 * The meta object literal for the '<em><b>Extended Type Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__EXTENDED_TYPE_MODEL = eINSTANCE.getTypeModel_ExtendedTypeModel();

    /**
		 * The meta object literal for the '<em><b>Extending Type Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__EXTENDING_TYPE_MODELS = eINSTANCE.getTypeModel_ExtendingTypeModels();

    /**
		 * The meta object literal for the '<em><b>Particular In Type Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL = eINSTANCE.getTypeModel_ParticularInTypeModel();

    /**
		 * The meta object literal for the '<em><b>Has Particular Type Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS = eINSTANCE.getTypeModel_HasParticularTypeModels();

    /**
		 * The meta object literal for the '<em><b>Subjective Aspect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__SUBJECTIVE_ASPECT = eINSTANCE.getTypeModel_SubjectiveAspect();

    /**
		 * The meta object literal for the '<em><b>Temporal Aspect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__TEMPORAL_ASPECT = eINSTANCE.getTypeModel_TemporalAspect();

        /**
		 * The meta object literal for the '{@link conml.types.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.TypeImpl
		 * @see conml.types.impl.TypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__DEFINITION = eINSTANCE.getType_Definition();

		/**
		 * The meta object literal for the '{@link conml.types.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.ClassImpl
		 * @see conml.types.impl.TypesPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

    /**
		 * The meta object literal for the '<em><b>Used As Temporal Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__USED_AS_TEMPORAL_ASPECT = eINSTANCE.getClass_UsedAsTemporalAspect();

    /**
		 * The meta object literal for the '<em><b>Used As Subjective Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__USED_AS_SUBJECTIVE_ASPECT = eINSTANCE.getClass_UsedAsSubjectiveAspect();

    /**
		 * The meta object literal for the '<em><b>Generalization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GENERALIZATION = eINSTANCE.getClass_Generalization();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SPECIALIZATION = eINSTANCE.getClass_Specialization();

		/**
		 * The meta object literal for the '<em><b>Dominant Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__DOMINANT_GENERALIZATION = eINSTANCE.getClass_DominantGeneralization();

		/**
		 * The meta object literal for the '<em><b>Semiassociations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SEMIASSOCIATIONS = eINSTANCE.getClass_Semiassociations();

    /**
		 * The meta object literal for the '<em><b>Instance Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INSTANCE_OBJECTS = eINSTANCE.getClass_InstanceObjects();

        /**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PACKAGE = eINSTANCE.getClass_Package();

    /**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

        /**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

        /**
		 * The meta object literal for the '{@link conml.types.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.GeneralizationImpl
		 * @see conml.types.impl.TypesPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Discriminant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__DISCRIMINANT = eINSTANCE.getGeneralization_Discriminant();

		/**
		 * The meta object literal for the '<em><b>Specialized Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIALIZED_CLASS = eINSTANCE.getGeneralization_SpecializedClass();

		/**
		 * The meta object literal for the '<em><b>Generalized Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZED_CLASS = eINSTANCE.getGeneralization_GeneralizedClass();

		/**
		 * The meta object literal for the '<em><b>Dominates Inheritance On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__DOMINATES_INHERITANCE_ON = eINSTANCE.getGeneralization_DominatesInheritanceOn();

		/**
		 * The meta object literal for the '{@link conml.types.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.FeatureImpl
		 * @see conml.types.impl.TypesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Maximum Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__MAXIMUM_CARDINALITY = eINSTANCE.getFeature_MaximumCardinality();

		/**
		 * The meta object literal for the '<em><b>Minimum Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__MINIMUM_CARDINALITY = eINSTANCE.getFeature_MinimumCardinality();

		/**
		 * The meta object literal for the '<em><b>Sorted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SORTED = eINSTANCE.getFeature_Sorted();

    /**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TEMPORAL = eINSTANCE.getFeature_Temporal();

    /**
		 * The meta object literal for the '<em><b>Subjective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SUBJECTIVE = eINSTANCE.getFeature_Subjective();

    /**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CONSTANT = eINSTANCE.getFeature_Constant();

    /**
		 * The meta object literal for the '<em><b>Redefined Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REDEFINED_FEATURE = eINSTANCE.getFeature_RedefinedFeature();

        /**
		 * The meta object literal for the '<em><b>Redefined By Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REDEFINED_BY_FEATURES = eINSTANCE.getFeature_RedefinedByFeatures();

        /**
		 * The meta object literal for the '{@link conml.types.impl.EnumeratedTypeImpl <em>Enumerated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.EnumeratedTypeImpl
		 * @see conml.types.impl.TypesPackageImpl#getEnumeratedType()
		 * @generated
		 */
		EClass ENUMERATED_TYPE = eINSTANCE.getEnumeratedType();

		/**
		 * The meta object literal for the '<em><b>Owned Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__OWNED_ITEMS = eINSTANCE.getEnumeratedType_OwnedItems();

    /**
		 * The meta object literal for the '<em><b>Specialized By Enumerated Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES = eINSTANCE.getEnumeratedType_SpecializedByEnumeratedTypes();

    /**
		 * The meta object literal for the '<em><b>Specializes From Enumerated Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE = eINSTANCE.getEnumeratedType_SpecializesFromEnumeratedType();

    /**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__PACKAGE = eINSTANCE.getEnumeratedType_Package();

		/**
		 * The meta object literal for the '{@link conml.types.impl.TypeModelElementImpl <em>Type Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.TypeModelElementImpl
		 * @see conml.types.impl.TypesPackageImpl#getTypeModelElement()
		 * @generated
		 */
		EClass TYPE_MODEL_ELEMENT = eINSTANCE.getTypeModelElement();

		/**
		 * The meta object literal for the '{@link conml.types.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.AssociationImpl
		 * @see conml.types.impl.TypesPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Primary Semi Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PRIMARY_SEMI_ASSOCIATION = eINSTANCE.getAssociation_PrimarySemiAssociation();

    /**
		 * The meta object literal for the '<em><b>Secondary Semi Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SECONDARY_SEMI_ASSOCIATION = eINSTANCE.getAssociation_SecondarySemiAssociation();

    /**
		 * The meta object literal for the '<em><b>Instance Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__INSTANCE_LINKS = eINSTANCE.getAssociation_InstanceLinks();

    /**
		 * The meta object literal for the '<em><b>Compact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__COMPACT = eINSTANCE.getAssociation_Compact();

    /**
		 * The meta object literal for the '{@link conml.types.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.PackageImpl
		 * @see conml.types.impl.TypesPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Contained Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTAINED_CLASSES = eINSTANCE.getPackage_ContainedClasses();

    /**
		 * The meta object literal for the '<em><b>Enumerated Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ENUMERATED_TYPES = eINSTANCE.getPackage_EnumeratedTypes();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUB_PACKAGES = eINSTANCE.getPackage_SubPackages();

        /**
		 * The meta object literal for the '<em><b>Container Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTAINER_PACKAGE = eINSTANCE.getPackage_ContainerPackage();

    /**
		 * The meta object literal for the '<em><b>Overall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__OVERALL = eINSTANCE.getPackage_Overall();

    /**
		 * The meta object literal for the '{@link conml.types.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.AttributeImpl
		 * @see conml.types.impl.TypesPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Multilingual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTILINGUAL = eINSTANCE.getAttribute_Multilingual();

    /**
		 * The meta object literal for the '<em><b>Instance Value Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__INSTANCE_VALUE_SETS = eINSTANCE.getAttribute_InstanceValueSets();

        /**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

    /**
		 * The meta object literal for the '{@link conml.types.impl.SemiAssociationImpl <em>Semi Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.SemiAssociationImpl
		 * @see conml.types.impl.TypesPackageImpl#getSemiAssociation()
		 * @generated
		 */
		EClass SEMI_ASSOCIATION = eINSTANCE.getSemiAssociation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMI_ASSOCIATION__ROLE = eINSTANCE.getSemiAssociation_Role();

		/**
		 * The meta object literal for the '<em><b>Whole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMI_ASSOCIATION__WHOLE = eINSTANCE.getSemiAssociation_Whole();

    /**
		 * The meta object literal for the '<em><b>Strong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMI_ASSOCIATION__STRONG = eINSTANCE.getSemiAssociation_Strong();

    /**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__OWNER = eINSTANCE.getSemiAssociation_Owner();

		/**
		 * The meta object literal for the '<em><b>Primary In Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION = eINSTANCE.getSemiAssociation_PrimaryInAssociation();

        /**
		 * The meta object literal for the '<em><b>Secondary In Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION = eINSTANCE.getSemiAssociation_SecondaryInAssociation();

        /**
		 * The meta object literal for the '<em><b>Instance Reference Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS = eINSTANCE.getSemiAssociation_InstanceReferenceSets();

        /**
		 * The meta object literal for the '<em><b>Inverse Semi Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION = eINSTANCE.getSemiAssociation_InverseSemiAssociation();

    /**
		 * The meta object literal for the '<em><b>Referred Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__REFERRED_CLASS = eINSTANCE.getSemiAssociation_ReferredClass();

    /**
		 * The meta object literal for the '{@link conml.types.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.PropertyImpl
		 * @see conml.types.impl.TypesPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link conml.types.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.SimpleDataTypeImpl
		 * @see conml.types.impl.TypesPackageImpl#getSimpleDataType()
		 * @generated
		 */
		EClass SIMPLE_DATA_TYPE = eINSTANCE.getSimpleDataType();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DATA_TYPE__BASE = eINSTANCE.getSimpleDataType_Base();

		/**
		 * The meta object literal for the '{@link conml.types.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.DataTypeImpl
		 * @see conml.types.impl.TypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link conml.types.impl.EnumeratedItemImpl <em>Enumerated Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.impl.EnumeratedItemImpl
		 * @see conml.types.impl.TypesPackageImpl#getEnumeratedItem()
		 * @generated
		 */
		EClass ENUMERATED_ITEM = eINSTANCE.getEnumeratedItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED_ITEM__NAME = eINSTANCE.getEnumeratedItem_Name();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED_ITEM__DEFINITION = eINSTANCE.getEnumeratedItem_Definition();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__OWNER = eINSTANCE.getEnumeratedItem_Owner();

		/**
		 * The meta object literal for the '<em><b>Super Item Of Enumerated Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS = eINSTANCE.getEnumeratedItem_SuperItemOfEnumeratedItems();

    /**
		 * The meta object literal for the '<em><b>Sub Item Of Enumerated Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM = eINSTANCE.getEnumeratedItem_SubItemOfEnumeratedItem();

    /**
		 * The meta object literal for the '{@link conml.types.BaseDataType <em>Base Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.types.BaseDataType
		 * @see conml.types.impl.TypesPackageImpl#getBaseDataType()
		 * @generated
		 */
		EEnum BASE_DATA_TYPE = eINSTANCE.getBaseDataType();

	}

} //TypesPackage
