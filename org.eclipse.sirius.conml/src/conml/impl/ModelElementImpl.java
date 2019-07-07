/**
 */
package conml.impl;

import conml.Model;
import conml.ModelElement;
import conml.Tag;
import conml.conmlPackage;

import conml.instances.InstancesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.ModelElementImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link conml.impl.ModelElementImpl#getIsTaggedWith <em>Is Tagged With</em>}</li>
 *   <li>{@link conml.impl.ModelElementImpl#getIsDocumentedBy <em>Is Documented By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ModelPartImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getIsTaggedWith() <em>Is Tagged With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTaggedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> isTaggedWith;

	/**
	 * The cached value of the '{@link #getIsDocumentedBy() <em>Is Documented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDocumentedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> isDocumentedBy;

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
	public Model getBelongsTo() {
		if (eContainerFeatureID() != conmlPackage.MODEL_ELEMENT__BELONGS_TO) return null;
		return (Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(Model newBelongsTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsTo, conmlPackage.MODEL_ELEMENT__BELONGS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBelongsTo(Model newBelongsTo) {
		if (newBelongsTo != eInternalContainer() || (eContainerFeatureID() != conmlPackage.MODEL_ELEMENT__BELONGS_TO && newBelongsTo != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, conmlPackage.MODEL__OWNS_ELEMENTS, Model.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL_ELEMENT__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getIsTaggedWith() {
		if (isTaggedWith == null) {
			isTaggedWith = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH, conmlPackage.TAG__APPLIES_TO);
		}
		return isTaggedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getIsDocumentedBy() {
		if (isDocumentedBy == null) {
			isDocumentedBy = new EObjectWithInverseResolvingEList.ManyInverse<conml.instances.Object>(conml.instances.Object.class, this, conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY, InstancesPackage.OBJECT__DOCUMENTS);
		}
		return isDocumentedBy;
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsTo((Model)otherEnd, msgs);
			case conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTaggedWith()).basicAdd(otherEnd, msgs);
			case conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDocumentedBy()).basicAdd(otherEnd, msgs);
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH:
				return ((InternalEList<?>)getIsTaggedWith()).basicRemove(otherEnd, msgs);
			case conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY:
				return ((InternalEList<?>)getIsDocumentedBy()).basicRemove(otherEnd, msgs);
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				return eInternalContainer().eInverseRemove(this, conmlPackage.MODEL__OWNS_ELEMENTS, Model.class, msgs);
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				return getBelongsTo();
			case conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH:
				return getIsTaggedWith();
			case conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY:
				return getIsDocumentedBy();
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				setBelongsTo((Model)newValue);
				return;
			case conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH:
				getIsTaggedWith().clear();
				getIsTaggedWith().addAll((Collection<? extends Tag>)newValue);
				return;
			case conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY:
				getIsDocumentedBy().clear();
				getIsDocumentedBy().addAll((Collection<? extends conml.instances.Object>)newValue);
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				setBelongsTo((Model)null);
				return;
			case conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH:
				getIsTaggedWith().clear();
				return;
			case conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY:
				getIsDocumentedBy().clear();
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
			case conmlPackage.MODEL_ELEMENT__BELONGS_TO:
				return getBelongsTo() != null;
			case conmlPackage.MODEL_ELEMENT__IS_TAGGED_WITH:
				return isTaggedWith != null && !isTaggedWith.isEmpty();
			case conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY:
				return isDocumentedBy != null && !isDocumentedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
