/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        
        int i = 0;
        int j = 0;
        while (i<nums.length) {
            if(numSet.add(nums[i])) {
                nums[j] = nums[i];
                i++;
                j++;
            } else {
                i++;
            }
        }

        return numSet.size();
    }
}
// @lc code=end

