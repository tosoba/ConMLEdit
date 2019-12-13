package org.eclipse.sirius.conml.design.services.types;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.conml.design.dialog.ExistingSemanticElementsSelectionDialog;
import org.eclipse.sirius.conml.design.dialog.TypeModelSelectionDialog;
import org.eclipse.sirius.conml.design.services.common.ExistingElementsServices;
import org.eclipse.sirius.conml.design.services.common.ModelServices;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.diagram.DDiagram;

import conml.Domain;
import conml.instances.InstanceModel;
import conml.types.Association;
import conml.types.Class;
import conml.types.EnumeratedType;
import conml.types.Generalization;
import conml.types.Package;
import conml.types.SimpleDataType;
import conml.types.TypeModel;

public final class TypeModelServices {

  private static final class InstanceHolder {
    static final TypeModelServices INSTANCE = new TypeModelServices();
  }

  public static TypeModelServices getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public Collection<EObject> getOwnedPackageElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Package.class);
  }

  public Collection<EObject> getOwnedAssociationElements(final EObject object) {
    return ModelServices.getInstance()
        .getOwnedElementsOfTypeStream(object, Association.class)
        // TODO: should Associations with redefined Semis be filtered out here?
        .filter(association -> !association.isCompact())
        .collect(Collectors.toList());
  }

  public Collection<EObject> getOwnedSimpleDataTypeElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, SimpleDataType.class);
  }

  public Collection<EObject> getOwnedEnumeratedTypeElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, EnumeratedType.class);
  }

  public Collection<EObject> getOwnedClassElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Class.class);
  }

  public Collection<EObject> getOwnedGeneralizationElements(final EObject object) {
    return ModelServices.getInstance().getOwnedElementsOfType(object, Generalization.class);
  }

  public Package getOverallPackageOfModel(final TypeModel model) {
    return model
        .getElements()
        .stream()
        .filter(
            element -> {
              if (!(element instanceof Package)) return false;
              final Package otherPackage = (Package) element;
              return otherPackage.isOverall();
            })
        .map(Package.class::cast)
        .findAny()
        .orElse(null);
  }

  public TypeModel showTypeModelSelectionDialog(
      final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new TypeModelSelectionDialog(
                    Messages.getString("Dialog.SelectTypeModel"),
                    Messages.getString("Dialog.SelectTypeModelContainerForClass"),
                    (Domain) selectedContainer),
                false);
    if (result.size() == 1 && result.get(0) instanceof TypeModel) return (TypeModel) result.get(0);
    else return null;
  }

  public TypeModel showSimpleTypeModelSelectionDialog(
      final EObject selectedContainer, final DDiagram diagram) {
    final List<Object> result =
        ExistingElementsServices.getInstance()
            .openSelectExistingElementsDialog(
                selectedContainer,
                diagram,
                new ExistingSemanticElementsSelectionDialog(
                    Messages.getString("Dialog.SelectTypeModel"),
                    Messages.getString("Dialog.SelectTypeModelContainer"),
                    ConMLPredicates.isInstanceOfClass(TypeModel.class),
                    false),
                false);
    if (result.size() == 1 && result.get(0) instanceof TypeModel) return (TypeModel) result.get(0);
    else return null;
  }

  public void setBaseTypeModel(final TypeModel particularTypeModel, final TypeModel baseTypeModel) {
    particularTypeModel.setBaseTypeModel(baseTypeModel);
  }

  public void setConformingInstanceModel(
      final TypeModel typeModel, final InstanceModel instanceModel) {
    typeModel.setConformingInstanceModel(instanceModel);
  }

  public void openSelectExistingTypeModelsDialog(
      final EObject selectedContainer,
      final EObject selectedContainerView,
      final DDiagram diagram) {
    ExistingElementsServices.getInstance()
        .openSelectExistingElementsDialogAndAddElements(
            selectedContainer,
            selectedContainerView,
            diagram,
            new ExistingSemanticElementsSelectionDialog(
                Messages.getString("Dialog.AddExistingTypeModels"),
                Messages.getString("Dialog.SelectTypeModels"),
                ConMLPredicates.isInstanceOfClass(TypeModel.class),
                null),
            TypeModel.class);
  }
}
