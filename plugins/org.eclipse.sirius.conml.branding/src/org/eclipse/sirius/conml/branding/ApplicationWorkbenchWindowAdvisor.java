package org.eclipse.sirius.conml.branding;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

  private static final String PERSPECTIVE_ID = "org.eclipse.sirius.ui.tools.perspective.modeling";

  public String getInitialWindowPerspectiveId() {
    return PERSPECTIVE_ID;
  }

  public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
    super(configurer);
  }

  public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
    return new ApplicationActionBarAdvisor(configurer);
  }

  public void preWindowOpen() {
    IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
    configurer.setInitialSize(new Point(1024, 768));
    configurer.setShowCoolBar(true);
    configurer.setShowStatusLine(false);
    configurer.setTitle("ConML Edit");
  }

  @Override
  public void postWindowOpen() {
    super.postWindowOpen();

    IWorkbenchWindowConfigurer workbenchWindowConfigurer = getWindowConfigurer();
    IActionBarConfigurer actionBarConfigurer = workbenchWindowConfigurer.getActionBarConfigurer();
    IMenuManager menuManager = actionBarConfigurer.getMenuManager();

    IContributionItem[] menuItems = menuManager.getItems();
    for (int i = 0; i < menuItems.length; i++) {
      IContributionItem menuItem = menuItems[i];

      // Hack to remove the Run menu - it seems you cannot do this using
      // the "org.eclipse.ui.activities" extension
      if ("org.eclipse.ui.run".equals(menuItem.getId())) {
        menuManager.remove(menuItem);
      }
    }

    menuManager.update(true);
  }
}
