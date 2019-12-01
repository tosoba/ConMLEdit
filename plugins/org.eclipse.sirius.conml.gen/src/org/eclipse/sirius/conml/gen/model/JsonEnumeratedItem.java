package org.eclipse.sirius.conml.gen.model;

public final class JsonEnumeratedItem {
  private final String name;
  private final String definition;

  public JsonEnumeratedItem(String name, String definition) {
    this.name = name;
    this.definition = definition;
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
  }
}
