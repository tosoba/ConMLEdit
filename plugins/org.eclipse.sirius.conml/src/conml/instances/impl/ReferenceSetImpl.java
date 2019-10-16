/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.ReferenceSet;

import conml.types.SemiAssociation;
import conml.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ReferenceSetImpl#getInstancedSemiAssociation <em>Instanced Semi Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSetImpl extends FacetSetImpl implements ReferenceSet {
	/**
	 * The cached value of the '{@link #getInstancedSemiAssociation() <em>Instanced Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedSemiAssociation()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation instancedSemiAssociation;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.REFERENCE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getInstancedSemiAssociation() {
		if (instancedSemiAssociation != null && instancedSemiAssociation.eIsProxy()) {
			InternalEObject oldInstancedSemiAssociation = (InternalEObject)instancedSemiAssociation;
			instancedSemiAssociation = (SemiAssociation)eResolveProxy(oldInstancedSemiAssociation);
			if (instancedSemiAssociation != oldInstancedSemiAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION, oldInstancedSemiAssociation, instancedSemiAssociation));
			}
		}
		return instancedSemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetInstancedSemiAssociation() {
		return instancedSemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancedSemiAssociation(SemiAssociation newInstancedSemiAssociation, NotificationChain msgs) {
		SemiAssociation oldInstancedSemiAssociation = instancedSemiAssociation;
		instancedSemiAssociation = newInstancedSemiAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION, oldInstancedSemiAssociation, newInstancedSemiAssociation);
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
	public void setInstancedSemiAssociation(SemiAssociation newInstancedSemiAssociation) {
		if (newInstancedSemiAssociation != instancedSemiAssociation) {
			NotificationChain msgs = null;
			if (instancedSemiAssociation != null)
				msgs = ((InternalEObject)instancedSemiAssociation).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS, SemiAssociation.class, msgs);
			if (newInstancedSemiAssociation != null)
				msgs = ((InternalEObject)newInstancedSemiAssociation).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS, SemiAssociation.class, msgs);
			msgs = basicSetInstancedSemiAssociation(newInstancedSemiAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION, newInstancedSemiAssociation, newInstancedSemiAssociation));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION:
				if (instancedSemiAssociation != null)
					msgs = ((InternalEObject)instancedSemiAssociation).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS, SemiAssociation.class, msgs);
				return basicSetInstancedSemiAssociation((SemiAssociation)otherEnd, msgs);
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
			case InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION:
				return basicSetInstancedSemiAssociation(null, msgs);
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
			case InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION:
				if (resolve) return getInstancedSemiAssociation();
				return basicGetInstancedSemiAssociation();
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
			case InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION:
				setInstancedSemiAssociation((SemiAssociation)newValue);
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
			case InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION:
				setInstancedSemiAssociation((SemiAssociation)null);
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
			case InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION:
				return instancedSemiAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceSetImpl
