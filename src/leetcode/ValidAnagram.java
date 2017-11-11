package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sMap.containsKey(c)) {
                sMap.replace(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (sMap.containsKey(c)) {
                sMap.replace(c, sMap.get(c) - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (entry.getValue() != 0 ) {
                return false;
            }
        }
        return true;
    }
}
