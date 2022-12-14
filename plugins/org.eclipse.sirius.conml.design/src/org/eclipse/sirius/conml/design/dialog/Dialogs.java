package org.eclipse.sirius.conml.design.dialog;

import java.util.function.Function;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.conml.design.util.messages.Messages;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

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

  public static boolean showSimpleQuestion(final String title, final String question) {
    return Dialogs.show(
            title,
            question,
            new String[] {Messages.getString("Message.Ok"), Messages.getString("Message.Cancel")},
            MessageDialog.QUESTION)
        == 0;
  }

  public static String openInput(
      final String title,
      final String message,
      final String intialInputValue,
      final String emptyInputMessage) {
    final InputDialog dialog =
        new InputDialog(
            PlatformUI.getWorkbench().getDisplay().getActiveShell(),
            title,
            message,
            intialInputValue,
            newText -> newText == null || newText.isEmpty() ? emptyInputMessage : null);
    if (dialog.open() != Window.OK) return null;
    else return dialog.getValue();
  }

  public static <T> Object[] showSelection(
      final T[] selectionItems,
      final Function<T, String> getLabel,
      final String title,
      final String message,
      final boolean multipleSelection) {
    final ElementListSelectionDialog dialog =
        new ElementListSelectionDialog(
            PlatformUI.getWorkbench().getDisplay().getActiveShell(),
            new LabelProvider() {
              @SuppressWarnings("unchecked")
              @Override
              public String getText(Object element) {
                return getLabel.apply((T) element);
              }
            });
    dialog.setElements(selectionItems);
    dialog.setTitle(title);
    dialog.setMessage(message);
    dialog.setMultipleSelection(multipleSelection);
    if (dialog.open() != Window.OK) return new Object[] {};
    else return dialog.getResult();
  }

  private static Status createStatus(String msg) {
    return new Status(IStatus.ERROR, pluginId, msg);
  }

  public static <T> T showSingleTreeSelectionDialog(
      final Object input,
      final String title,
      final String message,
      final ILabelProvider labelProvider,
      final ITreeContentProvider treeContentProvider,
      final Class<T> resultClass) {
    final ElementTreeSelectionDialog dialog =
        new ElementTreeSelectionDialog(
            PlatformUI.getWorkbench().getDisplay().getActiveShell(),
            labelProvider,
            treeContentProvider);
    dialog.setInput(input);
    dialog.setTitle(title);
    dialog.setMessage(message);
    if (dialog.open() != Window.OK) return null;
    final Object[] result = dialog.getResult();
    if (result != null && result.length == 1 && resultClass.isInstance(result[0]))
      return resultClass.cast(result[0]);
    else return null;
  }
}
