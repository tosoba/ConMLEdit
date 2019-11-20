package org.eclipse.sirius.conml.design.dialog;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import conml.NamedElement;

public abstract class EObjectSelectionDialog<T extends EObject>
    extends FilteredItemsSelectionDialog {

  private final Collection<T> partsToSelect;

  private static final String SELECTION_DIALOG_SETTINGS = "SelectionDialogSettings";

  private final String headerText;

  private ILabelProvider detailsLabelProvider;
  private ILabelProvider listLabelProvider;

  public EObjectSelectionDialog(
      Shell shell,
      final Collection<T> partsToSelect,
      final String headerText,
      final ILabelProvider listLabelProvider,
      final ILabelProvider detailsLabelProvider) {
    super(shell);
    this.partsToSelect = partsToSelect;
    this.headerText = headerText;
    this.listLabelProvider = listLabelProvider;
    this.detailsLabelProvider = detailsLabelProvider;
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    final GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
    layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
    layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);

    final Composite compositeHeader = new Composite(parent, SWT.NONE);
    compositeHeader.setLayout(layout);
    final Label headerLabel = new Label(compositeHeader, SWT.NONE);
    headerLabel.setText(headerText);
    final GridData gridData = new GridData();
    gridData.horizontalAlignment = GridData.FILL;
    gridData.horizontalSpan = 2;
    headerLabel.setLayoutData(gridData);

    final Control dialogArea = super.createDialogArea(parent);
    dialogArea.setEnabled(true);
    parent.getParent().getShell().setMinimumSize(600, 700);

    setListLabelProvider(listLabelProvider);
    if (detailsLabelProvider != null) setDetailsLabelProvider(detailsLabelProvider);

    applyFilter();
    return dialogArea;
  }

  @Override
  protected Control createExtendedContentArea(Composite parent) {
    return null;
  }

  @Override
  protected IDialogSettings getDialogSettings() {
    IDialogSettings settings =
        Activator.getDefault().getDialogSettings().getSection(SELECTION_DIALOG_SETTINGS);
    if (settings == null) {
      settings =
          Activator.getDefault().getDialogSettings().addNewSection(SELECTION_DIALOG_SETTINGS);
    }
    return settings;
  }

  @Override
  protected void fillContentProvider(
      AbstractContentProvider contentProvider,
      ItemsFilter itemsFilter,
      IProgressMonitor progressMonitor)
      throws CoreException {
    if (partsToSelect != null) {
      progressMonitor.beginTask("Searching", partsToSelect.size());
      for (final Iterator<T> it = partsToSelect.iterator(); it.hasNext(); ) {
        contentProvider.add(it.next(), itemsFilter);
        progressMonitor.worked(1);
      }
    }
    progressMonitor.done();
  }

  @Override
  protected IStatus validateItem(Object item) {
    return Status.OK_STATUS;
  }

  protected class NamedElementItemFilter extends ItemsFilter {

    @Override
    public boolean isConsistentItem(final Object item) {
      return true;
    }

    @Override
    public boolean matchItem(final Object item) {
      if (item instanceof NamedElement) {
        final NamedElement namedElement = (NamedElement) item;
        if (namedElement.getName() == null) return false;
        return matches(namedElement.getName());
      }
      return false;
    }
  }
}
