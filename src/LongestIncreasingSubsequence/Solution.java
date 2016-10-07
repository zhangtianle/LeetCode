package LongestIncreasingSubsequence;

import org.junit.Test;

/**
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.
 * <p>
 * Your algorithm should run in O(n2) complexity.
 * <p>
 * Follow up: Could you improve it to O(n log n) time complexity?
 * <p>
 * Created by Tianle Zhang on 2016/7/8.
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] d = new int[nums.length];
        int len = 1;
        for (int i = 0; i < nums.length; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && d[j] + 1 > d[i])
                    d[i] = d[j] + 1;
                if (d[i] > len)
                    len = d[i];
            }
        }
        return len;
    }


    @Test
    public void test() {
//        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(lengthOfLIS(new int[]{2,2}));
    }
}
