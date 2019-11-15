/**
 */
package conml.instances.impl;

import conml.conmlPackage;

import conml.impl.conmlPackageImpl;

import conml.instances.DegreeOfCertainty;
import conml.instances.Facet;
import conml.instances.FacetSet;
import conml.instances.Instance;
import conml.instances.InstanceModel;
import conml.instances.InstanceModelElement;
import conml.instances.InstancesFactory;
import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.instances.Value;
import conml.instances.ValueSet;

import conml.types.TypesPackage;

import conml.types.impl.TypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesPackageImpl extends EPackageImpl implements InstancesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum degreeOfCertaintyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see conml.instances.InstancesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancesPackageImpl() {
		super(eNS_URI, InstancesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InstancesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancesPackage init() {
		if (isInited) return (InstancesPackage)EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInstancesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InstancesPackageImpl theInstancesPackage = registeredInstancesPackage instanceof InstancesPackageImpl ? (InstancesPackageImpl)registeredInstancesPackage : new InstancesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(conmlPackage.eNS_URI);
		conmlPackageImpl theconmlPackage = (conmlPackageImpl)(registeredPackage instanceof conmlPackageImpl ? registeredPackage : conmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancesPackage.createPackageContents();
		theconmlPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theInstancesPackage.initializePackageContents();
		theconmlPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancesPackage.eNS_URI, theInstancesPackage);
		return theInstancesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacet_Certainty() {
		return (EAttribute)facetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_ReferredObject() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_PrimaryLink() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_SecondaryLink() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_OwnerReferenceSet() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_InverseReference() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(4);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceModelElement() {
		return instanceModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceModel() {
		return instanceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceModel_ConformedTypeModels() {
		return (EReference)instanceModelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceModel_Elements() {
		return (EReference)instanceModelEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueSet() {
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueSet_InstancedAttribute() {
		return (EReference)valueSetEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueSet_Values() {
		return (EReference)valueSetEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceSet() {
		return referenceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSet_InstancedSemiAssociation() {
		return (EReference)referenceSetEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSet_References() {
		return (EReference)referenceSetEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSet_Owner() {
		return (EReference)referenceSetEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObject_Identifier() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObject_Certainty() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_InstancedClass() {
		return (EReference)objectEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_IsReferredByReferences() {
		return (EReference)objectEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_TemporalExistentialQualifier() {
		return (EReference)objectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_SubjectiveExistentialQualifer() {
		return (EReference)objectEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_ReferenceSets() {
		return (EReference)objectEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_MetaInfoInModel() {
		return (EReference)objectEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_ValueSets() {
		return (EReference)objectEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_InstancedAssociation() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_PrimaryReference() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_SecondaryReference() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Compact() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Contents() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValue_OwnerValueSet() {
		return (EReference)valueEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacetSet() {
		return facetSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_TranslationQualifiers() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_PhaseQualifier() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_PerspectiveQualifier() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDegreeOfCertainty() {
		return degreeOfCertaintyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstancesFactory getInstancesFactory() {
		return (InstancesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		instanceEClass = createEClass(INSTANCE);

		facetEClass = createEClass(FACET);
		createEAttribute(facetEClass, FACET__CERTAINTY);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REFERRED_OBJECT);
		createEReference(referenceEClass, REFERENCE__PRIMARY_LINK);
		createEReference(referenceEClass, REFERENCE__SECONDARY_LINK);
		createEReference(referenceEClass, REFERENCE__OWNER_REFERENCE_SET);
		createEReference(referenceEClass, REFERENCE__INVERSE_REFERENCE);

		instanceModelElementEClass = createEClass(INSTANCE_MODEL_ELEMENT);

		instanceModelEClass = createEClass(INSTANCE_MODEL);
		createEReference(instanceModelEClass, INSTANCE_MODEL__CONFORMED_TYPE_MODELS);
		createEReference(instanceModelEClass, INSTANCE_MODEL__ELEMENTS);

		valueSetEClass = createEClass(VALUE_SET);
		createEReference(valueSetEClass, VALUE_SET__INSTANCED_ATTRIBUTE);
		createEReference(valueSetEClass, VALUE_SET__VALUES);

		referenceSetEClass = createEClass(REFERENCE_SET);
		createEReference(referenceSetEClass, REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION);
		createEReference(referenceSetEClass, REFERENCE_SET__REFERENCES);
		createEReference(referenceSetEClass, REFERENCE_SET__OWNER);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__IDENTIFIER);
		createEAttribute(objectEClass, OBJECT__CERTAINTY);
		createEReference(objectEClass, OBJECT__INSTANCED_CLASS);
		createEReference(objectEClass, OBJECT__IS_REFERRED_BY_REFERENCES);
		createEReference(objectEClass, OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER);
		createEReference(objectEClass, OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER);
		createEReference(objectEClass, OBJECT__VALUE_SETS);
		createEReference(objectEClass, OBJECT__REFERENCE_SETS);
		createEReference(objectEClass, OBJECT__META_INFO_IN_MODEL);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__INSTANCED_ASSOCIATION);
		createEReference(linkEClass, LINK__PRIMARY_REFERENCE);
		createEReference(linkEClass, LINK__SECONDARY_REFERENCE);
		createEAttribute(linkEClass, LINK__COMPACT);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__CONTENTS);
		createEReference(valueEClass, VALUE__OWNER_VALUE_SET);

		facetSetEClass = createEClass(FACET_SET);
		createEReference(facetSetEClass, FACET_SET__TRANSLATION_QUALIFIERS);
		createEReference(facetSetEClass, FACET_SET__PHASE_QUALIFIER);
		createEReference(facetSetEClass, FACET_SET__PERSPECTIVE_QUALIFIER);

		// Create enums
		degreeOfCertaintyEEnum = createEEnum(DEGREE_OF_CERTAINTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		conmlPackage theconmlPackage = (conmlPackage)EPackage.Registry.INSTANCE.getEPackage(conmlPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instanceEClass.getESuperTypes().add(this.getInstanceModelElement());
		facetEClass.getESuperTypes().add(this.getInstanceModelElement());
		referenceEClass.getESuperTypes().add(this.getFacet());
		instanceModelElementEClass.getESuperTypes().add(theconmlPackage.getModelElement());
		instanceModelEClass.getESuperTypes().add(theconmlPackage.getModel());
		valueSetEClass.getESuperTypes().add(this.getFacetSet());
		referenceSetEClass.getESuperTypes().add(this.getFacetSet());
		objectEClass.getESuperTypes().add(this.getInstance());
		linkEClass.getESuperTypes().add(this.getInstance());
		valueEClass.getESuperTypes().add(this.getFacet());
		facetSetEClass.getESuperTypes().add(this.getInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(instanceEClass, Instance.class, "Instance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facetEClass, Facet.class, "Facet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacet_Certainty(), this.getDegreeOfCertainty(), "certainty", null, 1, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_ReferredObject(), this.getObject(), this.getObject_IsReferredByReferences(), "ReferredObject", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_PrimaryLink(), this.getLink(), this.getLink_PrimaryReference(), "PrimaryLink", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_SecondaryLink(), this.getLink(), this.getLink_SecondaryReference(), "SecondaryLink", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_OwnerReferenceSet(), this.getReferenceSet(), this.getReferenceSet_References(), "OwnerReferenceSet", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_InverseReference(), this.getReference(), null, "InverseReference", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceModelElementEClass, InstanceModelElement.class, "InstanceModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceModelEClass, InstanceModel.class, "InstanceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceModel_ConformedTypeModels(), theTypesPackage.getTypeModel(), theTypesPackage.getTypeModel_ConformingInstanceModel(), "ConformedTypeModels", null, 1, -1, InstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceModel_Elements(), this.getInstanceModelElement(), null, "Elements", null, 0, -1, InstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSetEClass, ValueSet.class, "ValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSet_InstancedAttribute(), theTypesPackage.getAttribute(), theTypesPackage.getAttribute_InstanceValueSets(), "InstancedAttribute", null, 1, 1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSet_Values(), this.getValue(), this.getValue_OwnerValueSet(), "Values", null, 0, -1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceSetEClass, ReferenceSet.class, "ReferenceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceSet_InstancedSemiAssociation(), theTypesPackage.getSemiAssociation(), theTypesPackage.getSemiAssociation_InstanceReferenceSets(), "InstancedSemiAssociation", null, 1, 1, ReferenceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceSet_References(), this.getReference(), this.getReference_OwnerReferenceSet(), "References", null, 0, -1, ReferenceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceSet_Owner(), this.getObject(), this.getObject_ReferenceSets(), "Owner", null, 1, 1, ReferenceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, conml.instances.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_Certainty(), this.getDegreeOfCertainty(), "certainty", null, 1, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_InstancedClass(), theTypesPackage.getClass_(), theTypesPackage.getClass_InstanceObjects(), "InstancedClass", null, 1, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_IsReferredByReferences(), this.getReference(), this.getReference_ReferredObject(), "IsReferredByReferences", null, 0, -1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_TemporalExistentialQualifier(), this.getObject(), null, "TemporalExistentialQualifier", null, 0, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_SubjectiveExistentialQualifer(), this.getObject(), null, "SubjectiveExistentialQualifer", null, 0, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_ValueSets(), this.getValueSet(), null, "ValueSets", null, 0, -1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_ReferenceSets(), this.getReferenceSet(), this.getReferenceSet_Owner(), "ReferenceSets", null, 0, -1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_MetaInfoInModel(), theconmlPackage.getModel(), theconmlPackage.getModel_MetaInformationObjects(), "MetaInfoInModel", null, 0, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_InstancedAssociation(), theTypesPackage.getAssociation(), theTypesPackage.getAssociation_InstanceLinks(), "InstancedAssociation", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_PrimaryReference(), this.getReference(), this.getReference_PrimaryLink(), "PrimaryReference", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_SecondaryReference(), this.getReference(), this.getReference_SecondaryLink(), "SecondaryReference", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Compact(), theXMLTypePackage.getBoolean(), "compact", "false", 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Contents(), theXMLTypePackage.getAnySimpleType(), "contents", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_OwnerValueSet(), this.getValueSet(), this.getValueSet_Values(), "OwnerValueSet", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetSetEClass, FacetSet.class, "FacetSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetSet_TranslationQualifiers(), theconmlPackage.getLanguage(), null, "TranslationQualifiers", null, 0, -1, FacetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetSet_PhaseQualifier(), this.getObject(), null, "PhaseQualifier", null, 0, 1, FacetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetSet_PerspectiveQualifier(), this.getObject(), null, "PerspectiveQualifier", null, 0, 1, FacetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(degreeOfCertaintyEEnum, DegreeOfCertainty.class, "DegreeOfCertainty");
		addEEnumLiteral(degreeOfCertaintyEEnum, DegreeOfCertainty.CERTAIN);
		addEEnumLiteral(degreeOfCertaintyEEnum, DegreeOfCertainty.PROBABLE);
		addEEnumLiteral(degreeOfCertaintyEEnum, DegreeOfCertainty.POSSIBLE);
		addEEnumLiteral(degreeOfCertaintyEEnum, DegreeOfCertainty.IMPROBABLE);
		addEEnumLiteral(degreeOfCertaintyEEnum, DegreeOfCertainty.IMPOSSIBLE);
	}

} //InstancesPackageImpl
