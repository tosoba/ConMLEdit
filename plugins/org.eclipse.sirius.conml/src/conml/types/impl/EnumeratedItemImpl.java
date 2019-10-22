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
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getSuperItemOfEnumeratedItems <em>Super Item Of Enumerated Items</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getSubItemOfEnumeratedItem <em>Sub Item Of Enumerated Item</em>}</li>
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
	 * The cached value of the '{@link #getSuperItemOfEnumeratedItems() <em>Super Item Of Enumerated Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperItemOfEnumeratedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> superItemOfEnumeratedItems;

  /**
	 * The cached value of the '{@link #getSubItemOfEnumeratedItem() <em>Sub Item Of Enumerated Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubItemOfEnumeratedItem()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedItem subItemOfEnumeratedItem;

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
	public EnumeratedType getOwner() {
		if (eContainerFeatureID() != TypesPackage.ENUMERATED_ITEM__OWNER) return null;
		return (EnumeratedType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(EnumeratedType newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, TypesPackage.ENUMERATED_ITEM__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(EnumeratedType newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != TypesPackage.ENUMERATED_ITEM__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS, EnumeratedType.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedItem> getSuperItemOfEnumeratedItems() {
		if (superItemOfEnumeratedItems == null) {
			superItemOfEnumeratedItems = new EObjectWithInverseResolvingEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS, TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM);
		}
		return superItemOfEnumeratedItems;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedItem getSubItemOfEnumeratedItem() {
		if (subItemOfEnumeratedItem != null && subItemOfEnumeratedItem.eIsProxy()) {
			InternalEObject oldSubItemOfEnumeratedItem = (InternalEObject)subItemOfEnumeratedItem;
			subItemOfEnumeratedItem = (EnumeratedItem)eResolveProxy(oldSubItemOfEnumeratedItem);
			if (subItemOfEnumeratedItem != oldSubItemOfEnumeratedItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM, oldSubItemOfEnumeratedItem, subItemOfEnumeratedItem));
			}
		}
		return subItemOfEnumeratedItem;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedItem basicGetSubItemOfEnumeratedItem() {
		return subItemOfEnumeratedItem;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubItemOfEnumeratedItem(EnumeratedItem newSubItemOfEnumeratedItem, NotificationChain msgs) {
		EnumeratedItem oldSubItemOfEnumeratedItem = subItemOfEnumeratedItem;
		subItemOfEnumeratedItem = newSubItemOfEnumeratedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM, oldSubItemOfEnumeratedItem, newSubItemOfEnumeratedItem);
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
	public void setSubItemOfEnumeratedItem(EnumeratedItem newSubItemOfEnumeratedItem) {
		if (newSubItemOfEnumeratedItem != subItemOfEnumeratedItem) {
			NotificationChain msgs = null;
			if (subItemOfEnumeratedItem != null)
				msgs = ((InternalEObject)subItemOfEnumeratedItem).eInverseRemove(this, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS, EnumeratedItem.class, msgs);
			if (newSubItemOfEnumeratedItem != null)
				msgs = ((InternalEObject)newSubItemOfEnumeratedItem).eInverseAdd(this, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS, EnumeratedItem.class, msgs);
			msgs = basicSetSubItemOfEnumeratedItem(newSubItemOfEnumeratedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM, newSubItemOfEnumeratedItem, newSubItemOfEnumeratedItem));
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((EnumeratedType)otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperItemOfEnumeratedItems()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM:
				if (subItemOfEnumeratedItem != null)
					msgs = ((InternalEObject)subItemOfEnumeratedItem).eInverseRemove(this, TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS, EnumeratedItem.class, msgs);
				return basicSetSubItemOfEnumeratedItem((EnumeratedItem)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				return basicSetOwner(null, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS:
				return ((InternalEList<?>)getSuperItemOfEnumeratedItems()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM:
				return basicSetSubItemOfEnumeratedItem(null, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				return getOwner();
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS:
				return getSuperItemOfEnumeratedItems();
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM:
				if (resolve) return getSubItemOfEnumeratedItem();
				return basicGetSubItemOfEnumeratedItem();
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				setOwner((EnumeratedType)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS:
				getSuperItemOfEnumeratedItems().clear();
				getSuperItemOfEnumeratedItems().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM:
				setSubItemOfEnumeratedItem((EnumeratedItem)newValue);
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				setOwner((EnumeratedType)null);
				return;
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS:
				getSuperItemOfEnumeratedItems().clear();
				return;
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM:
				setSubItemOfEnumeratedItem((EnumeratedItem)null);
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
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				return getOwner() != null;
			case TypesPackage.ENUMERATED_ITEM__SUPER_ITEM_OF_ENUMERATED_ITEMS:
				return superItemOfEnumeratedItems != null && !superItemOfEnumeratedItems.isEmpty();
			case TypesPackage.ENUMERATED_ITEM__SUB_ITEM_OF_ENUMERATED_ITEM:
				return subItemOfEnumeratedItem != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //EnumeratedItemImpl
