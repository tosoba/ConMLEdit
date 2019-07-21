/**
 */
package conml.types.impl;

import conml.impl.ModelElementImpl;

import conml.types.TypeModel;
import conml.types.TypeModelElement;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.TypeModelElementImpl#getIsAssignedTo <em>Is Assigned To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeModelElementImpl extends ModelElementImpl implements TypeModelElement {
	/**
	 * The cached value of the '{@link #getIsAssignedTo() <em>Is Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> isAssignedTo;

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
	public EList<TypeModel> getIsAssignedTo() {
		if (isAssignedTo == null) {
			isAssignedTo = new EObjectWithInverseResolvingEList.ManyInverse<TypeModel>(TypeModel.class, this, TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO, TypesPackage.TYPE_MODEL__HAS_ELEMENTS);
		}
		return isAssignedTo;
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
			case TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsAssignedTo()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO:
				return ((InternalEList<?>)getIsAssignedTo()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO:
				return getIsAssignedTo();
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
			case TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO:
				getIsAssignedTo().clear();
				getIsAssignedTo().addAll((Collection<? extends TypeModel>)newValue);
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
			case TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO:
				getIsAssignedTo().clear();
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
			case TypesPackage.TYPE_MODEL_ELEMENT__IS_ASSIGNED_TO:
				return isAssignedTo != null && !isAssignedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeModelElementImpl
