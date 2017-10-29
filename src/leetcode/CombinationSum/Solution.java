package leetcode.CombinationSum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given a set of candidate numbers (C) and a target number (T),
 *  find all unique combinations in C where the candidate numbers sums to T.
 *
 * The same repeated number may be chosen from C unlimited number of times.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 *
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 *
 * [
 *  [7],
 *  [2, 2, 3]
 * ]
 *
 * Created by Tianle Zhang on 2016/9/3.
 */
public class Solution {

    List<List<Integer>> combinationSum = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> cur = new ArrayList<>();
        getCombination(cur, candidates, 0, target);
        return combinationSum;
    }

    private void getCombination(List<Integer> c, int[] candidates, int index, int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            List<Integer> cc = new ArrayList<>(c);
            combinationSum.add(cc);
            return;
        } else {
            for (int i = index; i < candidates.length; i++) {
                c.add(candidates[i]);
                getCombination(c, candidates, i, target - candidates[i]);
                c.remove(c.size() - 1);
            }
        }
    }

    @Test
    public void test() {
        combinationSum(new int[]{2,3,6,7}, 7);
        System.out.println();
    }
}
