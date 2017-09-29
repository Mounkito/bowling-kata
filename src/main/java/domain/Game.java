package domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int score;
    private List<Frame> frames = new ArrayList<>();

    public int getScore() {
        if (frames == null) {
            return 0;
        }
        int score = 0;
        for (Frame frame : frames) {
            score += frame.getScore();
        }
        return score;
    }

    public void add(Frame frame) {
        this.frames.add(frame);
    }
}
