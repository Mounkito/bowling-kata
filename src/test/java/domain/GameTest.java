package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    public void should_calc_score_without_frame() throws Exception {
        Game game = new Game();
        assertThat(game.getScore()).isEqualTo(0);
    }
}