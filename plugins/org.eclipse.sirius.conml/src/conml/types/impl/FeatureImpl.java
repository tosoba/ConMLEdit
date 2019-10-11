/**
 */
package conml.types.impl;

import conml.types.Feature;
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
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.FeatureImpl#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#getMinimumCardinality <em>Minimum Cardinality</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isSorted <em>Sorted</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isTemporal <em>Temporal</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isSubjective <em>Subjective</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#getRedefinedByFeatures <em>Redefined By Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl extends TypeImpl implements Feature {
	/**
	 * The default value of the '{@link #getMaximumCardinality() <em>Maximum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumCardinality() <em>Maximum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCardinality()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumCardinality = MAXIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCardinality() <em>Minimum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumCardinality() <em>Minimum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCardinality()
	 * @generated
	 * @ordered
	 */
	protected int minimumCardinality = MINIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSorted() <em>Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSorted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORTED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isSorted() <em>Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSorted()
	 * @generated
	 * @ordered
	 */
	protected boolean sorted = SORTED_EDEFAULT;

  /**
	 * The default value of the '{@link #isTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPORAL_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporal()
	 * @generated
	 * @ordered
	 */
	protected boolean temporal = TEMPORAL_EDEFAULT;

  /**
	 * The default value of the '{@link #isSubjective() <em>Subjective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubjective()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBJECTIVE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isSubjective() <em>Subjective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubjective()
	 * @generated
	 * @ordered
	 */
	protected boolean subjective = SUBJECTIVE_EDEFAULT;

  /**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRedefinedFeature() <em>Redefined Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature redefinedFeature;

    /**
	 * The cached value of the '{@link #getRedefinedByFeatures() <em>Redefined By Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedByFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> redefinedByFeatures;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumCardinality() {
		return maximumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumCardinality(Integer newMaximumCardinality) {
		Integer oldMaximumCardinality = maximumCardinality;
		maximumCardinality = newMaximumCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__MAXIMUM_CARDINALITY, oldMaximumCardinality, maximumCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimumCardinality() {
		return minimumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumCardinality(int newMinimumCardinality) {
		int oldMinimumCardinality = minimumCardinality;
		minimumCardinality = newMinimumCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__MINIMUM_CARDINALITY, oldMinimumCardinality, minimumCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSorted() {
		return sorted;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorted(boolean newSorted) {
		boolean oldSorted = sorted;
		sorted = newSorted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__SORTED, oldSorted, sorted));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTemporal() {
		return temporal;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(boolean newTemporal) {
		boolean oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__TEMPORAL, oldTemporal, temporal));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSubjective() {
		return subjective;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjective(boolean newSubjective) {
		boolean oldSubjective = subjective;
		subjective = newSubjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__SUBJECTIVE, oldSubjective, subjective));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstant() {
		return constant;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__CONSTANT, oldConstant, constant));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getRedefinedFeature() {
		if (redefinedFeature != null && redefinedFeature.eIsProxy()) {
			InternalEObject oldRedefinedFeature = (InternalEObject)redefinedFeature;
			redefinedFeature = (Feature)eResolveProxy(oldRedefinedFeature);
			if (redefinedFeature != oldRedefinedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.FEATURE__REDEFINED_FEATURE, oldRedefinedFeature, redefinedFeature));
			}
		}
		return redefinedFeature;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRedefinedFeature() {
		return redefinedFeature;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinedFeature(Feature newRedefinedFeature, NotificationChain msgs) {
		Feature oldRedefinedFeature = redefinedFeature;
		redefinedFeature = newRedefinedFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__REDEFINED_FEATURE, oldRedefinedFeature, newRedefinedFeature);
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
	public void setRedefinedFeature(Feature newRedefinedFeature) {
		if (newRedefinedFeature != redefinedFeature) {
			NotificationChain msgs = null;
			if (redefinedFeature != null)
				msgs = ((InternalEObject)redefinedFeature).eInverseRemove(this, TypesPackage.FEATURE__REDEFINED_BY_FEATURES, Feature.class, msgs);
			if (newRedefinedFeature != null)
				msgs = ((InternalEObject)newRedefinedFeature).eInverseAdd(this, TypesPackage.FEATURE__REDEFINED_BY_FEATURES, Feature.class, msgs);
			msgs = basicSetRedefinedFeature(newRedefinedFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__REDEFINED_FEATURE, newRedefinedFeature, newRedefinedFeature));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getRedefinedByFeatures() {
		if (redefinedByFeatures == null) {
			redefinedByFeatures = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, TypesPackage.FEATURE__REDEFINED_BY_FEATURES, TypesPackage.FEATURE__REDEFINED_FEATURE);
		}
		return redefinedByFeatures;
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
			case TypesPackage.FEATURE__REDEFINED_FEATURE:
				if (redefinedFeature != null)
					msgs = ((InternalEObject)redefinedFeature).eInverseRemove(this, TypesPackage.FEATURE__REDEFINED_BY_FEATURES, Feature.class, msgs);
				return basicSetRedefinedFeature((Feature)otherEnd, msgs);
			case TypesPackage.FEATURE__REDEFINED_BY_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedefinedByFeatures()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.FEATURE__REDEFINED_FEATURE:
				return basicSetRedefinedFeature(null, msgs);
			case TypesPackage.FEATURE__REDEFINED_BY_FEATURES:
				return ((InternalEList<?>)getRedefinedByFeatures()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.FEATURE__MAXIMUM_CARDINALITY:
				return getMaximumCardinality();
			case TypesPackage.FEATURE__MINIMUM_CARDINALITY:
				return getMinimumCardinality();
			case TypesPackage.FEATURE__SORTED:
				return isSorted();
			case TypesPackage.FEATURE__TEMPORAL:
				return isTemporal();
			case TypesPackage.FEATURE__SUBJECTIVE:
				return isSubjective();
			case TypesPackage.FEATURE__CONSTANT:
				return isConstant();
			case TypesPackage.FEATURE__REDEFINED_FEATURE:
				if (resolve) return getRedefinedFeature();
				return basicGetRedefinedFeature();
			case TypesPackage.FEATURE__REDEFINED_BY_FEATURES:
				return getRedefinedByFeatures();
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
			case TypesPackage.FEATURE__MAXIMUM_CARDINALITY:
				setMaximumCardinality((Integer)newValue);
				return;
			case TypesPackage.FEATURE__MINIMUM_CARDINALITY:
				setMinimumCardinality((Integer)newValue);
				return;
			case TypesPackage.FEATURE__SORTED:
				setSorted((Boolean)newValue);
				return;
			case TypesPackage.FEATURE__TEMPORAL:
				setTemporal((Boolean)newValue);
				return;
			case TypesPackage.FEATURE__SUBJECTIVE:
				setSubjective((Boolean)newValue);
				return;
			case TypesPackage.FEATURE__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case TypesPackage.FEATURE__REDEFINED_FEATURE:
				setRedefinedFeature((Feature)newValue);
				return;
			case TypesPackage.FEATURE__REDEFINED_BY_FEATURES:
				getRedefinedByFeatures().clear();
				getRedefinedByFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case TypesPackage.FEATURE__MAXIMUM_CARDINALITY:
				setMaximumCardinality(MAXIMUM_CARDINALITY_EDEFAULT);
				return;
			case TypesPackage.FEATURE__MINIMUM_CARDINALITY:
				setMinimumCardinality(MINIMUM_CARDINALITY_EDEFAULT);
				return;
			case TypesPackage.FEATURE__SORTED:
				setSorted(SORTED_EDEFAULT);
				return;
			case TypesPackage.FEATURE__TEMPORAL:
				setTemporal(TEMPORAL_EDEFAULT);
				return;
			case TypesPackage.FEATURE__SUBJECTIVE:
				setSubjective(SUBJECTIVE_EDEFAULT);
				return;
			case TypesPackage.FEATURE__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case TypesPackage.FEATURE__REDEFINED_FEATURE:
				setRedefinedFeature((Feature)null);
				return;
			case TypesPackage.FEATURE__REDEFINED_BY_FEATURES:
				getRedefinedByFeatures().clear();
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
			case TypesPackage.FEATURE__MAXIMUM_CARDINALITY:
				return MAXIMUM_CARDINALITY_EDEFAULT == null ? maximumCardinality != null : !MAXIMUM_CARDINALITY_EDEFAULT.equals(maximumCardinality);
			case TypesPackage.FEATURE__MINIMUM_CARDINALITY:
				return minimumCardinality != MINIMUM_CARDINALITY_EDEFAULT;
			case TypesPackage.FEATURE__SORTED:
				return sorted != SORTED_EDEFAULT;
			case TypesPackage.FEATURE__TEMPORAL:
				return temporal != TEMPORAL_EDEFAULT;
			case TypesPackage.FEATURE__SUBJECTIVE:
				return subjective != SUBJECTIVE_EDEFAULT;
			case TypesPackage.FEATURE__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case TypesPackage.FEATURE__REDEFINED_FEATURE:
				return redefinedFeature != null;
			case TypesPackage.FEATURE__REDEFINED_BY_FEATURES:
				return redefinedByFeatures != null && !redefinedByFeatures.isEmpty();
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
		result.append(" (maximumCardinality: ");
		result.append(maximumCardinality);
		result.append(", minimumCardinality: ");
		result.append(minimumCardinality);
		result.append(", sorted: ");
		result.append(sorted);
		result.append(", temporal: ");
		result.append(temporal);
		result.append(", subjective: ");
		result.append(subjective);
		result.append(", constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
