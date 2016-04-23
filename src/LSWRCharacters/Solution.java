package LSWRCharacters;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * acabb
 * Created by Tianle Zhang on 2016/4/23.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<String,Integer> m = new HashMap<>();
        Map<Integer,String> rm = new HashMap<>();
        int max = 0;
        int tempMax = 0;
        for (int i=0; i<s.length(); i++) {
            if (!m.containsKey(s.charAt(i)+"")) {
                m.put(s.charAt(i)+"", i);
                rm.put(i,s.charAt(i)+"");
                tempMax++;
            } else {
                if (tempMax>max) {
                    max = tempMax;
                }
                tempMax = 1;
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        Map<String,Integer> m = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            m.put(s.charAt(i)+"",i);
            int tempMax = 0;
            for (int j=i+1; j<s.length(); j++) {
//                m.put(s.charAt(j)+"",j);
                if (m.containsKey(s.charAt(j)+"")) {
                    tempMax = j-i;
                    continue;
                }
            }
            if (tempMax>max) {
                max = tempMax;
            }
        }
        return max;
    }

    @Test
    public void test() {
        // TODO
        System.out.print(lengthOfLongestSubstring2("abc"));
    }
}
