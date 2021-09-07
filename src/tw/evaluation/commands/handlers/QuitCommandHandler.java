/*
 * This file CANNOT be modified.
 */

package tw.evaluation.commands.handlers;

import tw.evaluation.commands.CommandResponse;

public class QuitCommandHandler implements CommandHandler {
    private static final String HELP = "quit";

    @Override
    public boolean isSupport(String commandName) {
        return commandName.equals("quit");
    }

    @Override
    public CommandResponse handle(String[] commandTokens) {
        if (commandTokens.length != 1) {
            return new CommandResponse(HelpFormatter.badCommand(HELP), false);
        }

        return new CommandResponse(true, null, true);
    }
}
