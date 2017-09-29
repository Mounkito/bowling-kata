package domain;

public class Frame {
    private Roll[] rolls = new Roll[3];
    private int score;

    public Frame(Roll[] rolls) {
        this.rolls = rolls;
    }

    public int getScore() {
        return score;
    }
}
