package org.eclipse.sirius.conml.design.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.conml.design.nature.ConMLProjectNature;
import org.eclipse.sirius.conml.design.operation.CreateDomain;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public abstract class ConMLWizard extends BasicNewProjectResourceWizard {

  protected IProject project;
  protected String newDomainFileName;

  @Override
  public boolean performFinish() {
    if (project == null || newDomainFileName == null) {
      throw new IllegalArgumentException();
    }

    IProjectDescription description;
    try {
      description = project.getDescription();

      final String[] natures = description.getNatureIds();
      final String[] newNatures = new String[natures.length + 1];
      System.arraycopy(natures, 0, newNatures, 0, natures.length);
      newNatures[natures.length] = ConMLProjectNature.NATURE_ID;

      final IWorkspace workspace = ResourcesPlugin.getWorkspace();
      final IStatus status = workspace.validateNatureSet(newNatures);

      if (status.getCode() == IStatus.OK) {
        description.setNatureIds(newNatures);
        project.setDescription(description, null);
      }
    } catch (final CoreException e) {
      Activator.log(IStatus.ERROR, "Error setting project nature", e);
    }

    final IRunnableWithProgress op =
        new WorkspaceModifyOperation(null) {
          @Override
          protected void execute(IProgressMonitor monitor)
              throws CoreException, InterruptedException {
            final CreateDomain init = new CreateDomain(project, newDomainFileName);
            try {
              getContainer().run(false, true, init);
            } catch (final InterruptedException e) {
              // Ignore.
            } catch (final InvocationTargetException e) {
              Activator.log(IStatus.ERROR, "Error creating Domain", e);
            }

            final IResource newDomainFile = project.findMember(newDomainFileName);
            updatePerspective();
            selectAndReveal(newDomainFile, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
          }
        };

    try {
      getContainer().run(false, true, op);
    } catch (final InvocationTargetException e) {
      if (e.getTargetException() instanceof CoreException) {
        ErrorDialog.openError(
            getContainer().getShell(),
            "Error creating Domain",
            null,
            ((CoreException) e.getTargetException()).getStatus());
      } else {
        Activator.log(IStatus.ERROR, "Error creating Domain", e);
      }
    } catch (final InterruptedException e) {
      return false;
    }

    return true;
  }
}
