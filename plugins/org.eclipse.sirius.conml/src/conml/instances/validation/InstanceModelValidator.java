/**
 *
 * $Id$
 */
package conml.instances.validation;

import conml.instances.InstanceModelElement;
import conml.types.TypeModel;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.instances.InstanceModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InstanceModelValidator {
	boolean validate();

	boolean validateConformedTypeModels(EList<TypeModel> value);

  boolean validateElements(EList<InstanceModelElement> value);

    boolean validateConformsTo(EList<TypeModel> value);
}
