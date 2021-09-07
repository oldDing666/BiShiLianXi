/*
 * This file CANNOT be modified.
 */

package tw.evaluation.commands.handlers;

class HelpFormatter {
    private HelpFormatter() {
    }

    public static String badCommand(String message) {
        return "Bad Command: " + message;
    }
}
