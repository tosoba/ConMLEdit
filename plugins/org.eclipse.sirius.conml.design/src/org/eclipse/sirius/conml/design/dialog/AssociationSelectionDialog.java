package org.eclipse.sirius.conml.design.dialog;

import java.util.Set;

import org.eclipse.sirius.conml.design.services.types.ClassServices;

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
          final Set<Class> sourceAncestors =
              ClassServices.getInstance().getAllAncestorsOf(source, null);
          final Set<Class> targetAncestors =
              ClassServices.getInstance().getAllAncestorsOf(target, null);
          return (sourceAncestors.contains(association.getPrimarySemiAssociation().getOwnerClass())
                  && targetAncestors.contains(
                      association.getSecondarySemiAssociation().getOwnerClass()))
              || (targetAncestors.contains(association.getPrimarySemiAssociation().getOwnerClass())
                  && sourceAncestors.contains(
                      association.getSecondarySemiAssociation().getOwnerClass()));
        },
        false,
        null);
  }
}
