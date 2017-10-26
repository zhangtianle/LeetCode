package leetcode.ContainerWithMostWater;

import org.junit.Test;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container.
 *
 * Created by Tianle Zhang on 2016/5/21.
 */
public class Solution {

    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int temp = 0;
            temp = Math.min(height[left], height[right]) * (right - left);
            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
            area = area > temp ? area : temp;
        }
        return area;
    }


    public int maxArea2(int[] height) {
        int area = 0;
        for (int i=0; i<height.length-1; i++) {
            for (int j=i; j<height.length; j++) {
                int min = 0;
                if (height[i] < height[j]) {
                    min = height[i];
                } else {
                  min = height[j];
                }
                int temp = (j - i) * min;
                if (temp > area) {
                    area = temp;
                }
            }
        }
        return area;
    }

    @Test
    public void test() {
        System.out.println(maxArea(new int[]{1,2,3}));
    }
}
