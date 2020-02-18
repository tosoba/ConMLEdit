package org.eclipse.sirius.conml.gen.ui.launch;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.common.ui.util.WorkbenchPartDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.conml.gen.Gen;
import org.eclipse.sirius.conml.gen.config.ConMLGenConfigurationHolder;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;
import org.eclipse.sirius.conml.gen.ui.ConMLGenUiActivator;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.ui.part.ValidateAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

@SuppressWarnings("restriction")
public final class ConMLGenLaunchDelegate implements ILaunchConfigurationDelegate {

  @Override
  public void launch(
      ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
      throws CoreException {
    String conmlProjectPath = null;
    String outputFolder = null;
    try {
      conmlProjectPath = configuration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, "");
      outputFolder = configuration.getAttribute(ConMLGenConstants.OUTPUT_FOLDER_PATH, "");
    } catch (CoreException e) {
      final IStatus status =
          new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }

    if (conmlProjectPath == null
        || conmlProjectPath.isEmpty()
        || outputFolder == null
        || outputFolder.isEmpty()) return;

    final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(conmlProjectPath));
    final IContainer container = ResourcesPlugin.getWorkspace().getRoot();
    if (file != null && container != null && file.isAccessible() && container.isAccessible()) {
      final URI modelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
      final ConMLGenConfigurationHolder configurationHolder =
          this.createConfigurationHolder(configuration);

      final IResource airdRes = findAirdRes(container);
      if (airdRes != null) {
        final String modelDiagramDescriptionName = "Class Diagram";
        final Session session =
            SessionManager.INSTANCE.getSession(
                URI.createURI(airdRes.getLocationURI().toASCIIString()), monitor);
        final Optional<DRepresentation> classDiagram =
            DialectManager.INSTANCE
                .getAllRepresentations(session)
                .stream()
                .filter(
                    rep ->
                        rep instanceof DSemanticDiagramSpec
                            && Objects.equals(
                                modelDiagramDescriptionName,
                                ((DSemanticDiagramSpec) rep).getDescription().getName()))
                .findAny();
        if (!classDiagram.isPresent()) return;

        final IEditorPart editorPart =
            DialectUIManager.INSTANCE.openEditor(
                session, classDiagram.get(), new NullProgressMonitor());
        final WorkbenchPartDescriptor workbenchPartDescriptor =
            new WorkbenchPartDescriptor(
                editorPart.getSite().getId(),
                editorPart.getClass(),
                editorPart.getSite().getPage());
        new ValidateAction(workbenchPartDescriptor).run();
        airdRes.refreshLocal(1, new NullProgressMonitor());
        final IMarker[] foundMarkers = airdRes.findMarkers(null, true, IResource.DEPTH_INFINITE);
        int numberOfWarnings = 0, numberOfErrors = 0;
        for (final IMarker marker : foundMarkers) {
          Object severity = null;
          try {
            severity = marker.getAttribute(IMarker.SEVERITY);
          } catch (CoreException e) {
          }
          if (severity != null) {
            if (IMarker.SEVERITY_ERROR == (int) severity) numberOfErrors++;
            else if (IMarker.SEVERITY_WARNING == (int) severity) numberOfWarnings++;
          }
        }

        if (numberOfWarnings + numberOfErrors > 0) {
          final BlockingQueue<Boolean> messageQueue = new LinkedBlockingQueue<>();
          Display.getDefault()
              .syncExec(
                  new ValidationDialogRunnable(messageQueue, numberOfErrors, numberOfWarnings));
          try {
            if (!messageQueue.take()) return;
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }

      try {
        final Gen generator =
            new Gen(modelURI, new File(outputFolder), Arrays.asList(getProjectName(file)));
        generator.setConfigurationHolder(configurationHolder);
        generator.doGenerate(BasicMonitor.toMonitor(monitor));
        container.refreshLocal(IResource.DEPTH_INFINITE, monitor);
      } catch (IOException e) {
        IStatus status =
            new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
        ConMLGenUiActivator.getDefault().getLog().log(status);
      }
    }
  }

  private IResource findAirdRes(final IContainer container) throws CoreException {
    for (final IResource res : container.members()) {
      if (res instanceof IContainer) {
        final IResource aird = findAirdRes((IContainer) res);
        if (aird != null) return aird;
      }
      if ("aird".equalsIgnoreCase(res.getFileExtension())) return res;
    }
    return null;
  }

  private final class ValidationDialogRunnable implements Runnable {

    private final BlockingQueue<Boolean> returnMessageQueue;
    private final int numErr, numWar;

    public ValidationDialogRunnable(BlockingQueue<Boolean> queue, int numErr, int numWar) {
      this.returnMessageQueue = queue;
      this.numErr = numErr;
      this.numWar = numWar;
    }

    public void run() {
      final Dialog dialog =
          new MessageDialog(
              getShell(),
              "Validation results",
              null,
              numErr
                  + " errors and "
                  + numWar
                  + " warnings were found. Proceed with documentation generation?",
              MessageDialog.QUESTION,
              new String[] {"OK", "Cancel"},
              0);
      try {
        returnMessageQueue.put(dialog.open() == 0);
      } catch (InterruptedException e) {
      }
    }

    private Shell getShell() {
      Shell shell = null;
      final IWorkbenchWindow activeWorkbenchWindow =
          PlatformUI.getWorkbench().getActiveWorkbenchWindow();
      if (activeWorkbenchWindow != null) {
        shell = activeWorkbenchWindow.getShell();
      }
      if (shell == null) {
        Display dis = Display.getCurrent();
        if (dis == null) {
          dis = Display.getDefault();
        }
        if (dis != null) {
          shell = dis.getActiveShell();
        }
      }
      if (shell == null) {
        shell = new Shell();
      }
      return shell;
    }
  }

  private String getProjectName(final IFile file) {
    if (file.getProject() != null && file.getProject().getName() != null)
      return file.getProject().getName();
    else return "ConML project";
  }

  private ConMLGenConfigurationHolder createConfigurationHolder(
      final ILaunchConfiguration configuration) {
    final ConMLGenConfigurationHolder configurationHolder = new ConMLGenConfigurationHolder();
    try {
      configurationHolder.put(
          ConMLGenConstants.CONML_MODEL_PATH,
          configuration.getAttribute(ConMLGenConstants.CONML_MODEL_PATH, ""));
      configurationHolder.put(
          ConMLGenConstants.OUTPUT_FOLDER_PATH,
          configuration.getAttribute(ConMLGenConstants.OUTPUT_FOLDER_PATH, ""));
    } catch (CoreException e) {
      final IStatus status =
          new Status(IStatus.ERROR, ConMLGenUiActivator.PLUGIN_ID, e.getMessage(), e);
      ConMLGenUiActivator.getDefault().getLog().log(status);
    }

    return configurationHolder;
  }
}
