package org.eclipse.sirius.conml.gen.ui.tab;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractConMLGenLaunchConfigurationTab
    extends AbstractLaunchConfigurationTab {

  protected Group createGroup(Composite parent, String text, int columns, int hspan, int fill) {
    Group g = new Group(parent, SWT.NONE);
    g.setLayout(new GridLayout(columns, false));
    g.setText(text);
    g.setFont(parent.getFont());
    GridData gd = new GridData(fill);
    gd.horizontalSpan = hspan;
    g.setLayoutData(gd);
    return g;
  }

  protected void createHelpButton(Composite parent, String helpMessage) {
    Image image =
        PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_LCL_LINKTO_HELP);
    ToolBar result = new ToolBar(parent, SWT.FLAT | SWT.NO_FOCUS);
    result.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
    ToolItem item = new ToolItem(result, SWT.NONE);
    item.setImage(image);
    if (helpMessage != null && !helpMessage.isEmpty()) {
      item.setToolTipText(helpMessage);
    }
  }
}
