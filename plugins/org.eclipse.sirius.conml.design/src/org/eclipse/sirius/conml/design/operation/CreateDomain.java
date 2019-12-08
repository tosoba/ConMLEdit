package org.eclipse.sirius.conml.design.operation;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.conml.design.util.ConMLProject;
import org.eclipse.sirius.conml.design.util.ConMLViewpoints;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public final class CreateDomain extends WorkspaceModifyOperation {

  private final IProject project;

  private final String domainFileName;

  public CreateDomain(IProject project, String fileName) {
    super(null);
    this.project = project;
    domainFileName = fileName;
  }

  @Override
  protected void execute(final IProgressMonitor monitor)
      throws CoreException, InterruptedException {
    final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
    if (created.some()) {
      Display.getDefault()
          .syncExec(
              () -> {
                ConMLProject.createSemanticResource(project, domainFileName);
                final ModelingProject modelingProject = created.get();
                ConMLViewpoints.enableAll(modelingProject.getSession(), false);
              });
    }
  }
}
