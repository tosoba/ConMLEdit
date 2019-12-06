package org.eclipse.sirius.conml.gen.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class ConMLGenUiActivator extends AbstractUIPlugin {

  public static final String PLUGIN_ID = "org.eclipse.sirius.conml.gen.ui";

  private static ConMLGenUiActivator plugin;

  public ConMLGenUiActivator() {}

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  public static ConMLGenUiActivator getDefault() {
    return plugin;
  }
}
