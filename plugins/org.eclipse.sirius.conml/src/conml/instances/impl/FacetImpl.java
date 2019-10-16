/**
 */
package conml.instances.impl;

import conml.instances.DegreeOfCertainty;
import conml.instances.Facet;
import conml.instances.FacetSet;
import conml.instances.InstancesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.FacetImpl#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link conml.instances.impl.FacetImpl#getOwnerSet <em>Owner Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FacetImpl extends InstanceModelElementImpl implements Facet {
	/**
	 * The default value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected static final DegreeOfCertainty CERTAINTY_EDEFAULT = DegreeOfCertainty.CERTAIN;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected DegreeOfCertainty certainty = CERTAINTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnerSet() <em>Owner Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerSet()
	 * @generated
	 * @ordered
	 */
	protected FacetSet ownerSet;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.FACET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeOfCertainty getCertainty() {
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertainty(DegreeOfCertainty newCertainty) {
		DegreeOfCertainty oldCertainty = certainty;
		certainty = newCertainty == null ? CERTAINTY_EDEFAULT : newCertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET__CERTAINTY, oldCertainty, certainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacetSet getOwnerSet() {
		if (ownerSet != null && ownerSet.eIsProxy()) {
			InternalEObject oldOwnerSet = (InternalEObject)ownerSet;
			ownerSet = (FacetSet)eResolveProxy(oldOwnerSet);
			if (ownerSet != oldOwnerSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.FACET__OWNER_SET, oldOwnerSet, ownerSet));
			}
		}
		return ownerSet;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetSet basicGetOwnerSet() {
		return ownerSet;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerSet(FacetSet newOwnerSet, NotificationChain msgs) {
		FacetSet oldOwnerSet = ownerSet;
		ownerSet = newOwnerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET__OWNER_SET, oldOwnerSet, newOwnerSet);
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
	public void setOwnerSet(FacetSet newOwnerSet) {
		if (newOwnerSet != ownerSet) {
			NotificationChain msgs = null;
			if (ownerSet != null)
				msgs = ((InternalEObject)ownerSet).eInverseRemove(this, InstancesPackage.FACET_SET__FACETS, FacetSet.class, msgs);
			if (newOwnerSet != null)
				msgs = ((InternalEObject)newOwnerSet).eInverseAdd(this, InstancesPackage.FACET_SET__FACETS, FacetSet.class, msgs);
			msgs = basicSetOwnerSet(newOwnerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET__OWNER_SET, newOwnerSet, newOwnerSet));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.FACET__OWNER_SET:
				if (ownerSet != null)
					msgs = ((InternalEObject)ownerSet).eInverseRemove(this, InstancesPackage.FACET_SET__FACETS, FacetSet.class, msgs);
				return basicSetOwnerSet((FacetSet)otherEnd, msgs);
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
			case InstancesPackage.FACET__OWNER_SET:
				return basicSetOwnerSet(null, msgs);
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
			case InstancesPackage.FACET__CERTAINTY:
				return getCertainty();
			case InstancesPackage.FACET__OWNER_SET:
				if (resolve) return getOwnerSet();
				return basicGetOwnerSet();
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
			case InstancesPackage.FACET__CERTAINTY:
				setCertainty((DegreeOfCertainty)newValue);
				return;
			case InstancesPackage.FACET__OWNER_SET:
				setOwnerSet((FacetSet)newValue);
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
			case InstancesPackage.FACET__CERTAINTY:
				setCertainty(CERTAINTY_EDEFAULT);
				return;
			case InstancesPackage.FACET__OWNER_SET:
				setOwnerSet((FacetSet)null);
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
			case InstancesPackage.FACET__CERTAINTY:
				return certainty != CERTAINTY_EDEFAULT;
			case InstancesPackage.FACET__OWNER_SET:
				return ownerSet != null;
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
		result.append(" (certainty: ");
		result.append(certainty);
		result.append(')');
		return result.toString();
	}

} //FacetImpl
