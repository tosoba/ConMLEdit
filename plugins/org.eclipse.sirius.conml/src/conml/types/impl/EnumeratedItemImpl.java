/**
 */
package conml.types.impl;

import conml.DefinableElement;
import conml.conmlPackage;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getSubItems <em>Sub Items</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getSuperItem <em>Super Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedItemImpl extends MinimalEObjectImpl.Container implements EnumeratedItem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubItems() <em>Sub Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> subItems;

  /**
	 * The cached value of the '{@link #getSuperItem() <em>Super Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperItem()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedItem superItem;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType getOwnerType() {
		if (eContainerFeatureID() != TypesPackage.ENUMERATED_ITEM__OWNER_TYPE) return null;
		return (EnumeratedType)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerType(EnumeratedType newOwnerType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerType, TypesPackage.ENUMERATED_ITEM__OWNER_TYPE, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerType(EnumeratedType newOwnerType) {
		if (newOwnerType != eInternalContainer() || (eContainerFeatureID() != TypesPackage.ENUMERATED_ITEM__OWNER_TYPE && newOwnerType != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerType != null)
				msgs = ((InternalEObject)newOwnerType).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS, EnumeratedType.class, msgs);
			msgs = basicSetOwnerType(newOwnerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__OWNER_TYPE, newOwnerType, newOwnerType));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedItem> getSubItems() {
		if (subItems == null) {
			subItems = new EObjectWithInverseResolvingEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_ITEM__SUB_ITEMS, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM);
		}
		return subItems;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedItem getSuperItem() {
		if (superItem != null && superItem.eIsProxy()) {
			InternalEObject oldSuperItem = (InternalEObject)superItem;
			superItem = (EnumeratedItem)eResolveProxy(oldSuperItem);
			if (superItem != oldSuperItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM, oldSuperItem, superItem));
			}
		}
		return superItem;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedItem basicGetSuperItem() {
		return superItem;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperItem(EnumeratedItem newSuperItem, NotificationChain msgs) {
		EnumeratedItem oldSuperItem = superItem;
		superItem = newSuperItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM, oldSuperItem, newSuperItem);
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
	public void setSuperItem(EnumeratedItem newSuperItem) {
		if (newSuperItem != superItem) {
			NotificationChain msgs = null;
			if (superItem != null)
				msgs = ((InternalEObject)superItem).eInverseRemove(this, TypesPackage.ENUMERATED_ITEM__SUB_ITEMS, EnumeratedItem.class, msgs);
			if (newSuperItem != null)
				msgs = ((InternalEObject)newSuperItem).eInverseAdd(this, TypesPackage.ENUMERATED_ITEM__SUB_ITEMS, EnumeratedItem.class, msgs);
			msgs = basicSetSuperItem(newSuperItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM, newSuperItem, newSuperItem));
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
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerType((EnumeratedType)otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubItems()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM:
				if (superItem != null)
					msgs = ((InternalEObject)superItem).eInverseRemove(this, TypesPackage.ENUMERATED_ITEM__SUB_ITEMS, EnumeratedItem.class, msgs);
				return basicSetSuperItem((EnumeratedItem)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				return basicSetOwnerType(null, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEMS:
				return ((InternalEList<?>)getSubItems()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM:
				return basicSetSuperItem(null, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				return eInternalContainer().eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS, EnumeratedType.class, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__NAME:
				return getName();
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				return getDefinition();
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				return getOwnerType();
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEMS:
				return getSubItems();
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM:
				if (resolve) return getSuperItem();
				return basicGetSuperItem();
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
			case TypesPackage.ENUMERATED_ITEM__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				setDefinition((String)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				setOwnerType((EnumeratedType)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEMS:
				getSubItems().clear();
				getSubItems().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM:
				setSuperItem((EnumeratedItem)newValue);
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
			case TypesPackage.ENUMERATED_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				setOwnerType((EnumeratedType)null);
				return;
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEMS:
				getSubItems().clear();
				return;
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM:
				setSuperItem((EnumeratedItem)null);
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
			case TypesPackage.ENUMERATED_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case TypesPackage.ENUMERATED_ITEM__OWNER_TYPE:
				return getOwnerType() != null;
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEMS:
				return subItems != null && !subItems.isEmpty();
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM:
				return superItem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DefinableElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.ENUMERATED_ITEM__DEFINITION: return conmlPackage.DEFINABLE_ELEMENT__DEFINITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DefinableElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.DEFINABLE_ELEMENT__DEFINITION: return TypesPackage.ENUMERATED_ITEM__DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //EnumeratedItemImpl
