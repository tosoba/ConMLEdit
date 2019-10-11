/**
 */
package conml.types.impl;

import conml.impl.ModelImpl;

import conml.instances.InstanceModel;
import conml.instances.InstancesPackage;

import conml.types.TypeModel;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.TypeModelImpl#getConformingInstanceModel <em>Conforming Instance Model</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getExtendedTypeModel <em>Extended Type Model</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getExtendingTypeModels <em>Extending Type Models</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getParticularInTypeModel <em>Particular In Type Model</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getHasParticularTypeModels <em>Has Particular Type Models</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getSubjectiveAspect <em>Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getTemporalAspect <em>Temporal Aspect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeModelImpl extends ModelImpl implements TypeModel {
	/**
	 * The cached value of the '{@link #getConformingInstanceModel() <em>Conforming Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformingInstanceModel()
	 * @generated
	 * @ordered
	 */
	protected InstanceModel conformingInstanceModel;

  /**
	 * The cached value of the '{@link #getExtendedTypeModel() <em>Extended Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedTypeModel()
	 * @generated
	 * @ordered
	 */
	protected TypeModel extendedTypeModel;

  /**
	 * The cached value of the '{@link #getExtendingTypeModels() <em>Extending Type Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendingTypeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> extendingTypeModels;

  /**
	 * The cached value of the '{@link #getParticularInTypeModel() <em>Particular In Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticularInTypeModel()
	 * @generated
	 * @ordered
	 */
	protected TypeModel particularInTypeModel;

  /**
	 * The cached value of the '{@link #getHasParticularTypeModels() <em>Has Particular Type Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParticularTypeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> hasParticularTypeModels;

  /**
	 * The cached value of the '{@link #getSubjectiveAspect() <em>Subjective Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveAspect()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class subjectiveAspect;

  /**
	 * The cached value of the '{@link #getTemporalAspect() <em>Temporal Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalAspect()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class temporalAspect;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceModel getConformingInstanceModel() {
		if (conformingInstanceModel != null && conformingInstanceModel.eIsProxy()) {
			InternalEObject oldConformingInstanceModel = (InternalEObject)conformingInstanceModel;
			conformingInstanceModel = (InstanceModel)eResolveProxy(oldConformingInstanceModel);
			if (conformingInstanceModel != oldConformingInstanceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL, oldConformingInstanceModel, conformingInstanceModel));
			}
		}
		return conformingInstanceModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModel basicGetConformingInstanceModel() {
		return conformingInstanceModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformingInstanceModel(InstanceModel newConformingInstanceModel, NotificationChain msgs) {
		InstanceModel oldConformingInstanceModel = conformingInstanceModel;
		conformingInstanceModel = newConformingInstanceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL, oldConformingInstanceModel, newConformingInstanceModel);
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
	public void setConformingInstanceModel(InstanceModel newConformingInstanceModel) {
		if (newConformingInstanceModel != conformingInstanceModel) {
			NotificationChain msgs = null;
			if (conformingInstanceModel != null)
				msgs = ((InternalEObject)conformingInstanceModel).eInverseRemove(this, InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS, InstanceModel.class, msgs);
			if (newConformingInstanceModel != null)
				msgs = ((InternalEObject)newConformingInstanceModel).eInverseAdd(this, InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS, InstanceModel.class, msgs);
			msgs = basicSetConformingInstanceModel(newConformingInstanceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL, newConformingInstanceModel, newConformingInstanceModel));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModel getExtendedTypeModel() {
		if (extendedTypeModel != null && extendedTypeModel.eIsProxy()) {
			InternalEObject oldExtendedTypeModel = (InternalEObject)extendedTypeModel;
			extendedTypeModel = (TypeModel)eResolveProxy(oldExtendedTypeModel);
			if (extendedTypeModel != oldExtendedTypeModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL, oldExtendedTypeModel, extendedTypeModel));
			}
		}
		return extendedTypeModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetExtendedTypeModel() {
		return extendedTypeModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedTypeModel(TypeModel newExtendedTypeModel, NotificationChain msgs) {
		TypeModel oldExtendedTypeModel = extendedTypeModel;
		extendedTypeModel = newExtendedTypeModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL, oldExtendedTypeModel, newExtendedTypeModel);
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
	public void setExtendedTypeModel(TypeModel newExtendedTypeModel) {
		if (newExtendedTypeModel != extendedTypeModel) {
			NotificationChain msgs = null;
			if (extendedTypeModel != null)
				msgs = ((InternalEObject)extendedTypeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS, TypeModel.class, msgs);
			if (newExtendedTypeModel != null)
				msgs = ((InternalEObject)newExtendedTypeModel).eInverseAdd(this, TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS, TypeModel.class, msgs);
			msgs = basicSetExtendedTypeModel(newExtendedTypeModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL, newExtendedTypeModel, newExtendedTypeModel));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeModel> getExtendingTypeModels() {
		if (extendingTypeModels == null) {
			extendingTypeModels = new EObjectWithInverseResolvingEList<TypeModel>(TypeModel.class, this, TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS, TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL);
		}
		return extendingTypeModels;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModel getParticularInTypeModel() {
		if (particularInTypeModel != null && particularInTypeModel.eIsProxy()) {
			InternalEObject oldParticularInTypeModel = (InternalEObject)particularInTypeModel;
			particularInTypeModel = (TypeModel)eResolveProxy(oldParticularInTypeModel);
			if (particularInTypeModel != oldParticularInTypeModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL, oldParticularInTypeModel, particularInTypeModel));
			}
		}
		return particularInTypeModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetParticularInTypeModel() {
		return particularInTypeModel;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticularInTypeModel(TypeModel newParticularInTypeModel, NotificationChain msgs) {
		TypeModel oldParticularInTypeModel = particularInTypeModel;
		particularInTypeModel = newParticularInTypeModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL, oldParticularInTypeModel, newParticularInTypeModel);
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
	public void setParticularInTypeModel(TypeModel newParticularInTypeModel) {
		if (newParticularInTypeModel != particularInTypeModel) {
			NotificationChain msgs = null;
			if (particularInTypeModel != null)
				msgs = ((InternalEObject)particularInTypeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS, TypeModel.class, msgs);
			if (newParticularInTypeModel != null)
				msgs = ((InternalEObject)newParticularInTypeModel).eInverseAdd(this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS, TypeModel.class, msgs);
			msgs = basicSetParticularInTypeModel(newParticularInTypeModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL, newParticularInTypeModel, newParticularInTypeModel));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeModel> getHasParticularTypeModels() {
		if (hasParticularTypeModels == null) {
			hasParticularTypeModels = new EObjectWithInverseResolvingEList<TypeModel>(TypeModel.class, this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS, TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL);
		}
		return hasParticularTypeModels;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getSubjectiveAspect() {
		if (subjectiveAspect != null && subjectiveAspect.eIsProxy()) {
			InternalEObject oldSubjectiveAspect = (InternalEObject)subjectiveAspect;
			subjectiveAspect = (conml.types.Class)eResolveProxy(oldSubjectiveAspect);
			if (subjectiveAspect != oldSubjectiveAspect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT, oldSubjectiveAspect, subjectiveAspect));
			}
		}
		return subjectiveAspect;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetSubjectiveAspect() {
		return subjectiveAspect;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectiveAspect(conml.types.Class newSubjectiveAspect) {
		conml.types.Class oldSubjectiveAspect = subjectiveAspect;
		subjectiveAspect = newSubjectiveAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT, oldSubjectiveAspect, subjectiveAspect));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getTemporalAspect() {
		if (temporalAspect != null && temporalAspect.eIsProxy()) {
			InternalEObject oldTemporalAspect = (InternalEObject)temporalAspect;
			temporalAspect = (conml.types.Class)eResolveProxy(oldTemporalAspect);
			if (temporalAspect != oldTemporalAspect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT, oldTemporalAspect, temporalAspect));
			}
		}
		return temporalAspect;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetTemporalAspect() {
		return temporalAspect;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalAspect(conml.types.Class newTemporalAspect) {
		conml.types.Class oldTemporalAspect = temporalAspect;
		temporalAspect = newTemporalAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT, oldTemporalAspect, temporalAspect));
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
			case TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL:
				if (conformingInstanceModel != null)
					msgs = ((InternalEObject)conformingInstanceModel).eInverseRemove(this, InstancesPackage.INSTANCE_MODEL__CONFORMED_TYPE_MODELS, InstanceModel.class, msgs);
				return basicSetConformingInstanceModel((InstanceModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL:
				if (extendedTypeModel != null)
					msgs = ((InternalEObject)extendedTypeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS, TypeModel.class, msgs);
				return basicSetExtendedTypeModel((TypeModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendingTypeModels()).basicAdd(otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL:
				if (particularInTypeModel != null)
					msgs = ((InternalEObject)particularInTypeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS, TypeModel.class, msgs);
				return basicSetParticularInTypeModel((TypeModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasParticularTypeModels()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL:
				return basicSetConformingInstanceModel(null, msgs);
			case TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL:
				return basicSetExtendedTypeModel(null, msgs);
			case TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS:
				return ((InternalEList<?>)getExtendingTypeModels()).basicRemove(otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL:
				return basicSetParticularInTypeModel(null, msgs);
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS:
				return ((InternalEList<?>)getHasParticularTypeModels()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL:
				if (resolve) return getConformingInstanceModel();
				return basicGetConformingInstanceModel();
			case TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL:
				if (resolve) return getExtendedTypeModel();
				return basicGetExtendedTypeModel();
			case TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS:
				return getExtendingTypeModels();
			case TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL:
				if (resolve) return getParticularInTypeModel();
				return basicGetParticularInTypeModel();
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS:
				return getHasParticularTypeModels();
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				if (resolve) return getSubjectiveAspect();
				return basicGetSubjectiveAspect();
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				if (resolve) return getTemporalAspect();
				return basicGetTemporalAspect();
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
			case TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL:
				setConformingInstanceModel((InstanceModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL:
				setExtendedTypeModel((TypeModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS:
				getExtendingTypeModels().clear();
				getExtendingTypeModels().addAll((Collection<? extends TypeModel>)newValue);
				return;
			case TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL:
				setParticularInTypeModel((TypeModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS:
				getHasParticularTypeModels().clear();
				getHasParticularTypeModels().addAll((Collection<? extends TypeModel>)newValue);
				return;
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				setSubjectiveAspect((conml.types.Class)newValue);
				return;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				setTemporalAspect((conml.types.Class)newValue);
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
			case TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL:
				setConformingInstanceModel((InstanceModel)null);
				return;
			case TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL:
				setExtendedTypeModel((TypeModel)null);
				return;
			case TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS:
				getExtendingTypeModels().clear();
				return;
			case TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL:
				setParticularInTypeModel((TypeModel)null);
				return;
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS:
				getHasParticularTypeModels().clear();
				return;
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				setSubjectiveAspect((conml.types.Class)null);
				return;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				setTemporalAspect((conml.types.Class)null);
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
			case TypesPackage.TYPE_MODEL__CONFORMING_INSTANCE_MODEL:
				return conformingInstanceModel != null;
			case TypesPackage.TYPE_MODEL__EXTENDED_TYPE_MODEL:
				return extendedTypeModel != null;
			case TypesPackage.TYPE_MODEL__EXTENDING_TYPE_MODELS:
				return extendingTypeModels != null && !extendingTypeModels.isEmpty();
			case TypesPackage.TYPE_MODEL__PARTICULAR_IN_TYPE_MODEL:
				return particularInTypeModel != null;
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR_TYPE_MODELS:
				return hasParticularTypeModels != null && !hasParticularTypeModels.isEmpty();
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				return subjectiveAspect != null;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				return temporalAspect != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeModelImpl
