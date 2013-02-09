package com.blundell.facebook.mosaiccreator.logging;

public class Log {

	public static final boolean DEBUG = true;

	public static final String TAG = "FMC";

	public static void i(String msg) {
		try {
			if (DEBUG) {
				android.util.Log.i(TAG, getDetailedLog(msg));
			}
		} catch (RuntimeException ignore) {
			logError(ignore);
		}
	}

	public static void d(String msg) {
		try {
			if (DEBUG) {
				android.util.Log.d(TAG, getDetailedLog(msg));
			}
		} catch (RuntimeException ignore) {
			logError(ignore);
		}
	}

	public static void e(String msg) {
		try {
			if (DEBUG) {
				android.util.Log.e(TAG, getDetailedLog(msg));
			}
		} catch (RuntimeException ignore) {
			logError(ignore);
		}
	}

	public static void d(String msg, Throwable t) {
		try {
			if (DEBUG) {
				android.util.Log.d(TAG, getDetailedLog(msg), t);
			}
		} catch (RuntimeException ignore) {
			logError(ignore);
		}
	}

	public static void e(String msg, Throwable t) {
		try {
			if (DEBUG) {
				android.util.Log.e(TAG, getDetailedLog(msg), t);
			}
		} catch (RuntimeException ignore) {
			logError(ignore);
		}
	}

	private static String getDetailedLog(String msg) {
		return getDetailedLog(msg, 5);
	}

	private static String getDetailedLog(String msg, int depth) {
		if (!DEBUG) {
			return msg;
		}
		Thread current = Thread.currentThread();
		final StackTraceElement trace = current.getStackTrace()[depth];
		final String filename = trace.getFileName();
		return "[" + current.getName() + "][" + filename.substring(0, filename.length() - 5) + "." + trace.getMethodName() + ":"
				+ trace.getLineNumber() + "] " + msg;
	}

	private static void logError(Throwable ignore) {
		android.util.Log.e(TAG, "Error", ignore);
	}
}
