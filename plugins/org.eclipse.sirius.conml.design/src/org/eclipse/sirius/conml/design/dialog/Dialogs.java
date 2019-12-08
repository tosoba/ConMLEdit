package org.eclipse.sirius.conml.design.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class Dialogs {

  private static final String pluginId = "org.eclipse.sirius.conml";

  public static void showError(String reason) {
    ErrorDialog.openError(
        Display.getCurrent().getActiveShell(), "Error", "Error occurred", createStatus(reason));
  }

  public static void showError(String msg, String reason) {
    ErrorDialog.openError(
        Display.getCurrent().getActiveShell(), "Error", msg, createStatus(reason));
  }

  public static int show(String title, String message, String[] buttons, int type) {
    return new MessageDialog(
            Display.getCurrent().getActiveShell(), title, null, message, type, buttons, 0)
        .open();
  }

  private static Status createStatus(String msg) {
    return new Status(IStatus.ERROR, pluginId, msg);
  }

  private static MultiStatus createMultiStatus(String msg, Throwable trowable) {
    final List<Status> childStatuses = new ArrayList<>();
    final StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();

    for (StackTraceElement stackTrace : stackTraces) {
      final Status status = new Status(IStatus.ERROR, pluginId, stackTrace.toString());
      childStatuses.add(status);
    }

    return new MultiStatus(
        pluginId,
        IStatus.ERROR,
        childStatuses.toArray(new Status[] {}),
        trowable.toString(),
        trowable);
  }
}
