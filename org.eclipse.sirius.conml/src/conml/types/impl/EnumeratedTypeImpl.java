/**
 */
package conml.types.impl;

import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
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
 * An implementation of the model object '<em><b>Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getOwnsItems <em>Owns Items</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getHasItems <em>Has Items</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSpecializesFrom <em>Specializes From</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getBelongsToPackage <em>Belongs To Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedTypeImpl extends DataTypeImpl implements EnumeratedType {
	/**
	 * The cached value of the '{@link #getOwnsItems() <em>Owns Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> ownsItems;

	/**
	 * The cached value of the '{@link #getHasItems() <em>Has Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> hasItems;

	/**
	 * The cached value of the '{@link #getIsSpecializedBy() <em>Is Specialized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedType> isSpecializedBy;

	/**
	 * The cached value of the '{@link #getSpecializesFrom() <em>Specializes From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializesFrom()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedType specializesFrom;

	/**
	 * The cached value of the '{@link #getBelongsToPackage() <em>Belongs To Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToPackage()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Package belongsToPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedItem> getOwnsItems() {
		if (ownsItems == null) {
			ownsItems = new EObjectWithInverseResolvingEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS, TypesPackage.ENUMERATED_ITEM__OWNER);
		}
		return ownsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedItem> getHasItems() {
		if (hasItems == null) {
			hasItems = new EObjectWithInverseResolvingEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_TYPE__HAS_ITEMS, TypesPackage.ENUMERATED_ITEM__ASSIGNED_TO);
		}
		return hasItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedType> getIsSpecializedBy() {
		if (isSpecializedBy == null) {
			isSpecializedBy = new EObjectWithInverseResolvingEList<EnumeratedType>(EnumeratedType.class, this, TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM);
		}
		return isSpecializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType getSpecializesFrom() {
		if (specializesFrom != null && specializesFrom.eIsProxy()) {
			InternalEObject oldSpecializesFrom = (InternalEObject)specializesFrom;
			specializesFrom = (EnumeratedType)eResolveProxy(oldSpecializesFrom);
			if (specializesFrom != oldSpecializesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM, oldSpecializesFrom, specializesFrom));
			}
		}
		return specializesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedType basicGetSpecializesFrom() {
		return specializesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializesFrom(EnumeratedType newSpecializesFrom, NotificationChain msgs) {
		EnumeratedType oldSpecializesFrom = specializesFrom;
		specializesFrom = newSpecializesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM, oldSpecializesFrom, newSpecializesFrom);
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
	public void setSpecializesFrom(EnumeratedType newSpecializesFrom) {
		if (newSpecializesFrom != specializesFrom) {
			NotificationChain msgs = null;
			if (specializesFrom != null)
				msgs = ((InternalEObject)specializesFrom).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY, EnumeratedType.class, msgs);
			if (newSpecializesFrom != null)
				msgs = ((InternalEObject)newSpecializesFrom).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY, EnumeratedType.class, msgs);
			msgs = basicSetSpecializesFrom(newSpecializesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM, newSpecializesFrom, newSpecializesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Package getBelongsToPackage() {
		if (belongsToPackage != null && belongsToPackage.eIsProxy()) {
			InternalEObject oldBelongsToPackage = (InternalEObject)belongsToPackage;
			belongsToPackage = (conml.types.Package)eResolveProxy(oldBelongsToPackage);
			if (belongsToPackage != oldBelongsToPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE, oldBelongsToPackage, belongsToPackage));
			}
		}
		return belongsToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Package basicGetBelongsToPackage() {
		return belongsToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsToPackage(conml.types.Package newBelongsToPackage, NotificationChain msgs) {
		conml.types.Package oldBelongsToPackage = belongsToPackage;
		belongsToPackage = newBelongsToPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE, oldBelongsToPackage, newBelongsToPackage);
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
	public void setBelongsToPackage(conml.types.Package newBelongsToPackage) {
		if (newBelongsToPackage != belongsToPackage) {
			NotificationChain msgs = null;
			if (belongsToPackage != null)
				msgs = ((InternalEObject)belongsToPackage).eInverseRemove(this, TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE, conml.types.Package.class, msgs);
			if (newBelongsToPackage != null)
				msgs = ((InternalEObject)newBelongsToPackage).eInverseAdd(this, TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE, conml.types.Package.class, msgs);
			msgs = basicSetBelongsToPackage(newBelongsToPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE, newBelongsToPackage, newBelongsToPackage));
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
			case TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsItems()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__HAS_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasItems()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSpecializedBy()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM:
				if (specializesFrom != null)
					msgs = ((InternalEObject)specializesFrom).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY, EnumeratedType.class, msgs);
				return basicSetSpecializesFrom((EnumeratedType)otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE:
				if (belongsToPackage != null)
					msgs = ((InternalEObject)belongsToPackage).eInverseRemove(this, TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE, conml.types.Package.class, msgs);
				return basicSetBelongsToPackage((conml.types.Package)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS:
				return ((InternalEList<?>)getOwnsItems()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__HAS_ITEMS:
				return ((InternalEList<?>)getHasItems()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY:
				return ((InternalEList<?>)getIsSpecializedBy()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM:
				return basicSetSpecializesFrom(null, msgs);
			case TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE:
				return basicSetBelongsToPackage(null, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS:
				return getOwnsItems();
			case TypesPackage.ENUMERATED_TYPE__HAS_ITEMS:
				return getHasItems();
			case TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY:
				return getIsSpecializedBy();
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM:
				if (resolve) return getSpecializesFrom();
				return basicGetSpecializesFrom();
			case TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE:
				if (resolve) return getBelongsToPackage();
				return basicGetBelongsToPackage();
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
			case TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS:
				getOwnsItems().clear();
				getOwnsItems().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__HAS_ITEMS:
				getHasItems().clear();
				getHasItems().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY:
				getIsSpecializedBy().clear();
				getIsSpecializedBy().addAll((Collection<? extends EnumeratedType>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM:
				setSpecializesFrom((EnumeratedType)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE:
				setBelongsToPackage((conml.types.Package)newValue);
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
			case TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS:
				getOwnsItems().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__HAS_ITEMS:
				getHasItems().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY:
				getIsSpecializedBy().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM:
				setSpecializesFrom((EnumeratedType)null);
				return;
			case TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE:
				setBelongsToPackage((conml.types.Package)null);
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
			case TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS:
				return ownsItems != null && !ownsItems.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__HAS_ITEMS:
				return hasItems != null && !hasItems.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__IS_SPECIALIZED_BY:
				return isSpecializedBy != null && !isSpecializedBy.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM:
				return specializesFrom != null;
			case TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE:
				return belongsToPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedTypeImpl
