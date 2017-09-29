package domain;

public class Frame {
    private Roll[] rolls = new Roll[3];

    public Frame(Roll[] rolls) {
        this.rolls = rolls;
    }

    public int getScore() {
        int score = 0;
        for (Roll roll : rolls) {
            score += roll.getScore();
        }
        return score;
    }
}
