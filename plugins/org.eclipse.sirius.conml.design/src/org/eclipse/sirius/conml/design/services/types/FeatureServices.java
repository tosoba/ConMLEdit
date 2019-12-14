package org.eclipse.sirius.conml.design.services.types;

import conml.types.Feature;

public final class FeatureServices {

  public void setConstant(final Feature feature, final Boolean constant) {
    feature.setConstant(constant);
  }

  public void setSorted(final Feature feature, final Boolean sorted) {
    feature.setSorted(sorted);
  }
}
