/**
 */
package conml.instances.impl;

import conml.instances.FacetSet;
import conml.instances.InstancesPackage;
import conml.instances.QualifierObject;

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
 * An implementation of the model object '<em><b>Qualifier Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.QualifierObjectImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.QualifierObjectImpl#getSubjectiveQualifiedObjects <em>Subjective Qualified Objects</em>}</li>
 *   <li>{@link conml.instances.impl.QualifierObjectImpl#getTemporalQualifiedObjects <em>Temporal Qualified Objects</em>}</li>
 *   <li>{@link conml.instances.impl.QualifierObjectImpl#getPerspectiveQualifiedFacetSets <em>Perspective Qualified Facet Sets</em>}</li>
 *   <li>{@link conml.instances.impl.QualifierObjectImpl#getPhaseQualifiedFacetSets <em>Phase Qualified Facet Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifierObjectImpl extends ObjectImpl implements QualifierObject {
	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubjectiveQualifiedObjects() <em>Subjective Qualified Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveQualifiedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> subjectiveQualifiedObjects;

	/**
	 * The cached value of the '{@link #getTemporalQualifiedObjects() <em>Temporal Qualified Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalQualifiedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> temporalQualifiedObjects;

	/**
	 * The cached value of the '{@link #getPerspectiveQualifiedFacetSets() <em>Perspective Qualified Facet Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveQualifiedFacetSets()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetSet> perspectiveQualifiedFacetSets;

	/**
	 * The cached value of the '{@link #getPhaseQualifiedFacetSets() <em>Phase Qualified Facet Sets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseQualifiedFacetSets()
	 * @generated
	 * @ordered
	 */
	protected FacetSet phaseQualifiedFacetSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.QUALIFIER_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.QUALIFIER_OBJECT__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getSubjectiveQualifiedObjects() {
		if (subjectiveQualifiedObjects == null) {
			subjectiveQualifiedObjects = new EObjectWithInverseResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS, InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER);
		}
		return subjectiveQualifiedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getTemporalQualifiedObjects() {
		if (temporalQualifiedObjects == null) {
			temporalQualifiedObjects = new EObjectWithInverseResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS, InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER);
		}
		return temporalQualifiedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FacetSet> getPerspectiveQualifiedFacetSets() {
		if (perspectiveQualifiedFacetSets == null) {
			perspectiveQualifiedFacetSets = new EObjectWithInverseResolvingEList<FacetSet>(FacetSet.class, this, InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS, InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER);
		}
		return perspectiveQualifiedFacetSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacetSet getPhaseQualifiedFacetSets() {
		if (phaseQualifiedFacetSets != null && phaseQualifiedFacetSets.eIsProxy()) {
			InternalEObject oldPhaseQualifiedFacetSets = (InternalEObject)phaseQualifiedFacetSets;
			phaseQualifiedFacetSets = (FacetSet)eResolveProxy(oldPhaseQualifiedFacetSets);
			if (phaseQualifiedFacetSets != oldPhaseQualifiedFacetSets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS, oldPhaseQualifiedFacetSets, phaseQualifiedFacetSets));
			}
		}
		return phaseQualifiedFacetSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetSet basicGetPhaseQualifiedFacetSets() {
		return phaseQualifiedFacetSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseQualifiedFacetSets(FacetSet newPhaseQualifiedFacetSets, NotificationChain msgs) {
		FacetSet oldPhaseQualifiedFacetSets = phaseQualifiedFacetSets;
		phaseQualifiedFacetSets = newPhaseQualifiedFacetSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS, oldPhaseQualifiedFacetSets, newPhaseQualifiedFacetSets);
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
	public void setPhaseQualifiedFacetSets(FacetSet newPhaseQualifiedFacetSets) {
		if (newPhaseQualifiedFacetSets != phaseQualifiedFacetSets) {
			NotificationChain msgs = null;
			if (phaseQualifiedFacetSets != null)
				msgs = ((InternalEObject)phaseQualifiedFacetSets).eInverseRemove(this, InstancesPackage.FACET_SET__PHASE_QUALIFIER, FacetSet.class, msgs);
			if (newPhaseQualifiedFacetSets != null)
				msgs = ((InternalEObject)newPhaseQualifiedFacetSets).eInverseAdd(this, InstancesPackage.FACET_SET__PHASE_QUALIFIER, FacetSet.class, msgs);
			msgs = basicSetPhaseQualifiedFacetSets(newPhaseQualifiedFacetSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS, newPhaseQualifiedFacetSets, newPhaseQualifiedFacetSets));
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
			case InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubjectiveQualifiedObjects()).basicAdd(otherEnd, msgs);
			case InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemporalQualifiedObjects()).basicAdd(otherEnd, msgs);
			case InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerspectiveQualifiedFacetSets()).basicAdd(otherEnd, msgs);
			case InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS:
				if (phaseQualifiedFacetSets != null)
					msgs = ((InternalEObject)phaseQualifiedFacetSets).eInverseRemove(this, InstancesPackage.FACET_SET__PHASE_QUALIFIER, FacetSet.class, msgs);
				return basicSetPhaseQualifiedFacetSets((FacetSet)otherEnd, msgs);
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
			case InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS:
				return ((InternalEList<?>)getSubjectiveQualifiedObjects()).basicRemove(otherEnd, msgs);
			case InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS:
				return ((InternalEList<?>)getTemporalQualifiedObjects()).basicRemove(otherEnd, msgs);
			case InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS:
				return ((InternalEList<?>)getPerspectiveQualifiedFacetSets()).basicRemove(otherEnd, msgs);
			case InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS:
				return basicSetPhaseQualifiedFacetSets(null, msgs);
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
			case InstancesPackage.QUALIFIER_OBJECT__QUALIFIER:
				return getQualifier();
			case InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS:
				return getSubjectiveQualifiedObjects();
			case InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS:
				return getTemporalQualifiedObjects();
			case InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS:
				return getPerspectiveQualifiedFacetSets();
			case InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS:
				if (resolve) return getPhaseQualifiedFacetSets();
				return basicGetPhaseQualifiedFacetSets();
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
			case InstancesPackage.QUALIFIER_OBJECT__QUALIFIER:
				setQualifier((String)newValue);
				return;
			case InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS:
				getSubjectiveQualifiedObjects().clear();
				getSubjectiveQualifiedObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS:
				getTemporalQualifiedObjects().clear();
				getTemporalQualifiedObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS:
				getPerspectiveQualifiedFacetSets().clear();
				getPerspectiveQualifiedFacetSets().addAll((Collection<? extends FacetSet>)newValue);
				return;
			case InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS:
				setPhaseQualifiedFacetSets((FacetSet)newValue);
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
			case InstancesPackage.QUALIFIER_OBJECT__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS:
				getSubjectiveQualifiedObjects().clear();
				return;
			case InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS:
				getTemporalQualifiedObjects().clear();
				return;
			case InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS:
				getPerspectiveQualifiedFacetSets().clear();
				return;
			case InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS:
				setPhaseQualifiedFacetSets((FacetSet)null);
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
			case InstancesPackage.QUALIFIER_OBJECT__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
			case InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS:
				return subjectiveQualifiedObjects != null && !subjectiveQualifiedObjects.isEmpty();
			case InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS:
				return temporalQualifiedObjects != null && !temporalQualifiedObjects.isEmpty();
			case InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS:
				return perspectiveQualifiedFacetSets != null && !perspectiveQualifiedFacetSets.isEmpty();
			case InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS:
				return phaseQualifiedFacetSets != null;
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
		result.append(" (qualifier: ");
		result.append(qualifier);
		result.append(')');
		return result.toString();
	}

} //QualifierObjectImpl
