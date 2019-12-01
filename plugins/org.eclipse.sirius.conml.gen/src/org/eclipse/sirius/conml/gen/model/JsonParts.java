package org.eclipse.sirius.conml.gen.model;

import java.util.List;

public final class JsonParts {
  private final List<JsonClass> classes;
  private final List<JsonEnumeratedType> enumTypes;

  public JsonParts(List<JsonClass> classes, List<JsonEnumeratedType> enumTypes) {
    this.classes = classes;
    this.enumTypes = enumTypes;
  }

  public List<JsonClass> getClasses() {
    return classes;
  }

  public List<JsonEnumeratedType> getEnumTypes() {
    return enumTypes;
  }
}
