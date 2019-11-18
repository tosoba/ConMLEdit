/**
 */
package conml.types.impl;

import conml.impl.ModelElementImpl;
import conml.types.TypeModel;
import conml.types.TypeModelElement;
import conml.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.TypeModelElementImpl#getTypeModel <em>Type Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeModelElementImpl extends ModelElementImpl implements TypeModelElement {
	/**
	 * The cached value of the '{@link #getTypeModel() <em>Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeModel()
	 * @generated
	 * @ordered
	 */
	protected TypeModel typeModel;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_MODEL_ELEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModel getTypeModel() {
		if (typeModel != null && typeModel.eIsProxy()) {
			InternalEObject oldTypeModel = (InternalEObject)typeModel;
			typeModel = (TypeModel)eResolveProxy(oldTypeModel);
			if (typeModel != oldTypeModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL, oldTypeModel, typeModel));
			}
		}
		return typeModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetTypeModel() {
		return typeModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeModel(TypeModel newTypeModel, NotificationChain msgs) {
		TypeModel oldTypeModel = typeModel;
		typeModel = newTypeModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL, oldTypeModel, newTypeModel);
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
	public void setTypeModel(TypeModel newTypeModel) {
		if (newTypeModel != typeModel) {
			NotificationChain msgs = null;
			if (typeModel != null)
				msgs = ((InternalEObject)typeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__ELEMENTS, TypeModel.class, msgs);
			if (newTypeModel != null)
				msgs = ((InternalEObject)newTypeModel).eInverseAdd(this, TypesPackage.TYPE_MODEL__ELEMENTS, TypeModel.class, msgs);
			msgs = basicSetTypeModel(newTypeModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL, newTypeModel, newTypeModel));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL:
				if (typeModel != null)
					msgs = ((InternalEObject)typeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__ELEMENTS, TypeModel.class, msgs);
				return basicSetTypeModel((TypeModel)otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL:
				return basicSetTypeModel(null, msgs);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL:
				if (resolve) return getTypeModel();
				return basicGetTypeModel();
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
			case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL:
				setTypeModel((TypeModel)newValue);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL:
				setTypeModel((TypeModel)null);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL:
				return typeModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeModelElementImpl
