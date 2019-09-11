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
	 * The feature id for the '<em><b>Has Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__HAS_TAGS = conmlPackage.MODEL__HAS_TAGS;

	/**
	 * The feature id for the '<em><b>Has Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__HAS_LANGUAGES = conmlPackage.MODEL__HAS_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__DEFAULT_LANGUAGE = conmlPackage.MODEL__DEFAULT_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Owns Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__OWNS_ELEMENTS = conmlPackage.MODEL__OWNS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Conformed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__CONFORMED_BY = conmlPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Temporal Aspect Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__HAS_TEMPORAL_ASPECT_OF = conmlPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Subjective Aspect Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__HAS_SUBJECTIVE_ASPECT_OF = conmlPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__EXTENDS = conmlPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Base Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__IS_BASE_OF = conmlPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Particular In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__IS_PARTICULAR_IN = conmlPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Particular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL__HAS_PARTICULAR = conmlPackage.MODEL_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_ELEMENT__IS_TAGGED_WITH = conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MODEL_ELEMENT__IS_DOCUMENTED_BY = conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_TAGGED_WITH = TYPE_MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_DOCUMENTED_BY = TYPE_MODEL_ELEMENT__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_TAGGED_WITH = TYPE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_DOCUMENTED_BY = TYPE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Temporal Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_TEMPORAL_ASPECT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Subjective Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SUBJECTIVE_ASPECT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Temporal Aspect Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_TEMPORAL_ASPECT_OF = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Subjective Aspect Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SUBJECTIVE_ASPECT_OF = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SPECIALIZATION = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dominant Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DOMINANT_GENERALIZATION = TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Semiassociations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_SEMIASSOCIATIONS = TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owns Semiassociations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNS_SEMIASSOCIATIONS = TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Opposite Class In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_OPPOSITE_CLASS_IN = TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Instanced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INSTANCED_BY = TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Belongs To Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BELONGS_TO_PACKAGE = TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owns Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNS_PROPERTIES = TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owns Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNS_ATTRIBUTES = TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 15;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IS_TAGGED_WITH = TYPE_MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IS_DOCUMENTED_BY = TYPE_MODEL_ELEMENT__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_TAGGED_WITH = TYPE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_DOCUMENTED_BY = TYPE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_SORTED = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_TEMPORAL = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_SUBJECTIVE = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_CONSTANT = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINES = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Redefined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_REDEFINED_BY = TYPE_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_TAGGED_WITH = TYPE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_DOCUMENTED_BY = TYPE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__APPLIES_TO = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__IS_TAGGED_WITH = DATA_TYPE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__IS_DOCUMENTED_BY = DATA_TYPE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__APPLIES_TO = DATA_TYPE__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Owns Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__OWNS_ITEMS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__HAS_ITEMS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__IS_SPECIALIZED_BY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specializes From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__SPECIALIZES_FROM = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Belongs To Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__BELONGS_TO_PACKAGE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_TAGGED_WITH = TYPE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_DOCUMENTED_BY = TYPE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Has Primary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__HAS_PRIMARY = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Secondary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__HAS_SECONDARY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Instance Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__HAS_INSTANCE_LINKS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_TAGGED_WITH = TYPE_MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_DOCUMENTED_BY = TYPE_MODEL_ELEMENT__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Contains Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINS_CLASS = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contains Enumerated Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINS_ENUMERATED_TYPE = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Owner Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_OWNER_OF = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Sub Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_SUB_PACKAGE_OF = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = TYPE_MODEL_ELEMENT_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_TAGGED_WITH = FEATURE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_DOCUMENTED_BY = FEATURE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_SORTED = FEATURE__IS_SORTED;

	/**
	 * The feature id for the '<em><b>Is Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_TEMPORAL = FEATURE__IS_TEMPORAL;

	/**
	 * The feature id for the '<em><b>Is Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_SUBJECTIVE = FEATURE__IS_SUBJECTIVE;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_CONSTANT = FEATURE__IS_CONSTANT;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REDEFINES = FEATURE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Is Redefined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_REDEFINED_BY = FEATURE__IS_REDEFINED_BY;

	/**
	 * The feature id for the '<em><b>Is Multilingual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_MULTILINGUAL = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Instance Value Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HAS_INSTANCE_VALUE_SETS = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_OF_TYPE = FEATURE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_TAGGED_WITH = FEATURE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_DOCUMENTED_BY = FEATURE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_SORTED = FEATURE__IS_SORTED;

	/**
	 * The feature id for the '<em><b>Is Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_TEMPORAL = FEATURE__IS_TEMPORAL;

	/**
	 * The feature id for the '<em><b>Is Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_SUBJECTIVE = FEATURE__IS_SUBJECTIVE;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_CONSTANT = FEATURE__IS_CONSTANT;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__REDEFINES = FEATURE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Is Redefined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_REDEFINED_BY = FEATURE__IS_REDEFINED_BY;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__ROLE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Whole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_WHOLE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_STRONG = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__ASSIGNED_TO = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__OWNER = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__REFERS_TO = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Inverse Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_INVERSE_OF = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__INVERSE = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Primary In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_PRIMARY_IN = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Secondary In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__IS_SECONDARY_IN = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Has Instance Reference Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS = FEATURE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Semi Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_ASSOCIATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 11;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_TAGGED_WITH = FEATURE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DOCUMENTED_BY = FEATURE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_SORTED = FEATURE__IS_SORTED;

	/**
	 * The feature id for the '<em><b>Is Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_TEMPORAL = FEATURE__IS_TEMPORAL;

	/**
	 * The feature id for the '<em><b>Is Subjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_SUBJECTIVE = FEATURE__IS_SUBJECTIVE;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_CONSTANT = FEATURE__IS_CONSTANT;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINES = FEATURE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Is Redefined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_REDEFINED_BY = FEATURE__IS_REDEFINED_BY;

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
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__IS_TAGGED_WITH = DATA_TYPE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__IS_DOCUMENTED_BY = DATA_TYPE__IS_DOCUMENTED_BY;

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
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__APPLIES_TO = DATA_TYPE__APPLIES_TO;

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
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__ABSOLUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__ASSIGNED_TO = 4;

	/**
	 * The feature id for the '<em><b>Is Super Item Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__IS_SUPER_ITEM_OF = 5;

	/**
	 * The feature id for the '<em><b>Is Sub Item Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM__IS_SUB_ITEM_OF = 6;

	/**
	 * The number of structural features of the '<em>Enumerated Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_ITEM_FEATURE_COUNT = 7;

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
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getConformedBy <em>Conformed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conformed By</em>'.
	 * @see conml.types.TypeModel#getConformedBy()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_ConformedBy();

	/**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getHasTemporalAspectOf <em>Has Temporal Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Temporal Aspect Of</em>'.
	 * @see conml.types.TypeModel#getHasTemporalAspectOf()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_HasTemporalAspectOf();

	/**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getHasSubjectiveAspectOf <em>Has Subjective Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Subjective Aspect Of</em>'.
	 * @see conml.types.TypeModel#getHasSubjectiveAspectOf()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_HasSubjectiveAspectOf();

	/**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see conml.types.TypeModel#getExtends()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_Extends();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.TypeModel#getIsBaseOf <em>Is Base Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Base Of</em>'.
	 * @see conml.types.TypeModel#getIsBaseOf()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_IsBaseOf();

	/**
	 * Returns the meta object for the reference '{@link conml.types.TypeModel#getIsParticularIn <em>Is Particular In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Particular In</em>'.
	 * @see conml.types.TypeModel#getIsParticularIn()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_IsParticularIn();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.TypeModel#getHasParticular <em>Has Particular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Particular</em>'.
	 * @see conml.types.TypeModel#getHasParticular()
	 * @see #getTypeModel()
	 * @generated
	 */
	EReference getTypeModel_HasParticular();

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
	 * Returns the meta object for the attribute '{@link conml.types.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see conml.types.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Class#isIsTemporalAspect <em>Is Temporal Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Temporal Aspect</em>'.
	 * @see conml.types.Class#isIsTemporalAspect()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsTemporalAspect();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Class#isIsSubjectiveAspect <em>Is Subjective Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subjective Aspect</em>'.
	 * @see conml.types.Class#isIsSubjectiveAspect()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsSubjectiveAspect();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getIsTemporalAspectOf <em>Is Temporal Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Temporal Aspect Of</em>'.
	 * @see conml.types.Class#getIsTemporalAspectOf()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_IsTemporalAspectOf();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getIsSubjectiveAspectOf <em>Is Subjective Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Subjective Aspect Of</em>'.
	 * @see conml.types.Class#getIsSubjectiveAspectOf()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_IsSubjectiveAspectOf();

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
	 * Returns the meta object for the containment reference list '{@link conml.types.Class#getOwnsProperties <em>Owns Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Properties</em>'.
	 * @see conml.types.Class#getOwnsProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnsProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.types.Class#getOwnsAttributes <em>Owns Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Attributes</em>'.
	 * @see conml.types.Class#getOwnsAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnsAttributes();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getHasSemiassociations <em>Has Semiassociations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Semiassociations</em>'.
	 * @see conml.types.Class#getHasSemiassociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasSemiassociations();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getOwnsSemiassociations <em>Owns Semiassociations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns Semiassociations</em>'.
	 * @see conml.types.Class#getOwnsSemiassociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnsSemiassociations();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getIsOppositeClassIn <em>Is Opposite Class In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Opposite Class In</em>'.
	 * @see conml.types.Class#getIsOppositeClassIn()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_IsOppositeClassIn();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Class#getInstancedBy <em>Instanced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instanced By</em>'.
	 * @see conml.types.Class#getInstancedBy()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_InstancedBy();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Class#getBelongsToPackage <em>Belongs To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Package</em>'.
	 * @see conml.types.Class#getBelongsToPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_BelongsToPackage();

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
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isIsSorted <em>Is Sorted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sorted</em>'.
	 * @see conml.types.Feature#isIsSorted()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsSorted();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isIsTemporal <em>Is Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Temporal</em>'.
	 * @see conml.types.Feature#isIsTemporal()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsTemporal();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isIsSubjective <em>Is Subjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subjective</em>'.
	 * @see conml.types.Feature#isIsSubjective()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsSubjective();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.Feature#isIsConstant <em>Is Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constant</em>'.
	 * @see conml.types.Feature#isIsConstant()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsConstant();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Feature#getRedefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefines</em>'.
	 * @see conml.types.Feature#getRedefines()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Redefines();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Feature#getIsRedefinedBy <em>Is Redefined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Redefined By</em>'.
	 * @see conml.types.Feature#getIsRedefinedBy()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IsRedefinedBy();

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
	 * Returns the meta object for the reference list '{@link conml.types.EnumeratedType#getOwnsItems <em>Owns Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns Items</em>'.
	 * @see conml.types.EnumeratedType#getOwnsItems()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_OwnsItems();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.EnumeratedType#getHasItems <em>Has Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Items</em>'.
	 * @see conml.types.EnumeratedType#getHasItems()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_HasItems();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.EnumeratedType#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Specialized By</em>'.
	 * @see conml.types.EnumeratedType#getIsSpecializedBy()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_IsSpecializedBy();

	/**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedType#getSpecializesFrom <em>Specializes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes From</em>'.
	 * @see conml.types.EnumeratedType#getSpecializesFrom()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_SpecializesFrom();

	/**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedType#getBelongsToPackage <em>Belongs To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Package</em>'.
	 * @see conml.types.EnumeratedType#getBelongsToPackage()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_BelongsToPackage();

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
	 * Returns the meta object for the reference '{@link conml.types.Association#getHasPrimary <em>Has Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Primary</em>'.
	 * @see conml.types.Association#getHasPrimary()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_HasPrimary();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Association#getHasSecondary <em>Has Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Secondary</em>'.
	 * @see conml.types.Association#getHasSecondary()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_HasSecondary();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Association#getHasInstanceLinks <em>Has Instance Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Instance Links</em>'.
	 * @see conml.types.Association#getHasInstanceLinks()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_HasInstanceLinks();

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
	 * Returns the meta object for the reference list '{@link conml.types.Package#getContainsClass <em>Contains Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Class</em>'.
	 * @see conml.types.Package#getContainsClass()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContainsClass();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Package#getContainsEnumeratedType <em>Contains Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Enumerated Type</em>'.
	 * @see conml.types.Package#getContainsEnumeratedType()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContainsEnumeratedType();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.types.Package#getIsOwnerOf <em>Is Owner Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Owner Of</em>'.
	 * @see conml.types.Package#getIsOwnerOf()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_IsOwnerOf();

	/**
	 * Returns the meta object for the container reference '{@link conml.types.Package#getIsSubPackageOf <em>Is Sub Package Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Sub Package Of</em>'.
	 * @see conml.types.Package#getIsSubPackageOf()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_IsSubPackageOf();

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
	 * Returns the meta object for the attribute '{@link conml.types.Attribute#isIsMultilingual <em>Is Multilingual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multilingual</em>'.
	 * @see conml.types.Attribute#isIsMultilingual()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsMultilingual();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.Attribute#getHasInstanceValueSets <em>Has Instance Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Instance Value Sets</em>'.
	 * @see conml.types.Attribute#getHasInstanceValueSets()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_HasInstanceValueSets();

	/**
	 * Returns the meta object for the reference '{@link conml.types.Attribute#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Of Type</em>'.
	 * @see conml.types.Attribute#getIsOfType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsOfType();

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
	 * Returns the meta object for the attribute '{@link conml.types.SemiAssociation#isIsWhole <em>Is Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Whole</em>'.
	 * @see conml.types.SemiAssociation#isIsWhole()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EAttribute getSemiAssociation_IsWhole();

	/**
	 * Returns the meta object for the attribute '{@link conml.types.SemiAssociation#isIsStrong <em>Is Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strong</em>'.
	 * @see conml.types.SemiAssociation#isIsStrong()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EAttribute getSemiAssociation_IsStrong();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.SemiAssociation#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see conml.types.SemiAssociation#getAssignedTo()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_AssignedTo();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see conml.types.SemiAssociation#getOwner()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_Owner();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see conml.types.SemiAssociation#getRefersTo()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_RefersTo();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getIsInverseOf <em>Is Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Inverse Of</em>'.
	 * @see conml.types.SemiAssociation#getIsInverseOf()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_IsInverseOf();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse</em>'.
	 * @see conml.types.SemiAssociation#getInverse()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_Inverse();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getIsPrimaryIn <em>Is Primary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Primary In</em>'.
	 * @see conml.types.SemiAssociation#getIsPrimaryIn()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_IsPrimaryIn();

	/**
	 * Returns the meta object for the reference '{@link conml.types.SemiAssociation#getIsSecondaryIn <em>Is Secondary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Secondary In</em>'.
	 * @see conml.types.SemiAssociation#getIsSecondaryIn()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_IsSecondaryIn();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.SemiAssociation#getHasInstanceReferenceSets <em>Has Instance Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Instance Reference Sets</em>'.
	 * @see conml.types.SemiAssociation#getHasInstanceReferenceSets()
	 * @see #getSemiAssociation()
	 * @generated
	 */
	EReference getSemiAssociation_HasInstanceReferenceSets();

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
	 * Returns the meta object for the reference list '{@link conml.types.DataType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To</em>'.
	 * @see conml.types.DataType#getAppliesTo()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_AppliesTo();

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
	 * Returns the meta object for the attribute '{@link conml.types.EnumeratedItem#getAbsoluteName <em>Absolute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Name</em>'.
	 * @see conml.types.EnumeratedItem#getAbsoluteName()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EAttribute getEnumeratedItem_AbsoluteName();

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
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedItem#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see conml.types.EnumeratedItem#getOwner()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_Owner();

	/**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedItem#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To</em>'.
	 * @see conml.types.EnumeratedItem#getAssignedTo()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_AssignedTo();

	/**
	 * Returns the meta object for the reference list '{@link conml.types.EnumeratedItem#getIsSuperItemOf <em>Is Super Item Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Super Item Of</em>'.
	 * @see conml.types.EnumeratedItem#getIsSuperItemOf()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_IsSuperItemOf();

	/**
	 * Returns the meta object for the reference '{@link conml.types.EnumeratedItem#getIsSubItemOf <em>Is Sub Item Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Sub Item Of</em>'.
	 * @see conml.types.EnumeratedItem#getIsSubItemOf()
	 * @see #getEnumeratedItem()
	 * @generated
	 */
	EReference getEnumeratedItem_IsSubItemOf();

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
		 * The meta object literal for the '<em><b>Conformed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__CONFORMED_BY = eINSTANCE.getTypeModel_ConformedBy();

		/**
		 * The meta object literal for the '<em><b>Has Temporal Aspect Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__HAS_TEMPORAL_ASPECT_OF = eINSTANCE.getTypeModel_HasTemporalAspectOf();

		/**
		 * The meta object literal for the '<em><b>Has Subjective Aspect Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__HAS_SUBJECTIVE_ASPECT_OF = eINSTANCE.getTypeModel_HasSubjectiveAspectOf();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__EXTENDS = eINSTANCE.getTypeModel_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Base Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__IS_BASE_OF = eINSTANCE.getTypeModel_IsBaseOf();

		/**
		 * The meta object literal for the '<em><b>Is Particular In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__IS_PARTICULAR_IN = eINSTANCE.getTypeModel_IsParticularIn();

		/**
		 * The meta object literal for the '<em><b>Has Particular</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MODEL__HAS_PARTICULAR = eINSTANCE.getTypeModel_HasParticular();

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
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Temporal Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_TEMPORAL_ASPECT = eINSTANCE.getClass_IsTemporalAspect();

		/**
		 * The meta object literal for the '<em><b>Is Subjective Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_SUBJECTIVE_ASPECT = eINSTANCE.getClass_IsSubjectiveAspect();

		/**
		 * The meta object literal for the '<em><b>Is Temporal Aspect Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IS_TEMPORAL_ASPECT_OF = eINSTANCE.getClass_IsTemporalAspectOf();

		/**
		 * The meta object literal for the '<em><b>Is Subjective Aspect Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IS_SUBJECTIVE_ASPECT_OF = eINSTANCE.getClass_IsSubjectiveAspectOf();

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
		 * The meta object literal for the '<em><b>Owns Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNS_PROPERTIES = eINSTANCE.getClass_OwnsProperties();

		/**
		 * The meta object literal for the '<em><b>Owns Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNS_ATTRIBUTES = eINSTANCE.getClass_OwnsAttributes();

		/**
		 * The meta object literal for the '<em><b>Has Semiassociations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_SEMIASSOCIATIONS = eINSTANCE.getClass_HasSemiassociations();

		/**
		 * The meta object literal for the '<em><b>Owns Semiassociations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNS_SEMIASSOCIATIONS = eINSTANCE.getClass_OwnsSemiassociations();

		/**
		 * The meta object literal for the '<em><b>Is Opposite Class In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IS_OPPOSITE_CLASS_IN = eINSTANCE.getClass_IsOppositeClassIn();

		/**
		 * The meta object literal for the '<em><b>Instanced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INSTANCED_BY = eINSTANCE.getClass_InstancedBy();

		/**
		 * The meta object literal for the '<em><b>Belongs To Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__BELONGS_TO_PACKAGE = eINSTANCE.getClass_BelongsToPackage();

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
		 * The meta object literal for the '<em><b>Is Sorted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_SORTED = eINSTANCE.getFeature_IsSorted();

		/**
		 * The meta object literal for the '<em><b>Is Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_TEMPORAL = eINSTANCE.getFeature_IsTemporal();

		/**
		 * The meta object literal for the '<em><b>Is Subjective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_SUBJECTIVE = eINSTANCE.getFeature_IsSubjective();

		/**
		 * The meta object literal for the '<em><b>Is Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_CONSTANT = eINSTANCE.getFeature_IsConstant();

		/**
		 * The meta object literal for the '<em><b>Redefines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REDEFINES = eINSTANCE.getFeature_Redefines();

		/**
		 * The meta object literal for the '<em><b>Is Redefined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__IS_REDEFINED_BY = eINSTANCE.getFeature_IsRedefinedBy();

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
		 * The meta object literal for the '<em><b>Owns Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__OWNS_ITEMS = eINSTANCE.getEnumeratedType_OwnsItems();

		/**
		 * The meta object literal for the '<em><b>Has Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__HAS_ITEMS = eINSTANCE.getEnumeratedType_HasItems();

		/**
		 * The meta object literal for the '<em><b>Is Specialized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__IS_SPECIALIZED_BY = eINSTANCE.getEnumeratedType_IsSpecializedBy();

		/**
		 * The meta object literal for the '<em><b>Specializes From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__SPECIALIZES_FROM = eINSTANCE.getEnumeratedType_SpecializesFrom();

		/**
		 * The meta object literal for the '<em><b>Belongs To Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__BELONGS_TO_PACKAGE = eINSTANCE.getEnumeratedType_BelongsToPackage();

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
		 * The meta object literal for the '<em><b>Has Primary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__HAS_PRIMARY = eINSTANCE.getAssociation_HasPrimary();

		/**
		 * The meta object literal for the '<em><b>Has Secondary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__HAS_SECONDARY = eINSTANCE.getAssociation_HasSecondary();

		/**
		 * The meta object literal for the '<em><b>Has Instance Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__HAS_INSTANCE_LINKS = eINSTANCE.getAssociation_HasInstanceLinks();

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
		 * The meta object literal for the '<em><b>Contains Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTAINS_CLASS = eINSTANCE.getPackage_ContainsClass();

		/**
		 * The meta object literal for the '<em><b>Contains Enumerated Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTAINS_ENUMERATED_TYPE = eINSTANCE.getPackage_ContainsEnumeratedType();

		/**
		 * The meta object literal for the '<em><b>Is Owner Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__IS_OWNER_OF = eINSTANCE.getPackage_IsOwnerOf();

		/**
		 * The meta object literal for the '<em><b>Is Sub Package Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__IS_SUB_PACKAGE_OF = eINSTANCE.getPackage_IsSubPackageOf();

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
		 * The meta object literal for the '<em><b>Is Multilingual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_MULTILINGUAL = eINSTANCE.getAttribute_IsMultilingual();

		/**
		 * The meta object literal for the '<em><b>Has Instance Value Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__HAS_INSTANCE_VALUE_SETS = eINSTANCE.getAttribute_HasInstanceValueSets();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_OF_TYPE = eINSTANCE.getAttribute_IsOfType();

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
		 * The meta object literal for the '<em><b>Is Whole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMI_ASSOCIATION__IS_WHOLE = eINSTANCE.getSemiAssociation_IsWhole();

		/**
		 * The meta object literal for the '<em><b>Is Strong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMI_ASSOCIATION__IS_STRONG = eINSTANCE.getSemiAssociation_IsStrong();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__ASSIGNED_TO = eINSTANCE.getSemiAssociation_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__OWNER = eINSTANCE.getSemiAssociation_Owner();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__REFERS_TO = eINSTANCE.getSemiAssociation_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Is Inverse Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__IS_INVERSE_OF = eINSTANCE.getSemiAssociation_IsInverseOf();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__INVERSE = eINSTANCE.getSemiAssociation_Inverse();

		/**
		 * The meta object literal for the '<em><b>Is Primary In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__IS_PRIMARY_IN = eINSTANCE.getSemiAssociation_IsPrimaryIn();

		/**
		 * The meta object literal for the '<em><b>Is Secondary In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__IS_SECONDARY_IN = eINSTANCE.getSemiAssociation_IsSecondaryIn();

		/**
		 * The meta object literal for the '<em><b>Has Instance Reference Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS = eINSTANCE.getSemiAssociation_HasInstanceReferenceSets();

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
		 * The meta object literal for the '<em><b>Applies To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__APPLIES_TO = eINSTANCE.getDataType_AppliesTo();

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
		 * The meta object literal for the '<em><b>Absolute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED_ITEM__ABSOLUTE_NAME = eINSTANCE.getEnumeratedItem_AbsoluteName();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED_ITEM__DEFINITION = eINSTANCE.getEnumeratedItem_Definition();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__OWNER = eINSTANCE.getEnumeratedItem_Owner();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__ASSIGNED_TO = eINSTANCE.getEnumeratedItem_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Is Super Item Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__IS_SUPER_ITEM_OF = eINSTANCE.getEnumeratedItem_IsSuperItemOf();

		/**
		 * The meta object literal for the '<em><b>Is Sub Item Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_ITEM__IS_SUB_ITEM_OF = eINSTANCE.getEnumeratedItem_IsSubItemOf();

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
