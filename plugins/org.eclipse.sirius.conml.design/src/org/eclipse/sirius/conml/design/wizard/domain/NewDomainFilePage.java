package org.eclipse.sirius.conml.design.wizard.domain;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.conml.design.util.ConMLProject;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public final class NewDomainFilePage extends WizardNewFileCreationPage {

  public NewDomainFilePage(String pageName, IStructuredSelection selection) {
    super(pageName, selection);
  }

  /**
   * Get the model file.
   *
   * @return Model file
   */
  public Option<IFile> getModelFile() {
    return Options.newSome(
        ResourcesPlugin.getWorkspace()
            .getRoot()
            .getFile(getContainerFullPath().append(getFileName())));
  }

  /** {@inheritDoc} */
  @Override
  protected boolean validatePage() {
    if (super.validatePage()) {
      final String requiredExt = ConMLProject.MODEL_FILE_EXTENSION;
      final String enteredExt = new Path(getFileName()).getFileExtension();
      if (enteredExt == null || !enteredExt.equals(requiredExt)) {
        setErrorMessage("Bad Domain file extension");
        return false;
      }
      return true;
    }
    return false;
  }
}
