package My_Java_Mastermind;

/**
 * Validates user input according to game rules.
 */
class InputValidator {
    private static final int CODE_LENGTH = 4;
    private static final int MAX_DIGIT = 8;

    public boolean isValid(String input) {
        if (input.length() != CODE_LENGTH) {
            System.out.println("Wrong input!");
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '0' + MAX_DIGIT) {
                System.out.println("Wrong input!");
                return false;
            }
        }
        return true;
    }
}