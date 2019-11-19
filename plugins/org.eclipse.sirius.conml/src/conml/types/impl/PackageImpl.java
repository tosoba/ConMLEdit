/**
 */
package conml.types.impl;

import conml.DescribableElement;
import conml.NamedElement;
import conml.conmlPackage;
import conml.types.EnumeratedType;
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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getEnumeratedTypes <em>Enumerated Types</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getContainerPackage <em>Container Package</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#isOverall <em>Overall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends TypeModelElementImpl implements conml.types.Package {
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
	 * The cached value of the '{@link #getContainedClasses() <em>Contained Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Class> containedClasses;

  /**
	 * The cached value of the '{@link #getEnumeratedTypes() <em>Enumerated Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedType> enumeratedTypes;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Package> subPackages;

    /**
	 * The cached value of the '{@link #getContainerPackage() <em>Container Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPackage()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Package containerPackage;

  /**
	 * The default value of the '{@link #isOverall() <em>Overall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERALL_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isOverall() <em>Overall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverall()
	 * @generated
	 * @ordered
	 */
	protected boolean overall = OVERALL_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.types.Class> getContainedClasses() {
		if (containedClasses == null) {
			containedClasses = new EObjectWithInverseResolvingEList<conml.types.Class>(conml.types.Class.class, this, TypesPackage.PACKAGE__CONTAINED_CLASSES, TypesPackage.CLASS__PACKAGE);
		}
		return containedClasses;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedType> getEnumeratedTypes() {
		if (enumeratedTypes == null) {
			enumeratedTypes = new EObjectWithInverseResolvingEList<EnumeratedType>(EnumeratedType.class, this, TypesPackage.PACKAGE__ENUMERATED_TYPES, TypesPackage.ENUMERATED_TYPE__PACKAGE);
		}
		return enumeratedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.types.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectWithInverseResolvingEList<conml.types.Package>(conml.types.Package.class, this, TypesPackage.PACKAGE__SUB_PACKAGES, TypesPackage.PACKAGE__CONTAINER_PACKAGE);
		}
		return subPackages;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Package getContainerPackage() {
		if (containerPackage != null && containerPackage.eIsProxy()) {
			InternalEObject oldContainerPackage = (InternalEObject)containerPackage;
			containerPackage = (conml.types.Package)eResolveProxy(oldContainerPackage);
			if (containerPackage != oldContainerPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.PACKAGE__CONTAINER_PACKAGE, oldContainerPackage, containerPackage));
			}
		}
		return containerPackage;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Package basicGetContainerPackage() {
		return containerPackage;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPackage(conml.types.Package newContainerPackage, NotificationChain msgs) {
		conml.types.Package oldContainerPackage = containerPackage;
		containerPackage = newContainerPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PACKAGE__CONTAINER_PACKAGE, oldContainerPackage, newContainerPackage);
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
	public void setContainerPackage(conml.types.Package newContainerPackage) {
		if (newContainerPackage != containerPackage) {
			NotificationChain msgs = null;
			if (containerPackage != null)
				msgs = ((InternalEObject)containerPackage).eInverseRemove(this, TypesPackage.PACKAGE__SUB_PACKAGES, conml.types.Package.class, msgs);
			if (newContainerPackage != null)
				msgs = ((InternalEObject)newContainerPackage).eInverseAdd(this, TypesPackage.PACKAGE__SUB_PACKAGES, conml.types.Package.class, msgs);
			msgs = basicSetContainerPackage(newContainerPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PACKAGE__CONTAINER_PACKAGE, newContainerPackage, newContainerPackage));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverall() {
		return overall;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverall(boolean newOverall) {
		boolean oldOverall = overall;
		overall = newOverall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PACKAGE__OVERALL, oldOverall, overall));
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
			case TypesPackage.PACKAGE__CONTAINED_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedClasses()).basicAdd(otherEnd, msgs);
			case TypesPackage.PACKAGE__ENUMERATED_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumeratedTypes()).basicAdd(otherEnd, msgs);
			case TypesPackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
			case TypesPackage.PACKAGE__CONTAINER_PACKAGE:
				if (containerPackage != null)
					msgs = ((InternalEObject)containerPackage).eInverseRemove(this, TypesPackage.PACKAGE__SUB_PACKAGES, conml.types.Package.class, msgs);
				return basicSetContainerPackage((conml.types.Package)otherEnd, msgs);
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
			case TypesPackage.PACKAGE__CONTAINED_CLASSES:
				return ((InternalEList<?>)getContainedClasses()).basicRemove(otherEnd, msgs);
			case TypesPackage.PACKAGE__ENUMERATED_TYPES:
				return ((InternalEList<?>)getEnumeratedTypes()).basicRemove(otherEnd, msgs);
			case TypesPackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
			case TypesPackage.PACKAGE__CONTAINER_PACKAGE:
				return basicSetContainerPackage(null, msgs);
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
			case TypesPackage.PACKAGE__NAME:
				return getName();
			case TypesPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case TypesPackage.PACKAGE__CONTAINED_CLASSES:
				return getContainedClasses();
			case TypesPackage.PACKAGE__ENUMERATED_TYPES:
				return getEnumeratedTypes();
			case TypesPackage.PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case TypesPackage.PACKAGE__CONTAINER_PACKAGE:
				if (resolve) return getContainerPackage();
				return basicGetContainerPackage();
			case TypesPackage.PACKAGE__OVERALL:
				return isOverall();
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
			case TypesPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TypesPackage.PACKAGE__CONTAINED_CLASSES:
				getContainedClasses().clear();
				getContainedClasses().addAll((Collection<? extends conml.types.Class>)newValue);
				return;
			case TypesPackage.PACKAGE__ENUMERATED_TYPES:
				getEnumeratedTypes().clear();
				getEnumeratedTypes().addAll((Collection<? extends EnumeratedType>)newValue);
				return;
			case TypesPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends conml.types.Package>)newValue);
				return;
			case TypesPackage.PACKAGE__CONTAINER_PACKAGE:
				setContainerPackage((conml.types.Package)newValue);
				return;
			case TypesPackage.PACKAGE__OVERALL:
				setOverall((Boolean)newValue);
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
			case TypesPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesPackage.PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TypesPackage.PACKAGE__CONTAINED_CLASSES:
				getContainedClasses().clear();
				return;
			case TypesPackage.PACKAGE__ENUMERATED_TYPES:
				getEnumeratedTypes().clear();
				return;
			case TypesPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case TypesPackage.PACKAGE__CONTAINER_PACKAGE:
				setContainerPackage((conml.types.Package)null);
				return;
			case TypesPackage.PACKAGE__OVERALL:
				setOverall(OVERALL_EDEFAULT);
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
			case TypesPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesPackage.PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TypesPackage.PACKAGE__CONTAINED_CLASSES:
				return containedClasses != null && !containedClasses.isEmpty();
			case TypesPackage.PACKAGE__ENUMERATED_TYPES:
				return enumeratedTypes != null && !enumeratedTypes.isEmpty();
			case TypesPackage.PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case TypesPackage.PACKAGE__CONTAINER_PACKAGE:
				return containerPackage != null;
			case TypesPackage.PACKAGE__OVERALL:
				return overall != OVERALL_EDEFAULT;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.PACKAGE__NAME: return conmlPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.PACKAGE__DESCRIPTION: return conmlPackage.DESCRIBABLE_ELEMENT__DESCRIPTION;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.NAMED_ELEMENT__NAME: return TypesPackage.PACKAGE__NAME;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.DESCRIBABLE_ELEMENT__DESCRIPTION: return TypesPackage.PACKAGE__DESCRIPTION;
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
		result.append(", overall: ");
		result.append(overall);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
