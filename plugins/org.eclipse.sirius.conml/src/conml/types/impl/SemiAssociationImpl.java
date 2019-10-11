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
 *   <li>{@link conml.types.impl.SemiAssociationImpl#isWhole <em>Whole</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#isStrong <em>Strong</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getPrimaryInAssociation <em>Primary In Association</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getSecondaryInAssociation <em>Secondary In Association</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getInstanceReferenceSets <em>Instance Reference Sets</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getInverseSemiAssociation <em>Inverse Semi Association</em>}</li>
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
	 * The default value of the '{@link #isWhole() <em>Whole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWhole()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WHOLE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isWhole() <em>Whole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWhole()
	 * @generated
	 * @ordered
	 */
	protected boolean whole = WHOLE_EDEFAULT;

  /**
	 * The default value of the '{@link #isStrong() <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRONG_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isStrong() <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrong()
	 * @generated
	 * @ordered
	 */
	protected boolean strong = STRONG_EDEFAULT;

  /**
	 * The cached value of the '{@link #getPrimaryInAssociation() <em>Primary In Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryInAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association primaryInAssociation;

    /**
	 * The cached value of the '{@link #getSecondaryInAssociation() <em>Secondary In Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryInAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association secondaryInAssociation;

    /**
	 * The cached value of the '{@link #getInstanceReferenceSets() <em>Instance Reference Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceReferenceSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceSet> instanceReferenceSets;

    /**
	 * The cached value of the '{@link #getInverseSemiAssociation() <em>Inverse Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseSemiAssociation()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation inverseSemiAssociation;

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
	public boolean isWhole() {
		return whole;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhole(boolean newWhole) {
		boolean oldWhole = whole;
		whole = newWhole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__WHOLE, oldWhole, whole));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStrong() {
		return strong;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrong(boolean newStrong) {
		boolean oldStrong = strong;
		strong = newStrong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__STRONG, oldStrong, strong));
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
	public Association getPrimaryInAssociation() {
		if (primaryInAssociation != null && primaryInAssociation.eIsProxy()) {
			InternalEObject oldPrimaryInAssociation = (InternalEObject)primaryInAssociation;
			primaryInAssociation = (Association)eResolveProxy(oldPrimaryInAssociation);
			if (primaryInAssociation != oldPrimaryInAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION, oldPrimaryInAssociation, primaryInAssociation));
			}
		}
		return primaryInAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetPrimaryInAssociation() {
		return primaryInAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryInAssociation(Association newPrimaryInAssociation, NotificationChain msgs) {
		Association oldPrimaryInAssociation = primaryInAssociation;
		primaryInAssociation = newPrimaryInAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION, oldPrimaryInAssociation, newPrimaryInAssociation);
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
	public void setPrimaryInAssociation(Association newPrimaryInAssociation) {
		if (newPrimaryInAssociation != primaryInAssociation) {
			NotificationChain msgs = null;
			if (primaryInAssociation != null)
				msgs = ((InternalEObject)primaryInAssociation).eInverseRemove(this, TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION, Association.class, msgs);
			if (newPrimaryInAssociation != null)
				msgs = ((InternalEObject)newPrimaryInAssociation).eInverseAdd(this, TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION, Association.class, msgs);
			msgs = basicSetPrimaryInAssociation(newPrimaryInAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION, newPrimaryInAssociation, newPrimaryInAssociation));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getSecondaryInAssociation() {
		if (secondaryInAssociation != null && secondaryInAssociation.eIsProxy()) {
			InternalEObject oldSecondaryInAssociation = (InternalEObject)secondaryInAssociation;
			secondaryInAssociation = (Association)eResolveProxy(oldSecondaryInAssociation);
			if (secondaryInAssociation != oldSecondaryInAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION, oldSecondaryInAssociation, secondaryInAssociation));
			}
		}
		return secondaryInAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetSecondaryInAssociation() {
		return secondaryInAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryInAssociation(Association newSecondaryInAssociation, NotificationChain msgs) {
		Association oldSecondaryInAssociation = secondaryInAssociation;
		secondaryInAssociation = newSecondaryInAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION, oldSecondaryInAssociation, newSecondaryInAssociation);
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
	public void setSecondaryInAssociation(Association newSecondaryInAssociation) {
		if (newSecondaryInAssociation != secondaryInAssociation) {
			NotificationChain msgs = null;
			if (secondaryInAssociation != null)
				msgs = ((InternalEObject)secondaryInAssociation).eInverseRemove(this, TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION, Association.class, msgs);
			if (newSecondaryInAssociation != null)
				msgs = ((InternalEObject)newSecondaryInAssociation).eInverseAdd(this, TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION, Association.class, msgs);
			msgs = basicSetSecondaryInAssociation(newSecondaryInAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION, newSecondaryInAssociation, newSecondaryInAssociation));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceSet> getInstanceReferenceSets() {
		if (instanceReferenceSets == null) {
			instanceReferenceSets = new EObjectWithInverseResolvingEList<ReferenceSet>(ReferenceSet.class, this, TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS, InstancesPackage.REFERENCE_SET__INSTANCED_SEMI_ASSOCIATION);
		}
		return instanceReferenceSets;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getInverseSemiAssociation() {
		if (inverseSemiAssociation != null && inverseSemiAssociation.eIsProxy()) {
			InternalEObject oldInverseSemiAssociation = (InternalEObject)inverseSemiAssociation;
			inverseSemiAssociation = (SemiAssociation)eResolveProxy(oldInverseSemiAssociation);
			if (inverseSemiAssociation != oldInverseSemiAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION, oldInverseSemiAssociation, inverseSemiAssociation));
			}
		}
		return inverseSemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetInverseSemiAssociation() {
		return inverseSemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverseSemiAssociation(SemiAssociation newInverseSemiAssociation) {
		SemiAssociation oldInverseSemiAssociation = inverseSemiAssociation;
		inverseSemiAssociation = newInverseSemiAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION, oldInverseSemiAssociation, inverseSemiAssociation));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((conml.types.Class)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION:
				if (primaryInAssociation != null)
					msgs = ((InternalEObject)primaryInAssociation).eInverseRemove(this, TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION, Association.class, msgs);
				return basicSetPrimaryInAssociation((Association)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION:
				if (secondaryInAssociation != null)
					msgs = ((InternalEObject)secondaryInAssociation).eInverseRemove(this, TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION, Association.class, msgs);
				return basicSetSecondaryInAssociation((Association)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstanceReferenceSets()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION:
				return basicSetPrimaryInAssociation(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION:
				return basicSetSecondaryInAssociation(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS:
				return ((InternalEList<?>)getInstanceReferenceSets()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.SEMI_ASSOCIATION__WHOLE:
				return isWhole();
			case TypesPackage.SEMI_ASSOCIATION__STRONG:
				return isStrong();
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return getOwner();
			case TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION:
				if (resolve) return getPrimaryInAssociation();
				return basicGetPrimaryInAssociation();
			case TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION:
				if (resolve) return getSecondaryInAssociation();
				return basicGetSecondaryInAssociation();
			case TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS:
				return getInstanceReferenceSets();
			case TypesPackage.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION:
				if (resolve) return getInverseSemiAssociation();
				return basicGetInverseSemiAssociation();
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
			case TypesPackage.SEMI_ASSOCIATION__WHOLE:
				setWhole((Boolean)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__STRONG:
				setStrong((Boolean)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				setOwner((conml.types.Class)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION:
				setPrimaryInAssociation((Association)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION:
				setSecondaryInAssociation((Association)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS:
				getInstanceReferenceSets().clear();
				getInstanceReferenceSets().addAll((Collection<? extends ReferenceSet>)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION:
				setInverseSemiAssociation((SemiAssociation)newValue);
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
			case TypesPackage.SEMI_ASSOCIATION__WHOLE:
				setWhole(WHOLE_EDEFAULT);
				return;
			case TypesPackage.SEMI_ASSOCIATION__STRONG:
				setStrong(STRONG_EDEFAULT);
				return;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				setOwner((conml.types.Class)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION:
				setPrimaryInAssociation((Association)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION:
				setSecondaryInAssociation((Association)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS:
				getInstanceReferenceSets().clear();
				return;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION:
				setInverseSemiAssociation((SemiAssociation)null);
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
			case TypesPackage.SEMI_ASSOCIATION__WHOLE:
				return whole != WHOLE_EDEFAULT;
			case TypesPackage.SEMI_ASSOCIATION__STRONG:
				return strong != STRONG_EDEFAULT;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return getOwner() != null;
			case TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION:
				return primaryInAssociation != null;
			case TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION:
				return secondaryInAssociation != null;
			case TypesPackage.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS:
				return instanceReferenceSets != null && !instanceReferenceSets.isEmpty();
			case TypesPackage.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION:
				return inverseSemiAssociation != null;
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
		result.append(", whole: ");
		result.append(whole);
		result.append(", strong: ");
		result.append(strong);
		result.append(')');
		return result.toString();
	}

} //SemiAssociationImpl
