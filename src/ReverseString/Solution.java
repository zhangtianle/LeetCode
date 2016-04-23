package ReverseString;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/4/23.
 */
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=chars.length-1; i>=0; i--) {
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }

    @Test
    public void test() {
        System.out.println(reverseString("hello"));
    }
}
