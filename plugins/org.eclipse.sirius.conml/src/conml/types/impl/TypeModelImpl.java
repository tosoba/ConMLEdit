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
 *   <li>{@link conml.types.impl.TypeModelImpl#getConformedBy <em>Conformed By</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getIsBaseOf <em>Is Base Of</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getIsParticularIn <em>Is Particular In</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getHasParticular <em>Has Particular</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getSubjectiveAspect <em>Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.impl.TypeModelImpl#getTemporalAspect <em>Temporal Aspect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeModelImpl extends ModelImpl implements TypeModel {
	/**
	 * The cached value of the '{@link #getConformedBy() <em>Conformed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformedBy()
	 * @generated
	 * @ordered
	 */
	protected InstanceModel conformedBy;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected TypeModel extends_;

	/**
	 * The cached value of the '{@link #getIsBaseOf() <em>Is Base Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBaseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> isBaseOf;

	/**
	 * The cached value of the '{@link #getIsParticularIn() <em>Is Particular In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsParticularIn()
	 * @generated
	 * @ordered
	 */
	protected TypeModel isParticularIn;

	/**
	 * The cached value of the '{@link #getHasParticular() <em>Has Particular</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParticular()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModel> hasParticular;

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
	public InstanceModel getConformedBy() {
		if (conformedBy != null && conformedBy.eIsProxy()) {
			InternalEObject oldConformedBy = (InternalEObject)conformedBy;
			conformedBy = (InstanceModel)eResolveProxy(oldConformedBy);
			if (conformedBy != oldConformedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__CONFORMED_BY, oldConformedBy, conformedBy));
			}
		}
		return conformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModel basicGetConformedBy() {
		return conformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformedBy(InstanceModel newConformedBy, NotificationChain msgs) {
		InstanceModel oldConformedBy = conformedBy;
		conformedBy = newConformedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__CONFORMED_BY, oldConformedBy, newConformedBy);
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
	public void setConformedBy(InstanceModel newConformedBy) {
		if (newConformedBy != conformedBy) {
			NotificationChain msgs = null;
			if (conformedBy != null)
				msgs = ((InternalEObject)conformedBy).eInverseRemove(this, InstancesPackage.INSTANCE_MODEL__CONFORMS_TO, InstanceModel.class, msgs);
			if (newConformedBy != null)
				msgs = ((InternalEObject)newConformedBy).eInverseAdd(this, InstancesPackage.INSTANCE_MODEL__CONFORMS_TO, InstanceModel.class, msgs);
			msgs = basicSetConformedBy(newConformedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__CONFORMED_BY, newConformedBy, newConformedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModel getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (TypeModel)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(TypeModel newExtends, NotificationChain msgs) {
		TypeModel oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__EXTENDS, oldExtends, newExtends);
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
	public void setExtends(TypeModel newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, TypesPackage.TYPE_MODEL__IS_BASE_OF, TypeModel.class, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, TypesPackage.TYPE_MODEL__IS_BASE_OF, TypeModel.class, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeModel> getIsBaseOf() {
		if (isBaseOf == null) {
			isBaseOf = new EObjectWithInverseResolvingEList<TypeModel>(TypeModel.class, this, TypesPackage.TYPE_MODEL__IS_BASE_OF, TypesPackage.TYPE_MODEL__EXTENDS);
		}
		return isBaseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModel getIsParticularIn() {
		if (isParticularIn != null && isParticularIn.eIsProxy()) {
			InternalEObject oldIsParticularIn = (InternalEObject)isParticularIn;
			isParticularIn = (TypeModel)eResolveProxy(oldIsParticularIn);
			if (isParticularIn != oldIsParticularIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN, oldIsParticularIn, isParticularIn));
			}
		}
		return isParticularIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetIsParticularIn() {
		return isParticularIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsParticularIn(TypeModel newIsParticularIn, NotificationChain msgs) {
		TypeModel oldIsParticularIn = isParticularIn;
		isParticularIn = newIsParticularIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN, oldIsParticularIn, newIsParticularIn);
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
	public void setIsParticularIn(TypeModel newIsParticularIn) {
		if (newIsParticularIn != isParticularIn) {
			NotificationChain msgs = null;
			if (isParticularIn != null)
				msgs = ((InternalEObject)isParticularIn).eInverseRemove(this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR, TypeModel.class, msgs);
			if (newIsParticularIn != null)
				msgs = ((InternalEObject)newIsParticularIn).eInverseAdd(this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR, TypeModel.class, msgs);
			msgs = basicSetIsParticularIn(newIsParticularIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN, newIsParticularIn, newIsParticularIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeModel> getHasParticular() {
		if (hasParticular == null) {
			hasParticular = new EObjectWithInverseResolvingEList<TypeModel>(TypeModel.class, this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR, TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN);
		}
		return hasParticular;
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
			case TypesPackage.TYPE_MODEL__CONFORMED_BY:
				if (conformedBy != null)
					msgs = ((InternalEObject)conformedBy).eInverseRemove(this, InstancesPackage.INSTANCE_MODEL__CONFORMS_TO, InstanceModel.class, msgs);
				return basicSetConformedBy((InstanceModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__EXTENDS:
				if (extends_ != null)
					msgs = ((InternalEObject)extends_).eInverseRemove(this, TypesPackage.TYPE_MODEL__IS_BASE_OF, TypeModel.class, msgs);
				return basicSetExtends((TypeModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__IS_BASE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsBaseOf()).basicAdd(otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN:
				if (isParticularIn != null)
					msgs = ((InternalEObject)isParticularIn).eInverseRemove(this, TypesPackage.TYPE_MODEL__HAS_PARTICULAR, TypeModel.class, msgs);
				return basicSetIsParticularIn((TypeModel)otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasParticular()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL__CONFORMED_BY:
				return basicSetConformedBy(null, msgs);
			case TypesPackage.TYPE_MODEL__EXTENDS:
				return basicSetExtends(null, msgs);
			case TypesPackage.TYPE_MODEL__IS_BASE_OF:
				return ((InternalEList<?>)getIsBaseOf()).basicRemove(otherEnd, msgs);
			case TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN:
				return basicSetIsParticularIn(null, msgs);
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR:
				return ((InternalEList<?>)getHasParticular()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.TYPE_MODEL__CONFORMED_BY:
				if (resolve) return getConformedBy();
				return basicGetConformedBy();
			case TypesPackage.TYPE_MODEL__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case TypesPackage.TYPE_MODEL__IS_BASE_OF:
				return getIsBaseOf();
			case TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN:
				if (resolve) return getIsParticularIn();
				return basicGetIsParticularIn();
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR:
				return getHasParticular();
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
			case TypesPackage.TYPE_MODEL__CONFORMED_BY:
				setConformedBy((InstanceModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__EXTENDS:
				setExtends((TypeModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__IS_BASE_OF:
				getIsBaseOf().clear();
				getIsBaseOf().addAll((Collection<? extends TypeModel>)newValue);
				return;
			case TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN:
				setIsParticularIn((TypeModel)newValue);
				return;
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR:
				getHasParticular().clear();
				getHasParticular().addAll((Collection<? extends TypeModel>)newValue);
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
			case TypesPackage.TYPE_MODEL__CONFORMED_BY:
				setConformedBy((InstanceModel)null);
				return;
			case TypesPackage.TYPE_MODEL__EXTENDS:
				setExtends((TypeModel)null);
				return;
			case TypesPackage.TYPE_MODEL__IS_BASE_OF:
				getIsBaseOf().clear();
				return;
			case TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN:
				setIsParticularIn((TypeModel)null);
				return;
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR:
				getHasParticular().clear();
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
			case TypesPackage.TYPE_MODEL__CONFORMED_BY:
				return conformedBy != null;
			case TypesPackage.TYPE_MODEL__EXTENDS:
				return extends_ != null;
			case TypesPackage.TYPE_MODEL__IS_BASE_OF:
				return isBaseOf != null && !isBaseOf.isEmpty();
			case TypesPackage.TYPE_MODEL__IS_PARTICULAR_IN:
				return isParticularIn != null;
			case TypesPackage.TYPE_MODEL__HAS_PARTICULAR:
				return hasParticular != null && !hasParticular.isEmpty();
			case TypesPackage.TYPE_MODEL__SUBJECTIVE_ASPECT:
				return subjectiveAspect != null;
			case TypesPackage.TYPE_MODEL__TEMPORAL_ASPECT:
				return temporalAspect != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeModelImpl
