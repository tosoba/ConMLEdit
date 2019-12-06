package org.eclipse.sirius.conml.gen.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.sirius.conml.gen.ui.tab.ConMLGenGeneralLaunchConfigurationTab;

public final class ConMLGenLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

  @Override
  public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
    setTabs(
        new ILaunchConfigurationTab[] {
          new ConMLGenGeneralLaunchConfigurationTab(), new CommonTab(),
        });
  }
}
