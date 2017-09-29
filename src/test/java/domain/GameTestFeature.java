package domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTestFeature {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void game_without_strike_and_without_spare_should_score_62() throws Exception {
        // ROLL : 2/3 2/4 2/5 2/4 2/3 2/6 2/7 2/5 2/3 2/2/X
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

    @Test
    public void game_with_one_spare_and_without_strike_should_score_84() throws Exception {
        // ROLL : 3/4 3/7 5/3 5/3 6/3 4/3 5/3 2/3 5/3 5/4/x
        game.add(new Frame(new Roll[]{new Roll(3), new Roll(4)}));
        game.add(new Frame(new Roll[]{new Roll(3), new Roll(7)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(6), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(4), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(4)}));
        assertThat(game.getScore()).isEqualTo(84);
    }

    @Test
    public void game_with_one_spare_and_one_strike_should_score_84() throws Exception {
        // ROLL : 3/4 3/7 5/3 5/3 6/3 4/3 5/3 2/3 5/3 5/4/x
        game.add(new Frame(new Roll[]{new Roll(3), new Roll(4)}));
        game.add(new Frame(new Roll[]{new Roll(3), new Roll(7)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(6), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(10)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(2), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(3)}));
        game.add(new Frame(new Roll[]{new Roll(5), new Roll(4)}));
        assertThat(game.getScore()).isEqualTo(95);
    }
}
