package My_Java_Mastermind;

import java.util.*;

/**
 * Entry point - minimal and clean.
 */
public class my_mastermind {
    public static void main(String[] args) {
        CommandLineParser parser = new CommandLineParser();
        GameConfig config = parser.parse(args);

        MastermindGame game = new MastermindGame(config);
        game.start();
    }
}