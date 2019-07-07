/**
 */
package conml.types.impl;

import conml.instances.InstancesPackage;
import conml.instances.ValueSet;

import conml.types.Attribute;
import conml.types.DataType;
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
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.AttributeImpl#isIsMultilingual <em>Is Multilingual</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getHasInstanceValueSets <em>Has Instance Value Sets</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getIsOfType <em>Is Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * The default value of the '{@link #isIsMultilingual() <em>Is Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultilingual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTILINGUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultilingual() <em>Is Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultilingual()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultilingual = IS_MULTILINGUAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class owner;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Class> assignedTo;

	/**
	 * The cached value of the '{@link #getHasInstanceValueSets() <em>Has Instance Value Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstanceValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> hasInstanceValueSets;

	/**
	 * The cached value of the '{@link #getIsOfType() <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOfType()
	 * @generated
	 * @ordered
	 */
	protected DataType isOfType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMultilingual() {
		return isMultilingual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMultilingual(boolean newIsMultilingual) {
		boolean oldIsMultilingual = isMultilingual;
		isMultilingual = newIsMultilingual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__IS_MULTILINGUAL, oldIsMultilingual, isMultilingual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (conml.types.Class)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ATTRIBUTE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(conml.types.Class newOwner, NotificationChain msgs) {
		conml.types.Class oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__OWNER, oldOwner, newOwner);
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
	public void setOwner(conml.types.Class newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, TypesPackage.CLASS__OWNS_ATTRIBUTES, conml.types.Class.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, TypesPackage.CLASS__OWNS_ATTRIBUTES, conml.types.Class.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.types.Class> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<conml.types.Class>(conml.types.Class.class, this, TypesPackage.ATTRIBUTE__ASSIGNED_TO, TypesPackage.CLASS__HAS_ATTRIBUTES);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSet> getHasInstanceValueSets() {
		if (hasInstanceValueSets == null) {
			hasInstanceValueSets = new EObjectWithInverseResolvingEList<ValueSet>(ValueSet.class, this, TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS, InstancesPackage.VALUE_SET__IS_AN_INSTANCE_OF);
		}
		return hasInstanceValueSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getIsOfType() {
		if (isOfType != null && isOfType.eIsProxy()) {
			InternalEObject oldIsOfType = (InternalEObject)isOfType;
			isOfType = (DataType)eResolveProxy(oldIsOfType);
			if (isOfType != oldIsOfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ATTRIBUTE__IS_OF_TYPE, oldIsOfType, isOfType));
			}
		}
		return isOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetIsOfType() {
		return isOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOfType(DataType newIsOfType, NotificationChain msgs) {
		DataType oldIsOfType = isOfType;
		isOfType = newIsOfType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__IS_OF_TYPE, oldIsOfType, newIsOfType);
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
	public void setIsOfType(DataType newIsOfType) {
		if (newIsOfType != isOfType) {
			NotificationChain msgs = null;
			if (isOfType != null)
				msgs = ((InternalEObject)isOfType).eInverseRemove(this, TypesPackage.DATA_TYPE__APPLIES_TO, DataType.class, msgs);
			if (newIsOfType != null)
				msgs = ((InternalEObject)newIsOfType).eInverseAdd(this, TypesPackage.DATA_TYPE__APPLIES_TO, DataType.class, msgs);
			msgs = basicSetIsOfType(newIsOfType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__IS_OF_TYPE, newIsOfType, newIsOfType));
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
			case TypesPackage.ATTRIBUTE__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, TypesPackage.CLASS__OWNS_ATTRIBUTES, conml.types.Class.class, msgs);
				return basicSetOwner((conml.types.Class)otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTo()).basicAdd(otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInstanceValueSets()).basicAdd(otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__IS_OF_TYPE:
				if (isOfType != null)
					msgs = ((InternalEObject)isOfType).eInverseRemove(this, TypesPackage.DATA_TYPE__APPLIES_TO, DataType.class, msgs);
				return basicSetIsOfType((DataType)otherEnd, msgs);
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
			case TypesPackage.ATTRIBUTE__OWNER:
				return basicSetOwner(null, msgs);
			case TypesPackage.ATTRIBUTE__ASSIGNED_TO:
				return ((InternalEList<?>)getAssignedTo()).basicRemove(otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return ((InternalEList<?>)getHasInstanceValueSets()).basicRemove(otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__IS_OF_TYPE:
				return basicSetIsOfType(null, msgs);
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
			case TypesPackage.ATTRIBUTE__IS_MULTILINGUAL:
				return isIsMultilingual();
			case TypesPackage.ATTRIBUTE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case TypesPackage.ATTRIBUTE__ASSIGNED_TO:
				return getAssignedTo();
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return getHasInstanceValueSets();
			case TypesPackage.ATTRIBUTE__IS_OF_TYPE:
				if (resolve) return getIsOfType();
				return basicGetIsOfType();
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
			case TypesPackage.ATTRIBUTE__IS_MULTILINGUAL:
				setIsMultilingual((Boolean)newValue);
				return;
			case TypesPackage.ATTRIBUTE__OWNER:
				setOwner((conml.types.Class)newValue);
				return;
			case TypesPackage.ATTRIBUTE__ASSIGNED_TO:
				getAssignedTo().clear();
				getAssignedTo().addAll((Collection<? extends conml.types.Class>)newValue);
				return;
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				getHasInstanceValueSets().clear();
				getHasInstanceValueSets().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case TypesPackage.ATTRIBUTE__IS_OF_TYPE:
				setIsOfType((DataType)newValue);
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
			case TypesPackage.ATTRIBUTE__IS_MULTILINGUAL:
				setIsMultilingual(IS_MULTILINGUAL_EDEFAULT);
				return;
			case TypesPackage.ATTRIBUTE__OWNER:
				setOwner((conml.types.Class)null);
				return;
			case TypesPackage.ATTRIBUTE__ASSIGNED_TO:
				getAssignedTo().clear();
				return;
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				getHasInstanceValueSets().clear();
				return;
			case TypesPackage.ATTRIBUTE__IS_OF_TYPE:
				setIsOfType((DataType)null);
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
			case TypesPackage.ATTRIBUTE__IS_MULTILINGUAL:
				return isMultilingual != IS_MULTILINGUAL_EDEFAULT;
			case TypesPackage.ATTRIBUTE__OWNER:
				return owner != null;
			case TypesPackage.ATTRIBUTE__ASSIGNED_TO:
				return assignedTo != null && !assignedTo.isEmpty();
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return hasInstanceValueSets != null && !hasInstanceValueSets.isEmpty();
			case TypesPackage.ATTRIBUTE__IS_OF_TYPE:
				return isOfType != null;
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
		result.append(" (isMultilingual: ");
		result.append(isMultilingual);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
