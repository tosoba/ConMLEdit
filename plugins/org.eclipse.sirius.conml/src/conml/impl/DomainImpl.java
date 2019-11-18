/**
 */
package conml.impl;

import conml.Domain;
import conml.Model;
import conml.ModelPart;
import conml.conmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.DomainImpl#getModels <em>Models</em>}</li>
 *   <li>{@link conml.impl.DomainImpl#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelPart> parts;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, conmlPackage.DOMAIN__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelPart> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<ModelPart>(ModelPart.class, this, conmlPackage.DOMAIN__PARTS);
		}
		return parts;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case conmlPackage.DOMAIN__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case conmlPackage.DOMAIN__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case conmlPackage.DOMAIN__MODELS:
				return getModels();
			case conmlPackage.DOMAIN__PARTS:
				return getParts();
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
			case conmlPackage.DOMAIN__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case conmlPackage.DOMAIN__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends ModelPart>)newValue);
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
			case conmlPackage.DOMAIN__MODELS:
				getModels().clear();
				return;
			case conmlPackage.DOMAIN__PARTS:
				getParts().clear();
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
			case conmlPackage.DOMAIN__MODELS:
				return models != null && !models.isEmpty();
			case conmlPackage.DOMAIN__PARTS:
				return parts != null && !parts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
