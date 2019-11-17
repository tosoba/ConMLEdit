package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.services.classdiagram.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DSemanticDiagram;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import conml.MetaInformation;
import conml.Model;
import conml.instances.InstanceModel;
import conml.instances.InstancesFactory;
import conml.instances.Link;
import conml.instances.Object;
import conml.instances.Reference;
import conml.instances.ReferenceSet;
import conml.instances.ValueSet;
import conml.types.Attribute;
import conml.types.Class;

public class ObjectServices {

  private static final class InstanceHolder {
    static final ObjectServices INSTANCE = new ObjectServices();
  }

  public static ObjectServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public String objectLabel(final Object object) {
    return object.getIdentifier()
        + ": "
        + (object.getInstancedClass() != null ? object.getInstancedClass().getName() : "?");
  }

  public void moveObjectUp(final EObject object) {
    ModelElementServices.getInstance()
        .moveInstanceModelElement(object, Object.class, ConML.ElementMovementDirection.UP);
  }

  public void moveObjectDown(final EObject object) {
    ModelElementServices.getInstance()
        .moveInstanceModelElement(object, Object.class, ConML.ElementMovementDirection.DOWN);
  }

  public void deleteObject(final Object object) {
    final EObject container = object.eContainer();
    if (container == null || !(container instanceof InstanceModel)) {
      EcoreUtil.delete(object);
      return;
    }

    final InstanceModel instanceModel = (InstanceModel) container;
    final List<Link> links =
        ConML.getStreamOfAllElementsOfTypeFromModel(instanceModel, Link.class)
            .filter(
                link -> {
                  final Reference primaryRef = link.getPrimaryReference();
                  if (primaryRef != null
                      && primaryRef.getOwnerReferenceSet() != null
                      && EcoreUtil.equals(object, primaryRef.getOwnerReferenceSet().getOwner()))
                    return true;

                  final Reference secondaryRef = link.getSecondaryReference();
                  if (secondaryRef != null
                      && secondaryRef.getOwnerReferenceSet() != null
                      && EcoreUtil.equals(object, secondaryRef.getOwnerReferenceSet().getOwner()))
                    return true;

                  return false;
                })
            .collect(Collectors.toList());
    for (final Link link : links) {
      EcoreUtil.delete(link);
    }

    if (object.getMirroredMetaInfoObject() != null)
      deleteDocumentingObjectFromTypeModel(object.getMirroredMetaInfoObject());

    EcoreUtil.delete(object);
  }

  public List<Attribute> getInstancedClassAttributes(final EObject eObject) {
    return ConML.castAndRunOrReturn(
        eObject,
        Object.class,
        (final Object object) -> {
          final Class instancedClass = object.getInstancedClass();
          if (instancedClass == null) {
            Activator.logError(Messages.getString("InstancedClassIsNull"));
            return Arrays.asList();
          } else return instancedClass.getAttributes();
        },
        Arrays.asList());
  }

  public boolean isMetaInfo(final Object object, final EObject containerObject) {
    if (!(containerObject instanceof Model)) return false;
    return object
        .getObjectMetaInformation()
        .stream()
        .map(MetaInformation::getModel)
        .anyMatch(model -> EcoreUtil.equals(model, containerObject));
  }

