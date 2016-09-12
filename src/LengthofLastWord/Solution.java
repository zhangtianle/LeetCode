package LengthofLastWord;

import org.junit.Test;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string. If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * For example,
 * Given s = "Hello World",
 * return 5.
 *
 * Created by Tianle Zhang on 2016/9/12.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] rs = s.split(" ");
        if (rs.length > 0) {
            return rs[rs.length - 1].length();
        }
        return 0;
    }

    @Test
    public void test() {
        System.out.println(lengthOfLastWord(""));
    }
}
