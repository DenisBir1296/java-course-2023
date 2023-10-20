package hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask3 {

    @Test
    void TestCountDigits(){
        assertThat(Task3.countDigits(4666)).isEqualTo(4);
        assertThat(Task3.countDigits(544)).isEqualTo(3);
        assertThat(Task3.countDigits(0)).isEqualTo(1);
    }

}
