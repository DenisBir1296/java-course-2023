package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Task1 {
    public static String atbash(String str)
    {
        String letters = "ABCDEFGHIJKLMabcdefghijklmnopqrstuvwxyzNOPQRSTUVWXYZ";
        return str.chars()
            .map(i -> letters.indexOf(i) != -1 ? letters.charAt(letters.length() - letters.indexOf(i) - 1) : i)
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());
    }
}
