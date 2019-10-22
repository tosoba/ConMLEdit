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
 *   <li>{@link conml.instances.impl.ReferenceImpl#getReferredObject <em>Referred Object</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getIsInverseOfReference <em>Is Inverse Of Reference</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getPrimaryInLink <em>Primary In Link</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getSecondaryLink <em>Secondary Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends FacetImpl implements Reference {
	/**
	 * The cached value of the '{@link #getReferredObject() <em>Referred Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredObject()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object referredObject;

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
	 * The cached value of the '{@link #getIsInverseOfReference() <em>Is Inverse Of Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverseOfReference()
	 * @generated
	 * @ordered
	 */
	protected Reference isInverseOfReference;

  /**
	 * The cached value of the '{@link #getPrimaryInLink() <em>Primary In Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryInLink()
	 * @generated
	 * @ordered
	 */
	protected Link primaryInLink;

  /**
	 * The cached value of the '{@link #getSecondaryLink() <em>Secondary Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryLink()
	 * @generated
	 * @ordered
	 */
	protected Link secondaryLink;

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
	public conml.instances.Object getReferredObject() {
		if (referredObject != null && referredObject.eIsProxy()) {
			InternalEObject oldReferredObject = (InternalEObject)referredObject;
			referredObject = (conml.instances.Object)eResolveProxy(oldReferredObject);
			if (referredObject != oldReferredObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__REFERRED_OBJECT, oldReferredObject, referredObject));
			}
		}
		return referredObject;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetReferredObject() {
		return referredObject;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferredObject(conml.instances.Object newReferredObject, NotificationChain msgs) {
		conml.instances.Object oldReferredObject = referredObject;
		referredObject = newReferredObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__REFERRED_OBJECT, oldReferredObject, newReferredObject);
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
	public void setReferredObject(conml.instances.Object newReferredObject) {
		if (newReferredObject != referredObject) {
			NotificationChain msgs = null;
			if (referredObject != null)
				msgs = ((InternalEObject)referredObject).eInverseRemove(this, InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES, conml.instances.Object.class, msgs);
			if (newReferredObject != null)
				msgs = ((InternalEObject)newReferredObject).eInverseAdd(this, InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES, conml.instances.Object.class, msgs);
			msgs = basicSetReferredObject(newReferredObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__REFERRED_OBJECT, newReferredObject, newReferredObject));
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
				msgs = ((InternalEObject)inverse).eInverseRemove(this, InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE, Reference.class, msgs);
			if (newInverse != null)
				msgs = ((InternalEObject)newInverse).eInverseAdd(this, InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE, Reference.class, msgs);
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
	public Reference getIsInverseOfReference() {
		if (isInverseOfReference != null && isInverseOfReference.eIsProxy()) {
			InternalEObject oldIsInverseOfReference = (InternalEObject)isInverseOfReference;
			isInverseOfReference = (Reference)eResolveProxy(oldIsInverseOfReference);
			if (isInverseOfReference != oldIsInverseOfReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE, oldIsInverseOfReference, isInverseOfReference));
			}
		}
		return isInverseOfReference;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetIsInverseOfReference() {
		return isInverseOfReference;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInverseOfReference(Reference newIsInverseOfReference, NotificationChain msgs) {
		Reference oldIsInverseOfReference = isInverseOfReference;
		isInverseOfReference = newIsInverseOfReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE, oldIsInverseOfReference, newIsInverseOfReference);
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
	public void setIsInverseOfReference(Reference newIsInverseOfReference) {
		if (newIsInverseOfReference != isInverseOfReference) {
			NotificationChain msgs = null;
			if (isInverseOfReference != null)
				msgs = ((InternalEObject)isInverseOfReference).eInverseRemove(this, InstancesPackage.REFERENCE__INVERSE, Reference.class, msgs);
			if (newIsInverseOfReference != null)
				msgs = ((InternalEObject)newIsInverseOfReference).eInverseAdd(this, InstancesPackage.REFERENCE__INVERSE, Reference.class, msgs);
			msgs = basicSetIsInverseOfReference(newIsInverseOfReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE, newIsInverseOfReference, newIsInverseOfReference));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getPrimaryInLink() {
		if (primaryInLink != null && primaryInLink.eIsProxy()) {
			InternalEObject oldPrimaryInLink = (InternalEObject)primaryInLink;
			primaryInLink = (Link)eResolveProxy(oldPrimaryInLink);
			if (primaryInLink != oldPrimaryInLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__PRIMARY_IN_LINK, oldPrimaryInLink, primaryInLink));
			}
		}
		return primaryInLink;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetPrimaryInLink() {
		return primaryInLink;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryInLink(Link newPrimaryInLink, NotificationChain msgs) {
		Link oldPrimaryInLink = primaryInLink;
		primaryInLink = newPrimaryInLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__PRIMARY_IN_LINK, oldPrimaryInLink, newPrimaryInLink);
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
	public void setPrimaryInLink(Link newPrimaryInLink) {
		if (newPrimaryInLink != primaryInLink) {
			NotificationChain msgs = null;
			if (primaryInLink != null)
				msgs = ((InternalEObject)primaryInLink).eInverseRemove(this, InstancesPackage.LINK__PRIMARY_REFERENCE, Link.class, msgs);
			if (newPrimaryInLink != null)
				msgs = ((InternalEObject)newPrimaryInLink).eInverseAdd(this, InstancesPackage.LINK__PRIMARY_REFERENCE, Link.class, msgs);
			msgs = basicSetPrimaryInLink(newPrimaryInLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__PRIMARY_IN_LINK, newPrimaryInLink, newPrimaryInLink));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getSecondaryLink() {
		if (secondaryLink != null && secondaryLink.eIsProxy()) {
			InternalEObject oldSecondaryLink = (InternalEObject)secondaryLink;
			secondaryLink = (Link)eResolveProxy(oldSecondaryLink);
			if (secondaryLink != oldSecondaryLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__SECONDARY_LINK, oldSecondaryLink, secondaryLink));
			}
		}
		return secondaryLink;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetSecondaryLink() {
		return secondaryLink;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryLink(Link newSecondaryLink, NotificationChain msgs) {
		Link oldSecondaryLink = secondaryLink;
		secondaryLink = newSecondaryLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__SECONDARY_LINK, oldSecondaryLink, newSecondaryLink);
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
	public void setSecondaryLink(Link newSecondaryLink) {
		if (newSecondaryLink != secondaryLink) {
			NotificationChain msgs = null;
			if (secondaryLink != null)
				msgs = ((InternalEObject)secondaryLink).eInverseRemove(this, InstancesPackage.LINK__SECONDARY_REFERENCE, Link.class, msgs);
			if (newSecondaryLink != null)
				msgs = ((InternalEObject)newSecondaryLink).eInverseAdd(this, InstancesPackage.LINK__SECONDARY_REFERENCE, Link.class, msgs);
			msgs = basicSetSecondaryLink(newSecondaryLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__SECONDARY_LINK, newSecondaryLink, newSecondaryLink));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.REFERENCE__REFERRED_OBJECT:
				if (referredObject != null)
					msgs = ((InternalEObject)referredObject).eInverseRemove(this, InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES, conml.instances.Object.class, msgs);
				return basicSetReferredObject((conml.instances.Object)otherEnd, msgs);
			case InstancesPackage.REFERENCE__INVERSE:
				if (inverse != null)
					msgs = ((InternalEObject)inverse).eInverseRemove(this, InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE, Reference.class, msgs);
				return basicSetInverse((Reference)otherEnd, msgs);
			case InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE:
				if (isInverseOfReference != null)
					msgs = ((InternalEObject)isInverseOfReference).eInverseRemove(this, InstancesPackage.REFERENCE__INVERSE, Reference.class, msgs);
				return basicSetIsInverseOfReference((Reference)otherEnd, msgs);
			case InstancesPackage.REFERENCE__PRIMARY_IN_LINK:
				if (primaryInLink != null)
					msgs = ((InternalEObject)primaryInLink).eInverseRemove(this, InstancesPackage.LINK__PRIMARY_REFERENCE, Link.class, msgs);
				return basicSetPrimaryInLink((Link)otherEnd, msgs);
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				if (secondaryLink != null)
					msgs = ((InternalEObject)secondaryLink).eInverseRemove(this, InstancesPackage.LINK__SECONDARY_REFERENCE, Link.class, msgs);
				return basicSetSecondaryLink((Link)otherEnd, msgs);
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
			case InstancesPackage.REFERENCE__REFERRED_OBJECT:
				return basicSetReferredObject(null, msgs);
			case InstancesPackage.REFERENCE__INVERSE:
				return basicSetInverse(null, msgs);
			case InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE:
				return basicSetIsInverseOfReference(null, msgs);
			case InstancesPackage.REFERENCE__PRIMARY_IN_LINK:
				return basicSetPrimaryInLink(null, msgs);
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				return basicSetSecondaryLink(null, msgs);
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
			case InstancesPackage.REFERENCE__REFERRED_OBJECT:
				if (resolve) return getReferredObject();
				return basicGetReferredObject();
			case InstancesPackage.REFERENCE__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE:
				if (resolve) return getIsInverseOfReference();
				return basicGetIsInverseOfReference();
			case InstancesPackage.REFERENCE__PRIMARY_IN_LINK:
				if (resolve) return getPrimaryInLink();
				return basicGetPrimaryInLink();
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				if (resolve) return getSecondaryLink();
				return basicGetSecondaryLink();
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
			case InstancesPackage.REFERENCE__REFERRED_OBJECT:
				setReferredObject((conml.instances.Object)newValue);
				return;
			case InstancesPackage.REFERENCE__INVERSE:
				setInverse((Reference)newValue);
				return;
			case InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE:
				setIsInverseOfReference((Reference)newValue);
				return;
			case InstancesPackage.REFERENCE__PRIMARY_IN_LINK:
				setPrimaryInLink((Link)newValue);
				return;
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				setSecondaryLink((Link)newValue);
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
			case InstancesPackage.REFERENCE__REFERRED_OBJECT:
				setReferredObject((conml.instances.Object)null);
				return;
			case InstancesPackage.REFERENCE__INVERSE:
				setInverse((Reference)null);
				return;
			case InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE:
				setIsInverseOfReference((Reference)null);
				return;
			case InstancesPackage.REFERENCE__PRIMARY_IN_LINK:
				setPrimaryInLink((Link)null);
				return;
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				setSecondaryLink((Link)null);
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
			case InstancesPackage.REFERENCE__REFERRED_OBJECT:
				return referredObject != null;
			case InstancesPackage.REFERENCE__INVERSE:
				return inverse != null;
			case InstancesPackage.REFERENCE__IS_INVERSE_OF_REFERENCE:
				return isInverseOfReference != null;
			case InstancesPackage.REFERENCE__PRIMARY_IN_LINK:
				return primaryInLink != null;
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				return secondaryLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
