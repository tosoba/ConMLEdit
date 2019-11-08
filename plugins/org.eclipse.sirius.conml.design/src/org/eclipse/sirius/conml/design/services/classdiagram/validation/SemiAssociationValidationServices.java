package org.eclipse.sirius.conml.design.services.classdiagram.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.types.Class;
import conml.types.Generalization;
import conml.types.SemiAssociation;

public final class SemiAssociationValidationServices {

  public boolean redefinedSemiAssociationIsOwnedByAncestor(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        SemiAssociation.class,
        (final SemiAssociation semiAssociation) -> {
          final SemiAssociation redefined = semiAssociation.getRedefinedSemiAssociation();
          if (redefined == null) return true;
          final Class semiAssociationClass = semiAssociation.getOwnerClass();
          if (semiAssociationClass == null) return true;
          return Validation.anyAncestorOfClassOwnsRedefinedFeature(
              semiAssociationClass, redefined, Class::getSemiAssociations);
        },
        true);
  }

  public boolean semiAssociationAndRedefinedHaveValidStrongSemantics(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        SemiAssociation.class,
        (final SemiAssociation semi) -> {
          final SemiAssociation redefined = semi.getRedefinedSemiAssociation();
          if (redefined == null) return true;
          else
            return semi.isStrong() == redefined.isStrong()
                || (semi.isStrong() && !redefined.isStrong());
        },
        true);
  }

  public boolean semiAssociationAndRedefinedHaveValidOppositeClasses(final EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        SemiAssociation.class,
        (final SemiAssociation semi) -> {
          final SemiAssociation redefined = semi.getRedefinedSemiAssociation();
          if (redefined == null) return true;
          final Class oppositeClass = semi.getReferredClass();
          final Class redefinedOppositeClass = redefined.getReferredClass();
          if (oppositeClass == null
              || redefinedOppositeClass == null
              || EcoreUtil.equals(oppositeClass, redefinedOppositeClass)) return true;

          final Generalization redefinedOppositeSpecialization =
              redefinedOppositeClass.getSpecialization();
          if (redefinedOppositeSpecialization == null) return false;
          else return ConML.areClassesAncestorAndDescedant(redefinedOppositeClass, oppositeClass);
        },
        true);
  }
}
