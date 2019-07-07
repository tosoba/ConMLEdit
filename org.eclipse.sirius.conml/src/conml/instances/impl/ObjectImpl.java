/**
 */
package conml.instances.impl;

import conml.ModelElement;
import conml.conmlPackage;

import conml.instances.DegreeOfCertainty;
import conml.instances.FacetSet;
import conml.instances.InstancesPackage;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.instances.ValueSet;

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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getOwnsValueSets <em>Owns Value Sets</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getOwnsReferenceSets <em>Owns Reference Sets</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsOppositeIn <em>Is Opposite In</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsPhaseQualifierOf <em>Is Phase Qualifier Of</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsPersepectiveQualifierOf <em>Is Persepective Qualifier Of</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsTemporalExistenceQualiferOf <em>Is Temporal Existence Qualifer Of</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getSubjectveExistentalQualifer <em>Subjectve Existental Qualifer</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsSubjectveExistenceQualiferOf <em>Is Subjectve Existence Qualifer Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends InstanceImpl implements conml.instances.Object {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected static final DegreeOfCertainty CERTAINTY_EDEFAULT = DegreeOfCertainty.CERTAIN;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected DegreeOfCertainty certainty = CERTAINTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> documents;

	/**
	 * The cached value of the '{@link #getIsInstanceOf() <em>Is Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class isInstanceOf;

	/**
	 * The cached value of the '{@link #getOwnsValueSets() <em>Owns Value Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> ownsValueSets;

	/**
	 * The cached value of the '{@link #getOwnsReferenceSets() <em>Owns Reference Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsReferenceSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceSet> ownsReferenceSets;

	/**
	 * The cached value of the '{@link #getIsOppositeIn() <em>Is Opposite In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOppositeIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> isOppositeIn;

	/**
	 * The cached value of the '{@link #getIsPhaseQualifierOf() <em>Is Phase Qualifier Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPhaseQualifierOf()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetSet> isPhaseQualifierOf;

	/**
	 * The cached value of the '{@link #getIsPersepectiveQualifierOf() <em>Is Persepective Qualifier Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPersepectiveQualifierOf()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetSet> isPersepectiveQualifierOf;

	/**
	 * The cached value of the '{@link #getTemporalExistentialQualifier() <em>Temporal Existential Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalExistentialQualifier()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object temporalExistentialQualifier;

	/**
	 * The cached value of the '{@link #getIsTemporalExistenceQualiferOf() <em>Is Temporal Existence Qualifer Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTemporalExistenceQualiferOf()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> isTemporalExistenceQualiferOf;

	/**
	 * The cached value of the '{@link #getSubjectveExistentalQualifer() <em>Subjectve Existental Qualifer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectveExistentalQualifer()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object subjectveExistentalQualifer;

	/**
	 * The cached value of the '{@link #getIsSubjectveExistenceQualiferOf() <em>Is Subjectve Existence Qualifer Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubjectveExistenceQualiferOf()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> isSubjectveExistenceQualiferOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeOfCertainty getCertainty() {
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertainty(DegreeOfCertainty newCertainty) {
		DegreeOfCertainty oldCertainty = certainty;
		certainty = newCertainty == null ? CERTAINTY_EDEFAULT : newCertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__CERTAINTY, oldCertainty, certainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getDocuments() {
		if (documents == null) {
			documents = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this, InstancesPackage.OBJECT__DOCUMENTS, conmlPackage.MODEL_ELEMENT__IS_DOCUMENTED_BY);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getIsInstanceOf() {
		if (isInstanceOf != null && isInstanceOf.eIsProxy()) {
			InternalEObject oldIsInstanceOf = (InternalEObject)isInstanceOf;
			isInstanceOf = (conml.types.Class)eResolveProxy(oldIsInstanceOf);
			if (isInstanceOf != oldIsInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.OBJECT__IS_INSTANCE_OF, oldIsInstanceOf, isInstanceOf));
			}
		}
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetIsInstanceOf() {
		return isInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInstanceOf(conml.types.Class newIsInstanceOf, NotificationChain msgs) {
		conml.types.Class oldIsInstanceOf = isInstanceOf;
		isInstanceOf = newIsInstanceOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__IS_INSTANCE_OF, oldIsInstanceOf, newIsInstanceOf);
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
	public void setIsInstanceOf(conml.types.Class newIsInstanceOf) {
		if (newIsInstanceOf != isInstanceOf) {
			NotificationChain msgs = null;
			if (isInstanceOf != null)
				msgs = ((InternalEObject)isInstanceOf).eInverseRemove(this, TypesPackage.CLASS__INSTANCED_BY, conml.types.Class.class, msgs);
			if (newIsInstanceOf != null)
				msgs = ((InternalEObject)newIsInstanceOf).eInverseAdd(this, TypesPackage.CLASS__INSTANCED_BY, conml.types.Class.class, msgs);
			msgs = basicSetIsInstanceOf(newIsInstanceOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__IS_INSTANCE_OF, newIsInstanceOf, newIsInstanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSet> getOwnsValueSets() {
		if (ownsValueSets == null) {
			ownsValueSets = new EObjectWithInverseResolvingEList<ValueSet>(ValueSet.class, this, InstancesPackage.OBJECT__OWNS_VALUE_SETS, InstancesPackage.VALUE_SET__OWNER);
		}
		return ownsValueSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceSet> getOwnsReferenceSets() {
		if (ownsReferenceSets == null) {
			ownsReferenceSets = new EObjectWithInverseResolvingEList<ReferenceSet>(ReferenceSet.class, this, InstancesPackage.OBJECT__OWNS_REFERENCE_SETS, InstancesPackage.REFERENCE_SET__OWNER);
		}
		return ownsReferenceSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getIsOppositeIn() {
		if (isOppositeIn == null) {
			isOppositeIn = new EObjectWithInverseResolvingEList<Reference>(Reference.class, this, InstancesPackage.OBJECT__IS_OPPOSITE_IN, InstancesPackage.REFERENCE__REFERS_TO);
		}
		return isOppositeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FacetSet> getIsPhaseQualifierOf() {
		if (isPhaseQualifierOf == null) {
			isPhaseQualifierOf = new EObjectWithInverseResolvingEList<FacetSet>(FacetSet.class, this, InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF, InstancesPackage.FACET_SET__HAS_PHASE_QUALIFIER);
		}
		return isPhaseQualifierOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FacetSet> getIsPersepectiveQualifierOf() {
		if (isPersepectiveQualifierOf == null) {
			isPersepectiveQualifierOf = new EObjectWithInverseResolvingEList<FacetSet>(FacetSet.class, this, InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF, InstancesPackage.FACET_SET__HAS_PERSPECTIVE_QUALIFIER);
		}
		return isPersepectiveQualifierOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getTemporalExistentialQualifier() {
		if (temporalExistentialQualifier != null && temporalExistentialQualifier.eIsProxy()) {
			InternalEObject oldTemporalExistentialQualifier = (InternalEObject)temporalExistentialQualifier;
			temporalExistentialQualifier = (conml.instances.Object)eResolveProxy(oldTemporalExistentialQualifier);
			if (temporalExistentialQualifier != oldTemporalExistentialQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER, oldTemporalExistentialQualifier, temporalExistentialQualifier));
			}
		}
		return temporalExistentialQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetTemporalExistentialQualifier() {
		return temporalExistentialQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExistentialQualifier(conml.instances.Object newTemporalExistentialQualifier, NotificationChain msgs) {
		conml.instances.Object oldTemporalExistentialQualifier = temporalExistentialQualifier;
		temporalExistentialQualifier = newTemporalExistentialQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER, oldTemporalExistentialQualifier, newTemporalExistentialQualifier);
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
	public void setTemporalExistentialQualifier(conml.instances.Object newTemporalExistentialQualifier) {
		if (newTemporalExistentialQualifier != temporalExistentialQualifier) {
			NotificationChain msgs = null;
			if (temporalExistentialQualifier != null)
				msgs = ((InternalEObject)temporalExistentialQualifier).eInverseRemove(this, InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF, conml.instances.Object.class, msgs);
			if (newTemporalExistentialQualifier != null)
				msgs = ((InternalEObject)newTemporalExistentialQualifier).eInverseAdd(this, InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF, conml.instances.Object.class, msgs);
			msgs = basicSetTemporalExistentialQualifier(newTemporalExistentialQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER, newTemporalExistentialQualifier, newTemporalExistentialQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getIsTemporalExistenceQualiferOf() {
		if (isTemporalExistenceQualiferOf == null) {
			isTemporalExistenceQualiferOf = new EObjectWithInverseResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF, InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER);
		}
		return isTemporalExistenceQualiferOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getSubjectveExistentalQualifer() {
		if (subjectveExistentalQualifer != null && subjectveExistentalQualifer.eIsProxy()) {
			InternalEObject oldSubjectveExistentalQualifer = (InternalEObject)subjectveExistentalQualifer;
			subjectveExistentalQualifer = (conml.instances.Object)eResolveProxy(oldSubjectveExistentalQualifer);
			if (subjectveExistentalQualifer != oldSubjectveExistentalQualifer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER, oldSubjectveExistentalQualifer, subjectveExistentalQualifer));
			}
		}
		return subjectveExistentalQualifer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetSubjectveExistentalQualifer() {
		return subjectveExistentalQualifer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectveExistentalQualifer(conml.instances.Object newSubjectveExistentalQualifer, NotificationChain msgs) {
		conml.instances.Object oldSubjectveExistentalQualifer = subjectveExistentalQualifer;
		subjectveExistentalQualifer = newSubjectveExistentalQualifer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER, oldSubjectveExistentalQualifer, newSubjectveExistentalQualifer);
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
	public void setSubjectveExistentalQualifer(conml.instances.Object newSubjectveExistentalQualifer) {
		if (newSubjectveExistentalQualifer != subjectveExistentalQualifer) {
			NotificationChain msgs = null;
			if (subjectveExistentalQualifer != null)
				msgs = ((InternalEObject)subjectveExistentalQualifer).eInverseRemove(this, InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF, conml.instances.Object.class, msgs);
			if (newSubjectveExistentalQualifer != null)
				msgs = ((InternalEObject)newSubjectveExistentalQualifer).eInverseAdd(this, InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF, conml.instances.Object.class, msgs);
			msgs = basicSetSubjectveExistentalQualifer(newSubjectveExistentalQualifer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER, newSubjectveExistentalQualifer, newSubjectveExistentalQualifer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getIsSubjectveExistenceQualiferOf() {
		if (isSubjectveExistenceQualiferOf == null) {
			isSubjectveExistenceQualiferOf = new EObjectWithInverseResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF, InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER);
		}
		return isSubjectveExistenceQualiferOf;
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
			case InstancesPackage.OBJECT__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_INSTANCE_OF:
				if (isInstanceOf != null)
					msgs = ((InternalEObject)isInstanceOf).eInverseRemove(this, TypesPackage.CLASS__INSTANCED_BY, conml.types.Class.class, msgs);
				return basicSetIsInstanceOf((conml.types.Class)otherEnd, msgs);
			case InstancesPackage.OBJECT__OWNS_VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsValueSets()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__OWNS_REFERENCE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsReferenceSets()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOppositeIn()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPhaseQualifierOf()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPersepectiveQualifierOf()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				if (temporalExistentialQualifier != null)
					msgs = ((InternalEObject)temporalExistentialQualifier).eInverseRemove(this, InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF, conml.instances.Object.class, msgs);
				return basicSetTemporalExistentialQualifier((conml.instances.Object)otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTemporalExistenceQualiferOf()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER:
				if (subjectveExistentalQualifer != null)
					msgs = ((InternalEObject)subjectveExistentalQualifer).eInverseRemove(this, InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF, conml.instances.Object.class, msgs);
				return basicSetSubjectveExistentalQualifer((conml.instances.Object)otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSubjectveExistenceQualiferOf()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.OBJECT__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_INSTANCE_OF:
				return basicSetIsInstanceOf(null, msgs);
			case InstancesPackage.OBJECT__OWNS_VALUE_SETS:
				return ((InternalEList<?>)getOwnsValueSets()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__OWNS_REFERENCE_SETS:
				return ((InternalEList<?>)getOwnsReferenceSets()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return ((InternalEList<?>)getIsOppositeIn()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF:
				return ((InternalEList<?>)getIsPhaseQualifierOf()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF:
				return ((InternalEList<?>)getIsPersepectiveQualifierOf()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				return basicSetTemporalExistentialQualifier(null, msgs);
			case InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF:
				return ((InternalEList<?>)getIsTemporalExistenceQualiferOf()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER:
				return basicSetSubjectveExistentalQualifer(null, msgs);
			case InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF:
				return ((InternalEList<?>)getIsSubjectveExistenceQualiferOf()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.OBJECT__IDENTIFIER:
				return getIdentifier();
			case InstancesPackage.OBJECT__CERTAINTY:
				return getCertainty();
			case InstancesPackage.OBJECT__DOCUMENTS:
				return getDocuments();
			case InstancesPackage.OBJECT__IS_INSTANCE_OF:
				if (resolve) return getIsInstanceOf();
				return basicGetIsInstanceOf();
			case InstancesPackage.OBJECT__OWNS_VALUE_SETS:
				return getOwnsValueSets();
			case InstancesPackage.OBJECT__OWNS_REFERENCE_SETS:
				return getOwnsReferenceSets();
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return getIsOppositeIn();
			case InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF:
				return getIsPhaseQualifierOf();
			case InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF:
				return getIsPersepectiveQualifierOf();
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				if (resolve) return getTemporalExistentialQualifier();
				return basicGetTemporalExistentialQualifier();
			case InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF:
				return getIsTemporalExistenceQualiferOf();
			case InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER:
				if (resolve) return getSubjectveExistentalQualifer();
				return basicGetSubjectveExistentalQualifer();
			case InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF:
				return getIsSubjectveExistenceQualiferOf();
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
			case InstancesPackage.OBJECT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case InstancesPackage.OBJECT__CERTAINTY:
				setCertainty((DegreeOfCertainty)newValue);
				return;
			case InstancesPackage.OBJECT__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case InstancesPackage.OBJECT__IS_INSTANCE_OF:
				setIsInstanceOf((conml.types.Class)newValue);
				return;
			case InstancesPackage.OBJECT__OWNS_VALUE_SETS:
				getOwnsValueSets().clear();
				getOwnsValueSets().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case InstancesPackage.OBJECT__OWNS_REFERENCE_SETS:
				getOwnsReferenceSets().clear();
				getOwnsReferenceSets().addAll((Collection<? extends ReferenceSet>)newValue);
				return;
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				getIsOppositeIn().clear();
				getIsOppositeIn().addAll((Collection<? extends Reference>)newValue);
				return;
			case InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF:
				getIsPhaseQualifierOf().clear();
				getIsPhaseQualifierOf().addAll((Collection<? extends FacetSet>)newValue);
				return;
			case InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF:
				getIsPersepectiveQualifierOf().clear();
				getIsPersepectiveQualifierOf().addAll((Collection<? extends FacetSet>)newValue);
				return;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				setTemporalExistentialQualifier((conml.instances.Object)newValue);
				return;
			case InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF:
				getIsTemporalExistenceQualiferOf().clear();
				getIsTemporalExistenceQualiferOf().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER:
				setSubjectveExistentalQualifer((conml.instances.Object)newValue);
				return;
			case InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF:
				getIsSubjectveExistenceQualiferOf().clear();
				getIsSubjectveExistenceQualiferOf().addAll((Collection<? extends conml.instances.Object>)newValue);
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
			case InstancesPackage.OBJECT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case InstancesPackage.OBJECT__CERTAINTY:
				setCertainty(CERTAINTY_EDEFAULT);
				return;
			case InstancesPackage.OBJECT__DOCUMENTS:
				getDocuments().clear();
				return;
			case InstancesPackage.OBJECT__IS_INSTANCE_OF:
				setIsInstanceOf((conml.types.Class)null);
				return;
			case InstancesPackage.OBJECT__OWNS_VALUE_SETS:
				getOwnsValueSets().clear();
				return;
			case InstancesPackage.OBJECT__OWNS_REFERENCE_SETS:
				getOwnsReferenceSets().clear();
				return;
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				getIsOppositeIn().clear();
				return;
			case InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF:
				getIsPhaseQualifierOf().clear();
				return;
			case InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF:
				getIsPersepectiveQualifierOf().clear();
				return;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				setTemporalExistentialQualifier((conml.instances.Object)null);
				return;
			case InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF:
				getIsTemporalExistenceQualiferOf().clear();
				return;
			case InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER:
				setSubjectveExistentalQualifer((conml.instances.Object)null);
				return;
			case InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF:
				getIsSubjectveExistenceQualiferOf().clear();
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
			case InstancesPackage.OBJECT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case InstancesPackage.OBJECT__CERTAINTY:
				return certainty != CERTAINTY_EDEFAULT;
			case InstancesPackage.OBJECT__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case InstancesPackage.OBJECT__IS_INSTANCE_OF:
				return isInstanceOf != null;
			case InstancesPackage.OBJECT__OWNS_VALUE_SETS:
				return ownsValueSets != null && !ownsValueSets.isEmpty();
			case InstancesPackage.OBJECT__OWNS_REFERENCE_SETS:
				return ownsReferenceSets != null && !ownsReferenceSets.isEmpty();
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return isOppositeIn != null && !isOppositeIn.isEmpty();
			case InstancesPackage.OBJECT__IS_PHASE_QUALIFIER_OF:
				return isPhaseQualifierOf != null && !isPhaseQualifierOf.isEmpty();
			case InstancesPackage.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF:
				return isPersepectiveQualifierOf != null && !isPersepectiveQualifierOf.isEmpty();
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				return temporalExistentialQualifier != null;
			case InstancesPackage.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF:
				return isTemporalExistenceQualiferOf != null && !isTemporalExistenceQualiferOf.isEmpty();
			case InstancesPackage.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER:
				return subjectveExistentalQualifer != null;
			case InstancesPackage.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF:
				return isSubjectveExistenceQualiferOf != null && !isSubjectveExistenceQualiferOf.isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", certainty: ");
		result.append(certainty);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
