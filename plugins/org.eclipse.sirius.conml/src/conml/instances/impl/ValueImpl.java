/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.Value;

import conml.instances.ValueSet;
import java.lang.Object;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ValueImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link conml.instances.impl.ValueImpl#getOwnerValueSet <em>Owner Value Set</em>}</li>
 *   <li>{@link conml.instances.impl.ValueImpl#isUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends FacetImpl implements Value {
	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected Object contents = CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNKNOWN_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknown()
	 * @generated
	 * @ordered
	 */
	protected boolean unknown = UNKNOWN_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(Object newContents) {
		Object oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE__CONTENTS, oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet getOwnerValueSet() {
		if (eContainerFeatureID() != InstancesPackage.VALUE__OWNER_VALUE_SET) return null;
		return (ValueSet)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerValueSet(ValueSet newOwnerValueSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerValueSet, InstancesPackage.VALUE__OWNER_VALUE_SET, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerValueSet(ValueSet newOwnerValueSet) {
		if (newOwnerValueSet != eInternalContainer() || (eContainerFeatureID() != InstancesPackage.VALUE__OWNER_VALUE_SET && newOwnerValueSet != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerValueSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerValueSet != null)
				msgs = ((InternalEObject)newOwnerValueSet).eInverseAdd(this, InstancesPackage.VALUE_SET__VALUES, ValueSet.class, msgs);
			msgs = basicSetOwnerValueSet(newOwnerValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE__OWNER_VALUE_SET, newOwnerValueSet, newOwnerValueSet));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnknown() {
		return unknown;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknown(boolean newUnknown) {
		boolean oldUnknown = unknown;
		unknown = newUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE__UNKNOWN, oldUnknown, unknown));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerValueSet((ValueSet)otherEnd, msgs);
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
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				return basicSetOwnerValueSet(null, msgs);
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
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				return eInternalContainer().eInverseRemove(this, InstancesPackage.VALUE_SET__VALUES, ValueSet.class, msgs);
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
			case InstancesPackage.VALUE__CONTENTS:
				return getContents();
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				return getOwnerValueSet();
			case InstancesPackage.VALUE__UNKNOWN:
				return isUnknown();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancesPackage.VALUE__CONTENTS:
				setContents(newValue);
				return;
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				setOwnerValueSet((ValueSet)newValue);
				return;
			case InstancesPackage.VALUE__UNKNOWN:
				setUnknown((Boolean)newValue);
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
			case InstancesPackage.VALUE__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				setOwnerValueSet((ValueSet)null);
				return;
			case InstancesPackage.VALUE__UNKNOWN:
				setUnknown(UNKNOWN_EDEFAULT);
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
			case InstancesPackage.VALUE__CONTENTS:
				return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
			case InstancesPackage.VALUE__OWNER_VALUE_SET:
				return getOwnerValueSet() != null;
			case InstancesPackage.VALUE__UNKNOWN:
				return unknown != UNKNOWN_EDEFAULT;
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
		result.append(" (contents: ");
		result.append(contents);
		result.append(", unknown: ");
		result.append(unknown);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
