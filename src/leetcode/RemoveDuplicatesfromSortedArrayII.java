package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/11/1.
 */
public class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                if (count < 2) {
                    nums[++index] = nums[i];
                    count++;
                }
            } else {
                nums[++index] = nums[i];
                count = 1;
            }
        }
        return index + 1;
    }

    @Test
    public void test() {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,4,4,4,5,6,7}));
    }
}
