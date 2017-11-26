package leetcode;

import org.junit.Test;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() > strs[i].length()) {
                prefix = prefix.substring(0, strs[i].length());
            }
            for (int j = 0; j < prefix.length(); j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                }
            }
        }
        return prefix;
    }

    @Test
    public void test() {
        System.out.println(longestCommonPrefix(new String[]{"aa", ""}));
    }
}
