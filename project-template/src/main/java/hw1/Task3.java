package hw1;

public class Task3 {

    static int countDigits(int number)
    {
        int count = 1;
        while((number /= 10) != 0)
            count++;
        return count;
    }
}
