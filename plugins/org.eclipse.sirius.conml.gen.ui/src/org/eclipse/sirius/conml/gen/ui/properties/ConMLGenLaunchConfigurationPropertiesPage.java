package org.eclipse.sirius.conml.gen.ui.properties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationTabGroupViewer;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationsDialog;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationsMessages;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchGroupExtension;
import org.eclipse.debug.ui.ILaunchGroup;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.common.ConMLGenConfigurationServices;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PropertyPage;

@SuppressWarnings("restriction")
public final class ConMLGenLaunchConfigurationPropertiesPage extends PropertyPage {

  private LaunchConfigurationsCombo combo;

  private CustomLaunchConfigurationTabGroupViewer viewer;

  public ConMLGenLaunchConfigurationPropertiesPage() {
    noDefaultAndApplyButton();
  }

  @Override
  protected Control createContents(Composite parent) {
    final Composite composite = new Composite(parent, SWT.NONE);
    final GridLayout layout = new GridLayout();
    composite.setLayout(layout);
    final GridData data = new GridData();
    composite.setLayoutData(data);

    combo = new LaunchConfigurationsCombo(composite, SWT.READ_ONLY);

    String configNameToSelect =
        ConMLGenConfigurationServices.getConfigurationProperty((IResource) getElement());
    final List<ILaunchConfiguration> configs =
        ConMLGenConfigurationServices.getStoredJavaGenerationLaunchConfigurations(
            (IResource) getElement());

    if (configs.isEmpty() || configNameToSelect == null) {
      final Label isStoredLabel = new Label(composite, SWT.NONE);
      isStoredLabel.setForeground(
          new org.eclipse.swt.graphics.Color(composite.getDisplay(), new RGB(255, 0, 0)));
      isStoredLabel.setText(
          "No favourite configuration for this model. Click on OK to choose the selected one.");
    }

    // Create the viewer from the launch configurations.
    viewer = createViewer(composite);

    if (viewer != null) {

      combo.setLaunchConfigurations(configs);
      combo.setViewer(viewer);

      if ((configNameToSelect == null
              || configNameToSelect.compareTo("") == 0
              || !combo.contains(configNameToSelect))
          && !combo.isEmpty()) {
        configNameToSelect = combo.getItem(0);
      } else if (combo.isEmpty()) {
        try {
          final ILaunchConfigurationWorkingCopy newLaunchConfig =
              createLaunchConfigurationWorkingCopy();
          combo.add(newLaunchConfig);
          configNameToSelect = newLaunchConfig.getName();
          newLaunchConfig.setAttribute(
              ConMLGenConstants.CONML_MODEL_PATH,
              ((IResource) getElement()).getFullPath().toString());
        } catch (CoreException e) {
          e.printStackTrace();
        }
      }
      combo.select(configNameToSelect);
    }
    return composite;
  }

  @Override
  public boolean performOk() {
    try {
      if (combo.getSelectedLaunchConfiguration() instanceof ILaunchConfigurationWorkingCopy
          && ((ILaunchConfigurationWorkingCopy) combo.getSelectedLaunchConfiguration())
                  .getOriginal()
              == null) {
        ((ILaunchConfigurationWorkingCopy) combo.getSelectedLaunchConfiguration()).doSave();
      } else if (viewer != null) {
        viewer.doApply();
      }

      ConMLGenConfigurationServices.saveConfigurationProperty(
          (IResource) getElement(), combo.getSelectedLaunchConfiguration().getName());

    } catch (CoreException e) {
      return false;
    }
    return true;
  }

  private CustomLaunchConfigurationTabGroupViewer createViewer(Composite parent) {
    ILaunchGroup launchGroup = ConMLGenConfigurationServices.getLaunchGroup();
    if (launchGroup instanceof LaunchGroupExtension) {
      CustomLaunchConfigurationsDialog dialog =
          new CustomLaunchConfigurationsDialog(getShell(), (LaunchGroupExtension) launchGroup);
      return new CustomLaunchConfigurationTabGroupViewer(parent, dialog);
    }
    return null;
  }

  private ILaunchConfigurationWorkingCopy createLaunchConfigurationWorkingCopy()
      throws CoreException {
    ILaunchConfigurationType type =
        DebugPlugin.getDefault()
            .getLaunchManager()
            .getLaunchConfigurationType(ConMLGenConstants.LAUNCH_CONFIGURATION_TYPE);

    return type.newInstance(
        null,
        DebugPlugin.getDefault()
            .getLaunchManager()
            .generateLaunchConfigurationName(
                LaunchConfigurationsMessages.CreateLaunchConfigurationAction_New_configuration_2));
  }

