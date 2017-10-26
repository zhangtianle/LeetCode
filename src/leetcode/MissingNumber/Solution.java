package leetcode.MissingNumber;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/4/25.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum =  sum + i;
        }
        int ssum = nums.length * (nums.length + 1) / 2;
        return ssum - sum;
    }

    @Test
    public void test() {
        System.out.println(missingNumber(new int[]{0,1,2,4}));
    }
}
