package org.eclipse.sirius.conml.design.util;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.conml.design.Activator;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import com.google.common.collect.Maps;

import conml.conmlFactory;

public final class ConMLProject {
  private ConMLProject() {}

  /**
   * Create a new UML model in a project.
   *
   * @param project Modeling project
   * @param rootObjectName Name of the root object
   * @param newUmlFileName Name of the UML file
   * @return Newly created UML file
   */
  public static Option<IFile> createSemanticResource(
      final IProject project, String newUmlFileName) {
    final Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
    final Session session = modelingProject.get().getSession();
    final String platformPath = getNewUmlModelFilePath(project, newUmlFileName);
    session
        .getTransactionalEditingDomain()
        .getCommandStack()
        .execute(
            new RecordingCommand(session.getTransactionalEditingDomain()) {
              @Override
              protected void doExecute() {

                final URI semanticModelURI = URI.createPlatformResourceURI(platformPath, true);
                final Resource res = new ResourceSetImpl().createResource(semanticModelURI);
                /* Add the initial model object to the contents. */
                final EObject rootObject = conmlFactory.eINSTANCE.createDomain();

                if (rootObject != null) {
                  res.getContents().add(rootObject);
                }
                try {
                  res.save(Maps.newHashMap());
                } catch (final IOException e) {
                  Activator.log(IStatus.ERROR, "Error creating Domain", e);
                }

                session.addSemanticResource(semanticModelURI, new NullProgressMonitor());

                session.save(new NullProgressMonitor());
              }
            });
    return Options.newSome(
        ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformPath)));
  }

  /**
   * Get the new UML model file path.
   *
   * @param project Project
   * @param umlFileName File name
   * @return UML model file path
   */
  private static String getNewUmlModelFilePath(IProject project, String umlFileName) {
    return '/' + project.getName() + '/' + umlFileName.toLowerCase();
  }

  /** The UML file extension. */
  public static final String MODEL_FILE_EXTENSION = "conml"; // $NON-NLS-1$
}