  private class LaunchConfigurationsCombo extends Combo {

    private Map<String, ILaunchConfiguration> mConfigsRegistry =
        new HashMap<String, ILaunchConfiguration>();

    private ILaunchConfiguration mSelectedConfig;

    private CustomLaunchConfigurationTabGroupViewer mViewer;

    private SelectionListener selectionListener;

    public LaunchConfigurationsCombo(Composite parent, int style) {
      super(parent, style);
    }

    public void setLaunchConfigurations(List<ILaunchConfiguration> configs) {
      for (ILaunchConfiguration config : configs) {
        add(config);
      }
    }

    @Override
    protected void checkSubclass() {}

    public void add(ILaunchConfiguration configuration) {
      add(configuration.getName());
      mConfigsRegistry.put(configuration.getName(), configuration);
    }

    public void setViewer(final CustomLaunchConfigurationTabGroupViewer viewer) {
      mViewer = viewer;
      if (selectionListener == null) {
        selectionListener =
            new SelectionListener() {

              public void widgetSelected(SelectionEvent e) {
                String selection = getText();
                final ILaunchConfiguration selectedConfig = mConfigsRegistry.get(selection);

                mViewer.doInputChanged(selectedConfig);

                mSelectedConfig = selectedConfig;
              }

              public void widgetDefaultSelected(SelectionEvent e) {}
            };
        addSelectionListener(selectionListener);
      }
    }

    public void select(String text) {
      final ILaunchConfiguration configToSelect = mConfigsRegistry.get(text);
      if (configToSelect != null && configToSelect != mSelectedConfig) {
        select(configToSelect);
      }
    }

    public void select(ILaunchConfiguration configuration) {
      if (!configuration.getName().equals(getText())) {
        setText(configuration.getName());
      }
      mConfigsRegistry.put(configuration.getName(), configuration);
      mSelectedConfig = configuration;
      mViewer.doInputChanged(configuration);
    }

    public void updateCurrentItem(ILaunchConfiguration configuration) {
      mConfigsRegistry.remove(getText());
      mConfigsRegistry.put(configuration.getName(), configuration);
      mSelectedConfig = configuration;
      final int indexToUpdate = indexOf(getText());
      setItem(indexToUpdate, configuration.getName());
      setText(configuration.getName());
      pack(true);
    }

    public ILaunchConfiguration getSelectedLaunchConfiguration() {
      return mSelectedConfig;
    }

    public boolean contains(String text) {
      return mConfigsRegistry.containsKey(text);
    }

    public boolean isEmpty() {
      return mConfigsRegistry.isEmpty();
    }
  }

  private class CustomLaunchConfigurationsDialog extends LaunchConfigurationsDialog {

    public CustomLaunchConfigurationsDialog(Shell shell, LaunchGroupExtension group) {
      super(shell, group);
    }

    @Override
    public boolean isTreeSelectionEmpty() {
      return true;
    }

    @Override
    public void updateButtons() {
      getTabViewer().refresh();
    }

    @Override
    public void updateMessage() {}

    public void setViewer(LaunchConfigurationTabGroupViewer viewer) {
      setTabViewer(viewer);
    }
  }

  private class CustomLaunchConfigurationTabGroupViewer extends LaunchConfigurationTabGroupViewer {

    private static final String MSG_REVERT_BUTTON = "Revert the last changes";

    private static final String MSG_APPLY_BUTTON =
        "Save the changes in the related launch configuration";

    public CustomLaunchConfigurationTabGroupViewer(
        Composite parent, CustomLaunchConfigurationsDialog dialog) {
      super(parent, dialog);
      dialog.setViewer(this);
      this.getApplyButton().setToolTipText(MSG_APPLY_BUTTON);
      this.getRevertButton().setToolTipText(MSG_REVERT_BUTTON);
    }

    public void doInputChanged(ILaunchConfiguration config) {
      inputChanged(config);
    }

    public void doApply() {
      handleApplyPressed();
    }

    @Override
    public ILaunchConfiguration handleApplyPressed() {
      ILaunchConfiguration launchConfig = super.handleApplyPressed();
      if (launchConfig != null && !combo.getText().equals(launchConfig.getName())) {
        final ILaunchConfiguration storedLaunchConfig =
            ConMLGenConfigurationServices.getStoredLaunchConfiguration(launchConfig.getName());
        combo.select(storedLaunchConfig);
        combo.updateCurrentItem(storedLaunchConfig);
        launchConfig = storedLaunchConfig;
      }

      return launchConfig;
    }
  }
}
