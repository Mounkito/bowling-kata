package domain;

public class Roll {
    private int score;

    public Roll(int pins) {
        score = pins;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Roll{" +
                "score=" + score +
                '}';
    }
}
