package org.eclipse.sirius.conml.dashboard.contribution;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.sirius.conml.dashboard.services.DashboardServices;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public final class DashboardContributionItems extends CompoundContributionItem {
  /** Open dashboard command. */
  public static final String OPEN_DASHBOARD_CMD_ID =
      "org.obeonetwork.dsl.uml2.actions.openDashboard"; //$NON-NLS-1$

  /** Model parameter. */
  public static final String OPEN_DASHBOARD_CMD_PARAM_MODEL_KEY =
      "org.obeonetwork.dsl.uml2.actions.openDashboard.param.model"; //$NON-NLS-1$

  /** Constructor. */
  public DashboardContributionItems() {}

  /**
   * Constructor.
   *
   * @param id
   */
  public DashboardContributionItems(final String id) {
    super(id);
  }

  @Override
  protected IContributionItem[] getContributionItems() {
    final List<IContributionItem> menuItems = Lists.newArrayList();
    // Get all available dashboards
    final List<EObject> umlModelRoots = DashboardServices.INSTANCE.getUmlModels();
    for (final EObject eObject : umlModelRoots) {
      String uri = eObject.eResource().getURI().toPlatformString(true);
      if (uri != null) {
        // Get the project name
        final IFile resourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri));
        final String projectName = resourceFile.getProject().getName();
        final Map<String, String> parameters = Maps.newHashMap();
        parameters.put(OPEN_DASHBOARD_CMD_PARAM_MODEL_KEY, projectName);
        final CommandContributionItemParameter contributionParameter =
            new CommandContributionItemParameter(
                PlatformUI.getWorkbench(),
                null,
                OPEN_DASHBOARD_CMD_ID,
                parameters,
                null,
                null,
                null,
                projectName,
                null,
                "Open the activity explorer of the project : " + projectName,
                CommandContributionItem.STYLE_PUSH,
                null,
                true);

        contributionParameter.visibleEnabled = true;
        // Create a new item in the menu for the project
        final CommandContributionItem commandContributionItem =
            new CommandContributionItem(contributionParameter);
        menuItems.add(commandContributionItem);
      }
    }

    return menuItems.toArray(new IContributionItem[menuItems.size()]);
  }
}
