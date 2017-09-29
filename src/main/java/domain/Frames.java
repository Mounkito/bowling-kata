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
        return frames.get(++index);
    }
}
