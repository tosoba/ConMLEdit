package org.eclipse.sirius.conml.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;

public class Dialogs {

	private static final String pluginId = "org.eclipse.sirius.conml";

	public static void showError(String reason) {
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", "Error occurred", createStatus(reason));
	}

	public static void showError(String msg, String reason) {
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", msg, createStatus(reason));
	}

	private static Status createStatus(String msg) {
		return new Status(IStatus.ERROR, pluginId, msg);
	}

	private static MultiStatus createMultiStatus(String msg, Throwable trowable) {
		List<Status> childStatuses = new ArrayList<>();
		StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();

		for (StackTraceElement stackTrace : stackTraces) {
			Status status = new Status(IStatus.ERROR, pluginId, stackTrace.toString());
			childStatuses.add(status);
		}

		MultiStatus ms = new MultiStatus(pluginId, IStatus.ERROR, childStatuses.toArray(new Status[] {}),
				trowable.toString(), trowable);
		return ms;
	}
}
