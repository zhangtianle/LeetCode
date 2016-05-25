package Pow;

import org.junit.Test;

/**
 * Implement pow(x, n).
 *
 * 递归公式为：x^n = x^(n/2) * x^(n/2) * x^(n%2)
 *
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {
    public double myPow(double x, int n) {
        if(n>=0)
            return powPositive(x,n);
        else
            return 1/powPositive(x,-n);
    }

    double powPositive(double x, int n) {
        if(n==0) return 1;
        double res = powPositive(x, n/2);
        res *= res;
        if(n%2==1) res *= x;
        return res;
    }

    @Test
    public void test() {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(myPow(2,-2147483648));
    }
}
