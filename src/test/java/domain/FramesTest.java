package domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FramesTest {


    private Frames frames;

    @Before
    public void setUp() throws Exception {
        frames = new Frames();
    }

    @Test
    public void should_add_one_frame() throws Exception {
        Frame firstFrame = new Frame((new Roll[]{new Roll(1), new Roll(2)}));
        frames.add(firstFrame);
        Assertions.assertThat(frames.size()).isEqualTo(1);
    }

    @Test
    public void should_return_the_next_element() throws Exception {
        Frame firstFrame = new Frame((new Roll[]{new Roll(1), new Roll(2)}));
        Frame expectedFrame = new Frame((new Roll[]{new Roll(2), new Roll(3)}));
        frames.add(firstFrame);
        frames.add(expectedFrame);
        Assertions.assertThat(frames.getNext()).isEqualTo(expectedFrame);
    }

    @Test
    public void should_return_null_if_the_next_frame_does_not_exist() throws Exception {
        Frame lastFrame = new Frame((new Roll[]{new Roll(1), new Roll(2)}));
        frames.add(lastFrame);
        Assertions.assertThat(frames.getNext()).isNull();
    }

    @Test
    public void should_return_the_roll_score_for_a_frame() throws Exception {
        Frame firstFrame = new Frame((new Roll[]{new Roll(1), new Roll(2)}));
        Frame lastFrame = new Frame((new Roll[]{new Roll(4), new Roll(2)}));
        frames.add(firstFrame);
        frames.add(lastFrame);
        Assertions.assertThat(frames.getRollOneScoreForNextFrame()).isEqualTo(4);
    }
}
