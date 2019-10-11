/**
 */
package conml.instances.impl;

import conml.instances.DegreeOfCertainty;
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
 *   <li>{@link conml.instances.impl.ObjectImpl#getInstancedClass <em>Instanced Class</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getOwnedValueSets <em>Owned Value Sets</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getOwnedReferenceSets <em>Owned Reference Sets</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsOppositeIn <em>Is Opposite In</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}</li>
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
	 * The cached value of the '{@link #getInstancedClass() <em>Instanced Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedClass()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class instancedClass;

  /**
	 * The cached value of the '{@link #getOwnedValueSets() <em>Owned Value Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> ownedValueSets;

  /**
	 * The cached value of the '{@link #getOwnedReferenceSets() <em>Owned Reference Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReferenceSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceSet> ownedReferenceSets;

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
	 * The cached value of the '{@link #getTemporalExistentialQualifier() <em>Temporal Existential Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalExistentialQualifier()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object temporalExistentialQualifier;

	/**
	 * The cached value of the '{@link #getSubjectiveExistentialQualifer() <em>Subjective Existential Qualifer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveExistentialQualifer()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object subjectiveExistentialQualifer;

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
	public conml.types.Class getInstancedClass() {
		if (instancedClass != null && instancedClass.eIsProxy()) {
			InternalEObject oldInstancedClass = (InternalEObject)instancedClass;
			instancedClass = (conml.types.Class)eResolveProxy(oldInstancedClass);
			if (instancedClass != oldInstancedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.OBJECT__INSTANCED_CLASS, oldInstancedClass, instancedClass));
			}
		}
		return instancedClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetInstancedClass() {
		return instancedClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancedClass(conml.types.Class newInstancedClass, NotificationChain msgs) {
		conml.types.Class oldInstancedClass = instancedClass;
		instancedClass = newInstancedClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__INSTANCED_CLASS, oldInstancedClass, newInstancedClass);
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
	public void setInstancedClass(conml.types.Class newInstancedClass) {
		if (newInstancedClass != instancedClass) {
			NotificationChain msgs = null;
			if (instancedClass != null)
				msgs = ((InternalEObject)instancedClass).eInverseRemove(this, TypesPackage.CLASS__INSTANCE_OBJECTS, conml.types.Class.class, msgs);
			if (newInstancedClass != null)
				msgs = ((InternalEObject)newInstancedClass).eInverseAdd(this, TypesPackage.CLASS__INSTANCE_OBJECTS, conml.types.Class.class, msgs);
			msgs = basicSetInstancedClass(newInstancedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__INSTANCED_CLASS, newInstancedClass, newInstancedClass));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSet> getOwnedValueSets() {
		if (ownedValueSets == null) {
			ownedValueSets = new EObjectWithInverseResolvingEList<ValueSet>(ValueSet.class, this, InstancesPackage.OBJECT__OWNED_VALUE_SETS, InstancesPackage.VALUE_SET__OWNER);
		}
		return ownedValueSets;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceSet> getOwnedReferenceSets() {
		if (ownedReferenceSets == null) {
			ownedReferenceSets = new EObjectWithInverseResolvingEList<ReferenceSet>(ReferenceSet.class, this, InstancesPackage.OBJECT__OWNED_REFERENCE_SETS, InstancesPackage.REFERENCE_SET__OWNER);
		}
		return ownedReferenceSets;
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
	@Override
	public void setTemporalExistentialQualifier(conml.instances.Object newTemporalExistentialQualifier) {
		conml.instances.Object oldTemporalExistentialQualifier = temporalExistentialQualifier;
		temporalExistentialQualifier = newTemporalExistentialQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER, oldTemporalExistentialQualifier, temporalExistentialQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getSubjectiveExistentialQualifer() {
		if (subjectiveExistentialQualifer != null && subjectiveExistentialQualifer.eIsProxy()) {
			InternalEObject oldSubjectiveExistentialQualifer = (InternalEObject)subjectiveExistentialQualifer;
			subjectiveExistentialQualifer = (conml.instances.Object)eResolveProxy(oldSubjectiveExistentialQualifer);
			if (subjectiveExistentialQualifer != oldSubjectiveExistentialQualifer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER, oldSubjectiveExistentialQualifer, subjectiveExistentialQualifer));
			}
		}
		return subjectiveExistentialQualifer;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.instances.Object basicGetSubjectiveExistentialQualifer() {
		return subjectiveExistentialQualifer;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectiveExistentialQualifer(conml.instances.Object newSubjectiveExistentialQualifer) {
		conml.instances.Object oldSubjectiveExistentialQualifer = subjectiveExistentialQualifer;
		subjectiveExistentialQualifer = newSubjectiveExistentialQualifer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER, oldSubjectiveExistentialQualifer, subjectiveExistentialQualifer));
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
			case InstancesPackage.OBJECT__INSTANCED_CLASS:
				if (instancedClass != null)
					msgs = ((InternalEObject)instancedClass).eInverseRemove(this, TypesPackage.CLASS__INSTANCE_OBJECTS, conml.types.Class.class, msgs);
				return basicSetInstancedClass((conml.types.Class)otherEnd, msgs);
			case InstancesPackage.OBJECT__OWNED_VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedValueSets()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__OWNED_REFERENCE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedReferenceSets()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOppositeIn()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.OBJECT__INSTANCED_CLASS:
				return basicSetInstancedClass(null, msgs);
			case InstancesPackage.OBJECT__OWNED_VALUE_SETS:
				return ((InternalEList<?>)getOwnedValueSets()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__OWNED_REFERENCE_SETS:
				return ((InternalEList<?>)getOwnedReferenceSets()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return ((InternalEList<?>)getIsOppositeIn()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.OBJECT__INSTANCED_CLASS:
				if (resolve) return getInstancedClass();
				return basicGetInstancedClass();
			case InstancesPackage.OBJECT__OWNED_VALUE_SETS:
				return getOwnedValueSets();
			case InstancesPackage.OBJECT__OWNED_REFERENCE_SETS:
				return getOwnedReferenceSets();
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return getIsOppositeIn();
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				if (resolve) return getTemporalExistentialQualifier();
				return basicGetTemporalExistentialQualifier();
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				if (resolve) return getSubjectiveExistentialQualifer();
				return basicGetSubjectiveExistentialQualifer();
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
			case InstancesPackage.OBJECT__INSTANCED_CLASS:
				setInstancedClass((conml.types.Class)newValue);
				return;
			case InstancesPackage.OBJECT__OWNED_VALUE_SETS:
				getOwnedValueSets().clear();
				getOwnedValueSets().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case InstancesPackage.OBJECT__OWNED_REFERENCE_SETS:
				getOwnedReferenceSets().clear();
				getOwnedReferenceSets().addAll((Collection<? extends ReferenceSet>)newValue);
				return;
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				getIsOppositeIn().clear();
				getIsOppositeIn().addAll((Collection<? extends Reference>)newValue);
				return;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				setTemporalExistentialQualifier((conml.instances.Object)newValue);
				return;
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				setSubjectiveExistentialQualifer((conml.instances.Object)newValue);
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
			case InstancesPackage.OBJECT__INSTANCED_CLASS:
				setInstancedClass((conml.types.Class)null);
				return;
			case InstancesPackage.OBJECT__OWNED_VALUE_SETS:
				getOwnedValueSets().clear();
				return;
			case InstancesPackage.OBJECT__OWNED_REFERENCE_SETS:
				getOwnedReferenceSets().clear();
				return;
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				getIsOppositeIn().clear();
				return;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				setTemporalExistentialQualifier((conml.instances.Object)null);
				return;
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				setSubjectiveExistentialQualifer((conml.instances.Object)null);
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
			case InstancesPackage.OBJECT__INSTANCED_CLASS:
				return instancedClass != null;
			case InstancesPackage.OBJECT__OWNED_VALUE_SETS:
				return ownedValueSets != null && !ownedValueSets.isEmpty();
			case InstancesPackage.OBJECT__OWNED_REFERENCE_SETS:
				return ownedReferenceSets != null && !ownedReferenceSets.isEmpty();
			case InstancesPackage.OBJECT__IS_OPPOSITE_IN:
				return isOppositeIn != null && !isOppositeIn.isEmpty();
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				return temporalExistentialQualifier != null;
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				return subjectiveExistentialQualifer != null;
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
