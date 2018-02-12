package codingInterviews;


import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

public class KLeastNumbers {

    /**
     * 基于最大堆的实现
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input == null || k > input.length || k <= 0) {
            return arrayList;
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            int curr = input[i];
            if (treeSet.size() < k) {
                treeSet.add(curr);
            } else {
                int height = treeSet.last();
                if (height > curr) {
                    treeSet.pollLast();
                    treeSet.add(curr);
                }
            }
        }

        arrayList.addAll(treeSet);
        return arrayList;
    }


    /**
     * o(n) 解法，采用快排中的partition思想
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        QuickSort quickSort = new QuickSort();
        if (input == null || k > input.length || k <= 0) {
            return arrayList;
        }

        int start = 0;
        int end = input.length - 1;
        int index = quickSort.partition(input, start, end);

        while (index != k - 1) {

            if (index > k - 1) {
                end = index - 1;
                index = quickSort.partition(input, start, end);
            } else {
                start = index + 1;
                index = quickSort.partition(input, start, end);
            }
        }

        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }

    @Test
    public void test() {
        GetLeastNumbers_Solution2(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4);
    }
}
