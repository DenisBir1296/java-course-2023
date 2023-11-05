package hw1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTask7 {

    @Test
    void TestK() {
        assertThat(Task7.K(6621)).isEqualTo(5);
        assertThat(Task7.K(6554)).isEqualTo(4);
        assertThat(Task7.K(1234)).isEqualTo(3);
        assertThat(Task7.K(3524)).isEqualTo(3);

        assertThat(Task7.K(1110)).isBetween(0, 8);
        assertThat(Task7.K(2200)).isBetween(0, 8);
        assertThat(Task7.K(2000)).isBetween(0, 8);
        assertThat(Task7.K(9876)).isBetween(0, 8);
        assertThat(Task7.K(8458)).isBetween(0, 8);
        assertThat(Task7.K(1269)).isBetween(0, 8);
        assertThat(Task7.K(8526)).isBetween(0, 8);
        assertThat(Task7.K(2567)).isBetween(0, 8);
        assertThat(Task7.K(1942)).isBetween(0, 8);
        assertThat(Task7.K(6831)).isBetween(0, 8);
    }
}
