package org.eclipse.sirius.conml.design.classdiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.ConML;
import org.eclipse.sirius.conml.design.Dialogs;

import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class AssociationServices extends FeatureServices {

  private static final class Errors {
    static final String ASSOCIATION_TARGET_IS_NULL = "Association target must be specified.";
    static final String COMPACT_SYMMETRIC_ASSOCIATION =
        "Compact style cannot be used for symmetric associations.";
    static final String COMPACT_CARDINALITIES =
        "Specified semiassociation cardinalities do not match any of the con/sha/ref patterns.";
    static final String EXPECTED_NON_NEGATIVE_INTEGER_INPUT =
        "Invalid input - must be a non-negative integer.";
    static final String EXPECTED_POSITIVE_INTEGER_INPUT =
        "Invalid input - must be a positive integer.";
  }

  private static final class Messages {
    static final String CARDINALITY_WAS_NOT_SET = "Cardinality was not set.";
  }

  public void expandAssociation(SemiAssociation semi) {
    if (semi.getPrimaryInAssociation() != null) semi.getPrimaryInAssociation().setCompact(false);
  }

  public void compactAssociation(Association association) {
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

  public boolean isExpandedAssociation(EObject object) {
    return ConML.castAndRunOrReturn(
        object, Association.class, (Association association) -> !association.isCompact(), false);
  }

  public boolean isPrimarySemiInCompactAssociation(EObject object) {
    return ConML.castAndRunOrReturn(
        object,
        SemiAssociation.class,
        (SemiAssociation semi) ->
            semi.getPrimaryInAssociation() != null
                ? semi.getPrimaryInAssociation().isCompact()
                : false,
        false);
  }

  public boolean isPrimarySemiAssociationWhole(Association association) {
    return association.getPrimarySemiAssociation().isWhole();
  }

  public boolean isSecondarySemiAssociationWhole(Association association) {
    return association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationStrong(Association association) {
    return association.getPrimarySemiAssociation().isStrong();
  }

  public boolean isSecondarySemiAssociationStrong(Association association) {
    return association.getSecondarySemiAssociation().isStrong();
  }

  public boolean areBothSemiAssociationsStrong(Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimaryAssociationWholeAndStrong(Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getPrimarySemiAssociation().isWhole();
  }

  public boolean isSecondaryAssociationWholeAndStrong(Association association) {
    return association.getSecondarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationWholeAndStrongAndSecondaryStrong(Association association) {
    return association.getPrimarySemiAssociation().isWhole()
        && association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryStrongAndWhole(Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryWhole(Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationWholeAndSecondaryStrong(Association association) {
    return association.getPrimarySemiAssociation().isWhole()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public List<SemiAssociation> primarySemiAssociationAsList(Association association) {
    return Arrays.asList(association.getPrimarySemiAssociation());
  }

  public List<SemiAssociation> secondarySemiAssociationAsList(Association association) {
    return Arrays.asList(association.getSecondarySemiAssociation());
  }

  public List<SemiAssociation> semiAssociationsList(Association association) {
    return Arrays.asList(
        association.getPrimarySemiAssociation(), association.getSecondarySemiAssociation());
  }

  public boolean areSemiAssociationsWholeSemanticsValid(EObject object) {
    if (!(object instanceof Association)) return true;
    final Association association = (Association) object;
    return !association.getPrimarySemiAssociation().isWhole()
        || !association.getSecondarySemiAssociation().isWhole();
  }

  public boolean arePrimarySemiAssociationCardinalitiesValid(Association association) {
    return areCardinalitiesValid(association.getPrimarySemiAssociation());
  }

  public boolean areSecondarySemiAssociationCardinalitiesValid(Association association) {
    return areCardinalitiesValid(association.getSecondarySemiAssociation());
  }

  private boolean areCardinalitiesValid(SemiAssociation semiAssociation) {
    if (semiAssociation.getMaximumCardinality() == null) return true;
    else return semiAssociation.getMaximumCardinality() >= semiAssociation.getMinimumCardinality();
  }

  public void setSemiAssociationName(SemiAssociation semiAssociation, String name) {
    semiAssociation.setName(name);
  }

  public void setSemiAssociationDefinition(SemiAssociation semiAssociation, String definition) {
    semiAssociation.setDefinition(definition);
  }

  public void setSemiAssociationMinimumCardinality(
      SemiAssociation semiAssociation, String cardinalityStr) {
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
      SemiAssociation semiAssociation, String cardinalityStr) {
    if (cardinalityStr == null || cardinalityStr.isEmpty()) {
      semiAssociation.setMaximumCardinality(null);
    } else {
      try {
        int cardinality = Integer.parseInt(cardinalityStr);
        if (cardinality > 0) semiAssociation.setMaximumCardinality(cardinality);
        else
          Dialogs.showError(
              Messages.CARDINALITY_WAS_NOT_SET, Errors.EXPECTED_POSITIVE_INTEGER_INPUT);
      } catch (NumberFormatException e) {
        Dialogs.showError(Messages.CARDINALITY_WAS_NOT_SET, Errors.EXPECTED_POSITIVE_INTEGER_INPUT);
      }
    }
  }

  public void setWhole(SemiAssociation semiAssociation, Boolean whole) {
    semiAssociation.setWhole(whole);
  }

  public void setStrong(SemiAssociation semiAssociation, Boolean strong) {
    semiAssociation.setStrong(strong);
  }

  public String associationCenterLabel(Association association) {
    return associationCenterTopLabel(association)
        + "\n"
        + associationCenterBottomLabel(association);
  }

  public String associationCenterTopLabel(Association association) {
    return buildSemiAssociationAttributeLabel(
            association.getPrimarySemiAssociation(), SemiAssociation::getName)
        .toString();
  }

  public String associationCenterBottomLabel(Association association) {
    return buildSemiAssociationAttributeLabel(
            association.getSecondarySemiAssociation(), SemiAssociation::getName)
        .toString();
  }

  public String associationBeginLabel(Association association) {
    final StringBuilder sb =
        buildSemiAssociationAttributeLabel(
                association.getPrimarySemiAssociation(), SemiAssociation::getRole)
            .append(' ');
    buildCardinalityLabelPart(association.getPrimarySemiAssociation(), sb);
    return sb.toString();
  }

  public String associationEndLabel(Association association) {
    final StringBuilder sb =
        buildSemiAssociationAttributeLabel(
                association.getSecondarySemiAssociation(), SemiAssociation::getRole)
            .append(' ');
    buildCardinalityLabelPart(association.getSecondarySemiAssociation(), sb);
    return sb.toString();
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

    // TODO: default cardinalities - currently it's 0..*
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
      SemiAssociation primary, Class source, boolean removePrimaryIfInvalid) {
    final int minPrimaryCardinality = primary.getMinimumCardinality();
    final Integer maxPrimaryCardinality = primary.getMaximumCardinality();
    // TODO: should this allow more options (for example maxCardinality = 2 or
    // minCardinality=1)?
    if (minPrimaryCardinality != 0
        || (maxPrimaryCardinality != null && !Objects.equals(maxPrimaryCardinality, 1))) {
      if (removePrimaryIfInvalid) source.getSemiassociations().remove(primary);
      Dialogs.showError(Errors.COMPACT_CARDINALITIES);
      return false;
    } else {
      return true;
    }
  }

  // TODO: should this stay like that? Why not let the user create the invalid compact semi and then
  // set referredClass after validating the diagram?
  private boolean compactSemiAssociationTargetIsValid(
      SemiAssociation primary, Class source, boolean removePrimaryIfInvalid) {
    final Class target = primary.getReferredClass();
    if (target == null) {
      if (removePrimaryIfInvalid) source.getSemiassociations().remove(primary);
      Dialogs.showError(Errors.ASSOCIATION_TARGET_IS_NULL);
      return false;
    } else if (EcoreUtil.equals(source, target)) {
      if (removePrimaryIfInvalid) source.getSemiassociations().remove(primary);
      Dialogs.showError(Errors.COMPACT_SYMMETRIC_ASSOCIATION);
      return false;
    } else {
      return true;
    }
  }

  public void addToAssociation(SemiAssociation primary, Class source) {
    if (!compactSemiAssociationCardinalitiesAreValid(primary, source, true)
        || !compactSemiAssociationTargetIsValid(primary, source, true)) {
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

  private StringBuilder buildSemiAssociationAttributeLabel(
      SemiAssociation semiAssociation,
      Function<SemiAssociation, String> attributeNameGetter,
      StringBuilder sb) {
    if (semiAssociation.getRedefinedFeature() != null
        && semiAssociation.getRedefinedFeature() instanceof SemiAssociation) {
      final SemiAssociation redefinedSemiAssociation =
          (SemiAssociation) semiAssociation.getRedefinedFeature();
      if (!Objects.equals(
          attributeNameGetter.apply(redefinedSemiAssociation),
          attributeNameGetter.apply(semiAssociation))) {
        sb.append(attributeNameGetter.apply(semiAssociation))
            .append('[')
            .append(attributeNameGetter.apply(redefinedSemiAssociation))
            .append("] ");
      } else {
        sb.append('[').append(attributeNameGetter.apply(semiAssociation)).append("]");
      }
    } else {
      sb.append(attributeNameGetter.apply(semiAssociation));
    }
    return sb;
  }

  private StringBuilder buildSemiAssociationAttributeLabel(
      SemiAssociation semiAssociation, Function<SemiAssociation, String> attributeNameGetter) {
    return buildSemiAssociationAttributeLabel(
        semiAssociation, attributeNameGetter, new StringBuilder());
  }

  public String compactAssociationLabel(SemiAssociation primary) {
    final Association association = primary.getPrimaryInAssociation();
    if (association == null) {
      return "";
    }

    final StringBuilder sb = new StringBuilder();
    buildSemiAssociationAttributeLabel(primary, SemiAssociation::getRole, sb).append(": ");
    buildCardinalityLabelPart(primary, sb).append(" ");

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
