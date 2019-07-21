/**
 */
package conml.instances.tests;

import conml.instances.InstanceModel;
import conml.instances.InstancesFactory;

import conml.tests.ModelTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceModelTest extends ModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstanceModelTest.class);
	}

	/**
	 * Constructs a new Instance Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instance Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InstanceModel getFixture() {
		return (InstanceModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstancesFactory.eINSTANCE.createInstanceModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InstanceModelTest
