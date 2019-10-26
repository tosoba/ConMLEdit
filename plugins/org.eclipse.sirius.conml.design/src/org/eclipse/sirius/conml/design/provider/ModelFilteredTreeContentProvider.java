package org.eclipse.sirius.conml.design.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

public class ModelFilteredTreeContentProvider extends AdapterFactoryContentProvider {
  private final Predicate<Object> predicate;

  public ModelFilteredTreeContentProvider(
      AdapterFactory adapterFactory, Predicate<Object> predicate) {
    super(adapterFactory);
    this.predicate = predicate;
  }

  private Object[] filter(Object[] unfiltered) {
    final List<Object> filtered = Lists.newArrayList();
    for (final Object o : unfiltered) {
      if (predicate.apply(o)) {
        filtered.add(o);
      }
    }
    return filtered.toArray(new Object[filtered.size()]);
  }

  @Override
  public Object[] getChildren(Object object) {
    final Object[] unfiltered = super.getChildren(object);
    return filter(unfiltered);
  }

  @SuppressWarnings("rawtypes")
  @Override
  public Object[] getElements(Object object) {
    if (object instanceof Collection) {
      return filter(((Collection) object).toArray());
    }
    final Object[] unfiltered = super.getElements(object);
    return filter(unfiltered);
  }

  @Override
  public boolean hasChildren(Object object) {
    final Object[] children = getChildren(object);
    return children != null && children.length != 0;
  }
}
