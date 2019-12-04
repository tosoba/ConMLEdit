package org.eclipse.sirius.conml.gen.model;

public final class JsonEnumeratedItem {
  private final String name;
  private final String definition;
  private final String href;

  public JsonEnumeratedItem(String name, String definition, String href) {
    this.name = name;
    this.definition = definition;
    this.href = href;
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
  }

  public String getHref() {
    return href;
  }
}
