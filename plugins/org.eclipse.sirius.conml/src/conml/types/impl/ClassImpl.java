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
 *   <li>{@link conml.types.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#isUsedAsTemporalAspect <em>Used As Temporal Aspect</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#isUsedAsSubjectiveAspect <em>Used As Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getDominantGeneralization <em>Dominant Generalization</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getSemiassociations <em>Semiassociations</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getInstancedByObjects <em>Instanced By Objects</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link conml.types.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements conml.types.Class {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
	 * The default value of the '{@link #isUsedAsTemporalAspect() <em>Used As Temporal Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsedAsTemporalAspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USED_AS_TEMPORAL_ASPECT_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isUsedAsTemporalAspect() <em>Used As Temporal Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsedAsTemporalAspect()
	 * @generated
	 * @ordered
	 */
	protected boolean usedAsTemporalAspect = USED_AS_TEMPORAL_ASPECT_EDEFAULT;

  /**
	 * The default value of the '{@link #isUsedAsSubjectiveAspect() <em>Used As Subjective Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsedAsSubjectiveAspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USED_AS_SUBJECTIVE_ASPECT_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isUsedAsSubjectiveAspect() <em>Used As Subjective Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsedAsSubjectiveAspect()
	 * @generated
	 * @ordered
	 */
	protected boolean usedAsSubjectiveAspect = USED_AS_SUBJECTIVE_ASPECT_EDEFAULT;

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
	 * The cached value of the '{@link #getSemiassociations() <em>Semiassociations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiassociations()
	 * @generated
	 * @ordered
	 */
	protected EList<SemiAssociation> semiassociations;

  /**
	 * The cached value of the '{@link #getInstancedByObjects() <em>Instanced By Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedByObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> instancedByObjects;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

    /**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	public boolean isAbstract() {
		return abstract_;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__ABSTRACT, oldAbstract, abstract_));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsedAsTemporalAspect() {
		return usedAsTemporalAspect;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedAsTemporalAspect(boolean newUsedAsTemporalAspect) {
		boolean oldUsedAsTemporalAspect = usedAsTemporalAspect;
		usedAsTemporalAspect = newUsedAsTemporalAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__USED_AS_TEMPORAL_ASPECT, oldUsedAsTemporalAspect, usedAsTemporalAspect));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsedAsSubjectiveAspect() {
		return usedAsSubjectiveAspect;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedAsSubjectiveAspect(boolean newUsedAsSubjectiveAspect) {
		boolean oldUsedAsSubjectiveAspect = usedAsSubjectiveAspect;
		usedAsSubjectiveAspect = newUsedAsSubjectiveAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASS__USED_AS_SUBJECTIVE_ASPECT, oldUsedAsSubjectiveAspect, usedAsSubjectiveAspect));
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
	public EList<SemiAssociation> getSemiassociations() {
		if (semiassociations == null) {
			semiassociations = new EObjectContainmentWithInverseEList<SemiAssociation>(SemiAssociation.class, this, TypesPackage.CLASS__SEMIASSOCIATIONS, TypesPackage.SEMI_ASSOCIATION__OWNER);
		}
		return semiassociations;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getInstancedByObjects() {
		if (instancedByObjects == null) {
			instancedByObjects = new EObjectWithInverseResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, TypesPackage.CLASS__INSTANCED_BY_OBJECTS, InstancesPackage.OBJECT__INSTANCED_CLASS);
		}
		return instancedByObjects;
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
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, TypesPackage.CLASS__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TypesPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
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
			case TypesPackage.CLASS__SEMIASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemiassociations()).basicAdd(otherEnd, msgs);
			case TypesPackage.CLASS__INSTANCED_BY_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstancedByObjects()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.CLASS__SEMIASSOCIATIONS:
				return ((InternalEList<?>)getSemiassociations()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__INSTANCED_BY_OBJECTS:
				return ((InternalEList<?>)getInstancedByObjects()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case TypesPackage.CLASS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case TypesPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.CLASS__ABSTRACT:
				return isAbstract();
			case TypesPackage.CLASS__USED_AS_TEMPORAL_ASPECT:
				return isUsedAsTemporalAspect();
			case TypesPackage.CLASS__USED_AS_SUBJECTIVE_ASPECT:
				return isUsedAsSubjectiveAspect();
			case TypesPackage.CLASS__GENERALIZATION:
				return getGeneralization();
			case TypesPackage.CLASS__SPECIALIZATION:
				if (resolve) return getSpecialization();
				return basicGetSpecialization();
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				if (resolve) return getDominantGeneralization();
				return basicGetDominantGeneralization();
			case TypesPackage.CLASS__SEMIASSOCIATIONS:
				return getSemiassociations();
			case TypesPackage.CLASS__INSTANCED_BY_OBJECTS:
				return getInstancedByObjects();
			case TypesPackage.CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case TypesPackage.CLASS__PROPERTIES:
				return getProperties();
			case TypesPackage.CLASS__ATTRIBUTES:
				return getAttributes();
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
			case TypesPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case TypesPackage.CLASS__USED_AS_TEMPORAL_ASPECT:
				setUsedAsTemporalAspect((Boolean)newValue);
				return;
			case TypesPackage.CLASS__USED_AS_SUBJECTIVE_ASPECT:
				setUsedAsSubjectiveAspect((Boolean)newValue);
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
			case TypesPackage.CLASS__SEMIASSOCIATIONS:
				getSemiassociations().clear();
				getSemiassociations().addAll((Collection<? extends SemiAssociation>)newValue);
				return;
			case TypesPackage.CLASS__INSTANCED_BY_OBJECTS:
				getInstancedByObjects().clear();
				getInstancedByObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case TypesPackage.CLASS__PACKAGE:
				setPackage((conml.types.Package)newValue);
				return;
			case TypesPackage.CLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case TypesPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case TypesPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case TypesPackage.CLASS__USED_AS_TEMPORAL_ASPECT:
				setUsedAsTemporalAspect(USED_AS_TEMPORAL_ASPECT_EDEFAULT);
				return;
			case TypesPackage.CLASS__USED_AS_SUBJECTIVE_ASPECT:
				setUsedAsSubjectiveAspect(USED_AS_SUBJECTIVE_ASPECT_EDEFAULT);
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
			case TypesPackage.CLASS__SEMIASSOCIATIONS:
				getSemiassociations().clear();
				return;
			case TypesPackage.CLASS__INSTANCED_BY_OBJECTS:
				getInstancedByObjects().clear();
				return;
			case TypesPackage.CLASS__PACKAGE:
				setPackage((conml.types.Package)null);
				return;
			case TypesPackage.CLASS__PROPERTIES:
				getProperties().clear();
				return;
			case TypesPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
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
			case TypesPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case TypesPackage.CLASS__USED_AS_TEMPORAL_ASPECT:
				return usedAsTemporalAspect != USED_AS_TEMPORAL_ASPECT_EDEFAULT;
			case TypesPackage.CLASS__USED_AS_SUBJECTIVE_ASPECT:
				return usedAsSubjectiveAspect != USED_AS_SUBJECTIVE_ASPECT_EDEFAULT;
			case TypesPackage.CLASS__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case TypesPackage.CLASS__SPECIALIZATION:
				return specialization != null;
			case TypesPackage.CLASS__DOMINANT_GENERALIZATION:
				return dominantGeneralization != null;
			case TypesPackage.CLASS__SEMIASSOCIATIONS:
				return semiassociations != null && !semiassociations.isEmpty();
			case TypesPackage.CLASS__INSTANCED_BY_OBJECTS:
				return instancedByObjects != null && !instancedByObjects.isEmpty();
			case TypesPackage.CLASS__PACKAGE:
				return package_ != null;
			case TypesPackage.CLASS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case TypesPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", usedAsTemporalAspect: ");
		result.append(usedAsTemporalAspect);
		result.append(", usedAsSubjectiveAspect: ");
		result.append(usedAsSubjectiveAspect);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
