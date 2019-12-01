package org.eclipse.sirius.conml.gen.model;

import java.util.List;

public final class JsonEnumeratedType {
  private final String name;
  private final String definition;
  private final String comments;
  private final String href;
  private final List<JsonEnumeratedItem> items;

  public JsonEnumeratedType(
      String name,
      String definition,
      String comments,
      String href,
      List<JsonEnumeratedItem> items) {
    this.name = name;
    this.definition = definition;
    this.comments = comments;
    this.href = href;
    this.items = items;
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
  }

  public String getComments() {
    return comments;
  }

  public String getHref() {
    return href;
  }

  public List<JsonEnumeratedItem> getItems() {
    return items;
  }
}
