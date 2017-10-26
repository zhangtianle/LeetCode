import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kyle on 2017/10/26.
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                return c;
            } else {
                map.replace(c, map.get(c) - 1);
            }
        }

        for ( Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }

        return 'z';

    }

    @Test
    public void test() {
        System.out.println(findTheDifference("abc", "aebc"));
    }
}
