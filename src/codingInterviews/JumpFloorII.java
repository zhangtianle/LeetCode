package codingInterviews;

import org.junit.Test;

public class JumpFloorII {
    public int jumpFloorII(int target) {
        if (target == 1) {
            return 1;
        }
        return 2<<(target-2);
    }

    @Test
    public void test() {
        System.out.println(jumpFloorII(2));
    }
}
