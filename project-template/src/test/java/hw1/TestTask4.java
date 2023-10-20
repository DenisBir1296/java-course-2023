package hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask4 {

    @Test
    void TestIsNestable(){
        assertThat(Task4.isNestable(new int[]{1, 2, 3, 4}, new int[]{0, 6})).isEqualTo(true);
        assertThat(Task4.isNestable(new int[]{3, 1}, new int[]{4, 0})).isEqualTo(true );
        assertThat(Task4.isNestable(new int[]{9, 9, 8}, new int[]{8, 9})).isEqualTo(false);
        assertThat(Task4.isNestable(new int[]{1, 2, 3, 4}, new int[]{2, 3})).isEqualTo(false);
    }
}
