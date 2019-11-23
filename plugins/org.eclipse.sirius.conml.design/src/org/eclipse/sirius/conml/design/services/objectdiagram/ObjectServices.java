package org.eclipse.sirius.conml.design.services.objectdiagram;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.UIServices;
import org.eclipse.sirius.conml.design.services.classdiagram.ModelElementServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.ModelElement;
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

  public void openSelectExistingObjectsDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingObjects"),
                Messages.getString("Dialog.SelectObjects"),
                ConMLPredicates.isInstanceOfClass(Object.class),
                null),
            Object.class);
  }

  public String objectLabel(final Object object) {
    return object.getIdentifier()
        + ": "
        + (object.getInstancedClass() != null ? object.getInstancedClass().getName() : "?");
  }

  public void moveObjectUp(final EObject object) {
    ConML.castAndRun(
        object,
        Object.class,
        obj ->
            ModelElementServices.getInstance()
                .moveInstanceModelElement(obj, Object.class, ConML.ElementMovementDirection.UP));
  }

  public void moveObjectDown(final EObject object) {
    ConML.castAndRun(
        object,
        Object.class,
        obj ->
            ModelElementServices.getInstance()
                .moveInstanceModelElement(obj, Object.class, ConML.ElementMovementDirection.DOWN));
  }

  public void deleteObject(final Object object) {
    final InstanceModel instanceModel = object.getInstanceModel();
    if (instanceModel == null) {
      EcoreUtil.delete(object);
      return;
    }

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

  public boolean shouldShowObjectInObjectDiagram(final Object object, final DDiagram diagram) {
    if (object.getDocumentedElements().isEmpty()) return true;
    return documentsAnyDisplayedNodes(object, diagram);
  }

  public boolean documentsAnyDisplayedNodes(final Object object, final DDiagram diagram) {
    final Set<EObject> displayedNodes = UIServices.getInstance().getDisplayedNodes(diagram);
    for (final ModelElement element : object.getDocumentedElements()) {
      if (displayedNodes.contains(element)) return true;
    }
    return false;
  }
}
