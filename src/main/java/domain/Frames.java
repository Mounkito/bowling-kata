package domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    private List<Frame> frames = new ArrayList<>();
    int index = 0;

    public int size() {
        return frames.size();
    }

    public void add(Frame frame) {
        frames.add(frame);
    }

    public Frame getNext() {
        if(index == size() -1)
            return null;
        return frames.get(++index);
    }

    public Frame getCurrent() {
        return frames.get(index);
    }

    public int getRollOneScoreForNextFrame() {
       return getNext().getScoreRoll1();
    }

    public boolean isCurrentSpare() {
        return getCurrent().isSpare();
    }
}
