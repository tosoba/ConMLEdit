/**
 */
package conml.instances.impl;

import conml.instances.InstancesPackage;
import conml.instances.ValueSet;

import conml.types.Attribute;
import conml.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ValueSetImpl#getInstancedAttribute <em>Instanced Attribute</em>}</li>
 *   <li>{@link conml.instances.impl.ValueSetImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetImpl extends FacetSetImpl implements ValueSet {
	/**
	 * The cached value of the '{@link #getInstancedAttribute() <em>Instanced Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute instancedAttribute;

  /**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getInstancedAttribute() {
		if (instancedAttribute != null && instancedAttribute.eIsProxy()) {
			InternalEObject oldInstancedAttribute = (InternalEObject)instancedAttribute;
			instancedAttribute = (Attribute)eResolveProxy(oldInstancedAttribute);
			if (instancedAttribute != oldInstancedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE, oldInstancedAttribute, instancedAttribute));
			}
		}
		return instancedAttribute;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetInstancedAttribute() {
		return instancedAttribute;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancedAttribute(Attribute newInstancedAttribute, NotificationChain msgs) {
		Attribute oldInstancedAttribute = instancedAttribute;
		instancedAttribute = newInstancedAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE, oldInstancedAttribute, newInstancedAttribute);
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
	public void setInstancedAttribute(Attribute newInstancedAttribute) {
		if (newInstancedAttribute != instancedAttribute) {
			NotificationChain msgs = null;
			if (instancedAttribute != null)
				msgs = ((InternalEObject)instancedAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, Attribute.class, msgs);
			if (newInstancedAttribute != null)
				msgs = ((InternalEObject)newInstancedAttribute).eInverseAdd(this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, Attribute.class, msgs);
			msgs = basicSetInstancedAttribute(newInstancedAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE, newInstancedAttribute, newInstancedAttribute));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (conml.instances.Object)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.VALUE_SET__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(conml.instances.Object newOwner, NotificationChain msgs) {
		conml.instances.Object oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE_SET__OWNER, oldOwner, newOwner);
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
	public void setOwner(conml.instances.Object newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, InstancesPackage.OBJECT__OWNED_VALUE_SETS, conml.instances.Object.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, InstancesPackage.OBJECT__OWNED_VALUE_SETS, conml.instances.Object.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.VALUE_SET__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				if (instancedAttribute != null)
					msgs = ((InternalEObject)instancedAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, Attribute.class, msgs);
				return basicSetInstancedAttribute((Attribute)otherEnd, msgs);
			case InstancesPackage.VALUE_SET__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, InstancesPackage.OBJECT__OWNED_VALUE_SETS, conml.instances.Object.class, msgs);
				return basicSetOwner((conml.instances.Object)otherEnd, msgs);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				return basicSetInstancedAttribute(null, msgs);
			case InstancesPackage.VALUE_SET__OWNER:
				return basicSetOwner(null, msgs);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				if (resolve) return getInstancedAttribute();
				return basicGetInstancedAttribute();
			case InstancesPackage.VALUE_SET__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				setInstancedAttribute((Attribute)newValue);
				return;
			case InstancesPackage.VALUE_SET__OWNER:
				setOwner((conml.instances.Object)newValue);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				setInstancedAttribute((Attribute)null);
				return;
			case InstancesPackage.VALUE_SET__OWNER:
				setOwner((conml.instances.Object)null);
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
			case InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE:
				return instancedAttribute != null;
			case InstancesPackage.VALUE_SET__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetImpl
