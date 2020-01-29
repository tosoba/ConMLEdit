/**
 */
package conml.instances.impl;

import conml.Language;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getTranslationQualifiers <em>Translation Qualifiers</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getPerspectiveQualifier <em>Perspective Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getPhaseQualifier <em>Phase Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FacetSetImpl extends InstanceImpl implements FacetSet {
	/**
	 * The cached value of the '{@link #getTranslationQualifiers() <em>Translation Qualifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> translationQualifiers;

	/**
	 * The cached value of the '{@link #getPerspectiveQualifier() <em>Perspective Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveQualifier()
	 * @generated
	 * @ordered
	 */
	protected QualifierObject perspectiveQualifier;

    /**
	 * The cached value of the '{@link #getPhaseQualifier() <em>Phase Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPhaseQualifier()
	 * @generated
	 * @ordered
	 */
    protected QualifierObject phaseQualifier;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.FACET_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Language> getTranslationQualifiers() {
		if (translationQualifiers == null) {
			translationQualifiers = new EObjectResolvingEList<Language>(Language.class, this, InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS);
		}
		return translationQualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifierObject getPhaseQualifier() {
		if (phaseQualifier != null && phaseQualifier.eIsProxy()) {
			InternalEObject oldPhaseQualifier = (InternalEObject)phaseQualifier;
			phaseQualifier = (QualifierObject)eResolveProxy(oldPhaseQualifier);
			if (phaseQualifier != oldPhaseQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.FACET_SET__PHASE_QUALIFIER, oldPhaseQualifier, phaseQualifier));
			}
		}
		return phaseQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierObject basicGetPhaseQualifier() {
		return phaseQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseQualifier(QualifierObject newPhaseQualifier, NotificationChain msgs) {
		QualifierObject oldPhaseQualifier = phaseQualifier;
		phaseQualifier = newPhaseQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__PHASE_QUALIFIER, oldPhaseQualifier, newPhaseQualifier);
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
	public void setPhaseQualifier(QualifierObject newPhaseQualifier) {
		if (newPhaseQualifier != phaseQualifier) {
			NotificationChain msgs = null;
			if (phaseQualifier != null)
				msgs = ((InternalEObject)phaseQualifier).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS, QualifierObject.class, msgs);
			if (newPhaseQualifier != null)
				msgs = ((InternalEObject)newPhaseQualifier).eInverseAdd(this, InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS, QualifierObject.class, msgs);
			msgs = basicSetPhaseQualifier(newPhaseQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__PHASE_QUALIFIER, newPhaseQualifier, newPhaseQualifier));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				if (perspectiveQualifier != null)
					msgs = ((InternalEObject)perspectiveQualifier).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS, QualifierObject.class, msgs);
				return basicSetPerspectiveQualifier((QualifierObject)otherEnd, msgs);
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				if (phaseQualifier != null)
					msgs = ((InternalEObject)phaseQualifier).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS, QualifierObject.class, msgs);
				return basicSetPhaseQualifier((QualifierObject)otherEnd, msgs);
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
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				return basicSetPerspectiveQualifier(null, msgs);
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				return basicSetPhaseQualifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifierObject getPerspectiveQualifier() {
		if (perspectiveQualifier != null && perspectiveQualifier.eIsProxy()) {
			InternalEObject oldPerspectiveQualifier = (InternalEObject)perspectiveQualifier;
			perspectiveQualifier = (QualifierObject)eResolveProxy(oldPerspectiveQualifier);
			if (perspectiveQualifier != oldPerspectiveQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER, oldPerspectiveQualifier, perspectiveQualifier));
			}
		}
		return perspectiveQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierObject basicGetPerspectiveQualifier() {
		return perspectiveQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerspectiveQualifier(QualifierObject newPerspectiveQualifier, NotificationChain msgs) {
		QualifierObject oldPerspectiveQualifier = perspectiveQualifier;
		perspectiveQualifier = newPerspectiveQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER, oldPerspectiveQualifier, newPerspectiveQualifier);
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
	public void setPerspectiveQualifier(QualifierObject newPerspectiveQualifier) {
		if (newPerspectiveQualifier != perspectiveQualifier) {
			NotificationChain msgs = null;
			if (perspectiveQualifier != null)
				msgs = ((InternalEObject)perspectiveQualifier).eInverseRemove(this, InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS, QualifierObject.class, msgs);
			if (newPerspectiveQualifier != null)
				msgs = ((InternalEObject)newPerspectiveQualifier).eInverseAdd(this, InstancesPackage.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS, QualifierObject.class, msgs);
			msgs = basicSetPerspectiveQualifier(newPerspectiveQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER, newPerspectiveQualifier, newPerspectiveQualifier));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				return getTranslationQualifiers();
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				if (resolve) return getPerspectiveQualifier();
				return basicGetPerspectiveQualifier();
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				if (resolve) return getPhaseQualifier();
				return basicGetPhaseQualifier();
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
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				getTranslationQualifiers().clear();
				getTranslationQualifiers().addAll((Collection<? extends Language>)newValue);
				return;
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				setPerspectiveQualifier((QualifierObject)newValue);
				return;
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				setPhaseQualifier((QualifierObject)newValue);
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
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				getTranslationQualifiers().clear();
				return;
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				setPerspectiveQualifier((QualifierObject)null);
				return;
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				setPhaseQualifier((QualifierObject)null);
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
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				return translationQualifiers != null && !translationQualifiers.isEmpty();
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				return perspectiveQualifier != null;
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				return phaseQualifier != null;
		}
		return super.eIsSet(featureID);
	}

} //FacetSetImpl
