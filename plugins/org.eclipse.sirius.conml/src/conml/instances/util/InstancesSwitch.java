/**
 */
package conml.instances.util;

import conml.Model;
import conml.ModelElement;
import conml.ModelPart;

import conml.instances.Facet;
import conml.instances.FacetSet;
import conml.instances.Instance;
import conml.instances.InstanceModel;
import conml.instances.InstanceModelElement;
import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
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
public class InstancesSwitch<T> extends Switch<T> {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstancesPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseInstanceModelElement(instance);
				if (result == null) result = caseModelElement(instance);
				if (result == null) result = caseModelPart(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.FACET: {
				Facet facet = (Facet)theEObject;
				T result = caseFacet(facet);
				if (result == null) result = caseInstanceModelElement(facet);
				if (result == null) result = caseModelElement(facet);
				if (result == null) result = caseModelPart(facet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseFacet(reference);
				if (result == null) result = caseInstanceModelElement(reference);
				if (result == null) result = caseModelElement(reference);
				if (result == null) result = caseModelPart(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.INSTANCE_MODEL_ELEMENT: {
				InstanceModelElement instanceModelElement = (InstanceModelElement)theEObject;
				T result = caseInstanceModelElement(instanceModelElement);
				if (result == null) result = caseModelElement(instanceModelElement);
				if (result == null) result = caseModelPart(instanceModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.INSTANCE_MODEL: {
				InstanceModel instanceModel = (InstanceModel)theEObject;
				T result = caseInstanceModel(instanceModel);
				if (result == null) result = caseModel(instanceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
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
				T result = caseReferenceSet(referenceSet);
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
				T result = caseObject(object);
				if (result == null) result = caseInstance(object);
				if (result == null) result = caseInstanceModelElement(object);
				if (result == null) result = caseModelElement(object);
				if (result == null) result = caseModelPart(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseInstance(link);
				if (result == null) result = caseInstanceModelElement(link);
				if (result == null) result = caseModelElement(link);
				if (result == null) result = caseModelPart(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseFacet(value);
				if (result == null) result = caseInstanceModelElement(value);
				if (result == null) result = caseModelElement(value);
				if (result == null) result = caseModelPart(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancesPackage.FACET_SET: {
				FacetSet facetSet = (FacetSet)theEObject;
				T result = caseFacetSet(facetSet);
				if (result == null) result = caseInstance(facetSet);
				if (result == null) result = caseInstanceModelElement(facetSet);
				if (result == null) result = caseModelElement(facetSet);
				if (result == null) result = caseModelPart(facetSet);
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
	public T caseInstance(Instance object) {
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
	public T caseFacet(Facet object) {
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
	public T caseReference(Reference object) {
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
	public T caseInstanceModelElement(InstanceModelElement object) {
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
	public T caseInstanceModel(InstanceModel object) {
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
	public T caseValueSet(ValueSet object) {
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
	public T caseReferenceSet(ReferenceSet object) {
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
	public T caseObject(conml.instances.Object object) {
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
	public T caseLink(Link object) {
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
	public T caseValue(Value object) {
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
	public T caseFacetSet(FacetSet object) {
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
	public T caseModelPart(ModelPart object) {
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
	public T caseModelElement(ModelElement object) {
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
	public T caseModel(Model object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //InstancesSwitch
