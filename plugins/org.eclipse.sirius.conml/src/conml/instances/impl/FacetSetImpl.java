/**
 */
package conml.instances.impl;

import conml.Language;
import conml.instances.Facet;
import conml.instances.FacetSet;
import conml.instances.InstancesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getIsComposedOf <em>Is Composed Of</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getTranslationQualifiers <em>Translation Qualifiers</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getPhaseQualifier <em>Phase Qualifier</em>}</li>
 *   <li>{@link conml.instances.impl.FacetSetImpl#getPerspectiveQualifier <em>Perspective Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FacetSetImpl extends InstanceImpl implements FacetSet {
	/**
	 * The cached value of the '{@link #getIsComposedOf() <em>Is Composed Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Facet> isComposedOf;

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
	 * The cached value of the '{@link #getPhaseQualifier() <em>Phase Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseQualifier()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object phaseQualifier;

  /**
	 * The cached value of the '{@link #getPerspectiveQualifier() <em>Perspective Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveQualifier()
	 * @generated
	 * @ordered
	 */
	protected conml.instances.Object perspectiveQualifier;

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
	public EList<Facet> getIsComposedOf() {
		if (isComposedOf == null) {
			isComposedOf = new EObjectWithInverseResolvingEList<Facet>(Facet.class, this, InstancesPackage.FACET_SET__IS_COMPOSED_OF, InstancesPackage.FACET__IS_OWNED_BY);
		}
		return isComposedOf;
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
	public conml.instances.Object getPhaseQualifier() {
		if (phaseQualifier != null && phaseQualifier.eIsProxy()) {
			InternalEObject oldPhaseQualifier = (InternalEObject)phaseQualifier;
			phaseQualifier = (conml.instances.Object)eResolveProxy(oldPhaseQualifier);
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
	public conml.instances.Object basicGetPhaseQualifier() {
		return phaseQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhaseQualifier(conml.instances.Object newPhaseQualifier) {
		conml.instances.Object oldPhaseQualifier = phaseQualifier;
		phaseQualifier = newPhaseQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__PHASE_QUALIFIER, oldPhaseQualifier, phaseQualifier));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.instances.Object getPerspectiveQualifier() {
		if (perspectiveQualifier != null && perspectiveQualifier.eIsProxy()) {
			InternalEObject oldPerspectiveQualifier = (InternalEObject)perspectiveQualifier;
			perspectiveQualifier = (conml.instances.Object)eResolveProxy(oldPerspectiveQualifier);
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
	public conml.instances.Object basicGetPerspectiveQualifier() {
		return perspectiveQualifier;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerspectiveQualifier(conml.instances.Object newPerspectiveQualifier) {
		conml.instances.Object oldPerspectiveQualifier = perspectiveQualifier;
		perspectiveQualifier = newPerspectiveQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER, oldPerspectiveQualifier, perspectiveQualifier));
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
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsComposedOf()).basicAdd(otherEnd, msgs);
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
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return ((InternalEList<?>)getIsComposedOf()).basicRemove(otherEnd, msgs);
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
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return getIsComposedOf();
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				return getTranslationQualifiers();
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				if (resolve) return getPhaseQualifier();
				return basicGetPhaseQualifier();
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				if (resolve) return getPerspectiveQualifier();
				return basicGetPerspectiveQualifier();
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
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				getIsComposedOf().clear();
				getIsComposedOf().addAll((Collection<? extends Facet>)newValue);
				return;
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				getTranslationQualifiers().clear();
				getTranslationQualifiers().addAll((Collection<? extends Language>)newValue);
				return;
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				setPhaseQualifier((conml.instances.Object)newValue);
				return;
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				setPerspectiveQualifier((conml.instances.Object)newValue);
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
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				getIsComposedOf().clear();
				return;
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				getTranslationQualifiers().clear();
				return;
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				setPhaseQualifier((conml.instances.Object)null);
				return;
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				setPerspectiveQualifier((conml.instances.Object)null);
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
			case InstancesPackage.FACET_SET__IS_COMPOSED_OF:
				return isComposedOf != null && !isComposedOf.isEmpty();
			case InstancesPackage.FACET_SET__TRANSLATION_QUALIFIERS:
				return translationQualifiers != null && !translationQualifiers.isEmpty();
			case InstancesPackage.FACET_SET__PHASE_QUALIFIER:
				return phaseQualifier != null;
			case InstancesPackage.FACET_SET__PERSPECTIVE_QUALIFIER:
				return perspectiveQualifier != null;
		}
		return super.eIsSet(featureID);
	}

} //FacetSetImpl
