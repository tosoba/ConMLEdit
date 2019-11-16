package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.services.classdiagram.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DSemanticDiagram;

import conml.MetaInformation;
import conml.Model;
import conml.instances.InstanceModel;
import conml.instances.Link;
import conml.instances.Object;
import conml.instances.Reference;
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

  public void addMetaInfoObjectToModels(
      final Object object,
      final InstanceModel instanceModel,
      final Model model,
      final MetaInformation metaInfo) {
    final Object instanceModelObject = EcoreUtil.copy(object);
    instanceModelObject.setMirroredMetaInfoObject(object);
    instanceModelObject.setInstancedClass(object.getInstancedClass());
    object.getInstancedClass().getInstanceObjects().add(instanceModelObject);
    instanceModel.getElements().add(instanceModelObject);

    model.getMetaInformationObjects().add(object);
    metaInfo.setMetaInfoObject(object);
    metaInfo.setModel(model);
    object.getObjectMetaInformation().add(metaInfo);

    EContentAdapter objectContentAdapter =
        new EContentAdapter() {
          @Override
          public void notifyChanged(Notification notification) {
            super.notifyChanged(notification);
            if (!(notification.getNotifier() instanceof EObject)) return;
            final EObject notifier = (EObject) notification.getNotifier();
            if (notifier.eContainer() == null) return;

            if (notification.getFeature() instanceof EStructuralFeature) {
              instanceModelObject.eSetDeliver(false);
              final EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
              if (feature.getUpperBound() == 1)
                instanceModelObject.eSet(
                    (EStructuralFeature) notification.getFeature(), notification.getNewValue());
              instanceModelObject.eSetDeliver(true);
            }
          };
        };
    object.eAdapters().add(objectContentAdapter);

    EContentAdapter instanceModelObjectContentAdapter =
        new EContentAdapter() {
          @Override
          public void notifyChanged(Notification notification) {
            super.notifyChanged(notification);
            if (!(notification.getNotifier() instanceof EObject)) return;
            final EObject notifier = (EObject) notification.getNotifier();
            if (notifier.eContainer() == null) return;

            if (notification.getFeature() instanceof EStructuralFeature) {
              object.eSetDeliver(false);
              final EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
              if (feature.getUpperBound() == 1)
                object.eSet(
                    (EStructuralFeature) notification.getFeature(), notification.getNewValue());
              object.eSetDeliver(true);
            }
          };
        };
    instanceModelObject.eAdapters().add(instanceModelObjectContentAdapter);
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
