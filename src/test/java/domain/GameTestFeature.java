package domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTestFeature {

    @Test
    public void game_without_strike_and_without_spare_should_score_62() throws Exception {
        // ROLL : 2/3 2/4 2/5 2/4 2/3 2/6 2/7 2/5 2/3 2/2/X
        Game game = new Game();
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(4)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(5)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(4)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(6)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(7)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(5)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(2)}));
        assertThat(game.getScore()).isEqualTo(62);
    }
}
