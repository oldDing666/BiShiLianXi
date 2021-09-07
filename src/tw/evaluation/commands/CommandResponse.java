/*
 * This file CANNOT be modified.
 */

package tw.evaluation.commands;

public class CommandResponse {
    private final boolean isQuit;
    private final String message;
    private final boolean isSuccess;

    public CommandResponse(boolean isQuit, String message, boolean isSuccess) {
        this.isQuit = isQuit;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public CommandResponse() {
        this(false, null, true);
    }

    public CommandResponse(String message, boolean isSuccess) {
        this(false, message, isSuccess);
    }

    public boolean isQuit() {
        return isQuit;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
