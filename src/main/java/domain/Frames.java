package domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    private List<Frame> frames = new ArrayList<>();

    public int size() {
        return frames.size();
    }

    public void add(Frame frame) {
        frames.add(frame);
    }
}
