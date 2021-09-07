/*
 * This file CANNOT be modified.
 */

package tw.evaluation;

import tw.evaluation.commands.CommandExecutor;
import tw.evaluation.commands.CommandResponse;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CounterApplication {
    private final CommandExecutor executor;

    public CounterApplication(CommandExecutor executor) {
        this.executor = executor;
    }

    public void run(InputStream input, PrintStream output) {
        final Scanner scanner = new Scanner(input);

        while (true) {
            output.print("> ");
            final String command = scanner.nextLine();
            CommandResponse response = executor.execute(command);
            if (response.isQuit()) {
                return;
            }

            final String message = response.getMessage();

            if (response.isSuccess() && message == null) {
                continue;
            }

            output.println(message);
        }
    }
}
