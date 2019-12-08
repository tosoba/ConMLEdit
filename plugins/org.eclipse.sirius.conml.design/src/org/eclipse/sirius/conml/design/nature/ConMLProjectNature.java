package org.eclipse.sirius.conml.design.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public final class ConMLProjectNature implements IProjectNature {

  public static final String NATURE_ID =
      "org.eclipse.sirius.conml.design.nature.conmlProjectNature";

  private IProject project;

  @Override
  public void configure() throws CoreException {}

  @Override
  public void deconfigure() throws CoreException {}

  @Override
  public IProject getProject() {
    return project;
  }

  @Override
  public void setProject(IProject project) {
    this.project = project;
  }
}
