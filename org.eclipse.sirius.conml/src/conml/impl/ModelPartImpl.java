/**
 */
package conml.impl;

import conml.ModelPart;
import conml.conmlPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModelPartImpl extends MinimalEObjectImpl.Container implements ModelPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return conmlPackage.Literals.MODEL_PART;
	}

} //ModelPartImpl
