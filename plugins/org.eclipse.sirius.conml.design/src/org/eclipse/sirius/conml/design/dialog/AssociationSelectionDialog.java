package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.Domain;
import conml.types.Association;
import conml.types.Class;

public final class AssociationSelectionDialog extends ExistingSemanticElementsSelectionDialog {

  public AssociationSelectionDialog(String title, String message, Class source, Class target) {
    super(
        title,
        message,
        (Object obj) -> {
          if (obj instanceof Domain) return true;

          if (!(obj instanceof Association)) return false;
          final Association association = (Association) obj;
          if (association.getPrimarySemiAssociation() == null
              || association.getSecondarySemiAssociation() == null) return false;
          return EcoreUtil.equals(association.getPrimarySemiAssociation().getOwnerClass(), source)
              && EcoreUtil.equals(
                  association.getSecondarySemiAssociation().getOwnerClass(), target);
        },
        false,
        null);
  }
}
