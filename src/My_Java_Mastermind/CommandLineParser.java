package My_Java_Mastermind;

/**
 * Parses command line arguments.
 */
class CommandLineParser {
    private static final int CODE_LENGTH = 4;

    public GameConfig parse(String[] args) {
        String code = null;
        int attempts = 10;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-c") && i + 1 < args.length) {
                code = args[i + 1];
                if (code.length() > CODE_LENGTH) {
                    code = code.substring(0, CODE_LENGTH);
                }
                i++;
            } else if (args[i].equals("-t") && i + 1 < args.length) {
                try {
                    int customAttempts = Integer.parseInt(args[i + 1]);
                    if (customAttempts > 0 && customAttempts <= 10) {
                        attempts = customAttempts;
                    }
                } catch (NumberFormatException e) {
                    // If invalid number for -t flag -> We can Silently using default attempts.
                    // However I have chosen to print and Exit (Strict) to force correct usage.
                    System.err.println("Error: -t flag requires a valid number (1-10)");
                    System.exit(1);
                }
                i++;
            }
        }

        // Generate random code if not provided
        if (code == null) {
            code = CodeGenerator.generate();
        }

        return new GameConfig(code, attempts);
    }
}
