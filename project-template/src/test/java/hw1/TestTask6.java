package hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask6 {

    @Test
    void testIsPalindromeDescendant() {
        assertThat(Task6.isPalindromeDescendant(123312)).isEqualTo(true);
        assertThat(Task6.isPalindromeDescendant(13001120)).isEqualTo(true);
        assertThat(Task6.isPalindromeDescendant(11211230)).isEqualTo(true);
        assertThat(Task6.isPalindromeDescendant(23336014)).isEqualTo(true);
        assertThat(Task6.isPalindromeDescendant(4850)).isEqualTo(false);
        assertThat(Task6.isPalindromeDescendant(11)).isEqualTo(true);
    }
}
