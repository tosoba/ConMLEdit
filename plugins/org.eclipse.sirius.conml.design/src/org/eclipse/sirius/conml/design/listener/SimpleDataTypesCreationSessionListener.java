package org.eclipse.sirius.conml.design.listener;

import java.lang.ref.WeakReference;
import java.util.Collection;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.conml.design.services.common.DomainServices;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import conml.Domain;
import conml.types.BaseDataType;
import conml.types.SimpleDataType;
import conml.types.TypesFactory;

public final class SimpleDataTypesCreationSessionListener implements SessionManagerListener {

  @Override
  public void notifyAddSession(Session newSession) {}

  @Override
  public void notifyRemoveSession(Session removedSession) {}

  @Override
  public void viewpointSelected(Viewpoint selectedSirius) {}

  @Override
  public void viewpointDeselected(Viewpoint deselectedSirius) {}

  @Override
  public void notify(Session updated, int notification) {
    final WeakReference<Session> weakSession = new WeakReference<Session>(updated);
    switch (notification) {
      case SessionListener.OPENED:
        if (weakSession.get() != null) {
          weakSession
              .get()
              .getTransactionalEditingDomain()
              .getCommandStack()
              .execute(
                  new RecordingCommand(weakSession.get().getTransactionalEditingDomain()) {
                    @Override
                    protected void doExecute() {
                      final Collection<Domain> roots =
                          DomainServices.getInstance()
                              .getAllDiagramRootsFromSession(weakSession.get());
                      for (final Domain root : roots) {
                        final long numberOfTypes =
                            root.getParts()
                                .stream()
                                .filter(SimpleDataType.class::isInstance)
                                .count();
                        if (numberOfTypes == 0) {
                          for (final BaseDataType base : BaseDataType.values()) {
                            final SimpleDataType type =
                                TypesFactory.eINSTANCE.createSimpleDataType();
                            type.setBase(base);
                            type.setName(base.getName());
                            root.getParts().add(type);
                          }
                        }
                      }
                    }
                  });
        }
        break;
    }
  }
}
