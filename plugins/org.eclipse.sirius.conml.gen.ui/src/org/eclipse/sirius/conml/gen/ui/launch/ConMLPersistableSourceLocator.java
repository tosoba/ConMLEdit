package org.eclipse.sirius.conml.gen.ui.launch;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;

public final class ConMLPersistableSourceLocator extends AbstractSourceLookupDirector {

  @Override
  public void initializeParticipants() {
    addParticipants(new ISourceLookupParticipant[] {new ConMLModelLookupParticipant()});
  }
}
