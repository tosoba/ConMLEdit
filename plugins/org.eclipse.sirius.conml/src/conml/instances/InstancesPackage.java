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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT__TAGS = conmlPackage.MODEL_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT__META_INFORMATION_OBJECTS = conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL = conmlPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Instance Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_ELEMENT_FEATURE_COUNT = conmlPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TAGS = INSTANCE_MODEL_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__META_INFORMATION_OBJECTS = INSTANCE_MODEL_ELEMENT__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__INSTANCE_MODEL = INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__TAGS = INSTANCE_MODEL_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__META_INFORMATION_OBJECTS = INSTANCE_MODEL_ELEMENT__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__INSTANCE_MODEL = INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__CERTAINTY = INSTANCE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = INSTANCE_MODEL_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TAGS = FACET__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__META_INFORMATION_OBJECTS = FACET__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__INSTANCE_MODEL = FACET__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CERTAINTY = FACET__CERTAINTY;

	/**
	 * The feature id for the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERRED_OBJECT = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PRIMARY_LINK = FACET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secondary Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SECONDARY_LINK = FACET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner Reference Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OWNER_REFERENCE_SET = FACET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inverse Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__INVERSE_REFERENCE = FACET_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__DESCRIPTION = conmlPackage.MODEL__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INSTANCE_MODEL__VERSION = conmlPackage.MODEL__VERSION;

	/**
	 * The feature id for the '<em><b>Default Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL__DEFAULT_LANGUAGE = conmlPackage.MODEL__DEFAULT_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INSTANCE_MODEL__TAGS = conmlPackage.MODEL__TAGS;

  /**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INSTANCE_MODEL__LANGUAGES = conmlPackage.MODEL__LANGUAGES;

  /**
	 * The feature id for the '<em><b>Conformed Type Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INSTANCE_MODEL__CONFORMED_TYPE_MODELS = conmlPackage.MODEL_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INSTANCE_MODEL__ELEMENTS = conmlPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_MODEL_FEATURE_COUNT = conmlPackage.MODEL_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__TAGS = INSTANCE__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__META_INFORMATION_OBJECTS = INSTANCE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__INSTANCE_MODEL = INSTANCE__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Translation Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__TRANSLATION_QUALIFIERS = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_SET__PERSPECTIVE_QUALIFIER = INSTANCE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FACET_SET__PHASE_QUALIFIER = INSTANCE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__TAGS = FACET_SET__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__META_INFORMATION_OBJECTS = FACET_SET__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__INSTANCE_MODEL = FACET_SET__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Translation Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__TRANSLATION_QUALIFIERS = FACET_SET__TRANSLATION_QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__PERSPECTIVE_QUALIFIER = FACET_SET__PERSPECTIVE_QUALIFIER;

  /**
	 * The feature id for the '<em><b>Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_SET__PHASE_QUALIFIER = FACET_SET__PHASE_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Instanced Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__INSTANCED_ATTRIBUTE = FACET_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__VALUES = FACET_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumerated Item Value Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__ENUMERATED_ITEM_VALUE_DISPLAY = FACET_SET_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__OWNER = FACET_SET_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_FEATURE_COUNT = FACET_SET_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__TAGS = FACET_SET__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__META_INFORMATION_OBJECTS = FACET_SET__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__INSTANCE_MODEL = FACET_SET__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Translation Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__TRANSLATION_QUALIFIERS = FACET_SET__TRANSLATION_QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Perspective Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__PERSPECTIVE_QUALIFIER = FACET_SET__PERSPECTIVE_QUALIFIER;

  /**
	 * The feature id for the '<em><b>Phase Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REFERENCE_SET__PHASE_QUALIFIER = FACET_SET__PHASE_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Instanced Semi Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION = FACET_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__REFERENCES = FACET_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET__OWNER = FACET_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SET_FEATURE_COUNT = FACET_SET_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TAGS = INSTANCE__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__META_INFORMATION_OBJECTS = INSTANCE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INSTANCE_MODEL = INSTANCE__INSTANCE_MODEL;

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
	 * The feature id for the '<em><b>Instanced Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INSTANCED_CLASS = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Referred By References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_REFERRED_BY_REFERENCES = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__REFERENCE_SETS = INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documented Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DOCUMENTED_ELEMENTS = INSTANCE_FEATURE_COUNT + 5;

        /**
	 * The feature id for the '<em><b>Documenting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DOCUMENTING = INSTANCE_FEATURE_COUNT + 6;

                /**
	 * The feature id for the '<em><b>Subjective Existential Qualifer</b></em>' reference.
	 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
                int OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER = INSTANCE_FEATURE_COUNT + 7;

                /**
	 * The feature id for the '<em><b>Temporal Existential Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
                int OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER = INSTANCE_FEATURE_COUNT + 8;

                                /**
	 * The feature id for the '<em><b>Value Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
                                 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
                                int OBJECT__VALUE_SETS = INSTANCE_FEATURE_COUNT + 9;

                /**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 10;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TAGS = INSTANCE__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__META_INFORMATION_OBJECTS = INSTANCE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INSTANCE_MODEL = INSTANCE__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Instanced Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INSTANCED_ASSOCIATION = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PRIMARY_REFERENCE = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secondary Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SECONDARY_REFERENCE = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COMPACT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TAGS = FACET__TAGS;

	/**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__META_INFORMATION_OBJECTS = FACET__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__INSTANCE_MODEL = FACET__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CERTAINTY = FACET__CERTAINTY;

	/**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OWNER_VALUE_SET = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__UNKNOWN = FACET_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conml.instances.impl.TextValueImpl <em>Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.TextValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getTextValue()
	 * @generated
	 */
	int TEXT_VALUE = 11;

  /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__TAGS = VALUE__TAGS;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__META_INFORMATION_OBJECTS = VALUE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__INSTANCE_MODEL = VALUE__INSTANCE_MODEL;

  /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__CERTAINTY = VALUE__CERTAINTY;

  /**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__OWNER_VALUE_SET = VALUE__OWNER_VALUE_SET;

  /**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__UNKNOWN = VALUE__UNKNOWN;

  /**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__CONTENT = VALUE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link conml.instances.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.BooleanValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 12;

  /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__TAGS = VALUE__TAGS;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__META_INFORMATION_OBJECTS = VALUE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__INSTANCE_MODEL = VALUE__INSTANCE_MODEL;

  /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__CERTAINTY = VALUE__CERTAINTY;

  /**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__OWNER_VALUE_SET = VALUE__OWNER_VALUE_SET;

  /**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__UNKNOWN = VALUE__UNKNOWN;

  /**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__CONTENT = VALUE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link conml.instances.impl.TimeValueImpl <em>Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.TimeValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getTimeValue()
	 * @generated
	 */
	int TIME_VALUE = 13;

  /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__TAGS = VALUE__TAGS;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__META_INFORMATION_OBJECTS = VALUE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__INSTANCE_MODEL = VALUE__INSTANCE_MODEL;

  /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__CERTAINTY = VALUE__CERTAINTY;

  /**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__OWNER_VALUE_SET = VALUE__OWNER_VALUE_SET;

  /**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__UNKNOWN = VALUE__UNKNOWN;

  /**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__CONTENT = VALUE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link conml.instances.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.NumberValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 14;

  /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__TAGS = VALUE__TAGS;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__META_INFORMATION_OBJECTS = VALUE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__INSTANCE_MODEL = VALUE__INSTANCE_MODEL;

  /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__CERTAINTY = VALUE__CERTAINTY;

  /**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__OWNER_VALUE_SET = VALUE__OWNER_VALUE_SET;

  /**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__UNKNOWN = VALUE__UNKNOWN;

  /**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__CONTENT = VALUE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link conml.instances.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.DataValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 15;

  /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__TAGS = VALUE__TAGS;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__META_INFORMATION_OBJECTS = VALUE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__INSTANCE_MODEL = VALUE__INSTANCE_MODEL;

  /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__CERTAINTY = VALUE__CERTAINTY;

  /**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__OWNER_VALUE_SET = VALUE__OWNER_VALUE_SET;

  /**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__UNKNOWN = VALUE__UNKNOWN;

  /**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__CONTENT = VALUE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link conml.instances.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.EnumValueImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 16;

  /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__TAGS = VALUE__TAGS;

  /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__META_INFORMATION_OBJECTS = VALUE__META_INFORMATION_OBJECTS;

  /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__INSTANCE_MODEL = VALUE__INSTANCE_MODEL;

  /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__CERTAINTY = VALUE__CERTAINTY;

  /**
	 * The feature id for the '<em><b>Owner Value Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__OWNER_VALUE_SET = VALUE__OWNER_VALUE_SET;

  /**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__UNKNOWN = VALUE__UNKNOWN;

  /**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__CONTENT = VALUE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link conml.instances.impl.QualifierObjectImpl <em>Qualifier Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.impl.QualifierObjectImpl
	 * @see conml.instances.impl.InstancesPackageImpl#getQualifierObject()
	 * @generated
	 */
	int QUALIFIER_OBJECT = 17;

    /**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__TAGS = OBJECT__TAGS;

    /**
	 * The feature id for the '<em><b>Meta Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__META_INFORMATION_OBJECTS = OBJECT__META_INFORMATION_OBJECTS;

    /**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__INSTANCE_MODEL = OBJECT__INSTANCE_MODEL;

    /**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__IDENTIFIER = OBJECT__IDENTIFIER;

    /**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__CERTAINTY = OBJECT__CERTAINTY;

    /**
	 * The feature id for the '<em><b>Instanced Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__INSTANCED_CLASS = OBJECT__INSTANCED_CLASS;

    /**
	 * The feature id for the '<em><b>Is Referred By References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__IS_REFERRED_BY_REFERENCES = OBJECT__IS_REFERRED_BY_REFERENCES;

    /**
	 * The feature id for the '<em><b>Reference Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__REFERENCE_SETS = OBJECT__REFERENCE_SETS;

    /**
	 * The feature id for the '<em><b>Documented Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__DOCUMENTED_ELEMENTS = OBJECT__DOCUMENTED_ELEMENTS;

    /**
	 * The feature id for the '<em><b>Documenting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__DOCUMENTING = OBJECT__DOCUMENTING;

    /**
	 * The feature id for the '<em><b>Subjective Existential Qualifer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER = OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER;

    /**
	 * The feature id for the '<em><b>Temporal Existential Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER = OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER;

        /**
	 * The feature id for the '<em><b>Value Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int QUALIFIER_OBJECT__VALUE_SETS = OBJECT__VALUE_SETS;

    /**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__QUALIFIER = OBJECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Subjective Qualified Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS = OBJECT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Temporal Qualified Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS = OBJECT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Perspective Qualified Facet Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS = OBJECT_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Phase Qualified Facet Sets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS = OBJECT_FEATURE_COUNT + 4;

    /**
	 * The number of structural features of the '<em>Qualifier Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

    /**
	 * The number of operations of the '<em>Qualifier Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link conml.instances.DegreeOfCertainty <em>Degree Of Certainty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.DegreeOfCertainty
	 * @see conml.instances.impl.InstancesPackageImpl#getDegreeOfCertainty()
	 * @generated
	 */
	int DEGREE_OF_CERTAINTY = 18;


	/**
	 * The meta object id for the '{@link conml.instances.EnumeratedItemValueDisplay <em>Enumerated Item Value Display</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conml.instances.EnumeratedItemValueDisplay
	 * @see conml.instances.impl.InstancesPackageImpl#getEnumeratedItemValueDisplay()
	 * @generated
	 */
	int ENUMERATED_ITEM_VALUE_DISPLAY = 19;


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
	 * Returns the meta object for class '{@link conml.instances.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see conml.instances.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getReferredObject <em>Referred Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Object</em>'.
	 * @see conml.instances.Reference#getReferredObject()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ReferredObject();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getPrimaryLink <em>Primary Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Link</em>'.
	 * @see conml.instances.Reference#getPrimaryLink()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_PrimaryLink();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getSecondaryLink <em>Secondary Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Link</em>'.
	 * @see conml.instances.Reference#getSecondaryLink()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_SecondaryLink();

	/**
	 * Returns the meta object for the container reference '{@link conml.instances.Reference#getOwnerReferenceSet <em>Owner Reference Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Reference Set</em>'.
	 * @see conml.instances.Reference#getOwnerReferenceSet()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_OwnerReferenceSet();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Reference#getInverseReference <em>Inverse Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse Reference</em>'.
	 * @see conml.instances.Reference#getInverseReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_InverseReference();

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
	 * Returns the meta object for the reference '{@link conml.instances.InstanceModelElement#getInstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Model</em>'.
	 * @see conml.instances.InstanceModelElement#getInstanceModel()
	 * @see #getInstanceModelElement()
	 * @generated
	 */
	EReference getInstanceModelElement_InstanceModel();

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
	 * Returns the meta object for the reference list '{@link conml.instances.InstanceModel#getConformedTypeModels <em>Conformed Type Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conformed Type Models</em>'.
	 * @see conml.instances.InstanceModel#getConformedTypeModels()
	 * @see #getInstanceModel()
	 * @generated
	 */
	EReference getInstanceModel_ConformedTypeModels();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.InstanceModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see conml.instances.InstanceModel#getElements()
	 * @see #getInstanceModel()
	 * @generated
	 */
	EReference getInstanceModel_Elements();

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
	 * Returns the meta object for the reference '{@link conml.instances.ValueSet#getInstancedAttribute <em>Instanced Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instanced Attribute</em>'.
	 * @see conml.instances.ValueSet#getInstancedAttribute()
	 * @see #getValueSet()
	 * @generated
	 */
	EReference getValueSet_InstancedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.instances.ValueSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see conml.instances.ValueSet#getValues()
	 * @see #getValueSet()
	 * @generated
	 */
	EReference getValueSet_Values();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.ValueSet#getEnumeratedItemValueDisplay <em>Enumerated Item Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated Item Value Display</em>'.
	 * @see conml.instances.ValueSet#getEnumeratedItemValueDisplay()
	 * @see #getValueSet()
	 * @generated
	 */
	EAttribute getValueSet_EnumeratedItemValueDisplay();

  /**
	 * Returns the meta object for the container reference '{@link conml.instances.ValueSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
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
	 * Returns the meta object for the reference '{@link conml.instances.ReferenceSet#getInstancedSemiAssociation <em>Instanced Semi Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instanced Semi Association</em>'.
	 * @see conml.instances.ReferenceSet#getInstancedSemiAssociation()
	 * @see #getReferenceSet()
	 * @generated
	 */
	EReference getReferenceSet_InstancedSemiAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.instances.ReferenceSet#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see conml.instances.ReferenceSet#getReferences()
	 * @see #getReferenceSet()
	 * @generated
	 */
	EReference getReferenceSet_References();

	/**
	 * Returns the meta object for the container reference '{@link conml.instances.ReferenceSet#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
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
	 * Returns the meta object for the reference '{@link conml.instances.Object#getInstancedClass <em>Instanced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instanced Class</em>'.
	 * @see conml.instances.Object#getInstancedClass()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_InstancedClass();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getIsReferredByReferences <em>Is Referred By References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Referred By References</em>'.
	 * @see conml.instances.Object#getIsReferredByReferences()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_IsReferredByReferences();

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
	 * Returns the meta object for the reference '{@link conml.instances.Object#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subjective Existential Qualifer</em>'.
	 * @see conml.instances.Object#getSubjectiveExistentialQualifer()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_SubjectiveExistentialQualifer();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.instances.Object#getValueSets <em>Value Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sets</em>'.
	 * @see conml.instances.Object#getValueSets()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ValueSets();

	/**
	 * Returns the meta object for the containment reference list '{@link conml.instances.Object#getReferenceSets <em>Reference Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Sets</em>'.
	 * @see conml.instances.Object#getReferenceSets()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ReferenceSets();

	/**
	 * Returns the meta object for the reference list '{@link conml.instances.Object#getDocumentedElements <em>Documented Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documented Elements</em>'.
	 * @see conml.instances.Object#getDocumentedElements()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_DocumentedElements();

        /**
	 * Returns the meta object for the attribute '{@link conml.instances.Object#isDocumenting <em>Documenting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documenting</em>'.
	 * @see conml.instances.Object#isDocumenting()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Documenting();

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
	 * Returns the meta object for the reference '{@link conml.instances.Link#getInstancedAssociation <em>Instanced Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instanced Association</em>'.
	 * @see conml.instances.Link#getInstancedAssociation()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_InstancedAssociation();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Link#getPrimaryReference <em>Primary Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Reference</em>'.
	 * @see conml.instances.Link#getPrimaryReference()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_PrimaryReference();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.Link#getSecondaryReference <em>Secondary Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Reference</em>'.
	 * @see conml.instances.Link#getSecondaryReference()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_SecondaryReference();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.Link#isCompact <em>Compact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compact</em>'.
	 * @see conml.instances.Link#isCompact()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Compact();

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
	 * Returns the meta object for the container reference '{@link conml.instances.Value#getOwnerValueSet <em>Owner Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Value Set</em>'.
	 * @see conml.instances.Value#getOwnerValueSet()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_OwnerValueSet();

	/**
	 * Returns the meta object for the attribute '{@link conml.instances.Value#isUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown</em>'.
	 * @see conml.instances.Value#isUnknown()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Unknown();

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
	 * Returns the meta object for the reference list '{@link conml.instances.FacetSet#getTranslationQualifiers <em>Translation Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Translation Qualifiers</em>'.
	 * @see conml.instances.FacetSet#getTranslationQualifiers()
	 * @see #getFacetSet()
	 * @generated
	 */
	EReference getFacetSet_TranslationQualifiers();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.FacetSet#getPhaseQualifier <em>Phase Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Qualifier</em>'.
	 * @see conml.instances.FacetSet#getPhaseQualifier()
	 * @see #getFacetSet()
	 * @generated
	 */
	EReference getFacetSet_PhaseQualifier();

	/**
	 * Returns the meta object for the reference '{@link conml.instances.FacetSet#getPerspectiveQualifier <em>Perspective Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perspective Qualifier</em>'.
	 * @see conml.instances.FacetSet#getPerspectiveQualifier()
	 * @see #getFacetSet()
	 * @generated
	 */
	EReference getFacetSet_PerspectiveQualifier();

	/**
	 * Returns the meta object for class '{@link conml.instances.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Value</em>'.
	 * @see conml.instances.TextValue
	 * @generated
	 */
	EClass getTextValue();

  /**
	 * Returns the meta object for the attribute '{@link conml.instances.TextValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see conml.instances.TextValue#getContent()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_Content();

  /**
	 * Returns the meta object for class '{@link conml.instances.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see conml.instances.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

  /**
	 * Returns the meta object for the attribute '{@link conml.instances.BooleanValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see conml.instances.BooleanValue#getContent()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Content();

  /**
	 * Returns the meta object for class '{@link conml.instances.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value</em>'.
	 * @see conml.instances.TimeValue
	 * @generated
	 */
	EClass getTimeValue();

  /**
	 * Returns the meta object for the attribute '{@link conml.instances.TimeValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see conml.instances.TimeValue#getContent()
	 * @see #getTimeValue()
	 * @generated
	 */
	EAttribute getTimeValue_Content();

    /**
	 * Returns the meta object for class '{@link conml.instances.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see conml.instances.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

  /**
	 * Returns the meta object for the attribute '{@link conml.instances.NumberValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see conml.instances.NumberValue#getContent()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_Content();

    /**
	 * Returns the meta object for class '{@link conml.instances.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see conml.instances.DataValue
	 * @generated
	 */
	EClass getDataValue();

  /**
	 * Returns the meta object for the attribute '{@link conml.instances.DataValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see conml.instances.DataValue#getContent()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Content();

    /**
	 * Returns the meta object for class '{@link conml.instances.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see conml.instances.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

  /**
	 * Returns the meta object for the reference '{@link conml.instances.EnumValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see conml.instances.EnumValue#getContent()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Content();

    /**
	 * Returns the meta object for class '{@link conml.instances.QualifierObject <em>Qualifier Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier Object</em>'.
	 * @see conml.instances.QualifierObject
	 * @generated
	 */
	EClass getQualifierObject();

    /**
	 * Returns the meta object for the attribute '{@link conml.instances.QualifierObject#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see conml.instances.QualifierObject#getQualifier()
	 * @see #getQualifierObject()
	 * @generated
	 */
	EAttribute getQualifierObject_Qualifier();

    /**
	 * Returns the meta object for the reference list '{@link conml.instances.QualifierObject#getSubjectiveQualifiedObjects <em>Subjective Qualified Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subjective Qualified Objects</em>'.
	 * @see conml.instances.QualifierObject#getSubjectiveQualifiedObjects()
	 * @see #getQualifierObject()
	 * @generated
	 */
	EReference getQualifierObject_SubjectiveQualifiedObjects();

    /**
	 * Returns the meta object for the reference list '{@link conml.instances.QualifierObject#getTemporalQualifiedObjects <em>Temporal Qualified Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Qualified Objects</em>'.
	 * @see conml.instances.QualifierObject#getTemporalQualifiedObjects()
	 * @see #getQualifierObject()
	 * @generated
	 */
	EReference getQualifierObject_TemporalQualifiedObjects();

    /**
	 * Returns the meta object for the reference list '{@link conml.instances.QualifierObject#getPerspectiveQualifiedFacetSets <em>Perspective Qualified Facet Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perspective Qualified Facet Sets</em>'.
	 * @see conml.instances.QualifierObject#getPerspectiveQualifiedFacetSets()
	 * @see #getQualifierObject()
	 * @generated
	 */
	EReference getQualifierObject_PerspectiveQualifiedFacetSets();

    /**
	 * Returns the meta object for the reference '{@link conml.instances.QualifierObject#getPhaseQualifiedFacetSets <em>Phase Qualified Facet Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Qualified Facet Sets</em>'.
	 * @see conml.instances.QualifierObject#getPhaseQualifiedFacetSets()
	 * @see #getQualifierObject()
	 * @generated
	 */
	EReference getQualifierObject_PhaseQualifiedFacetSets();

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
	 * Returns the meta object for enum '{@link conml.instances.EnumeratedItemValueDisplay <em>Enumerated Item Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enumerated Item Value Display</em>'.
	 * @see conml.instances.EnumeratedItemValueDisplay
	 * @generated
	 */
	EEnum getEnumeratedItemValueDisplay();

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
		 * The meta object literal for the '{@link conml.instances.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.ReferenceImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Referred Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERRED_OBJECT = eINSTANCE.getReference_ReferredObject();

		/**
		 * The meta object literal for the '<em><b>Primary Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__PRIMARY_LINK = eINSTANCE.getReference_PrimaryLink();

		/**
		 * The meta object literal for the '<em><b>Secondary Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SECONDARY_LINK = eINSTANCE.getReference_SecondaryLink();

		/**
		 * The meta object literal for the '<em><b>Owner Reference Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__OWNER_REFERENCE_SET = eINSTANCE.getReference_OwnerReferenceSet();

		/**
		 * The meta object literal for the '<em><b>Inverse Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__INVERSE_REFERENCE = eINSTANCE.getReference_InverseReference();

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
		 * The meta object literal for the '<em><b>Instance Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL = eINSTANCE.getInstanceModelElement_InstanceModel();

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
		 * The meta object literal for the '<em><b>Conformed Type Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODEL__CONFORMED_TYPE_MODELS = eINSTANCE.getInstanceModel_ConformedTypeModels();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_MODEL__ELEMENTS = eINSTANCE.getInstanceModel_Elements();

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
		 * The meta object literal for the '<em><b>Instanced Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET__INSTANCED_ATTRIBUTE = eINSTANCE.getValueSet_InstancedAttribute();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET__VALUES = eINSTANCE.getValueSet_Values();

		/**
		 * The meta object literal for the '<em><b>Enumerated Item Value Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET__ENUMERATED_ITEM_VALUE_DISPLAY = eINSTANCE.getValueSet_EnumeratedItemValueDisplay();

    /**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>Instanced Semi Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION = eINSTANCE.getReferenceSet_InstancedSemiAssociation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SET__REFERENCES = eINSTANCE.getReferenceSet_References();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>Instanced Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__INSTANCED_CLASS = eINSTANCE.getObject_InstancedClass();

		/**
		 * The meta object literal for the '<em><b>Is Referred By References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IS_REFERRED_BY_REFERENCES = eINSTANCE.getObject_IsReferredByReferences();

		/**
		 * The meta object literal for the '<em><b>Temporal Existential Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER = eINSTANCE.getObject_TemporalExistentialQualifier();

		/**
		 * The meta object literal for the '<em><b>Subjective Existential Qualifer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER = eINSTANCE.getObject_SubjectiveExistentialQualifer();

		/**
		 * The meta object literal for the '<em><b>Value Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__VALUE_SETS = eINSTANCE.getObject_ValueSets();

		/**
		 * The meta object literal for the '<em><b>Reference Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__REFERENCE_SETS = eINSTANCE.getObject_ReferenceSets();

		/**
		 * The meta object literal for the '<em><b>Documented Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__DOCUMENTED_ELEMENTS = eINSTANCE.getObject_DocumentedElements();

                /**
		 * The meta object literal for the '<em><b>Documenting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__DOCUMENTING = eINSTANCE.getObject_Documenting();

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
		 * The meta object literal for the '<em><b>Instanced Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INSTANCED_ASSOCIATION = eINSTANCE.getLink_InstancedAssociation();

		/**
		 * The meta object literal for the '<em><b>Primary Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__PRIMARY_REFERENCE = eINSTANCE.getLink_PrimaryReference();

		/**
		 * The meta object literal for the '<em><b>Secondary Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SECONDARY_REFERENCE = eINSTANCE.getLink_SecondaryReference();

		/**
		 * The meta object literal for the '<em><b>Compact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__COMPACT = eINSTANCE.getLink_Compact();

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
		 * The meta object literal for the '<em><b>Owner Value Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__OWNER_VALUE_SET = eINSTANCE.getValue_OwnerValueSet();

		/**
		 * The meta object literal for the '<em><b>Unknown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__UNKNOWN = eINSTANCE.getValue_Unknown();

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
		 * The meta object literal for the '<em><b>Translation Qualifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_SET__TRANSLATION_QUALIFIERS = eINSTANCE.getFacetSet_TranslationQualifiers();

		/**
		 * The meta object literal for the '<em><b>Phase Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_SET__PHASE_QUALIFIER = eINSTANCE.getFacetSet_PhaseQualifier();

		/**
		 * The meta object literal for the '<em><b>Perspective Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_SET__PERSPECTIVE_QUALIFIER = eINSTANCE.getFacetSet_PerspectiveQualifier();

		/**
		 * The meta object literal for the '{@link conml.instances.impl.TextValueImpl <em>Text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.TextValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getTextValue()
		 * @generated
		 */
		EClass TEXT_VALUE = eINSTANCE.getTextValue();

    /**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE__CONTENT = eINSTANCE.getTextValue_Content();

    /**
		 * The meta object literal for the '{@link conml.instances.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.BooleanValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__CONTENT = eINSTANCE.getBooleanValue_Content();

    /**
		 * The meta object literal for the '{@link conml.instances.impl.TimeValueImpl <em>Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.TimeValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getTimeValue()
		 * @generated
		 */
		EClass TIME_VALUE = eINSTANCE.getTimeValue();

    /**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE__CONTENT = eINSTANCE.getTimeValue_Content();

        /**
		 * The meta object literal for the '{@link conml.instances.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.NumberValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__CONTENT = eINSTANCE.getNumberValue_Content();

        /**
		 * The meta object literal for the '{@link conml.instances.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.DataValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

    /**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__CONTENT = eINSTANCE.getDataValue_Content();

        /**
		 * The meta object literal for the '{@link conml.instances.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.EnumValueImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

    /**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__CONTENT = eINSTANCE.getEnumValue_Content();

        /**
		 * The meta object literal for the '{@link conml.instances.impl.QualifierObjectImpl <em>Qualifier Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.impl.QualifierObjectImpl
		 * @see conml.instances.impl.InstancesPackageImpl#getQualifierObject()
		 * @generated
		 */
		EClass QUALIFIER_OBJECT = eINSTANCE.getQualifierObject();

        /**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER_OBJECT__QUALIFIER = eINSTANCE.getQualifierObject_Qualifier();

        /**
		 * The meta object literal for the '<em><b>Subjective Qualified Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS = eINSTANCE.getQualifierObject_SubjectiveQualifiedObjects();

        /**
		 * The meta object literal for the '<em><b>Temporal Qualified Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS = eINSTANCE.getQualifierObject_TemporalQualifiedObjects();

        /**
		 * The meta object literal for the '<em><b>Perspective Qualified Facet Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS = eINSTANCE.getQualifierObject_PerspectiveQualifiedFacetSets();

        /**
		 * The meta object literal for the '<em><b>Phase Qualified Facet Sets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS = eINSTANCE.getQualifierObject_PhaseQualifiedFacetSets();

                /**
		 * The meta object literal for the '{@link conml.instances.DegreeOfCertainty <em>Degree Of Certainty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.DegreeOfCertainty
		 * @see conml.instances.impl.InstancesPackageImpl#getDegreeOfCertainty()
		 * @generated
		 */
		EEnum DEGREE_OF_CERTAINTY = eINSTANCE.getDegreeOfCertainty();

    /**
		 * The meta object literal for the '{@link conml.instances.EnumeratedItemValueDisplay <em>Enumerated Item Value Display</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conml.instances.EnumeratedItemValueDisplay
		 * @see conml.instances.impl.InstancesPackageImpl#getEnumeratedItemValueDisplay()
		 * @generated
		 */
		EEnum ENUMERATED_ITEM_VALUE_DISPLAY = eINSTANCE.getEnumeratedItemValueDisplay();

	}

} //InstancesPackage
