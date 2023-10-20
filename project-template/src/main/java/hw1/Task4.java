package hw1;

import java.util.Arrays;

public class Task4 {
    static boolean isNestable(int[] a, int[] b){
        boolean flag = Arrays.stream(a).min().getAsInt() > Arrays.stream(b).min().getAsInt() && Arrays.stream(a).max().getAsInt() < Arrays.stream(b).max().getAsInt();
        return flag;
    }
}
