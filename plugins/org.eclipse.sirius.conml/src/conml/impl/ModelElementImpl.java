/**
 */
package conml.impl;

import conml.ModelElement;
import conml.Tag;
import conml.conmlPackage;
import conml.instances.InstancesPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.ModelElementImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.impl.ModelElementImpl#getMetaInformationObjects <em>Meta Information Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

  /**
	 * The cached value of the '{@link #getMetaInformationObjects() <em>Meta Information Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInformationObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> metaInformationObjects;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, conmlPackage.MODEL_ELEMENT__TAGS);
		}
		return tags;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getMetaInformationObjects() {
		if (metaInformationObjects == null) {
			metaInformationObjects = new EObjectWithInverseResolvingEList.ManyInverse<conml.instances.Object>(conml.instances.Object.class, this, conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS, InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS);
		}
		return metaInformationObjects;
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
			case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaInformationObjects()).basicAdd(otherEnd, msgs);
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
			case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS:
				return ((InternalEList<?>)getMetaInformationObjects()).basicRemove(otherEnd, msgs);
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				return getTags();
			case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS:
				return getMetaInformationObjects();
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS:
				getMetaInformationObjects().clear();
				getMetaInformationObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				getTags().clear();
				return;
			case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS:
				getMetaInformationObjects().clear();
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				return tags != null && !tags.isEmpty();
			case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS:
				return metaInformationObjects != null && !metaInformationObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
