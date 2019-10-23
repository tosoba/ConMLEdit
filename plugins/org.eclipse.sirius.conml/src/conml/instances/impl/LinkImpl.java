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
 *   <li>{@link conml.instances.impl.LinkImpl#getPrimaryReference <em>Primary Reference</em>}</li>
 *   <li>{@link conml.instances.impl.LinkImpl#getSecondaryReference <em>Secondary Reference</em>}</li>
 *   <li>{@link conml.instances.impl.LinkImpl#isCompact <em>Compact</em>}</li>
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
	 * The cached value of the '{@link #getPrimaryReference() <em>Primary Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReference()
	 * @generated
	 * @ordered
	 */
	protected Reference primaryReference;

  /**
	 * The cached value of the '{@link #getSecondaryReference() <em>Secondary Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryReference()
	 * @generated
	 * @ordered
	 */
	protected Reference secondaryReference;

    /**
	 * The default value of the '{@link #isCompact() <em>Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPACT_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isCompact() <em>Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompact()
	 * @generated
	 * @ordered
	 */
	protected boolean compact = COMPACT_EDEFAULT;

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
	public Reference getPrimaryReference() {
		if (primaryReference != null && primaryReference.eIsProxy()) {
			InternalEObject oldPrimaryReference = (InternalEObject)primaryReference;
			primaryReference = (Reference)eResolveProxy(oldPrimaryReference);
			if (primaryReference != oldPrimaryReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.LINK__PRIMARY_REFERENCE, oldPrimaryReference, primaryReference));
			}
		}
		return primaryReference;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetPrimaryReference() {
		return primaryReference;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryReference(Reference newPrimaryReference, NotificationChain msgs) {
		Reference oldPrimaryReference = primaryReference;
		primaryReference = newPrimaryReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__PRIMARY_REFERENCE, oldPrimaryReference, newPrimaryReference);
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
	public void setPrimaryReference(Reference newPrimaryReference) {
		if (newPrimaryReference != primaryReference) {
			NotificationChain msgs = null;
			if (primaryReference != null)
				msgs = ((InternalEObject)primaryReference).eInverseRemove(this, InstancesPackage.REFERENCE__PRIMARY_IN_LINK, Reference.class, msgs);
			if (newPrimaryReference != null)
				msgs = ((InternalEObject)newPrimaryReference).eInverseAdd(this, InstancesPackage.REFERENCE__PRIMARY_IN_LINK, Reference.class, msgs);
			msgs = basicSetPrimaryReference(newPrimaryReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__PRIMARY_REFERENCE, newPrimaryReference, newPrimaryReference));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSecondaryReference() {
		if (secondaryReference != null && secondaryReference.eIsProxy()) {
			InternalEObject oldSecondaryReference = (InternalEObject)secondaryReference;
			secondaryReference = (Reference)eResolveProxy(oldSecondaryReference);
			if (secondaryReference != oldSecondaryReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.LINK__SECONDARY_REFERENCE, oldSecondaryReference, secondaryReference));
			}
		}
		return secondaryReference;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetSecondaryReference() {
		return secondaryReference;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryReference(Reference newSecondaryReference, NotificationChain msgs) {
		Reference oldSecondaryReference = secondaryReference;
		secondaryReference = newSecondaryReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__SECONDARY_REFERENCE, oldSecondaryReference, newSecondaryReference);
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
	public void setSecondaryReference(Reference newSecondaryReference) {
		if (newSecondaryReference != secondaryReference) {
			NotificationChain msgs = null;
			if (secondaryReference != null)
				msgs = ((InternalEObject)secondaryReference).eInverseRemove(this, InstancesPackage.REFERENCE__SECONDARY_LINK, Reference.class, msgs);
			if (newSecondaryReference != null)
				msgs = ((InternalEObject)newSecondaryReference).eInverseAdd(this, InstancesPackage.REFERENCE__SECONDARY_LINK, Reference.class, msgs);
			msgs = basicSetSecondaryReference(newSecondaryReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__SECONDARY_REFERENCE, newSecondaryReference, newSecondaryReference));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCompact() {
		return compact;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompact(boolean newCompact) {
		boolean oldCompact = compact;
		compact = newCompact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.LINK__COMPACT, oldCompact, compact));
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
			case InstancesPackage.LINK__PRIMARY_REFERENCE:
				if (primaryReference != null)
					msgs = ((InternalEObject)primaryReference).eInverseRemove(this, InstancesPackage.REFERENCE__PRIMARY_IN_LINK, Reference.class, msgs);
				return basicSetPrimaryReference((Reference)otherEnd, msgs);
			case InstancesPackage.LINK__SECONDARY_REFERENCE:
				if (secondaryReference != null)
					msgs = ((InternalEObject)secondaryReference).eInverseRemove(this, InstancesPackage.REFERENCE__SECONDARY_LINK, Reference.class, msgs);
				return basicSetSecondaryReference((Reference)otherEnd, msgs);
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
			case InstancesPackage.LINK__PRIMARY_REFERENCE:
				return basicSetPrimaryReference(null, msgs);
			case InstancesPackage.LINK__SECONDARY_REFERENCE:
				return basicSetSecondaryReference(null, msgs);
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
			case InstancesPackage.LINK__PRIMARY_REFERENCE:
				if (resolve) return getPrimaryReference();
				return basicGetPrimaryReference();
			case InstancesPackage.LINK__SECONDARY_REFERENCE:
				if (resolve) return getSecondaryReference();
				return basicGetSecondaryReference();
			case InstancesPackage.LINK__COMPACT:
				return isCompact();
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
			case InstancesPackage.LINK__PRIMARY_REFERENCE:
				setPrimaryReference((Reference)newValue);
				return;
			case InstancesPackage.LINK__SECONDARY_REFERENCE:
				setSecondaryReference((Reference)newValue);
				return;
			case InstancesPackage.LINK__COMPACT:
				setCompact((Boolean)newValue);
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
			case InstancesPackage.LINK__PRIMARY_REFERENCE:
				setPrimaryReference((Reference)null);
				return;
			case InstancesPackage.LINK__SECONDARY_REFERENCE:
				setSecondaryReference((Reference)null);
				return;
			case InstancesPackage.LINK__COMPACT:
				setCompact(COMPACT_EDEFAULT);
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
			case InstancesPackage.LINK__PRIMARY_REFERENCE:
				return primaryReference != null;
			case InstancesPackage.LINK__SECONDARY_REFERENCE:
				return secondaryReference != null;
			case InstancesPackage.LINK__COMPACT:
				return compact != COMPACT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (compact: ");
		result.append(compact);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
