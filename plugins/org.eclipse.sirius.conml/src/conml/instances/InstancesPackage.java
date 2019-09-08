/**
 */
package conml.instances;

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
 * @see conml.instances.InstancesFactory
 * @model kind="package"
 * @generated
 */
public interface InstancesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instances";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://instances.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instances";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancesPackage eINSTANCE = conml.instances.impl.InstancesPackageImpl.init();

	/**
	 * The meta object id for the '{@link conml.instances.impl.InstanceModelElementImpl <em>Instance Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.InstanceModelElementImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getInstanceModelElement()
	 * @generated
	 */
	int INSTANCE_MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT__BELONGS_TO = conmlPackage.MODEL_ELEMENT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT__IS_TAGGED_WITH = conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT__IS_DOCUMENTED_BY = conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY;

	/**
	 * The number of structural features of the '<em>Instance Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT_FEATURE_COUNT = conmlPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT_OPERATION_COUNT = conmlPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.InstanceImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__BELONGS_TO = INSTANCE_MODEL_ELEMENT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IS_TAGGED_WITH = INSTANCE_MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IS_DOCUMENTED_BY = INSTANCE_MODEL_ELEMENT__IS_DOCUMENTED_BY;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = INSTANCE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = INSTANCE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.FacetImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 1;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__BELONGS_TO = INSTANCE_MODEL_ELEMENT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__IS_TAGGED_WITH = INSTANCE_MODEL_ELEMENT__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__IS_DOCUMENTED_BY = INSTANCE_MODEL_ELEMENT__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__CERTAINTY = INSTANCE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__IS_OWNED_BY = INSTANCE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = INSTANCE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_OPERATION_COUNT = INSTANCE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.ReferenceImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__BELONGS_TO = FACET__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_TAGGED_WITH = FACET__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_DOCUMENTED_BY = FACET__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CERTAINTY = FACET__CERTAINTY;

	/**
	 * The feature id for the '<em><b>Is Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_OWNED_BY = FACET__IS_OWNED_BY;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERS_TO = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__INVERSE = FACET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Inverse Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_INVERSE_OF = FACET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Primary In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_PRIMARY_IN = FACET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Secondary In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_SECONDARY_IN = FACET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = FACET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.InstanceModelImpl <em>Instance Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.InstanceModelImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getInstanceModel()
	 * @generated
	 */
	int INSTANCE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__NAME = conmlPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__VERSION = conmlPackage.MODEL__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__DESCRIPTION = conmlPackage.MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Has Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__HAS_TAGS = conmlPackage.MODEL__HAS_TAGS;

	/**
	 * The feature id for the '<em><b>Has Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__HAS_LANGUAGES = conmlPackage.MODEL__HAS_LANGUAGES;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__DEFAULT_LANGUAGE = conmlPackage.MODEL__DEFAULT_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Owns Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__OWNS_ELEMENTS = conmlPackage.MODEL__OWNS_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Conforms To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__CONFORMS_TO = conmlPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_FEATURE_COUNT = conmlPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_OPERATION_COUNT = conmlPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.FacetSetImpl <em>Facet Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.FacetSetImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getFacetSet()
	 * @generated
	 */
	int FACET_SET = 10;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__BELONGS_TO = INSTANCE__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__IS_TAGGED_WITH = INSTANCE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__IS_DOCUMENTED_BY = INSTANCE__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Has Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__HAS_PHASE_QUALIFIER = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__HAS_PERSPECTIVE_QUALIFIER = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__IS_COMPOSED_OF = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Facet Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Facet Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.ValueSetImpl <em>Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.ValueSetImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getValueSet()
	 * @generated
	 */
	int VALUE_SET = 5;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__BELONGS_TO = FACET_SET__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__IS_TAGGED_WITH = FACET_SET__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__IS_DOCUMENTED_BY = FACET_SET__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Has Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__HAS_PHASE_QUALIFIER = FACET_SET__HAS_PHASE_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Has Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__HAS_PERSPECTIVE_QUALIFIER = FACET_SET__HAS_PERSPECTIVE_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__IS_COMPOSED_OF = FACET_SET__IS_COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Is An Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__IS_AN_INSTANCE_OF = FACET_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__OWNER = FACET_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_FEATURE_COUNT = FACET_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_OPERATION_COUNT = FACET_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.ReferenceSetImpl <em>Reference Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.ReferenceSetImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getReferenceSet()
	 * @generated
	 */
	int REFERENCE_SET = 6;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__BELONGS_TO = FACET_SET__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__IS_TAGGED_WITH = FACET_SET__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__IS_DOCUMENTED_BY = FACET_SET__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Has Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__HAS_PHASE_QUALIFIER = FACET_SET__HAS_PHASE_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Has Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__HAS_PERSPECTIVE_QUALIFIER = FACET_SET__HAS_PERSPECTIVE_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Is Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__IS_COMPOSED_OF = FACET_SET__IS_COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Is An Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__IS_AN_INSTANCE_OF = FACET_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__OWNER = FACET_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET_FEATURE_COUNT = FACET_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET_OPERATION_COUNT = FACET_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.ObjectImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__BELONGS_TO = INSTANCE__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_TAGGED_WITH = INSTANCE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_DOCUMENTED_BY = INSTANCE__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IDENTIFIER = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CERTAINTY = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DOCUMENTS = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_INSTANCE_OF = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owns Value Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OWNS_VALUE_SETS = INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owns Reference Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OWNS_REFERENCE_SETS = INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Opposite In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_OPPOSITE_IN = INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Phase Qualifier Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_PHASE_QUALIFIER_OF = INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Persepective Qualifier Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF = INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Temporal Existential Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER = INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Temporal Existence Qualifer Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF = INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subjectve Existental Qualifer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER = INSTANCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Subjectve Existence Qualifer Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF = INSTANCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.LinkImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BELONGS_TO = INSTANCE__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IS_TAGGED_WITH = INSTANCE__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IS_DOCUMENTED_BY = INSTANCE__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Is Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IS_INSTANCE_OF = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Primary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HAS_PRIMARY = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Secondary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HAS_SECONDARY = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.ValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 9;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__BELONGS_TO = FACET__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Is Tagged With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__IS_TAGGED_WITH = FACET__IS_TAGGED_WITH;

	/**
	 * The feature id for the '<em><b>Is Documented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__IS_DOCUMENTED_BY = FACET__IS_DOCUMENTED_BY;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CERTAINTY = FACET__CERTAINTY;

	/**
	 * The feature id for the '<em><b>Is Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__IS_OWNED_BY = FACET__IS_OWNED_BY;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CONTENTS = FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.DegreeOfCertainty <em>Degree Of Certainty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.DegreeOfCertainty
	 * @see conml.instances.impl.InstancesPackageImpl#getDegreeOfCertainty()
	 * @generated
	 */
	int DEGREE_OF_CERTAINTY = 11;


	/**
	 * Returns the meta object for class '{@link conml.instances.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see conml.instances.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for class '{@link conml.instances.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see conml.instances.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.Facet#getCertainty <em>Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certainty</em>'.
	 * @see conml.instances.Facet#getCertainty()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Certainty();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Facet#getIsOwnedBy <em>Is Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Owned By</em>'.
	 * @see conml.instances.Facet#getIsOwnedBy()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_IsOwnedBy();

	/**
	 * Returns the meta object for class '{@link conml.instances.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see conml.instances.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see conml.instances.Reference#getRefersTo()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_RefersTo();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse</em>'.
	 * @see conml.instances.Reference#getInverse()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Inverse();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getIsInverseOf <em>Is Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Inverse Of</em>'.
	 * @see conml.instances.Reference#getIsInverseOf()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_IsInverseOf();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getIsPrimaryIn <em>Is Primary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Primary In</em>'.
	 * @see conml.instances.Reference#getIsPrimaryIn()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_IsPrimaryIn();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getIsSecondaryIn <em>Is Secondary In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Secondary In</em>'.
	 * @see conml.instances.Reference#getIsSecondaryIn()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_IsSecondaryIn();

	/**
	 * Returns the meta object for class '{@link conml.instances.InstanceModelElement <em>Instance Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Model Element</em>'.
	 * @see conml.instances.InstanceModelElement
	 * @generated
	 */
	EClass getInstanceModelElement();

	/**
	 * Returns the meta object for class '{@link conml.instances.InstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Model</em>'.
	 * @see conml.instances.InstanceModel
	 * @generated
	 */
	EClass getInstanceModel();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.InstanceModel#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conforms To</em>'.
	 * @see conml.instances.InstanceModel#getConformsTo()
	 * @see #getInstanceModel()
	 * @generated
	 */
	EReference getInstanceModel_ConformsTo();

	/**
	 * Returns the meta object for class '{@link conml.instances.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set</em>'.
	 * @see conml.instances.ValueSet
	 * @generated
	 */
	EClass getValueSet();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.ValueSet#getIsAnInstanceOf <em>Is An Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is An Instance Of</em>'.
	 * @see conml.instances.ValueSet#getIsAnInstanceOf()
	 * @see #getValueSet()
	 * @generated
	 */
	EReference getValueSet_IsAnInstanceOf();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.ValueSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see conml.instances.ValueSet#getOwner()
	 * @see #getValueSet()
	 * @generated
	 */
	EReference getValueSet_Owner();

	/**
	 * Returns the meta object for class '{@link conml.instances.ReferenceSet <em>Reference Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Set</em>'.
	 * @see conml.instances.ReferenceSet
	 * @generated
	 */
	EClass getReferenceSet();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.ReferenceSet#getIsAnInstanceOf <em>Is An Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is An Instance Of</em>'.
	 * @see conml.instances.ReferenceSet#getIsAnInstanceOf()
	 * @see #getReferenceSet()
	 * @generated
	 */
	EReference getReferenceSet_IsAnInstanceOf();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see conml.instances.ReferenceSet#getOwner()
	 * @see #getReferenceSet()
	 * @generated
	 */
	EReference getReferenceSet_Owner();

	/**
	 * Returns the meta object for class '{@link conml.instances.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see conml.instances.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.Object#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see conml.instances.Object#getIdentifier()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.Object#getCertainty <em>Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certainty</em>'.
	 * @see conml.instances.Object#getCertainty()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Certainty();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see conml.instances.Object#getDocuments()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Documents();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Object#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see conml.instances.Object#getIsInstanceOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsInstanceOf();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getOwnsValueSets <em>Owns Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns Value Sets</em>'.
	 * @see conml.instances.Object#getOwnsValueSets()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_OwnsValueSets();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getOwnsReferenceSets <em>Owns Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns Reference Sets</em>'.
	 * @see conml.instances.Object#getOwnsReferenceSets()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_OwnsReferenceSets();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getIsOppositeIn <em>Is Opposite In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Opposite In</em>'.
	 * @see conml.instances.Object#getIsOppositeIn()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsOppositeIn();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getIsPhaseQualifierOf <em>Is Phase Qualifier Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Phase Qualifier Of</em>'.
	 * @see conml.instances.Object#getIsPhaseQualifierOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsPhaseQualifierOf();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getIsPersepectiveQualifierOf <em>Is Persepective Qualifier Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Persepective Qualifier Of</em>'.
	 * @see conml.instances.Object#getIsPersepectiveQualifierOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsPersepectiveQualifierOf();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Object#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temporal Existential Qualifier</em>'.
	 * @see conml.instances.Object#getTemporalExistentialQualifier()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_TemporalExistentialQualifier();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getIsTemporalExistenceQualiferOf <em>Is Temporal Existence Qualifer Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Temporal Existence Qualifer Of</em>'.
	 * @see conml.instances.Object#getIsTemporalExistenceQualiferOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsTemporalExistenceQualiferOf();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Object#getSubjectveExistentalQualifer <em>Subjectve Existental Qualifer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subjectve Existental Qualifer</em>'.
	 * @see conml.instances.Object#getSubjectveExistentalQualifer()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_SubjectveExistentalQualifer();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getIsSubjectveExistenceQualiferOf <em>Is Subjectve Existence Qualifer Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Subjectve Existence Qualifer Of</em>'.
	 * @see conml.instances.Object#getIsSubjectveExistenceQualiferOf()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsSubjectveExistenceQualiferOf();

	/**
	 * Returns the meta object for class '{@link conml.instances.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see conml.instances.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Link#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Instance Of</em>'.
	 * @see conml.instances.Link#getIsInstanceOf()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_IsInstanceOf();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Link#getHasPrimary <em>Has Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Primary</em>'.
	 * @see conml.instances.Link#getHasPrimary()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_HasPrimary();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Link#getHasSecondary <em>Has Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Secondary</em>'.
	 * @see conml.instances.Link#getHasSecondary()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_HasSecondary();

	/**
	 * Returns the meta object for class '{@link conml.instances.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see conml.instances.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.Value#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see conml.instances.Value#getContents()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Contents();

	/**
	 * Returns the meta object for class '{@link conml.instances.FacetSet <em>Facet Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Set</em>'.
	 * @see conml.instances.FacetSet
	 * @generated
	 */
	EClass getFacetSet();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.FacetSet#getHasPhaseQualifier <em>Has Phase Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Phase Qualifier</em>'.
	 * @see conml.instances.FacetSet#getHasPhaseQualifier()
	 * @see #getFacetSet()
	 * @generated
	 */
	EReference getFacetSet_HasPhaseQualifier();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.FacetSet#getHasPerspectiveQualifier <em>Has Perspective Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Perspective Qualifier</em>'.
	 * @see conml.instances.FacetSet#getHasPerspectiveQualifier()
	 * @see #getFacetSet()
	 * @generated
	 */
	EReference getFacetSet_HasPerspectiveQualifier();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.FacetSet#getIsComposedOf <em>Is Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Composed Of</em>'.
	 * @see conml.instances.FacetSet#getIsComposedOf()
	 * @see #getFacetSet()
	 * @generated
	 */
	EReference getFacetSet_IsComposedOf();

	/**
	 * Returns the meta object for enum '{@link conml.instances.DegreeOfCertainty <em>Degree Of Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Degree Of Certainty</em>'.
	 * @see conml.instances.DegreeOfCertainty
	 * @generated
	 */
	EEnum getDegreeOfCertainty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstancesFactory getInstancesFactory();

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
		 * The meta object literal for the '{@link conml.instances.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.InstanceImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.FacetImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '<em><b>Certainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACET__CERTAINTY = eINSTANCE.getFacet_Certainty();

		/**
		 * The meta object literal for the '<em><b>Is Owned By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__IS_OWNED_BY = eINSTANCE.getFacet_IsOwnedBy();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.ReferenceImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERS_TO = eINSTANCE.getReference_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__INVERSE = eINSTANCE.getReference_Inverse();

		/**
		 * The meta object literal for the '<em><b>Is Inverse Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IS_INVERSE_OF = eINSTANCE.getReference_IsInverseOf();

		/**
		 * The meta object literal for the '<em><b>Is Primary In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IS_PRIMARY_IN = eINSTANCE.getReference_IsPrimaryIn();

		/**
		 * The meta object literal for the '<em><b>Is Secondary In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IS_SECONDARY_IN = eINSTANCE.getReference_IsSecondaryIn();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.InstanceModelElementImpl <em>Instance Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.InstanceModelElementImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getInstanceModelElement()
		 * @generated
		 */
		EClass INSTANCE_MODEL_ELEMENT = eINSTANCE.getInstanceModelElement();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.InstanceModelImpl <em>Instance Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.InstanceModelImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getInstanceModel()
		 * @generated
		 */
		EClass INSTANCE_MODEL = eINSTANCE.getInstanceModel();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODEL__CONFORMS_TO = eINSTANCE.getInstanceModel_ConformsTo();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.ValueSetImpl <em>Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.ValueSetImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getValueSet()
		 * @generated
		 */
		EClass VALUE_SET = eINSTANCE.getValueSet();

		/**
		 * The meta object literal for the '<em><b>Is An Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET__IS_AN_INSTANCE_OF = eINSTANCE.getValueSet_IsAnInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET__OWNER = eINSTANCE.getValueSet_Owner();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.ReferenceSetImpl <em>Reference Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.ReferenceSetImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getReferenceSet()
		 * @generated
		 */
		EClass REFERENCE_SET = eINSTANCE.getReferenceSet();

		/**
		 * The meta object literal for the '<em><b>Is An Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SET__IS_AN_INSTANCE_OF = eINSTANCE.getReferenceSet_IsAnInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SET__OWNER = eINSTANCE.getReferenceSet_Owner();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.ObjectImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__IDENTIFIER = eINSTANCE.getObject_Identifier();

		/**
		 * The meta object literal for the '<em><b>Certainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__CERTAINTY = eINSTANCE.getObject_Certainty();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__DOCUMENTS = eINSTANCE.getObject_Documents();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_INSTANCE_OF = eINSTANCE.getObject_IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Owns Value Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OWNS_VALUE_SETS = eINSTANCE.getObject_OwnsValueSets();

		/**
		 * The meta object literal for the '<em><b>Owns Reference Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OWNS_REFERENCE_SETS = eINSTANCE.getObject_OwnsReferenceSets();

		/**
		 * The meta object literal for the '<em><b>Is Opposite In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_OPPOSITE_IN = eINSTANCE.getObject_IsOppositeIn();

		/**
		 * The meta object literal for the '<em><b>Is Phase Qualifier Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_PHASE_QUALIFIER_OF = eINSTANCE.getObject_IsPhaseQualifierOf();

		/**
		 * The meta object literal for the '<em><b>Is Persepective Qualifier Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF = eINSTANCE.getObject_IsPersepectiveQualifierOf();

		/**
		 * The meta object literal for the '<em><b>Temporal Existential Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER = eINSTANCE.getObject_TemporalExistentialQualifier();

		/**
		 * The meta object literal for the '<em><b>Is Temporal Existence Qualifer Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF = eINSTANCE.getObject_IsTemporalExistenceQualiferOf();

		/**
		 * The meta object literal for the '<em><b>Subjectve Existental Qualifer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER = eINSTANCE.getObject_SubjectveExistentalQualifer();

		/**
		 * The meta object literal for the '<em><b>Is Subjectve Existence Qualifer Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF = eINSTANCE.getObject_IsSubjectveExistenceQualiferOf();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.LinkImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__IS_INSTANCE_OF = eINSTANCE.getLink_IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Has Primary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__HAS_PRIMARY = eINSTANCE.getLink_HasPrimary();

		/**
		 * The meta object literal for the '<em><b>Has Secondary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__HAS_SECONDARY = eINSTANCE.getLink_HasSecondary();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.ValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__CONTENTS = eINSTANCE.getValue_Contents();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.FacetSetImpl <em>Facet Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.FacetSetImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getFacetSet()
		 * @generated
		 */
		EClass FACET_SET = eINSTANCE.getFacetSet();

		/**
		 * The meta object literal for the '<em><b>Has Phase Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_SET__HAS_PHASE_QUALIFIER = eINSTANCE.getFacetSet_HasPhaseQualifier();

		/**
		 * The meta object literal for the '<em><b>Has Perspective Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_SET__HAS_PERSPECTIVE_QUALIFIER = eINSTANCE.getFacetSet_HasPerspectiveQualifier();

		/**
		 * The meta object literal for the '<em><b>Is Composed Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_SET__IS_COMPOSED_OF = eINSTANCE.getFacetSet_IsComposedOf();

		/**
		 * The meta object literal for the '{@link conml.instances.DegreeOfCertainty <em>Degree Of Certainty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.DegreeOfCertainty
		 * @see conml.instances.impl.InstancesPackageImpl#getDegreeOfCertainty()
		 * @generated
		 */
		EEnum DEGREE_OF_CERTAINTY = eINSTANCE.getDegreeOfCertainty();

	}

} //InstancesPackage