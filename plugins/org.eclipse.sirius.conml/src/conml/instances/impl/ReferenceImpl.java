/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.Link;
import conml.instances.Reference;

import conml.instances.ReferenceSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getReferredObject <em>Referred Object</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getPrimaryLink <em>Primary Link</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getSecondaryLink <em>Secondary Link</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getOwnerReferenceSet <em>Owner Reference Set</em>}</li>
 *   <li>{@link conml.instances.impl.ReferenceImpl#getInverseReference <em>Inverse Reference</em>}</li>
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
	 * The cached value of the '{@link #getPrimaryLink() <em>Primary Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryLink()
	 * @generated
	 * @ordered
	 */
	protected Link primaryLink;

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
	 * The cached value of the '{@link #getInverseReference() <em>Inverse Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseReference()
	 * @generated
	 * @ordered
	 */
	protected Reference inverseReference;

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
	public Link getPrimaryLink() {
		if (primaryLink != null && primaryLink.eIsProxy()) {
			InternalEObject oldPrimaryLink = (InternalEObject)primaryLink;
			primaryLink = (Link)eResolveProxy(oldPrimaryLink);
			if (primaryLink != oldPrimaryLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__PRIMARY_LINK, oldPrimaryLink, primaryLink));
			}
		}
		return primaryLink;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetPrimaryLink() {
		return primaryLink;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryLink(Link newPrimaryLink, NotificationChain msgs) {
		Link oldPrimaryLink = primaryLink;
		primaryLink = newPrimaryLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__PRIMARY_LINK, oldPrimaryLink, newPrimaryLink);
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
	public void setPrimaryLink(Link newPrimaryLink) {
		if (newPrimaryLink != primaryLink) {
			NotificationChain msgs = null;
			if (primaryLink != null)
				msgs = ((InternalEObject)primaryLink).eInverseRemove(this, InstancesPackage.LINK__PRIMARY_REFERENCE, Link.class, msgs);
			if (newPrimaryLink != null)
				msgs = ((InternalEObject)newPrimaryLink).eInverseAdd(this, InstancesPackage.LINK__PRIMARY_REFERENCE, Link.class, msgs);
			msgs = basicSetPrimaryLink(newPrimaryLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__PRIMARY_LINK, newPrimaryLink, newPrimaryLink));
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
	public ReferenceSet getOwnerReferenceSet() {
		if (eContainerFeatureID() != InstancesPackage.REFERENCE__OWNER_REFERENCE_SET) return null;
		return (ReferenceSet)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerReferenceSet(ReferenceSet newOwnerReferenceSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerReferenceSet, InstancesPackage.REFERENCE__OWNER_REFERENCE_SET, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerReferenceSet(ReferenceSet newOwnerReferenceSet) {
		if (newOwnerReferenceSet != eInternalContainer() || (eContainerFeatureID() != InstancesPackage.REFERENCE__OWNER_REFERENCE_SET && newOwnerReferenceSet != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerReferenceSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerReferenceSet != null)
				msgs = ((InternalEObject)newOwnerReferenceSet).eInverseAdd(this, InstancesPackage.REFERENCE_SET__REFERENCES, ReferenceSet.class, msgs);
			msgs = basicSetOwnerReferenceSet(newOwnerReferenceSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__OWNER_REFERENCE_SET, newOwnerReferenceSet, newOwnerReferenceSet));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInverseReference() {
		if (inverseReference != null && inverseReference.eIsProxy()) {
			InternalEObject oldInverseReference = (InternalEObject)inverseReference;
			inverseReference = (Reference)eResolveProxy(oldInverseReference);
			if (inverseReference != oldInverseReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.REFERENCE__INVERSE_REFERENCE, oldInverseReference, inverseReference));
			}
		}
		return inverseReference;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetInverseReference() {
		return inverseReference;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverseReference(Reference newInverseReference) {
		Reference oldInverseReference = inverseReference;
		inverseReference = newInverseReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.REFERENCE__INVERSE_REFERENCE, oldInverseReference, inverseReference));
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
			case InstancesPackage.REFERENCE__PRIMARY_LINK:
				if (primaryLink != null)
					msgs = ((InternalEObject)primaryLink).eInverseRemove(this, InstancesPackage.LINK__PRIMARY_REFERENCE, Link.class, msgs);
				return basicSetPrimaryLink((Link)otherEnd, msgs);
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				if (secondaryLink != null)
					msgs = ((InternalEObject)secondaryLink).eInverseRemove(this, InstancesPackage.LINK__SECONDARY_REFERENCE, Link.class, msgs);
				return basicSetSecondaryLink((Link)otherEnd, msgs);
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerReferenceSet((ReferenceSet)otherEnd, msgs);
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
			case InstancesPackage.REFERENCE__PRIMARY_LINK:
				return basicSetPrimaryLink(null, msgs);
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				return basicSetSecondaryLink(null, msgs);
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				return basicSetOwnerReferenceSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				return eInternalContainer().eInverseRemove(this, InstancesPackage.REFERENCE_SET__REFERENCES, ReferenceSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case InstancesPackage.REFERENCE__PRIMARY_LINK:
				if (resolve) return getPrimaryLink();
				return basicGetPrimaryLink();
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				if (resolve) return getSecondaryLink();
				return basicGetSecondaryLink();
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				return getOwnerReferenceSet();
			case InstancesPackage.REFERENCE__INVERSE_REFERENCE:
				if (resolve) return getInverseReference();
				return basicGetInverseReference();
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
			case InstancesPackage.REFERENCE__PRIMARY_LINK:
				setPrimaryLink((Link)newValue);
				return;
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				setSecondaryLink((Link)newValue);
				return;
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				setOwnerReferenceSet((ReferenceSet)newValue);
				return;
			case InstancesPackage.REFERENCE__INVERSE_REFERENCE:
				setInverseReference((Reference)newValue);
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
			case InstancesPackage.REFERENCE__PRIMARY_LINK:
				setPrimaryLink((Link)null);
				return;
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				setSecondaryLink((Link)null);
				return;
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				setOwnerReferenceSet((ReferenceSet)null);
				return;
			case InstancesPackage.REFERENCE__INVERSE_REFERENCE:
				setInverseReference((Reference)null);
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
			case InstancesPackage.REFERENCE__PRIMARY_LINK:
				return primaryLink != null;
			case InstancesPackage.REFERENCE__SECONDARY_LINK:
				return secondaryLink != null;
			case InstancesPackage.REFERENCE__OWNER_REFERENCE_SET:
				return getOwnerReferenceSet() != null;
			case InstancesPackage.REFERENCE__INVERSE_REFERENCE:
				return inverseReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
