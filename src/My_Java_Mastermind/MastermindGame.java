package My_Java_Mastermind;

import java.util.*;
/**
 * Main game engine that orchestrates the game loop.
 */
class MastermindGame {
    private final String secretCode;
    private final int maxAttempts;
    private final InputValidator validator;
    private final FeedbackCalculator calculator;
    private final Scanner scanner;

    public MastermindGame(GameConfig config) {
        this.secretCode = config.getSecretCode();
        this.maxAttempts = config.getMaxAttempts();
        this.validator = new InputValidator();
        this.calculator = new FeedbackCalculator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        displayWelcome();
        playGameLoop();
    }

    private void displayWelcome() {
        System.out.println("Will you find the secret code?");
    }

    private void playGameLoop() {
        int round = 0;

        while (round < maxAttempts) {
            System.out.println("---");
            System.out.println("Round " + round);
            System.out.print(">");

            if (!scanner.hasNextLine()) {
                System.out.println("exit");
                return;
            }

            String guess = scanner.nextLine();

            if (!validator.isValid(guess)) {
                continue;
            }

            Feedback feedback = calculator.calculate(secretCode, guess);
            feedback.display();

            if (feedback.isWin()) {
                return;
            }

            round++;
        }

        System.out.println("Game over! The secret code was: " + secretCode);
    }
}
