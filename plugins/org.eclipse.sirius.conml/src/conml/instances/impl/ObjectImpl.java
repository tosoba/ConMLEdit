/**
 */
package conml.instances.impl;

import conml.ModelElement;
import conml.conmlPackage;
import conml.instances.DegreeOfCertainty;
import conml.instances.InstancesPackage;
import conml.instances.QualifierObject;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link conml.instances.impl.ObjectImpl#getIsReferredByReferences <em>Is Referred By References</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getReferenceSets <em>Reference Sets</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getDocumentedElements <em>Documented Elements</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#isDocumenting <em>Documenting</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getSubjectiveExistentialQualifer <em>Subjective Existential Qualifer</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getTemporalExistentialQualifier <em>Temporal Existential Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.ObjectImpl#getValueSets <em>Value Sets</em>}</li>
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
	 * The cached value of the '{@link #getIsReferredByReferences() <em>Is Referred By References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReferredByReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> isReferredByReferences;

    /**
	 * The cached value of the '{@link #getReferenceSets() <em>Reference Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #getReferenceSets()
	 * @generated
	 * @ordered
	 */
protected EList<ReferenceSet> referenceSets;

    /**
	 * The cached value of the '{@link #getDocumentedElements() <em>Documented Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> documentedElements;

                                /**
	 * The default value of the '{@link #isDocumenting() <em>Documenting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDocumenting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOCUMENTING_EDEFAULT = false;

        /**
	 * The cached value of the '{@link #isDocumenting() <em>Documenting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDocumenting()
	 * @generated
	 * @ordered
	 */
	protected boolean documenting = DOCUMENTING_EDEFAULT;

                /**
	 * The cached value of the '{@link #getSubjectiveExistentialQualifer() <em>Subjective Existential Qualifer</em>}' reference.
	 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
	 * @see #getSubjectiveExistentialQualifer()
	 * @generated
	 * @ordered
	 */
                protected QualifierObject subjectiveExistentialQualifer;

                /**
	 * The cached value of the '{@link #getTemporalExistentialQualifier() <em>Temporal Existential Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @see #getTemporalExistentialQualifier()
	 * @generated
	 * @ordered
	 */
