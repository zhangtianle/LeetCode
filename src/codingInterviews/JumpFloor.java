package codingInterviews;

import org.junit.Test;

public class JumpFloor {
    public int jumpFloor(int target) {
        if (target <= 2) {
            return target;
        }

        int one = 2;
        int two = 1;
        int re = 0;

        for (int i = 3; i <= target; i++) {
            re = one + two;
            two = one;
            one = re;
        }
        return re;
    }

    @Test
    public void test() {
        System.out.println(jumpFloor(4));
    }
}
