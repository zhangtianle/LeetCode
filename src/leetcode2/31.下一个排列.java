/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return ;
        }
        for (int i = nums.length-1; i >=1 ; i--) {
            int j = i - 1;
            int k = nums.length-1;
            if (nums[j] < nums[i]) {
                for(k = nums.length-1; k>= i; k--) {
                    if (nums[k]>nums[j]) {
                        swap(nums, k,j);
                        break;
                    }
                }
                Arrays.sort(nums, i, nums.length );
                return;
            } 
        }
        Arrays.sort(nums);

    }


    private void swap(int[] num, int k, int j) {
        int tmp = num[k];
        num[k] = num[j];
        num[j] = tmp;
    }
}
// @lc code=end

