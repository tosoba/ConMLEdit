/**
 */
package conml.impl;

import conml.Language;
import conml.Model;
import conml.ModelElement;
import conml.Tag;
import conml.conmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getHasTags <em>Has Tags</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getHasLanguages <em>Has Languages</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getOwnsElements <em>Owns Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final double VERSION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected double version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "New model";

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
	 * The cached value of the '{@link #getHasTags() <em>Has Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> hasTags;

	/**
	 * The cached value of the '{@link #getHasLanguages() <em>Has Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> hasLanguages;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language defaultLanguage;

	/**
	 * The cached value of the '{@link #getOwnsElements() <em>Owns Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> ownsElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(double newVersion) {
		double oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getHasTags() {
		if (hasTags == null) {
			hasTags = new EObjectContainmentWithInverseEList<Tag>(Tag.class, this, conmlPackage.MODEL__HAS_TAGS, conmlPackage.TAG__BELONGS_TO);
		}
		return hasTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Language> getHasLanguages() {
		if (hasLanguages == null) {
			hasLanguages = new EObjectContainmentWithInverseEList<Language>(Language.class, this, conmlPackage.MODEL__HAS_LANGUAGES, conmlPackage.LANGUAGE__BELONGS_TO);
		}
		return hasLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language getDefaultLanguage() {
		if (defaultLanguage != null && defaultLanguage.eIsProxy()) {
			InternalEObject oldDefaultLanguage = (InternalEObject)defaultLanguage;
			defaultLanguage = (Language)eResolveProxy(oldDefaultLanguage);
			if (defaultLanguage != oldDefaultLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, conmlPackage.MODEL__DEFAULT_LANGUAGE, oldDefaultLanguage, defaultLanguage));
			}
		}
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultLanguage(Language newDefaultLanguage, NotificationChain msgs) {
		Language oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL__DEFAULT_LANGUAGE, oldDefaultLanguage, newDefaultLanguage);
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
	public void setDefaultLanguage(Language newDefaultLanguage) {
		if (newDefaultLanguage != defaultLanguage) {
			NotificationChain msgs = null;
			if (defaultLanguage != null)
				msgs = ((InternalEObject)defaultLanguage).eInverseRemove(this, conmlPackage.LANGUAGE__IS_DEFAULT_IN, Language.class, msgs);
			if (newDefaultLanguage != null)
				msgs = ((InternalEObject)newDefaultLanguage).eInverseAdd(this, conmlPackage.LANGUAGE__IS_DEFAULT_IN, Language.class, msgs);
			msgs = basicSetDefaultLanguage(newDefaultLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL__DEFAULT_LANGUAGE, newDefaultLanguage, newDefaultLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getOwnsElements() {
		if (ownsElements == null) {
			ownsElements = new EObjectContainmentWithInverseEList<ModelElement>(ModelElement.class, this, conmlPackage.MODEL__OWNS_ELEMENTS, conmlPackage.MODEL_ELEMENT__BELONGS_TO);
		}
		return ownsElements;
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
			case conmlPackage.MODEL__HAS_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasTags()).basicAdd(otherEnd, msgs);
			case conmlPackage.MODEL__HAS_LANGUAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasLanguages()).basicAdd(otherEnd, msgs);
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				if (defaultLanguage != null)
					msgs = ((InternalEObject)defaultLanguage).eInverseRemove(this, conmlPackage.LANGUAGE__IS_DEFAULT_IN, Language.class, msgs);
				return basicSetDefaultLanguage((Language)otherEnd, msgs);
			case conmlPackage.MODEL__OWNS_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsElements()).basicAdd(otherEnd, msgs);
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
			case conmlPackage.MODEL__HAS_TAGS:
				return ((InternalEList<?>)getHasTags()).basicRemove(otherEnd, msgs);
			case conmlPackage.MODEL__HAS_LANGUAGES:
				return ((InternalEList<?>)getHasLanguages()).basicRemove(otherEnd, msgs);
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				return basicSetDefaultLanguage(null, msgs);
			case conmlPackage.MODEL__OWNS_ELEMENTS:
				return ((InternalEList<?>)getOwnsElements()).basicRemove(otherEnd, msgs);
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
			case conmlPackage.MODEL__NAME:
				return getName();
			case conmlPackage.MODEL__VERSION:
				return getVersion();
			case conmlPackage.MODEL__DESCRIPTION:
				return getDescription();
			case conmlPackage.MODEL__HAS_TAGS:
				return getHasTags();
			case conmlPackage.MODEL__HAS_LANGUAGES:
				return getHasLanguages();
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				if (resolve) return getDefaultLanguage();
				return basicGetDefaultLanguage();
			case conmlPackage.MODEL__OWNS_ELEMENTS:
				return getOwnsElements();
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
			case conmlPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case conmlPackage.MODEL__VERSION:
				setVersion((Double)newValue);
				return;
			case conmlPackage.MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case conmlPackage.MODEL__HAS_TAGS:
				getHasTags().clear();
				getHasTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case conmlPackage.MODEL__HAS_LANGUAGES:
				getHasLanguages().clear();
				getHasLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				setDefaultLanguage((Language)newValue);
				return;
			case conmlPackage.MODEL__OWNS_ELEMENTS:
				getOwnsElements().clear();
				getOwnsElements().addAll((Collection<? extends ModelElement>)newValue);
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
			case conmlPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case conmlPackage.MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case conmlPackage.MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case conmlPackage.MODEL__HAS_TAGS:
				getHasTags().clear();
				return;
			case conmlPackage.MODEL__HAS_LANGUAGES:
				getHasLanguages().clear();
				return;
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				setDefaultLanguage((Language)null);
				return;
			case conmlPackage.MODEL__OWNS_ELEMENTS:
				getOwnsElements().clear();
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
			case conmlPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case conmlPackage.MODEL__VERSION:
				return version != VERSION_EDEFAULT;
			case conmlPackage.MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case conmlPackage.MODEL__HAS_TAGS:
				return hasTags != null && !hasTags.isEmpty();
			case conmlPackage.MODEL__HAS_LANGUAGES:
				return hasLanguages != null && !hasLanguages.isEmpty();
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				return defaultLanguage != null;
			case conmlPackage.MODEL__OWNS_ELEMENTS:
				return ownsElements != null && !ownsElements.isEmpty();
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
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
