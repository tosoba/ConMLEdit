/**
 */
package conml.impl;

import conml.ModelElement;
import conml.Tag;
import conml.conmlPackage;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conml.impl.ModelElementImpl#getTaggedWith <em>Tagged With</em>}</li>
 *   <li>{@link conml.impl.ModelElementImpl#getDocumentedBy <em>Documented By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ModelPartImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getTaggedWith() <em>Tagged With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> taggedWith;

	/**
	 * The cached value of the '{@link #getDocumentedBy() <em>Documented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> documentedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTaggedWith() {
		if (taggedWith == null) {
			taggedWith = new EObjectResolvingEList<Tag>(Tag.class, this, conmlPackage.MODEL_ELEMENT__TAGGED_WITH);
		}
		return taggedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getDocumentedBy() {
		if (documentedBy == null) {
			documentedBy = new EObjectResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, conmlPackage.MODEL_ELEMENT__DOCUMENTED_BY);
		}
		return documentedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case conmlPackage.MODEL_ELEMENT__TAGGED_WITH:
				return getTaggedWith();
			case conmlPackage.MODEL_ELEMENT__DOCUMENTED_BY:
				return getDocumentedBy();
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
			case conmlPackage.MODEL_ELEMENT__TAGGED_WITH:
				getTaggedWith().clear();
				getTaggedWith().addAll((Collection<? extends Tag>)newValue);
				return;
			case conmlPackage.MODEL_ELEMENT__DOCUMENTED_BY:
				getDocumentedBy().clear();
				getDocumentedBy().addAll((Collection<? extends conml.instances.Object>)newValue);
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
			case conmlPackage.MODEL_ELEMENT__TAGGED_WITH:
				getTaggedWith().clear();
				return;
			case conmlPackage.MODEL_ELEMENT__DOCUMENTED_BY:
				getDocumentedBy().clear();
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
			case conmlPackage.MODEL_ELEMENT__TAGGED_WITH:
				return taggedWith != null && !taggedWith.isEmpty();
			case conmlPackage.MODEL_ELEMENT__DOCUMENTED_BY:
				return documentedBy != null && !documentedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
