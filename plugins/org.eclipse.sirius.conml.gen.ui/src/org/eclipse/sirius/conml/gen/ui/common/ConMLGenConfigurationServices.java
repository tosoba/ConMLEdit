package org.eclipse.sirius.conml.gen.ui.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchGroup;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;

public final class ConMLGenConfigurationServices {

  public static final String PROP_KEY_GEN_JAVA_LAUNCH_CONFIG_NAME = "ConMLDocGen_LaunchConfig";

  private ConMLGenConfigurationServices() {}

  public static ILaunchConfiguration[] getStoredJavaGenerationLaunchConfigurations() {
    final ILaunchConfigurationType configurationType =
        DebugPlugin.getDefault()
            .getLaunchManager()
            .getLaunchConfigurationType(ConMLGenConstants.LAUNCH_CONFIGURATION_TYPE);
    try {
      return DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configurationType);
    } catch (CoreException e) {
      final IStatus status =
          new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return null;
  }

  public static List<ILaunchConfiguration> getStoredJavaGenerationLaunchConfigurations(
      IResource project) {
    final List<ILaunchConfiguration> configs = new ArrayList<ILaunchConfiguration>();
    try {
      for (ILaunchConfiguration launchConfig : getStoredJavaGenerationLaunchConfigurations()) {
        String modelPath =
            launchConfig.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, (String) null);
        if (project.getFullPath().toString().equals(modelPath)) {
          configs.add(launchConfig);
        }
      }
    } catch (CoreException e) {
      final IStatus status =
          new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return configs;
  }

  public static ILaunchConfiguration getStoredLaunchConfiguration(final String name) {
    final ILaunchConfiguration[] configs = getStoredJavaGenerationLaunchConfigurations();
    if (configs != null) {
      for (ILaunchConfiguration config : configs) {
        if (name.equals(config.getName())) {
          return config;
        }
      }
    }
    return null;
  }

  public static String getConfigurationProperty(final IResource element) {
    String result = null;
    try {
      result =
          element.getPersistentProperty(
              new QualifiedName(
                  "", ConMLGenConfigurationServices.PROP_KEY_GEN_JAVA_LAUNCH_CONFIG_NAME));
    } catch (CoreException e1) {
      e1.printStackTrace();
    }
    return result;
  }

  public static void saveConfigurationProperty(final IResource element, final String name) {
    try {
      element.setPersistentProperty(
          new QualifiedName("", ConMLGenConfigurationServices.PROP_KEY_GEN_JAVA_LAUNCH_CONFIG_NAME),
          name);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static ILaunchGroup getLaunchGroup() {
    final ILaunchGroup[] launchGroups = DebugUITools.getLaunchGroups();
    for (ILaunchGroup iLaunchGroup : launchGroups) {
      if ("org.eclipse.debug.ui.launchGroup.run".equals(iLaunchGroup.getIdentifier())) {
        return iLaunchGroup;
      }
    }
    return null;
  }
}
