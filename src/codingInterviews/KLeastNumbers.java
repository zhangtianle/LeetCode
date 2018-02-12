package codingInterviews;


import org.junit.Test;

import java.util.ArrayList;

public class KLeastNumbers {
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
        GetLeastNumbers_Solution(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4);
    }
}
