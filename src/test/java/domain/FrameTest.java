package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrameTest {

    @Test
    public void frame_with_two_roll_0_should_score_0() throws Exception {
        Frame frame = new Frame(new Roll[]{new Roll(0), new Roll(0)});
        assertThat(frame.getScore()).isEqualTo(0);

    }
}