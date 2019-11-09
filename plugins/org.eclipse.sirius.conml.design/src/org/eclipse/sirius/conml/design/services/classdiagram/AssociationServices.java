package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;

import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public final class AssociationServices {

  private static final class Errors {
    static final String ASSOCIATION_TARGET_IS_NULL = "Association target must be specified.";
    static final String COMPACT_SYMMETRIC_ASSOCIATION =
        "Compact style cannot be used for symmetric associations.";
    static final String COMPACT_CARDINALITIES =
        "Specified SemiAssociation cardinalities do not match any of the con/sha/ref patterns.";
    static final String NO_REDEFINED_SEMI_SPECIFIED =
        "No redefined SemiAssociation specified. The tool is meant only for creating SemiAssociations that redefine others.";
  }

  private static final class ExceptionMessages {
    static final String ASSOCIATION_IS_NULL = "Association is null.";
    static final String REDEFINED_INVERSE_IS_NULL = "Redefined SemiAssociation's inverse is null.";
  }

  private static final class InstanceHolder {
    static final AssociationServices INSTANCE = new AssociationServices();
  }

  public static AssociationServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public void compactAssociation(final Association association) {
    if (!association.isCompact()
        && compactSemiAssociationCardinalitiesAreValid(
            association.getPrimarySemiAssociation(),
            association.getSecondarySemiAssociation().getReferredClass(),
            false)
        && compactSemiAssociationTargetIsValid(
            association.getPrimarySemiAssociation(),
            association.getSecondarySemiAssociation().getReferredClass(),
            false)) {
      association.setCompact(true);
    }
  }

  public boolean isExpandedAssociation(final EObject object) {
    return ConML.castAndRunOrReturn(
        object, Association.class, (Association association) -> !association.isCompact(), false);
  }

  public List<SemiAssociation> primarySemiAssociationAsList(final Association association) {
    return Arrays.asList(association.getPrimarySemiAssociation());
  }

  public List<SemiAssociation> secondarySemiAssociationAsList(final Association association) {
    return Arrays.asList(association.getSecondarySemiAssociation());
  }

  public List<SemiAssociation> semiAssociationsList(final Association association) {
    return Arrays.asList(
        association.getPrimarySemiAssociation(), association.getSecondarySemiAssociation());
  }

  public Class getAssociationSourceType(final Association association) {
    return association.getPrimarySemiAssociation() != null
        ? association.getPrimarySemiAssociation().getOwnerClass()
        : null;
  }

  public Class getAssociationTargetType(final Association association) {
    return association.getSecondarySemiAssociation() != null
        ? association.getSecondarySemiAssociation().getOwnerClass()
        : null;
  }

  private boolean compactSemiAssociationCardinalitiesAreValid(
      final SemiAssociation primary, final Class source, final boolean removePrimaryIfInvalid) {
    final int minPrimaryCardinality = primary.getMinimumCardinality();
    final Integer maxPrimaryCardinality = primary.getMaximumCardinality();
    // TODO: should this allow more options (for example maxCardinality = 2 or
    // minCardinality=1)?
    if (minPrimaryCardinality != 0
        || (maxPrimaryCardinality != null && !Objects.equals(maxPrimaryCardinality, 1))) {
      if (removePrimaryIfInvalid) {
        source.getSemiAssociations().remove(primary);
        EcoreUtil.delete(primary);
      }
      Dialogs.showError(Errors.COMPACT_CARDINALITIES);
      return false;
    } else {
      return true;
    }
  }

  // TODO: should this stay like that? Why not let the user create the invalid compact semi and then
  // set referredClass after validating the diagram?
  private boolean compactSemiAssociationTargetIsValid(
      final SemiAssociation primary, final Class source, final boolean removePrimaryIfInvalid) {
    final Class target = primary.getReferredClass();
    if (target == null) {
      if (removePrimaryIfInvalid) {
        source.getSemiAssociations().remove(primary);
        EcoreUtil.delete(primary);
      }
      Dialogs.showError(Errors.ASSOCIATION_TARGET_IS_NULL);
      return false;
    } else if (EcoreUtil.equals(source, target)) {
      if (removePrimaryIfInvalid) {
        source.getSemiAssociations().remove(primary);
        EcoreUtil.delete(primary);
      }
      Dialogs.showError(Errors.COMPACT_SYMMETRIC_ASSOCIATION);
      return false;
    } else {
      return true;
    }
  }

  public void addToAssociation(final SemiAssociation primary, final Class source) {
    // TODO: maybe remove these checks from here and put them in validations instead...
    if (!compactSemiAssociationCardinalitiesAreValid(primary, source, true)
        || !compactSemiAssociationTargetIsValid(primary, source, true)) return;

    final Association association = TypesFactory.eINSTANCE.createAssociation();
    association.setDefinition("");
    association.setCompact(true);
    final String primaryName = source.getName() + "s";
    association.setName(primaryName);
    primary.setPrimaryInAssociation(association);

    // TODO: cardinalities for secondary association
    final Class target = primary.getReferredClass();
    final SemiAssociation secondary = TypesFactory.eINSTANCE.createSemiAssociation();
    final String secondaryName = target.getName() + "s";
    secondary.setName(secondaryName);
    secondary.setRole(secondaryName);
    secondary.setSecondaryInAssociation(association);
    secondary.setReferredClass(source);
    association.setSecondarySemiAssociation(secondary);

    primary.setInverseSemiAssociation(secondary);
    secondary.setInverseSemiAssociation(primary);

    addToOwnedSemiAssociations(primary, source);
    addToOwnedSemiAssociations(secondary, target);

    if (source.eContainer() instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) source.eContainer();
      typeModel.getElements().add(association);
    }
  }

  public void addRedefiningSemiToAssociation(
      final SemiAssociation semi, final Class source, final Class target) {
    final SemiAssociation redefinedSemi = semi.getRedefinedSemiAssociation();
    if (redefinedSemi == null) {
      Dialogs.showError(Errors.NO_REDEFINED_SEMI_SPECIFIED);
      return;
    }

    semi.setOwnerClass(source);
    semi.setReferredClass(target);

    Association redefinedAssociation = null;
    boolean redefinedIsPrimary = true;
    if (redefinedSemi.getPrimaryInAssociation() != null) {
      redefinedAssociation = redefinedSemi.getPrimaryInAssociation();
    } else if (redefinedSemi.getSecondaryInAssociation() != null) {
      redefinedAssociation = redefinedSemi.getSecondaryInAssociation();
      redefinedIsPrimary = false;
    }

    if (redefinedAssociation == null) {
      Activator.logError(new IllegalStateException(ExceptionMessages.ASSOCIATION_IS_NULL));
      return;
    }

    final Association association = TypesFactory.eINSTANCE.createAssociation();
    association.setCompact(false);
    association.setName(redefinedAssociation.getName());
    association.setDefinition(redefinedAssociation.getDefinition());
    if (redefinedIsPrimary) {
      semi.setPrimaryInAssociation(association);
      association.setPrimarySemiAssociation(semi);
    } else {
      semi.setSecondaryInAssociation(association);
      association.setSecondarySemiAssociation(semi);
    }

    final SemiAssociation inverseOfRedefined = redefinedSemi.getInverseSemiAssociation();
    if (inverseOfRedefined == null) {
      Activator.logError(new IllegalStateException(ExceptionMessages.REDEFINED_INVERSE_IS_NULL));
      return;
    }

    final SemiAssociation inverseSemi = TypesFactory.eINSTANCE.createSemiAssociation();
    inverseSemi.setName(inverseOfRedefined.getName());
    inverseSemi.setDefinition(inverseOfRedefined.getDefinition());
    inverseSemi.setRole(inverseOfRedefined.getRole());
    inverseSemi.setReferredClass(source);
    inverseSemi.setConstant(inverseOfRedefined.isConstant());
    inverseSemi.setMaximumCardinality(inverseOfRedefined.getMaximumCardinality());
    inverseSemi.setMinimumCardinality(inverseOfRedefined.getMinimumCardinality());
    inverseSemi.setOwnerClass(target);
    inverseSemi.setSorted(inverseOfRedefined.isSorted());
    inverseSemi.setStrong(inverseOfRedefined.isStrong());
    inverseSemi.setSubjective(inverseOfRedefined.isSubjective());
    inverseSemi.setTemporal(inverseOfRedefined.isTemporal());
    inverseSemi.setWhole(inverseOfRedefined.isWhole());
    inverseSemi.setInverseSemiAssociation(semi);
    semi.setInverseSemiAssociation(inverseSemi);
    if (redefinedIsPrimary) {
      inverseSemi.setSecondaryInAssociation(association);
      association.setSecondarySemiAssociation(inverseSemi);
    } else {
      inverseSemi.setPrimaryInAssociation(association);
      association.setPrimarySemiAssociation(inverseSemi);
    }

    if (source.eContainer() instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) source.eContainer();
      typeModel.getElements().add(association);
    }
  }

  private void addToOwnedSemiAssociations(
      final SemiAssociation semiAssociation, final Class clazz) {
    clazz.getSemiAssociations().add(semiAssociation);
    semiAssociation.setOwnerClass(clazz);
  }

  public void moveAssociationUp(final EObject object) {
    ModelElementServices.getInstance()
        .moveElement(object, Association.class, ConML.ElementMovementDirection.UP);
  }

  public void moveAssociationDown(final EObject object) {
    ModelElementServices.getInstance()
        .moveElement(object, Association.class, ConML.ElementMovementDirection.DOWN);
  }

  public void deleteAssociation(final Association association) {
    final SemiAssociation primary = association.getPrimarySemiAssociation();
    if (primary != null) deleteSemiAssociation(primary);

    final SemiAssociation secondary = association.getSecondarySemiAssociation();
    if (secondary != null) deleteSemiAssociation(secondary);
  }

  private void deleteSemiAssociation(final SemiAssociation semi) {
    if (semi == null) return;

    final ArrayList<EObject> eObjectsToDelete = new ArrayList<>();
    for (final ReferenceSet refSet : semi.getInstanceReferenceSets()) {
      for (final Reference ref : refSet.getReferences()) {
        if (ref.getPrimaryLink() != null) eObjectsToDelete.add(ref.getPrimaryLink());
        else if (ref.getSecondaryLink() != null) eObjectsToDelete.add(ref.getSecondaryLink());
      }
      eObjectsToDelete.add(refSet);
    }
    eObjectsToDelete.add(semi);

    for (final EObject eObject : eObjectsToDelete) {
      EcoreUtil.delete(eObject);
    }
  }
}
