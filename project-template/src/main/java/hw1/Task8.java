package hw1;

public class Task8 {

    static int rotateLeft(int n, int shift) {
        int bit = 1;

        while (bit <= n) {
            bit <<= 1;
        }

        n <<= shift;
        n += n / bit;
        n %= bit;
        return n;
    }

    static int rotateRight(int n, int shift) {
        int bit = 0;
        while ((1 << bit) <= n) {
            bit++;
        }

        n += (n % (1 << shift)) << bit;
        n >>= shift;
        n %= (1 << bit);
        return n;
    }
}
