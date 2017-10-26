package leetcode.RemoveElement;

import org.junit.Test;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * Created by Tianle Zhang on 2016/4/25.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == val) {
                if (nums[end] == val) {
                    end--;
                } else {
                    nums[start] = nums[end];
                    start++;
                    end--;
                }
            } else {
                start++;
            }
        }
        return start;
    }

    @Test
    public void test() {
        System.out.println(removeElement(new int[]{1, 1, 3, 1, 4, 1}, 1));
    }
}
