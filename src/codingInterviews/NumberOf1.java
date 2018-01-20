package codingInterviews;

import org.junit.Test;

public class NumberOf1 {
    public int numberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) == flag) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    @Test
    public void test() {
        System.out.println(numberOf1(5));
    }
}
