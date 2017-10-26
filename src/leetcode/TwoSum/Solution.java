package leetcode.TwoSum;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * Created by Tianle Zhang on 2016/4/22.
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i<nums.length-1; i++) {
            int n = target - nums[i];
            for (int j=i+1; j<nums.length; j++) {
                if (n==nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            m.put(nums[i] ,i);
        }
        for (int i=0; i<nums.length; i++ ) {
            int d = target - nums[i];
            if ( m.containsKey(d) && m.get(d) != i) {
                return new int[] {i, m.get(d)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    @Test
    public void test() {
        int[] nums = {2,7,11,15};
        int tatget = 4;
        System.out.println(twoSum2(nums,tatget)[0]);
        System.out.print(twoSum2(nums,tatget)[1]);
    }
}