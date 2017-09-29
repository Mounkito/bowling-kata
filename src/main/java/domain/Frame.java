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



    @Override
    public String toString() {
        return "Frame{" +
                "rolls=" + Arrays.toString(rolls) +
                ", score=" + score +
                '}';
    }

    public boolean isSpare() {
        if(!isStrike() && getScoreRoll1() + getScoreRoll2() == 10){
            return true;
        }
        return false;
    }

    public int getScoreRoll1() {
        return rolls[0].getScore();
    }

    public int getScoreRoll2() {
        return rolls[1].getScore();
    }

    public void addScoreBonus(int bonus) {
        score += bonus;
    }

    public boolean isStrike() {
        if(rolls[0].getScore() == 10)
        {
            return true;
        }
        return false;
    }
}
