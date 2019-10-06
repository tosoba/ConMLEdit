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
	public EReference getFacet_IsOwnedBy() {
		return (EReference)facetEClass.getEStructuralFeatures().get(1);
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
	public EReference getReference_RefersTo() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Inverse() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_IsInverseOf() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_IsPrimaryIn() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_IsSecondaryIn() {
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
	public EReference getInstanceModel_ConformsTo() {
		return (EReference)instanceModelEClass.getEStructuralFeatures().get(0);
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
	public EReference getValueSet_IsAnInstanceOf() {
		return (EReference)valueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueSet_Owner() {
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
	public EReference getReferenceSet_IsAnInstanceOf() {
		return (EReference)referenceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSet_Owner() {
		return (EReference)referenceSetEClass.getEStructuralFeatures().get(1);
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
	public EReference getObject_OwnsValueSets() {
		return (EReference)objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_OwnsReferenceSets() {
		return (EReference)objectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_IsOppositeIn() {
		return (EReference)objectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_TemporalExistentialQualifier() {
		return (EReference)objectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_SubjectiveExistentialQualifer() {
		return (EReference)objectEClass.getEStructuralFeatures().get(7);
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
	public EReference getLink_IsInstanceOf() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_HasPrimary() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_HasSecondary() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
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
	public EClass getFacetSet() {
		return facetSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_IsComposedOf() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_TranslationQualifiers() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_PhaseQualifier() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacetSet_PerspectiveQualifier() {
		return (EReference)facetSetEClass.getEStructuralFeatures().get(3);
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
		createEReference(facetEClass, FACET__IS_OWNED_BY);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REFERS_TO);
		createEReference(referenceEClass, REFERENCE__INVERSE);
		createEReference(referenceEClass, REFERENCE__IS_INVERSE_OF);
		createEReference(referenceEClass, REFERENCE__IS_PRIMARY_IN);
		createEReference(referenceEClass, REFERENCE__IS_SECONDARY_IN);

		instanceModelElementEClass = createEClass(INSTANCE_MODEL_ELEMENT);

		instanceModelEClass = createEClass(INSTANCE_MODEL);
		createEReference(instanceModelEClass, INSTANCE_MODEL__CONFORMS_TO);

		valueSetEClass = createEClass(VALUE_SET);
		createEReference(valueSetEClass, VALUE_SET__IS_AN_INSTANCE_OF);
		createEReference(valueSetEClass, VALUE_SET__OWNER);

		referenceSetEClass = createEClass(REFERENCE_SET);
		createEReference(referenceSetEClass, REFERENCE_SET__IS_AN_INSTANCE_OF);
		createEReference(referenceSetEClass, REFERENCE_SET__OWNER);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__IDENTIFIER);
		createEAttribute(objectEClass, OBJECT__CERTAINTY);
		createEReference(objectEClass, OBJECT__INSTANCED_CLASS);
		createEReference(objectEClass, OBJECT__OWNS_VALUE_SETS);
		createEReference(objectEClass, OBJECT__OWNS_REFERENCE_SETS);
		createEReference(objectEClass, OBJECT__IS_OPPOSITE_IN);
		createEReference(objectEClass, OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER);
		createEReference(objectEClass, OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__IS_INSTANCE_OF);
		createEReference(linkEClass, LINK__HAS_PRIMARY);
		createEReference(linkEClass, LINK__HAS_SECONDARY);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__CONTENTS);

		facetSetEClass = createEClass(FACET_SET);
		createEReference(facetSetEClass, FACET_SET__IS_COMPOSED_OF);
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
		initEReference(getFacet_IsOwnedBy(), this.getFacetSet(), this.getFacetSet_IsComposedOf(), "IsOwnedBy", null, 1, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_RefersTo(), this.getObject(), this.getObject_IsOppositeIn(), "RefersTo", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Inverse(), this.getReference(), this.getReference_IsInverseOf(), "inverse", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_IsInverseOf(), this.getReference(), this.getReference_Inverse(), "isInverseOf", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_IsPrimaryIn(), this.getLink(), this.getLink_HasPrimary(), "IsPrimaryIn", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_IsSecondaryIn(), this.getLink(), this.getLink_HasSecondary(), "IsSecondaryIn", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceModelElementEClass, InstanceModelElement.class, "InstanceModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceModelEClass, InstanceModel.class, "InstanceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceModel_ConformsTo(), theTypesPackage.getTypeModel(), theTypesPackage.getTypeModel_ConformedBy(), "ConformsTo", null, 1, -1, InstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSetEClass, ValueSet.class, "ValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSet_IsAnInstanceOf(), theTypesPackage.getAttribute(), theTypesPackage.getAttribute_HasInstanceValueSets(), "IsAnInstanceOf", null, 1, 1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSet_Owner(), this.getObject(), this.getObject_OwnsValueSets(), "Owner", null, 1, 1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceSetEClass, ReferenceSet.class, "ReferenceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceSet_IsAnInstanceOf(), theTypesPackage.getSemiAssociation(), theTypesPackage.getSemiAssociation_HasInstanceReferenceSets(), "IsAnInstanceOf", null, 1, 1, ReferenceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceSet_Owner(), this.getObject(), this.getObject_OwnsReferenceSets(), "Owner", null, 1, 1, ReferenceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, conml.instances.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_Certainty(), this.getDegreeOfCertainty(), "certainty", null, 1, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_InstancedClass(), theTypesPackage.getClass_(), theTypesPackage.getClass_InstancedByObjects(), "InstancedClass", null, 1, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_OwnsValueSets(), this.getValueSet(), this.getValueSet_Owner(), "OwnsValueSets", null, 0, -1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_OwnsReferenceSets(), this.getReferenceSet(), this.getReferenceSet_Owner(), "OwnsReferenceSets", null, 0, -1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_IsOppositeIn(), this.getReference(), this.getReference_RefersTo(), "IsOppositeIn", null, 0, -1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_TemporalExistentialQualifier(), this.getObject(), null, "TemporalExistentialQualifier", null, 0, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_SubjectiveExistentialQualifer(), this.getObject(), null, "SubjectiveExistentialQualifer", null, 0, 1, conml.instances.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_IsInstanceOf(), theTypesPackage.getAssociation(), theTypesPackage.getAssociation_HasInstanceLinks(), "IsInstanceOf", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_HasPrimary(), this.getReference(), this.getReference_IsPrimaryIn(), "HasPrimary", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_HasSecondary(), this.getReference(), this.getReference_IsSecondaryIn(), "HasSecondary", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Contents(), theXMLTypePackage.getAnySimpleType(), "contents", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetSetEClass, FacetSet.class, "FacetSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetSet_IsComposedOf(), this.getFacet(), this.getFacet_IsOwnedBy(), "IsComposedOf", null, 0, -1, FacetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
