package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.sirius.conml.design.services.types.ModelElementServices;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import conml.Domain;
import conml.types.TypeModel;
import conml.types.TypesFactory;

public final class TypeModelSelectionDialog extends ExistingSemanticElementsSelectionDialog {

  public TypeModelSelectionDialog(String title, String message, Domain domain) {
    super(title, message, (Object obj) -> obj instanceof Domain || obj instanceof TypeModel, false);
    setInitExtraButtons(
        (Composite parent) -> {
          ((GridLayout) parent.getLayout()).numColumns++;
          Button button = new Button(parent, SWT.PUSH);
          button.setText("New TypeModel");
          button.setFont(JFaceResources.getDialogFont());
          button.addListener(
              SWT.Selection,
              event -> {
                if (event.type == SWT.Selection) {
                  final TypeModel model = TypesFactory.eINSTANCE.createTypeModel();
                  domain.getModels().add(model);
                  model.setName(ModelElementServices.getInstance().defaultName(model));

                  CustomTreeSelectionDialog dialog = getDialog();
                  if (dialog != null) dialog.expandAll();
                }
              });
          button.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        });
  }
}
