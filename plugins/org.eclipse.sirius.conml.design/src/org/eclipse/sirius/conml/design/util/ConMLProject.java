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
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import com.google.common.collect.Maps;

import conml.conmlFactory;

public final class ConMLProject {

  private ConMLProject() {}

  public static Option<IFile> createSemanticResource(
      final IProject project, String newUmlFileName) {
    final Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
    final Session session = modelingProject.get().getSession();
    final String platformPath = getNewDomainFilePath(project, newUmlFileName);
    session
        .getTransactionalEditingDomain()
        .getCommandStack()
        .execute(
            new RecordingCommand(session.getTransactionalEditingDomain()) {
              @Override
              protected void doExecute() {
                final URI semanticModelURI = URI.createPlatformResourceURI(platformPath, true);
                final Resource res = new ResourceSetImpl().createResource(semanticModelURI);
                final EObject rootObject = conmlFactory.eINSTANCE.createDomain();
                if (rootObject != null) {
                  res.getContents().add(rootObject);
                }
                try {
                  res.save(Maps.newHashMap());
                } catch (final IOException e) {
                  Activator.log(IStatus.ERROR, Messages.getString("Error.CreatingDomainFailed"), e);
                }

                session.addSemanticResource(semanticModelURI, new NullProgressMonitor());
                session.save(new NullProgressMonitor());
              }
            });

    return Options.newSome(
        ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformPath)));
  }

  private static String getNewDomainFilePath(IProject project, String umlFileName) {
    return '/' + project.getName() + '/' + umlFileName.toLowerCase();
  }

  public static final String DOMAIN_FILE_EXTENSION = "conml";
}
