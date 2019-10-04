/**
 */
package conml.types.impl;

import conml.instances.InstancesPackage;

import conml.types.Attribute;
import conml.types.Generalization;
import conml.types.Property;
import conml.types.SemiAssociation;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#isIsTemporalAspect <em>Is Temporal Aspect</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#isIsSubjectiveAspect <em>Is Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getDominantGeneralization <em>Dominant Generalization</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getOwnsSemiassociations <em>Owns Semiassociations</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getIsOppositeClassIn <em>Is Opposite Class In</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getInstancedBy <em>Instanced By</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getOwnsProperties <em>Owns Properties</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getOwnsAttributes <em>Owns Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements conml.types.Class {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTemporalAspect() <em>Is Temporal Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTemporalAspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TEMPORAL_ASPECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTemporalAspect() <em>Is Temporal Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTemporalAspect()
	 * @generated
	 * @ordered
	 */
	protected boolean isTemporalAspect = IS_TEMPORAL_ASPECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSubjectiveAspect() <em>Is Subjective Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubjectiveAspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBJECTIVE_ASPECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubjectiveAspect() <em>Is Subjective Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubjectiveAspect()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubjectiveAspect = IS_SUBJECTIVE_ASPECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Generalization specialization;

	/**
	 * The cached value of the '{@link #getDominantGeneralization() <em>Dominant Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominantGeneralization()
	 * @generated
	 * @ordered
	 */
	protected Generalization dominantGeneralization;

	/**
	 * The cached value of the '{@link #getOwnsSemiassociations() <em>Owns Semiassociations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsSemiassociations()
	 * @generated
	 * @ordered
	 */
	protected EList<SemiAssociation> ownsSemiassociations;

	/**
	 * The cached value of the '{@link #getIsOppositeClassIn() <em>Is Opposite Class In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOppositeClassIn()
	 * @generated
	 * @ordered
	 */
	protected EList<SemiAssociation> isOppositeClassIn;

	/**
	 * The cached value of the '{@link #getInstancedBy() <em>Instanced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> instancedBy;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Package package_;

  /**
	 * The cached value of the '{@link #getOwnsProperties() <em>Owns Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownsProperties;

	/**
	 * The cached value of the '{@link #getOwnsAttributes() <em>Owns Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> ownsAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTemporalAspect() {
		return isTemporalAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTemporalAspect(boolean newIsTemporalAspect) {
		boolean oldIsTemporalAspect = isTemporalAspect;
		isTemporalAspect = newIsTemporalAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__IS_TEMPORAL_ASPECT, oldIsTemporalAspect, isTemporalAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSubjectiveAspect() {
		return isSubjectiveAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSubjectiveAspect(boolean newIsSubjectiveAspect) {
		boolean oldIsSubjectiveAspect = isSubjectiveAspect;
		isSubjectiveAspect = newIsSubjectiveAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__IS_SUBJECTIVE_ASPECT, oldIsSubjectiveAspect, isSubjectiveAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectWithInverseResolvingEList.ManyInverse<Generalization>(Generalization.class, this, TypesPackage.CLASS__GENERALIZATION, TypesPackage.GENERALIZATION__SPECIALIZED_CLASS);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generalization getSpecialization() {
		if (specialization != null && specialization.eIsProxy()) {
			InternalEObject oldSpecialization = (InternalEObject)specialization;
			specialization = (Generalization)eResolveProxy(oldSpecialization);
			if (specialization != oldSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.CLASS__SPECIALIZATION, oldSpecialization, specialization));
			}
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialization(Generalization newSpecialization, NotificationChain msgs) {
		Generalization oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__SPECIALIZATION, oldSpecialization, newSpecialization);
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
	public void setSpecialization(Generalization newSpecialization) {
		if (newSpecialization != specialization) {
			NotificationChain msgs = null;
			if (specialization != null)
				msgs = ((InternalEObject)specialization).eInverseRemove(this, TypesPackage.GENERALIZATION__GENERALIZED_CLASS, Generalization.class, msgs);
			if (newSpecialization != null)
				msgs = ((InternalEObject)newSpecialization).eInverseAdd(this, TypesPackage.GENERALIZATION__GENERALIZED_CLASS, Generalization.class, msgs);
			msgs = basicSetSpecialization(newSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__SPECIALIZATION, newSpecialization, newSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generalization getDominantGeneralization() {
		if (dominantGeneralization != null && dominantGeneralization.eIsProxy()) {
			InternalEObject oldDominantGeneralization = (InternalEObject)dominantGeneralization;
			dominantGeneralization = (Generalization)eResolveProxy(oldDominantGeneralization);
			if (dominantGeneralization != oldDominantGeneralization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.CLASS__DOMINANT_GENERALIZATION, oldDominantGeneralization, dominantGeneralization));
			}
		}
		return dominantGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetDominantGeneralization() {
		return dominantGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDominantGeneralization(Generalization newDominantGeneralization, NotificationChain msgs) {
		Generalization oldDominantGeneralization = dominantGeneralization;
		dominantGeneralization = newDominantGeneralization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__DOMINANT_GENERALIZATION, oldDominantGeneralization, newDominantGeneralization);
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
	public void setDominantGeneralization(Generalization newDominantGeneralization) {
		if (newDominantGeneralization != dominantGeneralization) {
			NotificationChain msgs = null;
			if (dominantGeneralization != null)
				msgs = ((InternalEObject)dominantGeneralization).eInverseRemove(this, TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON, Generalization.class, msgs);
			if (newDominantGeneralization != null)
				msgs = ((InternalEObject)newDominantGeneralization).eInverseAdd(this, TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON, Generalization.class, msgs);
			msgs = basicSetDominantGeneralization(newDominantGeneralization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__DOMINANT_GENERALIZATION, newDominantGeneralization, newDominantGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getOwnsProperties() {
		if (ownsProperties == null) {
			ownsProperties = new EObjectContainmentEList<Property>(Property.class, this, TypesPackage.CLASS__OWNS_PROPERTIES);
		}
		return ownsProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getOwnsAttributes() {
		if (ownsAttributes == null) {
			ownsAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TypesPackage.CLASS__OWNS_ATTRIBUTES);
		}
		return ownsAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemiAssociation> getOwnsSemiassociations() {
		if (ownsSemiassociations == null) {
			ownsSemiassociations = new EObjectContainmentWithInverseEList<SemiAssociation>(SemiAssociation.class, this, TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS, TypesPackage.SEMI_ASSOCIATION__OWNER);
		}
		return ownsSemiassociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemiAssociation> getIsOppositeClassIn() {
		if (isOppositeClassIn == null) {
			isOppositeClassIn = new EObjectWithInverseResolvingEList<SemiAssociation>(SemiAssociation.class, this, TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN, TypesPackage.SEMI_ASSOCIATION__REFERS_TO);
		}
		return isOppositeClassIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getInstancedBy() {
		if (instancedBy == null) {
			instancedBy = new EObjectWithInverseResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, TypesPackage.CLASS__INSTANCED_BY, InstancesPackage.OBJECT__IS_INSTANCE_OF);
		}
		return instancedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (conml.types.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.CLASS__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Package basicGetPackage() {
		return package_;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(conml.types.Package newPackage, NotificationChain msgs) {
		conml.types.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__PACKAGE, oldPackage, newPackage);
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
	public void setPackage(conml.types.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, TypesPackage.PACKAGE__CONTAINED_CLASSES, conml.types.Package.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypesPackage.PACKAGE__CONTAINED_CLASSES, conml.types.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__PACKAGE, newPackage, newPackage));
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
			case TypesPackage.CLASS__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case TypesPackage.CLASS__SPECIALIZATION:
				if (specialization != null)
					msgs = ((InternalEObject)specialization).eInverseRemove(this, TypesPackage.GENERALIZATION__GENERALIZED_CLASS, Generalization.class, msgs);
				return basicSetSpecialization((Generalization)otherEnd, msgs);
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				if (dominantGeneralization != null)
					msgs = ((InternalEObject)dominantGeneralization).eInverseRemove(this, TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON, Generalization.class, msgs);
				return basicSetDominantGeneralization((Generalization)otherEnd, msgs);
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsSemiassociations()).basicAdd(otherEnd, msgs);
			case TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOppositeClassIn()).basicAdd(otherEnd, msgs);
			case TypesPackage.CLASS__INSTANCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstancedBy()).basicAdd(otherEnd, msgs);
			case TypesPackage.CLASS__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, TypesPackage.PACKAGE__CONTAINED_CLASSES, conml.types.Package.class, msgs);
				return basicSetPackage((conml.types.Package)otherEnd, msgs);
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
			case TypesPackage.CLASS__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__SPECIALIZATION:
				return basicSetSpecialization(null, msgs);
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				return basicSetDominantGeneralization(null, msgs);
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
				return ((InternalEList<?>)getOwnsSemiassociations()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN:
				return ((InternalEList<?>)getIsOppositeClassIn()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__INSTANCED_BY:
				return ((InternalEList<?>)getInstancedBy()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case TypesPackage.CLASS__OWNS_PROPERTIES:
				return ((InternalEList<?>)getOwnsProperties()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__OWNS_ATTRIBUTES:
				return ((InternalEList<?>)getOwnsAttributes()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case TypesPackage.CLASS__IS_TEMPORAL_ASPECT:
				return isIsTemporalAspect();
			case TypesPackage.CLASS__IS_SUBJECTIVE_ASPECT:
				return isIsSubjectiveAspect();
			case TypesPackage.CLASS__GENERALIZATION:
				return getGeneralization();
			case TypesPackage.CLASS__SPECIALIZATION:
				if (resolve) return getSpecialization();
				return basicGetSpecialization();
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				if (resolve) return getDominantGeneralization();
				return basicGetDominantGeneralization();
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
				return getOwnsSemiassociations();
			case TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN:
				return getIsOppositeClassIn();
			case TypesPackage.CLASS__INSTANCED_BY:
				return getInstancedBy();
			case TypesPackage.CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case TypesPackage.CLASS__OWNS_PROPERTIES:
				return getOwnsProperties();
			case TypesPackage.CLASS__OWNS_ATTRIBUTES:
				return getOwnsAttributes();
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
			case TypesPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case TypesPackage.CLASS__IS_TEMPORAL_ASPECT:
				setIsTemporalAspect((Boolean)newValue);
				return;
			case TypesPackage.CLASS__IS_SUBJECTIVE_ASPECT:
				setIsSubjectiveAspect((Boolean)newValue);
				return;
			case TypesPackage.CLASS__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case TypesPackage.CLASS__SPECIALIZATION:
				setSpecialization((Generalization)newValue);
				return;
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				setDominantGeneralization((Generalization)newValue);
				return;
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
				getOwnsSemiassociations().clear();
				getOwnsSemiassociations().addAll((Collection<? extends SemiAssociation>)newValue);
				return;
			case TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN:
				getIsOppositeClassIn().clear();
				getIsOppositeClassIn().addAll((Collection<? extends SemiAssociation>)newValue);
				return;
			case TypesPackage.CLASS__INSTANCED_BY:
				getInstancedBy().clear();
				getInstancedBy().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case TypesPackage.CLASS__PACKAGE:
				setPackage((conml.types.Package)newValue);
				return;
			case TypesPackage.CLASS__OWNS_PROPERTIES:
				getOwnsProperties().clear();
				getOwnsProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case TypesPackage.CLASS__OWNS_ATTRIBUTES:
				getOwnsAttributes().clear();
				getOwnsAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case TypesPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case TypesPackage.CLASS__IS_TEMPORAL_ASPECT:
				setIsTemporalAspect(IS_TEMPORAL_ASPECT_EDEFAULT);
				return;
			case TypesPackage.CLASS__IS_SUBJECTIVE_ASPECT:
				setIsSubjectiveAspect(IS_SUBJECTIVE_ASPECT_EDEFAULT);
				return;
			case TypesPackage.CLASS__GENERALIZATION:
				getGeneralization().clear();
				return;
			case TypesPackage.CLASS__SPECIALIZATION:
				setSpecialization((Generalization)null);
				return;
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				setDominantGeneralization((Generalization)null);
				return;
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
				getOwnsSemiassociations().clear();
				return;
			case TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN:
				getIsOppositeClassIn().clear();
				return;
			case TypesPackage.CLASS__INSTANCED_BY:
				getInstancedBy().clear();
				return;
			case TypesPackage.CLASS__PACKAGE:
				setPackage((conml.types.Package)null);
				return;
			case TypesPackage.CLASS__OWNS_PROPERTIES:
				getOwnsProperties().clear();
				return;
			case TypesPackage.CLASS__OWNS_ATTRIBUTES:
				getOwnsAttributes().clear();
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
			case TypesPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case TypesPackage.CLASS__IS_TEMPORAL_ASPECT:
				return isTemporalAspect != IS_TEMPORAL_ASPECT_EDEFAULT;
			case TypesPackage.CLASS__IS_SUBJECTIVE_ASPECT:
				return isSubjectiveAspect != IS_SUBJECTIVE_ASPECT_EDEFAULT;
			case TypesPackage.CLASS__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case TypesPackage.CLASS__SPECIALIZATION:
				return specialization != null;
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				return dominantGeneralization != null;
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
				return ownsSemiassociations != null && !ownsSemiassociations.isEmpty();
			case TypesPackage.CLASS__IS_OPPOSITE_CLASS_IN:
				return isOppositeClassIn != null && !isOppositeClassIn.isEmpty();
			case TypesPackage.CLASS__INSTANCED_BY:
				return instancedBy != null && !instancedBy.isEmpty();
			case TypesPackage.CLASS__PACKAGE:
				return package_ != null;
			case TypesPackage.CLASS__OWNS_PROPERTIES:
				return ownsProperties != null && !ownsProperties.isEmpty();
			case TypesPackage.CLASS__OWNS_ATTRIBUTES:
				return ownsAttributes != null && !ownsAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isTemporalAspect: ");
		result.append(isTemporalAspect);
		result.append(", isSubjectiveAspect: ");
		result.append(isSubjectiveAspect);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
