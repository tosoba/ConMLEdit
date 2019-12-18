/**
 */
package conml.instances.impl;

import conml.instances.EnumValue;
import conml.instances.InstancesPackage;

import conml.types.EnumeratedItem;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnumValueImpl extends ValueImpl<EnumeratedItem> implements EnumValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancesPackage.Literals.ENUM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setContents(EnumeratedItem newContents) {
		super.setContents(newContents);
	}

} //EnumValueImpl