protected QualifierObject temporalExistentialQualifier;

                                /**
* The cached value of the '{@link #getValueSets() <em>Value Sets</em>}' containment reference list.
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* @see #getValueSets()
* @generated
* @ordered
*/
protected EList<ValueSet> valueSets;

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
	public EList<Reference> getIsReferredByReferences() {
		if (isReferredByReferences == null) {
			isReferredByReferences = new EObjectWithInverseResolvingEList<Reference>(Reference.class, this, InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES, InstancesPackage.REFERENCE__REFERRED_OBJECT);
		}
		return isReferredByReferences;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifierObject getTemporalExistentialQualifier() {
		if (temporalExistentialQualifier != null && temporalExistentialQualifier.eIsProxy()) {
			InternalEObject oldTemporalExistentialQualifier = (InternalEObject)temporalExistentialQualifier;
			temporalExistentialQualifier = (QualifierObject)eResolveProxy(oldTemporalExistentialQualifier);
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
	public QualifierObject basicGetTemporalExistentialQualifier() {
		return temporalExistentialQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExistentialQualifier(QualifierObject newTemporalExistentialQualifier, NotificationChain msgs) {
		QualifierObject oldTemporalExistentialQualifier = temporalExistentialQualifier;
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
	public void setTemporalExistentialQualifier(QualifierObject newTemporalExistentialQualifier) {
		if (newTemporalExistentialQualifier != temporalExistentialQualifier) {
			NotificationChain msgs = null;
			if (temporalExistentialQualifier != null)
				msgs = ((InternalEObject)temporalExistentialQualifier).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS, QualifierObject.class, msgs);
			if (newTemporalExistentialQualifier != null)
				msgs = ((InternalEObject)newTemporalExistentialQualifier).eInverseAdd(this, InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS, QualifierObject.class, msgs);
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
	public QualifierObject getSubjectiveExistentialQualifer() {
		if (subjectiveExistentialQualifer != null && subjectiveExistentialQualifer.eIsProxy()) {
			InternalEObject oldSubjectiveExistentialQualifer = (InternalEObject)subjectiveExistentialQualifer;
			subjectiveExistentialQualifer = (QualifierObject)eResolveProxy(oldSubjectiveExistentialQualifer);
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
	public QualifierObject basicGetSubjectiveExistentialQualifer() {
		return subjectiveExistentialQualifer;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectiveExistentialQualifer(QualifierObject newSubjectiveExistentialQualifer, NotificationChain msgs) {
		QualifierObject oldSubjectiveExistentialQualifer = subjectiveExistentialQualifer;
		subjectiveExistentialQualifer = newSubjectiveExistentialQualifer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER, oldSubjectiveExistentialQualifer, newSubjectiveExistentialQualifer);
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
	public void setSubjectiveExistentialQualifer(QualifierObject newSubjectiveExistentialQualifer) {
		if (newSubjectiveExistentialQualifer != subjectiveExistentialQualifer) {
			NotificationChain msgs = null;
			if (subjectiveExistentialQualifer != null)
				msgs = ((InternalEObject)subjectiveExistentialQualifer).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS, QualifierObject.class, msgs);
			if (newSubjectiveExistentialQualifer != null)
				msgs = ((InternalEObject)newSubjectiveExistentialQualifer).eInverseAdd(this, InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS, QualifierObject.class, msgs);
			msgs = basicSetSubjectiveExistentialQualifer(newSubjectiveExistentialQualifer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER, newSubjectiveExistentialQualifer, newSubjectiveExistentialQualifer));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceSet> getReferenceSets() {
		if (referenceSets == null) {
			referenceSets = new EObjectContainmentWithInverseEList<ReferenceSet>(ReferenceSet.class, this, InstancesPackage.OBJECT__REFERENCE_SETS, InstancesPackage.REFERENCE_SET__OWNER);
		}
		return referenceSets;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getDocumentedElements() {
		if (documentedElements == null) {
			documentedElements = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this, InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS, conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS);
		}
		return documentedElements;
	}

                                /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDocumenting() {
		return documenting;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumenting(boolean newDocumenting) {
		boolean oldDocumenting = documenting;
		documenting = newDocumenting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.OBJECT__DOCUMENTING, oldDocumenting, documenting));
	}

                                                                /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSet> getValueSets() {
		if (valueSets == null) {
			valueSets = new EObjectContainmentWithInverseEList<ValueSet>(ValueSet.class, this, InstancesPackage.OBJECT__VALUE_SETS, InstancesPackage.VALUE_SET__OWNER);
		}
		return valueSets;
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
			case InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsReferredByReferences()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__REFERENCE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferenceSets()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentedElements()).basicAdd(otherEnd, msgs);
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				if (subjectiveExistentialQualifer != null)
					msgs = ((InternalEObject)subjectiveExistentialQualifer).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS, QualifierObject.class, msgs);
				return basicSetSubjectiveExistentialQualifer((QualifierObject)otherEnd, msgs);
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				if (temporalExistentialQualifier != null)
					msgs = ((InternalEObject)temporalExistentialQualifier).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS, QualifierObject.class, msgs);
				return basicSetTemporalExistentialQualifier((QualifierObject)otherEnd, msgs);
			case InstancesPackage.OBJECT__VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueSets()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES:
				return ((InternalEList<?>)getIsReferredByReferences()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__REFERENCE_SETS:
				return ((InternalEList<?>)getReferenceSets()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS:
				return ((InternalEList<?>)getDocumentedElements()).basicRemove(otherEnd, msgs);
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				return basicSetSubjectiveExistentialQualifer(null, msgs);
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				return basicSetTemporalExistentialQualifier(null, msgs);
			case InstancesPackage.OBJECT__VALUE_SETS:
				return ((InternalEList<?>)getValueSets()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES:
				return getIsReferredByReferences();
			case InstancesPackage.OBJECT__REFERENCE_SETS:
				return getReferenceSets();
			case InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS:
				return getDocumentedElements();
			case InstancesPackage.OBJECT__DOCUMENTING:
				return isDocumenting();
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				if (resolve) return getSubjectiveExistentialQualifer();
				return basicGetSubjectiveExistentialQualifer();
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				if (resolve) return getTemporalExistentialQualifier();
				return basicGetTemporalExistentialQualifier();
			case InstancesPackage.OBJECT__VALUE_SETS:
				return getValueSets();
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
			case InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES:
				getIsReferredByReferences().clear();
				getIsReferredByReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case InstancesPackage.OBJECT__REFERENCE_SETS:
				getReferenceSets().clear();
				getReferenceSets().addAll((Collection<? extends ReferenceSet>)newValue);
				return;
			case InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS:
				getDocumentedElements().clear();
				getDocumentedElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case InstancesPackage.OBJECT__DOCUMENTING:
				setDocumenting((Boolean)newValue);
				return;
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				setSubjectiveExistentialQualifer((QualifierObject)newValue);
				return;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				setTemporalExistentialQualifier((QualifierObject)newValue);
				return;
			case InstancesPackage.OBJECT__VALUE_SETS:
				getValueSets().clear();
				getValueSets().addAll((Collection<? extends ValueSet>)newValue);
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
			case InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES:
				getIsReferredByReferences().clear();
				return;
			case InstancesPackage.OBJECT__REFERENCE_SETS:
				getReferenceSets().clear();
				return;
			case InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS:
				getDocumentedElements().clear();
				return;
			case InstancesPackage.OBJECT__DOCUMENTING:
				setDocumenting(DOCUMENTING_EDEFAULT);
				return;
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				setSubjectiveExistentialQualifer((QualifierObject)null);
				return;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				setTemporalExistentialQualifier((QualifierObject)null);
				return;
			case InstancesPackage.OBJECT__VALUE_SETS:
				getValueSets().clear();
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
			case InstancesPackage.OBJECT__IS_REFERRED_BY_REFERENCES:
				return isReferredByReferences != null && !isReferredByReferences.isEmpty();
			case InstancesPackage.OBJECT__REFERENCE_SETS:
				return referenceSets != null && !referenceSets.isEmpty();
			case InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS:
				return documentedElements != null && !documentedElements.isEmpty();
			case InstancesPackage.OBJECT__DOCUMENTING:
				return documenting != DOCUMENTING_EDEFAULT;
			case InstancesPackage.OBJECT__SUBJECTIVE_EXISTENTIAL_QUALIFER:
				return subjectiveExistentialQualifer != null;
			case InstancesPackage.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER:
				return temporalExistentialQualifier != null;
			case InstancesPackage.OBJECT__VALUE_SETS:
				return valueSets != null && !valueSets.isEmpty();
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
		result.append(", documenting: ");
		result.append(documenting);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
