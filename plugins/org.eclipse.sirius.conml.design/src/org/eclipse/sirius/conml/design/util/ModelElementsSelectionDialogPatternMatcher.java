package org.eclipse.sirius.conml.design.util;

import org.eclipse.gmf.runtime.common.core.util.StringMatcher;
import org.eclipse.sirius.ui.tools.internal.views.common.navigator.SiriusCommonLabelProvider;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.google.common.base.Predicate;

@SuppressWarnings("restriction")
public class ModelElementsSelectionDialogPatternMatcher {

  private final StringMatcher stringMatcher;

  public ModelElementsSelectionDialogPatternMatcher(final String expreg) {
    String computedExpreg = expreg;
    if (expreg == null) computedExpreg = "";

    if (computedExpreg.endsWith(" "))
      computedExpreg = computedExpreg.substring(0, computedExpreg.lastIndexOf(' '));
    else computedExpreg = computedExpreg + "*";

    stringMatcher = new StringMatcher(computedExpreg, true, false);
  }

  private ICommonLabelProvider labelProvider = null;

  public ICommonLabelProvider getLabelProvider() {
    if (labelProvider == null) labelProvider = new SiriusCommonLabelProvider();
    return labelProvider;
  }

  private Predicate<Object> matchPredicate;

  public Predicate<Object> getMatchPredicate() {
    if (matchPredicate == null) {
      matchPredicate =
          input -> {
            final ICommonLabelProvider labelProvider = getLabelProvider();
            final String displayedLabel = labelProvider.getText(input);
            return stringMatcher.match(displayedLabel);
          };
    }
    return matchPredicate;
  }
}
