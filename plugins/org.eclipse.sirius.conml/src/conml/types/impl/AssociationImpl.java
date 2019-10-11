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
 *   <li>{@link conml.types.impl.AssociationImpl#getPrimarySemiAssociation <em>Primary Semi Association</em>}</li>
 *   <li>{@link conml.types.impl.AssociationImpl#getSecondarySemiAssociation <em>Secondary Semi Association</em>}</li>
 *   <li>{@link conml.types.impl.AssociationImpl#getInstanceLinks <em>Instance Links</em>}</li>
 *   <li>{@link conml.types.impl.AssociationImpl#isCompact <em>Compact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends TypeImpl implements Association {
	/**
	 * The cached value of the '{@link #getPrimarySemiAssociation() <em>Primary Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySemiAssociation()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation primarySemiAssociation;

  /**
	 * The cached value of the '{@link #getSecondarySemiAssociation() <em>Secondary Semi Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondarySemiAssociation()
	 * @generated
	 * @ordered
	 */
	protected SemiAssociation secondarySemiAssociation;

  /**
	 * The cached value of the '{@link #getInstanceLinks() <em>Instance Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> instanceLinks;

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
	public SemiAssociation getPrimarySemiAssociation() {
		if (primarySemiAssociation != null && primarySemiAssociation.eIsProxy()) {
			InternalEObject oldPrimarySemiAssociation = (InternalEObject)primarySemiAssociation;
			primarySemiAssociation = (SemiAssociation)eResolveProxy(oldPrimarySemiAssociation);
			if (primarySemiAssociation != oldPrimarySemiAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION, oldPrimarySemiAssociation, primarySemiAssociation));
			}
		}
		return primarySemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetPrimarySemiAssociation() {
		return primarySemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimarySemiAssociation(SemiAssociation newPrimarySemiAssociation, NotificationChain msgs) {
		SemiAssociation oldPrimarySemiAssociation = primarySemiAssociation;
		primarySemiAssociation = newPrimarySemiAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION, oldPrimarySemiAssociation, newPrimarySemiAssociation);
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
	public void setPrimarySemiAssociation(SemiAssociation newPrimarySemiAssociation) {
		if (newPrimarySemiAssociation != primarySemiAssociation) {
			NotificationChain msgs = null;
			if (primarySemiAssociation != null)
				msgs = ((InternalEObject)primarySemiAssociation).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION, SemiAssociation.class, msgs);
			if (newPrimarySemiAssociation != null)
				msgs = ((InternalEObject)newPrimarySemiAssociation).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION, SemiAssociation.class, msgs);
			msgs = basicSetPrimarySemiAssociation(newPrimarySemiAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION, newPrimarySemiAssociation, newPrimarySemiAssociation));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemiAssociation getSecondarySemiAssociation() {
		if (secondarySemiAssociation != null && secondarySemiAssociation.eIsProxy()) {
			InternalEObject oldSecondarySemiAssociation = (InternalEObject)secondarySemiAssociation;
			secondarySemiAssociation = (SemiAssociation)eResolveProxy(oldSecondarySemiAssociation);
			if (secondarySemiAssociation != oldSecondarySemiAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION, oldSecondarySemiAssociation, secondarySemiAssociation));
			}
		}
		return secondarySemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociation basicGetSecondarySemiAssociation() {
		return secondarySemiAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondarySemiAssociation(SemiAssociation newSecondarySemiAssociation, NotificationChain msgs) {
		SemiAssociation oldSecondarySemiAssociation = secondarySemiAssociation;
		secondarySemiAssociation = newSecondarySemiAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION, oldSecondarySemiAssociation, newSecondarySemiAssociation);
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
	public void setSecondarySemiAssociation(SemiAssociation newSecondarySemiAssociation) {
		if (newSecondarySemiAssociation != secondarySemiAssociation) {
			NotificationChain msgs = null;
			if (secondarySemiAssociation != null)
				msgs = ((InternalEObject)secondarySemiAssociation).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION, SemiAssociation.class, msgs);
			if (newSecondarySemiAssociation != null)
				msgs = ((InternalEObject)newSecondarySemiAssociation).eInverseAdd(this, TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION, SemiAssociation.class, msgs);
			msgs = basicSetSecondarySemiAssociation(newSecondarySemiAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION, newSecondarySemiAssociation, newSecondarySemiAssociation));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getInstanceLinks() {
		if (instanceLinks == null) {
			instanceLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, TypesPackage.ASSOCIATION__INSTANCE_LINKS, InstancesPackage.LINK__INSTANCED_ASSOCIATION);
		}
		return instanceLinks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ASSOCIATION__COMPACT, oldCompact, compact));
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
			case TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION:
				if (primarySemiAssociation != null)
					msgs = ((InternalEObject)primarySemiAssociation).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION, SemiAssociation.class, msgs);
				return basicSetPrimarySemiAssociation((SemiAssociation)otherEnd, msgs);
			case TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION:
				if (secondarySemiAssociation != null)
					msgs = ((InternalEObject)secondarySemiAssociation).eInverseRemove(this, TypesPackage.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION, SemiAssociation.class, msgs);
				return basicSetSecondarySemiAssociation((SemiAssociation)otherEnd, msgs);
			case TypesPackage.ASSOCIATION__INSTANCE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstanceLinks()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION:
				return basicSetPrimarySemiAssociation(null, msgs);
			case TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION:
				return basicSetSecondarySemiAssociation(null, msgs);
			case TypesPackage.ASSOCIATION__INSTANCE_LINKS:
				return ((InternalEList<?>)getInstanceLinks()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION:
				if (resolve) return getPrimarySemiAssociation();
				return basicGetPrimarySemiAssociation();
			case TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION:
				if (resolve) return getSecondarySemiAssociation();
				return basicGetSecondarySemiAssociation();
			case TypesPackage.ASSOCIATION__INSTANCE_LINKS:
				return getInstanceLinks();
			case TypesPackage.ASSOCIATION__COMPACT:
				return isCompact();
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
			case TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION:
				setPrimarySemiAssociation((SemiAssociation)newValue);
				return;
			case TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION:
				setSecondarySemiAssociation((SemiAssociation)newValue);
				return;
			case TypesPackage.ASSOCIATION__INSTANCE_LINKS:
				getInstanceLinks().clear();
				getInstanceLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case TypesPackage.ASSOCIATION__COMPACT:
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
			case TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION:
				setPrimarySemiAssociation((SemiAssociation)null);
				return;
			case TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION:
				setSecondarySemiAssociation((SemiAssociation)null);
				return;
			case TypesPackage.ASSOCIATION__INSTANCE_LINKS:
				getInstanceLinks().clear();
				return;
			case TypesPackage.ASSOCIATION__COMPACT:
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
			case TypesPackage.ASSOCIATION__PRIMARY_SEMI_ASSOCIATION:
				return primarySemiAssociation != null;
			case TypesPackage.ASSOCIATION__SECONDARY_SEMI_ASSOCIATION:
				return secondarySemiAssociation != null;
			case TypesPackage.ASSOCIATION__INSTANCE_LINKS:
				return instanceLinks != null && !instanceLinks.isEmpty();
			case TypesPackage.ASSOCIATION__COMPACT:
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

} //AssociationImpl
