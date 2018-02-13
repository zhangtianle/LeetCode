package codingInterviews;

import org.junit.Test;

public class NumberOfOne {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int k = i;
            while (k != 0) {
                if (k % 10 == 1) {
                    count++;
                }
                k /= 10;
            }
        }
        return count;
    }

    @Test
    public void test() {
        System.out.println(NumberOf1Between1AndN_Solution(12));
    }
}
