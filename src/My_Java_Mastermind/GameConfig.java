package My_Java_Mastermind;

/**
 * Holds game configuration (code and attempts).
 */
class GameConfig {
    private String secretCode;
    private int maxAttempts;

    public GameConfig(String secretCode, int maxAttempts) {
        this.secretCode = secretCode;
        this.maxAttempts = maxAttempts;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}
