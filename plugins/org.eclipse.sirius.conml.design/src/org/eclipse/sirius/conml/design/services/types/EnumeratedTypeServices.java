package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.swt.graphics.Image;

import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
import conml.types.Package;

public final class EnumeratedTypeServices {

  private static final class InstanceHolder {
    static final EnumeratedTypeServices INSTANCE = new EnumeratedTypeServices();
  }

  public static EnumeratedTypeServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public boolean enumTypeGeneralizationPrecondition(
      final EnumeratedType preSubType, final EnumeratedType preSuperType) {
    EnumeratedType enumTypeIt = preSuperType;
    while (enumTypeIt != null) {
      if (EcoreUtil.equals(enumTypeIt, enumTypeIt.getSuperType())
          || EcoreUtil.equals(enumTypeIt, preSubType)) return false;
      enumTypeIt = enumTypeIt.getSuperType();
    }
    return true;
  }

  public void setSuperType(final EnumeratedType subType, final EnumeratedType superType) {
    subType.setSuperType(superType);
  }

  public void addUnpackagedEnumeratedTypesToPackage(
      final Package selectedContainer, final DDiagram diagram) {
    final List<EnumeratedType> enumTypes =
        showUnpackagedEnumeratedTypeSelectionDialog(selectedContainer, diagram);
    if (enumTypes != null) {
      enumTypes.forEach(type -> setEnumTypeContainerPackage(type, selectedContainer));
    }
  }

  public List<EnumeratedType> showUnpackagedEnumeratedTypeSelectionDialog(
      final Package selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer.eContainer(),
                diagram,
                new ExistingSemanticElementsSelectionDialog(
                    Messages.getString("Dialog.SelectEnumeratedType"),
                    Messages.getString("Dialog.SelectUnpackagedEnumeratedType"),
                    (Object obj) -> {
                      if (!(obj instanceof EnumeratedType)) return false;
                      final EnumeratedType unpackagedEnumTypeCandidate = (EnumeratedType) obj;
                      return unpackagedEnumTypeCandidate.getPackage() == null
                          && EcoreUtil.equals(
                              unpackagedEnumTypeCandidate.getTypeModel(),
                              selectedContainer.getTypeModel());
                    },
                    true,
                    null),
                false);
    return result != null && result.size() > 0
        ? result
            .stream()
            .filter(EnumeratedType.class::isInstance)
            .map(EnumeratedType.class::cast)
            .collect(Collectors.toList())
        : null;
  }

  public boolean superItemsExistInHierarchy(final EnumeratedType enumType) {
    return !enumType.getOwnedItems().isEmpty()
        || superItemsExistInHierarchy(enumType, enumType.getSuperType());
  }

  private boolean superItemsExistInHierarchy(
      final EnumeratedType chosenType, final EnumeratedType currentType) {
    if (currentType == null || EcoreUtil.equals(chosenType, currentType)) return false;
    else
      return !currentType.getOwnedItems().isEmpty()
          || superItemsExistInHierarchy(chosenType, currentType.getSuperType());
  }

  public void setEnumTypeContainerPackage(
      final EnumeratedType enumType, final conml.types.Package container) {
    enumType.setPackage(container);
  }

  public void openSelectExistingEnumeratedTypesDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingEnumeratedTypes"),
                Messages.getString("Dialog.SelectEnumeratedTypes"),
                ConMLPredicates.isInstanceOfAnyOfClasses(EnumeratedType.class),
                null),
            EnumeratedType.class);
  }

  public boolean canOwnTopLevelEnumItems(final EnumeratedType enumType) {
    return enumType.getSuperType() == null;
  }

  public List<EObject> superEnumItemCandidates(final EnumeratedType enumTypeOwner) {
    return elementsForSuperItemSelection(enumTypeOwner, true, true);
  }

  public List<EObject> superEnumItemRoots(final EnumeratedType enumTypeOwner) {
    return elementsForSuperItemSelection(enumTypeOwner, true, false);
  }

  public List<EObject> superEnumItemChildren(final EnumeratedType enumTypeOwner) {
    return elementsForSuperItemSelection(enumTypeOwner, false, true);
  }

  private List<EObject> elementsForSuperItemSelection(
      final EnumeratedType enumTypeOwner, final boolean includeTypes, final boolean includeItems) {
    final ArrayList<EObject> candidates = new ArrayList<>();
    EnumeratedType enumTypeIt = enumTypeOwner;
    while (enumTypeIt != null) {
      if (includeTypes) candidates.add(enumTypeIt);
      if (includeItems && !enumTypeIt.getOwnedItems().isEmpty())
        candidates.addAll(enumTypeIt.getOwnedItems());
      if (EcoreUtil.equals(enumTypeIt, enumTypeIt.getSuperType())) return new ArrayList<>();
      enumTypeIt = enumTypeIt.getSuperType();
    }
    return candidates;
  }

  public EnumeratedItem showEnumeratedItemSelectionDialog(final EnumeratedType enumType) {
    return Dialogs.showSingleTreeSelectionDialog(
        enumType.eContainer(),
        Messages.getString("Dialog.AddSubEnumeratedItem"),
        Messages.getString("Dialog.SelectSuperEnumeratedItem"),
        new LabelProvider() {
          @Override
          public String getText(Object element) {
            if (element instanceof EnumeratedType) return ((EnumeratedType) element).getName();
            else if (element instanceof EnumeratedItem)
              return EnumeratedItemServices.getInstance()
                  .getAbsoluteNameOfEnumeratedItem((EnumeratedItem) element);
            return super.getText(element);
          }

          @Override
          public Image getImage(Object element) {
            if (element instanceof EnumeratedType)
              return Activator.getDefault().getImage("icons/EnumeratedType.gif");
            else if (element instanceof EnumeratedItem)
              return Activator.getDefault().getImage("icons/EnumeratedItem.gif");
            return super.getImage(element);
          }
        },
        new ITreeContentProvider() {
          @Override
          public boolean hasChildren(Object element) {
            return element instanceof EnumeratedType
                && !((EnumeratedType) element).getOwnedItems().isEmpty();
          }

          @Override
          public Object getParent(Object element) {
            if (element instanceof EnumeratedItem) return ((EnumeratedItem) element).getOwnerType();
            return null;
          }

          @Override
          public Object[] getElements(Object inputElement) {
            return elementsForSuperItemSelection(enumType, true, false).toArray();
          }

          @Override
          public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof EnumeratedType)
              return ((EnumeratedType) parentElement).getOwnedItems().toArray();
            else return new Object[] {};
          }
        },
        EnumeratedItem.class);
  }
}
