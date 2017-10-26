package leetcode.SearchInsertPosition;

import org.junit.Test;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 * Created by Tianle Zhang on 2016/9/2.
 *
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            // left
            if (nums[mid] > target) {
                end = mid - 1;
                // right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return start;
    }

    @Test
    public void test() {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
    }
}
