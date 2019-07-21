/**
 */
package conml.types.impl;

import conml.types.Generalization;
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
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.types.impl.GeneralizationImpl#getDiscriminant <em>Discriminant</em>}</li>
 *   <li>{@link conml.types.impl.GeneralizationImpl#getSpecializedClass <em>Specialized Class</em>}</li>
 *   <li>{@link conml.types.impl.GeneralizationImpl#getGeneralizedClass <em>Generalized Class</em>}</li>
 *   <li>{@link conml.types.impl.GeneralizationImpl#getDominatesInheritanceOn <em>Dominates Inheritance On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends TypeModelElementImpl implements Generalization {
	/**
	 * The default value of the '{@link #getDiscriminant() <em>Discriminant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminant()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminant() <em>Discriminant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminant()
	 * @generated
	 * @ordered
	 */
	protected String discriminant = DISCRIMINANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializedClass() <em>Specialized Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedClass()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Class> specializedClass;

	/**
	 * The cached value of the '{@link #getGeneralizedClass() <em>Generalized Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizedClass()
	 * @generated
	 * @ordered
	 */
	protected conml.types.Class generalizedClass;

	/**
	 * The cached value of the '{@link #getDominatesInheritanceOn() <em>Dominates Inheritance On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominatesInheritanceOn()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.types.Class> dominatesInheritanceOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscriminant() {
		return discriminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminant(String newDiscriminant) {
		String oldDiscriminant = discriminant;
		discriminant = newDiscriminant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.GENERALIZATION__DISCRIMINANT, oldDiscriminant, discriminant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.types.Class> getSpecializedClass() {
		if (specializedClass == null) {
			specializedClass = new EObjectWithInverseResolvingEList.ManyInverse<conml.types.Class>(conml.types.Class.class, this, TypesPackage.GENERALIZATION__SPECIALIZED_CLASS, TypesPackage.CLASS__GENERALIZATION);
		}
		return specializedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public conml.types.Class getGeneralizedClass() {
		if (generalizedClass != null && generalizedClass.eIsProxy()) {
			InternalEObject oldGeneralizedClass = (InternalEObject)generalizedClass;
			generalizedClass = (conml.types.Class)eResolveProxy(oldGeneralizedClass);
			if (generalizedClass != oldGeneralizedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.GENERALIZATION__GENERALIZED_CLASS, oldGeneralizedClass, generalizedClass));
			}
		}
		return generalizedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conml.types.Class basicGetGeneralizedClass() {
		return generalizedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralizedClass(conml.types.Class newGeneralizedClass, NotificationChain msgs) {
		conml.types.Class oldGeneralizedClass = generalizedClass;
		generalizedClass = newGeneralizedClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.GENERALIZATION__GENERALIZED_CLASS, oldGeneralizedClass, newGeneralizedClass);
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
	public void setGeneralizedClass(conml.types.Class newGeneralizedClass) {
		if (newGeneralizedClass != generalizedClass) {
			NotificationChain msgs = null;
			if (generalizedClass != null)
				msgs = ((InternalEObject)generalizedClass).eInverseRemove(this, TypesPackage.CLASS__SPECIALIZATION, conml.types.Class.class, msgs);
			if (newGeneralizedClass != null)
				msgs = ((InternalEObject)newGeneralizedClass).eInverseAdd(this, TypesPackage.CLASS__SPECIALIZATION, conml.types.Class.class, msgs);
			msgs = basicSetGeneralizedClass(newGeneralizedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.GENERALIZATION__GENERALIZED_CLASS, newGeneralizedClass, newGeneralizedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.types.Class> getDominatesInheritanceOn() {
		if (dominatesInheritanceOn == null) {
			dominatesInheritanceOn = new EObjectWithInverseResolvingEList<conml.types.Class>(conml.types.Class.class, this, TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON, TypesPackage.CLASS__DOMINANT_GENERALIZATION);
		}
		return dominatesInheritanceOn;
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
			case TypesPackage.GENERALIZATION__SPECIALIZED_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializedClass()).basicAdd(otherEnd, msgs);
			case TypesPackage.GENERALIZATION__GENERALIZED_CLASS:
				if (generalizedClass != null)
					msgs = ((InternalEObject)generalizedClass).eInverseRemove(this, TypesPackage.CLASS__SPECIALIZATION, conml.types.Class.class, msgs);
				return basicSetGeneralizedClass((conml.types.Class)otherEnd, msgs);
			case TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDominatesInheritanceOn()).basicAdd(otherEnd, msgs);
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
			case TypesPackage.GENERALIZATION__SPECIALIZED_CLASS:
				return ((InternalEList<?>)getSpecializedClass()).basicRemove(otherEnd, msgs);
			case TypesPackage.GENERALIZATION__GENERALIZED_CLASS:
				return basicSetGeneralizedClass(null, msgs);
			case TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON:
				return ((InternalEList<?>)getDominatesInheritanceOn()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.GENERALIZATION__DISCRIMINANT:
				return getDiscriminant();
			case TypesPackage.GENERALIZATION__SPECIALIZED_CLASS:
				return getSpecializedClass();
			case TypesPackage.GENERALIZATION__GENERALIZED_CLASS:
				if (resolve) return getGeneralizedClass();
				return basicGetGeneralizedClass();
			case TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON:
				return getDominatesInheritanceOn();
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
			case TypesPackage.GENERALIZATION__DISCRIMINANT:
				setDiscriminant((String)newValue);
				return;
			case TypesPackage.GENERALIZATION__SPECIALIZED_CLASS:
				getSpecializedClass().clear();
				getSpecializedClass().addAll((Collection<? extends conml.types.Class>)newValue);
				return;
			case TypesPackage.GENERALIZATION__GENERALIZED_CLASS:
				setGeneralizedClass((conml.types.Class)newValue);
				return;
			case TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON:
				getDominatesInheritanceOn().clear();
				getDominatesInheritanceOn().addAll((Collection<? extends conml.types.Class>)newValue);
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
			case TypesPackage.GENERALIZATION__DISCRIMINANT:
				setDiscriminant(DISCRIMINANT_EDEFAULT);
				return;
			case TypesPackage.GENERALIZATION__SPECIALIZED_CLASS:
				getSpecializedClass().clear();
				return;
			case TypesPackage.GENERALIZATION__GENERALIZED_CLASS:
				setGeneralizedClass((conml.types.Class)null);
				return;
			case TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON:
				getDominatesInheritanceOn().clear();
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
			case TypesPackage.GENERALIZATION__DISCRIMINANT:
				return DISCRIMINANT_EDEFAULT == null ? discriminant != null : !DISCRIMINANT_EDEFAULT.equals(discriminant);
			case TypesPackage.GENERALIZATION__SPECIALIZED_CLASS:
				return specializedClass != null && !specializedClass.isEmpty();
			case TypesPackage.GENERALIZATION__GENERALIZED_CLASS:
				return generalizedClass != null;
			case TypesPackage.GENERALIZATION__DOMINATES_INHERITANCE_ON:
				return dominatesInheritanceOn != null && !dominatesInheritanceOn.isEmpty();
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
		result.append(" (discriminant: ");
		result.append(discriminant);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
