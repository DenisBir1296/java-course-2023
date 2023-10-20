package hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask2 {

    @Test
    void TestMinutesToSeconds()
    {
        assertThat(Task2.minutesToSeconds("01:00")).isEqualTo(60);
        assertThat(Task2.minutesToSeconds("13:56")).isEqualTo(836);
        assertThat(Task2.minutesToSeconds("10:60")).isEqualTo(-1);
    }
}
