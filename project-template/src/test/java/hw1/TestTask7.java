package hw1;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask7 {

    @Test
    void TestK()
    {
        assertThat(Task7.K(6621)).isEqualTo(5);
        assertThat(Task7.K(6554)).isEqualTo(4);
        assertThat(Task7.K(1234)).isEqualTo(3);
    }
}
