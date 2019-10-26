package org.eclipse.sirius.conml.design.util;

import org.eclipse.gmf.runtime.common.core.util.StringMatcher;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.ui.tools.internal.views.common.navigator.SiriusCommonLabelProvider;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.google.common.base.Predicate;

/**
 * Pattern matcher for model elements selection dialog. Derived from @see
 * DiagramElementsSelectionDialogPatternMatcher.
 *
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
@SuppressWarnings("restriction")
public class ModelElementsSelectionDialogPatternMatcher {

  private Predicate<Object> matchPredicate;

  private final StringMatcher stringMatcher;

  /**
   * Creates a new PatternMatcher.
   *
   * @param expreg the regular expression (for example '?a?' or 'abc' or '*c') ; <code>null</code>
   *     or empty regular expression will be replaced by '*'
   */
  public ModelElementsSelectionDialogPatternMatcher(String expreg) {
    String computedExpreg = expreg;
    if (expreg == null) {
      computedExpreg = ""; 
    }
    // If the regular expression ends with a space, we have to use the exact
    // value of the given expreg
    if (computedExpreg.endsWith(" ")) { 
      computedExpreg = computedExpreg.substring(0, computedExpreg.lastIndexOf(' '));
    } else {
      // Otherwise, we add a star to make 'XYZ' recognized by the 'X'
      // expreg (as in quick outline for example)
      computedExpreg = computedExpreg + "*"; 
    }
    stringMatcher = new StringMatcher(computedExpreg, true, false);
  }

  private ICommonLabelProvider labelProvider = null;

  public ICommonLabelProvider getLabelProvider() {
    if (labelProvider == null) {
      labelProvider = new SiriusCommonLabelProvider();
    }
    return labelProvider;
  }

  /**
   * Creates a {@link Predicate} that can be applied on any Object. This predicates will return true
   * if the tested element is a {@link DDiagramElement} and that its name is matching the regular
   * expression used to construct this Matcher.
   *
   * @return a {@link Predicate} that can be applied on any Object to determine if whether it's
   *     matching the regular expression used to construct this Matcher
   */
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
