package domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTestFeature {

    @Test
    public void game_without_strike_and_without_spare_should_score_62() throws Exception {
        // ROLL : 2/3 2/4 2/5 2/4 2/3 2/6 2/7 2/5 2/3 2/2/X
        Game game = new Game();
        assertThat(game.getScore()).isEqualTo(62);
    }
}