package hw3;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static hw3.Task3.freqDict;
import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask3 {

    @Test void testFreqDict()
    {
        assertThat(freqDict(new  String[]{"aa", "aa", "aa", "cc"})).isEqualTo(new HashMap<String, Integer>(){{put("aa", 3); put("cc", 1);}});
    }
}
