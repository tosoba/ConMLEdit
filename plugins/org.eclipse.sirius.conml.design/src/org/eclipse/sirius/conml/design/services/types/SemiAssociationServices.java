package org.eclipse.sirius.conml.design.services.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.types.Association;
import conml.types.SemiAssociation;

public final class SemiAssociationServices {

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
      Activator.logError(Messages.getString("ExceptionMessage.IsNull", "Association"));
    } else {
      EcoreUtil.delete(association);
    }

    final SemiAssociation inverse = semi.getInverseSemiAssociation();
    if (inverse == null) {
      Activator.logError(Messages.getString("ExceptionMessage.IsNull", "Inverse SemiAssociation"));
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

  public void setSemiAssociationRole(final SemiAssociation semiAssociation, final String role) {
    semiAssociation.setRole(role);
  }

  public boolean isInverseSemiAssociationNotWhole(final SemiAssociation semiAssociation) {
    return semiAssociation.getInverseSemiAssociation() != null
        && !semiAssociation.getInverseSemiAssociation().isWhole()
        && !EcoreUtil.equals(semiAssociation, semiAssociation.getInverseSemiAssociation());
  }

  public void setWhole(final SemiAssociation semiAssociation, final Boolean whole) {
    semiAssociation.setWhole(whole);
  }

  public void setStrong(final SemiAssociation semiAssociation, final Boolean strong) {
    semiAssociation.setStrong(strong);
  }
}
