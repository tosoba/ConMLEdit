package org.eclipse.sirius.conml.design.dialog;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import conml.NamedElement;

public abstract class EObjectSelectionDialog<T extends EObject>
    extends FilteredItemsSelectionDialog {

  private static final String SELECTION_DIALOG_SETTINGS = "SelectionDialogSettings";

  protected final Supplier<Collection<T>> partsToSelectGetter;
  protected Collection<T> partsToSelect;

  private ILabelProvider detailsLabelProvider;
  private ILabelProvider listLabelProvider;

  public EObjectSelectionDialog(
      Shell shell,
      final Supplier<Collection<T>> partsToSelectGetter,
      final ILabelProvider listLabelProvider,
      final ILabelProvider detailsLabelProvider) {
    super(shell);
    this.partsToSelectGetter = partsToSelectGetter;
    this.listLabelProvider = listLabelProvider;
    this.detailsLabelProvider = detailsLabelProvider;

    partsToSelect = partsToSelectGetter.get();
  }

  protected void createHeader(Composite parent) {}

  @Override
  protected Control createDialogArea(Composite parent) {
    createHeader(parent);

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
