package My_Java_Mastermind;

/**
 * Represents the feedback for a guess.
 */
class Feedback {
    private final int wellPlaced;
    private final int misplaced;

    public Feedback(int wellPlaced, int misplaced) {
        this.wellPlaced = wellPlaced;
        this.misplaced = misplaced;
    }

    public int getWellPlaced() {
        return wellPlaced;
    }

    public int getMisplaced() {
        return misplaced;
    }

    public boolean isWin() {
        return wellPlaced == 4;
    }

    public void display() {
        if (isWin()) {
            System.out.println("Congrats! You did it!");
        } else {
            System.out.println("Well placed pieces: " + wellPlaced);
            System.out.println("Misplaced pieces: " + misplaced);
        }
    }
}
