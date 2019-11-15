/**
 */
package conml.types.impl;

import conml.impl.ModelImpl;

import conml.instances.InstanceModel;
import conml.instances.InstancesPackage;

import conml.types.TypeModel;
import conml.types.TypeModelElement;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link conml.types.impl.TypeModelImpl#getBaseTypeModel <em>Base Type Model</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getParticularTypeModels <em>Particular Type Models</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getSubjectiveAspect <em>Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getTemporalAspect <em>Temporal Aspect</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getElements <em>Elements</em>}</li>
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
	 * The cached value of the '{@link #getBaseTypeModel() <em>Base Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeModel()
	 * @generated
	 * @ordered
	 */
	protected TypeModel baseTypeModel;

  /**
	 * The cached value of the '{@link #getParticularTypeModels() <em>Particular Type Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticularTypeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> particularTypeModels;

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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModelElement> elements;

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
	public TypeModel getBaseTypeModel() {
		if (baseTypeModel != null && baseTypeModel.eIsProxy()) {
			InternalEObject oldBaseTypeModel = (InternalEObject)baseTypeModel;
			baseTypeModel = (TypeModel)eResolveProxy(oldBaseTypeModel);
			if (baseTypeModel != oldBaseTypeModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL, oldBaseTypeModel, baseTypeModel));
			}
		}
		return baseTypeModel;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetBaseTypeModel() {
		return baseTypeModel;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseTypeModel(TypeModel newBaseTypeModel, NotificationChain msgs) {
		TypeModel oldBaseTypeModel = baseTypeModel;
		baseTypeModel = newBaseTypeModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL, oldBaseTypeModel, newBaseTypeModel);
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
	public void setBaseTypeModel(TypeModel newBaseTypeModel) {
		if (newBaseTypeModel != baseTypeModel) {
			NotificationChain msgs = null;
			if (baseTypeModel != null)
				msgs = ((InternalEObject)baseTypeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS, TypeModel.class, msgs);
			if (newBaseTypeModel != null)
				msgs = ((InternalEObject)newBaseTypeModel).eInverseAdd(this, TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS, TypeModel.class, msgs);
			msgs = basicSetBaseTypeModel(newBaseTypeModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL, newBaseTypeModel, newBaseTypeModel));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeModel> getParticularTypeModels() {
		if (particularTypeModels == null) {
			particularTypeModels = new EObjectWithInverseResolvingEList<TypeModel>(TypeModel.class, this, TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS, TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL);
		}
		return particularTypeModels;
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
	@Override
	public EList<TypeModelElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<TypeModelElement>(TypeModelElement.class, this, TypesPackage.TYPE_MODEL__ELEMENTS);
		}
		return elements;
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
			case TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL:
				if (baseTypeModel != null)
					msgs = ((InternalEObject)baseTypeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS, TypeModel.class, msgs);
				return basicSetBaseTypeModel((TypeModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticularTypeModels()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL:
				return basicSetBaseTypeModel(null, msgs);
			case TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS:
				return ((InternalEList<?>)getParticularTypeModels()).basicRemove(otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL:
				if (resolve) return getBaseTypeModel();
				return basicGetBaseTypeModel();
			case TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS:
				return getParticularTypeModels();
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				if (resolve) return getSubjectiveAspect();
				return basicGetSubjectiveAspect();
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				if (resolve) return getTemporalAspect();
				return basicGetTemporalAspect();
			case TypesPackage.TYPE_MODEL__ELEMENTS:
				return getElements();
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
			case TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL:
				setBaseTypeModel((TypeModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS:
				getParticularTypeModels().clear();
				getParticularTypeModels().addAll((Collection<? extends TypeModel>)newValue);
				return;
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				setSubjectiveAspect((conml.types.Class)newValue);
				return;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				setTemporalAspect((conml.types.Class)newValue);
				return;
			case TypesPackage.TYPE_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends TypeModelElement>)newValue);
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
			case TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL:
				setBaseTypeModel((TypeModel)null);
				return;
			case TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS:
				getParticularTypeModels().clear();
				return;
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				setSubjectiveAspect((conml.types.Class)null);
				return;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				setTemporalAspect((conml.types.Class)null);
				return;
			case TypesPackage.TYPE_MODEL__ELEMENTS:
				getElements().clear();
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
			case TypesPackage.TYPE_MODEL__BASE_TYPE_MODEL:
				return baseTypeModel != null;
			case TypesPackage.TYPE_MODEL__PARTICULAR_TYPE_MODELS:
				return particularTypeModels != null && !particularTypeModels.isEmpty();
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				return subjectiveAspect != null;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				return temporalAspect != null;
			case TypesPackage.TYPE_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeModelImpl
