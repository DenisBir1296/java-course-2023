package hw1;

import java.util.Arrays;

public class Task6 {
    static boolean isPalindromeDescendant(int numb)
    {
        int count = Task3.countDigits(numb);// получили количество цифр
        boolean flag = true;
       int[] Digits = new int[count];
        for(int i = count - 1; i > -1; i--){
            Digits[i] = numb % 10;
            numb /= 10;
        }

        while (true){
            flag = true;
            for(int i = 0; flag && i < count / 2; i++)
                flag = Digits[i] == Digits[count - i - 1];
            if(count == 2 || flag)
                break;
            count /= 2;
            for (int i = 0; i < count; i++)
                Digits[i] = Digits[2*i] + Digits[2*i + 1];
        }

        return flag;
    }
}
