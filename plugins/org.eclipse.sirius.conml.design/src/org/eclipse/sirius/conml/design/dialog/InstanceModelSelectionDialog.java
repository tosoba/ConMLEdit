package org.eclipse.sirius.conml.design.dialog;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.sirius.conml.design.services.common.ModelElementServices;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import conml.Domain;
import conml.instances.InstanceModel;
import conml.instances.InstancesFactory;
import conml.types.TypeModel;

public final class InstanceModelSelectionDialog extends ExistingSemanticElementsSelectionDialog {

  public InstanceModelSelectionDialog(
      String title, String message, Domain domain, TypeModel typeModelToInstance) {
    super(
        title,
        message,
        (Object obj) -> {
          if (obj instanceof Domain) return true;
          
          if (!(obj instanceof InstanceModel)) return false;
          final InstanceModel instanceModelCandidate = (InstanceModel) obj;
          return instanceModelCandidate
              .getConformedTypeModels()
              .stream()
              .anyMatch(typeModel -> EcoreUtil.equals(typeModel, typeModelToInstance));
        },
        false);
    setInitExtraButtons(
        (Composite parent) -> {
          ((GridLayout) parent.getLayout()).numColumns++;
          Button button = new Button(parent, SWT.PUSH);
          button.setText("New InstanceModel");
          button.setFont(JFaceResources.getDialogFont());
          button.addListener(
              SWT.Selection,
              event -> {
                if (event.type == SWT.Selection) {
                  final InstanceModel model = InstancesFactory.eINSTANCE.createInstanceModel();
                  model.setVersion(typeModelToInstance.getVersion());
                  model.getConformedTypeModels().add(typeModelToInstance);
                  domain.getModels().add(model);
                  model.setName(ModelElementServices.getInstance().defaultName(model));
                }
              });
          button.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        });
  }
}
