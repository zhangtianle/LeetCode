package MaximumSubarray;

import org.junit.Test;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * <p>
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * <p>
 * Created by Tianle Zhang on 2016/9/12.
 */
public class Solution {

    public int maxSubArray(int[] nums) {

        int numLength = nums.length;
        if (numLength == 0) {
            return 0;
        } else {
            int max = nums[0];

            for (int i = 0; i < numLength; i++) {
                int localMax = 0;
                for (int j = i; j < numLength; j++) {
                    localMax = localMax + nums[j];
                    if (localMax > max) {
                        max = localMax;
                    }

                }
            }

            return max;
        }
    }

    @Test
    public void test() {
        System.out.println(maxSubArray(new int[]{-1,23}));
    }
}
