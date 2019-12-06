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
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

public final class ConMLGenGeneralLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

  private Text modelPathText;
  private Text outputFolderText;

  @Override
  public void createControl(Composite parent) {
    final Font font = parent.getFont();
    final Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(1, false));
    composite.setFont(font);
    final GridData gd = new GridData(GridData.FILL_BOTH);
    gd.horizontalSpan = 1;
    composite.setLayoutData(gd);

    createGenerationGroup(composite, font);

    setControl(composite);
    update();
  }

  private void createGenerationGroup(Composite composite, Font font) {
    GridData gd;
    final Group generationGroup = createGroup(composite, "General", 3, 1, GridData.FILL_HORIZONTAL);
    final Composite comp = new Composite(generationGroup, SWT.NONE);
    final GridLayout layout = new GridLayout(3, false);
    layout.marginWidth = 0;
    layout.marginHeight = 0;
    comp.setLayout(layout);
    comp.setFont(font);
    gd = new GridData(GridData.FILL_BOTH);
    gd.horizontalSpan = 2;
    comp.setLayoutData(gd);

    final Label modelPathLabel = new Label(comp, SWT.NONE);
    modelPathLabel.setText("Project");

    modelPathText = new Text(comp, SWT.SINGLE | SWT.BORDER);
    modelPathText.setFont(composite.getFont());
    gd = new GridData(GridData.FILL_HORIZONTAL);
    gd.horizontalSpan = 1;
    modelPathText.setLayoutData(gd);
    modelPathText.addModifyListener(e -> update());

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

    final Label outputFolderLabel = new Label(comp, SWT.NONE);
    outputFolderLabel.setText("Output folder");

    outputFolderText = new Text(comp, SWT.SINGLE | SWT.BORDER);
    outputFolderText.setFont(composite.getFont());
    gd = new GridData(GridData.FILL_HORIZONTAL);
    gd.horizontalSpan = 1;
    outputFolderText.setLayoutData(gd);
    outputFolderText.addModifyListener(e -> update());

    final Button chooseOutputFolderButton = createPushButton(comp, "Browse", null);
    chooseOutputFolderButton.addSelectionListener(
        new SelectionListener() {
          public void widgetDefaultSelected(SelectionEvent e) {}

          public void widgetSelected(SelectionEvent e) {
            DirectoryDialog dialog = new DirectoryDialog(getShell());
            dialog.setMessage("Choose an output directory for documentation.");
            String path = dialog.open();
            if (path != null) {
              path = path.replace("\\\\", "\\");
              path = path.replace("\\", "/");
              outputFolderText.setText(path);

              update();
              updateLaunchConfigurationDialog();
            }
          }
        });
  }

  private void update() {
    setErrorMessage(null);

    getLaunchConfigurationDialog().updateButtons();
    getLaunchConfigurationDialog().updateMessage();

    if (modelPathText != null) {
      String text = modelPathText.getText();
      if (text != null && text.length() > 0) {
        IFile model = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(text));
        if (model != null && !model.exists()) {
          setErrorMessage("Missing input project");
        }
      }
    }
  }

  @Override
  public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    configuration.setAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
    configuration.setAttribute(ConMLGenConstants.OUTPUT_FOLDER_PATH, "");
    if (modelPathText != null) {
      modelPathText.setText("");
    }
    if (outputFolderText != null) {
      outputFolderText.setText("");
    }
  }

  @Override
  public void initializeFrom(ILaunchConfiguration configuration) {
    try {
      modelPathText.setText(configuration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, ""));
      outputFolderText.setText(
          configuration.getAttribute(ConMLGenConstants.OUTPUT_FOLDER_PATH, ""));
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
  }

  @Override
  public void performApply(ILaunchConfigurationWorkingCopy configuration) {
    final String modelPath = modelPathText.getText();
    configuration.setAttribute(ConMLGenConstants.CONML_MODEL_PATH, modelPath);

    final String outputFolder = outputFolderText.getText();
    configuration.setAttribute(ConMLGenConstants.OUTPUT_FOLDER_PATH, outputFolder);
  }

  @Override
  public String getName() {
    return "Generation";
  }

  @Override
  public boolean isValid(ILaunchConfiguration launchConfig) {
    boolean isValid = true;
    try {
      String attribute = launchConfig.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
      isValid = isValid && attribute != null && attribute.trim().length() > 0;

      attribute = launchConfig.getAttribute(ConMLGenConstants.OUTPUT_FOLDER_PATH, "");
      isValid = isValid && attribute != null && attribute.trim().length() > 0;
    } catch (CoreException e) {
      IStatus status = new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }
    return isValid;
  }

  private Group createGroup(Composite parent, String text, int columns, int hspan, int fill) {
    final Group g = new Group(parent, SWT.NONE);
    g.setLayout(new GridLayout(columns, false));
    g.setText(text);
    g.setFont(parent.getFont());
    final GridData gd = new GridData(fill);
    gd.horizontalSpan = hspan;
    g.setLayoutData(gd);
    return g;
  }
}
