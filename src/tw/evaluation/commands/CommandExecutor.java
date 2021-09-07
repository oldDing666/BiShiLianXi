/*
 * You can ONLY modify code within the <-start- and --end-> region.
 */

package tw.evaluation.commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tw.evaluation.commands.handlers.*;
import tw.evaluation.repository.CounterRepository;

import java.util.Arrays;
import java.util.Optional;

public class CommandExecutor {
    private final CommandHandler[] handlers;
    private static final Logger logger = LoggerFactory.getLogger(CommandExecutor.class);

    public CommandExecutor(CounterRepository repository) {
        // TODO: Please modify the implementation if necessary.
        // <-start-
        handlers = new CommandHandler[]{
                new EmptyCommandHandler(),
                new QuitCommandHandler(),
                new CreateCounterHandler(repository)
        };
        // --end-->
    }

    public CommandResponse execute(String command) {
        final String[] commandTokens = ArgumentParser.parse(command);
        final String commandName = commandTokens[0];

        final Optional<CommandHandler> matchedHandler = Arrays.stream(handlers)
                .filter(handler -> handler.isSupport(commandName)).findFirst();

        return matchedHandler.map(handler -> {
            try {
                return handler.handle(commandTokens);
            } catch (WellKnownHandlerException error) {
                return error.createResponse();
            } catch (Exception error) {
                logger.warn("Unknown error", error);
                return new CommandResponse("Unknown error: " + error.getMessage(), false);
            }
        }).orElse(new CommandResponse("Command not found: " + commandName, false));
    }
}
