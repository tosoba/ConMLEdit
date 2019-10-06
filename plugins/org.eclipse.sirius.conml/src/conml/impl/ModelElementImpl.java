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
 *   <li>{@link conml.impl.ModelElementImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link conml.impl.ModelElementImpl#getDocumentingObjects <em>Documenting Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ModelPartImpl implements ModelElement {
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
	 * The cached value of the '{@link #getDocumentingObjects() <em>Documenting Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentingObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<conml.instances.Object> documentingObjects;

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
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, conmlPackage.MODEL_ELEMENT__TAGS);
		}
		return tags;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<conml.instances.Object> getDocumentingObjects() {
		if (documentingObjects == null) {
			documentingObjects = new EObjectResolvingEList<conml.instances.Object>(conml.instances.Object.class, this, conmlPackage.MODEL_ELEMENT__DOCUMENTING_OBJECTS);
		}
		return documentingObjects;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case conmlPackage.MODEL_ELEMENT__TAGS:
				return getTags();
			case conmlPackage.MODEL_ELEMENT__DOCUMENTING_OBJECTS:
				return getDocumentingObjects();
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case conmlPackage.MODEL_ELEMENT__DOCUMENTING_OBJECTS:
				getDocumentingObjects().clear();
				getDocumentingObjects().addAll((Collection<? extends conml.instances.Object>)newValue);
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				getTags().clear();
				return;
			case conmlPackage.MODEL_ELEMENT__DOCUMENTING_OBJECTS:
				getDocumentingObjects().clear();
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
			case conmlPackage.MODEL_ELEMENT__TAGS:
				return tags != null && !tags.isEmpty();
			case conmlPackage.MODEL_ELEMENT__DOCUMENTING_OBJECTS:
				return documentingObjects != null && !documentingObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
