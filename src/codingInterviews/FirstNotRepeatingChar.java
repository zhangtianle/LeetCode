package codingInterviews;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str == "") {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test() {
        System.out.println(FirstNotRepeatingChar("abaccdeff"));
    }
}
