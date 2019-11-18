/**
 */
package conml.instances.impl;

import conml.impl.ModelImpl;

import conml.instances.InstanceModel;
import conml.instances.InstanceModelElement;
import conml.instances.InstancesPackage;

import conml.types.TypeModel;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.InstanceModelImpl#getConformedTypeModels <em>Conformed Type Models</em>}</li>
 *   <li>{@link conml.instances.impl.InstanceModelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceModelImpl extends ModelImpl implements InstanceModel {
	/**
	 * The cached value of the '{@link #getConformedTypeModels() <em>Conformed Type Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformedTypeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> conformedTypeModels;
  /**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceModelElement> elements;
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.INSTANCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeModel> getConformedTypeModels() {
		if (conformedTypeModels == null) {
			conformedTypeModels = new EObjectWithInverseResolvingEList<TypeModel>(TypeModel.class, this, InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS, TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL);
		}
		return conformedTypeModels;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceModelElement> getElements() {
		if (elements == null) {
			elements = new EObjectWithInverseResolvingEList<InstanceModelElement>(InstanceModelElement.class, this, InstancesPackage.INSTANCE_MODEL__ELEMENTS, InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL);
		}
		return elements;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConformedTypeModels()).basicAdd(otherEnd, msgs);
			case InstancesPackage.INSTANCE_MODEL__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS:
				return ((InternalEList<?>)getConformedTypeModels()).basicRemove(otherEnd, msgs);
			case InstancesPackage.INSTANCE_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS:
				return getConformedTypeModels();
			case InstancesPackage.INSTANCE_MODEL__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS:
				getConformedTypeModels().clear();
				getConformedTypeModels().addAll((Collection<? extends TypeModel>)newValue);
				return;
			case InstancesPackage.INSTANCE_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends InstanceModelElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS:
				getConformedTypeModels().clear();
				return;
			case InstancesPackage.INSTANCE_MODEL__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS:
				return conformedTypeModels != null && !conformedTypeModels.isEmpty();
			case InstancesPackage.INSTANCE_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceModelImpl
