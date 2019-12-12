package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.Domain;
import conml.instances.ValueSet;
import conml.types.Attribute;
import conml.types.Class;
import conml.types.DataType;
import conml.types.EnumeratedType;
import conml.types.SimpleDataType;

public final class AttributeServices {

  public boolean hasInstanceValueSets(final Attribute attribute) {
    return !attribute.getInstanceValueSets().isEmpty();
  }

  public List<EObject> getAllDataTypesForAttribute(final Attribute attribute) {
    if (attribute.getOwnerClass() == null || attribute.getOwnerClass().getTypeModel() == null)
      return new ArrayList<>();
    final Domain domain = (Domain) attribute.getOwnerClass().eContainer();
    return domain
        .getParts()
        .stream()
        .filter(
            part ->
                !EcoreUtil.equals(attribute.getDatatype(), part)
                    && (part instanceof SimpleDataType
                        || (part instanceof EnumeratedType
                            && EcoreUtil.equals(
                                ((EnumeratedType) part).getTypeModel(),
                                attribute.getOwnerClass().getTypeModel()))))
        .collect(Collectors.toList());
  }

  public void setDataTypeOfAttribute(final Attribute attribute, final DataType dataType) {
    attribute.setDatatype(dataType);
  }

  public void removeValueSets(final Attribute attribute) {
    final List<ValueSet> valueSets = new ArrayList<>(attribute.getInstanceValueSets());
    valueSets.forEach(EcoreUtil::delete);
  }

  public boolean showAttributeHasValueSetsDialogOnDataTypeChange(final Attribute attribute) {
    return showAttributeHasValueSetsDialog(
        attribute,
        Messages.getString(
            "Dialog.AttributeHasValueSetsToBeDeletedOnDataTypeChanged",
            attribute.getInstanceValueSets().size()));
  }

  public boolean showAttributeHasValueSetsDialogOnAttributeMove(final Attribute attribute) {
    return showAttributeHasValueSetsDialog(
        attribute,
        Messages.getString(
            "Dialog.AttributeHasValueSetsToBeDeletedOnMove",
            attribute.getInstanceValueSets().size()));
  }

  public boolean showAttributeHasValueSetsDialogOnDelete(final Attribute attribute) {
    return showAttributeHasValueSetsDialog(
        attribute,
        Messages.getString(
            "Dialog.AttributeHasValueSetsToBeDeleted", attribute.getInstanceValueSets().size()));
  }

  public boolean showAttributeHasValueSetsDialog(final Attribute attribute, String questionMsg) {
    return Dialogs.show(
            Messages.getString("Dialog.AttributeHasValueSets"),
            questionMsg,
            new String[] {Messages.getString("Message.Ok"), Messages.getString("Message.Cancel")},
            MessageDialog.QUESTION)
        == 0;
  }

  public void showExistingAttributesSelectionDialog(
      final Class clazz, final EObject selectedContainerView, final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            clazz,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingPackages"),
                Messages.getString("Dialog.SelectPackages"),
                ConMLPredicates.isInstanceOfClass(Attribute.class),
                null),
            Attribute.class);
  }
}
