package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kyle on 2017/4/12.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if (n == k || k == 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= k; i++) {
                list.add(i);
            }
            return new LinkedList<>(Arrays.asList(list));
        }

        List<List<Integer>> result = combine(n - 1, k - 1);
        result.forEach(e -> e.add(n));
        result.addAll(combine(n - 1, k));
        return result;
    }

    private void getCombine(List<Integer> list, int index, int n, int k) {
        if (index <= k) {
            list.add(index);
            index++;
            getCombine(list, index, n, k);
        }
    }

    private int getNum(boolean[] booleans, int k, List<Integer> ints) {
        int num = -2;
        int i = 0;
        while ((num = getNum(booleans, k, ints)) != -1 && i < k) {
            ints.add(num);
            i++;
        }

        for (int j = 0; j < booleans.length; j++) {
            if (booleans[j] == false) {
                booleans[j] = true;
                return j;
            }
        }

        return -1;
    }

    @Test
    public void test() {
        List<List<Integer>> l = combine(4, 2);
        System.out.println();

    }


}
