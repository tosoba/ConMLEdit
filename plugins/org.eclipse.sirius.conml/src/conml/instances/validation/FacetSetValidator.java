/**
 *
 * $Id$
 */
package conml.instances.validation;

import conml.Language;
import conml.instances.Facet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.instances.FacetSet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FacetSetValidator {
	boolean validate();

	boolean validateHasPhaseQualifier(conml.instances.Object value);
	boolean validateHasPerspectiveQualifier(conml.instances.Object value);
	boolean validateIsComposedOf(EList<Facet> value);

	boolean validateTranslationQualifiers(EList<Language> value);
}
