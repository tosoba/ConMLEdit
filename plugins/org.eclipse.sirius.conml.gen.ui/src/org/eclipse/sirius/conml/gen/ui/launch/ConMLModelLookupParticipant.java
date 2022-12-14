package org.eclipse.sirius.conml.gen.ui.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.eclipse.sirius.conml.gen.config.ConMLGenConstants;

public final class ConMLModelLookupParticipant extends AbstractSourceLookupParticipant {

  @Override
  public String getSourceName(Object object) throws CoreException {
    String result = null;
    if (object instanceof String) {
      result = (String) object;
    } else if (object instanceof IResource) {
      result = ((IResource) object).getName();
    } else if (object instanceof IAdaptable) {
      final IResource resource = (IResource) ((IAdaptable) object).getAdapter(IResource.class);
      if (resource != null) {
        result = resource.getName();
      }
    }
    return result;
  }

  @Override
  public Object[] findSourceElements(Object object) throws CoreException {
    final Object[] result = super.findSourceElements(object);
    final List<IResource> conmlProjects = new ArrayList<IResource>();
    for (final Object obj : result) {
      if (obj instanceof IFile
          && ((IFile) obj).getFileExtension() != null
          && ConMLGenConstants.CONML_FILE_EXTENSION.equals(((IFile) obj).getFileExtension())) {
        conmlProjects.add((IFile) obj);
      }
    }
    return conmlProjects.toArray(new Object[conmlProjects.size()]);
  }
}
