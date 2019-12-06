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

  @Override
  public void launch(ISelection selection, String mode) {
    if (selection instanceof IStructuredSelection) {
      final List<?> list = ((IStructuredSelection) selection).toList();
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

  private void generate(final String mode) {
    ILaunchConfiguration launchConfiguration = this.findLaunchConfiguration();
    if (launchConfiguration == null) {
      launchConfiguration = this.createConfiguration();
    }

    if (launchConfiguration != null && launchConfiguration.exists()) {
      DebugUITools.launch(launchConfiguration, mode);
    }
  }

  @SuppressWarnings("deprecation")
  private ILaunchConfiguration createConfiguration() {
    ILaunchConfiguration config = null;
    ILaunchConfigurationWorkingCopy wc = null;
    try {
      final String computedModelPath = this.file.getFullPath().toString();

      final ILaunchConfigurationType configType =
          DebugPlugin.getDefault()
              .getLaunchManager()
              .getLaunchConfigurationType(ConMLGenConstants.LAUNCH_CONFIGURATION_TYPE);
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
      final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
      if (window != null) {
        MessageDialog.openError(window.getShell(), "", e.getStatus().getMessage());
      } else {
        ConMLGenUiActivator.getDefault().getLog().log(e.getStatus());
      }
    }
    return config;
  }

  private ILaunchConfiguration findLaunchConfiguration() {
    final String computedModelPath = this.file.getFullPath().toString();

    final ILaunchConfigurationType configurationType =
        DebugPlugin.getDefault()
            .getLaunchManager()
            .getLaunchConfigurationType(ConMLGenConstants.LAUNCH_CONFIGURATION_TYPE);
    try {
      final ILaunchConfiguration[] launchConfigurations =
          DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configurationType);
      for (final ILaunchConfiguration iLaunchConfiguration : launchConfigurations) {
        final String modelPath =
            iLaunchConfiguration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");

        if (modelPath != null && modelPath.equals(computedModelPath)) {
          return iLaunchConfiguration;
        }
      }
    } catch (CoreException e) {
      final IStatus status =
          new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return null;
  }
}
