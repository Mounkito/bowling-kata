package domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FrameTest {

    @Mock
    private Roll roll;

    @Test
    public void frame_with_two_roll_0_should_score_0() throws Exception {
        when(roll.getScore()).thenReturn(0,0);
        Frame frame = new Frame(new Roll[]{roll, roll});
        assertThat(frame.getScore()).isEqualTo(0);
    }

    @Test
    public void frame_with_two_roll_4_should_score_8() throws Exception {
        when(roll.getScore()).thenReturn(4,4);
        Frame frame = new Frame(new Roll[]{roll,roll});
        assertThat(frame.getScore()).isEqualTo(8);
    }
}