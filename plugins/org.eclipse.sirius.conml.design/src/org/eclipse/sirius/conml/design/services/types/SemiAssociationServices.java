package org.eclipse.sirius.conml.design.services.types;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.Domain;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypesFactory;

public final class SemiAssociationServices {

  private static final class InstanceHolder {
    static final SemiAssociationServices INSTANCE = new SemiAssociationServices();
  }

  public static SemiAssociationServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public Class getReferredClass(final SemiAssociation semi) {
    return semi.getReferredClass();
  }

  public void setReferredClass(final SemiAssociation semi, final Class clazz) {
    semi.setReferredClass(clazz);
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

  public void setRole(final SemiAssociation semiAssociation, final String role) {
    semiAssociation.setRole(role);
  }

  public void setNameDisplayed(final SemiAssociation semiAssociation, final Boolean nameDisplayed) {
    semiAssociation.setNameDisplayed(nameDisplayed);
  }

  public void setRoleDisplayed(final SemiAssociation semiAssociation, final Boolean roleDisplayed) {
    semiAssociation.setRoleDisplayed(roleDisplayed);
  }

  public Set<Class> getRedefinedSemiAssociationReferredClassCandidates(
      final SemiAssociation semiAssociation) {
    final SemiAssociation redefined = semiAssociation.getRedefinedSemiAssociation();
    if (redefined == null || redefined.getReferredClass() == null) return new HashSet<>();
    return getDescendantsOfClass(redefined.getReferredClass());
  }

  private Set<Class> getDescendantsOfClass(final Class clazz) {
    final Set<Class> currentClasses = new HashSet<>();
    getDescendantsOfClass(clazz, currentClasses);
    return currentClasses;
  }

  private void getDescendantsOfClass(final Class clazz, final Set<Class> currentClasses) {
    currentClasses.add(clazz);
    if (clazz.getSpecialization() == null) return;
    clazz
        .getSpecialization()
        .getSpecializedClasses()
        .forEach(specializedClass -> getDescendantsOfClass(specializedClass, currentClasses));
  }

  public void createInverseAndAddRedefinedSemiToAssociation(final SemiAssociation semi) {
    final SemiAssociation redefined = semi.getRedefinedSemiAssociation();
    if (redefined == null || redefined.getInverseSemiAssociation() == null) {
      Activator.logError(
          new IllegalStateException(
              Messages.getString(
                  "ExceptionMessage.IsNull", "Redefined SemiAssociation or its inverse")));
      return;
    }

    boolean createPrimary;
    Association redefinedAssociation;
    if (redefined.getPrimaryInAssociation() != null) {
      createPrimary = false;
      redefinedAssociation = redefined.getPrimaryInAssociation();
    } else if (redefined.getSecondaryInAssociation() != null) {
      createPrimary = true;
      redefinedAssociation = redefined.getSecondaryInAssociation();
    } else {
      Activator.logError(
          new IllegalStateException(
              Messages.getString(
                  "ExceptionMessage.IsNull",
                  "Redefined SemiAssociation's primary and secondary Association reference")));
      return;
    }

    final Association association = TypesFactory.eINSTANCE.createAssociation();
    association.setCompact(redefinedAssociation.isCompact());
    association.setName(redefinedAssociation.getName());
    association.setDefinition(redefinedAssociation.getDefinition());
    if (createPrimary) semi.setSecondaryInAssociation(association);
    else semi.setPrimaryInAssociation(association);

    final SemiAssociation inverseOfRedefined = redefined.getInverseSemiAssociation();
    if (inverseOfRedefined == null) {
      Activator.logError(
          new IllegalStateException(
              Messages.getString(
                  "ExceptionMessage.IsNull", "Redefined SemiAssociation's inverse")));
      return;
    }

    final SemiAssociation inverseSemi = TypesFactory.eINSTANCE.createSemiAssociation();
    inverseSemi.setName(inverseOfRedefined.getName());
    inverseSemi.setDefinition(inverseOfRedefined.getDefinition());
    inverseSemi.setRole(inverseOfRedefined.getRole());
    inverseSemi.setReferredClass(inverseOfRedefined.getReferredClass());
    inverseSemi.setConstant(inverseOfRedefined.isConstant());
    inverseSemi.setMaximumCardinality(inverseOfRedefined.getMaximumCardinality());
    inverseSemi.setMinimumCardinality(inverseOfRedefined.getMinimumCardinality());
    inverseSemi.setOwnerClass(inverseOfRedefined.getOwnerClass());
    inverseSemi.setSorted(inverseOfRedefined.isSorted());
    inverseSemi.setStrong(inverseOfRedefined.isStrong());
    inverseSemi.setSubjective(inverseOfRedefined.isSubjective());
    inverseSemi.setTemporal(inverseOfRedefined.isTemporal());
    inverseSemi.setWhole(inverseOfRedefined.isWhole());

    semi.setInverseSemiAssociation(inverseSemi);

    if (createPrimary) inverseSemi.setPrimaryInAssociation(association);
    else inverseSemi.setSecondaryInAssociation(association);

    final Domain domain = (Domain) redefinedAssociation.eContainer();
    domain.getParts().add(association);
  }
}
