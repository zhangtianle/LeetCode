package SearchforaRange;

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * Created by Tianle Zhang on 2016/6/27.
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        // TODO
        int[] result = new int[2];
        int end = nums.length;
        int mid = end / 2;
        int start = 0;

        if (target < nums[mid]) {
            mid = ( start + mid ) / 2;
            start = mid;
        }

        return result;
    }
}
