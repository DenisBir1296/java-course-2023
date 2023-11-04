package hw1;

import java.util.Arrays;
import java.util.Collections;

public class Task7 {

    static final int K_ =  6174;
    static final int countOfDigits = 4;

     private static int[] getDigits(int numb){
        int[] Digits = new int[countOfDigits];
        for (int i = 0; i < countOfDigits; i++) {
            Digits[i] = numb % 10;
            numb /= 10;
        }
        return Digits;
    }

     private static int getValueFromDigits(int[] Digits){
        int val = 0;
        int multiplier = 1;
        for (int i = 0; i < countOfDigits; i++){
            val += Digits[i] * multiplier;
            multiplier *= 10;
        }
        return val;
    }

    static int K(int numb) {
        int[] Digits = getDigits(numb);

        Arrays.sort(Digits);
        numb = getValueFromDigits(Digits);

        int buff;
        for (int i = 0; i < countOfDigits / 2; i++)
        {
            buff = Digits[i];
            Digits[i] = Digits[countOfDigits - i - 1];
            Digits[countOfDigits - i - 1] = buff;
        }
        numb -= getValueFromDigits(Digits);

        if(numb == K_)
            return 1;

        return 1 + K(numb);
    }
}
