/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.ValueSet;

import conml.types.Attribute;
import conml.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ValueSetImpl#getInstancedAttribute <em>Instanced Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetImpl extends FacetSetImpl implements ValueSet {
	/**
	 * The cached value of the '{@link #getInstancedAttribute() <em>Instanced Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute instancedAttribute;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getInstancedAttribute() {
		if (instancedAttribute != null && instancedAttribute.eIsProxy()) {
			InternalEObject oldInstancedAttribute = (InternalEObject)instancedAttribute;
			instancedAttribute = (Attribute)eResolveProxy(oldInstancedAttribute);
			if (instancedAttribute != oldInstancedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE, oldInstancedAttribute, instancedAttribute));
			}
		}
		return instancedAttribute;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetInstancedAttribute() {
		return instancedAttribute;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancedAttribute(Attribute newInstancedAttribute, NotificationChain msgs) {
		Attribute oldInstancedAttribute = instancedAttribute;
		instancedAttribute = newInstancedAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE, oldInstancedAttribute, newInstancedAttribute);
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
	public void setInstancedAttribute(Attribute newInstancedAttribute) {
		if (newInstancedAttribute != instancedAttribute) {
			NotificationChain msgs = null;
			if (instancedAttribute != null)
				msgs = ((InternalEObject)instancedAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, Attribute.class, msgs);
			if (newInstancedAttribute != null)
				msgs = ((InternalEObject)newInstancedAttribute).eInverseAdd(this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, Attribute.class, msgs);
			msgs = basicSetInstancedAttribute(newInstancedAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE, newInstancedAttribute, newInstancedAttribute));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				if (instancedAttribute != null)
					msgs = ((InternalEObject)instancedAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, Attribute.class, msgs);
				return basicSetInstancedAttribute((Attribute)otherEnd, msgs);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				return basicSetInstancedAttribute(null, msgs);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				if (resolve) return getInstancedAttribute();
				return basicGetInstancedAttribute();
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				setInstancedAttribute((Attribute)newValue);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				setInstancedAttribute((Attribute)null);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				return instancedAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetImpl
