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
 *   <li>{@link conml.types.impl.FeatureImpl#isIsSorted <em>Is Sorted</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isTemporal <em>Temporal</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isSubjective <em>Subjective</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#getRedefines <em>Redefines</em>}</li>
 *   <li>{@link conml.types.impl.FeatureImpl#getIsRedefinedBy <em>Is Redefined By</em>}</li>
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
	 * The default value of the '{@link #isIsSorted() <em>Is Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSorted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSorted() <em>Is Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSorted()
	 * @generated
	 * @ordered
	 */
	protected boolean isSorted = IS_SORTED_EDEFAULT;

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
	 * The cached value of the '{@link #getRedefines() <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefines()
	 * @generated
	 * @ordered
	 */
	protected Feature redefines;

	/**
	 * The cached value of the '{@link #getIsRedefinedBy() <em>Is Redefined By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRedefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> isRedefinedBy;

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
	public boolean isIsSorted() {
		return isSorted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSorted(boolean newIsSorted) {
		boolean oldIsSorted = isSorted;
		isSorted = newIsSorted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__IS_SORTED, oldIsSorted, isSorted));
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
	public Feature getRedefines() {
		if (redefines != null && redefines.eIsProxy()) {
			InternalEObject oldRedefines = (InternalEObject)redefines;
			redefines = (Feature)eResolveProxy(oldRedefines);
			if (redefines != oldRedefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.FEATURE__REDEFINES, oldRedefines, redefines));
			}
		}
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRedefines() {
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefines(Feature newRedefines, NotificationChain msgs) {
		Feature oldRedefines = redefines;
		redefines = newRedefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__REDEFINES, oldRedefines, newRedefines);
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
	public void setRedefines(Feature newRedefines) {
		if (newRedefines != redefines) {
			NotificationChain msgs = null;
			if (redefines != null)
				msgs = ((InternalEObject)redefines).eInverseRemove(this, TypesPackage.FEATURE__IS_REDEFINED_BY, Feature.class, msgs);
			if (newRedefines != null)
				msgs = ((InternalEObject)newRedefines).eInverseAdd(this, TypesPackage.FEATURE__IS_REDEFINED_BY, Feature.class, msgs);
			msgs = basicSetRedefines(newRedefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FEATURE__REDEFINES, newRedefines, newRedefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getIsRedefinedBy() {
		if (isRedefinedBy == null) {
			isRedefinedBy = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, TypesPackage.FEATURE__IS_REDEFINED_BY, TypesPackage.FEATURE__REDEFINES);
		}
		return isRedefinedBy;
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
			case TypesPackage.FEATURE__REDEFINES:
				if (redefines != null)
					msgs = ((InternalEObject)redefines).eInverseRemove(this, TypesPackage.FEATURE__IS_REDEFINED_BY, Feature.class, msgs);
				return basicSetRedefines((Feature)otherEnd, msgs);
			case TypesPackage.FEATURE__IS_REDEFINED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRedefinedBy()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.FEATURE__REDEFINES:
				return basicSetRedefines(null, msgs);
			case TypesPackage.FEATURE__IS_REDEFINED_BY:
				return ((InternalEList<?>)getIsRedefinedBy()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.FEATURE__IS_SORTED:
				return isIsSorted();
			case TypesPackage.FEATURE__TEMPORAL:
				return isTemporal();
			case TypesPackage.FEATURE__SUBJECTIVE:
				return isSubjective();
			case TypesPackage.FEATURE__CONSTANT:
				return isConstant();
			case TypesPackage.FEATURE__REDEFINES:
				if (resolve) return getRedefines();
				return basicGetRedefines();
			case TypesPackage.FEATURE__IS_REDEFINED_BY:
				return getIsRedefinedBy();
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
			case TypesPackage.FEATURE__IS_SORTED:
				setIsSorted((Boolean)newValue);
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
			case TypesPackage.FEATURE__REDEFINES:
				setRedefines((Feature)newValue);
				return;
			case TypesPackage.FEATURE__IS_REDEFINED_BY:
				getIsRedefinedBy().clear();
				getIsRedefinedBy().addAll((Collection<? extends Feature>)newValue);
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
			case TypesPackage.FEATURE__IS_SORTED:
				setIsSorted(IS_SORTED_EDEFAULT);
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
			case TypesPackage.FEATURE__REDEFINES:
				setRedefines((Feature)null);
				return;
			case TypesPackage.FEATURE__IS_REDEFINED_BY:
				getIsRedefinedBy().clear();
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
			case TypesPackage.FEATURE__IS_SORTED:
				return isSorted != IS_SORTED_EDEFAULT;
			case TypesPackage.FEATURE__TEMPORAL:
				return temporal != TEMPORAL_EDEFAULT;
			case TypesPackage.FEATURE__SUBJECTIVE:
				return subjective != SUBJECTIVE_EDEFAULT;
			case TypesPackage.FEATURE__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case TypesPackage.FEATURE__REDEFINES:
				return redefines != null;
			case TypesPackage.FEATURE__IS_REDEFINED_BY:
				return isRedefinedBy != null && !isRedefinedBy.isEmpty();
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
		result.append(", isSorted: ");
		result.append(isSorted);
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
