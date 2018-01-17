package codingInterviews;

import org.junit.Test;

public class MinMumberInRotatedArray {
    public int minNumberInRotateArray(int[] array) {
        int result;

        if (array == null || array.length == 0) {
            return 0;
        }

        int first = 0;
        int last = array.length - 1;
        int mid = 0;
        while (array[first] >= array[last]) {
            if (last - first == 1) {
                result = array[last];
                return result;
            }
            mid = (last + first) / 2;

            if (array[first] == array[mid] && array[mid] == array[last]) {
                result = array[first];
                for (int i = 0; i < array.length; i++) {
                    if (result > array[i]) {
                        result = array[i];
                    }
                }
                return result;
            }

            if (array[mid] >= array[last]) {
                first = mid;
            } else if (array[mid] <= array[first]){
                last = mid;
            }
        }
        result = array[mid];

        return result;
    }

    @Test
    public void test() {
        System.out.println(minNumberInRotateArray(new int[]{3, 4, 5, 1, 2}));
    }
}
