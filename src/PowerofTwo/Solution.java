package PowerofTwo;

import org.junit.Test;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Created by Tianle Zhang on 2016/5/11.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {

        return n <=0 ? false : (n & (n - 1)) == 0;
    }

    @Test
    public void test() {
        System.out.println(isPowerOfTwo(15));
    }

}
