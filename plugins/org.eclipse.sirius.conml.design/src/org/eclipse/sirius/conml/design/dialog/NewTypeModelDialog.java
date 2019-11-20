package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.conml.design.util.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import conml.Domain;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public final class NewTypeModelDialog extends Dialog {

  private final Domain domain;

  private Text typeModelNameText;
  private Text typeModelVersionText;
  private Text typeModelDescriptionText;

  public NewTypeModelDialog(Shell parent, final Domain domain) {
    super(parent);
    this.domain = domain;
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    final Composite mainComposite = new Composite(parent, SWT.NONE);

    final GridLayout layout = new GridLayout();
    layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
    layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
    layout.numColumns = 3;
    mainComposite.setLayout(layout);

    new Label(mainComposite, SWT.NULL).setText("Name:");

    GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
    gridData.horizontalSpan = 2;
    gridData.horizontalAlignment = GridData.FILL;

    typeModelNameText = new Text(mainComposite, SWT.SINGLE | SWT.BORDER);
    typeModelNameText.setLayoutData(gridData);

    new Label(mainComposite, SWT.NULL).setText("Version:");

    typeModelVersionText = new Text(mainComposite, SWT.SINGLE | SWT.BORDER);
    typeModelVersionText.setLayoutData(gridData);

    new Label(mainComposite, SWT.NULL).setText("Description:");

    typeModelDescriptionText = new Text(mainComposite, SWT.SINGLE | SWT.BORDER);
    typeModelDescriptionText.setLayoutData(gridData);

    return mainComposite;
  }

  @Override
  protected void okPressed() {
    final TypeModel tm = TypesFactory.eINSTANCE.createTypeModel();
    StringUtils.setIfNotNullOrBlank(typeModelNameText.getText(), tm, TypeModel::setName);
    Double version = StringUtils.tryParseDouble(typeModelVersionText.getText());
    if (version != null) tm.setVersion(version);
    StringUtils.setIfNotNullOrBlank(
        typeModelDescriptionText.getText(), tm, TypeModel::setDescription);
    domain.getModels().add(tm);

    super.okPressed();
  }
}
