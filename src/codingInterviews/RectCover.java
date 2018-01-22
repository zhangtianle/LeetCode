package codingInterviews;

import org.junit.Test;

public class RectCover {
    public int rectCover(int target) {
        if (target <= 2) {
            return target;
        }

        int one = 2;
        int two = 1;

        int sum = 0;
        for (int i = 2; i < target; i++) {
            sum = one + two;
            two = one;
            one = sum;

        }
        return sum;
    }

    @Test
    public void test() {
        System.out.println(rectCover(5));
    }
}
