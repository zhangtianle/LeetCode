package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets.
 * Note: The solution set must not contain duplicate subsets.
 * For example,
 * If nums = [1,2,3], a solution is:
 * [
 *  [3],
 *  [1],
 *  [2],
 *  [1,2,3],
 *  [1,3],
 *  [2,3],
 *  [1,2],
 *  []
 * ]
 *
 * Created by Tianle Zhang on 2016/9/27.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        dfs(nums, 0, list, result);

        return result;
    }

    private void dfs(int[] nums, int i, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));

        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            dfs(nums, j + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

    @Test
    public void tesst() {
        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        System.out.println(" ");
    }
}
