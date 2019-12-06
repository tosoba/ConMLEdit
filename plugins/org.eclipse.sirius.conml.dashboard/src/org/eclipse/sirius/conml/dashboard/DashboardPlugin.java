package org.eclipse.sirius.conml.dashboard;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

@SuppressWarnings("deprecation")
public class DashboardPlugin extends AbstractUIPlugin {

  public static final String PLUGIN_ID = "org.eclipse.sirius.conml.dashboard";

  private static DashboardPlugin plugin;

  /** The constructor */
  public DashboardPlugin() {}

  /*
   * (non-Javadoc)
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
    ActivityExplorerActivator.getDefault()
        .getPreferenceStore()
        .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, false);
  }

  /**
   * A helper to log plugin errors.
   *
   * @param severity the error severity.
   * @param message the error message.
   * @param exception the error exception.
   */
  public static void log(int severity, String message, Throwable exception) {
    getDefault().getLog().log(new Status(severity, PLUGIN_ID, message, exception));
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
    ActivityExplorerActivator.getDefault()
        .getPreferenceStore()
        .setToDefault(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static DashboardPlugin getDefault() {
    return plugin;
  }

  /**
   * Log an error.
   *
   * @param s the message.
   * @param t the stack trace.
   */
  public void error(String s, Throwable t) {
    DashboardPlugin.log(IStatus.ERROR, s, t);
  }

  /**
   * Log an information.
   *
   * @param s the message.
   */
  public void info(String s) {
    DashboardPlugin.log(IStatus.INFO, s, null);
  }

  /**
   * Log a warning.
   *
   * @param s the message.
   * @param t the stack trace.
   */
  public void warning(String s, Throwable t) {
    DashboardPlugin.log(IStatus.WARNING, s, t);
  }
}
