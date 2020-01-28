/**
 */
package conml.types.impl;

import conml.DefinableElement;
import conml.ModelElement;
import conml.ModelPart;
import conml.NamedElement;
import conml.Tag;
import conml.conmlPackage;
import conml.instances.InstancesPackage;
import conml.types.DataType;
import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
import conml.types.Type;
import conml.types.TypeModel;
import conml.types.TypeModelElement;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getMetaInformationObjects <em>Meta Information Objects</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getTypeModel <em>Type Model</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getOwnedItems <em>Owned Items</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link conml.types.impl.EnumeratedTypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedTypeImpl extends MinimalEObjectImpl.Container implements EnumeratedType {
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

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
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
        * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
protected EList<Tag> tags;

        /**
	 * The cached value of the '{@link #getMetaInformationObjects() <em>Meta Information Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @see #getMetaInformationObjects()
	 * @generated
	 * @ordered
	 */
protected EList<conml.instances.Object> metaInformationObjects;

        /**
	 * The cached value of the '{@link #getTypeModel() <em>Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @see #getTypeModel()
	 * @generated
	 * @ordered
	 */
protected TypeModel typeModel;

    /**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

    /**
	 * The cached value of the '{@link #getOwnedItems() <em>Owned Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedItem> ownedItems;

  /**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumeratedType> subTypes;

  /**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedType superType;

    /**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Package package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__COMMENTS, oldComments, comments));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, TypesPackage.ENUMERATED_TYPE__TAGS);
		}
		return tags;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getMetaInformationObjects() {
		if (metaInformationObjects == null) {
			metaInformationObjects = new EObjectWithInverseResolvingEList.ManyInverse<conml.instances.Object>(conml.instances.Object.class, this, TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS, InstancesPackage.OBJECT__DOCUMENTED_ELEMENTS);
		}
		return metaInformationObjects;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeModel getTypeModel() {
		if (typeModel != null && typeModel.eIsProxy()) {
			InternalEObject oldTypeModel = (InternalEObject)typeModel;
			typeModel = (TypeModel)eResolveProxy(oldTypeModel);
			if (typeModel != oldTypeModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__TYPE_MODEL, oldTypeModel, typeModel));
			}
		}
		return typeModel;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModel basicGetTypeModel() {
		return typeModel;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeModel(TypeModel newTypeModel, NotificationChain msgs) {
		TypeModel oldTypeModel = typeModel;
		typeModel = newTypeModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__TYPE_MODEL, oldTypeModel, newTypeModel);
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
	public void setTypeModel(TypeModel newTypeModel) {
		if (newTypeModel != typeModel) {
			NotificationChain msgs = null;
			if (typeModel != null)
				msgs = ((InternalEObject)typeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__ELEMENTS, TypeModel.class, msgs);
			if (newTypeModel != null)
				msgs = ((InternalEObject)newTypeModel).eInverseAdd(this, TypesPackage.TYPE_MODEL__ELEMENTS, TypeModel.class, msgs);
			msgs = basicSetTypeModel(newTypeModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__TYPE_MODEL, newTypeModel, newTypeModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinition() {
		return definition;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__DEFINITION, oldDefinition, definition));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedItem> getOwnedItems() {
		if (ownedItems == null) {
			ownedItems = new EObjectContainmentWithInverseEList<EnumeratedItem>(EnumeratedItem.class, this, TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS, TypesPackage.ENUMERATED_ITEM__OWNER_TYPE);
		}
		return ownedItems;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumeratedType> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectWithInverseResolvingEList<EnumeratedType>(EnumeratedType.class, this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE);
		}
		return subTypes;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (EnumeratedType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedType basicGetSuperType() {
		return superType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperType(EnumeratedType newSuperType, NotificationChain msgs) {
		EnumeratedType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE, oldSuperType, newSuperType);
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
	public void setSuperType(EnumeratedType newSuperType) {
		if (newSuperType != superType) {
			NotificationChain msgs = null;
			if (superType != null)
				msgs = ((InternalEObject)superType).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, EnumeratedType.class, msgs);
			if (newSuperType != null)
				msgs = ((InternalEObject)newSuperType).eInverseAdd(this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, EnumeratedType.class, msgs);
			msgs = basicSetSuperType(newSuperType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__SUPER_TYPE, newSuperType, newSuperType));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (conml.types.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(conml.types.Package newPackage, NotificationChain msgs) {
		conml.types.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__PACKAGE, oldPackage, newPackage);
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
	public void setPackage(conml.types.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, TypesPackage.PACKAGE__ENUMERATED_TYPES, conml.types.Package.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypesPackage.PACKAGE__ENUMERATED_TYPES, conml.types.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE__PACKAGE, newPackage, newPackage));
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
			case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaInformationObjects()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL:
				if (typeModel != null)
					msgs = ((InternalEObject)typeModel).eInverseRemove(this, TypesPackage.TYPE_MODEL__ELEMENTS, TypeModel.class, msgs);
				return basicSetTypeModel((TypeModel)otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedItems()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				if (superType != null)
					msgs = ((InternalEObject)superType).eInverseRemove(this, TypesPackage.ENUMERATED_TYPE__SUB_TYPES, EnumeratedType.class, msgs);
				return basicSetSuperType((EnumeratedType)otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, TypesPackage.PACKAGE__ENUMERATED_TYPES, conml.types.Package.class, msgs);
				return basicSetPackage((conml.types.Package)otherEnd, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS:
				return ((InternalEList<?>)getMetaInformationObjects()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL:
				return basicSetTypeModel(null, msgs);
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return ((InternalEList<?>)getOwnedItems()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				return basicSetSuperType(null, msgs);
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case TypesPackage.ENUMERATED_TYPE__COMMENTS:
				return getComments();
			case TypesPackage.ENUMERATED_TYPE__NAME:
				return getName();
			case TypesPackage.ENUMERATED_TYPE__TAGS:
				return getTags();
			case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS:
				return getMetaInformationObjects();
			case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL:
				if (resolve) return getTypeModel();
				return basicGetTypeModel();
			case TypesPackage.ENUMERATED_TYPE__DEFINITION:
				return getDefinition();
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return getOwnedItems();
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return getSubTypes();
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case TypesPackage.ENUMERATED_TYPE__COMMENTS:
				setComments((String)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS:
				getMetaInformationObjects().clear();
				getMetaInformationObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL:
				setTypeModel((TypeModel)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__DEFINITION:
				setDefinition((String)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				getOwnedItems().clear();
				getOwnedItems().addAll((Collection<? extends EnumeratedItem>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends EnumeratedType>)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				setSuperType((EnumeratedType)newValue);
				return;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				setPackage((conml.types.Package)newValue);
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
			case TypesPackage.ENUMERATED_TYPE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_TYPE__TAGS:
				getTags().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS:
				getMetaInformationObjects().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL:
				setTypeModel((TypeModel)null);
				return;
			case TypesPackage.ENUMERATED_TYPE__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				getOwnedItems().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				getSubTypes().clear();
				return;
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				setSuperType((EnumeratedType)null);
				return;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				setPackage((conml.types.Package)null);
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
			case TypesPackage.ENUMERATED_TYPE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TypesPackage.ENUMERATED_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesPackage.ENUMERATED_TYPE__TAGS:
				return tags != null && !tags.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS:
				return metaInformationObjects != null && !metaInformationObjects.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL:
				return typeModel != null;
			case TypesPackage.ENUMERATED_TYPE__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case TypesPackage.ENUMERATED_TYPE__OWNED_ITEMS:
				return ownedItems != null && !ownedItems.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case TypesPackage.ENUMERATED_TYPE__SUPER_TYPE:
				return superType != null;
			case TypesPackage.ENUMERATED_TYPE__PACKAGE:
				return package_ != null;
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
		if (baseClass == ModelPart.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.ENUMERATED_TYPE__NAME: return conmlPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.ENUMERATED_TYPE__TAGS: return conmlPackage.MODEL_ELEMENT__TAGS;
				case TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS: return conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == TypeModelElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.ENUMERATED_TYPE__TYPE_MODEL: return TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL;
				default: return -1;
			}
		}
		if (baseClass == DefinableElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.ENUMERATED_TYPE__DEFINITION: return conmlPackage.DEFINABLE_ELEMENT__DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ModelPart.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.NAMED_ELEMENT__NAME: return TypesPackage.ENUMERATED_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.MODEL_ELEMENT__TAGS: return TypesPackage.ENUMERATED_TYPE__TAGS;
				case conmlPackage.MODEL_ELEMENT__META_INFORMATION_OBJECTS: return TypesPackage.ENUMERATED_TYPE__META_INFORMATION_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == TypeModelElement.class) {
			switch (baseFeatureID) {
				case TypesPackage.TYPE_MODEL_ELEMENT__TYPE_MODEL: return TypesPackage.ENUMERATED_TYPE__TYPE_MODEL;
				default: return -1;
			}
		}
		if (baseClass == DefinableElement.class) {
			switch (baseFeatureID) {
				case conmlPackage.DEFINABLE_ELEMENT__DEFINITION: return TypesPackage.ENUMERATED_TYPE__DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
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
		result.append(" (comments: ");
		result.append(comments);
		result.append(", name: ");
		result.append(name);
		result.append(", definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //EnumeratedTypeImpl
