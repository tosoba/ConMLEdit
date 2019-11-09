package org.eclipse.sirius.conml.design.services.classdiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class SemiAssociationServices {

  private static final class Messages {
    static final String CARDINALITY_WAS_NOT_SET = "Cardinality was not set.";
  }

  private static final class ExceptionMessages {
    static final String ASSOCIATION_IS_NULL = "Association is null.";
    static final String INVERSE_SEMI_IS_NULL = "Inverse SemiAssociation is null";
  }

  private static final class Errors {
    static final String EXPECTED_NON_NEGATIVE_INTEGER_INPUT =
        "Invalid input - must be a non-negative integer.";
    static final String EXPECTED_POSITIVE_INTEGER_INPUT =
        "Invalid input - must be a positive integer.";
  }

  private static final class InstanceHolder {
    static final SemiAssociationServices INSTANCE = new SemiAssociationServices();
  }

  public static SemiAssociationServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public void deleteCompactSemiAssociation(final SemiAssociation semi) {
    Association association = null;
    if (semi.getPrimaryInAssociation() != null) association = semi.getPrimaryInAssociation();
    else if (semi.getSecondaryInAssociation() != null)
      association = semi.getSecondaryInAssociation();

    EcoreUtil.delete(semi);

    if (association == null) {
      Activator.logError(ExceptionMessages.ASSOCIATION_IS_NULL);
    } else {
      EcoreUtil.delete(association);
    }

    final SemiAssociation inverse = semi.getInverseSemiAssociation();
    if (inverse == null) {
      Activator.logError(ExceptionMessages.INVERSE_SEMI_IS_NULL);
    } else {
      EcoreUtil.delete(inverse);
    }
  }

  public void setInverses(final SemiAssociation primary, final SemiAssociation secondary) {
    primary.setInverseSemiAssociation(secondary);
    secondary.setInverseSemiAssociation(primary);
  }

  public void expandAssociation(final SemiAssociation semi) {
    if (semi.getPrimaryInAssociation() != null) semi.getPrimaryInAssociation().setCompact(false);
  }

  public boolean isPrimarySemiInCompactAssociation(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        SemiAssociation.class,
        (SemiAssociation semi) ->
            semi.getPrimaryInAssociation() != null
                ? semi.getPrimaryInAssociation().isCompact()
                : false,
        false);
  }

  public void setSemiAssociationName(final SemiAssociation semiAssociation, final String name) {
    semiAssociation.setName(name);
  }

  public void setSemiAssociationDefinition(
      final SemiAssociation semiAssociation, final String definition) {
    semiAssociation.setDefinition(definition);
  }

  public void setSemiAssociationMinimumCardinality(
      final SemiAssociation semiAssociation, final String cardinalityStr) {
    if (cardinalityStr == null || cardinalityStr.isEmpty()) {
      semiAssociation.setMinimumCardinality(0);
    } else {
      try {
        int cardinality = Integer.parseInt(cardinalityStr);
        if (cardinality >= 0) semiAssociation.setMinimumCardinality(cardinality);
        else
          Dialogs.showError(
              Messages.CARDINALITY_WAS_NOT_SET, Errors.EXPECTED_NON_NEGATIVE_INTEGER_INPUT);
      } catch (NumberFormatException e) {
        Dialogs.showError(
            Messages.CARDINALITY_WAS_NOT_SET, Errors.EXPECTED_NON_NEGATIVE_INTEGER_INPUT);
      }
    }
  }

  public void setSemiAssociationMaximumCardinality(
      final SemiAssociation semiAssociation, final String cardinalityStr) {
    if (cardinalityStr == null || cardinalityStr.isEmpty()) {
      semiAssociation.setMaximumCardinality(null);
    } else {
      try {
        final int cardinality = Integer.parseInt(cardinalityStr);
        if (cardinality > 0) semiAssociation.setMaximumCardinality(cardinality);
        else
          Dialogs.showError(
              Messages.CARDINALITY_WAS_NOT_SET, Errors.EXPECTED_POSITIVE_INTEGER_INPUT);
      } catch (NumberFormatException e) {
        Dialogs.showError(Messages.CARDINALITY_WAS_NOT_SET, Errors.EXPECTED_POSITIVE_INTEGER_INPUT);
      }
    }
  }

  public void setWhole(final SemiAssociation semiAssociation, final Boolean whole) {
    semiAssociation.setWhole(whole);
  }

  public void setStrong(final SemiAssociation semiAssociation, final Boolean strong) {
    semiAssociation.setStrong(strong);
  }
}