  private EContentAdapter objectChangesAdapter(final Object subscriberObject) {
    return new EContentAdapter() {
      @Override
      public void notifyChanged(Notification notification) {
        super.notifyChanged(notification);

        if (!(notification.getNotifier() instanceof EObject)
            || !(notification.getFeature() instanceof EStructuralFeature)) return;

        final EObject notifier = (EObject) notification.getNotifier();
        if (!EcoreUtil.equals(notifier.eClass(), subscriberObject.eClass()))
          return; // this is potentially wrong

        notifier.eSetDeliver(false);
        subscriberObject.eSetDeliver(false);

        final EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
        switch (notification.getEventType()) {
          case Notification.SET:
            subscriberObject.eSet(feature, notification.getNewValue());
            break;
          case Notification.UNSET:
            subscriberObject.eUnset(feature);
            break;

          case Notification.ADD:
          case Notification.ADD_MANY:
            if (feature instanceof EReference) {
              if ("ObjectMetaInformation".equalsIgnoreCase(feature.getName())) return;

              final EReference reference = (EReference) feature;
              Set<EObject> notificationValues = getNotificationValues(notification);
              if ("ValueSets".equalsIgnoreCase(reference.getName())) {
                subscriberObject
                    .getValueSets()
                    .addAll(
                        notificationValues
                            .stream()
                            .filter(ValueSet.class::isInstance)
                            .map(ValueSet.class::cast)
                            .map(EcoreUtil::copy)
                            .collect(Collectors.toList()));
              } else if ("ReferenceSets".equalsIgnoreCase(reference.getName())) {
                subscriberObject
                    .getReferenceSets()
                    .addAll(
                        notificationValues
                            .stream()
                            .filter(ReferenceSet.class::isInstance)
                            .map(ReferenceSet.class::cast)
                            .map(EcoreUtil::copy)
                            .collect(Collectors.toList()));
              }
            }
            break;

          case Notification.REMOVE:
          case Notification.REMOVE_MANY:
            if (feature instanceof EReference) {
              if ("ObjectMetaInformation".equalsIgnoreCase(feature.getName())) return;

              final EReference reference = (EReference) feature;
              Set<EObject> notificationValues = getNotificationValues(notification);
              if ("ValueSets".equalsIgnoreCase(reference.getName())) {
                subscriberObject.getValueSets().removeAll(notificationValues);
              } else if ("ReferenceSets".equalsIgnoreCase(reference.getName())) {
                subscriberObject.getReferenceSets().removeAll(notificationValues);
              }
            }
            break;
          case Notification.MOVE:
            break;
        }

        notifier.eSetDeliver(true);
        subscriberObject.eSetDeliver(true);
      };
    };
  }

  public void addMetaInfoObjectToModels(
      final Object object,
      final InstanceModel instanceModel,
      final Model model,
      final MetaInformation metaInfo) {
    final Object instanceModelObject = InstancesFactory.eINSTANCE.createObject();
    instanceModelObject.setIdentifier(object.getIdentifier());
    instanceModelObject.setCertainty(object.getCertainty());
    instanceModelObject.setInstancedClass(object.getInstancedClass());
    instanceModelObject.setTemporalExistentialQualifier(object.getTemporalExistentialQualifier());
    instanceModelObject.setSubjectiveExistentialQualifer(object.getSubjectiveExistentialQualifer());
    instanceModelObject.setMirroredMetaInfoObject(object);

    instanceModelObject.getValueSets();
    instanceModelObject.getReferenceSets();

    object.getInstancedClass().getInstanceObjects().add(instanceModelObject);
    instanceModel.getElements().add(instanceModelObject);

    model.getMetaInformationObjects().add(object);
    metaInfo.setMetaInfoObject(object);
    metaInfo.setModel(model);
    object.getObjectMetaInformation().add(metaInfo);

    object.eAdapters().add(objectChangesAdapter(instanceModelObject));
    instanceModelObject.eAdapters().add(objectChangesAdapter(object));
  }

  private Set<EObject> getNotificationValues(Notification notification) {
    final Set<EObject> values = Sets.newLinkedHashSet();
    java.lang.Object value = notification.getOldValue();
    if ((notification.getEventType() == Notification.ADD
            || notification.getEventType() == Notification.ADD_MANY)
        && notification.getFeature() instanceof EReference
        && notification.getNewValue() != null) {
      value = notification.getNewValue();
    }
    if (value instanceof Collection) {
      Iterables.addAll(values, Iterables.filter((Collection<?>) value, EObject.class));
    } else if (value instanceof EObject) {
      values.add((EObject) value);
    }
    return values;
  }

  public boolean shouldShowObjectInObjectDiagram(
      final Object object, final DSemanticDiagram diagram) {
    return object.getObjectMetaInformation().size() == 0
        || object
            .getObjectMetaInformation()
            .stream()
            .map(MetaInformation::getModel)
            .anyMatch(model -> EcoreUtil.equals(model, diagram.getTarget()));
  }

  public void deleteDocumentingObjectFromTypeModel(final Object object) {
    final EObject container = object.eContainer();
    if (!(container instanceof Model)) {
      Activator.logError(Messages.getString("ExceptionMessage.InvalidContainer"));
      return;
    }

    object.eSetDeliver(false);

    final Model model = (Model) container;
    object
        .getObjectMetaInformation()
        .stream()
        .filter(mi -> EcoreUtil.equals(mi.getModel(), model))
        .findAny()
        .ifPresent(EcoreUtil::delete);

    model.getMetaInformationObjects().remove(object);
    EcoreUtil.delete(object);
  }
}
