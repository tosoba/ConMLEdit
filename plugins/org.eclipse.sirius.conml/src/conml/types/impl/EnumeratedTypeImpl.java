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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getOwnedItems <em>Owned Items</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSpecializedByEnumeratedTypes <em>Specialized By Enumerated Types</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSpecializesFromEnumeratedType <em>Specializes From Enumerated Type</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedTypeImpl extends DataTypeImpl implements EnumeratedType {
	/**
	 * The cached value of the '{@link #getOwnedItems() <em>Owned Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> ownedItems;

  /**
	 * The cached value of the '{@link #getSpecializedByEnumeratedTypes() <em>Specialized By Enumerated Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedByEnumeratedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedType> specializedByEnumeratedTypes;

  /**
	 * The cached value of the '{@link #getSpecializesFromEnumeratedType() <em>Specializes From Enumerated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializesFromEnumeratedType()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedType specializesFromEnumeratedType;

  /**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Package package_;

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
	public EList<EnumeratedItem> getOwnedItems() {
		if (ownedItems == null) {
			ownedItems = new EObjectContainmentWithInverseEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS, TypesPackage.ENUMERATED_ITEM__OWNER);
		}
		return ownedItems;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedType> getSpecializedByEnumeratedTypes() {
		if (specializedByEnumeratedTypes == null) {
			specializedByEnumeratedTypes = new EObjectWithInverseResolvingEList<EnumeratedType>(EnumeratedType.class, this, TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE);
		}
		return specializedByEnumeratedTypes;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType getSpecializesFromEnumeratedType() {
		if (specializesFromEnumeratedType != null && specializesFromEnumeratedType.eIsProxy()) {
			InternalEObject oldSpecializesFromEnumeratedType = (InternalEObject)specializesFromEnumeratedType;
			specializesFromEnumeratedType = (EnumeratedType)eResolveProxy(oldSpecializesFromEnumeratedType);
			if (specializesFromEnumeratedType != oldSpecializesFromEnumeratedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE, oldSpecializesFromEnumeratedType, specializesFromEnumeratedType));
			}
		}
		return specializesFromEnumeratedType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedType basicGetSpecializesFromEnumeratedType() {
		return specializesFromEnumeratedType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializesFromEnumeratedType(EnumeratedType newSpecializesFromEnumeratedType, NotificationChain msgs) {
		EnumeratedType oldSpecializesFromEnumeratedType = specializesFromEnumeratedType;
		specializesFromEnumeratedType = newSpecializesFromEnumeratedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE, oldSpecializesFromEnumeratedType, newSpecializesFromEnumeratedType);
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
	public void setSpecializesFromEnumeratedType(EnumeratedType newSpecializesFromEnumeratedType) {
		if (newSpecializesFromEnumeratedType != specializesFromEnumeratedType) {
			NotificationChain msgs = null;
			if (specializesFromEnumeratedType != null)
				msgs = ((InternalEObject)specializesFromEnumeratedType).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES, EnumeratedType.class, msgs);
			if (newSpecializesFromEnumeratedType != null)
				msgs = ((InternalEObject)newSpecializesFromEnumeratedType).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES, EnumeratedType.class, msgs);
			msgs = basicSetSpecializesFromEnumeratedType(newSpecializesFromEnumeratedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE, newSpecializesFromEnumeratedType, newSpecializesFromEnumeratedType));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (conml.types.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(conml.types.Package newPackage, NotificationChain msgs) {
		conml.types.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__PACKAGE, oldPackage, newPackage);
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
	public void setPackage(conml.types.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, TypesPackage.PACKAGE__ENUMERATED_TYPES, conml.types.Package.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypesPackage.PACKAGE__ENUMERATED_TYPES, conml.types.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__PACKAGE, newPackage, newPackage));
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
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedItems()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializedByEnumeratedTypes()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE:
				if (specializesFromEnumeratedType != null)
					msgs = ((InternalEObject)specializesFromEnumeratedType).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES, EnumeratedType.class, msgs);
				return basicSetSpecializesFromEnumeratedType((EnumeratedType)otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, TypesPackage.PACKAGE__ENUMERATED_TYPES, conml.types.Package.class, msgs);
				return basicSetPackage((conml.types.Package)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return ((InternalEList<?>)getOwnedItems()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES:
				return ((InternalEList<?>)getSpecializedByEnumeratedTypes()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE:
				return basicSetSpecializesFromEnumeratedType(null, msgs);
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return getOwnedItems();
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES:
				return getSpecializedByEnumeratedTypes();
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE:
				if (resolve) return getSpecializesFromEnumeratedType();
				return basicGetSpecializesFromEnumeratedType();
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				getOwnedItems().clear();
				getOwnedItems().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES:
				getSpecializedByEnumeratedTypes().clear();
				getSpecializedByEnumeratedTypes().addAll((Collection<? extends EnumeratedType>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE:
				setSpecializesFromEnumeratedType((EnumeratedType)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				setPackage((conml.types.Package)newValue);
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
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				getOwnedItems().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES:
				getSpecializedByEnumeratedTypes().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE:
				setSpecializesFromEnumeratedType((EnumeratedType)null);
				return;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				setPackage((conml.types.Package)null);
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
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return ownedItems != null && !ownedItems.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZED_BY_ENUMERATED_TYPES:
				return specializedByEnumeratedTypes != null && !specializedByEnumeratedTypes.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__SPECIALIZES_FROM_ENUMERATED_TYPE:
				return specializesFromEnumeratedType != null;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedTypeImpl
