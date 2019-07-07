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
 *   <li>{@link conml.instances.impl.LinkImpl#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link conml.instances.impl.LinkImpl#getHasPrimary <em>Has Primary</em>}</li>
 *   <li>{@link conml.instances.impl.LinkImpl#getHasSecondary <em>Has Secondary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends InstanceImpl implements Link {
	/**
	 * The cached value of the '{@link #getIsInstanceOf() <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected Association isInstanceOf;

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
	public Association getIsInstanceOf() {
		if (isInstanceOf != null && isInstanceOf.eIsProxy()) {
			InternalEObject oldIsInstanceOf = (InternalEObject)isInstanceOf;
			isInstanceOf = (Association)eResolveProxy(oldIsInstanceOf);
			if (isInstanceOf != oldIsInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.LINK__IS_INSTANCE_OF, oldIsInstanceOf, isInstanceOf));
			}
		}
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetIsInstanceOf() {
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInstanceOf(Association newIsInstanceOf, NotificationChain msgs) {
		Association oldIsInstanceOf = isInstanceOf;
		isInstanceOf = newIsInstanceOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__IS_INSTANCE_OF, oldIsInstanceOf, newIsInstanceOf);
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
	public void setIsInstanceOf(Association newIsInstanceOf) {
		if (newIsInstanceOf != isInstanceOf) {
			NotificationChain msgs = null;
			if (isInstanceOf != null)
				msgs = ((InternalEObject)isInstanceOf).eInverseRemove(this, TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS, Association.class, msgs);
			if (newIsInstanceOf != null)
				msgs = ((InternalEObject)newIsInstanceOf).eInverseAdd(this, TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS, Association.class, msgs);
			msgs = basicSetIsInstanceOf(newIsInstanceOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__IS_INSTANCE_OF, newIsInstanceOf, newIsInstanceOf));
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
			case InstancesPackage.LINK__IS_INSTANCE_OF:
				if (isInstanceOf != null)
					msgs = ((InternalEObject)isInstanceOf).eInverseRemove(this, TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS, Association.class, msgs);
				return basicSetIsInstanceOf((Association)otherEnd, msgs);
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
			case InstancesPackage.LINK__IS_INSTANCE_OF:
				return basicSetIsInstanceOf(null, msgs);
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
			case InstancesPackage.LINK__IS_INSTANCE_OF:
				if (resolve) return getIsInstanceOf();
				return basicGetIsInstanceOf();
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
			case InstancesPackage.LINK__IS_INSTANCE_OF:
				setIsInstanceOf((Association)newValue);
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
			case InstancesPackage.LINK__IS_INSTANCE_OF:
				setIsInstanceOf((Association)null);
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
			case InstancesPackage.LINK__IS_INSTANCE_OF:
				return isInstanceOf != null;
			case InstancesPackage.LINK__HAS_PRIMARY:
				return hasPrimary != null;
			case InstancesPackage.LINK__HAS_SECONDARY:
				return hasSecondary != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
