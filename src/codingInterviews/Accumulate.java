package codingInterviews;

import org.junit.Test;

public class Accumulate {

    public int Sum_Solution(int n) {
        boolean b = (n != 0) && ((n += Sum_Solution(n - 1)) != 0);
        return n;
    }

    @Test
    public void test() {
        System.out.println(Sum_Solution(100));
    }
}
