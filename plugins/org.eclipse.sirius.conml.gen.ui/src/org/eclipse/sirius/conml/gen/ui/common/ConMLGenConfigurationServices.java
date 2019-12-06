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
import org.eclipse.sirius.conml.gen.ui.launch.ConMLGenLaunchShortcut;

public final class ConMLGenConfigurationServices {
  /**
   * The properties key to store the selected launch configuration on the current element, for Java
   * generation.
   */
  public static final String PROP_KEY_GEN_JAVA_LAUNCH_CONFIG_NAME = "ConMLDocGen_LaunchConfig";

  /** Constructor. */
  private ConMLGenConfigurationServices() {}

  /**
   * Get the stored launch configurations for Java generation.
   *
   * @return ILaunchConfiguration[]
   */
  public static ILaunchConfiguration[] getStoredJavaGenerationLaunchConfigurations() {
    ILaunchConfigurationType configurationType =
        DebugPlugin.getDefault()
            .getLaunchManager()
            .getLaunchConfigurationType(ConMLGenLaunchShortcut.LAUNCH_CONFIGURATION_TYPE);
    try {
      // Get the launch configurations related to a Java generation.
      return DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configurationType);
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return null;
  }

  public static List<ILaunchConfiguration> getStoredJavaGenerationLaunchConfigurations(
      IResource project) {
    List<ILaunchConfiguration> configs = new ArrayList<ILaunchConfiguration>();
    try {
      for (ILaunchConfiguration launchConfig : getStoredJavaGenerationLaunchConfigurations()) {
        String modelPath =
            launchConfig.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, (String) null);
        if (project.getFullPath().toString().equals(modelPath)) {
          configs.add(launchConfig);
        }
      }
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return configs;
  }

  /**
   * Get the stored launched configuration identified by the given name.
   *
   * @param name The name of the launch configuration to find.
   * @return The launch configuration.
   */
  public static ILaunchConfiguration getStoredLaunchConfiguration(String name) {
    ILaunchConfiguration[] configs = getStoredJavaGenerationLaunchConfigurations();
    if (configs != null) {
      for (ILaunchConfiguration config : configs) {
        if (name.equals(config.getName())) {
          return config;
        }
      }
    }
    return null;
  }

  /**
   * Get the saved launch configuration property name.
   *
   * @param element The resource element containing the property.
   * @return The configuration name.
   */
  public static String getConfigurationProperty(IResource element) {
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

  /**
   * Save the given launch configuration property name.
   *
   * @param element The resource element containing the property.
   * @param name The configuration name.
   */
  public static void saveConfigurationProperty(IResource element, String name) {
    try {
      element.setPersistentProperty(
          new QualifiedName("", ConMLGenConfigurationServices.PROP_KEY_GEN_JAVA_LAUNCH_CONFIG_NAME),
          name);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  /**
   * Get the launch group.
   *
   * @return The launch group.
   */
  public static ILaunchGroup getLaunchGroup() {
    ILaunchGroup[] launchGroups = DebugUITools.getLaunchGroups();
    for (ILaunchGroup iLaunchGroup : launchGroups) {
      if ("org.eclipse.debug.ui.launchGroup.run".equals(iLaunchGroup.getIdentifier())) {
        return iLaunchGroup;
      }
    }
    return null;
  }
}
