package IntegerBreak;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/4/23.
 */
public class Solution {
    public int integerBreak(int n) {
        int max = 0;
        for (int breakNum=2; breakNum<=n; breakNum++ ) {
            int[] p;
            int result = n / breakNum;
            int remainder = n % breakNum;
            if (remainder == 0) {
                p = new int[breakNum];
                for ( int i=0; i<breakNum; i++) {
                    p[i] = result + remainder;
                }
            } else {
                p = new int[breakNum];
                for ( int i=0; i<breakNum; i++) {
                    p[i] = result;
                }
                for ( int i=0; i<remainder; i++) {
                    p[i] = p[i] + 1;
                }
            }
            int prod = 1;
            for (int i=0; i<p.length; i++) {
                prod = prod * p[i];
            }
            if (prod > max) {
                max = prod;
            }
        }
        return max;
    }

    @Test
    public void test() {
        System.out.println(integerBreak(19));
        System.out.println(1722712064>2124471432);

    }
}
