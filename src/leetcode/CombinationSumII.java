package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kyle on 2017/10/29.
 */
public class CombinationSumII {
    List<List<Integer>> combinationSum = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                getCombination(c, candidates, i + 1, target - candidates[i]);
                c.remove(c.size() - 1);
                while (i < candidates.length - 1 && candidates[i] == candidates[i+1]) {
                    i++;
                }
            }
        }
    }

    @Test
    public void test() {
        combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println();
    }
}
