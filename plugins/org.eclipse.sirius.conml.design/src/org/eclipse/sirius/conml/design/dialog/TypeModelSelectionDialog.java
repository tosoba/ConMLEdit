package org.eclipse.sirius.conml.design.dialog;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.conml.design.util.Comparators;
import org.eclipse.sirius.conml.design.util.LabelProviders;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import conml.NamedElement;
import conml.types.TypeModel;

public final class TypeModelSelectionDialog extends EObjectSelectionDialog<TypeModel> {

  private final String headerText;

  @Override
  protected void createButtonsForButtonBar(Composite parent) {
    super.createButtonsForButtonBar(parent);
    // TODO: maybe move new TypeModel button here
  }

  public TypeModelSelectionDialog(
      Shell shell, final Collection<TypeModel> partsToSelect, final String headerText) {
    super(
        shell,
        partsToSelect,
        LabelProviders.namedElementLabelProvider(),
        LabelProviders.describableElementLabelProvider());
    this.headerText = headerText;
  }

  @Override
  protected void createHeader(Composite parent) {
    final Composite compositeHeader = new Composite(parent, SWT.NONE);
    final GridLayout layout = new GridLayout(2, false);
    layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
    layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
    layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
    compositeHeader.setLayout(layout);

    final Label headerLabel = new Label(compositeHeader, SWT.NONE);
    headerLabel.setText(headerText);
    GridData gridData = new GridData();
    gridData.horizontalAlignment = GridData.FILL;
    gridData.horizontalSpan = 1;
    headerLabel.setLayoutData(gridData);

    // TODO: move create TypeModel button to the right
    final Button button = new Button(compositeHeader, SWT.NONE);
    button.setText("New TypeModel");
    button.addListener(
        SWT.Selection,
        event -> {
          switch (event.type) {
            case SWT.Selection:
              final NewTypeModelDialog newTypeModelDialog =
                  new NewTypeModelDialog(Display.getCurrent().getActiveShell());
              newTypeModelDialog.open();
              break;
          }
        });
    gridData = new GridData();
    gridData.horizontalAlignment = GridData.HORIZONTAL_ALIGN_END;
    gridData.horizontalSpan = 1;
    button.setLayoutData(gridData);
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
