package hw1;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Task7 {

    static final int[] K_ = new int[] {4, 7, 1, 6};
    static int K(int numb)
    {
        if (numb <= 1000 || numb > 9999)
            return -1;
        int count = 0;
        final int countOfDigits = 4;
        int[] Digits = new int[countOfDigits];
        for(int i = countOfDigits - 1; i > -1; i--){
            Digits[i] = numb % 10;
            numb /= 10;
        }

        while (!Arrays.equals(Digits, K_)) {
            Arrays.sort(Digits);
            int[] DigitsCopy = Digits.clone();

            for (int i = 0; i < countOfDigits; i++) {
                Digits[i] -= DigitsCopy[countOfDigits - i - 1];
                if (Digits[i] < 0) {
                    Digits[i] += 10;
                    Digits[i + 1] -= 1;
                }
            }
            count++;
        }
        return count;
    }
}
