package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
import org.eclipse.sirius.conml.design.services.common.UIServices;
import org.eclipse.sirius.conml.design.services.instances.ObjectServices;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import conml.Domain;
import conml.NamedElement;
import conml.instances.InstanceModel;
import conml.types.Association;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Generalization;
import conml.types.Package;
import conml.types.SemiAssociation;

public final class ClassServices {

  private static final class InstanceHolder {
    static final ClassServices INSTANCE = new ClassServices();
  }

  public static ClassServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public SemiAssociation showRedefinedSemiAssociationDialog(final Class clazz) {
    final ElementTreeSelectionDialog dialog =
        new ElementTreeSelectionDialog(
            PlatformUI.getWorkbench().getDisplay().getActiveShell(),
            new LabelProvider() {
              @Override
              public String getText(Object element) {
                if (element instanceof Class) return "Class " + ((Class) element).getName();
                else if (element instanceof SemiAssociation) {
                  final SemiAssociation semi = (SemiAssociation) element;
                  final StringBuilder label = new StringBuilder(semi.getName());
                  if (semi.getReferredClass() != null)
                    label.append(" -> ").append(semi.getReferredClass().getName());
                  return label.toString();
                }
                return ((NamedElement) element).getName();
              }

              @Override
              public Image getImage(Object element) {
                if (element instanceof Class)
                  return Activator.getDefault().getImage("icons/Class.gif");
                else if (element instanceof SemiAssociation)
                  return Activator.getDefault().getImage("icons/Association.gif");
                return super.getImage(element);
              }
            },
            new ITreeContentProvider() {
              @Override
              public boolean hasChildren(Object element) {
                return element instanceof Class
                    && !((Class) element).getSemiAssociations().isEmpty();
              }

              @Override
              public Object getParent(Object element) {
                if (element instanceof SemiAssociation)
                  return ((SemiAssociation) element).getOwnerClass();
                return null;
              }

              @Override
              public Object[] getElements(Object inputElement) {
                return getAllAncestorsOf((Class) inputElement).stream().toArray();
              }

              @Override
              public Object[] getChildren(Object parentElement) {
                return ((Class) parentElement).getSemiAssociations().stream().toArray();
              }
            });
    dialog.setInput(clazz);
    dialog.setTitle(Messages.getString("Dialog.RedefineSemiAssociation"));
    dialog.setMessage(Messages.getString("Dialog.SelectSemiAssociationToRedefine"));
    if (dialog.open() != Window.OK) return null;
    final Object[] result = dialog.getResult();
    if (result != null && result.length == 1 && result[0] instanceof SemiAssociation)
      return (SemiAssociation) result[0];
    else return null;
  }

  private Set<Class> getAllAncestorsOf(final Class clazz) {
    final Set<Class> ancestors = new HashSet<>();
    addAncestors(clazz, ancestors);
    return ancestors;
  }

  private void getAncestors(final Class clazz, final Set<Class> currentAncestors) {
    currentAncestors.add(clazz);
    addAncestors(clazz, currentAncestors);
  }

  private void addAncestors(final Class clazz, final Set<Class> currentElements) {
    clazz
        .getGeneralizations()
        .forEach(
            generalization -> getAncestors(generalization.getGeneralizedClass(), currentElements));
  }

  public boolean allVisibleClassesAreFromTheSameTypeModel(final DDiagram diagram) {
    return UIServices.getInstance()
            .getDisplayedNodesOfType(diagram, Class.class)
            .stream()
            .map(Class::getTypeModel)
            .distinct()
            .count()
        <= 1;
  }

