package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;

import conml.instances.Link;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.types.Association;
import conml.types.Class;
import conml.types.SemiAssociation;

public final class AssociationServices {

  private static final class InstanceHolder {
    static final AssociationServices INSTANCE = new AssociationServices();
  }

  public static AssociationServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public static Association getCorrespondingAssociation(final EObject object) {
    if (object instanceof Association) return (Association) object;
    else if (object instanceof Link) return ((Link) object).getInstancedAssociation();
    else return null;
  }

  public static boolean checkCorrespondingAssociation(
      final EObject object, final Predicate<Association> predicate) {
    final Association association = getCorrespondingAssociation(object);
    if (association == null) return false;
    else return predicate.test(association);
  }

  public void compactAssociation(final Association association) {
    if (!association.isCompact()) {
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

  public void moveAssociationUp(final EObject object) {
    ConML.castAndRun(
        object,
        Association.class,
        association ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    association, Association.class, ConML.ElementMovementDirection.UP));
  }

  public void moveAssociationDown(final EObject object) {
    ConML.castAndRun(
        object,
        Association.class,
        association ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(
                    association, Association.class, ConML.ElementMovementDirection.DOWN));
  }

  public void deleteAssociation(final Association association) {
    final SemiAssociation primary = association.getPrimarySemiAssociation();
    if (primary != null) deleteSemiAssociation(primary);

    final SemiAssociation secondary = association.getSecondarySemiAssociation();
    if (secondary != null) deleteSemiAssociation(secondary);

    EcoreUtil.delete(association);
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
