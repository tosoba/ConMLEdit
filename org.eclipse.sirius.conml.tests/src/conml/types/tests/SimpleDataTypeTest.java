/**
 */
package conml.types.tests;

import conml.types.SimpleDataType;
import conml.types.TypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleDataTypeTest extends DataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleDataTypeTest.class);
	}

	/**
	 * Constructs a new Simple Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleDataType getFixture() {
		return (SimpleDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createSimpleDataType());
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

} //SimpleDataTypeTest
