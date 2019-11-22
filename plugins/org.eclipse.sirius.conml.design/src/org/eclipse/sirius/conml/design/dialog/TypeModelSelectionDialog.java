package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.sirius.conml.design.util.ConMLPredicates;
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
    super(
        title,
        message,
        ConMLPredicates.isInstanceOfClass(TypeModel.class),
        false,
        (Composite parent) -> {
          ((GridLayout) parent.getLayout()).numColumns++;
          Button button = new Button(parent, SWT.PUSH);
          button.setText("New TypeModel");
          button.setFont(JFaceResources.getDialogFont());
          button.addListener(
              SWT.Selection,
              event -> {
                if (event.type == SWT.Selection) {
                  final TypeModel tp = TypesFactory.eINSTANCE.createTypeModel();
                  tp.setName("Test name");
                  domain.getModels().add(tp);
                }
              });
          button.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        });
  }
}
