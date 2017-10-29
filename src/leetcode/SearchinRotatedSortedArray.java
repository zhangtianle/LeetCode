package leetcode;

/**
 * Created by Kyle on 2017/10/28.
 */
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
