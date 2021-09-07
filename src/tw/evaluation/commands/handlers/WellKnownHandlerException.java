/*
 * This file CANNOT be modified.
 */

package tw.evaluation.commands.handlers;

import tw.evaluation.commands.CommandResponse;

public class WellKnownHandlerException extends RuntimeException {
    public WellKnownHandlerException() {
    }

    public WellKnownHandlerException(String message) {
        super(message);
    }

    public WellKnownHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommandResponse createResponse() {
        return new CommandResponse(HelpFormatter.badCommand(getMessage()), false);
    }
}
