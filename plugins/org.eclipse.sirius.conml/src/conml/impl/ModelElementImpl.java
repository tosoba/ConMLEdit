/**
 */
package conml.impl;

import conml.MetaInformation;
import conml.ModelElement;
import conml.Tag;
import conml.conmlPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link conml.impl.ModelElementImpl#getElementMetaInformation <em>Element Meta Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ModelPartImpl implements ModelElement {
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
	 * The cached value of the '{@link #getElementMetaInformation() <em>Element Meta Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementMetaInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaInformation> elementMetaInformation;

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
	public EList<MetaInformation> getElementMetaInformation() {
		if (elementMetaInformation == null) {
			elementMetaInformation = new EObjectWithInverseResolvingEList.ManyInverse<MetaInformation>(MetaInformation.class, this, conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION, conmlPackage.META_INFORMATION__MODEL_ELEMENTS);
		}
		return elementMetaInformation;
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
			case conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementMetaInformation()).basicAdd(otherEnd, msgs);
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
			case conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION:
				return ((InternalEList<?>)getElementMetaInformation()).basicRemove(otherEnd, msgs);
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
			case conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION:
				return getElementMetaInformation();
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
			case conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION:
				getElementMetaInformation().clear();
				getElementMetaInformation().addAll((Collection<? extends MetaInformation>)newValue);
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
			case conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION:
				getElementMetaInformation().clear();
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
			case conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION:
				return elementMetaInformation != null && !elementMetaInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
