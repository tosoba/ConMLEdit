package org.eclipse.sirius.conml.design;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/** The activator class controls the plug-in life cycle */
public class Activator extends AbstractUIPlugin {
  // The plug-in ID
  public static final String PLUGIN_ID = "org.eclipse.sirius.conml.design";

  // The shared instance
  private static Activator plugin;

  private static Set<Viewpoint> viewpoints;

  /** The constructor */
  public Activator() {}

  /*
   * (non-Javadoc)
   *
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
    viewpoints = new HashSet<Viewpoint>();
    viewpoints.addAll(
        ViewpointRegistry.getInstance()
            .registerFromPlugin(PLUGIN_ID + "/description/conml.odesign"));
  }

  /*
   * (non-Javadoc)
   *
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    if (viewpoints != null) {
      for (final Viewpoint viewpoint : viewpoints) {
        ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
      }
      viewpoints.clear();
      viewpoints = null;
    }
    super.stop(context);
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static Activator getDefault() {
    return plugin;
  }

  public static void logError(String msg) {
    logError(new IllegalStateException(msg));
  }

  public static void logError(Throwable exception) {
    log(
        IStatus.ERROR,
        exception.getMessage() != null ? exception.getMessage() : "Excecption msg = null",
        exception);
  }

  public static Bundle bundle() {
    return plugin.getBundle();
  }

  public static void log(int severity, String message, Throwable exception) {
    if (plugin != null) plugin.getLog().log(new Status(severity, PLUGIN_ID, message, exception));
  }

  public static IPath getStateLocationOrNull() {
    try {
      return plugin.getStateLocation();
    } catch (IllegalStateException e) {
      return null;
    }
  }
}
