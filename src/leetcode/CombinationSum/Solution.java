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
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO
        Arrays.sort(candidates);
        int size = candidates.length;

        List<List<Integer>> combinationSum = new ArrayList<>();


        for (int i = 0; i < candidates.length ; i++) {
            int candidate = candidates[i];
            int localSum = 0;
            while (localSum < target) {
                List<Integer> combinas = new ArrayList<>();
                localSum += candidate;
                combinas.add(candidate);
                if (localSum == target) {
                    combinationSum.add(combinas);
                } else if (localSum > target) {

                }
            }

            int remain = target - candidate;
        }

        return null;
    }

    @Test
    public void test() {
        int[] i = {1,3,4,2};
        Arrays.sort(i);

    }
}
