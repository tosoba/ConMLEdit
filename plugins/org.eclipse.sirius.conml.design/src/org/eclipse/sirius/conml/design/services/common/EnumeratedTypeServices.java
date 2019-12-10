package org.eclipse.sirius.conml.design.services.common;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.types.EnumeratedType;
import conml.types.Package;

public final class EnumeratedTypeServices {

  public boolean doesNotHaveSuperType(final EnumeratedType enumType) {
    return enumType.getSuperType() == null;
  }

  public void addSubType(final EnumeratedType superType, final EnumeratedType subType) {
    superType.getSubTypes().add(subType);
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
                selectedContainer,
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
}
