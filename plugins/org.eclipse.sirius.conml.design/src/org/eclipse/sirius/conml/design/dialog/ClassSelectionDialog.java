package org.eclipse.sirius.conml.design.dialog;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConML;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import conml.types.Class;
import conml.types.TypeModel;

public final class ClassSelectionDialog extends FilteredItemsSelectionDialog {

  private final List<Class> classesToChooseFrom;

  public ClassSelectionDialog(Shell shell, final EObject object) {
    super(shell);
    setTitle("Choose Class to instance");
    classesToChooseFrom =
        ConML.getAllElementsOfTypeFromSessionStream(object, TypeModel.class)
            .map(TypeModel::getElements)
            .flatMap(Collection::stream)
            .filter(Class.class::isInstance)
            .map(Class.class::cast)
            .collect(Collectors.toList());
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite compositeHeaderMessage = new Composite(parent, SWT.NONE);

    final GridLayout layout = new GridLayout(1, false);
    layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
    layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
    layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);

    compositeHeaderMessage.setLayout(layout);
    final Label headerMessage = new Label(compositeHeaderMessage, SWT.NONE);

    headerMessage.setText("Enter a name of the Class to instance.");
    final GridData gridData = new GridData();
    gridData.horizontalAlignment = GridData.FILL;
    gridData.horizontalSpan = 2;
    headerMessage.setLayoutData(gridData);

    final Control dialogArea1 = super.createDialogArea(parent);
    dialogArea1.setEnabled(true);
    parent.getParent().getShell().setMinimumSize(600, 700);
    applyFilter();
    setDetailsLabelProvider(
        new LabelProvider() {
          @Override
          public String getText(Object element) {
            String text = "";
            if (element instanceof Class) {
              final Class myClass = (Class) element;
              if (myClass.getDefinition() != null) return myClass.getDefinition();
            }
            return text;
          }
        });

    applyFilter();
    return dialogArea1;
  }

  @Override
  protected Control createExtendedContentArea(Composite parent) {
    return null;
  }

  private final String DIALOG_SETTINGS = "ClassesSelectionDialog";

  @Override
  protected IDialogSettings getDialogSettings() {
    IDialogSettings settings =
        Activator.getDefault().getDialogSettings().getSection(DIALOG_SETTINGS);
    if (settings == null) {
      settings = Activator.getDefault().getDialogSettings().addNewSection(DIALOG_SETTINGS);
    }
    return settings;
  }

  @Override
  protected IStatus validateItem(Object item) {
    return Status.OK_STATUS;
  }

  private class ClassFilter extends ItemsFilter {

    @Override
    public boolean isConsistentItem(final Object item) {
      return true;
    }

    @Override
    public boolean matchItem(final Object item) {
      if (item instanceof Class) {
        final Class namedItem = (Class) item;
        return !namedItem.isAbstract() && matches(namedItem.getName());
      }
      return false;
    }
  }

  @Override
  protected ItemsFilter createFilter() {
    return new ClassFilter();
  }

  @Override
  protected Comparator<Object> getItemsComparator() {
    return (arg0, arg1) -> ((Class) arg0).getName().compareTo(((Class) arg1).getName());
  }

  @Override
  protected void fillContentProvider(
      AbstractContentProvider contentProvider,
      ItemsFilter itemsFilter,
      IProgressMonitor progressMonitor)
      throws CoreException {
    if (classesToChooseFrom != null) {
      progressMonitor.beginTask("Searching", classesToChooseFrom.size());
      for (final Iterator<Class> iter = classesToChooseFrom.iterator(); iter.hasNext(); ) {
        contentProvider.add(iter.next(), itemsFilter);
        progressMonitor.worked(1);
      }
    }
    progressMonitor.done();
  }

  @Override
  public String getElementName(Object item) {
    return ((Class) item).getName();
  }
}
