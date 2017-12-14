package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/11/26.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 >= 0 && i + 1 < nums.length && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
            if (i == 0 && nums.length == 2 && nums[i] > nums[i + 1]) {
                return i;
            }
            if (i == nums.length - 1 && nums[i] > nums[i - 1]) {
                return i;
            }

        }
        return 0;
    }

    @Test
    public void test() {
        System.out.println(findPeakElement(new int[]{1, 2, 1}));
    }
}
