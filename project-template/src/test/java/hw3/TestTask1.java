package hw3;

import org.junit.jupiter.api.Test;
import static hw3.Task1.atbash;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask1 {
    @Test
    public void testAtbash()
    {
        assertThat(atbash("AbCd")).isEqualTo("ZyXw");
        assertThat(atbash("Az!")).isEqualTo("Za!");
        assertThat(atbash("Hello world!")).isEqualTo("Svool dliow!");
    }
}
