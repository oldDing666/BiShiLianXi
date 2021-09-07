/*
 * You can ONLY modify code within the <-start- and --end-> region.
 */

package tw.evaluation.commands;

import java.util.ArrayList;
import java.util.List;

public class ArgumentParser {
    private ArgumentParser() {
    }

    public static String[] parse(String command) {
        List<String> tokens = splitCommandToTokens(command);

        if (tokens.isEmpty()) {
            // for empty command
            return new String[]{""};
        }

        return tokens.toArray(new String[0]);
    }

    private static List<String> splitCommandToTokens(String command) {
        // TODO: Please implement this method
        // <-start-
        List<String> result = new ArrayList<>();
        command = command.trim();
        String[] tempCommand = command.split(" ");

        for (String item : tempCommand) {
            if (!item.equals("") || !item.equals(" "))
                result.add(item);
        }
        return result;
        // --end-->
    }
}
