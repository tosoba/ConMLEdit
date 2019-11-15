package org.eclipse.sirius.conml.design.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public final class Settings {

  private static final String FN_DIALOG_SETTINGS = "dialog_settings.xml";

  private static final String KEY_DEFAULT_DIALOG_SETTINGS_ROOTURL =
      "default_dialog_settings_rootUrl";

  private IDialogSettings dialogSettings;

  protected void loadDialogSettings() {
    dialogSettings = createEmptySettings();
    boolean loaded = loadDialogSettingsFromWorkspace();
    if (!loaded) {
      loaded = loadDefaultDialogSettingsFromProduct();
    }
    if (!loaded) {
      loadDefaultDialogSettingsFromBundle();
    }
  }

  private boolean loadDefaultDialogSettingsFromProduct() {
    String rootUrl = PlatformUI.getPreferenceStore().getString(KEY_DEFAULT_DIALOG_SETTINGS_ROOTURL);
    if (rootUrl == null || rootUrl.isEmpty()) {
      return false;
    }
    String bundlePart = Activator.bundle().getSymbolicName() + "/" + FN_DIALOG_SETTINGS;
    String fullUrl =
        rootUrl.endsWith("/") ? rootUrl + bundlePart : rootUrl + "/" + bundlePart; // $NON-NLS-2$
    URL url;
    try {
      url = new URL(fullUrl);
    } catch (MalformedURLException e) {
      Activator.log(IStatus.ERROR, "Failed to load dialog settings from: " + fullUrl, e);
      return false;
    }

    try {
      url = FileLocator.resolve(url);
    } catch (IOException e) {
      if (WorkbenchPlugin.DEBUG) {
        Activator.log(IStatus.ERROR, "Failed to load dialog settings from: " + fullUrl, e);
      }
      return false;
    }

    try (BufferedReader reader =
        new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
      dialogSettings.load(reader);
      return true;
    } catch (IOException e) {
      dialogSettings = createEmptySettings();
      Activator.log(IStatus.ERROR, "Failed to load dialog settings from: " + url, e);
    }
    return false;
  }

  /** @return true if the workspace settings file was successfully read */
  private boolean loadDialogSettingsFromWorkspace() {
    IPath dataLocation = Activator.getStateLocationOrNull();
    if (dataLocation == null) {
      return false;
    }
    String readWritePath = dataLocation.append(FN_DIALOG_SETTINGS).toOSString();
    File settingsFile = new File(readWritePath);
    if (settingsFile.exists()) {
      try {
        dialogSettings.load(readWritePath);
      } catch (IOException e) {
        dialogSettings = createEmptySettings();
        Activator.log(IStatus.ERROR, "Failed to load dialog settings from: " + settingsFile, e);
      }
      return true;
    }
    return false;
  }

  private void loadDefaultDialogSettingsFromBundle() {
    Bundle bundle = Activator.bundle();
    URL dsURL = BundleUtility.find(bundle, FN_DIALOG_SETTINGS);
    if (dsURL == null) {
      return;
    }
    try (BufferedReader reader =
        new BufferedReader(new InputStreamReader(dsURL.openStream(), StandardCharsets.UTF_8))) {
      dialogSettings.load(reader);
    } catch (IOException e) {
      Activator.log(IStatus.ERROR, "Failed to load dialog settings from: " + dsURL, e);
      dialogSettings = createEmptySettings();
    }
  }

  private DialogSettings createEmptySettings() {
    return new DialogSettings("Workbench");
  }
}
