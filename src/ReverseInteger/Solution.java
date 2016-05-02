package ReverseInteger;

import org.junit.Test;

/**
 * 7. Reverse Integer
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * Created by Tianle Zhang on 2016/5/2.
 */
public class Solution {
    public int reverse(int x) {
        if (x<0) {
            x = x * (-1);
            String s = x+ "";
            StringBuffer sb = new StringBuffer(s);
            int i = Integer.parseInt(sb.reverse().toString());
            return -i;
        }
        String s = x+ "";
        StringBuffer sb = new StringBuffer(s);
        int i = Integer.parseInt(sb.reverse().toString());
        return i;
    }

    @Test
    public void test() {
        System.out.println(reverse(-1100000011));
        System.out.println(Integer.MAX_VALUE);
    }
}
