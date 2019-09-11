/**
 */
package conml.types.impl;

import conml.types.EnumeratedType;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link conml.types.impl.PackageImpl#getContainsClass <em>Contains Class</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getContainsEnumeratedType <em>Contains Enumerated Type</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getIsOwnerOf <em>Is Owner Of</em>}</li>
 *   <li>{@link conml.types.impl.PackageImpl#getIsSubPackageOf <em>Is Sub Package Of</em>}</li>
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
	 * The cached value of the '{@link #getContainsClass() <em>Contains Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsClass()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Class> containsClass;

	/**
	 * The cached value of the '{@link #getContainsEnumeratedType() <em>Contains Enumerated Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsEnumeratedType()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedType> containsEnumeratedType;

	/**
	 * The cached value of the '{@link #getIsOwnerOf() <em>Is Owner Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOwnerOf()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Package> isOwnerOf;

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
	public EList<conml.types.Class> getContainsClass() {
		if (containsClass == null) {
			containsClass = new EObjectWithInverseResolvingEList<conml.types.Class>(conml.types.Class.class, this, TypesPackage.PACKAGE__CONTAINS_CLASS, TypesPackage.CLASS__BELONGS_TO_PACKAGE);
		}
		return containsClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedType> getContainsEnumeratedType() {
		if (containsEnumeratedType == null) {
			containsEnumeratedType = new EObjectWithInverseResolvingEList<EnumeratedType>(EnumeratedType.class, this, TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE, TypesPackage.ENUMERATED_TYPE__BELONGS_TO_PACKAGE);
		}
		return containsEnumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.types.Package> getIsOwnerOf() {
		if (isOwnerOf == null) {
			isOwnerOf = new EObjectContainmentWithInverseEList<conml.types.Package>(conml.types.Package.class, this, TypesPackage.PACKAGE__IS_OWNER_OF, TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF);
		}
		return isOwnerOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Package getIsSubPackageOf() {
		if (eContainerFeatureID() != TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF) return null;
		return (conml.types.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSubPackageOf(conml.types.Package newIsSubPackageOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsSubPackageOf, TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSubPackageOf(conml.types.Package newIsSubPackageOf) {
		if (newIsSubPackageOf != eInternalContainer() || (eContainerFeatureID() != TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF && newIsSubPackageOf != null)) {
			if (EcoreUtil.isAncestor(this, newIsSubPackageOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsSubPackageOf != null)
				msgs = ((InternalEObject)newIsSubPackageOf).eInverseAdd(this, TypesPackage.PACKAGE__IS_OWNER_OF, conml.types.Package.class, msgs);
			msgs = basicSetIsSubPackageOf(newIsSubPackageOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF, newIsSubPackageOf, newIsSubPackageOf));
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
			case TypesPackage.PACKAGE__CONTAINS_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsClass()).basicAdd(otherEnd, msgs);
			case TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsEnumeratedType()).basicAdd(otherEnd, msgs);
			case TypesPackage.PACKAGE__IS_OWNER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOwnerOf()).basicAdd(otherEnd, msgs);
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsSubPackageOf((conml.types.Package)otherEnd, msgs);
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
			case TypesPackage.PACKAGE__CONTAINS_CLASS:
				return ((InternalEList<?>)getContainsClass()).basicRemove(otherEnd, msgs);
			case TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE:
				return ((InternalEList<?>)getContainsEnumeratedType()).basicRemove(otherEnd, msgs);
			case TypesPackage.PACKAGE__IS_OWNER_OF:
				return ((InternalEList<?>)getIsOwnerOf()).basicRemove(otherEnd, msgs);
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				return basicSetIsSubPackageOf(null, msgs);
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
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				return eInternalContainer().eInverseRemove(this, TypesPackage.PACKAGE__IS_OWNER_OF, conml.types.Package.class, msgs);
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
			case TypesPackage.PACKAGE__NAME:
				return getName();
			case TypesPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case TypesPackage.PACKAGE__CONTAINS_CLASS:
				return getContainsClass();
			case TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE:
				return getContainsEnumeratedType();
			case TypesPackage.PACKAGE__IS_OWNER_OF:
				return getIsOwnerOf();
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				return getIsSubPackageOf();
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
			case TypesPackage.PACKAGE__CONTAINS_CLASS:
				getContainsClass().clear();
				getContainsClass().addAll((Collection<? extends conml.types.Class>)newValue);
				return;
			case TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE:
				getContainsEnumeratedType().clear();
				getContainsEnumeratedType().addAll((Collection<? extends EnumeratedType>)newValue);
				return;
			case TypesPackage.PACKAGE__IS_OWNER_OF:
				getIsOwnerOf().clear();
				getIsOwnerOf().addAll((Collection<? extends conml.types.Package>)newValue);
				return;
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				setIsSubPackageOf((conml.types.Package)newValue);
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
			case TypesPackage.PACKAGE__CONTAINS_CLASS:
				getContainsClass().clear();
				return;
			case TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE:
				getContainsEnumeratedType().clear();
				return;
			case TypesPackage.PACKAGE__IS_OWNER_OF:
				getIsOwnerOf().clear();
				return;
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				setIsSubPackageOf((conml.types.Package)null);
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
			case TypesPackage.PACKAGE__CONTAINS_CLASS:
				return containsClass != null && !containsClass.isEmpty();
			case TypesPackage.PACKAGE__CONTAINS_ENUMERATED_TYPE:
				return containsEnumeratedType != null && !containsEnumeratedType.isEmpty();
			case TypesPackage.PACKAGE__IS_OWNER_OF:
				return isOwnerOf != null && !isOwnerOf.isEmpty();
			case TypesPackage.PACKAGE__IS_SUB_PACKAGE_OF:
				return getIsSubPackageOf() != null;
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
		result.append(')');
		return result.toString();
	}

} //PackageImpl
