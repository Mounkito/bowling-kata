package domain;

public class Game {

    private int score;
    private Frame frame;

    public int getScore() {
        if (frame == null) {
            return 0;
        }
        return frame.getScore();
    }

    public void add(Frame frame) {
        this.frame = frame;
    }
}
