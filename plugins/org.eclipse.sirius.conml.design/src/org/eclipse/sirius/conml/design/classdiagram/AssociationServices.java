package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Dialogs;

import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class AssociationServices {

  private static final class Errors {
    static final String ASSOCIATION_TARGET_IS_NULL = "Association target must be specified.";
    static final String COMPACT_SYMMETRIC_ASSOCIATION =
        "Compact style cannot be used for symmetric associations.";
    static final String COMPACT_CARDINALITIES =
        "Specified semiassociation cardinalities do not match any of the con/sha/ref patterns.";
  }

  public String associationBeginLabel(Association association) {
    return association.getPrimarySemiAssociation().getRole();
  }

  public String associationEndLabel(Association association) {
    return association.getSecondarySemiAssociation().getRole();
  }

  public Class getAssociationSourceType(Association association) {
    return association.getPrimarySemiAssociation() != null
        ? association.getPrimarySemiAssociation().getOwner()
        : null;
  }

  public Class getAssociationTargetType(Association association) {
    return association.getSecondarySemiAssociation() != null
        ? association.getSecondarySemiAssociation().getOwner()
        : null;
  }

  public Association createAssociation(
      EObject object, Class source, Class target, EObject sourceView, EObject targetView) {
    final Association association = TypesFactory.eINSTANCE.createAssociation();
    association.setDefinition("");
    association.setCompact(false);
    final String primaryName = source.getName() + "s";
    association.setName(primaryName);

    // TODO: default cardinalities???
    final SemiAssociation primary = TypesFactory.eINSTANCE.createSemiAssociation();
    primary.setName(primaryName);
    primary.setRole(primaryName);
    primary.setPrimaryInAssociation(association);
    primary.setReferredClass(target);
    association.setPrimarySemiAssociation(primary);

    final SemiAssociation secondary = TypesFactory.eINSTANCE.createSemiAssociation();
    final String secondaryName = target.getName() + "s";
    secondary.setName(secondaryName);
    secondary.setRole(secondaryName);
    secondary.setSecondaryInAssociation(association);
    secondary.setReferredClass(source);
    association.setSecondarySemiAssociation(secondary);

    primary.setInverseSemiAssociation(secondary);
    secondary.setInverseSemiAssociation(primary);

    source.getSemiassociations().add(primary);
    target.getSemiassociations().add(secondary);

    if (source.eContainer() instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) source.eContainer();
      typeModel.getElements().add(association);
    }
    return association;
  }

  private boolean compactSemiAssociationCardinalitiesAreValid(
      SemiAssociation primary, Class source) {
    final int minPrimaryCardinality = primary.getMinimumCardinality();
    final Integer maxPrimaryCardinality = primary.getMaximumCardinality();
    // TODO: should this allow more options (for example maxCardinality = 2 or
    // minCardinality=1)?
    if (minPrimaryCardinality != 0
        || (maxPrimaryCardinality != null && !Objects.equals(maxPrimaryCardinality, 1))) {
      source.getSemiassociations().remove(primary);
      Dialogs.showError(Errors.COMPACT_CARDINALITIES);
      return false;
    } else {
      return true;
    }
  }

  private boolean compactSemiAssociationTargetIsValid(SemiAssociation primary, Class source) {
    Class target = primary.getReferredClass();
    if (target == null) {
      source.getSemiassociations().remove(primary);
      Dialogs.showError(Errors.ASSOCIATION_TARGET_IS_NULL);
      return false;
    } else if (EcoreUtil.equals(source, target)) {
      source.getSemiassociations().remove(primary);
      Dialogs.showError(Errors.COMPACT_SYMMETRIC_ASSOCIATION);
      return false;
    } else {
      return true;
    }
  }

  public void addToAssociation(SemiAssociation primary, Class source) {
    if (!compactSemiAssociationCardinalitiesAreValid(primary, source)
        || !compactSemiAssociationTargetIsValid(primary, source)) {
      return;
    }

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

    source.getSemiassociations().add(primary);
    target.getSemiassociations().add(secondary);

    if (source.eContainer() instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) source.eContainer();
      typeModel.getElements().add(association);
    }
  }

  public void addToOwnedSemiAssociations(SemiAssociation semiAssociation, Class clazz) {
    clazz.getSemiassociations().add(semiAssociation);
  }

  public boolean shouldDisplayCompactLabel(SemiAssociation semiAssociation) {
    final Association association = semiAssociation.getPrimaryInAssociation();
    if (association == null) {
      return false;
    } else {
      return association.isCompact();
    }
  }

  public boolean shouldDisplayAssociationEdge(Association association) {
    return !association.isCompact();
  }

  public String compactAssociationLabel(SemiAssociation primary) {
    final Association association = primary.getPrimaryInAssociation();
    if (association == null) {
      return "";
    }

    final StringBuilder sb = new StringBuilder(primary.getRole());
    if (primary.getRedefinedFeature() != null
        && !Objects.equals(primary.getRedefinedFeature().getName(), primary.getName())) {
      sb.append(" [").append(primary.getRedefinedFeature().getName()).append(']');
    }

    sb.append(": ")
        .append(primary.getMinimumCardinality())
        .append("..")
        .append(primary.getMaximumCardinality() == null ? "*" : primary.getMaximumCardinality());

    if (primary.getMaximumCardinality() == null) {
      if (primary.isWhole()) {
        sb.append(" sha ");
      } else {
        sb.append(" ref ");
      }
    } else {
      sb.append(" con ");
    }

    sb.append(primary.getReferredClass().getName());

    final ArrayList<String> markers = new ArrayList<>();
    if (primary.isConstant()) {
      markers.add("K");
    }
    if (primary.isSubjective()) {
      markers.add("S");
    }
    if (primary.isTemporal()) {
      markers.add("T");
    }
    if (!markers.isEmpty()) {
      sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");
    }

    return sb.toString();
  }
}
