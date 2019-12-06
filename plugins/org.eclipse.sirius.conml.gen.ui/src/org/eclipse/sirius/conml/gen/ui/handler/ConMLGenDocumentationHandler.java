package org.eclipse.sirius.conml.gen.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchGroup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;
import org.eclipse.sirius.conml.gen.ui.common.ConMLGenConfigurationServices;
import org.eclipse.ui.handlers.HandlerUtil;

public final class ConMLGenDocumentationHandler extends AbstractHandler {

  /**
   * {@inheritDoc}
   *
   * @see
   *     org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
   */
  public Object execute(ExecutionEvent event) throws ExecutionException {
    try {
      IStructuredSelection selection =
          (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
      IResource model = null;
      Object selectedObj = selection.getFirstElement();
      if (selectedObj instanceof IResource) {
        model = (IResource) selectedObj;
      } else if (selectedObj instanceof EObject) {
        model =
            ResourcesPlugin.getWorkspace()
                .getRoot()
                .findMember(((EObject) selectedObj).eResource().getURI().toPlatformString(true));
      }

      if (model != null) {
        String configName = ConMLGenConfigurationServices.getConfigurationProperty(model);
        if (configName != null) {
          ILaunchConfiguration config =
              ConMLGenConfigurationServices.getStoredLaunchConfiguration(configName);

          if (config != null) {
            String computedModelPath = model.getFullPath().toString();

            String modelPath = config.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");

            if (modelPath != null && modelPath.equals(computedModelPath)) {
              ILaunchGroup group = ConMLGenConfigurationServices.getLaunchGroup();
              if (group != null) {
                DebugUITools.launch(config, group.getMode());
              }
            } else {
              IStatus status =
                  new Status(
                      IStatus.ERROR,
                      ConMLGenUiActivator.PLUGIN_ID,
                      "No configuration matches with this model.");
              ConMLGenUiActivator.getDefault().getLog().log(status);
            }
          } else {
            IStatus status =
                new Status(
                    IStatus.INFO,
                    ConMLGenUiActivator.PLUGIN_ID,
                    "The launch configuration \""
                        + configName
                        + "\" does not exist. Maybe it has been removed. You may define this in the properties of the model: \""
                        + model.getFullPath().toString()
                        + "\"");
            ConMLGenUiActivator.getDefault().getLog().log(status);
          }
        } else {
          IStatus status =
              new Status(
                  IStatus.INFO,
                  ConMLGenUiActivator.PLUGIN_ID,
                  "No Java generation launch configuration has been chosen for the model: \""
                      + model.getFullPath().toString()
                      + "\"");
          ConMLGenUiActivator.getDefault().getLog().log(status);
        }
      }
    } catch (ExecutionException e) {
      throw e;
    } catch (CoreException e2) {
      e2.printStackTrace();
    }
    return null;
  }
}
