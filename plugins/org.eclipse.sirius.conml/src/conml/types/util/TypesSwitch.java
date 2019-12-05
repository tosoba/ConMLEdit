/**
 */
package conml.types.util;

import conml.CommentableElement;
import conml.DefinableElement;
import conml.DescribableElement;
import conml.Model;
import conml.ModelElement;
import conml.ModelPart;

import conml.NamedElement;
import conml.types.Association;
import conml.types.Attribute;
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
import conml.types.TypesPackage;

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
 * @see conml.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.TYPE_MODEL: {
				TypeModel typeModel = (TypeModel)theEObject;
				T result = caseTypeModel(typeModel);
				if (result == null) result = caseModel(typeModel);
				if (result == null) result = caseNamedElement(typeModel);
				if (result == null) result = caseDescribableElement(typeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseTypeModelElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseDefinableElement(type);
				if (result == null) result = caseModelElement(type);
				if (result == null) result = caseModelPart(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.CLASS: {
				conml.types.Class class_ = (conml.types.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseCommentableElement(class_);
				if (result == null) result = caseTypeModelElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseDefinableElement(class_);
				if (result == null) result = caseModelElement(class_);
				if (result == null) result = caseModelPart(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseTypeModelElement(generalization);
				if (result == null) result = caseModelElement(generalization);
				if (result == null) result = caseModelPart(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseType(feature);
				if (result == null) result = caseTypeModelElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseDefinableElement(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = caseModelPart(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_TYPE: {
				EnumeratedType enumeratedType = (EnumeratedType)theEObject;
				T result = caseEnumeratedType(enumeratedType);
				if (result == null) result = caseDataType(enumeratedType);
				if (result == null) result = caseCommentableElement(enumeratedType);
				if (result == null) result = caseType(enumeratedType);
				if (result == null) result = caseTypeModelElement(enumeratedType);
				if (result == null) result = caseNamedElement(enumeratedType);
				if (result == null) result = caseDefinableElement(enumeratedType);
				if (result == null) result = caseModelElement(enumeratedType);
				if (result == null) result = caseModelPart(enumeratedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TYPE_MODEL_ELEMENT: {
				TypeModelElement typeModelElement = (TypeModelElement)theEObject;
				T result = caseTypeModelElement(typeModelElement);
				if (result == null) result = caseModelElement(typeModelElement);
				if (result == null) result = caseModelPart(typeModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseType(association);
				if (result == null) result = caseTypeModelElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseDefinableElement(association);
				if (result == null) result = caseModelElement(association);
				if (result == null) result = caseModelPart(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PACKAGE: {
				conml.types.Package package_ = (conml.types.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseTypeModelElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseDescribableElement(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseModelPart(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseType(attribute);
				if (result == null) result = caseTypeModelElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseDefinableElement(attribute);
				if (result == null) result = caseModelElement(attribute);
				if (result == null) result = caseModelPart(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SEMI_ASSOCIATION: {
				SemiAssociation semiAssociation = (SemiAssociation)theEObject;
				T result = caseSemiAssociation(semiAssociation);
				if (result == null) result = caseFeature(semiAssociation);
				if (result == null) result = caseType(semiAssociation);
				if (result == null) result = caseTypeModelElement(semiAssociation);
				if (result == null) result = caseNamedElement(semiAssociation);
				if (result == null) result = caseDefinableElement(semiAssociation);
				if (result == null) result = caseModelElement(semiAssociation);
				if (result == null) result = caseModelPart(semiAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseType(property);
				if (result == null) result = caseTypeModelElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseDefinableElement(property);
				if (result == null) result = caseModelElement(property);
				if (result == null) result = caseModelPart(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_DATA_TYPE: {
				SimpleDataType simpleDataType = (SimpleDataType)theEObject;
				T result = caseSimpleDataType(simpleDataType);
				if (result == null) result = caseDataType(simpleDataType);
				if (result == null) result = caseType(simpleDataType);
				if (result == null) result = caseTypeModelElement(simpleDataType);
				if (result == null) result = caseNamedElement(simpleDataType);
				if (result == null) result = caseDefinableElement(simpleDataType);
				if (result == null) result = caseModelElement(simpleDataType);
				if (result == null) result = caseModelPart(simpleDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseTypeModelElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseDefinableElement(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = caseModelPart(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_ITEM: {
				EnumeratedItem enumeratedItem = (EnumeratedItem)theEObject;
				T result = caseEnumeratedItem(enumeratedItem);
				if (result == null) result = caseNamedElement(enumeratedItem);
				if (result == null) result = caseDefinableElement(enumeratedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModel(TypeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(conml.types.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedType(EnumeratedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeModelElement(TypeModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(conml.types.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semi Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semi Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemiAssociation(SemiAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataType(SimpleDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedItem(EnumeratedItem object) {
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
	public T caseNamedElement(NamedElement object) {
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
	public T caseDescribableElement(DescribableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Definable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinableElement(DefinableElement object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
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

} //TypesSwitch
