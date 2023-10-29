package hw3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {

    static Map<String, Integer> freqDict(String[] arr){
        Map<String, Integer> result = new HashMap<>();
        Integer buff;
        for (String i : arr)
            result.put(i, (buff = result.get(i)) != null ? buff + 1 : 1);
        return result;
    }
}
