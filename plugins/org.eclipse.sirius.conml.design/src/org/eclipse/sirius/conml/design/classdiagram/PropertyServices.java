package org.eclipse.sirius.conml.design.classdiagram;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.sirius.properties.DynamicMappingForDescription;
import org.eclipse.sirius.properties.ViewExtensionDescription;

public class PropertyServices {

  public void disableOverridenReferenceIf(ViewExtensionDescription description) {
    disableOverridenIf(description, "general_reference_if");
  }

  private void disableOverridenIf(
      ViewExtensionDescription description, String ifName) {
    Optional.ofNullable(description.getCategories())
        .flatMap(categories -> categories.stream().findFirst())
        .flatMap(category -> Optional.ofNullable(category.getGroups()))
        .flatMap(groups -> groups.stream().findFirst())
        .flatMap(group -> Optional.ofNullable(group.getControls()))
        .flatMap(controls -> controls.stream().findFirst())
        .filter(control -> control instanceof DynamicMappingForDescription)
        .map(control -> (DynamicMappingForDescription) control)
        .flatMap(control -> Optional.ofNullable(control.getIfs()))
        .flatMap(
            ifs ->
                ifs.stream()
                    .filter(ifDescription -> Objects.equals(ifName, ifDescription.getName()))
                    .findAny())
        .ifPresent(ifToDisable -> ifToDisable.setPredicateExpression("aql:false"));
  }
}
