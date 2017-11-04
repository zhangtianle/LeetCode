package leetcode;

/**
 * Created by Kyle on 2017/11/4.
 */
public class FindMinimuminRotatedSortedArray {

    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];
        }
        return min;
    }
}
