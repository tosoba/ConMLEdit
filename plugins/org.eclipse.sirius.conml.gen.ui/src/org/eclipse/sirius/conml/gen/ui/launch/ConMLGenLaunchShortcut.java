package org.eclipse.sirius.conml.gen.ui.launch;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public final class ConMLGenLaunchShortcut implements ILaunchShortcut {

  private IFile file;

  public static final String LAUNCH_CONFIGURATION_TYPE =
      "org.eclipse.sirius.conml.gen.ui.launchConfigurationType";

  @Override
  public void launch(ISelection selection, String mode) {
    if (selection instanceof IStructuredSelection) {
      List<?> list = ((IStructuredSelection) selection).toList();
      for (Object object : list) {
        if (object instanceof IFile
            && ((IFile) object).getFileExtension() != null
            && ConMLGenConstants.CONML_FILE_EXTENSION.equals(((IFile) object).getFileExtension())) {
          this.file = (IFile) object;
          break;
        }
      }
    }

    if (this.file != null) {
      generate(mode);
    }
  }

  @Override
  public void launch(IEditorPart editor, String mode) {}

  private void generate(String mode) {
    // Finds or creates a launch configuration for these UML models.
    ILaunchConfiguration launchConfiguration = this.findLaunchConfiguration();
    if (launchConfiguration == null) {
      launchConfiguration = this.createConfiguration();
    }

    // Launch it
    if (launchConfiguration != null && launchConfiguration.exists()) {
      DebugUITools.launch(launchConfiguration, mode);
    }
  }

  @SuppressWarnings("deprecation")
  private ILaunchConfiguration createConfiguration() {
    ILaunchConfiguration config = null;
    ILaunchConfigurationWorkingCopy wc = null;
    try {
      String computedModelPath = this.file.getFullPath().toString();

      ILaunchConfigurationType configType =
          DebugPlugin.getDefault()
              .getLaunchManager()
              .getLaunchConfigurationType(LAUNCH_CONFIGURATION_TYPE);
      wc =
          configType.newInstance(
              null,
              DebugPlugin.getDefault()
                  .getLaunchManager()
                  .generateUniqueLaunchConfigurationNameFrom("ConMLDocGen"));
      wc.setAttribute(ConMLGenConstants.CONML_MODEL_PATH, computedModelPath);
      wc.setMappedResources(new IResource[] {this.file});
      config = wc.doSave();

      IStructuredSelection selection;
      if (config == null) {
        selection = new StructuredSelection();
      } else {
        selection = new StructuredSelection(config);
      }
      DebugUITools.openLaunchConfigurationDialogOnGroup(
          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
          selection,
          IDebugUIConstants.ID_RUN_LAUNCH_GROUP);
    } catch (CoreException e) {
      IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
      if (window != null) {
        MessageDialog.openError(window.getShell(), "", e.getStatus().getMessage());
      } else {
        ConMLGenUiActivator.getDefault().getLog().log(e.getStatus());
      }
    }
    return config;
  }

  private ILaunchConfiguration findLaunchConfiguration() {
    String computedModelPath = this.file.getFullPath().toString();

    ILaunchConfigurationType configurationType =
        DebugPlugin.getDefault()
            .getLaunchManager()
            .getLaunchConfigurationType(LAUNCH_CONFIGURATION_TYPE);
    try {
      ILaunchConfiguration[] launchConfigurations =
          DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configurationType);
      for (ILaunchConfiguration iLaunchConfiguration : launchConfigurations) {
        String modelPath =
            iLaunchConfiguration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");

        if (modelPath != null && modelPath.equals(computedModelPath)) {
          return iLaunchConfiguration;
        }
      }
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return null;
  }
}
