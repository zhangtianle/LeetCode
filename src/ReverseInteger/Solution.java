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
        long result = 0;
        while ( x!= 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)result;
    }

    @Test
    public void test() {
        System.out.println(reverse(1534236469));
        System.out.println(Integer.MAX_VALUE);
    }
}
