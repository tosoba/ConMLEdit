package org.eclipse.sirius.conml.dashboard.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.ParameterValueConversionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.sirius.conml.dashboard.DashboardPlugin;
import org.eclipse.sirius.conml.dashboard.contribution.DashboardContributionItems;
import org.eclipse.sirius.conml.dashboard.converter.ProjectConverter;
import org.eclipse.sirius.conml.dashboard.services.DashboardServices;

public final class OpenDashboard extends AbstractHandler {

  public Object execute(ExecutionEvent event) throws ExecutionException {
    final String paramModel =
        event.getParameter(DashboardContributionItems.OPEN_DASHBOARD_CMD_PARAM_MODEL_KEY);
    final ProjectConverter converter = new ProjectConverter();
    try {
      final IProject project = (IProject) converter.convertToObject(paramModel);
      DashboardServices.INSTANCE.openDashboard(project);
    } catch (final ParameterValueConversionException e) {
      DashboardPlugin.getDefault().error("Opening dashboard failed", e);
    }

    return null;
  }
}
