package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FramesTest {


    @Test
    public void should_add_one_frame() throws Exception {
        Frames frames = new Frames();
        Frame firstFrame = new Frame((new Roll[]{new Roll(1), new Roll(2)}));
        frames.add(firstFrame);
        Assertions.assertThat(frames.size()).isEqualTo(1);
    }
}
