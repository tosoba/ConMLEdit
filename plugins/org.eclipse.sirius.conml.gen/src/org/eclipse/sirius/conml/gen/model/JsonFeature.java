package org.eclipse.sirius.conml.gen.model;

import com.google.gson.annotations.SerializedName;

public final class JsonFeature {
  private final String name;
  private final String definition;
  private final String href;
  private final Type type;

  public JsonFeature(String name, String definition, String href, Type type) {
    this.name = name;
    this.definition = definition;
    this.href = href;
    this.type = type;
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

  public Type getType() {
    return type;
  }

  public enum Type {
    @SerializedName("Attribute")
    ATTRIBUTE("Attribute"),
    @SerializedName("Association")
    ASSOCIATION("Association");

    private String name;

    private Type(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }
}
