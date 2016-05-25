package IsomorphicStrings;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * For example,
 * Given "egg", "add", return true.
 *
 * Given "foo", "bar", return false.
 *
 * Given "paper", "title", return true.
 *
 * Note:
 * You may assume both s and t have the same length.
 *
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        int[] is = new int[s.length()];
        int[] it = new int[t.length()];

        boolean result = true;
        Map<Character,Integer> ms = new HashMap<>();
        Map<Character,Integer> mt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!ms.containsKey(c)) {
                ms.put(c,i);
                is[i] = i;
            } else {
                int j = ms.get(c);
                is[i] = j;
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!mt.containsKey(c)) {
                mt.put(c,i);
                it[i] = i;
            } else {
                int j = mt.get(c);
                it[i] = j;
            }
        }

        for (int i = 0; i < is.length; i++) {
            if (is[i] != it[i]) {
                result = false;
            }
        }

        return result;
    }

    @Test
    public void test() {
        System.out.println(isIsomorphic("",""));
    }

}
