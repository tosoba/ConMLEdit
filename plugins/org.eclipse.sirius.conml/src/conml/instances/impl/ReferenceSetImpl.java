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
 *   <li>{@link conml.instances.impl.ReferenceSetImpl#getIsAnInstanceOf <em>Is An Instance Of</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceSetImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSetImpl extends FacetSetImpl implements ReferenceSet {
	/**
	 * The cached value of the '{@link #getIsAnInstanceOf() <em>Is An Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAnInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation isAnInstanceOf;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object owner;

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
	public SemiAssociation getIsAnInstanceOf() {
		if (isAnInstanceOf != null && isAnInstanceOf.eIsProxy()) {
			InternalEObject oldIsAnInstanceOf = (InternalEObject)isAnInstanceOf;
			isAnInstanceOf = (SemiAssociation)eResolveProxy(oldIsAnInstanceOf);
			if (isAnInstanceOf != oldIsAnInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF, oldIsAnInstanceOf, isAnInstanceOf));
			}
		}
		return isAnInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetIsAnInstanceOf() {
		return isAnInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsAnInstanceOf(SemiAssociation newIsAnInstanceOf, NotificationChain msgs) {
		SemiAssociation oldIsAnInstanceOf = isAnInstanceOf;
		isAnInstanceOf = newIsAnInstanceOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF, oldIsAnInstanceOf, newIsAnInstanceOf);
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
	public void setIsAnInstanceOf(SemiAssociation newIsAnInstanceOf) {
		if (newIsAnInstanceOf != isAnInstanceOf) {
			NotificationChain msgs = null;
			if (isAnInstanceOf != null)
				msgs = ((InternalEObject)isAnInstanceOf).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS, SemiAssociation.class, msgs);
			if (newIsAnInstanceOf != null)
				msgs = ((InternalEObject)newIsAnInstanceOf).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS, SemiAssociation.class, msgs);
			msgs = basicSetIsAnInstanceOf(newIsAnInstanceOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF, newIsAnInstanceOf, newIsAnInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (conml.instances.Object)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE_SET__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(conml.instances.Object newOwner, NotificationChain msgs) {
		conml.instances.Object oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE_SET__OWNER, oldOwner, newOwner);
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
	public void setOwner(conml.instances.Object newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, InstancesPackage.OBJECT__OWNS_REFERENCE_SETS, conml.instances.Object.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, InstancesPackage.OBJECT__OWNS_REFERENCE_SETS, conml.instances.Object.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE_SET__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF:
				if (isAnInstanceOf != null)
					msgs = ((InternalEObject)isAnInstanceOf).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS, SemiAssociation.class, msgs);
				return basicSetIsAnInstanceOf((SemiAssociation)otherEnd, msgs);
			case InstancesPackage.REFERENCE_SET__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, InstancesPackage.OBJECT__OWNS_REFERENCE_SETS, conml.instances.Object.class, msgs);
				return basicSetOwner((conml.instances.Object)otherEnd, msgs);
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
			case InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF:
				return basicSetIsAnInstanceOf(null, msgs);
			case InstancesPackage.REFERENCE_SET__OWNER:
				return basicSetOwner(null, msgs);
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
			case InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF:
				if (resolve) return getIsAnInstanceOf();
				return basicGetIsAnInstanceOf();
			case InstancesPackage.REFERENCE_SET__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF:
				setIsAnInstanceOf((SemiAssociation)newValue);
				return;
			case InstancesPackage.REFERENCE_SET__OWNER:
				setOwner((conml.instances.Object)newValue);
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
			case InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF:
				setIsAnInstanceOf((SemiAssociation)null);
				return;
			case InstancesPackage.REFERENCE_SET__OWNER:
				setOwner((conml.instances.Object)null);
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
			case InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF:
				return isAnInstanceOf != null;
			case InstancesPackage.REFERENCE_SET__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceSetImpl
