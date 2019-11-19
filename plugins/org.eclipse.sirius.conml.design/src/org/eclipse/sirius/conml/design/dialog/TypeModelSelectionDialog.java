package org.eclipse.sirius.conml.design.dialog;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.sirius.conml.design.util.Comparators;
import org.eclipse.sirius.conml.design.util.LabelProviders;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import conml.NamedElement;
import conml.types.TypeModel;

public final class TypeModelSelectionDialog extends EObjectSelectionDialog<TypeModel> {

  public TypeModelSelectionDialog(
      Shell shell, final Collection<TypeModel> partsToSelect, final String headerText) {
    super(
        shell,
        partsToSelect,
        headerText,
        LabelProviders.namedElementLabelProvider(),
        LabelProviders.describableElementLabelProvider());
  }

  @Override
  protected Control createExtendedContentArea(Composite parent) {
    // TODO: new TypeModel button opening simple TypeModel creation dialog with name, version,
    // description and defaultLanguage
    return super.createExtendedContentArea(parent);
  }

  @Override
  protected ItemsFilter createFilter() {
    return new NamedElementItemFilter();
  }

  @Override
  protected Comparator<NamedElement> getItemsComparator() {
    return Comparators.namedElements();
  }

  @Override
  public String getElementName(Object item) {
    return ((TypeModel) item).getName();
  }
}
