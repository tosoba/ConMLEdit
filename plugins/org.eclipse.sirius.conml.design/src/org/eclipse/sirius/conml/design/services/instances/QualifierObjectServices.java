package org.eclipse.sirius.conml.design.services.instances;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.instances.FacetSet;
import conml.instances.InstanceModel;
import conml.instances.Link;
import conml.instances.Object;
import conml.instances.QualifierObject;
import conml.instances.ReferenceSet;
import conml.instances.ValueSet;

public final class QualifierObjectServices {

  private enum QualifierObjectType {
    TEMPORAL,
    SUBJECTIVE;
  }

  public void assignMoment(final EObject container, final QualifierObject qualifierObject) {
    if (container instanceof Object) {
      ((Object) container).setTemporalExistentialQualifier(qualifierObject);
    } else if (container instanceof FacetSet) {
      ((FacetSet) container).setPhaseQualifier(qualifierObject);
    } else if (container instanceof Link) {
      // TODO: show a dialog to pick a ReferenceSet
    } else {
      throw new IllegalArgumentException(
          Messages.getString("ExceptionMessage.InvalidContainerType"));
    }
  }

  public void assignPerspective(final EObject container, final QualifierObject qualifierObject) {
    if (container instanceof Object) {
      ((Object) container).setSubjectiveExistentialQualifer(qualifierObject);
    } else if (container instanceof FacetSet) {
      ((FacetSet) container).setPerspectiveQualifier(qualifierObject);
    } else if (container instanceof Link) {
      // TODO: show a dialog to pick a ReferenceSet
    } else {
      throw new IllegalArgumentException(
          Messages.getString("ExceptionMessage.InvalidContainerType"));
    }
  }

  public List<QualifierObject> getSubjectiveQualifierObjectCandidates(final EObject container) {
    return getQualifierObjectCandidates(container, QualifierObjectType.SUBJECTIVE);
  }

  public List<QualifierObject> getTemporalQualifierObjectCandidates(final EObject container) {
    return getQualifierObjectCandidates(container, QualifierObjectType.TEMPORAL);
  }

  private List<QualifierObject> getQualifierObjectCandidates(
      final EObject container, final QualifierObjectType qualifierObjectType) {
    if (container instanceof Object) {
      final InstanceModel instanceModel = ((Object) container).getInstanceModel();
      if (instanceModel == null)
        throw new IllegalArgumentException(
            Messages.getString("ExceptionMessage.IsNull", "Object's InstanceModel"));
      return getQualifierObjectsListFrom(instanceModel, qualifierObjectType);
    } else if (container instanceof ValueSet) {
      final Object object = ((ValueSet) container).getOwner();
      if (object == null)
        throw new IllegalArgumentException(
            Messages.getString("ExceptionMessage.IsNull", "ValueSet's Owner Object"));
      final InstanceModel instanceModel = object.getInstanceModel();
      if (instanceModel == null)
        throw new IllegalArgumentException(
            Messages.getString("ExceptionMessage.IsNull", "Object's InstanceModel"));
      return getQualifierObjectsListFrom(instanceModel, qualifierObjectType);
    } else if (container instanceof ReferenceSet) {
      final Object object = ((ReferenceSet) container).getOwner();
      if (object == null)
        throw new IllegalArgumentException(
            Messages.getString("ExceptionMessage.IsNull", "ReferenceSet's Owner Object"));
      final InstanceModel instanceModel = object.getInstanceModel();
      if (instanceModel == null)
        throw new IllegalArgumentException(
            Messages.getString("ExceptionMessage.IsNull", "Object's InstanceModel"));
      return getQualifierObjectsListFrom(instanceModel, qualifierObjectType);
    } else if (container instanceof Link) {
      final InstanceModel instanceModel = ((Link) container).getInstanceModel();
      if (instanceModel == null)
        throw new IllegalArgumentException(
            Messages.getString("ExceptionMessage.IsNull", "Link's InstanceModel"));
      return getQualifierObjectsListFrom(instanceModel, qualifierObjectType);
    } else {
      throw new IllegalArgumentException(
          Messages.getString("ExceptionMessage.InvalidContainerType"));
    }
  }

  private List<QualifierObject> getQualifierObjectsListFrom(
      final InstanceModel instanceModel, final QualifierObjectType qualifierObjectType) {
    return ConML.getStreamOfAllElementsOfTypeFromModel(instanceModel, QualifierObject.class)
        .filter(
            qualifier ->
                qualifier.getInstancedClass() != null
                    && ((qualifierObjectType == QualifierObjectType.SUBJECTIVE
                            && qualifier.getInstancedClass().isUsedAsSubjectiveAspect())
                        || (qualifierObjectType == QualifierObjectType.TEMPORAL
                            && qualifier.getInstancedClass().isUsedAsTemporalAspect())))
        .collect(Collectors.toList());
  }
}
