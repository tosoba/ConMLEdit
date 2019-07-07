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
 *   <li>{@link conml.instances.impl.FacetImpl#getIsOwnedBy <em>Is Owned By</em>}</li>
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
	 * The cached value of the '{@link #getIsOwnedBy() <em>Is Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected FacetSet isOwnedBy;

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
	public FacetSet getIsOwnedBy() {
		if (isOwnedBy != null && isOwnedBy.eIsProxy()) {
			InternalEObject oldIsOwnedBy = (InternalEObject)isOwnedBy;
			isOwnedBy = (FacetSet)eResolveProxy(oldIsOwnedBy);
			if (isOwnedBy != oldIsOwnedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.FACET__IS_OWNED_BY, oldIsOwnedBy, isOwnedBy));
			}
		}
		return isOwnedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetSet basicGetIsOwnedBy() {
		return isOwnedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOwnedBy(FacetSet newIsOwnedBy, NotificationChain msgs) {
		FacetSet oldIsOwnedBy = isOwnedBy;
		isOwnedBy = newIsOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET__IS_OWNED_BY, oldIsOwnedBy, newIsOwnedBy);
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
	public void setIsOwnedBy(FacetSet newIsOwnedBy) {
		if (newIsOwnedBy != isOwnedBy) {
			NotificationChain msgs = null;
			if (isOwnedBy != null)
				msgs = ((InternalEObject)isOwnedBy).eInverseRemove(this, InstancesPackage.FACET_SET__IS_COMPOSED_OF, FacetSet.class, msgs);
			if (newIsOwnedBy != null)
				msgs = ((InternalEObject)newIsOwnedBy).eInverseAdd(this, InstancesPackage.FACET_SET__IS_COMPOSED_OF, FacetSet.class, msgs);
			msgs = basicSetIsOwnedBy(newIsOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET__IS_OWNED_BY, newIsOwnedBy, newIsOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.FACET__IS_OWNED_BY:
				if (isOwnedBy != null)
					msgs = ((InternalEObject)isOwnedBy).eInverseRemove(this, InstancesPackage.FACET_SET__IS_COMPOSED_OF, FacetSet.class, msgs);
				return basicSetIsOwnedBy((FacetSet)otherEnd, msgs);
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
			case InstancesPackage.FACET__IS_OWNED_BY:
				return basicSetIsOwnedBy(null, msgs);
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
			case InstancesPackage.FACET__IS_OWNED_BY:
				if (resolve) return getIsOwnedBy();
				return basicGetIsOwnedBy();
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
			case InstancesPackage.FACET__IS_OWNED_BY:
				setIsOwnedBy((FacetSet)newValue);
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
			case InstancesPackage.FACET__IS_OWNED_BY:
				setIsOwnedBy((FacetSet)null);
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
			case InstancesPackage.FACET__IS_OWNED_BY:
				return isOwnedBy != null;
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
