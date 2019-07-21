/**
 */
package conml.impl;

import conml.Language;
import conml.Model;
import conml.conmlPackage;

import conml.instances.FacetSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.LanguageImpl#getName <em>Name</em>}</li>
 *   <li>{@link conml.impl.LanguageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.impl.LanguageImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link conml.impl.LanguageImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link conml.impl.LanguageImpl#getIsDefaultIn <em>Is Default In</em>}</li>
 *   <li>{@link conml.impl.LanguageImpl#getIsTranslationQualifierOf <em>Is Translation Qualifier Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageImpl extends ModelPartImpl implements Language {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsDefaultIn() <em>Is Default In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefaultIn()
	 * @generated
	 * @ordered
	 */
	protected Model isDefaultIn;

	/**
	 * The cached value of the '{@link #getIsTranslationQualifierOf() <em>Is Translation Qualifier Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTranslationQualifierOf()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetSet> isTranslationQualifierOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.LANGUAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.LANGUAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.LANGUAGE__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getBelongsTo() {
		if (eContainerFeatureID() != conmlPackage.LANGUAGE__BELONGS_TO) return null;
		return (Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(Model newBelongsTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsTo, conmlPackage.LANGUAGE__BELONGS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBelongsTo(Model newBelongsTo) {
		if (newBelongsTo != eInternalContainer() || (eContainerFeatureID() != conmlPackage.LANGUAGE__BELONGS_TO && newBelongsTo != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, conmlPackage.MODEL__HAS_LANGUAGES, Model.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.LANGUAGE__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getIsDefaultIn() {
		if (isDefaultIn != null && isDefaultIn.eIsProxy()) {
			InternalEObject oldIsDefaultIn = (InternalEObject)isDefaultIn;
			isDefaultIn = (Model)eResolveProxy(oldIsDefaultIn);
			if (isDefaultIn != oldIsDefaultIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, conmlPackage.LANGUAGE__IS_DEFAULT_IN, oldIsDefaultIn, isDefaultIn));
			}
		}
		return isDefaultIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetIsDefaultIn() {
		return isDefaultIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefaultIn(Model newIsDefaultIn, NotificationChain msgs) {
		Model oldIsDefaultIn = isDefaultIn;
		isDefaultIn = newIsDefaultIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, conmlPackage.LANGUAGE__IS_DEFAULT_IN, oldIsDefaultIn, newIsDefaultIn);
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
	public void setIsDefaultIn(Model newIsDefaultIn) {
		if (newIsDefaultIn != isDefaultIn) {
			NotificationChain msgs = null;
			if (isDefaultIn != null)
				msgs = ((InternalEObject)isDefaultIn).eInverseRemove(this, conmlPackage.MODEL__DEFAULT_LANGUAGE, Model.class, msgs);
			if (newIsDefaultIn != null)
				msgs = ((InternalEObject)newIsDefaultIn).eInverseAdd(this, conmlPackage.MODEL__DEFAULT_LANGUAGE, Model.class, msgs);
			msgs = basicSetIsDefaultIn(newIsDefaultIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.LANGUAGE__IS_DEFAULT_IN, newIsDefaultIn, newIsDefaultIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FacetSet> getIsTranslationQualifierOf() {
		if (isTranslationQualifierOf == null) {
			isTranslationQualifierOf = new EObjectResolvingEList<FacetSet>(FacetSet.class, this, conmlPackage.LANGUAGE__IS_TRANSLATION_QUALIFIER_OF);
		}
		return isTranslationQualifierOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case conmlPackage.LANGUAGE__BELONGS_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsTo((Model)otherEnd, msgs);
			case conmlPackage.LANGUAGE__IS_DEFAULT_IN:
				if (isDefaultIn != null)
					msgs = ((InternalEObject)isDefaultIn).eInverseRemove(this, conmlPackage.MODEL__DEFAULT_LANGUAGE, Model.class, msgs);
				return basicSetIsDefaultIn((Model)otherEnd, msgs);
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
			case conmlPackage.LANGUAGE__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case conmlPackage.LANGUAGE__IS_DEFAULT_IN:
				return basicSetIsDefaultIn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case conmlPackage.LANGUAGE__BELONGS_TO:
				return eInternalContainer().eInverseRemove(this, conmlPackage.MODEL__HAS_LANGUAGES, Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case conmlPackage.LANGUAGE__NAME:
				return getName();
			case conmlPackage.LANGUAGE__DESCRIPTION:
				return getDescription();
			case conmlPackage.LANGUAGE__IS_DEFAULT:
				return isIsDefault();
			case conmlPackage.LANGUAGE__BELONGS_TO:
				return getBelongsTo();
			case conmlPackage.LANGUAGE__IS_DEFAULT_IN:
				if (resolve) return getIsDefaultIn();
				return basicGetIsDefaultIn();
			case conmlPackage.LANGUAGE__IS_TRANSLATION_QUALIFIER_OF:
				return getIsTranslationQualifierOf();
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
			case conmlPackage.LANGUAGE__NAME:
				setName((String)newValue);
				return;
			case conmlPackage.LANGUAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case conmlPackage.LANGUAGE__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case conmlPackage.LANGUAGE__BELONGS_TO:
				setBelongsTo((Model)newValue);
				return;
			case conmlPackage.LANGUAGE__IS_DEFAULT_IN:
				setIsDefaultIn((Model)newValue);
				return;
			case conmlPackage.LANGUAGE__IS_TRANSLATION_QUALIFIER_OF:
				getIsTranslationQualifierOf().clear();
				getIsTranslationQualifierOf().addAll((Collection<? extends FacetSet>)newValue);
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
			case conmlPackage.LANGUAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case conmlPackage.LANGUAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case conmlPackage.LANGUAGE__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case conmlPackage.LANGUAGE__BELONGS_TO:
				setBelongsTo((Model)null);
				return;
			case conmlPackage.LANGUAGE__IS_DEFAULT_IN:
				setIsDefaultIn((Model)null);
				return;
			case conmlPackage.LANGUAGE__IS_TRANSLATION_QUALIFIER_OF:
				getIsTranslationQualifierOf().clear();
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
			case conmlPackage.LANGUAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case conmlPackage.LANGUAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case conmlPackage.LANGUAGE__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case conmlPackage.LANGUAGE__BELONGS_TO:
				return getBelongsTo() != null;
			case conmlPackage.LANGUAGE__IS_DEFAULT_IN:
				return isDefaultIn != null;
			case conmlPackage.LANGUAGE__IS_TRANSLATION_QUALIFIER_OF:
				return isTranslationQualifierOf != null && !isTranslationQualifierOf.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(')');
		return result.toString();
	}

} //LanguageImpl
