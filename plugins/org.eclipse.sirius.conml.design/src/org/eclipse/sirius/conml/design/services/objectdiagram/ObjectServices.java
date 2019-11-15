package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.services.classdiagram.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;

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

  public boolean isMetaInfo(final Object object) {
    return object.getMetaInfoInModel() != null;
  }

  public void addMetaInfoObjectToModels(
      final Object object, final InstanceModel instanceModel, final Model model) {
    instanceModel.getElements().add(object);
    object.setMetaInfoInModel(model);
  }
}
