/**
 */
package conml.instances.util;

import conml.DescribableElement;
import conml.Model;
import conml.ModelElement;
import conml.ModelPart;

import conml.NamedElement;
import conml.instances.BoolValue;
import conml.instances.DataValue;
import conml.instances.EnumValue;
import conml.instances.Facet;
import conml.instances.FacetSet;
import conml.instances.Instance;
import conml.instances.InstanceModel;
import conml.instances.InstanceModelElement;
import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.NumberValue;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.instances.StringValue;
import conml.instances.TimeValue;
import conml.instances.Value;
import conml.instances.ValueSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see conml.instances.InstancesPackage
 * @generated
 */
public class InstancesSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesSwitch() {
		if (modelPackage == null) {
			modelPackage = InstancesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstancesPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T1 result = caseInstance(instance);
				if (result == null) result = caseInstanceModelElement(instance);
				if (result == null) result = caseModelElement(instance);
				if (result == null) result = caseModelPart(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.FACET: {
				Facet facet = (Facet)theEObject;
				T1 result = caseFacet(facet);
				if (result == null) result = caseInstanceModelElement(facet);
				if (result == null) result = caseModelElement(facet);
				if (result == null) result = caseModelPart(facet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T1 result = caseReference(reference);
				if (result == null) result = caseFacet(reference);
				if (result == null) result = caseInstanceModelElement(reference);
				if (result == null) result = caseModelElement(reference);
				if (result == null) result = caseModelPart(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.INSTANCE_MODEL_ELEMENT: {
				InstanceModelElement instanceModelElement = (InstanceModelElement)theEObject;
				T1 result = caseInstanceModelElement(instanceModelElement);
				if (result == null) result = caseModelElement(instanceModelElement);
				if (result == null) result = caseModelPart(instanceModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.INSTANCE_MODEL: {
				InstanceModel instanceModel = (InstanceModel)theEObject;
				T1 result = caseInstanceModel(instanceModel);
				if (result == null) result = caseModel(instanceModel);
				if (result == null) result = caseNamedElement(instanceModel);
				if (result == null) result = caseDescribableElement(instanceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T1 result = caseValueSet(valueSet);
				if (result == null) result = caseFacetSet(valueSet);
				if (result == null) result = caseInstance(valueSet);
				if (result == null) result = caseInstanceModelElement(valueSet);
				if (result == null) result = caseModelElement(valueSet);
				if (result == null) result = caseModelPart(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.REFERENCE_SET: {
				ReferenceSet referenceSet = (ReferenceSet)theEObject;
				T1 result = caseReferenceSet(referenceSet);
				if (result == null) result = caseFacetSet(referenceSet);
				if (result == null) result = caseInstance(referenceSet);
				if (result == null) result = caseInstanceModelElement(referenceSet);
				if (result == null) result = caseModelElement(referenceSet);
				if (result == null) result = caseModelPart(referenceSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.OBJECT: {
				conml.instances.Object object = (conml.instances.Object)theEObject;
				T1 result = caseObject(object);
				if (result == null) result = caseInstance(object);
				if (result == null) result = caseInstanceModelElement(object);
				if (result == null) result = caseModelElement(object);
				if (result == null) result = caseModelPart(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.LINK: {
				Link link = (Link)theEObject;
				T1 result = caseLink(link);
				if (result == null) result = caseInstance(link);
				if (result == null) result = caseInstanceModelElement(link);
				if (result == null) result = caseModelElement(link);
				if (result == null) result = caseModelPart(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.VALUE: {
				Value<?> value = (Value<?>)theEObject;
				T1 result = caseValue(value);
				if (result == null) result = caseFacet(value);
				if (result == null) result = caseInstanceModelElement(value);
				if (result == null) result = caseModelElement(value);
				if (result == null) result = caseModelPart(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.FACET_SET: {
				FacetSet facetSet = (FacetSet)theEObject;
				T1 result = caseFacetSet(facetSet);
				if (result == null) result = caseInstance(facetSet);
				if (result == null) result = caseInstanceModelElement(facetSet);
				if (result == null) result = caseModelElement(facetSet);
				if (result == null) result = caseModelPart(facetSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T1 result = caseStringValue(stringValue);
				if (result == null) result = caseValue(stringValue);
				if (result == null) result = caseFacet(stringValue);
				if (result == null) result = caseInstanceModelElement(stringValue);
				if (result == null) result = caseModelElement(stringValue);
				if (result == null) result = caseModelPart(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.BOOL_VALUE: {
				BoolValue boolValue = (BoolValue)theEObject;
				T1 result = caseBoolValue(boolValue);
				if (result == null) result = caseValue(boolValue);
				if (result == null) result = caseFacet(boolValue);
				if (result == null) result = caseInstanceModelElement(boolValue);
				if (result == null) result = caseModelElement(boolValue);
				if (result == null) result = caseModelPart(boolValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.TIME_VALUE: {
				TimeValue timeValue = (TimeValue)theEObject;
				T1 result = caseTimeValue(timeValue);
				if (result == null) result = caseValue(timeValue);
				if (result == null) result = caseFacet(timeValue);
				if (result == null) result = caseInstanceModelElement(timeValue);
				if (result == null) result = caseModelElement(timeValue);
				if (result == null) result = caseModelPart(timeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.NUMBER_VALUE: {
				NumberValue numberValue = (NumberValue)theEObject;
				T1 result = caseNumberValue(numberValue);
				if (result == null) result = caseValue(numberValue);
				if (result == null) result = caseFacet(numberValue);
				if (result == null) result = caseInstanceModelElement(numberValue);
				if (result == null) result = caseModelElement(numberValue);
				if (result == null) result = caseModelPart(numberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T1 result = caseDataValue(dataValue);
				if (result == null) result = caseValue(dataValue);
				if (result == null) result = caseFacet(dataValue);
				if (result == null) result = caseInstanceModelElement(dataValue);
				if (result == null) result = caseModelElement(dataValue);
				if (result == null) result = caseModelPart(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T1 result = caseEnumValue(enumValue);
				if (result == null) result = caseValue(enumValue);
				if (result == null) result = caseFacet(enumValue);
				if (result == null) result = caseInstanceModelElement(enumValue);
				if (result == null) result = caseModelElement(enumValue);
				if (result == null) result = caseModelPart(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFacet(Facet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstanceModelElement(InstanceModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstanceModel(InstanceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseValueSet(ValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReferenceSet(ReferenceSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObject(conml.instances.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseValue(Value<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFacetSet(FacetSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringValue(StringValue object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoolValue(BoolValue object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeValue(TimeValue object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberValue(NumberValue object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataValue(DataValue object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnumValue(EnumValue object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Model Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelPart(ModelPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDescribableElement(DescribableElement object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //InstancesSwitch
