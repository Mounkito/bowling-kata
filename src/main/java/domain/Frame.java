package domain;

import java.util.Arrays;

public class Frame {
    private Roll[] rolls = new Roll[3];
    private int score;

    public Frame(Roll[] rolls) {
        this.rolls = rolls;
        for (Roll roll : rolls) {
            score += roll.getScore();
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScoreRoll1() {
        return rolls[0].getScore();
    }

    @Override
    public String toString() {
        return "Frame{" +
                "rolls=" + Arrays.toString(rolls) +
                ", score=" + score +
                '}';
    }

    public boolean isSpare() {
        if(score == 10){
            return true;
        }
        return false;
    }
}
