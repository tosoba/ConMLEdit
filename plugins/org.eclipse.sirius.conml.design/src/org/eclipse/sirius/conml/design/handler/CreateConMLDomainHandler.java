package org.eclipse.sirius.conml.design.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.conml.design.wizard.domain.ConMLDomainWizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public final class CreateConMLDomainHandler extends AbstractHandler {

  public Object execute(ExecutionEvent event) throws ExecutionException {
    final INewWizard wizard = new ConMLDomainWizard();
    final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    final ISelectionService service = window.getSelectionService();
    final IStructuredSelection selection =
        (IStructuredSelection)
            service.getSelection("org.eclipse.sirius.ui.tools.views.model.explorer");
    wizard.init(PlatformUI.getWorkbench(), selection);
    final WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
    dialog.open();
    return null;
  }
}
