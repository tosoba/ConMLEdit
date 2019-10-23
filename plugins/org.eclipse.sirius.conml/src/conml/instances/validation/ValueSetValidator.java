/**
 *
 * $Id$
 */
package conml.instances.validation;

import conml.instances.Value;
import conml.types.Attribute;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.instances.ValueSet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ValueSetValidator {
	boolean validate();

	boolean validateInstancedAttribute(Attribute value);

  boolean validateValues(EList<Value> value);

    boolean validateIsAnInstanceOf(Attribute value);
	boolean validateOwner(conml.instances.Object value);
}
