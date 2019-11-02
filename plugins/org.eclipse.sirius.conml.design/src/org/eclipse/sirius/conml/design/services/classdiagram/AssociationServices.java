package org.eclipse.sirius.conml.design.services.classdiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.Dialogs;

import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public class AssociationServices implements FeatureServices, ModelElementServices {

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

  public void expandAssociation(final SemiAssociation semi) {
    if (semi.getPrimaryInAssociation() != null) semi.getPrimaryInAssociation().setCompact(false);
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

  public boolean isPrimarySemiAssociationWhole(final Association association) {
    return association.getPrimarySemiAssociation().isWhole();
  }

  public boolean isSecondarySemiAssociationWhole(final Association association) {
    return association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationStrong(final Association association) {
    return association.getPrimarySemiAssociation().isStrong();
  }

  public boolean isSecondarySemiAssociationStrong(final Association association) {
    return association.getSecondarySemiAssociation().isStrong();
  }

  public boolean areBothSemiAssociationsStrong(final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimaryAssociationWholeAndStrong(final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getPrimarySemiAssociation().isWhole();
  }

  public boolean isSecondaryAssociationWholeAndStrong(final Association association) {
    return association.getSecondarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationWholeAndStrongAndSecondaryStrong(
      final Association association) {
    return association.getPrimarySemiAssociation().isWhole()
        && association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryStrongAndWhole(
      final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public boolean isPrimarySemiAssociationStrongAndSecondaryWhole(final Association association) {
    return association.getPrimarySemiAssociation().isStrong()
        && association.getSecondarySemiAssociation().isWhole();
  }

  public boolean isPrimarySemiAssociationWholeAndSecondaryStrong(final Association association) {
    return association.getPrimarySemiAssociation().isWhole()
        && association.getSecondarySemiAssociation().isStrong();
  }

  public List<SemiAssociation> primarySemiAssociationAsList(final Association association) {
    return Arrays.asList(association.getPrimarySemiAssociation());
  }

  public List<SemiAssociation> secondarySemiAssociationAsList(Association association) {
    return Arrays.asList(association.getSecondarySemiAssociation());
  }

  public List<SemiAssociation> semiAssociationsList(final Association association) {
    return Arrays.asList(
        association.getPrimarySemiAssociation(), association.getSecondarySemiAssociation());
  }

  public boolean areSemiAssociationsWholeSemanticsValid(final EObject object) {
    if (!(object instanceof Association)) return true;
    final Association association = (Association) object;
    return !association.getPrimarySemiAssociation().isWhole()
        || !association.getSecondarySemiAssociation().isWhole();
  }

  public boolean arePrimarySemiAssociationCardinalitiesValid(final Association association) {
    return areCardinalitiesValid(association.getPrimarySemiAssociation());
  }

  public boolean areSecondarySemiAssociationCardinalitiesValid(final Association association) {
    return areCardinalitiesValid(association.getSecondarySemiAssociation());
  }

  private boolean areCardinalitiesValid(final SemiAssociation semiAssociation) {
    if (semiAssociation.getMaximumCardinality() == null) return true;
    else return semiAssociation.getMaximumCardinality() >= semiAssociation.getMinimumCardinality();
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

  public void setWhole(final SemiAssociation semiAssociation, final Boolean whole) {
    semiAssociation.setWhole(whole);
  }

  public void setStrong(final SemiAssociation semiAssociation, final Boolean strong) {
    semiAssociation.setStrong(strong);
  }

  public String associationCenterLabel(final Association association) {
    return associationCenterTopLabel(association)
        + "\n"
        + associationCenterBottomLabel(association);
  }

  public String associationPropertiesLabel(final Association association) {
    return associationCenterTopLabel(association) + " " + associationCenterBottomLabel(association);
  }

  public String associationCenterTopLabel(final Association association) {
    return buildSemiAssociationAttributeLabel(
            association.getPrimarySemiAssociation(), SemiAssociation::getName)
        .toString();
  }

  public String associationCenterBottomLabel(final Association association) {
    return buildSemiAssociationAttributeLabel(
            association.getSecondarySemiAssociation(), SemiAssociation::getName)
        .toString();
  }

  public String associationBeginLabel(final Association association) {
    final StringBuilder sb =
        buildSemiAssociationAttributeLabel(
                association.getPrimarySemiAssociation(), SemiAssociation::getRole)
            .append(' ');
    buildCardinalityLabelPart(association.getPrimarySemiAssociation(), sb);
    return sb.toString();
  }

  public String associationEndLabel(final Association association) {
    final StringBuilder sb =
        buildSemiAssociationAttributeLabel(
                association.getSecondarySemiAssociation(), SemiAssociation::getRole)
            .append(' ');
    buildCardinalityLabelPart(association.getSecondarySemiAssociation(), sb);
    return sb.toString();
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

  public Association createAssociation(
      final EObject object,
      final Class source,
      final Class target,
      final EObject sourceView,
      final EObject targetView) {
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

    source.getSemiAssociations().add(primary);
    primary.setOwnerClass(source);
    target.getSemiAssociations().add(secondary);
    secondary.setOwnerClass(target);

    if (source.eContainer() instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) source.eContainer();
      typeModel.getElements().add(association);
    }
    return association;
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

  public void addToOwnedSemiAssociations(final SemiAssociation semiAssociation, final Class clazz) {
    clazz.getSemiAssociations().add(semiAssociation);
    semiAssociation.setOwnerClass(clazz);
  }

  public boolean shouldDisplayCompactLabel(final SemiAssociation semiAssociation) {
    final Association association = semiAssociation.getPrimaryInAssociation();
    if (association == null) return false;
    else return association.isCompact();
  }

  public boolean shouldDisplayAssociationEdge(final Association association) {
    return !association.isCompact();
  }

  private StringBuilder buildSemiAssociationAttributeLabel(
      final SemiAssociation semiAssociation,
      final Function<SemiAssociation, String> attributeNameGetter,
      final StringBuilder sb) {
    if (semiAssociation == null) return sb;

    if (semiAssociation.getRedefinedSemiassociation() != null
        && semiAssociation.getRedefinedSemiassociation() instanceof SemiAssociation) {
      final SemiAssociation redefinedSemiAssociation =
          semiAssociation.getRedefinedSemiassociation();
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
      final SemiAssociation semiAssociation,
      final Function<SemiAssociation, String> attributeNameGetter) {
    return buildSemiAssociationAttributeLabel(
        semiAssociation, attributeNameGetter, new StringBuilder());
  }

  public String compactAssociationLabel(final SemiAssociation primary) {
    if (primary == null) return "";
    final Association association = primary.getPrimaryInAssociation();
    if (association == null) return "";

    final StringBuilder sb = new StringBuilder();
    buildSemiAssociationAttributeLabel(primary, SemiAssociation::getRole, sb).append(": ");
    buildCardinalityLabelPart(primary, sb).append(" ");

    if (primary.getMaximumCardinality() == null) {
      if (primary.isWhole()) sb.append(" sha ");
      else sb.append(" ref ");
    } else {
      sb.append(" con ");
    }

    sb.append(primary.getReferredClass().getName());

    final ArrayList<String> markers = new ArrayList<>();
    if (primary.isConstant()) markers.add("K");
    if (primary.isSubjective()) markers.add("S");
    if (primary.isTemporal()) markers.add("T");
    if (!markers.isEmpty())
      sb.append(" (").append(markers.stream().collect(Collectors.joining(","))).append(")");

    return sb.toString();
  }

  public void moveAssociationUp(final EObject object) {
    moveElement(object, Association.class, ConML.ElementMovementDirection.UP);
  }

  public void moveAssociationDown(final EObject object) {
    moveElement(object, Association.class, ConML.ElementMovementDirection.DOWN);
  }

  public static void deleteAssociationStatic(final Association association) {
    final SemiAssociation primary = association.getPrimarySemiAssociation();
    if (primary != null) deleteSemiAssociation(primary);

    final SemiAssociation secondary = association.getSecondarySemiAssociation();
    if (secondary != null) deleteSemiAssociation(secondary);
  }

  public void deleteAssociation(final Association association) {
    deleteAssociationStatic(association);
  }

  private static void deleteSemiAssociation(final SemiAssociation semi) {
    if (semi == null) return;

    final ArrayList<EObject> eObjectsToDelete = new ArrayList<>();
    for (final ReferenceSet refSet : semi.getInstanceReferenceSets()) {
      for (final Reference ref : refSet.getReferences()) {
        if (ref.getPrimaryInLink() != null) eObjectsToDelete.add(ref.getPrimaryInLink());
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
