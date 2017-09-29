package domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>();

    public int getScore() {
        if (frames == null) {
            return 0;
        }

        int score = 0;
        for (int i = 0; i < frames.size(); i++) {
            if(frames.get(i).isSpare())
                frames.get(i).setScore(10 + frames.get(i+1).getScoreRoll1());
            score += frames.get(i).getScore();
            System.out.println(score);
        }

        return score;
    }

    public void add(Frame frame) {
        this.frames.add(frame);
    }
}
