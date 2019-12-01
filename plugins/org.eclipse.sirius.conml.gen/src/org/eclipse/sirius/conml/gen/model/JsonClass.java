package org.eclipse.sirius.conml.gen.model;

import java.util.List;

public final class JsonClass {
  private final String name;
  private final String definition;
  private final String comments;
  private final String href;
  private final List<String> discriminants;
  private final List<JsonFeature> features;

  public JsonClass(
      String name,
      String definition,
      String comments,
      String href,
      List<String> discriminants,
      List<JsonFeature> features) {
    this.name = name;
    this.definition = definition;
    this.comments = comments;
    this.href = href;
    this.discriminants = discriminants;
    this.features = features;
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

  public List<String> getDiscriminants() {
    return discriminants;
  }

  public List<JsonFeature> getFeatures() {
    return features;
  }
}