  public void openSelectExistingClassesDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingClasses"),
                Messages.getString("Dialog.SelectClasses"),
                ConMLPredicates.isInstanceOfClass(Class.class),
                null),
            Class.class);
  }

  public void moveClassUp(final EObject object) {
    ConML.castAndRun(
        object,
        Class.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(clazz, Class.class, ConML.ElementMovementDirection.UP));
  }

  public void moveClassDown(final EObject object) {
    ConML.castAndRun(
        object,
        Class.class,
        clazz ->
            ModelElementServices.getInstance()
                .moveTypeModelElement(clazz, Class.class, ConML.ElementMovementDirection.DOWN));
  }

  public void deleteClass(final Class clazz) {
    if (!(clazz.eContainer() instanceof Domain)) {
      EcoreUtil.delete(clazz);
      return;
    }

    final List<Association> associations =
        ConML.getStreamOfAllPartsOfTypeFromDomain((Domain) clazz.eContainer(), Association.class)
            .filter(
                association -> {
                  final SemiAssociation primarySemi = association.getPrimarySemiAssociation();
                  if (primarySemi != null && clazz.getSemiAssociations().contains(primarySemi))
                    return true;

                  final SemiAssociation secondarySemi = association.getSecondarySemiAssociation();
                  if (secondarySemi != null && clazz.getSemiAssociations().contains(secondarySemi))
                    return true;

                  return false;
                })
            .collect(Collectors.toList());

    for (final Association association : associations) {
      AssociationServices.getInstance().deleteAssociation(association);
    }

    for (final conml.instances.Object instance : new ArrayList<>(clazz.getInstanceObjects())) {
      ObjectServices.getInstance().deleteObject(instance);
    }

    EcoreUtil.delete(clazz);
  }

  public Class showClassSelectionDialog(final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new ExistingSemanticElementsSelectionDialog(
                    Messages.getString("Dialog.SelectClass"),
                    Messages.getString("Dialog.SelectInstancedClass"),
                    (Object obj) -> {
                      if (!(obj instanceof Class)) return false;
                      final Class instancedClassCandidate = (Class) obj;
                      return instancedClassCandidate.getTypeModel() != null;
                    },
                    false,
                    null),
                false);
    if (result.size() == 1 && result.get(0) instanceof Class) return (Class) result.get(0);
    else return null;
  }

  public void addUnpackagedClassesToPackage(
      final Package selectedContainer, final DDiagram diagram) {
    final List<Class> classes = showUnpackagedClassSelectionDialog(selectedContainer, diagram);
    if (classes != null) {
      classes.forEach(clazz -> setClassContainerPackage(clazz, selectedContainer));
    }
  }

  public List<Class> showUnpackagedClassSelectionDialog(
      final Package selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer.eContainer(),
                diagram,
                new ExistingSemanticElementsSelectionDialog(
                    Messages.getString("Dialog.SelectClass"),
                    Messages.getString("Dialog.SelectUnpackagedClass"),
                    (Object obj) -> {
                      if (!(obj instanceof Class)) return false;
                      final Class unpackagedClassCandidate = (Class) obj;
                      return unpackagedClassCandidate.getPackage() == null
                          && EcoreUtil.equals(
                              unpackagedClassCandidate.getTypeModel(),
                              selectedContainer.getTypeModel());
                    },
                    true,
                    null),
                false);
    return result != null && result.size() > 0
        ? result
            .stream()
            .filter(Class.class::isInstance)
            .map(Class.class::cast)
            .collect(Collectors.toList())
        : null;
  }

  public void showClassSelectionDialogForObjectDiagram(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    final Set<Class> displayedObjectsInstancedClasses = new HashSet<>();
    final Set<Class> displayedClasses = new HashSet<>();
    UIServices.getInstance()
        .getDisplayedNodes(diagram)
        .forEach(
            obj -> {
              if (obj instanceof conml.instances.Object) {
                final conml.instances.Object object = (conml.instances.Object) obj;
                if (object.getInstancedClass() != null)
                  displayedObjectsInstancedClasses.add(object.getInstancedClass());
              } else if (obj instanceof Class) {
                displayedClasses.add((Class) obj);
              }
            });
    final Set<Class> displayedClassesGeneralizedClasses =
        displayedClasses
            .stream()
            .map(Class::getGeneralizations)
            .flatMap(Collection::stream)
            .map(Generalization::getGeneralizedClass)
            .collect(Collectors.toSet());

    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.SelectClass"),
                Messages.getString("Dialog.SelectClassToAddToObjectDiagram"),
                (Object obj) -> {
                  if (!(obj instanceof Class)) return false;

                  final Class classCandidate = (Class) obj;
                  if (classCandidate.getTypeModel() == null
                      || displayedClasses.contains(classCandidate)) {
                    return false;
                  }
                  if (displayedObjectsInstancedClasses.contains(classCandidate)
                      || displayedClassesGeneralizedClasses.contains(classCandidate)) {
                    return true;
                  }

                  return false;
                },
                false,
                null),
            Class.class);
  }

  public void setClassContainerPackage(final Class clazz, final Package container) {
    clazz.setPackage(container);
  }

  public List<EnumeratedType> getEnumeratedTypesFromTypeModelOfClass(final Class clazz) {
    if (clazz.getTypeModel() == null) return new ArrayList<>();
    else
      return ConML.getStreamOfAllElementsOfTypeFromModel(clazz.getTypeModel(), EnumeratedType.class)
          .collect(Collectors.toList());
  }

  public Class showClassSelectionFromConformedTypeModelsDialog(
      final EObject selectedContainer, final DDiagram diagram, final InstanceModel instanceModel) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new ExistingSemanticElementsSelectionDialog(
                    Messages.getString("Dialog.SelectClass"),
                    Messages.getString("Dialog.SelectInstancedClass"),
                    (Object object) -> {
                      if (!(object instanceof Class)) return false;
                      final Class clazz = (Class) object;
                      return clazz.getTypeModel() != null
                          && instanceModel.getConformedTypeModels().contains(clazz.getTypeModel());
                    },
                    false),
                false);
    if (result.size() == 1 && result.get(0) instanceof Class) return (Class) result.get(0);
    else return null;
  }
}
