package org.eclipse.sirius.conml.dashboard.converter;

import org.eclipse.core.commands.AbstractParameterValueConverter;
import org.eclipse.core.commands.ParameterValueConversionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

public final class ProjectConverter extends AbstractParameterValueConverter {

  public ProjectConverter() {}

  @Override
  public Object convertToObject(String parameterValue) throws ParameterValueConversionException {
    if (parameterValue == null || parameterValue.isEmpty()) {
      return null;
    }
    final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(parameterValue);
    if (project.exists()) {
      return project;
    }
    return null;
  }

  @Override
  public String convertToString(Object parameterValue) throws ParameterValueConversionException {
    if (parameterValue instanceof String) {
      return (String) parameterValue;
    }
    return null;
  }
}
