package org.eclipse.sirius.conml.design.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.conml.design.wizard.project.ConMLProjectWizard;
import org.eclipse.ui.PlatformUI;

public final class CreateConMLProjectHandler extends AbstractHandler {

  public Object execute(ExecutionEvent event) throws ExecutionException {
    final IWizard wizard = new ConMLProjectWizard();
    final WizardDialog dialog =
        new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
    dialog.open();
    return null;
  }
}
