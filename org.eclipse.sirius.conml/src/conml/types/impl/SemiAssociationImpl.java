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
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getIsInverseOf <em>Is Inverse Of</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getIsPrimaryIn <em>Is Primary In</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getIsSecondaryIn <em>Is Secondary In</em>}</li>
 *   <li>{@link conml.types.impl.SemiAssociationImpl#getHasInstanceReferenceSets <em>Has Instance Reference Sets</em>}</li>
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
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Class> assignedTo;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class owner;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class refersTo;

	/**
	 * The cached value of the '{@link #getIsInverseOf() <em>Is Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverseOf()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation isInverseOf;

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
	public EList<conml.types.Class> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<conml.types.Class>(conml.types.Class.class, this, TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO, TypesPackage.CLASS__HAS_SEMIASSOCIATIONS);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (conml.types.Class)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(conml.types.Class newOwner, NotificationChain msgs) {
		conml.types.Class oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__OWNER, oldOwner, newOwner);
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
	public void setOwner(conml.types.Class newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS, conml.types.Class.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS, conml.types.Class.class, msgs);
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
	public conml.types.Class getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (conml.types.Class)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefersTo(conml.types.Class newRefersTo, NotificationChain msgs) {
		conml.types.Class oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__REFERS_TO, oldRefersTo, newRefersTo);
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
	public void setRefersTo(conml.types.Class newRefersTo) {
		if (newRefersTo != refersTo) {
			NotificationChain msgs = null;
			if (refersTo != null)
				msgs = ((InternalEObject)refersTo).eInverseRemove(this, TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN, conml.types.Class.class, msgs);
			if (newRefersTo != null)
				msgs = ((InternalEObject)newRefersTo).eInverseAdd(this, TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN, conml.types.Class.class, msgs);
			msgs = basicSetRefersTo(newRefersTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__REFERS_TO, newRefersTo, newRefersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getIsInverseOf() {
		if (isInverseOf != null && isInverseOf.eIsProxy()) {
			InternalEObject oldIsInverseOf = (InternalEObject)isInverseOf;
			isInverseOf = (SemiAssociation)eResolveProxy(oldIsInverseOf);
			if (isInverseOf != oldIsInverseOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF, oldIsInverseOf, isInverseOf));
			}
		}
		return isInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetIsInverseOf() {
		return isInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInverseOf(SemiAssociation newIsInverseOf, NotificationChain msgs) {
		SemiAssociation oldIsInverseOf = isInverseOf;
		isInverseOf = newIsInverseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF, oldIsInverseOf, newIsInverseOf);
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
	public void setIsInverseOf(SemiAssociation newIsInverseOf) {
		if (newIsInverseOf != isInverseOf) {
			NotificationChain msgs = null;
			if (isInverseOf != null)
				msgs = ((InternalEObject)isInverseOf).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__INVERSE, SemiAssociation.class, msgs);
			if (newIsInverseOf != null)
				msgs = ((InternalEObject)newIsInverseOf).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__INVERSE, SemiAssociation.class, msgs);
			msgs = basicSetIsInverseOf(newIsInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF, newIsInverseOf, newIsInverseOf));
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
	public NotificationChain basicSetInverse(SemiAssociation newInverse, NotificationChain msgs) {
		SemiAssociation oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__INVERSE, oldInverse, newInverse);
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
	public void setInverse(SemiAssociation newInverse) {
		if (newInverse != inverse) {
			NotificationChain msgs = null;
			if (inverse != null)
				msgs = ((InternalEObject)inverse).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF, SemiAssociation.class, msgs);
			if (newInverse != null)
				msgs = ((InternalEObject)newInverse).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF, SemiAssociation.class, msgs);
			msgs = basicSetInverse(newInverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SEMI_ASSOCIATION__INVERSE, newInverse, newInverse));
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
			case TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTo()).basicAdd(otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS, conml.types.Class.class, msgs);
				return basicSetOwner((conml.types.Class)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__REFERS_TO:
				if (refersTo != null)
					msgs = ((InternalEObject)refersTo).eInverseRemove(this, TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN, conml.types.Class.class, msgs);
				return basicSetRefersTo((conml.types.Class)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF:
				if (isInverseOf != null)
					msgs = ((InternalEObject)isInverseOf).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__INVERSE, SemiAssociation.class, msgs);
				return basicSetIsInverseOf((SemiAssociation)otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				if (inverse != null)
					msgs = ((InternalEObject)inverse).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF, SemiAssociation.class, msgs);
				return basicSetInverse((SemiAssociation)otherEnd, msgs);
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
			case TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO:
				return ((InternalEList<?>)getAssignedTo()).basicRemove(otherEnd, msgs);
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return basicSetOwner(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__REFERS_TO:
				return basicSetRefersTo(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF:
				return basicSetIsInverseOf(null, msgs);
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				return basicSetInverse(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SEMI_ASSOCIATION__ROLE:
				return getRole();
			case TypesPackage.SEMI_ASSOCIATION__IS_WHOLE:
				return isIsWhole();
			case TypesPackage.SEMI_ASSOCIATION__IS_STRONG:
				return isIsStrong();
			case TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO:
				return getAssignedTo();
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case TypesPackage.SEMI_ASSOCIATION__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF:
				if (resolve) return getIsInverseOf();
				return basicGetIsInverseOf();
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				if (resolve) return getIsPrimaryIn();
				return basicGetIsPrimaryIn();
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				if (resolve) return getIsSecondaryIn();
				return basicGetIsSecondaryIn();
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				return getHasInstanceReferenceSets();
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
			case TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO:
				getAssignedTo().clear();
				getAssignedTo().addAll((Collection<? extends conml.types.Class>)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				setOwner((conml.types.Class)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__REFERS_TO:
				setRefersTo((conml.types.Class)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF:
				setIsInverseOf((SemiAssociation)newValue);
				return;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				setInverse((SemiAssociation)newValue);
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
			case TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO:
				getAssignedTo().clear();
				return;
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				setOwner((conml.types.Class)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__REFERS_TO:
				setRefersTo((conml.types.Class)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF:
				setIsInverseOf((SemiAssociation)null);
				return;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				setInverse((SemiAssociation)null);
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
			case TypesPackage.SEMI_ASSOCIATION__ASSIGNED_TO:
				return assignedTo != null && !assignedTo.isEmpty();
			case TypesPackage.SEMI_ASSOCIATION__OWNER:
				return owner != null;
			case TypesPackage.SEMI_ASSOCIATION__REFERS_TO:
				return refersTo != null;
			case TypesPackage.SEMI_ASSOCIATION__IS_INVERSE_OF:
				return isInverseOf != null;
			case TypesPackage.SEMI_ASSOCIATION__INVERSE:
				return inverse != null;
			case TypesPackage.SEMI_ASSOCIATION__IS_PRIMARY_IN:
				return isPrimaryIn != null;
			case TypesPackage.SEMI_ASSOCIATION__IS_SECONDARY_IN:
				return isSecondaryIn != null;
			case TypesPackage.SEMI_ASSOCIATION__HAS_INSTANCE_REFERENCE_SETS:
				return hasInstanceReferenceSets != null && !hasInstanceReferenceSets.isEmpty();
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
