package leetcode;

/**
 * Created by Kyle on 2017/11/6.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] d = new int[nums.length];

        d[0] = nums[0];
        if (nums.length > 1) {
            d[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                d[i] = Math.max(d[i-2] + nums[i], d[i-1]);
            }
            return d[nums.length-1];
        } else {
            return nums[0];
        }
    }
}
