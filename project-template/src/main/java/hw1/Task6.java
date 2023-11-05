package hw1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Task6 {

    private static List<Integer> getDigits(int numb) {
        List<Integer> Digits = new LinkedList<>();
        do {
            Digits.add(numb % 10);
            numb /= 10;
        } while (numb > 0);
        return Digits;
    }

    static boolean isPalindromeDescendant(int numb) {
        boolean flag = false;
        List<Integer> buff;
        List<Integer> Digits = getDigits(numb);
        while (Digits.size() > 1) {
            flag = true;
            for (int i = 0; flag && i < Digits.size() / 2; i++) {
                flag = Digits.get(i).equals(Digits.get(Digits.size() - i - 1));
            }
            if ((Digits.size() & 1) == 1 || flag) {
                break;
            }
            for (int i = 0; i < Digits.size(); ) {
                buff = getDigits(Digits.remove(i) + Digits.remove(i));
                Digits.addAll(i, buff);
                i += buff.size();
            }
        }
        return flag;
    }
}
