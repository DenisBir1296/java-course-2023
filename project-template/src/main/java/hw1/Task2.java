package hw1;

// нумерация заданий с 1, а не с 0

public class Task2 {
    static int minutesToSeconds(String time) {
        int minutes, seconds;
        String[] t = time.split(":");
        if (t.length != 2) {
            return -1;
        }
        if (((minutes = Integer.parseInt(t[0])) < 0) || ((seconds = Integer.parseInt(t[1])) > 59) || (seconds < 0)) {
            return -1;
        }
        return 60 * minutes + seconds;
    }
}
