package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]
 *
 *
 * Created by Tianle Zhang on 2016/12/5.
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int nSize = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nSize; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = - nums[val];
            }
        }

        for (int i = 0; i < nSize; i++) {
            if (nums[i] > 0) {
                list.add(i+1);
            }
        }
        return list;
    }

    @Test
    public void test() {
        List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println();
    }
}
