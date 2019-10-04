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
 *   <li>{@link conml.types.impl.AttributeImpl#getHasInstanceValueSets <em>Has Instance Value Sets</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getDatatype <em>Datatype</em>}</li>
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
	 * The cached value of the '{@link #getHasInstanceValueSets() <em>Has Instance Value Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInstanceValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> hasInstanceValueSets;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

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
	public DataType getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (DataType)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ATTRIBUTE__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		return datatype;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__DATATYPE, oldDatatype, datatype));
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
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInstanceValueSets()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return ((InternalEList<?>)getHasInstanceValueSets()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return getHasInstanceValueSets();
			case TypesPackage.ATTRIBUTE__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
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
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				getHasInstanceValueSets().clear();
				getHasInstanceValueSets().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case TypesPackage.ATTRIBUTE__DATATYPE:
				setDatatype((DataType)newValue);
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
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				getHasInstanceValueSets().clear();
				return;
			case TypesPackage.ATTRIBUTE__DATATYPE:
				setDatatype((DataType)null);
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
			case TypesPackage.ATTRIBUTE__HAS_INSTANCE_VALUE_SETS:
				return hasInstanceValueSets != null && !hasInstanceValueSets.isEmpty();
			case TypesPackage.ATTRIBUTE__DATATYPE:
				return datatype != null;
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
