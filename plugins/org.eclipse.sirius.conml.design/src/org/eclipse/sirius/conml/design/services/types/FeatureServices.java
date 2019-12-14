package org.eclipse.sirius.conml.design.services.types;

import org.eclipse.sirius.conml.design.dialog.Dialogs;
import org.eclipse.sirius.conml.design.util.messages.Messages;

import conml.types.Feature;

public final class FeatureServices {

  public void setConstant(final Feature feature, final Boolean constant) {
    feature.setConstant(constant);
  }

  public void setSorted(final Feature feature, final Boolean sorted) {
    feature.setSorted(sorted);
  }

  public void setFeatureMinimumCardinality(final Feature feature, final String cardinalityStr) {
    if (cardinalityStr == null || cardinalityStr.isEmpty()) {
      feature.setMinimumCardinality(0);
    } else {
      try {
        int cardinality = Integer.parseInt(cardinalityStr);
        if (cardinality >= 0) feature.setMinimumCardinality(cardinality);
        else
          Dialogs.showError(
              Messages.getString("Message.CardinalityWasNotSet"),
              Messages.getString("Error.ExpectedNonNegativeIntegerInput"));
      } catch (NumberFormatException e) {
        Dialogs.showError(
            Messages.getString("Message.CardinalityWasNotSet"),
            Messages.getString("Error.ExpectedNonNegativeIntegerInput"));
      }
    }
  }

  public void setFeatureMaximumCardinality(final Feature feature, final String cardinalityStr) {
    if (cardinalityStr == null || cardinalityStr.isEmpty()) {
      feature.setMaximumCardinality(null);
    } else {
      try {
        final int cardinality = Integer.parseInt(cardinalityStr);
        if (cardinality > 0) feature.setMaximumCardinality(cardinality);
        else
          Dialogs.showError(
              Messages.getString("Message.CardinalityWasNotSet"),
              Messages.getString("Error.ExpectedPositiveIntegerInput"));
      } catch (NumberFormatException e) {
        Dialogs.showError(
            Messages.getString("Message.CardinalityWasNotSet"),
            Messages.getString("Error.ExpectedPositiveIntegerInput"));
      }
    }
  }
}
