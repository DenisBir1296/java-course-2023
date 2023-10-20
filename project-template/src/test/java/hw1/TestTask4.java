package hw1;

import org.junit.jupiter.api.Test;

public class TestTask4 {

    @Test
    void TestIsNestable(){
        System.out.println(Task4.isNestable(new int[]{126, 6}, new int[]{6, 2, 12, 6, 2}));
    }
}
