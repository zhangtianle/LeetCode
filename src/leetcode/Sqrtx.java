package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/31.
 */
public class Sqrtx {
    public int mySqrt(int x) {
//        return (int)Math.sqrt(x);
        int g = x;
        while (g*g - x >= 1) {
            g = (g + x / g) / 2;
        }
        return g;
    }

    @Test
    public void test() {
        System.out.println(mySqrt(50));
    }
}
