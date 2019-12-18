/**
 */
package conml.instances.impl;

import conml.instances.BoolValue;
import conml.instances.InstancesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoolValueImpl extends ValueImpl<Boolean> implements BoolValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.BOOL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setContents(Boolean newContents) {
		super.setContents(newContents);
	}

} //BoolValueImpl
