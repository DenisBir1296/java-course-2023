package hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask8 {

    @Test
    void TestRotateLeft() {
        assertThat(Task8.rotateRight(9, 1)).isEqualTo(12);
        assertThat(Task8.rotateRight(8, 2)).isEqualTo(2);
        assertThat(Task8.rotateLeft(16, 1)).isEqualTo(1);
        assertThat(Task8.rotateLeft(17, 2)).isEqualTo(6);
    }
}
