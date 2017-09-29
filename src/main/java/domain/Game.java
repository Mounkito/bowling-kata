package domain;

public class Game {

    private Frames frames = new Frames();

    public int getScore() {
        if (frames.size() == 0) {
            return 0;
        }

        int score = 0;
        do {
            if (frames.isCurrentSpare())
                frames.addBonusToCurrent();
            score += frames.getCurrent().getScore();
        } while (frames.getNext() != null);
        return score;
    }

    public void add(Frame frame) {
        this.frames.add(frame);
    }
}
