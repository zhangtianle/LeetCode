package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle on 2017/4/12.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ints = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();

        // TODO
        return lists;
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


}
