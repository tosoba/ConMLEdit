/**
 */
package conml.types.impl;

import conml.instances.InstancesPackage;
import conml.instances.ValueSet;

import conml.types.Attribute;
import conml.types.DataType;
import conml.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.AttributeImpl#isMultilingual <em>Multilingual</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getInstanceValueSets <em>Instance Value Sets</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getRedefinedAttribute <em>Redefined Attribute</em>}</li>
 *   <li>{@link conml.types.impl.AttributeImpl#getRedefiningAttribute <em>Redefining Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * The default value of the '{@link #isMultilingual() <em>Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultilingual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTILINGUAL_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMultilingual() <em>Multilingual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultilingual()
	 * @generated
	 * @ordered
	 */
	protected boolean multilingual = MULTILINGUAL_EDEFAULT;

  /**
	 * The cached value of the '{@link #getInstanceValueSets() <em>Instance Value Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> instanceValueSets;

    /**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

  /**
	 * The cached value of the '{@link #getRedefinedAttribute() <em>Redefined Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute redefinedAttribute;

    /**
	 * The cached value of the '{@link #getRedefiningAttribute() <em>Redefining Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefiningAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute redefiningAttribute;

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultilingual() {
		return multilingual;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultilingual(boolean newMultilingual) {
		boolean oldMultilingual = multilingual;
		multilingual = newMultilingual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__MULTILINGUAL, oldMultilingual, multilingual));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSet> getInstanceValueSets() {
		if (instanceValueSets == null) {
			instanceValueSets = new EObjectWithInverseResolvingEList<ValueSet>(ValueSet.class, this, TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS, InstancesPackage.VALUE_SET__INSTANCED_ATTRIBUTE);
		}
		return instanceValueSets;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (DataType)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ATTRIBUTE__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		return datatype;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__DATATYPE, oldDatatype, datatype));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getRedefinedAttribute() {
		if (redefinedAttribute != null && redefinedAttribute.eIsProxy()) {
			InternalEObject oldRedefinedAttribute = (InternalEObject)redefinedAttribute;
			redefinedAttribute = (Attribute)eResolveProxy(oldRedefinedAttribute);
			if (redefinedAttribute != oldRedefinedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE, oldRedefinedAttribute, redefinedAttribute));
			}
		}
		return redefinedAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRedefinedAttribute() {
		return redefinedAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinedAttribute(Attribute newRedefinedAttribute, NotificationChain msgs) {
		Attribute oldRedefinedAttribute = redefinedAttribute;
		redefinedAttribute = newRedefinedAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE, oldRedefinedAttribute, newRedefinedAttribute);
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
	public void setRedefinedAttribute(Attribute newRedefinedAttribute) {
		if (newRedefinedAttribute != redefinedAttribute) {
			NotificationChain msgs = null;
			if (redefinedAttribute != null)
				msgs = ((InternalEObject)redefinedAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE, Attribute.class, msgs);
			if (newRedefinedAttribute != null)
				msgs = ((InternalEObject)newRedefinedAttribute).eInverseAdd(this, TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE, Attribute.class, msgs);
			msgs = basicSetRedefinedAttribute(newRedefinedAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE, newRedefinedAttribute, newRedefinedAttribute));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getRedefiningAttribute() {
		if (redefiningAttribute != null && redefiningAttribute.eIsProxy()) {
			InternalEObject oldRedefiningAttribute = (InternalEObject)redefiningAttribute;
			redefiningAttribute = (Attribute)eResolveProxy(oldRedefiningAttribute);
			if (redefiningAttribute != oldRedefiningAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE, oldRedefiningAttribute, redefiningAttribute));
			}
		}
		return redefiningAttribute;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRedefiningAttribute() {
		return redefiningAttribute;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefiningAttribute(Attribute newRedefiningAttribute, NotificationChain msgs) {
		Attribute oldRedefiningAttribute = redefiningAttribute;
		redefiningAttribute = newRedefiningAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE, oldRedefiningAttribute, newRedefiningAttribute);
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
	public void setRedefiningAttribute(Attribute newRedefiningAttribute) {
		if (newRedefiningAttribute != redefiningAttribute) {
			NotificationChain msgs = null;
			if (redefiningAttribute != null)
				msgs = ((InternalEObject)redefiningAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE, Attribute.class, msgs);
			if (newRedefiningAttribute != null)
				msgs = ((InternalEObject)newRedefiningAttribute).eInverseAdd(this, TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE, Attribute.class, msgs);
			msgs = basicSetRedefiningAttribute(newRedefiningAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE, newRedefiningAttribute, newRedefiningAttribute));
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getOwnerClass() {
		if (eContainerFeatureID() != TypesPackage.ATTRIBUTE__OWNER_CLASS) return null;
		return (conml.types.Class)eInternalContainer();
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(conml.types.Class newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, TypesPackage.ATTRIBUTE__OWNER_CLASS, msgs);
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerClass(conml.types.Class newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID() != TypesPackage.ATTRIBUTE__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, TypesPackage.CLASS__ATTRIBUTES, conml.types.Class.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATTRIBUTE__OWNER_CLASS, newOwnerClass, newOwnerClass));
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
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstanceValueSets()).basicAdd(otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerClass((conml.types.Class)otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE:
				if (redefinedAttribute != null)
					msgs = ((InternalEObject)redefinedAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE, Attribute.class, msgs);
				return basicSetRedefinedAttribute((Attribute)otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE:
				if (redefiningAttribute != null)
					msgs = ((InternalEObject)redefiningAttribute).eInverseRemove(this, TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE, Attribute.class, msgs);
				return basicSetRedefiningAttribute((Attribute)otherEnd, msgs);
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
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return ((InternalEList<?>)getInstanceValueSets()).basicRemove(otherEnd, msgs);
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
			case TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE:
				return basicSetRedefinedAttribute(null, msgs);
			case TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE:
				return basicSetRedefiningAttribute(null, msgs);
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
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, TypesPackage.CLASS__ATTRIBUTES, conml.types.Class.class, msgs);
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				return isMultilingual();
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return getInstanceValueSets();
			case TypesPackage.ATTRIBUTE__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				return getOwnerClass();
			case TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE:
				if (resolve) return getRedefinedAttribute();
				return basicGetRedefinedAttribute();
			case TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE:
				if (resolve) return getRedefiningAttribute();
				return basicGetRedefiningAttribute();
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				setMultilingual((Boolean)newValue);
				return;
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				getInstanceValueSets().clear();
				getInstanceValueSets().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case TypesPackage.ATTRIBUTE__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				setOwnerClass((conml.types.Class)newValue);
				return;
			case TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE:
				setRedefinedAttribute((Attribute)newValue);
				return;
			case TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE:
				setRedefiningAttribute((Attribute)newValue);
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				setMultilingual(MULTILINGUAL_EDEFAULT);
				return;
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				getInstanceValueSets().clear();
				return;
			case TypesPackage.ATTRIBUTE__DATATYPE:
				setDatatype((DataType)null);
				return;
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				setOwnerClass((conml.types.Class)null);
				return;
			case TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE:
				setRedefinedAttribute((Attribute)null);
				return;
			case TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE:
				setRedefiningAttribute((Attribute)null);
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
			case TypesPackage.ATTRIBUTE__MULTILINGUAL:
				return multilingual != MULTILINGUAL_EDEFAULT;
			case TypesPackage.ATTRIBUTE__INSTANCE_VALUE_SETS:
				return instanceValueSets != null && !instanceValueSets.isEmpty();
			case TypesPackage.ATTRIBUTE__DATATYPE:
				return datatype != null;
			case TypesPackage.ATTRIBUTE__OWNER_CLASS:
				return getOwnerClass() != null;
			case TypesPackage.ATTRIBUTE__REDEFINED_ATTRIBUTE:
				return redefinedAttribute != null;
			case TypesPackage.ATTRIBUTE__REDEFINING_ATTRIBUTE:
				return redefiningAttribute != null;
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
		result.append(" (multilingual: ");
		result.append(multilingual);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
