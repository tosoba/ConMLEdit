/**
 */
package conml.types.impl;

import conml.instances.InstancesPackage;
import conml.instances.Link;

import conml.types.Association;
import conml.types.SemiAssociation;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.AssociationImpl#getHasPrimary <em>Has Primary</em>}</li>
 *   <li>{@link conml.types.impl.AssociationImpl#getHasSecondary <em>Has Secondary</em>}</li>
 *   <li>{@link conml.types.impl.AssociationImpl#getHasInstanceLinks <em>Has Instance Links</em>}</li>
 *   <li>{@link conml.types.impl.AssociationImpl#isIsCompact <em>Is Compact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends TypeImpl implements Association {
	/**
	 * The cached value of the '{@link #getHasPrimary() <em>Has Primary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrimary()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation hasPrimary;

	/**
	 * The cached value of the '{@link #getHasSecondary() <em>Has Secondary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecondary()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation hasSecondary;

	/**
	 * The cached value of the '{@link #getHasInstanceLinks() <em>Has Instance Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstanceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> hasInstanceLinks;

	/**
	 * The default value of the '{@link #isIsCompact() <em>Is Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCompact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCompact() <em>Is Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCompact()
	 * @generated
	 * @ordered
	 */
	protected boolean isCompact = IS_COMPACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getHasPrimary() {
		if (hasPrimary != null && hasPrimary.eIsProxy()) {
			InternalEObject oldHasPrimary = (InternalEObject)hasPrimary;
			hasPrimary = (SemiAssociation)eResolveProxy(oldHasPrimary);
			if (hasPrimary != oldHasPrimary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ASSOCIATION__HAS_PRIMARY, oldHasPrimary, hasPrimary));
			}
		}
		return hasPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetHasPrimary() {
		return hasPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPrimary(SemiAssociation newHasPrimary, NotificationChain msgs) {
		SemiAssociation oldHasPrimary = hasPrimary;
		hasPrimary = newHasPrimary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__HAS_PRIMARY, oldHasPrimary, newHasPrimary);
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
	public void setHasPrimary(SemiAssociation newHasPrimary) {
		if (newHasPrimary != hasPrimary) {
			NotificationChain msgs = null;
			if (hasPrimary != null)
				msgs = ((InternalEObject)hasPrimary).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN, SemiAssociation.class, msgs);
			if (newHasPrimary != null)
				msgs = ((InternalEObject)newHasPrimary).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN, SemiAssociation.class, msgs);
			msgs = basicSetHasPrimary(newHasPrimary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__HAS_PRIMARY, newHasPrimary, newHasPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getHasSecondary() {
		if (hasSecondary != null && hasSecondary.eIsProxy()) {
			InternalEObject oldHasSecondary = (InternalEObject)hasSecondary;
			hasSecondary = (SemiAssociation)eResolveProxy(oldHasSecondary);
			if (hasSecondary != oldHasSecondary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ASSOCIATION__HAS_SECONDARY, oldHasSecondary, hasSecondary));
			}
		}
		return hasSecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetHasSecondary() {
		return hasSecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSecondary(SemiAssociation newHasSecondary, NotificationChain msgs) {
		SemiAssociation oldHasSecondary = hasSecondary;
		hasSecondary = newHasSecondary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__HAS_SECONDARY, oldHasSecondary, newHasSecondary);
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
	public void setHasSecondary(SemiAssociation newHasSecondary) {
		if (newHasSecondary != hasSecondary) {
			NotificationChain msgs = null;
			if (hasSecondary != null)
				msgs = ((InternalEObject)hasSecondary).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN, SemiAssociation.class, msgs);
			if (newHasSecondary != null)
				msgs = ((InternalEObject)newHasSecondary).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN, SemiAssociation.class, msgs);
			msgs = basicSetHasSecondary(newHasSecondary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__HAS_SECONDARY, newHasSecondary, newHasSecondary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getHasInstanceLinks() {
		if (hasInstanceLinks == null) {
			hasInstanceLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS, InstancesPackage.LINK__IS_INSTANCE_OF);
		}
		return hasInstanceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCompact() {
		return isCompact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCompact(boolean newIsCompact) {
		boolean oldIsCompact = isCompact;
		isCompact = newIsCompact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__IS_COMPACT, oldIsCompact, isCompact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ASSOCIATION__HAS_PRIMARY:
				if (hasPrimary != null)
					msgs = ((InternalEObject)hasPrimary).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN, SemiAssociation.class, msgs);
				return basicSetHasPrimary((SemiAssociation)otherEnd, msgs);
			case TypesPackage.ASSOCIATION__HAS_SECONDARY:
				if (hasSecondary != null)
					msgs = ((InternalEObject)hasSecondary).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN, SemiAssociation.class, msgs);
				return basicSetHasSecondary((SemiAssociation)otherEnd, msgs);
			case TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInstanceLinks()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.ASSOCIATION__HAS_PRIMARY:
				return basicSetHasPrimary(null, msgs);
			case TypesPackage.ASSOCIATION__HAS_SECONDARY:
				return basicSetHasSecondary(null, msgs);
			case TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS:
				return ((InternalEList<?>)getHasInstanceLinks()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.ASSOCIATION__HAS_PRIMARY:
				if (resolve) return getHasPrimary();
				return basicGetHasPrimary();
			case TypesPackage.ASSOCIATION__HAS_SECONDARY:
				if (resolve) return getHasSecondary();
				return basicGetHasSecondary();
			case TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS:
				return getHasInstanceLinks();
			case TypesPackage.ASSOCIATION__IS_COMPACT:
				return isIsCompact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.ASSOCIATION__HAS_PRIMARY:
				setHasPrimary((SemiAssociation)newValue);
				return;
			case TypesPackage.ASSOCIATION__HAS_SECONDARY:
				setHasSecondary((SemiAssociation)newValue);
				return;
			case TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS:
				getHasInstanceLinks().clear();
				getHasInstanceLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case TypesPackage.ASSOCIATION__IS_COMPACT:
				setIsCompact((Boolean)newValue);
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
			case TypesPackage.ASSOCIATION__HAS_PRIMARY:
				setHasPrimary((SemiAssociation)null);
				return;
			case TypesPackage.ASSOCIATION__HAS_SECONDARY:
				setHasSecondary((SemiAssociation)null);
				return;
			case TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS:
				getHasInstanceLinks().clear();
				return;
			case TypesPackage.ASSOCIATION__IS_COMPACT:
				setIsCompact(IS_COMPACT_EDEFAULT);
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
			case TypesPackage.ASSOCIATION__HAS_PRIMARY:
				return hasPrimary != null;
			case TypesPackage.ASSOCIATION__HAS_SECONDARY:
				return hasSecondary != null;
			case TypesPackage.ASSOCIATION__HAS_INSTANCE_LINKS:
				return hasInstanceLinks != null && !hasInstanceLinks.isEmpty();
			case TypesPackage.ASSOCIATION__IS_COMPACT:
				return isCompact != IS_COMPACT_EDEFAULT;
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
		result.append(" (isCompact: ");
		result.append(isCompact);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
