package org.eclipse.sirius.conml.gen.ui.launch;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.conml.gen.Gen;
import org.eclipse.sirius.conml.gen.config.ConMLGenConfigurationHolder;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;

public final class ConMLGenLaunchDelegate implements ILaunchConfigurationDelegate {

  @Override
  public void launch(
      ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
      throws CoreException {
    String umlModelPath = "";
    try {
      umlModelPath = configuration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }

    if (umlModelPath == null || umlModelPath.length() == 0) {
      return;
    }

    IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(umlModelPath));
    IContainer container = ResourcesPlugin.getWorkspace().getRoot();
    if (file != null && container != null && file.isAccessible() && container.isAccessible()) {
      URI modelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

      ConMLGenConfigurationHolder configurationHolder =
          this.createConfigurationHolder(configuration);

      // Add the location of the generation to the configuration holder
      configurationHolder.put(
          ConMLGenConstants.GENERATION_ROOT_PATH,
          container.getLocation().toFile().getAbsolutePath());

      try {
        final Gen generator =
            new Gen(
                modelURI, container.getLocation().toFile(), Arrays.asList(getProjectName(file)));

        generator.setConfigurationHolder(configurationHolder);

        generator.doGenerate(BasicMonitor.toMonitor(monitor));
        container.refreshLocal(IResource.DEPTH_INFINITE, monitor);
      } catch (IOException e) {
        IStatus status =
            new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
        ConMLGenUiActivator.getDefault().getLog().log(status);
      }
    }
  }

  private String getProjectName(IFile file) {
    if (file.getProject() != null && file.getProject().getName() != null) {
      return file.getProject().getName();
    } else return "ConML project";
  }

  private ConMLGenConfigurationHolder createConfigurationHolder(
      ILaunchConfiguration configuration) {
    ConMLGenConfigurationHolder configurationHolder = new ConMLGenConfigurationHolder();

    try {
      configurationHolder.put(
          ConMLGenConstants.CONML_MODEL_PATH,
          configuration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, ""));

    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }

    return configurationHolder;
  }
}
