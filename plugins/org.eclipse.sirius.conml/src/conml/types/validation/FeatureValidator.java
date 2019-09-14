/**
 *
 * $Id$
 */
package conml.types.validation;

import conml.types.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.types.Feature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureValidator {
	boolean validate();

	boolean validateMaximumCardinality(Integer value);

	boolean validateMaximumCardinality(int value);
	boolean validateMinimumCardinality(int value);
	boolean validateIsSorted(boolean value);
	boolean validateIsTemporal(boolean value);
	boolean validateIsSubjective(boolean value);
	boolean validateIsConstant(boolean value);
	boolean validateRedefines(Feature value);
	boolean validateIsRedefinedBy(EList<Feature> value);
}
