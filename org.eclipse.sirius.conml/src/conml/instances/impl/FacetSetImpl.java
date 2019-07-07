/**
 */
package conml.instances.impl;

import conml.instances.Facet;
import conml.instances.FacetSet;
import conml.instances.InstancesPackage;

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
 * An implementation of the model object '<em><b>Facet Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getHasPhaseQualifier <em>Has Phase Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getHasPerspectiveQualifier <em>Has Perspective Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getIsComposedOf <em>Is Composed Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FacetSetImpl extends InstanceImpl implements FacetSet {
	/**
	 * The cached value of the '{@link #getHasPhaseQualifier() <em>Has Phase Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPhaseQualifier()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object hasPhaseQualifier;

	/**
	 * The cached value of the '{@link #getHasPerspectiveQualifier() <em>Has Perspective Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPerspectiveQualifier()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object hasPerspectiveQualifier;

	/**
	 * The cached value of the '{@link #getIsComposedOf() <em>Is Composed Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Facet> isComposedOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.FACET_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getHasPhaseQualifier() {
		if (hasPhaseQualifier != null && hasPhaseQualifier.eIsProxy()) {
			InternalEObject oldHasPhaseQualifier = (InternalEObject)hasPhaseQualifier;
			hasPhaseQualifier = (conml.instances.Object)eResolveProxy(oldHasPhaseQualifier);
			if (hasPhaseQualifier != oldHasPhaseQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER, oldHasPhaseQualifier, hasPhaseQualifier));
			}
		}
		return hasPhaseQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetHasPhaseQualifier() {
		return hasPhaseQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPhaseQualifier(conml.instances.Object newHasPhaseQualifier, NotificationChain msgs) {
		conml.instances.Object oldHasPhaseQualifier = hasPhaseQualifier;
		hasPhaseQualifier = newHasPhaseQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER, oldHasPhaseQualifier, newHasPhaseQualifier);
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
	public void setHasPhaseQualifier(conml.instances.Object newHasPhaseQualifier) {
		if (newHasPhaseQualifier != hasPhaseQualifier) {
			NotificationChain msgs = null;
			if (hasPhaseQualifier != null)
				msgs = ((InternalEObject)hasPhaseQualifier).eInverseRemove(this, InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF, conml.instances.Object.class, msgs);
			if (newHasPhaseQualifier != null)
				msgs = ((InternalEObject)newHasPhaseQualifier).eInverseAdd(this, InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF, conml.instances.Object.class, msgs);
			msgs = basicSetHasPhaseQualifier(newHasPhaseQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER, newHasPhaseQualifier, newHasPhaseQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getHasPerspectiveQualifier() {
		if (hasPerspectiveQualifier != null && hasPerspectiveQualifier.eIsProxy()) {
			InternalEObject oldHasPerspectiveQualifier = (InternalEObject)hasPerspectiveQualifier;
			hasPerspectiveQualifier = (conml.instances.Object)eResolveProxy(oldHasPerspectiveQualifier);
			if (hasPerspectiveQualifier != oldHasPerspectiveQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER, oldHasPerspectiveQualifier, hasPerspectiveQualifier));
			}
		}
		return hasPerspectiveQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetHasPerspectiveQualifier() {
		return hasPerspectiveQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPerspectiveQualifier(conml.instances.Object newHasPerspectiveQualifier, NotificationChain msgs) {
		conml.instances.Object oldHasPerspectiveQualifier = hasPerspectiveQualifier;
		hasPerspectiveQualifier = newHasPerspectiveQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER, oldHasPerspectiveQualifier, newHasPerspectiveQualifier);
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
	public void setHasPerspectiveQualifier(conml.instances.Object newHasPerspectiveQualifier) {
		if (newHasPerspectiveQualifier != hasPerspectiveQualifier) {
			NotificationChain msgs = null;
			if (hasPerspectiveQualifier != null)
				msgs = ((InternalEObject)hasPerspectiveQualifier).eInverseRemove(this, InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF, conml.instances.Object.class, msgs);
			if (newHasPerspectiveQualifier != null)
				msgs = ((InternalEObject)newHasPerspectiveQualifier).eInverseAdd(this, InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF, conml.instances.Object.class, msgs);
			msgs = basicSetHasPerspectiveQualifier(newHasPerspectiveQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER, newHasPerspectiveQualifier, newHasPerspectiveQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Facet> getIsComposedOf() {
		if (isComposedOf == null) {
			isComposedOf = new EObjectWithInverseResolvingEList<Facet>(Facet.class, this, InstancesPackage.FACET_SET__IS_COMPOSED_OF, InstancesPackage.FACET__IS_OWNED_BY);
		}
		return isComposedOf;
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
			case InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER:
				if (hasPhaseQualifier != null)
					msgs = ((InternalEObject)hasPhaseQualifier).eInverseRemove(this, InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF, conml.instances.Object.class, msgs);
				return basicSetHasPhaseQualifier((conml.instances.Object)otherEnd, msgs);
			case InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER:
				if (hasPerspectiveQualifier != null)
					msgs = ((InternalEObject)hasPerspectiveQualifier).eInverseRemove(this, InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF, conml.instances.Object.class, msgs);
				return basicSetHasPerspectiveQualifier((conml.instances.Object)otherEnd, msgs);
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsComposedOf()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER:
				return basicSetHasPhaseQualifier(null, msgs);
			case InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER:
				return basicSetHasPerspectiveQualifier(null, msgs);
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return ((InternalEList<?>)getIsComposedOf()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER:
				if (resolve) return getHasPhaseQualifier();
				return basicGetHasPhaseQualifier();
			case InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER:
				if (resolve) return getHasPerspectiveQualifier();
				return basicGetHasPerspectiveQualifier();
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return getIsComposedOf();
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
			case InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER:
				setHasPhaseQualifier((conml.instances.Object)newValue);
				return;
			case InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER:
				setHasPerspectiveQualifier((conml.instances.Object)newValue);
				return;
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				getIsComposedOf().clear();
				getIsComposedOf().addAll((Collection<? extends Facet>)newValue);
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
			case InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER:
				setHasPhaseQualifier((conml.instances.Object)null);
				return;
			case InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER:
				setHasPerspectiveQualifier((conml.instances.Object)null);
				return;
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				getIsComposedOf().clear();
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
			case InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER:
				return hasPhaseQualifier != null;
			case InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER:
				return hasPerspectiveQualifier != null;
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return isComposedOf != null && !isComposedOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FacetSetImpl
