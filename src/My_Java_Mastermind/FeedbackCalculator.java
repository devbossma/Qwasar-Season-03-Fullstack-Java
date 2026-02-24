package My_Java_Mastermind;

/**
 * Calculates feedback using the 2-pass algorithm.
 */
class FeedbackCalculator {
    private static final int CODE_LENGTH = 4;

    public Feedback calculate(String secret, String guess) {
        int wellPlaced = 0;
        int misplaced = 0;

        boolean[] secretUsed = new boolean[CODE_LENGTH];
        boolean[] guessUsed = new boolean[CODE_LENGTH];

        // First pass: Count well placed pieces.
        for (int i = 0; i < CODE_LENGTH; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                wellPlaced++;
                secretUsed[i] = true;
                guessUsed[i] = true;
            }
        }

        // Second pass: Count misplaced pieces
        for (int i = 0; i < CODE_LENGTH; i++) {
            if (!guessUsed[i]) {
                for (int j = 0; j < CODE_LENGTH; j++) {
                    if (!secretUsed[j] && guess.charAt(i) == secret.charAt(j)) {
                        misplaced++;
                        secretUsed[j] = true;
                        break;
                    }
                }
            }
        }

        return new Feedback(wellPlaced, misplaced);
    }
}