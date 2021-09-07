/*
 * This file CANNOT be modified.
 */

package tw.evaluation.commands.handlers;

import tw.evaluation.commands.CommandResponse;

public class EmptyCommandHandler implements CommandHandler {
    @Override
    public boolean isSupport(String commandName) {
        return commandName.isEmpty();
    }

    @Override
    public CommandResponse handle(String[] commandTokens) {
        return new CommandResponse();
    }
}
