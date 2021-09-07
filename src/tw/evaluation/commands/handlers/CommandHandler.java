/*
 * This file CANNOT be modified.
 */

package tw.evaluation.commands.handlers;

import tw.evaluation.commands.CommandResponse;

public interface CommandHandler {
    boolean isSupport(String commandName);

    CommandResponse handle(String[] commandTokens) throws Exception;
}
