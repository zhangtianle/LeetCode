package PalindromeNumber;

import org.junit.Test;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * Created by Tianle Zhang on 2016/5/11.
 */
public class Solution {

    public boolean isPalindrome(int x) {
        int initx = x;
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        if (initx < 0) {
            return false;
        }

        if (result == initx) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void test() {
        System.out.println(isPalindrome(-2147447412));
    }
}
