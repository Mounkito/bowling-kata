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

    @Mock
    private Roll roll2;


    @Test
    public void frame_with_two_roll_0_should_score_0() throws Exception {
        when(roll.getScore()).thenReturn(0);
        when(roll2.getScore()).thenReturn(0);
        Frame frame = new Frame(new Roll[]{roll, roll2});
        assertThat(frame.getScore()).isEqualTo(0);
    }

    @Test
    public void frame_with_two_roll_4_should_score_8() throws Exception {
        when(roll.getScore()).thenReturn(4);
        when(roll2.getScore()).thenReturn(4);
        Frame frame = new Frame(new Roll[]{roll,roll2});
        assertThat(frame.getScore()).isEqualTo(8);
    }

    @Test
    public void frame_with_10_score_is_spare() throws Exception {
        when(roll.getScore()).thenReturn(5);
        when(roll2.getScore()).thenReturn(5);
        Frame frame = new Frame(new Roll[]{roll,roll2});
        assertThat(frame.isSpare()).isTrue();
    }

    @Test
    public void frame_with_9_score_is_not_spare() throws Exception {
        when(roll.getScore()).thenReturn(4);
        when(roll2.getScore()).thenReturn(5);
        Frame frame = new Frame(new Roll[]{roll,roll2});
        assertThat(frame.isSpare()).isFalse();
    }

    @Test
    public void adding_bonus_score_for_a_spare() throws Exception {
        when(roll.getScore()).thenReturn(4);
        when(roll2.getScore()).thenReturn(5);
        Frame frame = new Frame(new Roll[]{roll,roll2});
        frame.addScoreBonus(5);
        assertThat(frame.getScore()).isEqualTo(14);
    }

    @Test
    public void frame_with_10_score_is_strike() throws Exception {
        when(roll.getScore()).thenReturn(10);
        Frame frame = new Frame(new Roll[]{roll});
        assertThat(frame.isStrike()).isTrue();

    }
    @Test
    public void frame_with_10_score_is_strike_but_not_spare() throws Exception {
        when(roll.getScore()).thenReturn(10);
        Frame frame = new Frame(new Roll[]{roll});
        assertThat(frame.isSpare()).isFalse();
    }
}