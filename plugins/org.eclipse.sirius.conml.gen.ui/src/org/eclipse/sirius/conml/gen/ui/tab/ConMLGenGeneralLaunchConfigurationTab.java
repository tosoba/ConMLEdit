package org.eclipse.sirius.conml.gen.ui.tab;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

public final class ConMLGenGeneralLaunchConfigurationTab
    extends AbstractConMLGenLaunchConfigurationTab {

  private Text modelPathText;

  @Override
  public void createControl(Composite parent) {
    Font font = parent.getFont();
    Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(1, false));
    composite.setFont(font);
    GridData gd = new GridData(GridData.FILL_BOTH);
    gd.horizontalSpan = 1;
    composite.setLayoutData(gd);

    this.createGenerationGroup(composite, font);

    this.setControl(composite);
    this.update();
  }

  private void createGenerationGroup(Composite composite, Font font) {
    GridData gd;
    Group generationGroup = createGroup(composite, "General", 3, 1, GridData.FILL_HORIZONTAL);
    Composite comp = new Composite(generationGroup, SWT.NONE);
    GridLayout layout = new GridLayout(4, false);
    layout.marginWidth = 0;
    layout.marginHeight = 0;
    comp.setLayout(layout);
    comp.setFont(font);
    gd = new GridData(GridData.FILL_BOTH);
    gd.horizontalSpan = 2;
    comp.setLayoutData(gd);

    Label modelPathLabel = new Label(comp, SWT.NONE);
    modelPathLabel.setText("Project");

    this.modelPathText = new Text(comp, SWT.SINGLE | SWT.BORDER);
    this.modelPathText.setFont(composite.getFont());
    gd = new GridData(GridData.FILL_HORIZONTAL);
    gd.horizontalSpan = 1;
    this.modelPathText.setLayoutData(gd);
    this.modelPathText.addModifyListener(
        new ModifyListener() {

          public void modifyText(ModifyEvent e) {
            update();
          }
        });

    final Button browseModelButton = createPushButton(comp, "Browse", null);
    browseModelButton.addSelectionListener(
        new SelectionListener() {
          public void widgetDefaultSelected(SelectionEvent e) {}

          public void widgetSelected(SelectionEvent e) {
            FilteredResourcesSelectionDialog dialog =
                new FilteredResourcesSelectionDialog(
                    getShell(), false, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
            dialog.setTitle("Select a ConML project");
            dialog.setInitialPattern("*.conml");
            dialog.open();
            if (dialog.getResult() != null && dialog.getResult().length > 0) {
              Object[] results = dialog.getResult();
              for (Object result : results) {
                if (result instanceof IFile) {
                  modelPathText.setText(((IFile) result).getFullPath().toString());
                  break;
                }
              }
            }
            update();
            updateLaunchConfigurationDialog();
          }
        });
    createHelpButton(comp, "Help");
  }

  private void update() {
    this.setErrorMessage(null);

    this.getLaunchConfigurationDialog().updateButtons();
    this.getLaunchConfigurationDialog().updateMessage();

    if (this.modelPathText != null) {
      String text = this.modelPathText.getText();
      if (text != null && text.length() > 0) {
        IFile model = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(text));
        if (model != null && !model.exists()) {
          this.setErrorMessage("Missing input project");
        }
      }
    }
  }

  @Override
  public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    configuration.setAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
    if (this.modelPathText != null) {
      this.modelPathText.setText("");
    }
  }

  @Override
  public void initializeFrom(ILaunchConfiguration configuration) {
    try {
      String attribute = configuration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
      this.modelPathText.setText(attribute);
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
  }

  @Override
  public void performApply(ILaunchConfigurationWorkingCopy configuration) {
    // Model path
    String modelPath = this.modelPathText.getText();
    configuration.setAttribute(ConMLGenConstants.CONML_MODEL_PATH, modelPath);
  }

  @Override
  public String getName() {
    return "General";
  }

  @Override
  public boolean isValid(ILaunchConfiguration launchConfig) {
    boolean isValid = true;
    try {
      // Model path
      String attribute = launchConfig.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
      isValid = isValid && attribute != null && attribute.trim().length() > 0;

      // JRE execution environment
      attribute =
          launchConfig.getAttribute(
              ConMLGenConstants.JRE_EXECUTION_ENVIRONMENT,
              ConMLGenConstants.Default.DEFAULT_JRE_EXECUTION_ENVIRONMENT);
      isValid = isValid && attribute != null && attribute.trim().length() > 0;

    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return isValid;
  }
}
