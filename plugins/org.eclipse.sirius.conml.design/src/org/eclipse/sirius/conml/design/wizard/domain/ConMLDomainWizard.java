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
import org.eclipse.sirius.conml.design.wizard.ConMLWizard;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.IWorkbench;

public final class ConMLDomainWizard extends ConMLWizard {

  private NewDomainFilePage newDomainFilePage;

  @Override
  public void addPages() {
    newDomainFilePage = new NewDomainFilePage("New Domain", selection);
    newDomainFilePage.setTitle("Create a new ConML Domain");
    newDomainFilePage.setDescription("Create a new ConML Domain file");
    newDomainFilePage.setFileName("NewDomain" + "." + ConMLProject.MODEL_FILE_EXTENSION);
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
    final String defaultModelBaseFilename = "NewDomain";
    String modelFilename = defaultModelBaseFilename + "." + ConMLProject.MODEL_FILE_EXTENSION;
    for (int i = 1;
        ((IContainer) selectedResource).findMember(modelFilename.toLowerCase()) != null;
        ++i) {
      modelFilename = defaultModelBaseFilename + i + "." + ConMLProject.MODEL_FILE_EXTENSION;
    }
    return modelFilename;
  }

  @Override
  public void init(IWorkbench workbench, IStructuredSelection structuredSelection) {
    selection = structuredSelection;
    setWindowTitle("New ConML Domain");
  }

  @Override
  public boolean performFinish() {
    final Option<IFile> option = newDomainFilePage.getModelFile();

    if (option.some()) {
      final IFile modelFile = option.get();
      project = modelFile.getProject();

      try {
        ModelingProjectManager.INSTANCE.convertToModelingProject(
            project, new NullProgressMonitor());
      } catch (final CoreException e) {
        Activator.log(IStatus.ERROR, "Error creating Domain", e);
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
