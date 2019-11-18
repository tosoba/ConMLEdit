/**
 */
package conml.instances.impl;

import conml.impl.ModelElementImpl;

import conml.instances.InstanceModel;
import conml.instances.InstanceModelElement;
import conml.instances.InstancesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.InstanceModelElementImpl#getInstanceModel <em>Instance Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstanceModelElementImpl extends ModelElementImpl implements InstanceModelElement {
	/**
	 * The cached value of the '{@link #getInstanceModel() <em>Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceModel()
	 * @generated
	 * @ordered
	 */
	protected InstanceModel instanceModel;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.INSTANCE_MODEL_ELEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceModel getInstanceModel() {
		if (instanceModel != null && instanceModel.eIsProxy()) {
			InternalEObject oldInstanceModel = (InternalEObject)instanceModel;
			instanceModel = (InstanceModel)eResolveProxy(oldInstanceModel);
			if (instanceModel != oldInstanceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL, oldInstanceModel, instanceModel));
			}
		}
		return instanceModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModel basicGetInstanceModel() {
		return instanceModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceModel(InstanceModel newInstanceModel, NotificationChain msgs) {
		InstanceModel oldInstanceModel = instanceModel;
		instanceModel = newInstanceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL, oldInstanceModel, newInstanceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceModel(InstanceModel newInstanceModel) {
		if (newInstanceModel != instanceModel) {
			NotificationChain msgs = null;
			if (instanceModel != null)
				msgs = ((InternalEObject)instanceModel).eInverseRemove(this, InstancesPackage.INSTANCE_MODEL__ELEMENTS, InstanceModel.class, msgs);
			if (newInstanceModel != null)
				msgs = ((InternalEObject)newInstanceModel).eInverseAdd(this, InstancesPackage.INSTANCE_MODEL__ELEMENTS, InstanceModel.class, msgs);
			msgs = basicSetInstanceModel(newInstanceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL, newInstanceModel, newInstanceModel));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL:
				if (instanceModel != null)
					msgs = ((InternalEObject)instanceModel).eInverseRemove(this, InstancesPackage.INSTANCE_MODEL__ELEMENTS, InstanceModel.class, msgs);
				return basicSetInstanceModel((InstanceModel)otherEnd, msgs);
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
			case InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL:
				return basicSetInstanceModel(null, msgs);
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
			case InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL:
				if (resolve) return getInstanceModel();
				return basicGetInstanceModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL:
				setInstanceModel((InstanceModel)newValue);
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
			case InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL:
				setInstanceModel((InstanceModel)null);
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
			case InstancesPackage.INSTANCE_MODEL_ELEMENT__INSTANCE_MODEL:
				return instanceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceModelElementImpl
