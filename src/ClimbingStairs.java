import org.junit.Test;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Created by Tianle Zhang on 2016/10/7.
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs2(int n) {
        if (n == 0 || n == 1)
            return 1;

        int first = 1;
        int second = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = first + second;

            second = first;
            first = result;
        }
        return result;
    }

    @Test
    public void test() {
        System.out.println(climbStairs2(4));
    }
}
