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
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getIsSuperItemOf <em>Is Super Item Of</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedItemImpl#getIsSubItemOf <em>Is Sub Item Of</em>}</li>
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
	 * The default value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSOLUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected String absoluteName = ABSOLUTE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getIsSuperItemOf() <em>Is Super Item Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSuperItemOf()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> isSuperItemOf;

	/**
	 * The cached value of the '{@link #getIsSubItemOf() <em>Is Sub Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubItemOf()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedItem isSubItemOf;

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
	public String getAbsoluteName() {
		return absoluteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbsoluteName(String newAbsoluteName) {
		String oldAbsoluteName = absoluteName;
		absoluteName = newAbsoluteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__ABSOLUTE_NAME, oldAbsoluteName, absoluteName));
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
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS, EnumeratedType.class, msgs);
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
	public EList<EnumeratedItem> getIsSuperItemOf() {
		if (isSuperItemOf == null) {
			isSuperItemOf = new EObjectWithInverseResolvingEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF, TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF);
		}
		return isSuperItemOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedItem getIsSubItemOf() {
		if (isSubItemOf != null && isSubItemOf.eIsProxy()) {
			InternalEObject oldIsSubItemOf = (InternalEObject)isSubItemOf;
			isSubItemOf = (EnumeratedItem)eResolveProxy(oldIsSubItemOf);
			if (isSubItemOf != oldIsSubItemOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF, oldIsSubItemOf, isSubItemOf));
			}
		}
		return isSubItemOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedItem basicGetIsSubItemOf() {
		return isSubItemOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSubItemOf(EnumeratedItem newIsSubItemOf, NotificationChain msgs) {
		EnumeratedItem oldIsSubItemOf = isSubItemOf;
		isSubItemOf = newIsSubItemOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF, oldIsSubItemOf, newIsSubItemOf);
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
	public void setIsSubItemOf(EnumeratedItem newIsSubItemOf) {
		if (newIsSubItemOf != isSubItemOf) {
			NotificationChain msgs = null;
			if (isSubItemOf != null)
				msgs = ((InternalEObject)isSubItemOf).eInverseRemove(this, TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF, EnumeratedItem.class, msgs);
			if (newIsSubItemOf != null)
				msgs = ((InternalEObject)newIsSubItemOf).eInverseAdd(this, TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF, EnumeratedItem.class, msgs);
			msgs = basicSetIsSubItemOf(newIsSubItemOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF, newIsSubItemOf, newIsSubItemOf));
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
			case TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSuperItemOf()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF:
				if (isSubItemOf != null)
					msgs = ((InternalEObject)isSubItemOf).eInverseRemove(this, TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF, EnumeratedItem.class, msgs);
				return basicSetIsSubItemOf((EnumeratedItem)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF:
				return ((InternalEList<?>)getIsSuperItemOf()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF:
				return basicSetIsSubItemOf(null, msgs);
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
				return eInternalContainer().eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__OWNS_ITEMS, EnumeratedType.class, msgs);
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
			case TypesPackage.ENUMERATED_ITEM__ABSOLUTE_NAME:
				return getAbsoluteName();
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				return getDefinition();
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				return getOwner();
			case TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF:
				return getIsSuperItemOf();
			case TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF:
				if (resolve) return getIsSubItemOf();
				return basicGetIsSubItemOf();
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
			case TypesPackage.ENUMERATED_ITEM__ABSOLUTE_NAME:
				setAbsoluteName((String)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				setDefinition((String)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				setOwner((EnumeratedType)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF:
				getIsSuperItemOf().clear();
				getIsSuperItemOf().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF:
				setIsSubItemOf((EnumeratedItem)newValue);
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
			case TypesPackage.ENUMERATED_ITEM__ABSOLUTE_NAME:
				setAbsoluteName(ABSOLUTE_NAME_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				setOwner((EnumeratedType)null);
				return;
			case TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF:
				getIsSuperItemOf().clear();
				return;
			case TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF:
				setIsSubItemOf((EnumeratedItem)null);
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
			case TypesPackage.ENUMERATED_ITEM__ABSOLUTE_NAME:
				return ABSOLUTE_NAME_EDEFAULT == null ? absoluteName != null : !ABSOLUTE_NAME_EDEFAULT.equals(absoluteName);
			case TypesPackage.ENUMERATED_ITEM__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case TypesPackage.ENUMERATED_ITEM__OWNER:
				return getOwner() != null;
			case TypesPackage.ENUMERATED_ITEM__IS_SUPER_ITEM_OF:
				return isSuperItemOf != null && !isSuperItemOf.isEmpty();
			case TypesPackage.ENUMERATED_ITEM__IS_SUB_ITEM_OF:
				return isSubItemOf != null;
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
		result.append(", absoluteName: ");
		result.append(absoluteName);
		result.append(", definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //EnumeratedItemImpl
