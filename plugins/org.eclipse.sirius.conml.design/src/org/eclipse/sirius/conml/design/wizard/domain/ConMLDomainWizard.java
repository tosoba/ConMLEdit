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

  private NewDomainFilePage newModelFilePage;

  @Override
  public void addPages() {
    newModelFilePage = new NewDomainFilePage("New Domain", selection);
    newModelFilePage.setTitle("Create a new ConML Domain");
    newModelFilePage.setDescription("Create a new ConML Domain file");
    newModelFilePage.setFileName("NewDomain" + "." + ConMLProject.MODEL_FILE_EXTENSION);
    addPage(newModelFilePage);

    // Try and get the resource selection to determine a current directory
    // for the file dialog.
    if (selection != null && !selection.isEmpty()) {
      // Get the resource...
      //
      final Object selectedElement = selection.iterator().next();
      if (selectedElement instanceof IResource) {
        // Get the resource parent, if its a file.
        IResource selectedResource = (IResource) selectedElement;
        if (selectedResource.getType() == IResource.FILE) {
          selectedResource = selectedResource.getParent();
        }

        // This gives us a directory...
        if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
          // Set this for the container.
          //
          newModelFilePage.setContainerFullPath(selectedResource.getFullPath());

          // Make up a unique new name here.
          final String modelFilename = getNewModelName(selectedResource);
          newModelFilePage.setFileName(modelFilename);
        }
      }
    }
  }

  /**
   * Compute the name of the new UML model.
   *
   * @param selectedResource Selected resource
   * @return Name of the new UML model
   */
  private String getNewModelName(IResource selectedResource) {
    final String defaultModelBaseFilename = "NewDomain";
    String modelFilename = defaultModelBaseFilename + "." + ConMLProject.MODEL_FILE_EXTENSION;
    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
      modelFilename = defaultModelBaseFilename + i + "." + ConMLProject.MODEL_FILE_EXTENSION;
    }
    return modelFilename;
  }

  /** {@inheritDoc} */
  @Override
  public void init(IWorkbench workbench, IStructuredSelection structuredSelection) {
    selection = structuredSelection;
    setWindowTitle("New ConML Domain");
  }

  /** {@inheritDoc} */
  @Override
  public boolean performFinish() {
    final Option<IFile> option = newModelFilePage.getModelFile();

    if (option.some()) {
      final IFile modelFile = option.get();
      project = modelFile.getProject();

      // Convert project to modeling project
      try {
        ModelingProjectManager.INSTANCE.convertToModelingProject(
            project, new NullProgressMonitor());
      } catch (final CoreException e) {
        Activator.log(IStatus.ERROR, "Error creating Domain", e);
        return false;
      }

      newUmlModelFileName = newModelFilePage.getFileName();

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

      // Open the dashboard
      DashboardServices.INSTANCE.openDashboard(project);

      return true;
    }
    return false;
  }
}
