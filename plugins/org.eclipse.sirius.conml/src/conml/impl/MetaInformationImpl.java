/**
 */
package conml.impl;

import conml.MetaInformation;
import conml.Model;
import conml.ModelElement;
import conml.conmlPackage;

import conml.instances.InstancesPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.MetaInformationImpl#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link conml.impl.MetaInformationImpl#getMetaInfoObject <em>Meta Info Object</em>}</li>
 *   <li>{@link conml.impl.MetaInformationImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaInformationImpl extends MinimalEObjectImpl.Container implements MetaInformation {
	/**
	 * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelElements;

  /**
	 * The cached value of the '{@link #getMetaInfoObject() <em>Meta Info Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInfoObject()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object metaInfoObject;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.META_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getModelElements() {
		if (modelElements == null) {
			modelElements = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this, conmlPackage.META_INFORMATION__MODEL_ELEMENTS, conmlPackage.MODEL_ELEMENT__ELEMENT_META_INFORMATION);
		}
		return modelElements;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getMetaInfoObject() {
		if (metaInfoObject != null && metaInfoObject.eIsProxy()) {
			InternalEObject oldMetaInfoObject = (InternalEObject)metaInfoObject;
			metaInfoObject = (conml.instances.Object)eResolveProxy(oldMetaInfoObject);
			if (metaInfoObject != oldMetaInfoObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, conmlPackage.META_INFORMATION__META_INFO_OBJECT, oldMetaInfoObject, metaInfoObject));
			}
		}
		return metaInfoObject;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetMetaInfoObject() {
		return metaInfoObject;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaInfoObject(conml.instances.Object newMetaInfoObject, NotificationChain msgs) {
		conml.instances.Object oldMetaInfoObject = metaInfoObject;
		metaInfoObject = newMetaInfoObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, conmlPackage.META_INFORMATION__META_INFO_OBJECT, oldMetaInfoObject, newMetaInfoObject);
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
	public void setMetaInfoObject(conml.instances.Object newMetaInfoObject) {
		if (newMetaInfoObject != metaInfoObject) {
			NotificationChain msgs = null;
			if (metaInfoObject != null)
				msgs = ((InternalEObject)metaInfoObject).eInverseRemove(this, InstancesPackage.OBJECT__OBJECT_META_INFORMATION, conml.instances.Object.class, msgs);
			if (newMetaInfoObject != null)
				msgs = ((InternalEObject)newMetaInfoObject).eInverseAdd(this, InstancesPackage.OBJECT__OBJECT_META_INFORMATION, conml.instances.Object.class, msgs);
			msgs = basicSetMetaInfoObject(newMetaInfoObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.META_INFORMATION__META_INFO_OBJECT, newMetaInfoObject, newMetaInfoObject));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		if (eContainerFeatureID() != conmlPackage.META_INFORMATION__MODEL) return null;
		return (Model)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, conmlPackage.META_INFORMATION__MODEL, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != conmlPackage.META_INFORMATION__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, conmlPackage.MODEL__META_INFORMATION, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.META_INFORMATION__MODEL, newModel, newModel));
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
			case conmlPackage.META_INFORMATION__MODEL_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelElements()).basicAdd(otherEnd, msgs);
			case conmlPackage.META_INFORMATION__META_INFO_OBJECT:
				if (metaInfoObject != null)
					msgs = ((InternalEObject)metaInfoObject).eInverseRemove(this, InstancesPackage.OBJECT__OBJECT_META_INFORMATION, conml.instances.Object.class, msgs);
				return basicSetMetaInfoObject((conml.instances.Object)otherEnd, msgs);
			case conmlPackage.META_INFORMATION__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
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
			case conmlPackage.META_INFORMATION__MODEL_ELEMENTS:
				return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
			case conmlPackage.META_INFORMATION__META_INFO_OBJECT:
				return basicSetMetaInfoObject(null, msgs);
			case conmlPackage.META_INFORMATION__MODEL:
				return basicSetModel(null, msgs);
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
			case conmlPackage.META_INFORMATION__MODEL:
				return eInternalContainer().eInverseRemove(this, conmlPackage.MODEL__META_INFORMATION, Model.class, msgs);
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
			case conmlPackage.META_INFORMATION__MODEL_ELEMENTS:
				return getModelElements();
			case conmlPackage.META_INFORMATION__META_INFO_OBJECT:
				if (resolve) return getMetaInfoObject();
				return basicGetMetaInfoObject();
			case conmlPackage.META_INFORMATION__MODEL:
				return getModel();
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
			case conmlPackage.META_INFORMATION__MODEL_ELEMENTS:
				getModelElements().clear();
				getModelElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case conmlPackage.META_INFORMATION__META_INFO_OBJECT:
				setMetaInfoObject((conml.instances.Object)newValue);
				return;
			case conmlPackage.META_INFORMATION__MODEL:
				setModel((Model)newValue);
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
			case conmlPackage.META_INFORMATION__MODEL_ELEMENTS:
				getModelElements().clear();
				return;
			case conmlPackage.META_INFORMATION__META_INFO_OBJECT:
				setMetaInfoObject((conml.instances.Object)null);
				return;
			case conmlPackage.META_INFORMATION__MODEL:
				setModel((Model)null);
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
			case conmlPackage.META_INFORMATION__MODEL_ELEMENTS:
				return modelElements != null && !modelElements.isEmpty();
			case conmlPackage.META_INFORMATION__META_INFO_OBJECT:
				return metaInfoObject != null;
			case conmlPackage.META_INFORMATION__MODEL:
				return getModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //MetaInformationImpl
