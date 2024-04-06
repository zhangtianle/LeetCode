/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length-1;

        while (i<j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j-i));
            if (height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
    public int maxArea2(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j-i));
            }
        }
        return max;
    }
}
// @lc code=end

