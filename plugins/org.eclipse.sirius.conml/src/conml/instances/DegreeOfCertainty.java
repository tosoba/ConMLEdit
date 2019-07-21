/**
 */
package conml.instances;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Degree Of Certainty</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conml.instances.InstancesPackage#getDegreeOfCertainty()
 * @model
 * @generated
 */
public enum DegreeOfCertainty implements Enumerator {
	/**
	 * The '<em><b>Certain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CERTAIN(0, "Certain", "Certain"),

	/**
	 * The '<em><b>Probable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABLE(1, "Probable", "Probable"),

	/**
	 * The '<em><b>Possible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	POSSIBLE(2, "Possible", "Possible"),

	/**
	 * The '<em><b>Improbable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROBABLE(3, "Improbable", "Improbable"),

	/**
	 * The '<em><b>Impossible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPOSSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPOSSIBLE(4, "Impossible", "Impossible");

	/**
	 * The '<em><b>Certain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTAIN
	 * @model name="Certain"
	 * @generated
	 * @ordered
	 */
	public static final int CERTAIN_VALUE = 0;

	/**
	 * The '<em><b>Probable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE
	 * @model name="Probable"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABLE_VALUE = 1;

	/**
	 * The '<em><b>Possible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSSIBLE
	 * @model name="Possible"
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE = 2;

	/**
	 * The '<em><b>Improbable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE
	 * @model name="Improbable"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROBABLE_VALUE = 3;

	/**
	 * The '<em><b>Impossible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPOSSIBLE
	 * @model name="Impossible"
	 * @generated
	 * @ordered
	 */
	public static final int IMPOSSIBLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Degree Of Certainty</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DegreeOfCertainty[] VALUES_ARRAY =
		new DegreeOfCertainty[] {
			CERTAIN,
			PROBABLE,
			POSSIBLE,
			IMPROBABLE,
			IMPOSSIBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Degree Of Certainty</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DegreeOfCertainty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Degree Of Certainty</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeOfCertainty get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DegreeOfCertainty result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Degree Of Certainty</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeOfCertainty getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DegreeOfCertainty result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Degree Of Certainty</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeOfCertainty get(int value) {
		switch (value) {
			case CERTAIN_VALUE: return CERTAIN;
			case PROBABLE_VALUE: return PROBABLE;
			case POSSIBLE_VALUE: return POSSIBLE;
			case IMPROBABLE_VALUE: return IMPROBABLE;
			case IMPOSSIBLE_VALUE: return IMPOSSIBLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DegreeOfCertainty(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DegreeOfCertainty
