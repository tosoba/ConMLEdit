/**
 */
package conml.types.tests;

import conml.types.EnumeratedType;
import conml.types.TypesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumeratedTypeTest extends TestCase {

	/**
	 * The fixture for this Enumerated Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumeratedTypeTest.class);
	}

	/**
	 * Constructs a new Enumerated Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enumerated Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EnumeratedType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enumerated Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createEnumeratedType());
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

} //EnumeratedTypeTest
