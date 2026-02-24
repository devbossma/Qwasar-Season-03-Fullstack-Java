package My_Java_Mastermind;

import java.util.*;

/**
 * Responsible for generating random secret codes.
 */
class CodeGenerator {
    private static final int CODE_LENGTH = 4;
    private static final int MAX_DIGIT = 8;

    public static String generate() {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i <= MAX_DIGIT; i++) {
            digits.add(i);
        }
        Collections.shuffle(digits);

        StringBuilder code = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(digits.get(i));
        }
        return code.toString();
    }
}