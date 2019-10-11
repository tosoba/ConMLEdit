/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.Reference;

import conml.types.Association;
import conml.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.LinkImpl#getInstancedAssociation <em>Instanced Association</em>}</li>
 *   <li>{@link conml.instances.impl.LinkImpl#getHasPrimary <em>Has Primary</em>}</li>
 *   <li>{@link conml.instances.impl.LinkImpl#getHasSecondary <em>Has Secondary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends InstanceImpl implements Link {
	/**
	 * The cached value of the '{@link #getInstancedAssociation() <em>Instanced Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association instancedAssociation;

  /**
	 * The cached value of the '{@link #getHasPrimary() <em>Has Primary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrimary()
	 * @generated
	 * @ordered
	 */
	protected Reference hasPrimary;

	/**
	 * The cached value of the '{@link #getHasSecondary() <em>Has Secondary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecondary()
	 * @generated
	 * @ordered
	 */
	protected Reference hasSecondary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getInstancedAssociation() {
		if (instancedAssociation != null && instancedAssociation.eIsProxy()) {
			InternalEObject oldInstancedAssociation = (InternalEObject)instancedAssociation;
			instancedAssociation = (Association)eResolveProxy(oldInstancedAssociation);
			if (instancedAssociation != oldInstancedAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.LINK__INSTANCED_ASSOCIATION, oldInstancedAssociation, instancedAssociation));
			}
		}
		return instancedAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetInstancedAssociation() {
		return instancedAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancedAssociation(Association newInstancedAssociation, NotificationChain msgs) {
		Association oldInstancedAssociation = instancedAssociation;
		instancedAssociation = newInstancedAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__INSTANCED_ASSOCIATION, oldInstancedAssociation, newInstancedAssociation);
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
	public void setInstancedAssociation(Association newInstancedAssociation) {
		if (newInstancedAssociation != instancedAssociation) {
			NotificationChain msgs = null;
			if (instancedAssociation != null)
				msgs = ((InternalEObject)instancedAssociation).eInverseRemove(this, TypesPackage.ASSOCIATION__INSTANCE_LINKS, Association.class, msgs);
			if (newInstancedAssociation != null)
				msgs = ((InternalEObject)newInstancedAssociation).eInverseAdd(this, TypesPackage.ASSOCIATION__INSTANCE_LINKS, Association.class, msgs);
			msgs = basicSetInstancedAssociation(newInstancedAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__INSTANCED_ASSOCIATION, newInstancedAssociation, newInstancedAssociation));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getHasPrimary() {
		if (hasPrimary != null && hasPrimary.eIsProxy()) {
			InternalEObject oldHasPrimary = (InternalEObject)hasPrimary;
			hasPrimary = (Reference)eResolveProxy(oldHasPrimary);
			if (hasPrimary != oldHasPrimary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.LINK__HAS_PRIMARY, oldHasPrimary, hasPrimary));
			}
		}
		return hasPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetHasPrimary() {
		return hasPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPrimary(Reference newHasPrimary, NotificationChain msgs) {
		Reference oldHasPrimary = hasPrimary;
		hasPrimary = newHasPrimary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__HAS_PRIMARY, oldHasPrimary, newHasPrimary);
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
	public void setHasPrimary(Reference newHasPrimary) {
		if (newHasPrimary != hasPrimary) {
			NotificationChain msgs = null;
			if (hasPrimary != null)
				msgs = ((InternalEObject)hasPrimary).eInverseRemove(this, InstancesPackage.REFERENCE__IS_PRIMARY_IN, Reference.class, msgs);
			if (newHasPrimary != null)
				msgs = ((InternalEObject)newHasPrimary).eInverseAdd(this, InstancesPackage.REFERENCE__IS_PRIMARY_IN, Reference.class, msgs);
			msgs = basicSetHasPrimary(newHasPrimary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__HAS_PRIMARY, newHasPrimary, newHasPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getHasSecondary() {
		if (hasSecondary != null && hasSecondary.eIsProxy()) {
			InternalEObject oldHasSecondary = (InternalEObject)hasSecondary;
			hasSecondary = (Reference)eResolveProxy(oldHasSecondary);
			if (hasSecondary != oldHasSecondary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.LINK__HAS_SECONDARY, oldHasSecondary, hasSecondary));
			}
		}
		return hasSecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetHasSecondary() {
		return hasSecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSecondary(Reference newHasSecondary, NotificationChain msgs) {
		Reference oldHasSecondary = hasSecondary;
		hasSecondary = newHasSecondary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__HAS_SECONDARY, oldHasSecondary, newHasSecondary);
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
	public void setHasSecondary(Reference newHasSecondary) {
		if (newHasSecondary != hasSecondary) {
			NotificationChain msgs = null;
			if (hasSecondary != null)
				msgs = ((InternalEObject)hasSecondary).eInverseRemove(this, InstancesPackage.REFERENCE__IS_SECONDARY_IN, Reference.class, msgs);
			if (newHasSecondary != null)
				msgs = ((InternalEObject)newHasSecondary).eInverseAdd(this, InstancesPackage.REFERENCE__IS_SECONDARY_IN, Reference.class, msgs);
			msgs = basicSetHasSecondary(newHasSecondary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__HAS_SECONDARY, newHasSecondary, newHasSecondary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.LINK__INSTANCED_ASSOCIATION:
				if (instancedAssociation != null)
					msgs = ((InternalEObject)instancedAssociation).eInverseRemove(this, TypesPackage.ASSOCIATION__INSTANCE_LINKS, Association.class, msgs);
				return basicSetInstancedAssociation((Association)otherEnd, msgs);
			case InstancesPackage.LINK__HAS_PRIMARY:
				if (hasPrimary != null)
					msgs = ((InternalEObject)hasPrimary).eInverseRemove(this, InstancesPackage.REFERENCE__IS_PRIMARY_IN, Reference.class, msgs);
				return basicSetHasPrimary((Reference)otherEnd, msgs);
			case InstancesPackage.LINK__HAS_SECONDARY:
				if (hasSecondary != null)
					msgs = ((InternalEObject)hasSecondary).eInverseRemove(this, InstancesPackage.REFERENCE__IS_SECONDARY_IN, Reference.class, msgs);
				return basicSetHasSecondary((Reference)otherEnd, msgs);
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
			case InstancesPackage.LINK__INSTANCED_ASSOCIATION:
				return basicSetInstancedAssociation(null, msgs);
			case InstancesPackage.LINK__HAS_PRIMARY:
				return basicSetHasPrimary(null, msgs);
			case InstancesPackage.LINK__HAS_SECONDARY:
				return basicSetHasSecondary(null, msgs);
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
			case InstancesPackage.LINK__INSTANCED_ASSOCIATION:
				if (resolve) return getInstancedAssociation();
				return basicGetInstancedAssociation();
			case InstancesPackage.LINK__HAS_PRIMARY:
				if (resolve) return getHasPrimary();
				return basicGetHasPrimary();
			case InstancesPackage.LINK__HAS_SECONDARY:
				if (resolve) return getHasSecondary();
				return basicGetHasSecondary();
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
			case InstancesPackage.LINK__INSTANCED_ASSOCIATION:
				setInstancedAssociation((Association)newValue);
				return;
			case InstancesPackage.LINK__HAS_PRIMARY:
				setHasPrimary((Reference)newValue);
				return;
			case InstancesPackage.LINK__HAS_SECONDARY:
				setHasSecondary((Reference)newValue);
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
			case InstancesPackage.LINK__INSTANCED_ASSOCIATION:
				setInstancedAssociation((Association)null);
				return;
			case InstancesPackage.LINK__HAS_PRIMARY:
				setHasPrimary((Reference)null);
				return;
			case InstancesPackage.LINK__HAS_SECONDARY:
				setHasSecondary((Reference)null);
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
			case InstancesPackage.LINK__INSTANCED_ASSOCIATION:
				return instancedAssociation != null;
			case InstancesPackage.LINK__HAS_PRIMARY:
				return hasPrimary != null;
			case InstancesPackage.LINK__HAS_SECONDARY:
				return hasSecondary != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
