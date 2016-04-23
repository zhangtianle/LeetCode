package RemoveDuplicatesfromSortedArray;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/4/23.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res++] = nums[i];
            }
        }
        return res;
    }

    @Test
    public void test() {
        removeDuplicates(new int[] {1,2,2,3,5});
    }
}
