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
  /** The UML project. */
  private final IProject project;

  /** The name of the UML file. */
  private final String umlFileName;

  /**
   * Constructor.
   *
   * @param project An {@link IProject} handle representing the project
   * @param rootObjectName The name of the semantic root element
   * @param fileName
   */
  public CreateDomain(IProject project, String fileName) {
    super(null);
    this.project = project;
    umlFileName = fileName;
  }

  /** {@inheritDoc} */
  @Override
  protected void execute(final IProgressMonitor monitor)
      throws CoreException, InterruptedException {
    final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
    if (created.some()) {
      Display.getDefault()
          .syncExec(
              () -> {
                // Create default empty UML model
                ConMLProject.createSemanticResource(project, umlFileName);

                // Enable UML viewpoints
                final ModelingProject modelingProject = created.get();
                ConMLViewpoints.enableAll(modelingProject.getSession(), false);
              });
    }
  }
}
