package codingInterviews;

import org.junit.Test;

import java.util.ArrayList;

public class TwoNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0) {
            return list;
        }

        int first = 0;
        int last = array.length - 1;

        while (first < last) {
            int tempSum = array[first] + array[last];
            if (tempSum == sum) {
                list.add(array[first]);
                list.add(array[last]);
                break;
            } else if (tempSum < sum){
                first++;
            } else {
                last--;
            }
        }
        return list;
    }

    @Test
    public void test() {
        FindNumbersWithSum(new int[]{1,2,4,7,11,15}, 15);
    }
}
