package org.eclipse.sirius.conml.design.services.types;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.types.EnumeratedType;
import conml.types.Package;

public final class EnumeratedTypeServices {

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
                ConMLPredicates.isInstanceOfClass(EnumeratedType.class),
                null),
            EnumeratedType.class);
  }

  public boolean canOwnTopLevelEnumItems(final EnumeratedType enumType) {
    return enumType.getSuperType() == null;
  }
}
