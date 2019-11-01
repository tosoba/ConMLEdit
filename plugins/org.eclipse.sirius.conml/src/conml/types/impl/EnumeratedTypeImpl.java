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
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSuperType <em>Super Type</em>}</li>
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
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedType> subTypes;

  /**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedType superType;

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
			ownedItems = new EObjectContainmentWithInverseEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS, TypesPackage.ENUMERATED_ITEM__OWNER_TYPE);
		}
		return ownedItems;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedType> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectWithInverseResolvingEList<EnumeratedType>(EnumeratedType.class, this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE);
		}
		return subTypes;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (EnumeratedType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedType basicGetSuperType() {
		return superType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperType(EnumeratedType newSuperType, NotificationChain msgs) {
		EnumeratedType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE, oldSuperType, newSuperType);
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
	public void setSuperType(EnumeratedType newSuperType) {
		if (newSuperType != superType) {
			NotificationChain msgs = null;
			if (superType != null)
				msgs = ((InternalEObject)superType).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, EnumeratedType.class, msgs);
			if (newSuperType != null)
				msgs = ((InternalEObject)newSuperType).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, EnumeratedType.class, msgs);
			msgs = basicSetSuperType(newSuperType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE, newSuperType, newSuperType));
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
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				if (superType != null)
					msgs = ((InternalEObject)superType).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, EnumeratedType.class, msgs);
				return basicSetSuperType((EnumeratedType)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				return basicSetSuperType(null, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return getSubTypes();
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
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
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends EnumeratedType>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				setSuperType((EnumeratedType)newValue);
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
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				getSubTypes().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				setSuperType((EnumeratedType)null);
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
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				return superType != null;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedTypeImpl
