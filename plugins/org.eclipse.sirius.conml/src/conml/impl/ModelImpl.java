/**
 */
package conml.impl;

import conml.DescribableElement;
import conml.Language;
import conml.Model;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link conml.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getMetaInformationObjects <em>Meta Information Objects</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.impl.ModelImpl#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language defaultLanguage;

	/**
	 * The cached value of the '{@link #getMetaInformationObjects() <em>Meta Information Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInformationObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> metaInformationObjects;

    /**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
  protected EList<Tag> tags;

  /**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
  protected EList<Language> languages;

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
	@Override
	public void setDefaultLanguage(Language newDefaultLanguage) {
		Language oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, conmlPackage.MODEL__DEFAULT_LANGUAGE, oldDefaultLanguage, defaultLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectWithInverseResolvingEList<Tag>(Tag.class, this, conmlPackage.MODEL__TAGS, conmlPackage.TAG__MODEL);
		}
		return tags;
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
			case conmlPackage.MODEL__TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTags()).basicAdd(otherEnd, msgs);
			case conmlPackage.MODEL__LANGUAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLanguages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getMetaInformationObjects() {
		if (metaInformationObjects == null) {
			metaInformationObjects = new EObjectContainmentEList<conml.instances.Object>(conml.instances.Object.class, this, conmlPackage.MODEL__META_INFORMATION_OBJECTS);
		}
		return metaInformationObjects;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Language> getLanguages() {
		if (languages == null) {
			languages = new EObjectWithInverseResolvingEList<Language>(Language.class, this, conmlPackage.MODEL__LANGUAGES, conmlPackage.LANGUAGE__MODEL);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case conmlPackage.MODEL__META_INFORMATION_OBJECTS:
				return ((InternalEList<?>)getMetaInformationObjects()).basicRemove(otherEnd, msgs);
			case conmlPackage.MODEL__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case conmlPackage.MODEL__LANGUAGES:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
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
			case conmlPackage.MODEL__DESCRIPTION:
				return getDescription();
			case conmlPackage.MODEL__VERSION:
				return getVersion();
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				if (resolve) return getDefaultLanguage();
				return basicGetDefaultLanguage();
			case conmlPackage.MODEL__META_INFORMATION_OBJECTS:
				return getMetaInformationObjects();
			case conmlPackage.MODEL__TAGS:
				return getTags();
			case conmlPackage.MODEL__LANGUAGES:
				return getLanguages();
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
			case conmlPackage.MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case conmlPackage.MODEL__VERSION:
				setVersion((Double)newValue);
				return;
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				setDefaultLanguage((Language)newValue);
				return;
			case conmlPackage.MODEL__META_INFORMATION_OBJECTS:
				getMetaInformationObjects().clear();
				getMetaInformationObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case conmlPackage.MODEL__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case conmlPackage.MODEL__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Language>)newValue);
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
			case conmlPackage.MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case conmlPackage.MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				setDefaultLanguage((Language)null);
				return;
			case conmlPackage.MODEL__META_INFORMATION_OBJECTS:
				getMetaInformationObjects().clear();
				return;
			case conmlPackage.MODEL__TAGS:
				getTags().clear();
				return;
			case conmlPackage.MODEL__LANGUAGES:
				getLanguages().clear();
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
			case conmlPackage.MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case conmlPackage.MODEL__VERSION:
				return version != VERSION_EDEFAULT;
			case conmlPackage.MODEL__DEFAULT_LANGUAGE:
				return defaultLanguage != null;
			case conmlPackage.MODEL__META_INFORMATION_OBJECTS:
				return metaInformationObjects != null && !metaInformationObjects.isEmpty();
			case conmlPackage.MODEL__TAGS:
				return tags != null && !tags.isEmpty();
			case conmlPackage.MODEL__LANGUAGES:
				return languages != null && !languages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case conmlPackage.MODEL__DESCRIPTION: return conmlPackage.DESCRIBABLE_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.DESCRIBABLE_ELEMENT__DESCRIPTION: return conmlPackage.MODEL__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
