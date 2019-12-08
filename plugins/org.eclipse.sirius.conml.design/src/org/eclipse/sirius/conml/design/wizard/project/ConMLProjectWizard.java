package org.eclipse.sirius.conml.design.wizard.project;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConMLProject;
import org.eclipse.sirius.conml.design.util.ConMLViewpoints;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.conml.design.wizard.ConMLWizard;

public final class ConMLProjectWizard extends ConMLWizard {

  protected WizardNewProjectCreationPage newProjectPage;

  @Override
  public void addPages() {
    newProjectPage = new WizardNewProjectCreationPage("Project");
    newProjectPage.setInitialProjectName("");
    newProjectPage.setTitle(Messages.getString("Dialog.CreateNewConMLProject"));
    newProjectPage.setDescription(Messages.getString("Dialog.EnterProjectName"));
    addPage(newProjectPage);
  }

  @Override
  public boolean performFinish() {
    try {
      project =
          ModelingProjectManager.INSTANCE.createNewModelingProject(
              newProjectPage.getProjectName(),
              newProjectPage.getLocationPath(),
              true,
              new NullProgressMonitor());
      newDomainFileName = newProjectPage.getProjectName() + "." + ConMLProject.DOMAIN_FILE_EXTENSION;

      super.performFinish();

      final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
      if (created.some()) {
        Display.getDefault()
            .syncExec(
                () -> {
                  ConMLProject.createSemanticResource(project, newDomainFileName);
                  final Session session = created.get().getSession();
                  if (session != null) {
                    ConMLViewpoints.enableAll(session, false);
                    if (SessionStatus.DIRTY.equals(session.getStatus())) {
                      session.save(new NullProgressMonitor());
                    }
                  }
                });
      }
    } catch (final CoreException e) {
      Activator.log(IStatus.ERROR, Messages.getString("Error.CreatingDomainFailed"), e);
      return false;
    }

    return true;
  }
}
