/**
 */
package conml.types.impl;

import conml.conmlPackage;

import conml.impl.conmlPackageImpl;

import conml.instances.InstancesPackage;

import conml.instances.impl.InstancesPackageImpl;

import conml.types.Association;
import conml.types.Attribute;
import conml.types.BaseDataType;
import conml.types.DataType;
import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;
import conml.types.SimpleDataType;
import conml.types.Type;
import conml.types.TypeModel;
import conml.types.TypeModelElement;
import conml.types.TypesFactory;
import conml.types.TypesPackage;

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
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semiAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum baseDataTypeEEnum = null;

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
	 * @see conml.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypesPackageImpl theTypesPackage = registeredTypesPackage instanceof TypesPackageImpl ? (TypesPackageImpl)registeredTypesPackage : new TypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(conmlPackage.eNS_URI);
		conmlPackageImpl theconmlPackage = (conmlPackageImpl)(registeredPackage instanceof conmlPackageImpl ? registeredPackage : conmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);
		InstancesPackageImpl theInstancesPackage = (InstancesPackageImpl)(registeredPackage instanceof InstancesPackageImpl ? registeredPackage : InstancesPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theconmlPackage.createPackageContents();
		theInstancesPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theconmlPackage.initializePackageContents();
		theInstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeModel() {
		return typeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModel_ConformingInstanceModel() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModel_BaseTypeModel() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModel_ParticularTypeModels() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModel_SubjectiveAspect() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModel_TemporalAspect() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModel_Elements() {
		return (EReference)typeModelEClass.getEStructuralFeatures().get(5);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClass_Abstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClass_UsedAsTemporalAspect() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClass_UsedAsSubjectiveAspect() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Generalizations() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Specialization() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_DominantGeneralization() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_InstanceObjects() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Package() {
		return (EReference)classEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Properties() {
		return (EReference)classEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Attributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_SemiAssociations() {
		return (EReference)classEClass.getEStructuralFeatures().get(10);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralization_Discriminant() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_SpecializedClasses() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_GeneralizedClass() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_DominatedClasses() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralization_DiscriminantDisplayed() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_MaximumCardinality() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_MinimumCardinality() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Sorted() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Temporal() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Subjective() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Constant() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeratedType() {
		return enumeratedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedType_OwnedItems() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedType_SubTypes() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedType_SuperType() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedType_Package() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeModelElement() {
		return typeModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeModelElement_TypeModel() {
		return (EReference)typeModelElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_PrimarySemiAssociation() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_SecondarySemiAssociation() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_InstanceLinks() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_Compact() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ContainedClasses() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_EnumeratedTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_SubPackages() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ContainerPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Overall() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Multilingual() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_InstanceValueSets() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_RedefinedAttribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_RedefiningAttribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Datatype() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(5);
	}

                /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_OwnerClass() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemiAssociation() {
		return semiAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemiAssociation_Role() {
		return (EAttribute)semiAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemiAssociation_Whole() {
		return (EAttribute)semiAssociationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemiAssociation_Strong() {
		return (EAttribute)semiAssociationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_PrimaryInAssociation() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_SecondaryInAssociation() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_InstanceReferenceSets() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_InverseSemiAssociation() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_ReferredClass() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_RedefinedSemiAssociation() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemiAssociation_OwnerClass() {
		return (EReference)semiAssociationEClass.getEStructuralFeatures().get(9);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemiAssociation_NameDisplayed() {
		return (EAttribute)semiAssociationEClass.getEStructuralFeatures().get(10);
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemiAssociation_RoleDisplayed() {
		return (EAttribute)semiAssociationEClass.getEStructuralFeatures().get(11);
	}

                /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_RedefinedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_OwnerClass() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleDataType() {
		return simpleDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleDataType_Base() {
		return (EAttribute)simpleDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeratedItem() {
		return enumeratedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedItem_OwnerType() {
		return (EReference)enumeratedItemEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedItem_SubItems() {
		return (EReference)enumeratedItemEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedItem_SuperItem() {
		return (EReference)enumeratedItemEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBaseDataType() {
		return baseDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		typeModelEClass = createEClass(TYPE_MODEL);
		createEReference(typeModelEClass, TYPE_MODEL__CONFORMING_INSTANCE_MODEL);
		createEReference(typeModelEClass, TYPE_MODEL__BASE_TYPE_MODEL);
		createEReference(typeModelEClass, TYPE_MODEL__PARTICULAR_TYPE_MODELS);
		createEReference(typeModelEClass, TYPE_MODEL__SUBJECTIVE_ASPECT);
		createEReference(typeModelEClass, TYPE_MODEL__TEMPORAL_ASPECT);
		createEReference(typeModelEClass, TYPE_MODEL__ELEMENTS);

		typeEClass = createEClass(TYPE);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__ABSTRACT);
		createEAttribute(classEClass, CLASS__USED_AS_TEMPORAL_ASPECT);
		createEAttribute(classEClass, CLASS__USED_AS_SUBJECTIVE_ASPECT);
		createEReference(classEClass, CLASS__GENERALIZATIONS);
		createEReference(classEClass, CLASS__SPECIALIZATION);
		createEReference(classEClass, CLASS__DOMINANT_GENERALIZATION);
		createEReference(classEClass, CLASS__INSTANCE_OBJECTS);
		createEReference(classEClass, CLASS__PACKAGE);
		createEReference(classEClass, CLASS__PROPERTIES);
		createEReference(classEClass, CLASS__ATTRIBUTES);
		createEReference(classEClass, CLASS__SEMI_ASSOCIATIONS);

		generalizationEClass = createEClass(GENERALIZATION);
		createEAttribute(generalizationEClass, GENERALIZATION__DISCRIMINANT);
		createEReference(generalizationEClass, GENERALIZATION__SPECIALIZED_CLASSES);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZED_CLASS);
		createEReference(generalizationEClass, GENERALIZATION__DOMINATED_CLASSES);
		createEAttribute(generalizationEClass, GENERALIZATION__DISCRIMINANT_DISPLAYED);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__MINIMUM_CARDINALITY);
		createEAttribute(featureEClass, FEATURE__SORTED);
		createEAttribute(featureEClass, FEATURE__TEMPORAL);
		createEAttribute(featureEClass, FEATURE__SUBJECTIVE);
		createEAttribute(featureEClass, FEATURE__CONSTANT);
		createEAttribute(featureEClass, FEATURE__MAXIMUM_CARDINALITY);

		enumeratedTypeEClass = createEClass(ENUMERATED_TYPE);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__OWNED_ITEMS);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__SUB_TYPES);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__SUPER_TYPE);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__PACKAGE);

		typeModelElementEClass = createEClass(TYPE_MODEL_ELEMENT);
		createEReference(typeModelElementEClass, TYPE_MODEL_ELEMENT__TYPE_MODEL);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__PRIMARY_SEMI_ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__SECONDARY_SEMI_ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__INSTANCE_LINKS);
		createEAttribute(associationEClass, ASSOCIATION__COMPACT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__CONTAINED_CLASSES);
		createEReference(packageEClass, PACKAGE__ENUMERATED_TYPES);
		createEReference(packageEClass, PACKAGE__SUB_PACKAGES);
		createEReference(packageEClass, PACKAGE__CONTAINER_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__OVERALL);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__MULTILINGUAL);
		createEReference(attributeEClass, ATTRIBUTE__INSTANCE_VALUE_SETS);
		createEReference(attributeEClass, ATTRIBUTE__OWNER_CLASS);
		createEReference(attributeEClass, ATTRIBUTE__REDEFINED_ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__REDEFINING_ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__DATATYPE);

		semiAssociationEClass = createEClass(SEMI_ASSOCIATION);
		createEAttribute(semiAssociationEClass, SEMI_ASSOCIATION__ROLE);
		createEAttribute(semiAssociationEClass, SEMI_ASSOCIATION__WHOLE);
		createEAttribute(semiAssociationEClass, SEMI_ASSOCIATION__STRONG);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__REFERRED_CLASS);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__REDEFINED_SEMI_ASSOCIATION);
		createEReference(semiAssociationEClass, SEMI_ASSOCIATION__OWNER_CLASS);
		createEAttribute(semiAssociationEClass, SEMI_ASSOCIATION__NAME_DISPLAYED);
		createEAttribute(semiAssociationEClass, SEMI_ASSOCIATION__ROLE_DISPLAYED);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__REDEFINED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__OWNER_CLASS);

		simpleDataTypeEClass = createEClass(SIMPLE_DATA_TYPE);
		createEAttribute(simpleDataTypeEClass, SIMPLE_DATA_TYPE__BASE);

		enumeratedItemEClass = createEClass(ENUMERATED_ITEM);
		createEReference(enumeratedItemEClass, ENUMERATED_ITEM__OWNER_TYPE);
		createEReference(enumeratedItemEClass, ENUMERATED_ITEM__SUB_ITEMS);
		createEReference(enumeratedItemEClass, ENUMERATED_ITEM__SUPER_ITEM);

		dataTypeEClass = createEClass(DATA_TYPE);

		// Create enums
		baseDataTypeEEnum = createEEnum(BASE_DATA_TYPE);
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
		InstancesPackage theInstancesPackage = (InstancesPackage)EPackage.Registry.INSTANCE.getEPackage(InstancesPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeModelEClass.getESuperTypes().add(theconmlPackage.getModel());
		typeEClass.getESuperTypes().add(this.getTypeModelElement());
		typeEClass.getESuperTypes().add(theconmlPackage.getNamedElement());
		typeEClass.getESuperTypes().add(theconmlPackage.getDefinableElement());
		classEClass.getESuperTypes().add(this.getType());
		classEClass.getESuperTypes().add(theconmlPackage.getCommentableElement());
		generalizationEClass.getESuperTypes().add(this.getTypeModelElement());
		featureEClass.getESuperTypes().add(this.getType());
		enumeratedTypeEClass.getESuperTypes().add(theconmlPackage.getCommentableElement());
		enumeratedTypeEClass.getESuperTypes().add(this.getDataType());
		enumeratedTypeEClass.getESuperTypes().add(this.getType());
		typeModelElementEClass.getESuperTypes().add(theconmlPackage.getModelElement());
		associationEClass.getESuperTypes().add(this.getType());
		packageEClass.getESuperTypes().add(this.getTypeModelElement());
		packageEClass.getESuperTypes().add(theconmlPackage.getNamedElement());
		packageEClass.getESuperTypes().add(theconmlPackage.getDescribableElement());
		attributeEClass.getESuperTypes().add(this.getFeature());
		semiAssociationEClass.getESuperTypes().add(this.getFeature());
		propertyEClass.getESuperTypes().add(this.getFeature());
		simpleDataTypeEClass.getESuperTypes().add(this.getDataType());
		enumeratedItemEClass.getESuperTypes().add(theconmlPackage.getNamedElement());
		enumeratedItemEClass.getESuperTypes().add(theconmlPackage.getDefinableElement());
		dataTypeEClass.getESuperTypes().add(theconmlPackage.getModelPart());
		dataTypeEClass.getESuperTypes().add(theconmlPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeModelEClass, TypeModel.class, "TypeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeModel_ConformingInstanceModel(), theInstancesPackage.getInstanceModel(), theInstancesPackage.getInstanceModel_ConformedTypeModels(), "ConformingInstanceModel", null, 0, 1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModel_BaseTypeModel(), this.getTypeModel(), this.getTypeModel_ParticularTypeModels(), "BaseTypeModel", null, 0, 1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModel_ParticularTypeModels(), this.getTypeModel(), this.getTypeModel_BaseTypeModel(), "ParticularTypeModels", null, 0, -1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModel_SubjectiveAspect(), this.getClass_(), null, "SubjectiveAspect", null, 0, 1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModel_TemporalAspect(), this.getClass_(), null, "TemporalAspect", null, 0, 1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeModel_Elements(), this.getTypeModelElement(), this.getTypeModelElement_TypeModel(), "Elements", null, 0, -1, TypeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, conml.types.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 1, 1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_UsedAsTemporalAspect(), ecorePackage.getEBoolean(), "usedAsTemporalAspect", null, 1, 1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_UsedAsSubjectiveAspect(), ecorePackage.getEBoolean(), "usedAsSubjectiveAspect", null, 1, 1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Generalizations(), this.getGeneralization(), this.getGeneralization_SpecializedClasses(), "Generalizations", null, 0, -1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Specialization(), this.getGeneralization(), this.getGeneralization_GeneralizedClass(), "Specialization", null, 0, 1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_DominantGeneralization(), this.getGeneralization(), this.getGeneralization_DominatedClasses(), "DominantGeneralization", null, 0, 1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_InstanceObjects(), theInstancesPackage.getObject(), theInstancesPackage.getObject_InstancedClass(), "InstanceObjects", null, 0, -1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Package(), this.getPackage(), this.getPackage_ContainedClasses(), "Package", null, 0, 1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Properties(), this.getProperty(), this.getProperty_OwnerClass(), "Properties", null, 0, -1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getAttribute(), this.getAttribute_OwnerClass(), "Attributes", null, 0, -1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SemiAssociations(), this.getSemiAssociation(), this.getSemiAssociation_OwnerClass(), "SemiAssociations", null, 0, -1, conml.types.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralization_Discriminant(), ecorePackage.getEString(), "discriminant", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_SpecializedClasses(), this.getClass_(), this.getClass_Generalizations(), "SpecializedClasses", null, 1, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_GeneralizedClass(), this.getClass_(), this.getClass_Specialization(), "GeneralizedClass", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_DominatedClasses(), this.getClass_(), this.getClass_DominantGeneralization(), "DominatedClasses", null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralization_DiscriminantDisplayed(), theXMLTypePackage.getBoolean(), "discriminantDisplayed", "true", 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_MinimumCardinality(), ecorePackage.getEInt(), "minimumCardinality", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Sorted(), ecorePackage.getEBoolean(), "sorted", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Temporal(), ecorePackage.getEBoolean(), "temporal", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Subjective(), ecorePackage.getEBoolean(), "subjective", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_MaximumCardinality(), ecorePackage.getEIntegerObject(), "maximumCardinality", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedTypeEClass, EnumeratedType.class, "EnumeratedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedType_OwnedItems(), this.getEnumeratedItem(), this.getEnumeratedItem_OwnerType(), "OwnedItems", null, 0, -1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeratedType_SubTypes(), this.getEnumeratedType(), this.getEnumeratedType_SuperType(), "SubTypes", null, 0, -1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeratedType_SuperType(), this.getEnumeratedType(), this.getEnumeratedType_SubTypes(), "SuperType", null, 0, 1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeratedType_Package(), this.getPackage(), this.getPackage_EnumeratedTypes(), "Package", null, 0, 1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeModelElementEClass, TypeModelElement.class, "TypeModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeModelElement_TypeModel(), this.getTypeModel(), this.getTypeModel_Elements(), "TypeModel", null, 1, 1, TypeModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_PrimarySemiAssociation(), this.getSemiAssociation(), this.getSemiAssociation_PrimaryInAssociation(), "PrimarySemiAssociation", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_SecondarySemiAssociation(), this.getSemiAssociation(), this.getSemiAssociation_SecondaryInAssociation(), "SecondarySemiAssociation", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_InstanceLinks(), theInstancesPackage.getLink(), theInstancesPackage.getLink_InstancedAssociation(), "InstanceLinks", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Compact(), theXMLTypePackage.getBoolean(), "compact", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, conml.types.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_ContainedClasses(), this.getClass_(), this.getClass_Package(), "ContainedClasses", null, 0, -1, conml.types.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_EnumeratedTypes(), this.getEnumeratedType(), this.getEnumeratedType_Package(), "EnumeratedTypes", null, 0, -1, conml.types.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_SubPackages(), this.getPackage(), this.getPackage_ContainerPackage(), "SubPackages", null, 0, -1, conml.types.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ContainerPackage(), this.getPackage(), this.getPackage_SubPackages(), "ContainerPackage", null, 0, 1, conml.types.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Overall(), theXMLTypePackage.getBoolean(), "overall", "false", 1, 1, conml.types.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Multilingual(), ecorePackage.getEBoolean(), "multilingual", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_InstanceValueSets(), theInstancesPackage.getValueSet(), theInstancesPackage.getValueSet_InstancedAttribute(), "InstanceValueSets", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_OwnerClass(), this.getClass_(), this.getClass_Attributes(), "OwnerClass", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_RedefinedAttribute(), this.getAttribute(), this.getAttribute_RedefiningAttribute(), "RedefinedAttribute", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_RedefiningAttribute(), this.getAttribute(), this.getAttribute_RedefinedAttribute(), "RedefiningAttribute", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Datatype(), this.getDataType(), null, "datatype", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semiAssociationEClass, SemiAssociation.class, "SemiAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemiAssociation_Role(), ecorePackage.getEString(), "role", null, 0, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemiAssociation_Whole(), ecorePackage.getEBoolean(), "whole", null, 0, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemiAssociation_Strong(), ecorePackage.getEBoolean(), "strong", null, 0, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_PrimaryInAssociation(), this.getAssociation(), this.getAssociation_PrimarySemiAssociation(), "PrimaryInAssociation", null, 0, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_SecondaryInAssociation(), this.getAssociation(), this.getAssociation_SecondarySemiAssociation(), "SecondaryInAssociation", null, 0, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_InstanceReferenceSets(), theInstancesPackage.getReferenceSet(), theInstancesPackage.getReferenceSet_InstancedSemiAssociation(), "InstanceReferenceSets", null, 0, -1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_InverseSemiAssociation(), this.getSemiAssociation(), null, "InverseSemiAssociation", null, 1, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_ReferredClass(), this.getClass_(), null, "ReferredClass", null, 1, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_RedefinedSemiAssociation(), this.getSemiAssociation(), null, "RedefinedSemiAssociation", null, 0, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemiAssociation_OwnerClass(), this.getClass_(), this.getClass_SemiAssociations(), "OwnerClass", null, 1, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemiAssociation_NameDisplayed(), ecorePackage.getEBoolean(), "nameDisplayed", "true", 1, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemiAssociation_RoleDisplayed(), ecorePackage.getEBoolean(), "roleDisplayed", "true", 1, 1, SemiAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_RedefinedProperty(), this.getProperty(), null, "RedefinedProperty", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OwnerClass(), this.getClass_(), this.getClass_Properties(), "OwnerClass", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDataTypeEClass, SimpleDataType.class, "SimpleDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDataType_Base(), this.getBaseDataType(), "base", null, 1, 1, SimpleDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedItemEClass, EnumeratedItem.class, "EnumeratedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedItem_OwnerType(), this.getEnumeratedType(), this.getEnumeratedType_OwnedItems(), "OwnerType", null, 1, 1, EnumeratedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeratedItem_SubItems(), this.getEnumeratedItem(), this.getEnumeratedItem_SuperItem(), "SubItems", null, 0, -1, EnumeratedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeratedItem_SuperItem(), this.getEnumeratedItem(), this.getEnumeratedItem_SubItems(), "SuperItem", null, 0, 1, EnumeratedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(baseDataTypeEEnum, BaseDataType.class, "BaseDataType");
		addEEnumLiteral(baseDataTypeEEnum, BaseDataType.BOOLEAN);
		addEEnumLiteral(baseDataTypeEEnum, BaseDataType.NUMBER);
		addEEnumLiteral(baseDataTypeEEnum, BaseDataType.TEXT);
		addEEnumLiteral(baseDataTypeEEnum, BaseDataType.TIME);
		addEEnumLiteral(baseDataTypeEEnum, BaseDataType.DATA);
	}

} //TypesPackageImpl
