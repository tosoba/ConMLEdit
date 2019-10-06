/**
 */
package conml.types.impl;

import conml.instances.InstancesPackage;
import conml.instances.ReferenceSet;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semi Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#isIsWhole <em>Is Whole</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#isIsStrong <em>Is Strong</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getIsPrimaryIn <em>Is Primary In</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getIsSecondaryIn <em>Is Secondary In</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getHasInstanceReferenceSets <em>Has Instance Reference Sets</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getReferredClass <em>Referred Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemiAssociationImpl extends FeatureImpl implements SemiAssociation {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsWhole() <em>Is Whole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWhole()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WHOLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWhole() <em>Is Whole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWhole()
	 * @generated
	 * @ordered
	 */
	protected boolean isWhole = IS_WHOLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStrong() <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRONG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrong() <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrong()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrong = IS_STRONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsPrimaryIn() <em>Is Primary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimaryIn()
	 * @generated
	 * @ordered
	 */
	protected Association isPrimaryIn;

	/**
	 * The cached value of the '{@link #getIsSecondaryIn() <em>Is Secondary In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSecondaryIn()
	 * @generated
	 * @ordered
	 */
	protected Association isSecondaryIn;

	/**
	 * The cached value of the '{@link #getHasInstanceReferenceSets() <em>Has Instance Reference Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstanceReferenceSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceSet> hasInstanceReferenceSets;

	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation inverse;

	/**
	 * The cached value of the '{@link #getReferredClass() <em>Referred Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredClass()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class referredClass;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemiAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SEMI_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsWhole() {
		return isWhole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsWhole(boolean newIsWhole) {
		boolean oldIsWhole = isWhole;
		isWhole = newIsWhole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_WHOLE, oldIsWhole, isWhole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsStrong() {
		return isStrong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStrong(boolean newIsStrong) {
		boolean oldIsStrong = isStrong;
		isStrong = newIsStrong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_STRONG, oldIsStrong, isStrong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getOwner() {
		if (eContainerFeatureID() != TypesPackage.SEMI_ASSOCIATION__OWNER) return null;
		return (conml.types.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(conml.types.Class newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, TypesPackage.SEMI_ASSOCIATION__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(conml.types.Class newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != TypesPackage.SEMI_ASSOCIATION__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, TypesPackage.CLASS__SEMIASSOCIATIONS, conml.types.Class.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getInverse() {
		if (inverse != null && inverse.eIsProxy()) {
			InternalEObject oldInverse = (InternalEObject)inverse;
			inverse = (SemiAssociation)eResolveProxy(oldInverse);
			if (inverse != oldInverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__INVERSE, oldInverse, inverse));
			}
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverse(SemiAssociation newInverse) {
		SemiAssociation oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getReferredClass() {
		if (referredClass != null && referredClass.eIsProxy()) {
			InternalEObject oldReferredClass = (InternalEObject)referredClass;
			referredClass = (conml.types.Class)eResolveProxy(oldReferredClass);
			if (referredClass != oldReferredClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__REFERRED_CLASS, oldReferredClass, referredClass));
			}
		}
		return referredClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetReferredClass() {
		return referredClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredClass(conml.types.Class newReferredClass) {
		conml.types.Class oldReferredClass = referredClass;
		referredClass = newReferredClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__REFERRED_CLASS, oldReferredClass, referredClass));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getIsPrimaryIn() {
		if (isPrimaryIn != null && isPrimaryIn.eIsProxy()) {
			InternalEObject oldIsPrimaryIn = (InternalEObject)isPrimaryIn;
			isPrimaryIn = (Association)eResolveProxy(oldIsPrimaryIn);
			if (isPrimaryIn != oldIsPrimaryIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN, oldIsPrimaryIn, isPrimaryIn));
			}
		}
		return isPrimaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetIsPrimaryIn() {
		return isPrimaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPrimaryIn(Association newIsPrimaryIn, NotificationChain msgs) {
		Association oldIsPrimaryIn = isPrimaryIn;
		isPrimaryIn = newIsPrimaryIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN, oldIsPrimaryIn, newIsPrimaryIn);
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
	public void setIsPrimaryIn(Association newIsPrimaryIn) {
		if (newIsPrimaryIn != isPrimaryIn) {
			NotificationChain msgs = null;
			if (isPrimaryIn != null)
				msgs = ((InternalEObject)isPrimaryIn).eInverseRemove(this, TypesPackage.ASSOCIATION__HAS_PRIMARY, Association.class, msgs);
			if (newIsPrimaryIn != null)
				msgs = ((InternalEObject)newIsPrimaryIn).eInverseAdd(this, TypesPackage.ASSOCIATION__HAS_PRIMARY, Association.class, msgs);
			msgs = basicSetIsPrimaryIn(newIsPrimaryIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN, newIsPrimaryIn, newIsPrimaryIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getIsSecondaryIn() {
		if (isSecondaryIn != null && isSecondaryIn.eIsProxy()) {
			InternalEObject oldIsSecondaryIn = (InternalEObject)isSecondaryIn;
			isSecondaryIn = (Association)eResolveProxy(oldIsSecondaryIn);
			if (isSecondaryIn != oldIsSecondaryIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN, oldIsSecondaryIn, isSecondaryIn));
			}
		}
		return isSecondaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetIsSecondaryIn() {
		return isSecondaryIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSecondaryIn(Association newIsSecondaryIn, NotificationChain msgs) {
		Association oldIsSecondaryIn = isSecondaryIn;
		isSecondaryIn = newIsSecondaryIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN, oldIsSecondaryIn, newIsSecondaryIn);
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
	public void setIsSecondaryIn(Association newIsSecondaryIn) {
		if (newIsSecondaryIn != isSecondaryIn) {
			NotificationChain msgs = null;
			if (isSecondaryIn != null)
				msgs = ((InternalEObject)isSecondaryIn).eInverseRemove(this, TypesPackage.ASSOCIATION__HAS_SECONDARY, Association.class, msgs);
			if (newIsSecondaryIn != null)
				msgs = ((InternalEObject)newIsSecondaryIn).eInverseAdd(this, TypesPackage.ASSOCIATION__HAS_SECONDARY, Association.class, msgs);
			msgs = basicSetIsSecondaryIn(newIsSecondaryIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN, newIsSecondaryIn, newIsSecondaryIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceSet> getHasInstanceReferenceSets() {
		if (hasInstanceReferenceSets == null) {
			hasInstanceReferenceSets = new EObjectWithInverseResolvingEList<ReferenceSet>(ReferenceSet.class, this, TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS, InstancesPackage.REFERENCE_SET__IS_AN_INSTANCE_OF);
		}
		return hasInstanceReferenceSets;
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
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((conml.types.Class)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				if (isPrimaryIn != null)
					msgs = ((InternalEObject)isPrimaryIn).eInverseRemove(this, TypesPackage.ASSOCIATION__HAS_PRIMARY, Association.class, msgs);
				return basicSetIsPrimaryIn((Association)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				if (isSecondaryIn != null)
					msgs = ((InternalEObject)isSecondaryIn).eInverseRemove(this, TypesPackage.ASSOCIATION__HAS_SECONDARY, Association.class, msgs);
				return basicSetIsSecondaryIn((Association)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInstanceReferenceSets()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return basicSetOwner(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				return basicSetIsPrimaryIn(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				return basicSetIsSecondaryIn(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				return ((InternalEList<?>)getHasInstanceReferenceSets()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return eInternalContainer().eInverseRemove(this, TypesPackage.CLASS__SEMIASSOCIATIONS, conml.types.Class.class, msgs);
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
			case TypesPackage.SEMI_ASSOCIATION__ROLE:
				return getRole();
			case TypesPackage.SEMI_ASSOCIATION__IS_WHOLE:
				return isIsWhole();
			case TypesPackage.SEMI_ASSOCIATION__IS_STRONG:
				return isIsStrong();
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return getOwner();
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				if (resolve) return getIsPrimaryIn();
				return basicGetIsPrimaryIn();
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				if (resolve) return getIsSecondaryIn();
				return basicGetIsSecondaryIn();
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				return getHasInstanceReferenceSets();
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case TypesPackage.SEMI_ASSOCIATION__REFERRED_CLASS:
				if (resolve) return getReferredClass();
				return basicGetReferredClass();
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
			case TypesPackage.SEMI_ASSOCIATION__ROLE:
				setRole((String)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_WHOLE:
				setIsWhole((Boolean)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_STRONG:
				setIsStrong((Boolean)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				setOwner((conml.types.Class)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				setIsPrimaryIn((Association)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				setIsSecondaryIn((Association)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				getHasInstanceReferenceSets().clear();
				getHasInstanceReferenceSets().addAll((Collection<? extends ReferenceSet>)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				setInverse((SemiAssociation)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__REFERRED_CLASS:
				setReferredClass((conml.types.Class)newValue);
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
			case TypesPackage.SEMI_ASSOCIATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_WHOLE:
				setIsWhole(IS_WHOLE_EDEFAULT);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_STRONG:
				setIsStrong(IS_STRONG_EDEFAULT);
				return;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				setOwner((conml.types.Class)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				setIsPrimaryIn((Association)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				setIsSecondaryIn((Association)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				getHasInstanceReferenceSets().clear();
				return;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				setInverse((SemiAssociation)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__REFERRED_CLASS:
				setReferredClass((conml.types.Class)null);
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
			case TypesPackage.SEMI_ASSOCIATION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case TypesPackage.SEMI_ASSOCIATION__IS_WHOLE:
				return isWhole != IS_WHOLE_EDEFAULT;
			case TypesPackage.SEMI_ASSOCIATION__IS_STRONG:
				return isStrong != IS_STRONG_EDEFAULT;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return getOwner() != null;
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				return isPrimaryIn != null;
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				return isSecondaryIn != null;
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				return hasInstanceReferenceSets != null && !hasInstanceReferenceSets.isEmpty();
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				return inverse != null;
			case TypesPackage.SEMI_ASSOCIATION__REFERRED_CLASS:
				return referredClass != null;
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
		result.append(" (role: ");
		result.append(role);
		result.append(", isWhole: ");
		result.append(isWhole);
		result.append(", isStrong: ");
		result.append(isStrong);
		result.append(')');
		return result.toString();
	}

} //SemiAssociationImpl
