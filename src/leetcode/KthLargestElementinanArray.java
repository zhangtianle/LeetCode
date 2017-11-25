package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length < k) {
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    @Test
    public void test() {
        System.out.println(findKthLargest(new int[]{2,3,4,5}, 4));
    }
}
