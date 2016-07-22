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
        // TODO
        int longest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int start = i;
            int end = i + 1;

            while (end < nums.length && nums[start] < nums[end]) {
                start++;
                end++;
            }
            int localLonget = end - start - 1;
            if (localLonget > longest) {
                longest = localLonget;
            }
        }
        return longest;
    }

    @Test
    public void test() {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
