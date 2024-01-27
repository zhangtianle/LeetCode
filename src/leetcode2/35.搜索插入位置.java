/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = (l + r) / 2;
            if(nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m;
            } else {
                return m;
            }
        }
        return l;
    }
}
// @lc code=end

