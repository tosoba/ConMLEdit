package org.eclipse.sirius.conml.gen.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public final class ConMLGenConfigurationHolder extends AdapterImpl {

  private Map<String, Object> configuration = new HashMap<String, Object>();

  public void put(String key, Object value) {
    this.configuration.put(key, value);
  }

  public static String getGenerationRootPath(EObject eObject) {
    return ConMLGenConfigurationHolder.getStringValue(
        eObject, ConMLGenConstants.OUTPUT_FOLDER_PATH);
  }

  private static ConMLGenConfigurationHolder getConfigurationHolder(EObject eObject) {
    Resource eResource = eObject.eResource();
    EObject rootEObject = eResource.getContents().get(0);

    List<Adapter> eAdapters = rootEObject.eAdapters();
    for (Adapter adapter : eAdapters) {
      if (adapter instanceof ConMLGenConfigurationHolder) {
        return (ConMLGenConfigurationHolder) adapter;
      }
    }

    return null;
  }

  private static String getStringValue(EObject eObject, String key) {
    ConMLGenConfigurationHolder configurationHolder =
        ConMLGenConfigurationHolder.getConfigurationHolder(eObject);
    if (configurationHolder != null) {
      Object object = configurationHolder.getValue(key);
      if (object instanceof String) {
        return (String) object;
      }
    }
    return "";
  }

  public Object getValue(String key) {
    return this.configuration.get(key);
  }

  @Override
  public boolean isAdapterForType(Object type) {
    return type == ConMLGenConfigurationHolder.class;
  }
}
