package org.eclipse.sirius.conml.design.services.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.Domain;
import conml.instances.ValueSet;
import conml.types.Attribute;
import conml.types.BaseDataType;
import conml.types.DataType;
import conml.types.EnumeratedType;
import conml.types.SimpleDataType;

public final class AttributeServices {

  public boolean hasInstanceValueSets(final Attribute attribute) {
    return !attribute.getInstanceValueSets().isEmpty();
  }

  public DataType getDataType(final Attribute attribute) {
    return attribute.getDatatype();
  }

  public List<EObject> getAllDataTypesForAttribute(final Attribute attribute) {
    if (attribute.getOwnerClass() == null || attribute.getOwnerClass().getTypeModel() == null)
      return new ArrayList<>();
    final Domain domain = (Domain) attribute.getOwnerClass().eContainer();
    if (attribute.getRedefinedAttribute() != null) {
      return getAllDataTypesForRedefiningAttribute(attribute);
    } else if (attribute.getRedefiningAttribute() != null) {
      return getAllDataTypesForRedefinedAttribute(attribute);
    } else {
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
  }

  public List<EObject> getAllDataTypesForRedefinedAttribute(final Attribute attribute) {
    final Attribute redefiningAttribute = attribute.getRedefiningAttribute();
    if (attribute.getOwnerClass() == null
        || redefiningAttribute == null
        || redefiningAttribute.getDatatype() == null
        || !(redefiningAttribute.getDatatype() instanceof SimpleDataType)) return new ArrayList<>();
    final SimpleDataType redefiningDataType = (SimpleDataType) redefiningAttribute.getDatatype();
    return findCompatibleDataTypesInDomain(
        (Domain) attribute.getOwnerClass().eContainer(),
        ConML.getBaseDataTypesCompatibleWithRedefining(redefiningDataType.getBase()));
  }

  public List<EObject> getAllDataTypesForRedefiningAttribute(final Attribute attribute) {
    final Attribute redefinedAttribute = attribute.getRedefinedAttribute();
    if (attribute.getOwnerClass() == null
        || redefinedAttribute == null
        || redefinedAttribute.getDatatype() == null
        || !(redefinedAttribute.getDatatype() instanceof SimpleDataType)) return new ArrayList<>();
    final SimpleDataType redefinedDataType = (SimpleDataType) redefinedAttribute.getDatatype();
    return findCompatibleDataTypesInDomain(
        (Domain) attribute.getOwnerClass().eContainer(),
        ConML.getBaseDataTypesCompatibleWithRedefined(redefinedDataType.getBase()));
  }

  private List<EObject> findCompatibleDataTypesInDomain(
      final Domain domain, final Set<BaseDataType> compatibleBaseTypes) {
    return domain
        .getParts()
        .stream()
        .filter(
            part ->
                part instanceof SimpleDataType
                    && compatibleBaseTypes.contains(((SimpleDataType) part).getBase()))
        .distinct()
        .collect(Collectors.toList());
  }

  public boolean hasSimpleDataType(final Attribute attribute) {
    return attribute.getDatatype() instanceof SimpleDataType;
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
        Messages.getString(
            "Dialog.AttributeHasValueSetsToBeDeletedOnDataTypeChanged",
            attribute.getInstanceValueSets().size()));
  }

  public boolean showAttributeHasValueSetsDialogOnAttributeMove(final Attribute attribute) {
    return showAttributeHasValueSetsDialog(
        Messages.getString(
            "Dialog.AttributeHasValueSetsToBeDeletedOnMove",
            attribute.getInstanceValueSets().size()));
  }

  public boolean showAttributeHasValueSetsDialogOnDelete(final Attribute attribute) {
    return showAttributeHasValueSetsDialog(
        Messages.getString(
            "Dialog.AttributeHasValueSetsToBeDeleted", attribute.getInstanceValueSets().size()));
  }

  public boolean showAttributeHasValueSetsDialog(String questionMsg) {
    return Dialogs.showSimpleQuestion(
        Messages.getString("Dialog.AttributeHasValueSets"), questionMsg);
  }
}
