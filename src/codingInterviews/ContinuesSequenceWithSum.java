package codingInterviews;

import org.junit.Test;

import java.util.ArrayList;

public class ContinuesSequenceWithSum {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (sum < 3) {
            return lists;
        }

        int small = 1;
        int big = 2;
        int middle = (1 + sum) / 2;
        int curSum = small + big;

        while (small < middle) {
            if (curSum == sum) {
                getList(lists, small, big);
            }
            while (small < middle && curSum > sum) {
                curSum -= small;
                small++;
                if (curSum == sum) {
                    getList(lists, small, big);
                }
            }
            big++;
            curSum += big;
        }

        return lists;
    }

    private void getList(ArrayList<ArrayList<Integer>> lists, int small, int big) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = small; i <= big; i++) {
            list.add(i);
        }
        lists.add(list);
    }

    @Test
    public void test() {
        FindContinuousSequence(15);
    }
}
