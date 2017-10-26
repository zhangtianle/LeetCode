package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/26.
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j % 5 == 0) {
                num++;
                j /= 5;
            }
        }
        return num;
    }

    public int trailingZ(int n) {
        int num = 0;
        while (n > 0) {
            n /= 5;
            num += n;
        }
        return num;
    }

    @Test
    public void test() {
//        System.out.println("123".subSequence(0,3));
        System.out.println(trailingZeroes(1808548329));
        System.out.println(trailingZ(1808548329));
    }
}
