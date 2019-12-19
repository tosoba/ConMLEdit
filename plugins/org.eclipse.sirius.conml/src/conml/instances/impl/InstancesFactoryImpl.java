/**
 */
package conml.instances.impl;

import conml.instances.BooleanValue;
import conml.instances.DataValue;
import conml.instances.DegreeOfCertainty;
import conml.instances.EnumValue;
import conml.instances.EnumeratedItemValueDisplay;
import conml.instances.InstanceModel;
import conml.instances.InstancesFactory;
import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.NumberValue;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.instances.TextValue;
import conml.instances.TimeValue;
import conml.instances.ValueSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesFactoryImpl extends EFactoryImpl implements InstancesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstancesFactory init() {
		try {
			InstancesFactory theInstancesFactory = (InstancesFactory)EPackage.Registry.INSTANCE.getEFactory(InstancesPackage.eNS_URI);
			if (theInstancesFactory != null) {
				return theInstancesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstancesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InstancesPackage.REFERENCE: return createReference();
			case InstancesPackage.INSTANCE_MODEL: return createInstanceModel();
			case InstancesPackage.VALUE_SET: return createValueSet();
			case InstancesPackage.REFERENCE_SET: return createReferenceSet();
			case InstancesPackage.OBJECT: return createObject();
			case InstancesPackage.LINK: return createLink();
			case InstancesPackage.TEXT_VALUE: return createTextValue();
			case InstancesPackage.BOOLEAN_VALUE: return createBooleanValue();
			case InstancesPackage.TIME_VALUE: return createTimeValue();
			case InstancesPackage.NUMBER_VALUE: return createNumberValue();
			case InstancesPackage.DATA_VALUE: return createDataValue();
			case InstancesPackage.ENUM_VALUE: return createEnumValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InstancesPackage.DEGREE_OF_CERTAINTY:
				return createDegreeOfCertaintyFromString(eDataType, initialValue);
			case InstancesPackage.ENUMERATED_ITEM_VALUE_DISPLAY:
				return createEnumeratedItemValueDisplayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InstancesPackage.DEGREE_OF_CERTAINTY:
				return convertDegreeOfCertaintyToString(eDataType, instanceValue);
			case InstancesPackage.ENUMERATED_ITEM_VALUE_DISPLAY:
				return convertEnumeratedItemValueDisplayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceModel createInstanceModel() {
		InstanceModelImpl instanceModel = new InstanceModelImpl();
		return instanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceSet createReferenceSet() {
		ReferenceSetImpl referenceSet = new ReferenceSetImpl();
		return referenceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextValue createTextValue() {
		TextValueImpl textValue = new TextValueImpl();
		return textValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeValue createTimeValue() {
		TimeValueImpl timeValue = new TimeValueImpl();
		return timeValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfCertainty createDegreeOfCertaintyFromString(EDataType eDataType, String initialValue) {
		DegreeOfCertainty result = DegreeOfCertainty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeOfCertaintyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedItemValueDisplay createEnumeratedItemValueDisplayFromString(EDataType eDataType, String initialValue) {
		EnumeratedItemValueDisplay result = EnumeratedItemValueDisplay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumeratedItemValueDisplayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstancesPackage getInstancesPackage() {
		return (InstancesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancesPackage getPackage() {
		return InstancesPackage.eINSTANCE;
	}

} //InstancesFactoryImpl
