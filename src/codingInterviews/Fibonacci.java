package codingInterviews;

import org.junit.Test;

public class Fibonacci {
    public int fibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }

        int one = 1;
        int two = 0;
        int re = one + two;

        for (int i = 2; i < n; i++) {
            two = one;
            one = re;
            re = one + two;
        }
        return re;
    }

    @Test
    public void test() {
        System.out.println(fibonacci(3));
    }
}
