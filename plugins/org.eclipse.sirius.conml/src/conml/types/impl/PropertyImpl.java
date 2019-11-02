/**
 */
package conml.types.impl;

import conml.types.Property;
import conml.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.PropertyImpl#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link conml.types.impl.PropertyImpl#getOwnerClass <em>Owner Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends FeatureImpl implements Property {
	/**
	 * The cached value of the '{@link #getRedefinedProperty() <em>Redefined Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperty()
	 * @generated
	 * @ordered
	 */
	protected Property redefinedProperty;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.PROPERTY;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getRedefinedProperty() {
		if (redefinedProperty != null && redefinedProperty.eIsProxy()) {
			InternalEObject oldRedefinedProperty = (InternalEObject)redefinedProperty;
			redefinedProperty = (Property)eResolveProxy(oldRedefinedProperty);
			if (redefinedProperty != oldRedefinedProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.PROPERTY__REDEFINED_PROPERTY, oldRedefinedProperty, redefinedProperty));
			}
		}
		return redefinedProperty;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetRedefinedProperty() {
		return redefinedProperty;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefinedProperty(Property newRedefinedProperty) {
		Property oldRedefinedProperty = redefinedProperty;
		redefinedProperty = newRedefinedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__REDEFINED_PROPERTY, oldRedefinedProperty, redefinedProperty));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getOwnerClass() {
		if (eContainerFeatureID() != TypesPackage.PROPERTY__OWNER_CLASS) return null;
		return (conml.types.Class)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(conml.types.Class newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, TypesPackage.PROPERTY__OWNER_CLASS, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerClass(conml.types.Class newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID() != TypesPackage.PROPERTY__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, TypesPackage.CLASS__PROPERTIES, conml.types.Class.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PROPERTY__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerClass((conml.types.Class)otherEnd, msgs);
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
			case TypesPackage.PROPERTY__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
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
			case TypesPackage.PROPERTY__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, TypesPackage.CLASS__PROPERTIES, conml.types.Class.class, msgs);
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
			case TypesPackage.PROPERTY__REDEFINED_PROPERTY:
				if (resolve) return getRedefinedProperty();
				return basicGetRedefinedProperty();
			case TypesPackage.PROPERTY__OWNER_CLASS:
				return getOwnerClass();
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
			case TypesPackage.PROPERTY__REDEFINED_PROPERTY:
				setRedefinedProperty((Property)newValue);
				return;
			case TypesPackage.PROPERTY__OWNER_CLASS:
				setOwnerClass((conml.types.Class)newValue);
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
			case TypesPackage.PROPERTY__REDEFINED_PROPERTY:
				setRedefinedProperty((Property)null);
				return;
			case TypesPackage.PROPERTY__OWNER_CLASS:
				setOwnerClass((conml.types.Class)null);
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
			case TypesPackage.PROPERTY__REDEFINED_PROPERTY:
				return redefinedProperty != null;
			case TypesPackage.PROPERTY__OWNER_CLASS:
				return getOwnerClass() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyImpl
