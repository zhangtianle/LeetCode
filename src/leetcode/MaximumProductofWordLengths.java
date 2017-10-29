package leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kyle on 2017/10/28.
 */
public class MaximumProductofWordLengths {

    public int maxProduct(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (duplicate(words[i], words[j])) {
                    int temp = words[i].length() * words[j].length();
                    if (max < temp) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    private boolean duplicate(String a, String b) {
        Set<Character> set = new HashSet<>();

        if (a.length() < b.length()) {
            String c = b;
            b = a;
            a = c;
        }
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            if (set.contains(b.charAt(i))) {
                return false;
            }
        }
        return true;

    }


    @Test
    public void test() {
        // TODO 超时
        System.out.println(maxProduct(new String[]{}));
    }

}
