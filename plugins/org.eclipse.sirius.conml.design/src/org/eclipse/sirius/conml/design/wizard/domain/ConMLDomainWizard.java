package org.eclipse.sirius.conml.design.wizard.domain;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.conml.dashboard.services.DashboardServices;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.util.ConMLProject;
import org.eclipse.sirius.conml.design.util.ConMLViewpoints;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.conml.design.wizard.ConMLWizard;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.IWorkbench;

public final class ConMLDomainWizard extends ConMLWizard {

  private NewDomainFilePage newDomainFilePage;

  private static final String DEFAULT_DOMAIN_FILE_NAME = "newdomain";

  @Override
  public void addPages() {
    newDomainFilePage = new NewDomainFilePage("New Domain", selection);
    newDomainFilePage.setTitle(Messages.getString("Dialog.CreateNewDomain"));
    newDomainFilePage.setDescription(Messages.getString("Dialog.CreateNewDomainFile"));
    newDomainFilePage.setFileName(
        DEFAULT_DOMAIN_FILE_NAME + "." + ConMLProject.DOMAIN_FILE_EXTENSION);
    addPage(newDomainFilePage);

    if (selection != null && !selection.isEmpty()) {
      final Object selectedElement = selection.iterator().next();
      if (selectedElement instanceof IResource) {

        IResource selectedResource = (IResource) selectedElement;
        if (selectedResource.getType() == IResource.FILE) {
          selectedResource = selectedResource.getParent();
        }

        if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
          newDomainFilePage.setContainerFullPath(selectedResource.getFullPath());
          final String domainFilename = getNewDomainName(selectedResource);
          newDomainFilePage.setFileName(domainFilename);
        }
      }
    }
  }

  private String getNewDomainName(IResource selectedResource) {
    final String defaultModelBaseFilename = DEFAULT_DOMAIN_FILE_NAME;
    String modelFilename = defaultModelBaseFilename + "." + ConMLProject.DOMAIN_FILE_EXTENSION;
    for (int i = 1;
        ((IContainer) selectedResource).findMember(modelFilename.toLowerCase()) != null;
        ++i) {
      modelFilename = defaultModelBaseFilename + i + "." + ConMLProject.DOMAIN_FILE_EXTENSION;
    }
    return modelFilename;
  }

  @Override
  public void init(IWorkbench workbench, IStructuredSelection structuredSelection) {
    selection = structuredSelection;
    setWindowTitle(Messages.getString("Dialog.NewDomain"));
  }

  @Override
  public boolean performFinish() {
    final Option<IFile> option = newDomainFilePage.getDomainFile();

    if (option.some()) {
      final IFile modelFile = option.get();
      project = modelFile.getProject();

      try {
        ModelingProjectManager.INSTANCE.convertToModelingProject(
            project, new NullProgressMonitor());
      } catch (final CoreException e) {
        Activator.log(IStatus.ERROR, Messages.getString("Error.CreatingDomainFailed"), e);
        return false;
      }

      newDomainFileName = newDomainFilePage.getFileName();

      super.performFinish();

      final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
      if (created.some()) {
        final Session session = created.get().getSession();
        if (session != null) {
          session
              .getTransactionalEditingDomain()
              .getCommandStack()
              .execute(
                  new RecordingCommand(session.getTransactionalEditingDomain()) {
                    @Override
                    protected void doExecute() {
                      ConMLViewpoints.enableAll(session, false);
                    }
                  });
        }
      }

      DashboardServices.INSTANCE.openDashboard(project);

      return true;
    }
    return false;
  }
}
