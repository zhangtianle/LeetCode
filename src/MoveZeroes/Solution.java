package MoveZeroes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * Created by Tianle Zhang on 2016/5/24.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> is = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                is.add(nums[i]);
            }
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( k < is.size() ) {
                nums[i] = is.get(k);
                k++;
            } else {
                nums[i] = 0;
            }
        }

    }


    @Test
    public void test() {
        int[] num = new int[]{0,2,0,3,1};
        moveZeroes(num);
    }
}
