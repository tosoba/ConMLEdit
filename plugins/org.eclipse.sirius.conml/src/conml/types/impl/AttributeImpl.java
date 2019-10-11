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
 *   <li>{@link conml.types.impl.AttributeImpl#isMultilingual <em>Multilingual</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getInstanceValueSets <em>Instance Value Sets</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * The default value of the '{@link #isMultilingual() <em>Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultilingual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTILINGUAL_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMultilingual() <em>Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultilingual()
	 * @generated
	 * @ordered
	 */
	protected boolean multilingual = MULTILINGUAL_EDEFAULT;

  /**
	 * The cached value of the '{@link #getInstanceValueSets() <em>Instance Value Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> instanceValueSets;

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
	public boolean isMultilingual() {
		return multilingual;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultilingual(boolean newMultilingual) {
		boolean oldMultilingual = multilingual;
		multilingual = newMultilingual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__MULTILINGUAL, oldMultilingual, multilingual));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSet> getInstanceValueSets() {
		if (instanceValueSets == null) {
			instanceValueSets = new EObjectWithInverseResolvingEList<ValueSet>(ValueSet.class, this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE);
		}
		return instanceValueSets;
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
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstanceValueSets()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return ((InternalEList<?>)getInstanceValueSets()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				return isMultilingual();
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return getInstanceValueSets();
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				setMultilingual((Boolean)newValue);
				return;
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				getInstanceValueSets().clear();
				getInstanceValueSets().addAll((Collection<? extends ValueSet>)newValue);
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				setMultilingual(MULTILINGUAL_EDEFAULT);
				return;
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				getInstanceValueSets().clear();
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				return multilingual != MULTILINGUAL_EDEFAULT;
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return instanceValueSets != null && !instanceValueSets.isEmpty();
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
		result.append(" (multilingual: ");
		result.append(multilingual);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
