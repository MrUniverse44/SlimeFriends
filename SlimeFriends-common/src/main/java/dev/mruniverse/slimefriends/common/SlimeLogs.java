package dev.mruniverse.slimefriends.common;

import java.util.ArrayList;
import java.util.List;

public interface SlimeLogs {

    String pluginName = "SlimeFriends";

    String containIdentifier = "mruniverse";

    String hidePackage = "dev.mruniverse.slimefriends.";

    default String getPluginName() {
        return pluginName;
    }

    default String getContainIdentifier() {
        return containIdentifier;
    }

    default String getHidePackage() {
        return hidePackage;
    }

    default void error(String message) {
        send("&8[&aSlimeFriends&8] &cERROR &8| &b" + message);
    }

    default void error(Exception exception) {

        Class<?> current = exception.getClass();

        String location = current.getName();
        String error = current.getSimpleName();

        error("&b -------------------------");
        error("&bLocation: " + location.replace("." + error,""));
        error("&bError: " + error);

        if (exception.getStackTrace() != null) {

            error("&bInternal - StackTrace: ");

            List<StackTraceElement> other = new ArrayList<>();

            for (StackTraceElement line : exception.getStackTrace()) {
                if (line.toString().contains(containIdentifier)) {
                    error("&b (Line: " + line.getLineNumber() + ") " + line.toString().replace("(" + line.getFileName() + ":" + line.getLineNumber() + ")","").replace(hidePackage,""));
                } else {
                    other.add(line);
                }
            }

            error("&b -------------------------");
            error("&bExternal - StackTrace: ");

            for (StackTraceElement line : other) {
                error("&b (Line: " + line.getLineNumber() + ") (Class: " + line.getFileName() + ") (Method: " + line.getMethodName() + ")".replace(".java",""));
            }
        }

        error("&b -------------------------");
    }

    default void error(String message, Exception exception) {
        error(message);
        error(exception);
    }

    default void warn(String message) {
        send("&8[&aSlimeFriends&8] &eWARN &8| &b" + message);
    }

    default void debug(String message) {
        send("&8[&aSlimeFriends&8] &9DEBUG &8| &b" + message);
    }

    default void info(String message) {
        send("&8[&aSlimeFriends&8] &bINFO &8| &b" + message);
    }

    void send(String message);
}
