/**
 *
 * $Id$
 */
package conml.types.validation;

import conml.instances.Link;

import conml.types.SemiAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link conml.types.Association}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AssociationValidator {
	boolean validate();

	boolean validatePrimarySemiAssociation(SemiAssociation value);

  boolean validateSecondarySemiAssociation(SemiAssociation value);

  boolean validateInstanceLinks(EList<Link> value);

  boolean validateHasPrimary(SemiAssociation value);
	boolean validateHasSecondary(SemiAssociation value);
	boolean validateHasInstanceLinks(EList<Link> value);

	boolean validateCompact(boolean value);

  boolean validateIsCompact(boolean value);
}
