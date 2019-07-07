/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.Reference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getIsInverseOf <em>Is Inverse Of</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getIsPrimaryIn <em>Is Primary In</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getIsSecondaryIn <em>Is Secondary In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends FacetImpl implements Reference {
	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object refersTo;

	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected Reference inverse;

	/**
	 * The cached value of the '{@link #getIsInverseOf() <em>Is Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverseOf()
	 * @generated
	 * @ordered
	 */
	protected Reference isInverseOf;

	/**
	 * The cached value of the '{@link #getIsPrimaryIn() <em>Is Primary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimaryIn()
	 * @generated
	 * @ordered
	 */
	protected Link isPrimaryIn;

	/**
	 * The cached value of the '{@link #getIsSecondaryIn() <em>Is Secondary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSecondaryIn()
	 * @generated
	 * @ordered
	 */
	protected Link isSecondaryIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (conml.instances.Object)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefersTo(conml.instances.Object newRefersTo, NotificationChain msgs) {
		conml.instances.Object oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__REFERS_TO, oldRefersTo, newRefersTo);
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
	public void setRefersTo(conml.instances.Object newRefersTo) {
		if (newRefersTo != refersTo) {
			NotificationChain msgs = null;
			if (refersTo != null)
				msgs = ((InternalEObject)refersTo).eInverseRemove(this, InstancesPackage.OBJECT__IS_OPPOSITE_IN, conml.instances.Object.class, msgs);
			if (newRefersTo != null)
				msgs = ((InternalEObject)newRefersTo).eInverseAdd(this, InstancesPackage.OBJECT__IS_OPPOSITE_IN, conml.instances.Object.class, msgs);
			msgs = basicSetRefersTo(newRefersTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__REFERS_TO, newRefersTo, newRefersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInverse() {
		if (inverse != null && inverse.eIsProxy()) {
			InternalEObject oldInverse = (InternalEObject)inverse;
			inverse = (Reference)eResolveProxy(oldInverse);
			if (inverse != oldInverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__INVERSE, oldInverse, inverse));
			}
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverse(Reference newInverse, NotificationChain msgs) {
		Reference oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__INVERSE, oldInverse, newInverse);
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
	public void setInverse(Reference newInverse) {
		if (newInverse != inverse) {
			NotificationChain msgs = null;
			if (inverse != null)
				msgs = ((InternalEObject)inverse).eInverseRemove(this, InstancesPackage.REFERENCE__IS_INVERSE_OF, Reference.class, msgs);
			if (newInverse != null)
				msgs = ((InternalEObject)newInverse).eInverseAdd(this, InstancesPackage.REFERENCE__IS_INVERSE_OF, Reference.class, msgs);
			msgs = basicSetInverse(newInverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__INVERSE, newInverse, newInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIsInverseOf() {
		if (isInverseOf != null && isInverseOf.eIsProxy()) {
			InternalEObject oldIsInverseOf = (InternalEObject)isInverseOf;
			isInverseOf = (Reference)eResolveProxy(oldIsInverseOf);
			if (isInverseOf != oldIsInverseOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__IS_INVERSE_OF, oldIsInverseOf, isInverseOf));
			}
		}
		return isInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetIsInverseOf() {
		return isInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInverseOf(Reference newIsInverseOf, NotificationChain msgs) {
		Reference oldIsInverseOf = isInverseOf;
		isInverseOf = newIsInverseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_INVERSE_OF, oldIsInverseOf, newIsInverseOf);
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
	public void setIsInverseOf(Reference newIsInverseOf) {
		if (newIsInverseOf != isInverseOf) {
			NotificationChain msgs = null;
			if (isInverseOf != null)
				msgs = ((InternalEObject)isInverseOf).eInverseRemove(this, InstancesPackage.REFERENCE__INVERSE, Reference.class, msgs);
			if (newIsInverseOf != null)
				msgs = ((InternalEObject)newIsInverseOf).eInverseAdd(this, InstancesPackage.REFERENCE__INVERSE, Reference.class, msgs);
			msgs = basicSetIsInverseOf(newIsInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_INVERSE_OF, newIsInverseOf, newIsInverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getIsPrimaryIn() {
		if (isPrimaryIn != null && isPrimaryIn.eIsProxy()) {
			InternalEObject oldIsPrimaryIn = (InternalEObject)isPrimaryIn;
			isPrimaryIn = (Link)eResolveProxy(oldIsPrimaryIn);
			if (isPrimaryIn != oldIsPrimaryIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__IS_PRIMARY_IN, oldIsPrimaryIn, isPrimaryIn));
			}
		}
		return isPrimaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetIsPrimaryIn() {
		return isPrimaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPrimaryIn(Link newIsPrimaryIn, NotificationChain msgs) {
		Link oldIsPrimaryIn = isPrimaryIn;
		isPrimaryIn = newIsPrimaryIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_PRIMARY_IN, oldIsPrimaryIn, newIsPrimaryIn);
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
	public void setIsPrimaryIn(Link newIsPrimaryIn) {
		if (newIsPrimaryIn != isPrimaryIn) {
			NotificationChain msgs = null;
			if (isPrimaryIn != null)
				msgs = ((InternalEObject)isPrimaryIn).eInverseRemove(this, InstancesPackage.LINK__HAS_PRIMARY, Link.class, msgs);
			if (newIsPrimaryIn != null)
				msgs = ((InternalEObject)newIsPrimaryIn).eInverseAdd(this, InstancesPackage.LINK__HAS_PRIMARY, Link.class, msgs);
			msgs = basicSetIsPrimaryIn(newIsPrimaryIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_PRIMARY_IN, newIsPrimaryIn, newIsPrimaryIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getIsSecondaryIn() {
		if (isSecondaryIn != null && isSecondaryIn.eIsProxy()) {
			InternalEObject oldIsSecondaryIn = (InternalEObject)isSecondaryIn;
			isSecondaryIn = (Link)eResolveProxy(oldIsSecondaryIn);
			if (isSecondaryIn != oldIsSecondaryIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__IS_SECONDARY_IN, oldIsSecondaryIn, isSecondaryIn));
			}
		}
		return isSecondaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetIsSecondaryIn() {
		return isSecondaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSecondaryIn(Link newIsSecondaryIn, NotificationChain msgs) {
		Link oldIsSecondaryIn = isSecondaryIn;
		isSecondaryIn = newIsSecondaryIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_SECONDARY_IN, oldIsSecondaryIn, newIsSecondaryIn);
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
	public void setIsSecondaryIn(Link newIsSecondaryIn) {
		if (newIsSecondaryIn != isSecondaryIn) {
			NotificationChain msgs = null;
			if (isSecondaryIn != null)
				msgs = ((InternalEObject)isSecondaryIn).eInverseRemove(this, InstancesPackage.LINK__HAS_SECONDARY, Link.class, msgs);
			if (newIsSecondaryIn != null)
				msgs = ((InternalEObject)newIsSecondaryIn).eInverseAdd(this, InstancesPackage.LINK__HAS_SECONDARY, Link.class, msgs);
			msgs = basicSetIsSecondaryIn(newIsSecondaryIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_SECONDARY_IN, newIsSecondaryIn, newIsSecondaryIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.REFERENCE__REFERS_TO:
				if (refersTo != null)
					msgs = ((InternalEObject)refersTo).eInverseRemove(this, InstancesPackage.OBJECT__IS_OPPOSITE_IN, conml.instances.Object.class, msgs);
				return basicSetRefersTo((conml.instances.Object)otherEnd, msgs);
			case InstancesPackage.REFERENCE__INVERSE:
				if (inverse != null)
					msgs = ((InternalEObject)inverse).eInverseRemove(this, InstancesPackage.REFERENCE__IS_INVERSE_OF, Reference.class, msgs);
				return basicSetInverse((Reference)otherEnd, msgs);
			case InstancesPackage.REFERENCE__IS_INVERSE_OF:
				if (isInverseOf != null)
					msgs = ((InternalEObject)isInverseOf).eInverseRemove(this, InstancesPackage.REFERENCE__INVERSE, Reference.class, msgs);
				return basicSetIsInverseOf((Reference)otherEnd, msgs);
			case InstancesPackage.REFERENCE__IS_PRIMARY_IN:
				if (isPrimaryIn != null)
					msgs = ((InternalEObject)isPrimaryIn).eInverseRemove(this, InstancesPackage.LINK__HAS_PRIMARY, Link.class, msgs);
				return basicSetIsPrimaryIn((Link)otherEnd, msgs);
			case InstancesPackage.REFERENCE__IS_SECONDARY_IN:
				if (isSecondaryIn != null)
					msgs = ((InternalEObject)isSecondaryIn).eInverseRemove(this, InstancesPackage.LINK__HAS_SECONDARY, Link.class, msgs);
				return basicSetIsSecondaryIn((Link)otherEnd, msgs);
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
			case InstancesPackage.REFERENCE__REFERS_TO:
				return basicSetRefersTo(null, msgs);
			case InstancesPackage.REFERENCE__INVERSE:
				return basicSetInverse(null, msgs);
			case InstancesPackage.REFERENCE__IS_INVERSE_OF:
				return basicSetIsInverseOf(null, msgs);
			case InstancesPackage.REFERENCE__IS_PRIMARY_IN:
				return basicSetIsPrimaryIn(null, msgs);
			case InstancesPackage.REFERENCE__IS_SECONDARY_IN:
				return basicSetIsSecondaryIn(null, msgs);
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
			case InstancesPackage.REFERENCE__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case InstancesPackage.REFERENCE__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case InstancesPackage.REFERENCE__IS_INVERSE_OF:
				if (resolve) return getIsInverseOf();
				return basicGetIsInverseOf();
			case InstancesPackage.REFERENCE__IS_PRIMARY_IN:
				if (resolve) return getIsPrimaryIn();
				return basicGetIsPrimaryIn();
			case InstancesPackage.REFERENCE__IS_SECONDARY_IN:
				if (resolve) return getIsSecondaryIn();
				return basicGetIsSecondaryIn();
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
			case InstancesPackage.REFERENCE__REFERS_TO:
				setRefersTo((conml.instances.Object)newValue);
				return;
			case InstancesPackage.REFERENCE__INVERSE:
				setInverse((Reference)newValue);
				return;
			case InstancesPackage.REFERENCE__IS_INVERSE_OF:
				setIsInverseOf((Reference)newValue);
				return;
			case InstancesPackage.REFERENCE__IS_PRIMARY_IN:
				setIsPrimaryIn((Link)newValue);
				return;
			case InstancesPackage.REFERENCE__IS_SECONDARY_IN:
				setIsSecondaryIn((Link)newValue);
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
			case InstancesPackage.REFERENCE__REFERS_TO:
				setRefersTo((conml.instances.Object)null);
				return;
			case InstancesPackage.REFERENCE__INVERSE:
				setInverse((Reference)null);
				return;
			case InstancesPackage.REFERENCE__IS_INVERSE_OF:
				setIsInverseOf((Reference)null);
				return;
			case InstancesPackage.REFERENCE__IS_PRIMARY_IN:
				setIsPrimaryIn((Link)null);
				return;
			case InstancesPackage.REFERENCE__IS_SECONDARY_IN:
				setIsSecondaryIn((Link)null);
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
			case InstancesPackage.REFERENCE__REFERS_TO:
				return refersTo != null;
			case InstancesPackage.REFERENCE__INVERSE:
				return inverse != null;
			case InstancesPackage.REFERENCE__IS_INVERSE_OF:
				return isInverseOf != null;
			case InstancesPackage.REFERENCE__IS_PRIMARY_IN:
				return isPrimaryIn != null;
			case InstancesPackage.REFERENCE__IS_SECONDARY_IN:
				return isSecondaryIn != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
