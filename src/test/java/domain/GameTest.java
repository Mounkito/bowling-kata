package domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    private Game game;

    @Mock
    private Frame frame;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void should_calc_score_without_frame() throws Exception {
        assertThat(game.getScore()).isEqualTo(0);
    }

    @Test
    public void should_calc_score_with_one_frame() throws Exception {
        when(frame.getScore()).thenReturn(1);
        game.add(frame);
        assertThat(game.getScore()).isEqualTo(1);
    }
}