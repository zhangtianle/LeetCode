package SearchforaRange;

import org.junit.Test;

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
        int[] result = {-1, -1};
        int end = nums.length - 1;
        int mid;
        int start = 0;

        while (start < end) {
            mid =  start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (nums[start] != target) {
            return result;
        } else {
            result[0] = start;
        }

        end = nums.length - 1;
        while (start < end) {
            mid = start + (end - start) / 2 + 1;
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        result[1] = end;

        return result;
    }

    @Test
    public void test() {
        int[] ints = searchRange(new int[]{1, 3, 5, 6, 7, 7, 8, 8, 9, 10}, 3);
        System.out.println(ints[0] + " " + ints[1]);
    }
}
